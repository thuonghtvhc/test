
<%@ include file="/commons/taglibs.jsp"   %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<title><fmt:message key="Báo cáo tổng hợp số lượng cảnh báo mạng metro theo loại thiết bị"/></title>
<content tag="heading"><fmt:message key="Báo cáo tổng hợp số lượng cảnh báo mạng metro theo loại thiết bị"/></content>
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
   				 	<fmt:message key="Loại thiết bị"/>&nbsp;
   					<input type="text" id="idSearch" name="idSearch" value="${startID}" style="width: 8%" maxlength="20"/>
   					<input class="button" type="submit"  name="filter" value="<fmt:message key="global.form.timkiem"/>" />		
			</form:form>
			</td>
</tr>

<br>
<table>
  <tr>
    <th>STT</th>
    <th>Loai thiết bị</th>
    <th>Số lượng thiết bị</th>
    <th>Số cảnh báo mất điện</th>
    <th>Số cảnh báo kém chất lượng</th>
    <th>Số cảnh báo đứt cáp</th>
    <th>Số cảnh báo downprot</th>
  </tr>
  
  <tr>
    <td>1</td>
    <td>Type_1</td>
    <td>134</td>
    <td>149</td>
    <td>568</td>
    <td>789</td>
     <td>324</td>
  </tr>
  
  <tr>
    <td>2</td>
    <td>Type_2</td>
    <td>657</td>
    <td>23</td>
    <td>567</td>
    <td>234</td>
     <td>23</td>
  </tr>
  
  <tr>
    <td>3</td>
    <td>Type_3</td>
    <td>764</td>
    <td>234</td>
    <td>456</td>
    <td>765</td>
     <td>345</td>
  </tr>
  
  <tr>
    <td>4</td>
    <td>Type_4</td>
    <td>6</td>
    <td>65</td>
    <td>743</td>
    <td>543</td>
     <td>235</td>
  </tr>
  
  <tr>
    <td>5</td>
    <td>Type_5</td>
    <td>435</td>
    <td>7443</td>
    <td>978</td>
    <td>234</td>
     <td>546</td>
  </tr>
  
  <tr>
    <td>6</td>
    <td>Type_6</td>
    <td>435</td>
    <td>98</td>
    <td>345</td>
    <td>543</td>
     <td>657</td>
  </tr>
  
</table>
<span>6 item</span>

