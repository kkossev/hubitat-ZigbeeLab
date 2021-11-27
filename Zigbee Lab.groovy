/**
 *  Zigbee Lab HE driver
 *
 *  This is a HE driver to consolidate all my experimental Zigbee protocol bits and pieces from my production drivers into a single test driver code.
 *
 *	Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *	in compliance with the License. You may obtain a copy of the License at:
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *	on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *	for the specific language governing permissions and limitations under the License.
 * 
 * 
 * ver. 1.0.0 2021-10-24 kkossev  - first dummy version
 *
*/
public static String version()	  { return "v1.0.0" }


import hubitat.device.HubAction
import hubitat.device.Protocol
import groovy.transform.Field
import hubitat.helper.HexUtils
import hubitat.device.HubMultiAction
import hubitat.zigbee.zcl.DataType
import hubitat.zigbee.clusters.iaszone.ZoneStatus



metadata {
    definition (name: "Zigbee Lab", namespace: "kkossev", author: "Krassimir Kossev", importUrl: "https://raw.githubusercontent.com/kkossev/hubitat-Zigbee%Lab/main/Zigbee%20Lab/Zigbee%20Lab.groovy" ) {
      
    capability "Refresh"
    capability "Initialize"
    capability "Configuration"

    command "test"

      
 	fingerprint inClusters: "0000,0001,0003,0004,0006,1000", outClusters: "0019,000A,0003,0004,0005,0006,0008,1000", manufacturer: "_ANY", model: "ANY", deviceJoinName: "Hubitat Zigbee Lab"
    }
    preferences {
        input (name: "traceEnable", type: "bool", title: "Enable trace logging", defaultValue: true)
        input (name: "logEnable", type: "bool", title: "Enable debug logging", defaultValue: true)
        input (name: "txtEnable", type: "bool", title: "Enable description text logging", defaultValue: true)
    }
}
