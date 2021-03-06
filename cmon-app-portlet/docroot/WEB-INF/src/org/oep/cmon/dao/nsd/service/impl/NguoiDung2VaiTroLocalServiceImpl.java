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


package org.oep.cmon.dao.nsd.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.oep.cmon.dao.nsd.service.base.NguoiDung2VaiTroLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.cmon.dao.nsd.model.NguoiDung2VaiTro;

/**
 * The implementation of the nguoi dung2 vai tro local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.cmon.dao.nsd.service.NguoiDung2VaiTroLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Liemnn
 * @see org.oep.cmon.dao.nsd.service.base.NguoiDung2VaiTroLocalServiceBaseImpl
 * @see org.oep.cmon.dao.nsd.service.NguoiDung2VaiTroLocalServiceUtil
 */
/**
*
* ChucVuLocalServiceImpl class
*   
* This class is used to get ChucVu information 
* from database
* 
* 
* History:
*  
*   DATE         AUTHOR      DESCRIPTION 
*  --------------------------------------------------------
*  10-Aug-2012   NamDH       Create new
*  15-Sept-2012  LanDD       Add code to generate secret confirmation code
*
*/
public class NguoiDung2VaiTroLocalServiceImpl
	extends NguoiDung2VaiTroLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.cmon.dao.nsd.service.NguoiDung2VaiTroLocalServiceUtil} to access the nguoi dung2 vai tro local service.
	 */
	/**
	  * This is fucntion findByVaiTroID 
	  * Version: 1.0
	  *  
	  * History: 
	  *   DATE        AUTHOR      DESCRIPTION 
	  *  ------------------------------------------------- 
	  *  3-March-2013  Nam Dinh    Create new
	  * @param long vaiTroId, int daXoa
	  * @return List<NguoiDung2VaiTro>
	  */
	public List<NguoiDung2VaiTro> findByVaiTroID(long vaiTroId, int daXoa) {
		try {
			return nguoiDung2VaiTroPersistence.findByVaiTroID(vaiTroId, daXoa);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<NguoiDung2VaiTro>();
	}
	
	/**
	  * This is fucntion findByVaiTroIDAndTaiKhoanNguoiDungId
	  * Version: 1.0
	  *  
	  * History: 
	  *   DATE        AUTHOR      DESCRIPTION 
	  *  ------------------------------------------------- 
	  *  3-March-2013  Nam Dinh    Create new
	  * @param long vaiTroId, long taiKhoanNguoiDungId, int daXoa
	  * @return NguoiDung2VaiTro
	  */
	public NguoiDung2VaiTro findByVaiTroIDAndTaiKhoanNguoiDungId(long vaiTroId, long taiKhoanNguoiDungId, int daXoa) {
		try {
			return nguoiDung2VaiTroPersistence.findByVaiTroIDAndTaiKhoanNguoiDungId(vaiTroId, taiKhoanNguoiDungId, daXoa);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	  * This is fucntion findByTaiKhoanNguoiDungID
	  * Version: 1.0
	  *  
	  * History: 
	  *   DATE        AUTHOR      DESCRIPTION 
	  *  ------------------------------------------------- 
	  *  3-March-2013  Nam Dinh    Create new
	  * @param long taiKhoanNguoiDungId, int daXoa
	  * @return List<NguoiDung2VaiTro>
	  */
	public List<NguoiDung2VaiTro> findByTaiKhoanNguoiDungID(long taiKhoanNguoiDungId, int daXoa) {
		try {
			return nguoiDung2VaiTroPersistence.findByTaiKhoanNguoiDungId(taiKhoanNguoiDungId, daXoa);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<NguoiDung2VaiTro>();
	}
}