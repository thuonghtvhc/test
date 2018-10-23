<%@ include file="/includes/taglibs.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxwindow.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxdropdownbutton.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxtree.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxrating.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/editortext/ckeditor.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/editortext/sample.js"></script>
		    
<title>DASHBOARD ALARM</title>
<content tag="heading">DASHBOARD ALARM</content>

<div>
	<form:form commandName="filter" method="post" action="list.htm">
		<table width="100%" border="0" cellspacing="3" cellpadding="0">
			<tr> 
				<td style="width:100px;"><fmt:message key="alWorkCalendar.deptCode"/></td>
				<td style="width:250px;">
					<div id='maPhong'></div>
           		</td>
           		<c:if test="${type=='filter'}">
           			<td style="width:40px;">
						<fmt:message key="catruc.ngayTK"/>
					</td>
					<td style="width:150px;">
						<input type="text" value="${ngayTruc}" name="ngayTruc" id="ngayTruc" size="10" maxlength="10">
						<img alt="calendar" title="Click to choose the start date" id="choosengayTKTo" style="cursor: pointer;" src="${pageContext.request.contextPath}/images/calendar.png"/>	
					</td>
					<td style="width:50px;padding-left: 10px;">
						<fmt:message key="catruc.caTK"/>
					</td>
					<td style="width:100px;">
						<select name="caTruc" id="caTruc" style="width: 80px;height:20px; padding-top: 4px;">
							<c:forEach var="item" items="${caList}">
								<c:choose>
					                <c:when test="${item.value == caTruc}">
					                    <option value="${item.value}" selected="selected">${item.value}</option>
					                </c:when>
									<c:otherwise>
										<option value="${item.value}">${item.value}</option>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</select> 
					</td>
           		</c:if>
				<td><input class="button" id="btSearch" type="submit" name="filter"	value="<fmt:message key="global.form.timkiem"/>" /></td>
			</tr>			
		</table>
	</form:form>
</div>
<div class="clear"></div>
<div id='jqxWidget1' style="margin-top:5px;">
	<div style="float: right;margin-bottom:3px;width:100%;">
	    <table border="0" cellspacing="1" cellpadding="0" width="100%">
	    	<tr>
	    		<td align="center"><b>SLA XỬ LÝ CẢNH BÁO</b></td>
	    	</tr>
			<tr>
				<td style="width:33px" align="right"><div style="float: right;" id="jqxlistboxDB_CANH_BAO"></div></td>
			</tr>
		</table>
	 </div><br>
	 
	 <div id="gridDB_CANH_BAO"></div>
	 <div id='menujqxDB_CANH_BAO'>
	     <ul>
	   		<li><fmt:message key="global.button.exportExcel"/></li>
	     </ul>
	 </div>
</div>

<div id='jqxWidget7' style="margin-top:5px;">
	<div style="float: right;margin-bottom:3px;width:100%;">
	    <table border="0" cellspacing="1" cellpadding="0" width="100%">
	    	<tr>
	    		<td align="center"><b>PHỐI HỢP XỬ LÝ GIỮA CA TRỰC VÀ BO/UCTT</b></td>
	    	</tr>
			<tr>
				<td style="width:33px" align="right"><div style="float: right;" id="jqxlistboxDB_CANH_BAO_PHOI_HOP_XL"></div></td>
			</tr>
		</table>
	 </div><br>
	 
	 <div id="gridDB_CANH_BAO_PHOI_HOP_XL"></div>
	 <div id='menujqxDB_CANH_BAO_PHOI_HOP_XL'>
	     <ul>
	   		<li><fmt:message key="global.button.exportExcel"/></li>
	     </ul>
	 </div>
</div>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/calendar.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/calendar_en.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/calendar_setup.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/chosen.jquery.js" ></script>

<link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/styles/calendar-blue.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/chosen.css"/>

<script type="text/javascript">

var type = '<c:out value="${type}"/>';
if (type == 'filter'){
		Calendar.setup({
		    inputField		:	"ngayTruc",	// id of the input field
		    ifFormat		:	"%d/%m/%Y",   	// format of the input field
		    button			:   "choosengayTKTo",  	// trigger for the calendar (button ID)
		    showsTime		:	true,
		    singleClick		:   false					// double-click mode
		});
}

var theme = getTheme();


${gridDB_CANH_BAO}
${gridDB_CANH_BAO_PHOI_HOP_XL}

var region = '<c:out value="${region}"/>';
var maPhong = '<c:out value="${maPhong}"/>';
var shiftId = '<c:out value="${shiftId}"/>';

$("#btSearch").jqxButton({theme: theme});

$('#menujqxDB_CANH_BAO').on('itemclick', function (event) {
	window.open('${pageContext.request.contextPath}/quan-ly-cb/dashboard/exportData.htm?region='+"<c:out value='${region}'/>"+
	        	'&maPhong='+"<c:out value='${maPhong}'/>"+
	        	 '&ngayTruc='+"<c:out value='${ngayTruc}'/>"+
	        	 '&caTruc='+"<c:out value='${caTruc}'/>"+
	        	 '&shiftId='+"<c:out value='${shiftId}'/>"+
	        	 '&note='+"<c:out value='${note}'/>"+
	        	 '&type=DB_CANH_BAO'
	        	 ,'_blank');
});

// SU CO MANG LUOI

$('#menujqxDB_CANH_BAO_PHOI_HOP_XL').on('itemclick', function (event) {
	
	// export data
	
		window.open('${pageContext.request.contextPath}/quan-ly-cb/dashboard/exportData.htm?region='+"<c:out value='${region}'/>"+
	        	'&maPhong='+"<c:out value='${maPhong}'/>"+
	        	 '&ngayTruc='+"<c:out value='${ngayTruc}'/>"+
	        	 '&caTruc='+"<c:out value='${caTruc}'/>"+
	        	 '&shiftId='+"<c:out value='${shiftId}'/>"+
	        	 '&note='+"<c:out value='${note}'/>"+
	        	 '&type=DB_CANH_BAO_PHOI_HOP_XL'
	        	 ,'_blank');
});
//Create a jqxDropDownList
var urlDept = "${pageContext.request.contextPath}/ajax/getDepartmentByRegion.htm?region="+"<c:out value='${region}'/>"+"&STT=1&isShift=Y";
// prepare the data
var sourceDept =
{
    datatype: "json",
    url: urlDept,
    datafields: [
                 { name: 'deptValue'},
                 { name: 'deptName'}
             ],
    async: false
};
var dataAdapterDept = new $.jqx.dataAdapter(sourceDept);
$("#maPhong").jqxDropDownList({source: dataAdapterDept, selectedIndex: 0, displayMember: "deptName", valueMember: "deptValue", width:250, height: 20, theme: theme, enableHover: true, autoOpen: true  });           
var maPhong = '<c:out value="${maPhong}"/>';
if(maPhong!="")
	$('#maPhong').val(maPhong);

//from sla to mau neu ty le < 95%
var colorrowrenderer  = function (row, column, value, defaultHtml) {
	var rowValue = $("#gridDB_CANH_BAO").jqxGrid('getrowdata', row);
	var element = $(defaultHtml);
	
    if (rowValue.tlxlDungHan < 95) {
        element.css({ 'background-color': 'Red', 'width': '100%', 'margin': '0px' });
        
    }
    return element[0].outerHTML;
}

</script>

