
<%@ include file="/commons/taglibs.jsp"   %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<tr>

<c:choose>
  <c:when test="${addData=='N'}">
     <title><fmt:message key="Thêm mới BTS"/></title>
<content tag="heading"><fmt:message key="Thêm mới BTS"/></content>


  </c:when>
  <c:when test="${addData == 'Y'}">
   <title><fmt:message key="Sửa thông tin BTS"/></title>
<content tag="heading"><fmt:message key="Sửa thông tin BTS"/></content>

  </c:when>
  <c:otherwise>
      
  </c:otherwise>
</c:choose>      


</tr>  



<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100px;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

.thuonght {
    width: 70px;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}


#thuonghtdiv {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
</style>




<c:choose>
<c:when test="${addData == 'N'}">
<div id="thuonghtdiv">

  <form action="add.htm">
    <label for="fname">Tên BTS</label>
    <input type="text" id="fname" name="bts_name" placeholder="BTS NAME..">

    <label for="lname">Loại BTS</label>
    <input type="text" id="lname" name="bts_type" placeholder="BTS TYPE..">

	<label for="lname">Ký hiệu</label>
    <input type="text" id="kyhieu" name="bts_sysbol" placeholder="BTS sysbol..">

	<label for="lname">Loại truyền dẫn</label>
    <input type="text" id="loaitruyendan" name="bts_transmission" placeholder="TYPE_TRANSMISSION..">

	<label for="lname">Số port tương ứng với loại truyền dẫn</label>
    <input type="text" id="soprottuongung" name="bts_port_number" placeholder="PORT_NUMBER..">

	<label for="country">List</label>
    <select id="list" name="list">
	      <c:forEach var="items" items="${List}">
					<option value="${items }">${items }</option>	            
		 </c:forEach>  
    </select>
	
	
	
    <label for="country">Country</label>
    <select id="country" name="country">
      <option value="australia">Australia</option>
      <option value="canada">Canada</option>
      <option value="usa">USA</option>
    </select>
    
 <table> 
  <tr>
    <td>
    <input class="thuonght" type="submit" value="   Lưu   "  style="width:110px;">
    </td>
    <td>
    <input  class="thuonght"  value="<fmt:message key="Không lưu"/>" onClick='window.location="list.htm"'>
   </td>
   <td></td>
   </tr>
   </table>
  </form>
</div>

   </c:when>
  <c:otherwise>
     <div id="thuonghtdiv">
  	<form action="edit.htm">
  	
  	 <label for="fname">ID BTS</label>
    <input type="hidden" id="fname1" name="id"  value="${ID}">
  	
    <label for="fname">Tên BTS</label>
    <input type="text" id="fname2" name="bts_name" value="${NAME}">

    <label for="lname">Loại BTS</label>
    <input type="text" id="lname3" name="bts_type" value="${TYPE_BTS}">

	<label for="lname">Ký hiệu</label>
    <input type="text" id="kyhieu" name="bts_sysbol" value="${SYMBOL}">

	<label for="lname">Loại truyền dẫn</label>
    <input type="text" id="loaitruyendan" name="bts_transmission" value="${TYPE_TRANSMISSION}">

	<label for="lname">Số port tương ứng với loại truyền dẫn</label>
    <input type="text" id="soprottuongung" name="bts_port_number" value="${PORT_NUMBER }">

	<label for="country">List</label>
    <select id="list" name="list">
	      <c:forEach var="items" items="${List}">
					<option value="${items }">${items }</option>	            
		 </c:forEach>
      
    </select>
	
    <label for="country">Country</label>
    <select id="country" name="country">
      <option value="australia">Australia</option>
      <option value="canada">Canada</option>
      <option value="usa">USA</option>
    </select>
    
 <table> 
  <tr>
    <td>
    <input class="thuonght" type="submit" value="   Lưu   "  style="width:110px;">
    </td>
    <td>
    <input  class="thuonght"  value="<fmt:message key="Không lưu"/>" onClick='window.location="list.htm"'>
   </td>
   <td></td>
   </tr>
   </table>
  </form>
</div>


  </c:otherwise>
</c:choose>      


