/*
 * Copyright (c) 2014 by Open eGovPlatform (http://http://openegovplatform.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.oep.cmon.admin.portlet.util;
/** 
 * This is class LiferayUserGroupUtils
 * 
 * Version: 1.0
 *  
 * History: 
 *   DATE        AUTHOR      DESCRIPTION 
 *  ------------------------------------------------- 
 *  1-April-2013  Nam Dinh    Create new
 */
public class LiferayUserGroupUtils {
	
	/**
	 * This is function get UserGroupName
	 * Version: 1.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  3-March-2013  Nam Dinh    Create new
	 * @param tenCoQuan
	 * @param chucVu
	 * @return String
	 */
	public static String getUserGroupName(String tenCoQuan,String chucVu){
		try{
			String ten = tenCoQuan+"_"+chucVu;
			
			ten =ten.replace("?", "");
			
			ten =ten.replace(",", "");
			return ten;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}

}
