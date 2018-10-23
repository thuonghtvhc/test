
<%@ include file="/commons/taglibs.jsp"   %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<title><fmt:message key="Báo cáo tổng hợp số lượng cảnh báo mạng metro theo tên đối tác"/></title>
<content tag="heading"><fmt:message key="Báo cáo tổng hợp số lượng cảnh báo mạng metro theo tên đối tác"/></content>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
background-color: #f0f0f5;
}
</style>

<tr></tr>

<tr style="pading-top:50px">
			<td ><form:form id="filterController" commandName="filters" method="post" action="list.htm" style="padding-top: 30px;">			
   				 	<fmt:message key="Tên đối tác"/>&nbsp;
   				 	<input type="text" id="idSearch" name="idSearch" value="${startID}" style="width: 8%" maxlength="20"/>
   				 	<fmt:message key="Tên tuyến"/>&nbsp;
   					<input type="text" id="idSearch" name="idSearch" value="${startID}" style="width: 8%" maxlength="20"/>
   					<input class="button" type="submit"  name="filter" value="<fmt:message key="global.form.timkiem"/>" />		
			</form:form>
			</td>
</tr>

<br>
<table>
  <tr>
    <th>STT</th>
    <th>Tên đối tác</th>
    <th>Tên tuyến</th>
    <th>Số lượng đứt cáp</th>
    <th>Số tuyến downport</th>
    
  </tr>
  
  <tr>
    <td>1</td>
    <td>Name_1</td>
    <td>Tuyến_1</td>
    <td>149</td>
    <td>568</td>
    
  </tr>
  
  <tr>
     <td>2</td>
    <td>Name_1</td>
    <td>Tuyến_1</td>
    <td>149</td>
    <td>568</td>
  </tr>
  
  <tr>
    <td>3</td>
    <td>Name_1</td>
    <td>Tuyến_1</td>
    <td>149</td>
    <td>568</td>
  </tr>
  
  <tr>
     <td>4</td>
    <td>Name_1</td>
    <td>Tuyến_1</td>
    <td>149</td>
    <td>568</td>
  </tr>
  
  <tr>
     <td>5</td>
    <td>Name_1</td>
    <td>Tuyến_1</td>
    <td>149</td>
    <td>568</td>
  </tr>
  
  <tr>
     <td>6</td>
    <td>Name_1</td>
    <td>Tuyến_1</td>
    <td>149</td>
    <td>568</td>
  </tr>
  
</table>
<span>6 item</span>

