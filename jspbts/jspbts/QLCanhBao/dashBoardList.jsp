<%@ include file="/commons/taglibs.jsp"   %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxwindow.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxdropdownbutton.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxtree.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQWidgets/jqwidgets/jqxrating.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/editortext/ckeditor.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/editortext/sample.js"></script>

<div class="clear"></div>

<div id='SlaJqxWidget' style="margin-top:5px;">
	<div style="float: right;margin-bottom:3px;width:100%;">
	    <table border="0" cellspacing="1" cellpadding="0" width="100%">
			<tr>
				<td style="width:33px" align="right"><div style="float: right;" id="jqxlistboxSlaGrid"></div></td>
			</tr>
		</table>
	 </div><br>
	<c:choose>
	 <c:when test = "${userInNOC}">
		 <p>TTNOC</p>
		 <div id="TTNOCjqxgrid"></div>
		 <br>
		 <div id="TTNOCjqxgrid2"></div>
	 <br>
	</c:when> 
	<c:when test = "${!isAdmin && !userInNOC}">
		 <p>TTML</p>
		 <div id = "TTMLjqxgrid"></div>
		 <br>
		 <div id = "TTMLjqxgrid2"></div>
		 <br>
	</c:when>	 
	<c:when test = "${ isAdmin}"> 
	 <p>CNOC </p>
	 <div id = "CNOCjqxgrid"></div>
	  <br>
	 <div id = "CNOCjqxgrid2"></div>
	</c:when> 
	</c:choose>
</div>

<script>

$(document).ready(function () {

	 var datafields = [ { name: 'network', type: 'string' }, 
			{ name: 'tyLeDungHan', type: 'float' }, 
			{ name: 'a1CBPhatSinh', type: 'int' }, 
			{ name: 'a1CTXuLyDungHan', type: 'int' }, 
			{ name: 'a1CTXuLyQuaHan', type: 'int' }, 
			{ name: 'a1BOXuLyDungHan', type: 'int' }, 
			{ name: 'a1BOXuLyQuaHan', type: 'int' }, 
			{ name: 'a1CBTonDungHan', type: 'int' }, 
			{ name: 'a1CBTonQuaHan', type: 'int' }, 
			{ name: 'a2CBDauCa', type: 'int' }, 
			{ name: 'a2CBPhatSinh', type: 'int' }, 
			{ name: 'a2CTXuLyDungHan', type: 'int' }, 
			{ name: 'a2CTXuLyQuaHan', type: 'int' }, 
			{ name: 'a2BOXuLyDungHan', type: 'int' }, 
			{ name: 'a2BOXuLyQuaHan', type: 'int' }, 
			{ name: 'a2CBTonDungHan', type: 'int' }, 
			{ name: 'a2CBTonQuaHan', type: 'int' }, 
			{ name: 'otherCBDauCa', type: 'int' }, 
			{ name: 'otherCBPhatSinh', type: 'int' }, 
			{ name: 'otherCTXuLyDungHan', type: 'int' }, 
			{ name: 'otherCTXuLyQuaHan', type: 'int' }, 
			{ name: 'otherBOXuLyDungHan', type: 'int' }, 
			{ name: 'otherBOXuLyQuaHan', type: 'int' }, 
			{ name: 'otherCBTonDungHan', type: 'int' }, 
			{ name: 'otherCBTonQuaHan', type: 'int' }, 
			{ name: 'a1CBDauCa', type: 'int' } 
		];

	var numberrenderer = function (row, column, value) { return '<div style="text-align: center; margin-top: 5px;">' + (1 + value) + '</div>'; };
	var aggregatesrenderer = function (aggregates, column, element, summaryData) { 
								var renderstring = ""; 
								$.each(aggregates, function (key, value) { 
														var color = 'red'; 
														renderstring += '<div style="color: ' + color + '; position: relative; margin: 6px; text-align: right; overflow: hidden;">' + value + '</div>'; 
													}); 
													renderstring += "</div>"; 
													return renderstring;
							}; 
	var columngroups=[{ text: 'BO/ƯCTT <br>xử lý', parentgroup: 'Critical', align: 'center', name: 'boXLCritical' },
			{ text: 'BO/ƯCTT<br> xử lý', parentgroup: 'Major', align: 'center', name: 'boXLMajor' },
			{ text: 'BO/ƯCTT<br> xử lý', parentgroup: 'Others', align: 'center', name: 'boXLOther' },
			{ text: 'Ca trực xử lý', parentgroup: 'Critical', align: 'center', name: 'caTrucXLCritical' },
			{ text: 'Ca trực xử lý', parentgroup: 'Major', align: 'center', name: 'caTrucXLMajor' },
			{ text: 'Ca trực xử lý', parentgroup: 'Others', align: 'center', name: 'caTrucXLOther' },
			{ text: 'Critical', align: 'center', name: 'Critical' },
			{ text: 'Cảnh báo tồn', parentgroup: 'Critical', align: 'center', name: 'cbTonCritical' },
			{ text: 'Cảnh báo tồn', parentgroup: 'Major', align: 'center', name: 'cbTonMajor' },
			{ text: 'Cảnh báo tồn', parentgroup: 'Others', align: 'center', name: 'cbTonOther' },
			{ text: 'Major', align: 'center', name: 'Major' },
			{ text: 'Others', align: 'center', name: 'Others' }
		]; 
 var column = [{pinned: true, text: 'STT',datafield: '', columntype: 'number', filterable: false, exportable: false, cellsrenderer: numberrenderer, width: 30,align: 'center' },
		{ text: 'Hệ <br> thống', datafield: 'network', columntype: 'textbox', filtertype: 'textbox',align: 'center',width: 50 },
		{ text: 'Đầu <br> ca', datafield: 'a1CBDauCa', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'Critical' },
		{ text: 'XH <br> trong <br> ca', datafield: 'a1CBPhatSinh', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'Critical' },
		{ text: 'Đúng <br> hạn', datafield: 'a1CTXuLyDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'caTrucXLCritical' },
		{ text: 'Quá <br> hạn', datafield: 'a1CTXuLyQuaHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'caTrucXLCritical' },
		{ text: 'Đúng <br> hạn', datafield: 'a1BOXuLyDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'boXLCritical' },
		{ text: 'Quá <br> hạn', datafield: 'a1BOXuLyQuaHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'boXLCritical' },
		{ text: 'Đúng <br> hạn', datafield: 'a1CBTonDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'cbTonCritical'},
		{ text: 'Quá <br> hạn', datafield: 'a1CBTonQuaHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'cbTonCritical' },
		{ text: 'Đầu <br> ca', datafield: 'a2CBDauCa', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'Major' },
		{ text: 'XH <br> trong <br> ca', datafield: 'a2CBPhatSinh', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'Major' },
		{ text: 'Đúng <br> hạn', datafield: 'a2CTXuLyDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'caTrucXLMajor'},
		{ text: 'Quá <br> hạn', datafield: 'a2CTXuLyQuaHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'caTrucXLMajor' },
		{ text: 'Đúng <br> hạn', datafield: 'a2BOXuLyDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'boXLMajor' },
		{ text: 'Quá <br> hạn', datafield: 'a2BOXuLyQuaHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'boXLMajor' },
		{ text: 'Đúng <br> hạn', datafield: 'a2CBTonDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'cbTonMajor' },
		{ text: 'Quá <br> hạn', datafield: 'a2CBTonQuaHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'cbTonMajor' },
		{ text: 'Đầu <br> ca', datafield: 'otherCBDauCa', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'Others' },
		{ text: 'XH <br> trong <br> ca', datafield: 'otherCBPhatSinh', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'Others' },
		{ text: 'Đúng <br> hạn', datafield: 'otherCTXuLyDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup:  'caTrucXLOther' },
		{ text: 'Quá <br> hạn', datafield: 'otherCTXuLyQuaHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'caTrucXLOther' },
		{ text: 'Đúng <br> hạn', datafield: 'otherBOXuLyDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup:  'boXLOther' },
		{ text: 'Quá <br> hạn', datafield: 'otherBOXuLyQuaHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'boXLOther' },
		{ text: 'Đúng <br> hạn', datafield: 'otherCBTonDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'cbTonOther' },
		{ text: 'Quá <br> hạn', datafield: 'otherCBTonQuaHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'cbTonOther' },
		{ text: 'Tỉ lệ xử <br> lý đúng <br> hạn', datafield: 'tyLeDungHan', columntype: 'numberinput', filtertype: 'textbox',align: 'center' } 
		];
    ${data}
 	var shiftId = <c:out value='${shiftId}'/>;
	var TTNOCsource ={datatype: 'json',datafields: datafields,localdata : ttNOCdata};
	var TTNOCdataadapter = new $.jqx.dataAdapter(TTNOCsource, {loadError: function(xhr, status, error){ alert(error);}});
	
	$('#TTNOCjqxgrid').jqxGrid({width: '100%',
		source : TTNOCdataadapter,
		columnsheight: 50,
		theme: getTheme(),
		showfilterrow: true, 
		filterable: true, 
		sortable: true, 
		pageable: true, 
		autoheight: true,
		autorowheight: true, 
		showstatusbar: true, 
		statusbarheight: 25, 
		altrows: true, showaggregates: true, 
		columnsresize: true, columnsreorder: true, 
		scrollmode: 'deferred',
		selectionmode: 'multiplerowsextended',
		pagesizeoptions: ['50', '100', '200', '300', '400', '500'],
		columns: column,columngroups: columngroups }); 
	
	var TTMLsource ={datatype: 'json',datafields: datafields,localdata : ttMLdata};
	var TTMLdataadapter = new $.jqx.dataAdapter(TTMLsource, {loadError: function(xhr, status, error){ alert(error);}});
	
	$('#TTMLjqxgrid').jqxGrid({width: '100%',
		source : TTMLdataadapter,
		theme: getTheme(),
		columnsheight: 50,
		showfilterrow: true, 
		filterable: true, 
		sortable: true, 
		pageable: true, 
		autoheight: true,
		autorowheight: true, 
		showstatusbar: true, 
		statusbarheight: 25, 
		altrows: true, showaggregates: true, 
		columnsresize: true, columnsreorder: true, 
		scrollmode: 'deferred',
		selectionmode: 'multiplerowsextended',
		pagesizeoptions: ['50', '100', '200', '300', '400', '500'],
		columns: column,columngroups: columngroups }); 
	 
	var CNOCsource ={datatype: 'json',datafields: datafields,localdata : CNOCdata};
	var CNOCdataadapter = new $.jqx.dataAdapter(CNOCsource, {loadError: function(xhr, status, error){ alert(error);}});
	
	$('#CNOCjqxgrid').jqxGrid({width: '100%',
		source : CNOCdataadapter,
		theme: getTheme(),
		columnsheight: 50,
		showfilterrow: true, 
		filterable: true, 
		sortable: true, 
		pageable: true, 
		autoheight: true,
		autorowheight: true, 
		showstatusbar: true, 
		statusbarheight: 25, 
		altrows: true, showaggregates: true, 
		columnsresize: true,  
		scrollmode: 'deferred',
		selectionmode: 'multiplerowsextended',
		columns: column,columngroups: columngroups });  

// grid phoi hop xu ly	
 var datafields2 = [ { name: 'network', type: 'string' }, 
        			{ name: 'a1CBPhatSinh', type: 'int' }, 
        			{ name: 'a1CBDauCa', type: 'int' }, 
        			{ name: 'a1CaTrucChuyen', type: 'int' }, 
        			{ name: 'a1HeThongChuyen', type: 'int' }, 
        			{ name: 'a1BoCanXuLy', type: 'int' }, 
        			{ name: 'a1BoXuLyXong', type: 'int' }, 
        			{ name: 'a1BoReport', type: 'int' }, 
        			{ name: 'a2CBPhatSinh', type: 'int' }, 
        			{ name: 'a2CBDauCa', type: 'int' }, 
        			{ name: 'a2CaTrucChuyen', type: 'int' }, 
        			{ name: 'a2HeThongChuyen', type: 'int' }, 
        			{ name: 'a2BoCanXuLy', type: 'int' }, 
        			{ name: 'a2BoXuLyXong', type: 'int' }, 
        			{ name: 'a2BoReport', type: 'int' },
        			{ name: 'otherCBPhatSinh', type: 'int' }, 
        			{ name: 'otherCaTrucChuyen', type: 'int' }, 
        			{ name: 'otherCBDauCa', type: 'int' }, 
        			{ name: 'otherHeThongChuyen', type: 'int' }, 
        			{ name: 'otherBoCanXuLy', type: 'int' }, 
        			{ name: 'otherBoXuLyXong', type: 'int' }, 
        			{ name: 'otherBoReport', type: 'int' }
        		];

   	var columngroups2=[{ text: 'Phối hợp xử lý giữa ca trực và BO/ƯCTT', align: 'center', name: 'header' , columnsheight :30},
   			{ text: 'Critical', parentgroup: 'header', align: 'center', name: 'Critical', columnsheight :30 },
   			{ text: 'Major', parentgroup: 'header', align: 'center', name: 'Major' , columnsheight :30},
   			{ text: 'Others', parentgroup: 'header', align: 'center', name: 'Others' , columnsheight :30}
   		]; 
        var column2 = [{pinned: true, text: 'STT',datafield: '', columntype: 'number', filterable: false, exportable: false, cellsrenderer: numberrenderer, width: 30,align: 'center' },
       		{ text: 'Hệ <br> thống', datafield: 'network', columntype: 'textbox', filtertype: 'textbox',align: 'center',width: 50 },
       		{ text: 'Đầu ca', datafield: 'a1CBDauCa', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'Critical' },
       		{ text: 'XH trong <br> ca', datafield: 'a1CBPhatSinh', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Critical' },
       		{ text: 'Ca trực <br> chuyển', datafield: 'a1CaTrucChuyen', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Critical' },
       		{ text: 'Hệ thống <br> chuyển', datafield: 'a1HeThongChuyen', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Critical' },
       		{ text: 'BO/ƯCTT <br> cần xử <br> lý', datafield: 'a1BoCanXuLy', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Critical' },
       		{ text: 'BO/ƯCTT <br> xử lý xong', datafield: 'a1BoXuLyXong', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Critical' },
       		{ text: 'BO/ƯCTT <br> báo cáo', datafield: 'a1BoReport', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Critical' },
       		{ text: 'Đầu ca', datafield: 'a2CBDauCa', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'Major' },
       		{ text: 'XH trong <br> ca', datafield: 'a2CBPhatSinh', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Major' },
       		{ text: 'Ca trực <br> chuyển', datafield: 'a2CaTrucChuyen', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Major'},
       		{ text: 'Hệ thống <br> chuyển', datafield: 'a2HeThongChuyen', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Major'},
       		{ text: 'BO/ƯCTT <br> cần xử <br> lý', datafield: 'a2BoCanXuLy', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Major' },
       		{ text: 'BO/ƯCTT <br> xử lý xong', datafield: 'a2BoXuLyXong', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Major' },
       		{ text: 'BO/ƯCTT <br> báo cáo', datafield: 'a2BoReport', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Major' },
       		{ text: 'Đầu ca', datafield: 'otherCBDauCa', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 50, columngroup: 'Others' },
       		{ text: 'XH trong <br> ca', datafield: 'otherCBPhatSinh', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Others' },
       		{ text: 'Ca trực <br> chuyển', datafield: 'otherCaTrucChuyen', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup:  'Others' },
       		{ text: 'Hệ thống <br> chuyển', datafield: 'otherHeThongChuyen', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup:  'Others' },
       		{ text: 'BO/ƯCTT <br> cần xử <br> lý', datafield: 'otherBoCanXuLy', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup: 'Others' },
       		{ text: 'BO/ƯCTT <br> xử lý xong', datafield: 'otherBoXuLyXong', columntype: 'numberinput', filtertype: 'textbox',align: 'center',width: 60, columngroup:  'Others' },
       		{ text: 'BO/ƯCTT <br> báo cáo', datafield: 'otherBoReport', columntype: 'numberinput', filtertype: 'textbox',align: 'center', columngroup: 'Others' }
       		];
           
   //     ${data2}
	     var TTNOCsource2 ={datatype: 'json',datafields: datafields2,localdata : ttNOCdata};
	     var TTNOCdataadapter2 = new $.jqx.dataAdapter(TTNOCsource2, {loadError: function(xhr, status, error){ alert(error);}});
       	
       	$('#TTNOCjqxgrid2').jqxGrid({width: '100%',
       		source : TTNOCdataadapter2,
       		theme: getTheme(),
       		columnsheight: 65,
  			showfilterrow: true, 
  			filterable: true, 
  			sortable: true, 
  			pageable: true, 
  			autoheight: true,
  			autorowheight: true, 
  			showstatusbar: true, 
  			statusbarheight: 25, 
  			altrows: true, showaggregates: true, 
  			columnsresize: true, columnsreorder: true, 
  			scrollmode: 'deferred',
  			selectionmode: 'multiplerowsextended',
  			pagesizeoptions: ['50', '100', '200', '300', '400', '500'],
  			columns: column2,columngroups: columngroups2 }); 
       	
        var TTMLsource2 ={datatype: 'json',datafields: datafields2,localdata : ttMLdata};
       	var TTMLdataadapter2 = new $.jqx.dataAdapter(TTMLsource2, {loadError: function(xhr, status, error){ alert(error);}});
       	 
       	$('#TTMLjqxgrid2').jqxGrid({width: '100%',
       		source : TTMLdataadapter2,
       		theme: getTheme(),
       		columnsheight: 65,
   			showfilterrow: true, 
   			filterable: true, 
   			sortable: true, 
   			pageable: true, 
   			autoheight: true,
   			autorowheight: true, 
   			showstatusbar: true, 
   			statusbarheight: 25, 
   			altrows: true, showaggregates: true, 
   			columnsresize: true, columnsreorder: true, 
   			scrollmode: 'deferred',
   			selectionmode: 'multiplerowsextended',
   			pagesizeoptions: ['50', '100', '200', '300', '400', '500'],
   			columns: column2,columngroups: columngroups2 }); 
     	 
        var CNOCsource2 ={datatype: 'json',datafields: datafields2,localdata : CNOCdata};
       	var CNOCdataadapter2 = new $.jqx.dataAdapter(CNOCsource2, {loadError: function(xhr, status, error){ alert(error);}});
       	 
       	$('#CNOCjqxgrid2').jqxGrid({width: '100%',
       		source : CNOCdataadapter2,
       		theme: getTheme(),
       		columnsheight: 65,
   			showfilterrow: true, 
   			filterable: true, 
   			sortable: true, 
   			pageable: true, 
   			autoheight: true,
   			autorowheight: true, 
   			showstatusbar: true, 
   			statusbarheight: 25, 
   			altrows: true, showaggregates: true, 
   			columnsresize: true,  
   			scrollmode: 'deferred',
   			selectionmode: 'multiplerowsextended',
   			columns: column2,columngroups: columngroups2 });  
});	


</script>