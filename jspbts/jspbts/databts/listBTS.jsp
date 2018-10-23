
<%@ include file="/commons/taglibs.jsp"   %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<title><fmt:message key="title.tab.vhc.bts"/></title>
<content tag="heading"><fmt:message key="title.tab.vhc.bts"/></content>


  


		<tr>
			<td ><form:form id="filterController" commandName="filters" method="post" action="list.htm">
					<fmt:message key="Ten BTS"/>&nbsp;
					<input type="text" id="idSearch" name="idSearch" value="" style="width: 8%" maxlength="20"/>					
   					
   					<fmt:message key="Loai BTS" />&nbsp;
					<input type="text" id="idSearch" name="idSearch" value="" style="width: 8%" maxlength="20"/>					
   					
   					<fmt:message key="Loại truyền dẫn"/>&nbsp;
					<input type="text" id="idSearch" name="idSearch" value="" style="width: 8%" maxlength="20"/>					
   					
   					<input class="button" type="submit"  name="filter" value="<fmt:message key="global.form.timkiem"/>" />		
			</form:form>
			</td>
		</tr>


<br>

<tr>
			
			<td >
				<div style="text-align: right;"><a style="text-align: right;" href="form.htm"><fmt:message key="global.form.themmoi"/></a>&nbsp;</div>
			</td> 

</tr>
<tr>

				<div style="width:100%;overflow:auto;"  class="tableStandar">
					<display:table name="${btsData}"   id="item" requestURI="" pagesize="50" sort="external" export="true">
						<display:column class="centerColumnMana" titleKey="global.list.No"> <c:out value="${item_rowNum}"/> </display:column>
						
						<display:column class="rightColumnMana" property="name" titleKey="name.bts "/>
						<display:column class="rightColumnMana" property="typeBts" titleKey="type.bts"/>
						<display:column class="rightColumnMana" property="typeTransmission" titleKey="type.transmission"/>
						<display:column class="rightColumnMana" property="portNumber" titleKey="port.number.bts"/>
							<display:column titleKey="global.management" media="html" class="centerColumnMana">
						<a href="form.htm?id=${item.id}"><fmt:message key="global.form.sua"/></a>&nbsp;
		    				<%-- <a href="delete.html?id=${item.id}"
									onclick="return confirm('<fmt:message key="messsage.confirm.delete"/>')"><fmt:message key="global.form.xoa"/></a>&nbsp; --%>
							<a href="#" onclick="javascript:DeleteNewsPost(${item.id});return false;"><fmt:message key="global.form.xoa"/></a>
		    			</display:column>
		    			
					
					
						<display:setProperty name="export.csv.include_header" value="true" />
						<display:setProperty name="export.excel.include_header" value="true" />
						<display:setProperty name="export.xml.include_header" value="true" />
						<display:setProperty name="export.xml.filename" value="${exportFileName}.xml" />
						<display:setProperty name="export.csv.filename" value="${exportFileName}.csv" />
						<display:setProperty name="export.excel.filename" value="${exportFileName}.xls" /> 
							
					</display:table>
				</div>
				
				</tr>
		
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/calendar.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/calendar_en.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/calendar_setup.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/calendar-blue.css" />

<script type="text/javascript">


</script>

<script type="text/javascript">
	function DeleteNewsPost(id) {
		
		r = confirm('Ban muon xoa?');
	
		if (r) {
			$.getJSON("delete.htm", {id: id}, function(data){
				if (data.status == 'success') {
					alert("xoa thanh cong");
					location.reload();
					//$("#filters").submit();
	   			} else {
	   	   			alert(data.cause);
	   	   		}
			});
		}
	}
	
	function focusIt()
	{
		var mytext = document.getElementById("menuName");
		mytext.focus();

		//loadMenuCha();
	}

	function loadMenuCha() {
		$.ajax({
			  url: "/admin/menu-management/ajax/loadMenuCha.html",
			  beforeSend: function( ) {
				  $('#load').remove();
					$('.body-content').append('<span id="load">LOADING...</span>');
					$('#load').fadeIn('normal', loadContent);
		
					function loadContent() {
						$('#result').load('', '', showNewContent());
					}
					
					function showNewContent() {
						$('#result').show('normal', hideLoader());
					}
					
					function hideLoader() {
						$('#load').fadeOut('normal');
					}
			  },
			  data:{
				  maPhong: $('#selectMaPhong').val()
				}
			})
			.done(function( j ) {
				  var options = '';
				  options += '<option value="">--Tất cả--</option>';
				  for (var i = 0; i < j.length; i++) {
						options += '<option value="' + j[i].idMenuCha + '">' + j[i].maPhong + ' - ' + j[i].menuCha+ '</option>';
					}
				$("#idMenuCha").html(options);
				$('#idMenuCha option:first').attr('selected', 'selected');
			    
			  });
	}
	
	onload = focusIt;
</script>
