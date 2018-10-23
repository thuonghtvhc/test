<%@ include file="/commons/taglibs.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form:form commandName="xuLyCB" method="post" action="form.htm?center=${center}" onsubmit="return checkInput();"> 
	<form:hidden path="id"/>
	<form:hidden path="network"/>
	<table class="simple3" style = "width : 100%;">
		<tr>
			<td style = "width:150px;">Cảnh báo </td>
			<td style = "max-width:450px;"><form:input path = "alarmName"  value = "${alarmName }"  style="width:100%"/> </td>
			<td style = "width:150px;"> Mức cảnh báo </td>
			<td style = "max-width:450px;"><form:input path = "severity"  value = "${severity }" style="width:100%"/> </td>
		</tr>
		<tr>
			<td>Thiết bị </td>
			<td><form:input path = "ne"  value = "${thietBi }"  style="width:100%"/> </td>
			<td>Alarm id </td>
			<td><form:input path = "alarmId"  value = "${alarmId }"  style="width:100%"/> </td>
		</tr>
		<tr>
			<td> TG bắt đầu </td>
			<td><input id="sdate" name="sdate"  value = "${sdate}"  /> 
				<img alt="calendar" title="Click to choose the notification time" id="chooseSdate" style="cursor: pointer;" src="${pageContext.request.contextPath}/images/calendar.png"/>
			</td>	
			<td >TG kết thúc </td>
			<td><input id = "edate"  name="edate" value = "${edate}" /> 
				<img alt="calendar" title="Click to choose the notification time" id="chooseEdate" style="cursor: pointer;" src="${pageContext.request.contextPath}/images/calendar.png"/>
			</td>	
 		<tr>
		<tr>
			<td> Người xử lý </td>
			<td><form:input path = "nguoiXuLy"   style="width:100%"/> </td>
			<td> Tiến trình xử lý </td>
			<td><form:input path = "processXuLy"  value = "${processXuLy }" style="width:100%"/> </td>
		</tr>
		<tr>
			<td> Kết quả </td>
			<td colspan="3"><form:textarea path = "result"  value = "${result }" rows = "5" cols = "50" style="width:100%"/> </td>
			
		</tr>
		<tr>
			<td> Đề xuất</td>
			<td colspan="3"><form:textarea path = "offer"  value = "${offer }" rows = "5" cols = "50" style="width:100%"/> </td>
		</tr>
		<%-- <tr>
			<td> Phương thức chuyển </td>
			<td><form:input path = "cachChuyen"  value = "${cachChuyen }" maxlength="200" size = "50"/> </td>
			<td> Đánh giá theo SLA</td>
			<td>
				<spring:bind path = "rateBySLA">
					<div id = "rateBySLA"></div>
				</spring:bind>
			</td>
		</tr> --%>
		<tr>
           <td colspan = "4">
           		<input type="submit" class="button" id = "submit" value="<fmt:message key="global.form.luulai"/>" />
           	  	
           </td>
       </tr>
	</table>
</form:form>
<style>
    .error {
    	color: red;
    }
</style> 
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/calendar.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/calendar_en.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/calendar_setup.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar/chosen.jquery.js" ></script>

<link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/styles/calendar-blue.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/chosen.css"/>
  
<script src="<%=request.getContextPath() %>/js/uploadifive/jquery.uploadifive.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/uploadifive/uploadifive.css">
<link href="<%=request.getContextPath() %>/js/ajaxupload/fileuploader.css" rel="stylesheet" type="text/css">	
<script src="<%=request.getContextPath() %>/js/ajaxupload/fileuploader.js" type="text/javascript"></script>
<script type="text/javascript"> 

Calendar.setup({
    inputField		:	"edate",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M:%S",   	// format of the input field
    button			:   "chooseEdate",   	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 

Calendar.setup({
    inputField		:	"sdate",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M:%S",   	// format of the input field
    button			:   "chooseSdate",   	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 

var theme =  getTheme(); 
$('#submit').jqxButton({ theme: theme });

var theme = getTheme();
$("#nguoiXuLy").jqxInput({ width: '60%', height: 20, minLength: 1, theme: theme });
$("#processXuLy").jqxInput({ width: '60%', height: 20, minLength: 1, theme: theme });

function checkInput() {
	var resultLen = document.getElementById("result").value.length;
	var offerLen = document.getElementById("offer").value.length;
	
	if ( resultLen > 200 ) {
		alert('Kết quả không dài quá 200 kí tự');	
		return false;
	}
	
	if ( offerLen > 200 ) {
		alert('Đề nghị không dài quá 200 kí tự');	
		return false;
	}
	return true;
}

var rateBySLASource = {
		datatype: 'json',
		datafields: [{name: 'name'}, {name: 'value'}],
		url: "${pageContext.request.contextPath}/ajax/getSLAProcess.htm",
		async: false
	 }
	 var rateBySLADataAdapter = new $.jqx.dataAdapter(rateBySLASource);
		$("#rateBySLA").jqxDropDownList({ source: rateBySLADataAdapter, displayMember: "value", valueMember: "name", width: 120,  theme: theme,enableHover: true , autoDropDownHeight: true});
		 var rateBySLA = '<c:out value="${rateBySLA}"/>';
		 if(rateBySLA=="")
				$('#statusProcess').val('');
		else
				$('#statusProcess').val(rateBySLA);
</script>
