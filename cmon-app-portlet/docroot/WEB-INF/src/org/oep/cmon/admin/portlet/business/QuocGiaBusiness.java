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

package org.oep.cmon.admin.portlet.business;

import java.util.List;

import org.oep.cmon.admin.portlet.action.QuocGiaAction;

import org.oep.cmon.dao.qlhc.model.QuocGia;

/** 
 * This is class QuocGiaBusiness
 * 
 * This class contains logics related to QuocGia table
 * 
 * 
 * Version: 1.0
 *  
 * History: 
 *   DATE        AUTHOR      DESCRIPTION 
 *  ------------------------------------------------- 
 *  21-March-2013  Nam Dinh    Create new
 */
public class QuocGiaBusiness {

	public static final String VIEW_QUOC_GIA = "viewQuocGia";

	/** 
	 * This is function check data return
	 * 
	 * Version: 1.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-March-2013  Nam Dinh    Create new
	 * @param quocGia
	 * @param dataInput
	 * @param type , type in (1: ten, 2: ma) 
	 * @return
	 */
	public static String checkDataReturn(QuocGia quocGia, String dataInput, int type) {
		if (dataInput != null && dataInput.length() > 0) {
			return dataInput.trim();
		} else if (quocGia != null) {
			if (type == 2) {
				return quocGia.getMa();
			} else {
				return quocGia.getTen();
			}
		}

		return "";
	}

	public static List<QuocGia> findByTenQuocGia(String keyWord) {
		QuocGiaAction action = new QuocGiaAction();
		return action.findByTenQuocGia(keyWord);
	}
	
	/** 
	 * This is function check read only
	 * 
	 * Version: 1.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-March-2013  Nam Dinh    Create new
	 * @param dataInput
	 * @return String
	 */
	public static String checkReadOnly(String dataInput) {
		if (dataInput != null && dataInput.compareTo(VIEW_QUOC_GIA) == 0) {
			return "readonly=\"readonly\"";
		}

		return "";
	}
}
