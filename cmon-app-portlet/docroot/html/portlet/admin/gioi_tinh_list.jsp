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
<%@page import="org.oep.cmon.dao.cd.model.GioiTinh"%>
<%@page import="org.oep.cmon.admin.portlet.business.GioiTinhBusiness"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/html/portlet/admin/init.jsp" %>

<body>
<%
	 PortletURL addNewUrl = renderResponse.createRenderURL();
	 addNewUrl.setParameter("ActionType", "addQuocGia");
	 addNewUrl.setParameter("jspPage", "/html/portlet/admin/gioi_tinh_add.jsp");
	 
	 PortletURL iteratorUrl = renderResponse.createRenderURL();
	 iteratorUrl.setParameter("jspPage", "/html/portlet/admin/gioi_tinh_list.jsp");
	 
	 SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 10, iteratorUrl, null, "");
	
	 // Get the search result from session if it exists
	 List<GioiTinh>  result = new ArrayList<GioiTinh>(); 
	 
	 result = GioiTinhBusiness.findAll();
	 
	 if ( result == null ) {
		 result = new ArrayList<GioiTinh>();
	 }
	 
	 // Paging
	 List<GioiTinh> newResults = ListUtil.subList(result, searchContainer.getStart(), searchContainer.getEnd());
	 
	 searchContainer.setTotal(result.size());
	 searchContainer.setResults(newResults);
	%>
	<div class="wd-main-content" align="center">
		<br/>
		<form name = "searchForm" method = "post">
			<table width="100%" border="0">
			  <tr>
			    <td align = "left">		    
			    </td>
			    <td align = "right">
			    	<input type="button" name="button" value="+ THÊM MỚI"  class="egov-button-normal" onclick="javascript: window.location = '<%=addNewUrl.toString() %>'"/>
			    </td>
			  </tr>
			  <tr>
			    <td>
			    	<liferay-ui:error key="errorDeleteGioiTinh" message = "vn.dtt.cmon.admin.gioitinh.error.delete"/>
			    	<%
				if (request.getAttribute("delete_success") != null && request.getAttribute("delete_success").toString().trim().length() > 0) {
					%>
					<font color="blue">
						<liferay-ui:message key="vn.dtt.cmon.admin.gioitinh.completed.delete"/>
					</font>					
					<%
				}
				%>
			    </td>
			 </tr>
			</table>
		</form>
		<table cellpadding="0" cellspacing="0"  class="egov-table" width="100%">
		<tr>
		    <th align = "center">Mã giới tính</th>
		    <th scope="col">Tên giới tính</th>
		    <th scope="col">Hành động</th>
		</tr>
	<%
		for(GioiTinh quocGia : newResults) {											
			
			PortletURL viewRequestUrl = renderResponse.createRenderURL();
			viewRequestUrl.setParameter("ActionType", GioiTinhBusiness.VIEW_GIOI_TINH);
			viewRequestUrl.setParameter("jspPage", "/html/portlet/admin/gioi_tinh_add.jsp");
			viewRequestUrl.setParameter("gioiTinhId", String.valueOf(quocGia.getId()));
			
			PortletURL editRequestUrl = renderResponse.createRenderURL();
			editRequestUrl.setParameter("ActionType", "editGioiTinh");		
			editRequestUrl.setParameter("jspPage", "/html/portlet/admin/gioi_tinh_add.jsp");
			editRequestUrl.setParameter("gioiTinhId", String.valueOf(quocGia.getId()));
			
			PortletURL deleteUrl = renderResponse.createActionURL();
			deleteUrl.setParameter(ActionRequest.ACTION_NAME, "deleteGioiTinhRequest");
			deleteUrl.setParameter("jspPage", "/html/portlet/admin/gioi_tinh_list.jsp");
			deleteUrl.setParameter("gioiTinhId", String.valueOf(quocGia.getId()));
			
	%>
		<tr>
			<td><%=quocGia.getMa() %></td>
			<td class="bold" align="left"><a href="<%=viewRequestUrl.toString()%>"><%=quocGia.getTen() %></a></td>
			<td>
				<a href="<%=editRequestUrl.toString() %>">Sửa</a>|
				<a href="javascript: deleteRow('<%=deleteUrl.toString()%>')">Xóa</a>
			</td>
		</tr>
	<%} %>
		</table>
		<div id = "pagination">
			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		</div>
	</div>
</body>
<script type = "text/javascript">
function deleteRow(url) {
	var answer = confirm('<%=LanguageUtil.get(pageContext, "vn.dtt.cmon.admin.confirm.delete.gioitinh") %>');
	if (answer){
		window.location = url;
	}
}
</script>