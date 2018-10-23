<%@ include file="/commons/taglibs.jsp"   %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<title>XỬ LÝ CẢNH BÁO</title>
<content tag="heading">XỬ LÝ CẢNH BÁO</content> 	
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxwindow.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxdropdownbutton.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxtree.js"></script>

<style>
.ui-tabs-nav .ui_link a:hover{
color: black;
}
</style>

<style>
 .shiftId
{
color:blue;
}
 </style>  
 <div>
	<div align="left">
		<ul class="ui-tabs-nav" style="padding-bottom:0px;">	
		<%-- <c:choose>
			<c:when test = "${isAdmin}"> --%>
				<c:if test = "${center == 'TTNOC'}">
					<li class="ui-tabs-selected"><a href="${pageContext.request.contextPath}/quan-ly-cb/xu-ly-cb/list.htm?center=TTNOC"><span>CORE</span></a></li>
					<li><a href="${pageContext.request.contextPath}/quan-ly-cb/xu-ly-cb/list.htm?center=TTML"><span>RAN</span></a></li>
				</c:if>
				<c:if test = "${center == 'TTML'}">
					<li ><a href="${pageContext.request.contextPath}/quan-ly-cb/xu-ly-cb/list.htm?center=TTNOC"><span>CORE</span></a></li>
					<li class="ui-tabs-selected"><a href="${pageContext.request.contextPath}/quan-ly-cb/xu-ly-cb/list.htm?center=TTML"><span>RAN</span></a></li>
				</c:if>
			<%-- </c:when>
			<c:when test = "${userInNOC}">
				<li class="ui-tabs-selected"><a href="${pageContext.request.contextPath}/quan-ly-cb/xu-ly-cb/list.htm?center=TTNOC"><span>CORE</span></a></li>
			</c:when>
			<c:otherwise>
				<li class="ui-tabs-selected"><a href="${pageContext.request.contextPath}/quan-ly-cb/xu-ly-cb/list.htm?center=TTML"><span>RAN</span></a></li>
			</c:otherwise>
		</c:choose>	 --%>
			<div align="right" class="ui_link">
				<table>
					<tr>
						<td style="width: 30px;height:20px; border: 1px;"></td>
						
					</tr>
				</table>
			</div>
		</ul>
		
	</div>
</div>
<div class="clear"></div>
<style>
table {
    border-collapse: collapse;
}
td.tdlabel  {
	height: 35px;
	/* text-align: right;
	padding-right:10px; */
}

td.tdvalue input[type=text] {
	width: 80%;
	/* padding-right:5px; */
}
input[type=number] {
	width: 30%;
	/* text-align: right; */
}
</style>

<div class="ui-tabs-panel">
<form:form commandName="filter" method="post" action="list.htm?center=${center}">
<input type="hidden" name="reloadStr" id="reloadStr" value="${reloadStr}">
<input type="hidden" name="statusView" id="statusView" value="${statusView}">
<input type="hidden" name="isSoundAlarm" id="isSoundAlarm" value="${isSoundAlarm}">

	<table border="0" width="100%"  cellpadding="0" class="form">
		
			<tr> 
				<td class="wid5 mwid80 tdlabel">  Loại thiết bị</td>
				<td class="wid7 mwid70 tdvalue">
					<div id='network' ></div>
				</td>
				<td class="wid5 mwid80 tdlabel" ><fmt:message key="alarmLog.sdateFS"/></td>
				<td class="wid7 mwid70 tdvalue">
						<input type ="text"  value="${sdateF}" name="sdateF" id="sdateF" size="17" maxlength="16"  >
			   			 <img alt="calendar" title="Click to choose the from date" id="chooseSDateF" style="cursor: pointer;position: absolute;" src="${pageContext.request.contextPath}/images/calendar.png"/>
				</td>
				<td class="wid5 mwid80 tdlabel"><fmt:message key="label.toDate"/></td>
				<td class="wid7 mwid70 tdvalue">
					<input type ="text"  value="${sdateT}" name="sdateT" id="sdateT" size="17" maxlength="16" >
			   		<img alt="calendar" title="Click to choose the to date" id="choosesdateT" style="cursor: pointer; position: absolute;" src="${pageContext.request.contextPath}/images/calendar.png"/>
				</td>
				<td class="wid5 mwid80 tdlabel"><fmt:message key="alarmLog.alarmName"/></td>
				<td class="wid7 mwid70 tdvalue">
					<input type="text" id="alarmName" name="alarmName"  value="${alarmName}"/>
					<div id='alarmName2' ></div>
				</td>
				<td class="wid5 mwid80 tdlabel"><fmt:message key="alarmLog.cellTK"/></td>
				<td class="wid7 mwid70 tdvalue">
					<input type="text" id="cellid"  name="cellid"  oninput="getProvinceByCode(this.value)"/>
				</td>
			</tr>
			<tr>
			
				<td class="wid5 mwid80 tdlabel"><fmt:message key="alarmLog.province"/></td>
				<td class="wid7 mwid70 tdvalue">
					 <input type="text" id="province" name="province"/>
				</td>
				<td class="wid5 mwid80 tdlabel"><fmt:message key="alarmLog.district"/></td>
				<td  class="wid7 mwid70 tdvalue">
					 <input type="text" id="district" name="district" />
				</td>
				<td class="wid5 mwid80 tdlabel"><fmt:message key="alarmLog.team"/></td>
				<td class="wid7 mwid70 tdvalue">
					 <input type="text" id="team" name="team" />
				</td>
				<td class="wid5 mwid80 tdlabel"><fmt:message key="alarmLog.bscid"/></td>
				<td class="wid7 mwid70 tdvalue">
					 <input type="text" id="bscid" name="bscid"  />
				</td>
				<td class="wid5 mwid80 tdlabel">Severity</td>
				<td class="wid7 mwid70 tdvalue">
					<div id='severityF' ></div>
				</td>
			</tr>
			<tr>
				<td class="wid5 mwid80 tdlabel">Region</td>
				<td class="wid7 mwid70 tdvalue">
			        <div id='region'></div>
		        </td>
				<td class="wid5 mwid80 tdlabel"><fmt:message key="alarmLog.vendor"/></td>
				<td class="wid7 mwid70 tdvalue">
					<div id='vendor'></div>
				</td>
				<td class="wid5 mwid80 tdlabel"><fmt:message key="alarmLog.alarmType"/></td>
				<td class="wid7 mwid70 tdvalue">
					<div id='alarmType' ></div>
				</td>		
				<td></td>	
				<td >
					<input class="button" type="submit" id="btFilter" name="btFilter" value="<fmt:message key="global.form.timkiem"/>" />
				</td>
				<td></td>
				
			</tr>
		</table>
	</form:form>
</div>
<br>
<div class="clear"></div>
<div id='JqxWidget' style="margin-top:5px;">
 <div style="float: right;margin-bottom:3px;width:100%;">
  <table border="0" cellspacing="1" width="100%">
   <tr>
    <td style="width: 33px" align="right"><div
      style="float: right;" id="jqxlistbox"></div></td>
   </tr>
  </table>
 </div><br>
  
  <div id="jqxgrid"></div>
  <div id='Menu'>
      <ul>
      <li><fmt:message key="global.button.editSelected"/></li>
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
Calendar.setup({
    inputField		:	"sdateF",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M",   	// format of the input field
    button			:   "chooseSDateF",  	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 

Calendar.setup({
    inputField		:	"sdateT",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M",   	// format of the input field
    button			:   "choosesdateT",   	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 	

</script>
<script type="text/javascript">
${grid}

$("#alarmName2").hide();
$("#reload").change( function() {
	if ($(this).is(':checked')) {
		$('#time').css("display","block");
		$('#reloadStr').val('Y');
	} else {
		$('#time').css("display","none");
		$('#reloadStr').val('N');
	}
});
//reload
	if ($('#reload').is(':checked')) {
		//$('#time').css("display","block");
		$('#reloadStr').val('Y');
		var timeLoad = 180;
		if($('timeReload').val()>0){
			timeLoad=$('timeReload').val()*60;
		}else{
				$('timeReload').val(3);
			}
		
		setTimeout(function(){
			$('#filter').submit();
		}, 
		timeLoad * 1000);
	} else {
		//$('#time').css("display","none");
		$('#reloadStr').val('N');
	}
	
//status view monitor
$("#statusViewC").change( function() {
	if ($(this).is(':checked')) {
		$('#statusView').val('Y');
	} else {
		$('#statusView').val('');
	}
});

if ($('#statusViewC').is(':checked')) {
	$('#statusView').val('Y');
} else {
	$('#statusView').val('');
}

//status view monitor
$("#isSoundAlarmC").change( function() {
	if ($(this).is(':checked')) {
		$('#isSoundAlarm').val('Y');
	} else {
		$('#isSoundAlarm').val('N');
	}
});

if ($('#isSoundAlarmC').is(':checked')) {
	$('#isSoundAlarm').val('Y');
} else {
	$('#isSoundAlarm').val('N');
}


function dateToYMDHMS(date) {
	//alert(date);
    var d = date.getDate();
    var m = date.getMonth()+1;
    var y = date.getFullYear();
    var h = date.getHours();
    var mi = date.getMinutes();
    var s = date.getSeconds();
    //alert(d+'-'+m+'-'+y);
    return '' + (d <= 9 ? '0' + d : d) + '/' + (m<=9 ? '0' + m : m) + '/' + y+ ' ' + (h<=9 ? '0' + h : h)+ ':' + (mi<=9 ? '0' + mi : mi)+ ':' + (s<=9 ? '0' + s : s) ;
}

//refresh 
$(document).ready(function(){
	//set auto size
	var sizeInput = $("#sdateF").width()*1.3;
		var theme =  getTheme();
		var reload = $("#reload").val();
		var timeLoad=60;
		if($('timeReload').val()>0){
			timeLoad=$('timeReload').val()*60;
			}
		if (reload=='Y') {
			setTimeout(function(){
				$('#filter').submit();
			}, 
			timeLoad*1000);
			$('#reloadStr').val('Y');
		}

		// Create a jqxMultile Input
		var renderer = function (itemValue, inputValue) {
        var terms = inputValue.split(/,\s*/);
        var value = inputValue;
     
         if (inputValue.indexOf(itemValue) < 0)
	    	{
      
        	 // remove the current input
             terms.pop();
             // add the selected item
	    	 terms.push(itemValue);
	         // add placeholder to get the comma-and-space at the end
	        // terms.push("");
	         value = terms.join(",");
	    	}
       
        return value;
    };

	    //input alarmInfo
    	$("#alarmInfo").jqxInput({ height: 20, width: sizeInput,  theme: theme});
    	 var alarmInfo =  "<c:out value='${alarmInfo}'/>";
  	   // alert(bscid);
          if(alarmInfo!="")
  			$('#alarmInfo').val(alarmInfo);
	    //Input BSC
	    ${bscList}
	    $("#bscid").jqxInput({ height: 20, width: sizeInput, theme: theme,
	        source: function (query, response) {
	            var item = query.split(/,\s*/).pop();
	            // update the search query.
	            $("#bscid").jqxInput({ query: item });
	            response(bscList);
	        },
	        renderer: renderer
	    });
	    var bscid =  "<c:out value='${bscid}'/>";
	   // alert(bscid);
        if(bscid!="")
			$('#bscid').val(bscid);
	 	// Input CELL
	 	${cellList}
	 	$("#cellid").jqxInput({ height: 20, width: sizeInput, theme: theme,
	        source: function (query, response) {
	            var item = query.split(/,\s*/).pop();
	            // update the search query.
	            $("#cellid").jqxInput({ query: item });
	            response(cellList);
	        },
	        renderer: renderer
	    });
	 	var cellid =  "<c:out value='${cellid}'/>";
	 	//alert(cellid);
        if(cellid!="")
			$('#cellid').val(cellid);
	 // Input district
	 	${districtList}
		$("#district").jqxInput({ height: 20, width: sizeInput, theme: theme,
	        source: function (query, response) {
	            var item = query.split(/,\s*/).pop();
	            // update the search query.
	            $("#district").jqxInput({ query: item });
	            response(districtList);
	        },
	        renderer: renderer
	    });
	 	var district =  "<c:out value='${district}'/>";
	 
        if(district!="") {
			$('#district').val(district);
			//alert(district);
        }
     
	// Create a jqxComboBox vendor
       	var urlVendor = "${pageContext.request.contextPath}/ajax/getVendor.htm";
        // prepare the data
        var sourceVendor =
        {
            datatype: "json",
            datafields: [
                { name: 'value' },
                { name: 'name' }
            ],
            url: urlVendor,
            async: false
        };
        var dataAdapterVendor = new $.jqx.dataAdapter(sourceVendor);
        // Create a jqxComboBox
        $("#vendor").jqxComboBox({ source: dataAdapterVendor, displayMember: "value", valueMember: "name",checkboxes: true, width: sizeInput,height: '20px',itemHeight: 30,theme: theme,autoDropDownHeight: true,autoOpen: true });
        var vendor =  "<c:out value='${vendor}'/>";
 		if(vendor=="")
 			$('#vendor').val('');
 		else
 		{
 			var vendorVar = vendor.split(",");
 			if (vendorVar != null) {
 				for (var i=0; i<vendorVar.length; i++) {
 					$("#vendor").jqxComboBox('checkItem', vendorVar[i] ); 
 				}
 			}
 		}   
      
	 // Create a jqxComboBox AlarmType
		var urlalarmType = "${pageContext.request.contextPath}/ajax/getAlarmType.htm";
        // prepare the data
        var sourcealarmType =
        {
            datatype: "json",
            datafields: [
                { name: 'alarmType'}
            ],
            url: urlalarmType,
            async: false
        };
        var dataAdapteralarmType = new $.jqx.dataAdapter(sourcealarmType);
        // Create a jqxComboBox
        $("#alarmType").jqxComboBox({ source: dataAdapteralarmType, displayMember: "alarmType", valueMember: "alarmType",checkboxes: true, width: sizeInput, height: 20, theme: theme,autoDropDownHeight: true  });

    	var alarmType = '<c:out value="${alarmType}"/>';
 	   // checked
 		if(alarmType=="")
 			$('#alarmType').val('');
 		else
 		{
 			var alarmTypeVar = alarmType.split(",");
 			if (alarmTypeVar != null) {
 				for (var i=0; i<alarmTypeVar.length; i++) {
 					$("#alarmType").jqxComboBox('checkItem', alarmTypeVar[i] ); 
 				}
 			}
 		}   
	
		// Create a jqxComboBox alarmName
		var vendorT = $('#vendor').val();
		if (vendorT=='')
		{
			vendorT='';
		}
		var alarmTypeT = $('#alarmType').val();
		if (alarmTypeT=='')
		{
			alarmTypeT='';
		}
		var networkT = "<c:out value='${netWork}'/>";
		var urlAlarmName = "${pageContext.request.contextPath}/ajax/getAlarmName.htm?vendor="+vendorT+"&alarmType="+alarmTypeT+"&network="+networkT;
	    // prepare the data
	    var sourceAlarmName =
	    {
	        datatype: "json",
	        datafields: [
	            { name: 'blockValue'}
	        ],
	        url: urlAlarmName,
	        async: false
	    };
	    var dataAdapterAlarmName = new $.jqx.dataAdapter(sourceAlarmName);
	    // Create a jqxComboBox
	    $("#alarmName2").jqxComboBox({ source: dataAdapterAlarmName, displayMember: "blockValue", valueMember: "blockValue", width: sizeInput, height: 20, theme: theme,autoOpen: true  });
	    var alarmName =  "<c:out value='${alarmName}'/>";
	    if(alarmName=="")
			$('#alarmName2').val('');
		else
			$('#alarmName2').val(alarmName);
	  // alarmName textbox
		$("#alarmName").jqxInput({ height: 20, width: sizeInput, theme: theme});
		//Input team
	    ${teamList}
	    $("#team").jqxInput({ height: 20, width: sizeInput, theme: theme,
	        source: function (query, response) {
	            var item = query.split(/,\s*/).pop();
	            // update the search query.
	            $("#team").jqxInput({ query: item });
	            response(teamList);
	        },
	        renderer: renderer
	    });
	    var team =  "<c:out value='${team}'/>";
	   // alert(bscid);
        if(team!="")
			$('#team').val(team);
        
      //Input province
	    ${provinceList}
	    var widthProvince=100;
	    $("#province").jqxInput({ height: 20, width: sizeInput, theme: theme,
	        source: function (query, response) {
	            var item = query.split(/,\s*/).pop();
	            // update the search query.
	            $("#province").jqxInput({ query: item });
	            response(provinceList);
	        },
	        renderer: renderer
	    });
	    var province =  "<c:out value='${province}'/>";
	   // alert(bscid);
        if(province!="")
			$('#province').val(province);
       // groups 
        var groupList=[];
    	$.getJSON("${pageContext.request.contextPath}/ajax/getGroupListAlarm.htm",{dept:$("#dept").text(),team:$("#teamProcess").text()}, function(j){
    		groupList =j;
    	   });
    	
       $("#groups").jqxInput({ height: 20, width: '100%', theme: theme,
           source: function (query, response) {
               var item = query.split(/,\s*/).pop();
               // update the search query.
               $("#groups").jqxInput({ query: item });
               response(groupList);
           },
           renderer: renderer
       });

       var theme =  getTheme();
   	
   	$("#alarmType").change(function(){
   		if ($("#alarmType").val() != null && $("#alarmType").val() != '') {
   			var vendorT = $('#vendor').val();
   			if (vendorT=='')
   			{
   				vendorT='';
   			}
   			var networkT = "<c:out value='${netWork}'/>";
   			var urlAlarmName = "${pageContext.request.contextPath}/ajax/getAlarmName.htm?vendor="+vendorT+"&alarmType="+$("#alarmType").val()+"&network="+networkT;
   		    // prepare the data
   		    var sourceAlarmName =
   		    {
   		        datatype: "json",
   		        datafields: [
   		            { name: 'blockValue'}
   		        ],
   		        url: urlAlarmName,
   		        async: false
   		    };
   		    var dataAdapterAlarmName = new $.jqx.dataAdapter(sourceAlarmName);
   		    // Create a jqxComboBox
   		    $("#alarmName2").jqxComboBox({ source: dataAdapterAlarmName, displayMember: "blockValue", valueMember: "blockValue", width: sizeInput, height: 20, theme: theme,autoOpen: true });
   		    var alarmName =  "<c:out value='${alarmName}'/>";
   		    if(alarmName=="")
   				$('#alarmName2').val('');
   			else
   				$('#alarmName2').val(alarmName);
   			
   			var urlalarmMappingName = "${pageContext.request.contextPath}/ajax/getAlarmMappingName.htm?vendor="+vendorT+"&alarmType="+$("#alarmType").val()+"&network="+networkT;
   			// prepare the data
   			var sourcealarmMappingName =
   			{
   			    datatype: "json",
   			    datafields: [
   			        { name: 'alarmMappingId'},
   			        { name: 'alarmMappingName'}
   			    ],
   			    url: urlalarmMappingName,
   			    async: false
   			};
   			var dataAdapteralarmMappingName = new $.jqx.dataAdapter(sourcealarmMappingName);
   			// Create a jqxComboBox choose alarmMappingName
   			$("#cbalarmMappingName").jqxDropDownList({ source: dataAdapteralarmMappingName,checkboxes: true, displayMember: "alarmMappingName", valueMember: "alarmMappingName", width: sizeInput, height: 20, theme: theme,enableHover: true });
   			// Create a jqxComboBox choose not alarmMappingName
   			$("#unAlarmMappingName").jqxDropDownList({ source: dataAdapteralarmMappingName,checkboxes: true, displayMember: "alarmMappingName", valueMember: "alarmMappingName", width: sizeInput, height: 20, theme: theme,enableHover: true });
   		}
   		
   	   
   	});	
   	  // handle context menu clicks.
       $("#Menu").on('itemclick', function (event) {
           var args = event.args;
           
           if ($.trim($(args).text()) == '<fmt:message key="global.button.editSelected"/>') {
          	  	var rowindex = $("#jqxgrid").jqxGrid('getselectedrowindex');
               var row = $("#jqxgrid").jqxGrid('getrowdata', rowindex);
           	window.location = 'form.htm?id='+row.id+'&center='+"<c:out value='${center}'/>";   
           }
    
       });

   	
   	var urlLLProvider= "${pageContext.request.contextPath}/ajax/getLLProvider.htm";
   	// prepare the data
   	var sourceaLLProvider =
   	{
   	    datatype: "json",
   	    url: urlLLProvider,
   	    datafields: [
   	                 { name: 'llProvider' }
   	             ],
   	    async: false
   	};
   	var dataAdapterLLProvider = new $.jqx.dataAdapter(sourceaLLProvider);
   	// Create a jqxComboBox
   	$("#actionProcess").jqxComboBox({ source: dataAdapterLLProvider, displayMember: "llProvider", valueMember: "llProvider",  width: 170, height: 20, theme: theme,autoOpen: true  });
   	var actionProcess =  "<c:out value='${actionProcess}'/>";
   	if(actionProcess=="")
   		$('#actionProcess').val('ALL');
   	else
   		$('#actionProcess').val(actionProcess);
   		
   	var siteList = $("#siteList").val();
   	//input alarm
       ${alarmList}
   	 $("#alarm").jqxInput({ placeHolder: "Enter alarm",  height: 25, width: '98%', minLength: 0, maxLength: 170, theme: theme,
          source: alarmList
      });
      var alarm =  "<c:out value='${alarm}'/>";
     // alert(bscid);
      if(alarm!="")
   		$('#alarm').val(alarm);
   	
    	
     //input alarmInfo
       $("#alarmInfoF").jqxInput({placeHolder: "Enter alarmInfo", height: 25, width: '100%', minLength: 0, maxLength: 900, theme: theme});
     //input actionProcess
       $("#siteList").jqxInput({ height: 20, width: '100%', minLength: 0, maxLength: 200, theme: theme});
       $("#siteQuantity").jqxInput({ height: 20, width: '50%', minLength: 0, maxLength: 20, theme: theme});
       $("#countSite").jqxInput({ height: 20, width: '50%', minLength: 0, maxLength: 20, theme: theme});
       
    // Create a jqxComboBox AlarmType
     	var network =  "<c:out value='${warningTp}'/>";
   	var urlalarmType = "${pageContext.request.contextPath}/ajax/getAlarmTypeAtShift.htm?network="+network;
       // prepare the data
       var sourcealarmType =
       {
           datatype: "json",
           datafields: [
               { name: 'alarmType'}
           ],
           url: urlalarmType,
           async: false
       };
       var dataAdapteralarmType = new $.jqx.dataAdapter(sourcealarmType);
       // Create a jqxComboBox
       $("#alarmTypeF").jqxComboBox({ source: dataAdapteralarmType, displayMember: "alarmType", valueMember: "alarmType", width: sizeInput, height: 20, theme: theme,autoDropDownHeight: true,autoOpen: true  });
       var alarmTypeF =  "<c:out value='${alarmTypeF}'/>";
       if(alarmTypeF=="")
   		$('#alarmTypeF').val('');
   	else
   		$('#alarmTypeF').val(alarmTypeF);
    
       $("#btCancel").click(function (event) {
           $("#jqxwindow").jqxWindow('close');

       });
       
       $("#siteList").change(function(){
   		var system= $("#siteList").val();
   		if (system!=null && system!='')
   			{
   				var systemVar = system.split(",");
   				$("#siteQuantity").val(systemVar.length);
   				
   			}
   		else
   			{
   			$("#siteQuantity").val(0);}
   		});
       
   		
   	//combobox region
   	var urlRegion = "${pageContext.request.contextPath}/ajax/getRegionList.htm";
      
   	var sourceRegion = {
   		datatype : "json",
   		url : urlRegion,
   		datafields : [ {
   			name : 'name'
   		}, {
   			name : 'value'
   		} ],
   		async : false
   	};


   	var dataAdapterregion = new $.jqx.dataAdapter(sourceRegion);
   	$("#region").jqxComboBox({
   		source : dataAdapterregion,
   		displayMember : "value",
   		valueMember : "name",
   		checkboxes : true,
   		width : sizeInput,
   		height : 20,
   		theme : theme,
   		autoDropDownHeight : true,
   		autoOpen : true
   	});

   	var cbregion = '<c:out value="${region}"/>';
   	// alert(dept);
   	if (cbregion == "")
   		$('#region').val('');
   	else {
   		var regionVar = cbregion.split(",");
   		if (regionVar != null) {
   			for (var i = 0; i < regionVar.length; i++) {
   				$("#region").jqxComboBox('checkItem', regionVar[i]);
   			}
   		}
   	}

   	//serverity
   	var urlseverity = "${pageContext.request.contextPath}/ajax/getSeverity.htm";
   	// prepare the data
   	var sourceseverity = {
   		datatype : "json",
   		datafields : [ {
   			name : 'name'
   		}, {
   			name : 'value'
   		} ],
   		url : urlseverity,
   		async : false
   	};
   	var dataAdapterServerity = new $.jqx.dataAdapter(sourceseverity);
   	// Create a jqxComboBox choose severityF

   	$("#severityF").jqxComboBox({
   		source : dataAdapterServerity,
   		checkboxes : true,
   		displayMember : "value",
   		valueMember : "name",
   		width: sizeInput,
   		height : 20,
   		theme : theme,
   		autoOpen : true,
   		autoDropDownHeight : true
   	});
   	var cbseverityF = '<c:out value="${severityF}"/>';
   	// alert(dept);
   	if (cbseverityF == "")
   		$('#severityF').val('');
   	else {
   		var severityFVar = cbseverityF.split(",");
   		if (severityFVar != null) {
   			for (var i = 0; i < severityFVar.length; i++) {
   				$("#severityF").jqxComboBox('checkItem', severityFVar[i]);
   			}
   		}
   	}
   	
    var center = '<c:out value="${center}"/>';	
    var networkUrl = "${pageContext.request.contextPath}/alarmLog-new/getNetwork.htm?center=" + center;
    var networkSource = {
  	datatype: 'json',
  	datafields: [{name: 'name'}, {name: 'value'}],
  	url: networkUrl,
  	async: false
    }
    var networkDataAdapter = new $.jqx.dataAdapter(networkSource);
   $("#network").jqxDropDownList({ source: networkDataAdapter, displayMember: "value", valueMember: "name", width: sizeInput, theme: theme,enableHover: true , autoDropDownHeight: true});
   var network = '<c:out value="${network}"/>';
   if(network=="")
  		$('#network').val('');
  	else
  		$('#network').val(network);   	
}); // end document.readky
	// select Hprovince by code-- chon cell site se hien tinh quan huyen nhom cua cell do
	function getProvinceByCode(val) {
		var code = "";
		if ($("#cellid").val().length >= 6)
			code = $("#cellid").val().substring(0, 4);
		if (code != "") {
			$.getJSON("${pageContext.request.contextPath}/ajax/get-province-by-code.htm",
				{ code : code },
				function(j) {
					$("#region").jqxDropDownList('clearSelection',true);
					$("#region").jqxDropDownList('checkItem',j.region);
					$("#province").val(j.province);
					$("#district").val(j.district);
					$("#team").val(j.team);
				});	
		}
	}
	
</script>
