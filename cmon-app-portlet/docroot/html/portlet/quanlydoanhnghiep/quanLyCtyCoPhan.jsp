<!-- 
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
  -->
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@ include file="/html/portlet/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
			<tr class="menhGiaCoPhan">
				<td colspan="3" style="width: 45% !important">
					<label class="egov-label-bold" >Vốn điều lệ </label><label class="egov-label-red">(*)</label><br/>
					<input type="text" class="egov-inputfield"/>
				</td>
				<td colspan="3" style="width: 45% !important">
					<label class="egov-label-bold" >Mệnh giá cổ phần </label><label class="egov-label-red">(*)</label><br/>
					<input type="text" class="egov-inputfield"/>
				</td>
			</tr>
			<tr class="menhGiaCoPhan">
				<td colspan="3" style="width: 45% !important">
					<label class="egov-label-bold" >Số cổ phần và giá trị cổ phần </label><label class="egov-label-red">(*)</label><br/>
					<input type="text" class="egov-inputfield"/>
				</td>
				<td colspan="3" style="width: 45% !important">
					<label class="egov-label-bold" >Số cổ phần được quyền chào bán</label><label class="egov-label-red">(*)</label><br/>
					<input type="text" class="egov-inputfield"/>
				</td>
			</tr>
			<tr class="dSCoDongSangLap">
				<td colspan="6">
					<table id="danhSachCoDongSangLap" class="taglib-search-iterator egov-table cssTable">
						<thead>							
							<tr>
								<td colspan="10">
									<label class="egov-label-bold" >Danh sách cổ đông đồng sáng lập </label><label class="egov-label-red">(*)</label>
								</td>
							</tr>
							<tr> 
								<td colspan="10" style="text-align: right;">
									<input type="button" id="addMem" class="egov-button" value="Thêm cổ đông"/>
									
								</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th width="5%;">STT</th>
								<th width="20%;">Tên cổ đông </th>
								<th width="20%;">CMND/Giấy phép</th>
								<th width="20%;">Địa chỉ </th>
								<th width="">Loại cp </th>
								<th width="">Số cp </th>
								<th width="">Giá trị cp </th>								
								<th width="5%;">Tỷ lệ (%)</th>
								<th width="7%;">Ghi chú</th>
								<th width="3%;">Hành động</th>
							</tr>
		
							 <tr>
								<td colspan="8" data="none" id="row_0" style="padding-right: 3px;padding-left: 3px;">Chưa có cá nhân góp vốn</td>                    
							</tr>
		
						</tbody>
					</table>
				</td>
			</tr>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			