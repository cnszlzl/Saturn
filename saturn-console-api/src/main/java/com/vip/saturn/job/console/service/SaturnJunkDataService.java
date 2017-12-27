/**
 * Copyright 2016 vip.com. <p> Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License. </p>
 */
package com.vip.saturn.job.console.service;

import com.vip.saturn.job.console.domain.SaturnJunkData;
import com.vip.saturn.job.console.exception.SaturnJobConsoleException;
import java.util.List;

/**
 * @author yangjuanying
 */
public interface SaturnJunkDataService {

	List<SaturnJunkData> getJunkData(String zkClusterKey) throws SaturnJobConsoleException;

	void removeSaturnJunkData(SaturnJunkData saturnJunkData) throws SaturnJobConsoleException;

	void deleteRunningNode(String namespace, String jobName, Integer item) throws SaturnJobConsoleException;

}
