<%@ include file="/commons/taglibs.jsp"   %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<title>${title}</title>
<content tag="heading">${title}</content> 	
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

				<c:if test = "${center == 'TTNOC'}">
					<li class="ui-tabs-selected"><a href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?center=TTNOC"><span>CORE</span></a></li>
					<li><a href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?center=TTML"><span>RAN</span></a></li>
					<li><a href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?center=TD"><span>TRANSMISSION</span></a></li>
				</c:if>
				<c:if test = "${center == 'TTML'}">
					
					<li ><a href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?center=TTNOC"><span>CORE</span></a></li>
					<li class="ui-tabs-selected"><a href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?center=TTML"><span>RAN</span></a></li>
					<li><a href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?center=TD"><span>TRANSMISSION</span></a></li>
					
									</c:if>
				<c:if test = "${center == 'TD'}">
<%-- 					<li ><a href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?center=TTNOC"><span>CORE</span></a></li>
					<li ><a href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?center=TTML"><span>RAN</span></a></li>
 --%>					<li class="ui-tabs-selected"><a href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?center=TD"><span>TRANSMISSION</span></a></li>
			
				
					</c:if>
			
			<div align="right" class="ui_link">
				<table>
					<tr>
						<td style="width: 30px;height:20px; border: 1px; background-color: red;"><a style="background: none;border: 0px;" href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?sdateF=${sdateF}&sdateT=${sdateT}&bscid=${bscid}&cellid=${cellid}&vendor=${vendor}&district=${district}&alarmName=${alarmName}&province=${province}&team=${team}&alarmType=${alarmType}&alarmMappingName=${alarmMappingName}&reload=${reload}&reloadStr=${reloadStr}&statusFinish=&severity=A1&network=${netWork}&statusView=${statusView}&isSoundAlarm=${isSoundAlarm}&statusProcess=${statusProcess}" title="Số lượng cảnh báo A1">${countA1}</a></td>
						<td style="width: 30px;height:20px; border: 1px; background-color: #EFA110;"><a style="background: none;border: 0px;"  href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?sdateF=${sdateF}&sdateT=${sdateT}&bscid=${bscid}&cellid=${cellid}&vendor=${vendor}&district=${district}&alarmName=${alarmName}&province=${province}&team=${team}&alarmType=${alarmType}&alarmMappingName=${alarmMappingName}&reload=${reload}&reloadStr=${reloadStr}&statusFinish=&severity=A2&network=${netWork}&statusView=${statusView}&isSoundAlarm=${isSoundAlarm}&statusProcess=${statusProcess}" title="Số lượng cảnh báo A2">${countA2}</a></td>
						<td style="width: 30px;height:20px; border: 1px; background-color: #EFEF4F;"><a style="background: none;border: 0px;" href="${pageContext.request.contextPath}alarmLog-new/${function}.htm?sdateF=${sdateF}&sdateT=${sdateT}&bscid=${bscid}&cellid=${cellid}&vendor=${vendor}&district=${district}&alarmName=${alarmName}&province=${province}&team=${team}&alarmType=${alarmType}&alarmMappingName=${alarmMappingName}&reload=${reload}&reloadStr=${reloadStr}&statusFinish=&severity=A3&network=${netWork}&statusView=${statusView}&isSoundAlarm=${isSoundAlarm}&statusProcess=${statusProcess}" title="Số lượng cảnh báo A3">${countA3}</a></td>
						<td style="width: 30px;height:20px; border: 1px; background-color: #455FC6;"><a style="background: none;border: 0px;" href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?sdateF=${sdateF}&sdateT=${sdateT}&bscid=${bscid}&cellid=${cellid}&vendor=${vendor}&district=${district}&alarmName=${alarmName}&province=${province}&team=${team}&alarmType=${alarmType}&alarmMappingName=${alarmMappingName}&reload=${reload}&reloadStr=${reloadStr}&statusFinish=&severity=A4&network=${netWork}&statusView=${statusView}&isSoundAlarm=${isSoundAlarm}&statusProcess=${statusProcess}" title="Số lượng cảnh báo A4">${countA4}</a></td>
						<td style="width: 30px;height:20px; border: 1px; background-color: #32CD32;"><a style="background: none;border: 0px;" href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?sdateF=${sdateF}&sdateT=${sdateT}&bscid=${bscid}&cellid=${cellid}&vendor=${vendor}&district=${district}&alarmName=${alarmName}&province=${province}&team=${team}&alarmType=${alarmType}&alarmMappingName=${alarmMappingName}&reload=${reload}&reloadStr=${reloadStr}&statusFinish=Y&severity=&network=${netWork}&statusView=${statusView}&isSoundAlarm=${isSoundAlarm}&statusProcess=${statusProcess}"  title="Số lượng cảnh báo đã kết thúc">${totalFinish}</a></td>
						<td style="width: 30px;height:20px; border: 1px; background-color: #10ceef;"><a style="background: none;border: 0px;" href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?sdateF=${sdateF}&sdateT=${sdateT}&bscid=${bscid}&cellid=${cellid}&vendor=${vendor}&district=${district}&alarmName=${alarmName}&province=${province}&team=${team}&alarmType=${alarmType}&alarmMappingName=${alarmMappingName}&reload=${reload}&reloadStr=${reloadStr}&statusFinish=N&severity=&network=${netWork}&statusView=${statusView}&isSoundAlarm=${isSoundAlarm}&statusProcess=${statusProcess}"  title="Số lượng cảnh báo chưa kết thúc">${totalNonFinish}</a></td>
						<td style="width: 30px;height:20px; border: 1px;"><a style="background: none;border: 0px;" href="${pageContext.request.contextPath}/alarmLog-new/${function}.htm?sdateF=${sdateF}&sdateT=${sdateT}&bscid=${bscid}&cellid=${cellid}&vendor=${vendor}&district=${district}&alarmName=${alarmName}&province=${province}&team=${team}&alarmType=${alarmType}&alarmMappingName=${alarmMappingName}&reload=${reload}&reloadStr=${reloadStr}&statusFinish=&severity=&network=${netWork}&statusView=${statusView}&isSoundAlarm=${isSoundAlarm}&statusProcess=${statusProcess}"  title="Tổng số lượng cảnh báo">${total}</a></td>
					</tr>
				</table>
			</div>
		</ul>
		
	</div>
</div>
<div class="clear"></div>
<div class="ui-tabs-panel">
<form:form commandName="filter" method="post" action="${function}.htm?center=${center}">
<input type="hidden" name="reloadStr" id="reloadStr" value="${reloadStr}">
<input type="hidden" name="statusView" id="statusView" value="${statusView}">
<input type="hidden" name="isSoundAlarm" id="isSoundAlarm" value="${isSoundAlarm}">
	<table >
			<tr>
				<td> Loại thiết bị</td>
				<td>
					<div id='network' ></div>
				</td>
				<c:if  test="${netWork==''||netWork==null}">
					<td>Severity</td>
					<td>
						<div id='severityF' style = "width: 100%"></div>
					</td>
				</c:if>
				<td>Region</td>
				<td>
			        <div id='region'></div>
		        </td>
		       <td style="padding-left: 5px;">Loại thiết bị</td>
				<td>
					<div id='neType' ></div>
				</td> 
			</tr>
			<tr> 
				<td style="width:90px"><fmt:message key="alarmLog.sdateFS"/></td>
				<td style="width:130px">
						<input type ="text"  value="${sdateF}" name="sdateF" id="sdateF" size="17" maxlength="16" style="width:100px">
			   			 <img alt="calendar" title="Click to choose the from date" id="chooseSDateF" style="cursor: pointer;position: absolute;" src="${pageContext.request.contextPath}/images/calendar.png"/>
					<!-- <div id='sdate'></div> -->
				</td>
				
				<td style="padding-left: 5px;width:100px"><fmt:message key="alarmLog.sdateT"/></td>
				<td style="width:130px">
					<input type ="text"  value="${sdateT}" name="sdateT" id="sdateT" size="17" maxlength="16" style="width:100px">
			   		<img alt="calendar" title="Click to choose the to date" id="choosesdateT" style="cursor: pointer; position: absolute;" src="${pageContext.request.contextPath}/images/calendar.png"/>
					<!-- <div id='edate'></div> -->
				</td>
				
				<td style="padding-left: 5px;width:120px"><fmt:message key="alarmLog.province"/></td>
				<td>
					 <input type="text" id="province" name="province" style="width: 100px;"/>
				</td>
				<td style="padding-left: 5px;width: 90px;"><fmt:message key="alarmLog.district"/></td>
				<td >
					 <input type="text" id="district" name="district" style="width: 100px;"/>
				</td>
				
				
			</tr>
			<tr>
				<td style="width:90px"><fmt:message key="alarmLog.edateF"/></td>
				<td style="width:130px">
						<input type ="text"  value="${edateF}" name="edateF" id="edateF" size="17" maxlength="16" style="width:100px">
			   			 <img alt="calendar" title="Click to choose the from date" id="chooseedateF" style="cursor: pointer;position: absolute;" src="${pageContext.request.contextPath}/images/calendar.png"/>
					<!-- <div id='sdate'></div> -->
				</td>
				
				<td style="padding-left: 5px;"><fmt:message key="alarmLog.sdateT"/></td>
				<td style="width:100px">
					<input type ="text"  value="${edateT}" name="edateT" id="edateT" size="17" maxlength="16" style="width:100px">
			   		<img alt="calendar" title="Click to choose the to date" id="chooseedateT" style="cursor: pointer; position: absolute;" src="${pageContext.request.contextPath}/images/calendar.png"/>
					<!-- <div id='edate'></div> -->
				</td>
				<td style="padding-left: 5px;"><fmt:message key="alarmLog.team"/></td>
				<td  >
					 <input type="text" id="team" name="team" style="width: 100px;"/>
				</td>
				<td style="padding-left: 5px;"><fmt:message key="alarmLog.bscid"/></td>
				<td >
					 <input type="text" id="bscid" name="bscid" style="width: 200px;"/>
				</td>
					
			</tr>
			<tr>
				 <td ><fmt:message key="alarmLog.alarmType"/></td>
				<td>
					<div id='alarmType' style = "width: 100%"></div>
				</td>
				<td style="padding-left: 5px;"><fmt:message key="alarmLog.vendor"/></td>
				<td>
					<div id='vendor'></div>
				</td>
				
				<td style="padding-left: 5px;"><fmt:message key="alarmLog.cellTK"/></td>
				<td >
					<input type="text" id="cellid"  name="cellid" style="width: 200px;" />
				</td>
				<td style="padding-left: 5px;" colspan="2"><fmt:message key="alarmLog.duaration"/> 
					<input type="text" id="duaration" name="duaration" style="width: 50px;" value="${duaration}"/> phút
				</td>
			</tr>
			<tr>
			<%-- 		
				<td style="padding-left: 5px;" colspan="2">Refresh 
					<c:choose>
						<c:when test="${reload != null}">
							<input id="reload" name="reload" type="checkbox" checked="checked">
						</c:when>
						<c:otherwise>
							<input id="reload" name="reload" type="checkbox" >
						</c:otherwise>
					</c:choose>
				</td>
				<td style="padding-left: 5px;" colspan="2"><fmt:message key="alarmLog.isMonitor"/>
					<c:choose>
						<c:when test="${statusView == 'Y'}">
							<input id="statusViewC" name="statusViewC" type="checkbox" checked="checked">
						</c:when>
						<c:otherwise>
							<input id="statusViewC" name="statusViewC" type="checkbox" >
						</c:otherwise>
					</c:choose>
				</td>	
				<td style="padding-left: 5px;" colspan="2"><fmt:message key="alarmLog.isSoundAlarm"/>
					<c:choose>
						<c:when test="${isSoundAlarm == 'Y'}">
							<input id="isSoundAlarmC" name="isSoundAlarmC" type="checkbox" checked="checked">
						</c:when>
						<c:otherwise> 
							<input id="isSoundAlarmC" name="isSoundAlarmC" type="checkbox" >
						</c:otherwise>
					</c:choose>
				</td>	
				 --%>
		
				<td style="padding-left: 5px;" colspan="2"></td>
				<td style="padding-left: 5px;" colspan="2"></td>	
				<td style="padding-left: 5px;" colspan="2"></td>
				<td style="padding-left: 5px;" colspan="2">
					<input class="button" type="submit" id="btFilter" name="btFilter" value="<fmt:message key="global.form.timkiem"/>" />
				</td>
			</tr>
		</table>
	</form:form>
</div>
<div class="clear"></div>

	
<%@ include file="/includeJQ/gridAlarmLogNew.jsp" %>
<div id="jqxwindow">
		<div><fmt:message key="global.button.ackRowShift"/></div>
		<div>
		<input type ="hidden" id="idList" name="idList" />
		<input type ="hidden" id="regionF" name="regionF" />
		<input type ="hidden" id="idEndList" name="idEndList"/>
       	<table class="simple2">
       		<tr>
	           <td style="width: 100px"><fmt:message key="vAlAlarmLog.alarmName"/><font color="red">(*)</font></td>
	           <td colspan="5">
	           		<input type ="text" id="alarm" name="alarm" class = "long" maxlength="200"/>
	           	
	           </td>
	      </tr> 
	      <tr>
	      	<td ><fmt:message key="vAlAlarmLog.standardName"/></td>
			<td colspan="5"><div id='standardName' style = "width: 100%"></div></td>
	      </tr>
	   		 <tr>
			           <td><fmt:message key="vAlAlarmLog.NE"/><font color="red">(*)</font></td>
			           <td style="width: 180px" colspan="5">
			           		<div id='operator'></div>
			            </td>
			 </tr>
			 <tr>
			           <td style="width: 100px"><fmt:message key="vAlAlarmLog.system"/></td>
			           <td colspan="3">
							<input type ="text" id="system" name="system"   maxlength="50"/>
						</td>
						<td style="width:80px;">	
	           			<fmt:message key="warning.countSiteF"/>
	          			</td>
	          			<td  style="width:80px;">
	           			<input type ="text" id="countSite" name="countSite" size="5" maxlength="10" style="width:50px;"/>
		    			</td>
	      </tr> 
	       <tr>
			           <td style="width: 100px"><fmt:message key="warning.siteList"/></td>
			           <td colspan="3">
							<input type ="text" id="siteList" name="siteList"   maxlength="50"/>
						</td>
						<td style="width:80px;">	
	           			<fmt:message key="warning.siteQuantity"/>
	          			</td>
	          			<td  style="width:80px;">
	           			<input type ="text" id="siteQuantity" name="siteQuantity" size="5" maxlength="10" style="width:50px;"/>
		    			</td>
	      </tr> 
	      
	      <tr>
	           <td><fmt:message key="vAlAlarmLog.sdate"/><font color="red">(*)</font></td>
	           <td style="width: 200px">
	           		<div id='sdate'></div>
		    	</td>
	           <td style="width:70px;"><fmt:message key="vAlAlarmLog.edate"/></td>
	           <td style="width:200px;">
	           		<input type ="text"  value="${edate}" name="edate" id="edate" size="20" maxlength="19" class = "edate">
		   			 <img alt="calendar" title="Click to choose the start date" id="chooseedate" style="cursor: pointer;" src="${pageContext.request.contextPath}/images/calendar.png"/>
		    	</td>
		    	<td  style="width:120px;"><fmt:message key="vAlAlarmLog.mdSdate"/></td>
	           <td >
	           		<input type ="text"  value="${mdSdate}" name="mdSdate" id="mdSdate" size="20" maxlength="16" class = "edate">
		   			 <img alt="calendar" title="Click to choose the start date" id="choosemdSdate" style="cursor: pointer;" src="${pageContext.request.contextPath}/images/calendar.png"/>
		    		<font color="red">${errormdSdate}<form:errors path="mdSdate"/></font>
		    	</td>
		    	
	      </tr> 
	      <tr>
		      	<td><fmt:message key="vAlAlarmLog.dept"/></td>
		       	<td><div id='dept'></div></td>
		      	<td><fmt:message key="vAlAlarmLog.teamProcess"/></td>
		       	<td><div id='teamProcess'></div></td>
		       	<td><fmt:message key="vAlAlarmLog.groups"/></td>
		       	<td>
		       	<input type ="text" id="groups" name="groups"   maxlength="50"/></td>
		       	
	       </tr>
	        <tr>
	        <td><fmt:message key="vAlAlarmLog.userExcute"/></td>
	           <td style="border:0;">
	           		<div id='cbUserProcess'></div><input type ="hidden" id="userProcess" name="userProcess"/>
	           </td>
	        	<td ><fmt:message key="vAlAlarmLog.alarmType"/></td>
				<td><div id='alarmTypeF'></div></td>
	           <td><fmt:message key="vAlAlarmLog.causebySystem"/></td>
	           <td>
	      			<div id='causebySystem' style = "width: 100%"></div>
		    	</td>
		    </tr>
		    <tr>
	           <td><fmt:message key="vAlAlarmLog.contactTime"/></td>
           <td >
           		<input type ="text"  value="${contactTime}" name="contactTime" id="contactTime" size="20" maxlength="16" class = "contactTime">
	   			 <img alt="calendar" title="Click to choose the contact time" id="choosecontactTime" style="cursor: pointer;" src="${pageContext.request.contextPath}/images/calendar.png"/>
	    		<font color="red">${errorcontactTime}<form:errors path="contactTime"/></font>
	    	</td>
	    	<td><fmt:message key="vAlAlarmLog.actionProcess"/></td>
           <td > 
          		 <div id='actionProcess'></div>
           	<%-- <form:input path="actionProcess"  class = "long" rows="10" maxlength="900"/> --%>
          </td>
          <td><fmt:message key="vAlAlarmLog.leaseLine"/></td>
	       <td> 
	         	<div id='leaseLine' style = "width: 100%"></div>
	        </td>
	       </tr>
		    <tr>
	           <td><fmt:message key="vAlAlarmLog.causeby"/></td>
	           <td  colspan="5"> 
	           		<input type ="text" id="causeby" name="causeby" maxlength="250"  class = "long" />
	          </td>
	       </tr>
	        <tr>
	           <td><fmt:message key="vAlAlarmLog.alarmInfo"/></td>
	           <td colspan="5"> 
	           	<input type ="text"  id="alarmInfoF"  name ="alarmInfoF" class = "long"  maxlength="900"/>
	          </td>
	       </tr>
	     
       		<tr>
       			<td></td>
       			<td colspan="5">
       				<input type="button" class="button" value="Save" id="btSave" />
                    <input type="button" class="button" value="Cancel" id="btCancel" />
                </td>
       		</tr>
       </table>
     </div>
</div>

<!-- tao su co  -->
<div id="jqxwindowCreateTrouble">
		<div><fmt:message key="global.button.createTrouble"/></div>
		<div>
		<input type ="hidden" id="idList" name="idList" />
		<input type ="hidden" id="regionF" name="regionF" />
		<input type ="hidden" id="idEndList" name="idEndList"/>
		<input type ="hidden" id="canhBao" name="canhBao"/>
		
       	<table class="simple2">
       		<tr>
	           <td style = "width:150px;"> Tên sự cố </td>
		       	<td> 
	           		<input type ="text" id="trouble" name="trouble" maxlength="50" size = "30" style = "width: 90%"/>
	            </td>
	   			<td style = "width:150px;"> Loại sự cố <font color="red">(*)</font></td>
	            <td> 
	           		<select id="troubleType" name="troubleType" style="width: 200px;">
			       		<c:forEach var="items" items="${troubleTypelist}">
			                   <c:choose>
			                    <c:when test="${items.name == troubleType}">
			                        <option value="${items.name}" selected="selected">${items.name}</option>
			                    </c:when>
			                    <c:otherwise>
			                        <option value="${items.name}">${items.name}</option>
			                    </c:otherwise>
			                   </c:choose>
			          </c:forEach>
			      </select>
	            </td>
	        </tr> 
	   		 <tr>
	           <td>Thiết bị ảnh hưởng</td>
	           <td>
	           		<input type ="text" id="effectNe" name="effectNe" maxlength="100" size = "30"/> 
	            </td>
	            <td>Hệ thống ảnh hưởng</td>
			 	<td > 
			 		<select id="effectSystem" name="effectSystem" style="width: 200px;">
			       		<option value="">--Tất cả--</option>
			             <c:forEach var="items" items="${effectSystemlist}">
			                   <c:choose>
			                    <c:when test="${items.name == effectSystem}">
			                        <option value="${items.name}" selected="selected">${items.value}</option>
			                    </c:when>
			                    <c:otherwise>
			                        <option value="${items.name}">${items.value}</option>
			                    </c:otherwise>
			                   </c:choose>
			          </c:forEach>
			      	</select>
	           		
	            </td>  
			 </tr>
			 <tr>
			   <td> Đơn vị </td>
		       	<td> 
	           		<div  id="donVi"> </div>
	            </td>		
	            <td > Đơn vị ảnh hưởng <font color="red">(*)</font> </td>
	       	  	<td> 
	           		<select id="donViAnhHuong" name="donViAnhHuong" style="width: 200px;">
			       		<option value="">--Tất cả--</option>
			             <c:forEach var="items" items="${donViAnhHuonglist}">
			                   <c:choose>
			                    <c:when test="${items.deptCode == donViAnhHuong}">
			                        <option value="${items.deptCode}" selected="selected">${items.deptName}</option>
			                    </c:when>
			                    <c:otherwise>
			                        <option value="${items.deptCode}">${items.deptName}</option>
			                    </c:otherwise>
			                   </c:choose>
			          </c:forEach>
			      </select>
	            </td> 	 
	        </tr>

	      	 <tr>  
	           <td><fmt:message key="vAlAlarmLog.sdate"/></td>
	            <td >
	           		<input type ="text"  name="sdate" id="createTroubleSdate" size="20" maxlength="19" class = "sdate"><font color="red">(*)</font>
		   			 <img alt="calendar" title="Click to choose the start date" id="chooseCreateTroubleSdate" style="cursor: pointer;" src="${pageContext.request.contextPath}/images/calendar.png"/>
		    	</td>	 
	           <td ><fmt:message key="vAlAlarmLog.edate"/></td>
	           <td >
	           		<input type ="text"  name="edate" id="createTroubleEdate" size="20" maxlength="19" class = "edate">
		   			 <img alt="calendar" title="Click to choose the end date" id="chooseCreateTroubleEdate" style="cursor: pointer;" src="${pageContext.request.contextPath}/images/calendar.png"/>
		    	</td>	
		    	  	
	       </tr> 
	       <tr>  
	            <td>Ảnh hưởng</td>
			 	<td colspan = "3"> 
	           		<input type ="text" id="effect" name="effect" maxlength="200" style="width: 90%"/>
	            </td>
	       	 	
	         </tr> 
	       <tr>
		   		<td> Nguyên nhân </td>
		   		<td colspan="3"> 
	           		<input type ="text" id="reason" name="reason" maxlength="300" style="width: 90%"/>
	            </td>
	       </tr>
	       <tr>
		   		<td>Giải pháp</td>
		   		<td colspan="3"> 
	           		<input type ="text" id="method" name="method" maxlength="300" style="width: 90%"/>
	            </td>
	       </tr>
	       <tr>
		   		<td>Kết quả</td>
		   		<td colspan="3"> 
	           		<input type ="text" id="result" name="result" maxlength="300" style="width: 90%"/>
	            </td>
	       </tr>
       		<tr>
       			<td></td>
       			<td colspan="3">
       				<input type="button" class="button" value="Save" id="createTroubleBtSave" />
                    <input type="button" class="button" value="Cancel" id="createTroubleBtCancel" />
                </td>
       		</tr>
       </table>
     </div>
</div>
<div class="clear"></div>
<div id="jqxAlert">
	<div ><b style="color: red"><fmt:message key="global.button.jqxwindowAlert"/></b></div>
		<div>
		<table style="width:100%">
			<tr>
				<td align="left">
					<audio id='playerAlert' src='${pageContext.request.contextPath}/sound/sounds-alert.mp3' controls loop></audio>
				</td>
				<td  align="right">
				
					<button value="CancelAlert" id="btCancelAlert">CancelAlert</button>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<div id="gridAlert"></div> 
					<div id='menuAlert'>
			            <ul>
				            <li><fmt:message key="global.button.exportExcel"/></li>
				        </ul>
					</div> 
				</td>
			</tr>
       	</table>
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


Calendar.setup({
    inputField		:	"edateF",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M",   	// format of the input field
    button			:   "chooseedateF",  	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 

Calendar.setup({
    inputField		:	"edateT",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M",   	// format of the input field
    button			:   "chooseedateT",   	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 


Calendar.setup({
    inputField		:	"edate",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M:%S",   	// format of the input field
    button			:   "chooseedate",   	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 
Calendar.setup({
    inputField		:	"mdSdate",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M:%S",   	// format of the input field
    button			:   "choosemdSdate",   	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 

Calendar.setup({
    inputField		:	"contactTime",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M:%S",   	// format of the input field
    button			:   "choosecontactTime",  	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
});

Calendar.setup({
    inputField		:	"createTroubleSdate",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M:%S",   	// format of the input field
    button			:   "chooseCreateTroubleSdate",   	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 

Calendar.setup({
    inputField		:	"createTroubleEdate",	// id of the input field
    ifFormat		:	"%d/%m/%Y %H:%M:%S",   	// format of the input field
    button			:   "chooseCreateTroubleEdate",   	// trigger for the calendar (button ID)
    showsTime		:	true,
    singleClick		:   false					// double-click mode
}); 
</script>
<script type="text/javascript">
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
	
		$('#reloadStr').val('Y');
		var timeLoad = 180;
		
		setTimeout(function(){
	
			var func = "<c:out value='${function}'/>";
            var center ="<c:out value='${center}'/>";
        	window.location = func+'.htm?center='+center+'&sdateF='+$('#sdateF').val()+'&sdateT='+$('#sdateT').val()+'&bscid='+$('#bscid').val()+'&cellid='+$('#cellid').val()+'&vendor='+$('#vendor').val()+'&district='+$('#district').val()+'&alarmName='+$('#alarmName').val()+'&province='+$('#province').val()+'&team='+$('#team').val()+'&alarmType='+$('#alarmType').val()+'&alarmMappingName='+$('#alarmMappingName').val()+'&reload='+$('#reload').val()+'&reloadStr='+$('#reloadStr').val()+'&statusFinish='+$('#statusFinish').val()+'&severity='+$('#severity').val()+'&network='+$('#network').val()+'&statusView='+$('#statusView').val()+'&isSoundAlarm='+$('#isSoundAlarm').val()+'&statusProcess='+$('#statusProcess').val();   
        	
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
		var theme =  getTheme();
		var reload = $("#reload").val();
		if (reload=='Y') {
			setTimeout(function(){
				$('#filter').submit();
			}, 
			10000);
			$('#reloadStr').val('Y');
		}
		
		${gridAlert}
		   // create jqxWindow.
	    $("#jqxwindow").jqxWindow({ resizable: true, theme: theme, autoOpen: false, minWidth: 1000, maxWidth: 2000, minHeight: 430,isModal: true});
		$("#jqxwindowCreateTrouble").jqxWindow({ resizable: false, theme: theme, autoOpen: false, minWidth: 800, maxWidth: 2000, minHeight: 350,isModal: true});

	    // create jqxWindowAlert.
	    $("#jqxAlert").jqxWindow({ resizable: true, theme: theme, autoOpen: false, minWidth: 1000, maxWidth: 2000, minHeight: 430,maxHeight:1000, isModal: false,showCollapseButton: true});
	    var isSoundAlarm = $("#isSoundAlarm").val();
	  	if (isSoundAlarm=='Y') {
    		  var countAlert = "<c:out value='${countAlert}'/>";
	    	if (countAlert > 0){
	    	 	 $("#jqxAlert").jqxWindow('open');
	    		document.getElementById('playerAlert').play();
	    		// handle context menu clicks.
    			$("#menuAlert").on('itemclick', function (event) {
    			    var args = event.args;
    				if ($.trim($(args).text()) == '<fmt:message key="global.button.exportExcel"/>')  {
    			    	$("#gridAlert").jqxGrid('exportdata', 'xlsx', 'New Alarm');
    			    };
    			});
	    	};
	    };
	    $('#btCancelAlert').jqxButton({ theme: theme }); 
	    $("#btCancelAlert").click(function (event) {
	    	var idList = "<c:out value='${idAlert}'/>";
	    	var begin=0;
	    	var end=0;
	    	var count = 0;
	    	if (idList.length>0){
				for (var i=0; i < idList.length; i++)
			    {
			        if (idList.charAt(i) == ',')
			        {
			             count++;
			             if (count> 0 && count%100==0){
					        	end = i;
					        	var idtemp=idList.substring(begin,end);
					        	//alert('begin:'+begin+'-end:'+end+'item:'+idtemp);
					        	$.getJSON("${pageContext.request.contextPath}/alarmLog-new/updateStatusAlerted.htm",{idList:idtemp,type:"<c:out value='${function}'/>"}, function(j){ });
					        	begin = i+1;
					      }
			        }
			        
			    }
				if (begin > 0 && begin<idList.length){
					var idtemp=idList.substring(begin,idList.length);
					//alert('begin:'+begin+'-end:'+end+'item:'+idtemp);
					$.getJSON("${pageContext.request.contextPath}/alarmLog-new/updateStatusAlerted.htm",{idList:idtemp,type:"<c:out value='${function}'/>"}, function(j){ });
				}
	    	}
			$("#jqxAlert").jqxWindow('close');
	    });
	    $('#jqxAlert').on('close', function (event) { document.getElementById('playerAlert').pause(); }); 
	    
		$('#btFilter').jqxButton({ theme: theme });
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
    	$("#alarmInfo").jqxInput({ height: 20, width: 200,  theme: theme});
    	 var alarmInfo =  "<c:out value='${alarmInfo}'/>";
  	   // alert(bscid);
          if(alarmInfo!="")
  			$('#alarmInfo').val(alarmInfo);
	    //Input BSC
	    ${bscList}
	    $("#bscid").jqxInput({ height: 20, width: 200, theme: theme,
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
	 	$("#cellid").jqxInput({ height: 20, width: 200, theme: theme,
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
		$("#district").jqxInput({ height: 20, width: 200, theme: theme,
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
        $("#vendor").jqxComboBox({ source: dataAdapterVendor, displayMember: "value", valueMember: "name", width: 120,height: '20px',itemHeight: 30,theme: theme,autoDropDownHeight: true,autoOpen: true });
        var vendor =  "<c:out value='${vendor}'/>";
        if(vendor=="")
			$('#vendor').val('');
		else
			$('#vendor').val(vendor);
      
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
        $("#alarmType").jqxComboBox({ source: dataAdapteralarmType, displayMember: "alarmType", valueMember: "alarmType", width: 120, height: 20, theme: theme,autoDropDownHeight: true,autoOpen: true  });
        var alarmType =  "<c:out value='${alarmType}'/>";
        if(alarmType=="")
			$('#alarmType').val('');
		else
			$('#alarmType').val(alarmType);
	
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
		
	    var center =  "<c:out value='${center}'/>";
	    if (center == 'TTML'){
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
		    $("#alarmName").jqxComboBox({ source: dataAdapterAlarmName, displayMember: "blockValue", valueMember: "blockValue", width: 200, height: 20, theme: theme,autoOpen: true  });
		    var alarmName =  "<c:out value='${alarmName}'/>";
		    if(alarmName=="")
				$('#alarmName').val('');
			else
				$('#alarmName').val(alarmName);
	  //Create a jqxComboBox alarmName
		var urlalarmMappingName = "${pageContext.request.contextPath}/ajax/getAlarmMappingName.htm?vendor="+vendorT+"&alarmType="+alarmTypeT+"&network="+networkT;
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
		$("#alarmMappingName").jqxDropDownList({ source: dataAdapteralarmMappingName,checkboxes: true, displayMember: "alarmMappingName", valueMember: "alarmMappingName", width: 200, height: 20, theme: theme,enableHover: true });
		 var cbalarmMappingName =  "<c:out value='${alarmMappingName}'/>";
		// alert(dept);
		if(cbalarmMappingName=="")
			$('#alarmMappingName').val('Choose');
		else
		{
			var alarmMappingVar = cbalarmMappingName.split(",");
			if (alarmMappingVar != null) {
				for (var i=0; i<alarmMappingVar.length; i++) {
					$("#alarmMappingName").jqxDropDownList('checkItem', alarmMappingVar[i] ); 
				}
			}
		}    
		
		// Create a jqxComboBox choose not alarmMappingName
		$("#unAlarmMappingName").jqxDropDownList({ source: dataAdapteralarmMappingName,checkboxes: true, displayMember: "alarmMappingName", valueMember: "alarmMappingName", width: 200, height: 20, theme: theme,enableHover: true });
		var unAlarmMappingName =  "<c:out value='${unAlarmMappingName}'/>";
		// alert(dept);
		if(unAlarmMappingName=="")
			$('#unAlarmMappingName').val('Choose');
		else
		{
			var itemVar = unAlarmMappingName.split(",");
			if (itemVar != null) {
				for (var i=0; i<itemVar.length; i++) {
					$("#unAlarmMappingName").jqxDropDownList('checkItem', itemVar[i] ); 
				}
			}
		};
	    }
		//Input team
	    ${teamList}
	    $("#team").jqxInput({ height: 20, width: 200, theme: theme,
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
	    $("#province").jqxInput({ height: 20, width: 200, theme: theme,
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
}); // end document.ready
	
	var theme =  getTheme();
	$("#vendor").change(function(){
		if ($("#vendor").val() != null && $("#vendor").val() != '') {
			var alarmTypeT = $('#alarmType').val();
			if (alarmTypeT=='')
			{
				alarmTypeT='';
			}
			var networkT = "<c:out value='${netWork}'/>";
			var username = "<c:out value='${username}'/>";
			//bsc change
     	   $.getJSON("${pageContext.request.contextPath}/ajax/getBSCByNetwork.htm",{network:networkT,username:username,vendor:$("#vendor").val()}, function(j){
     		   var BSCList=[];
     		   BSCList =j;
     		  $("#bscid").jqxInput({height: 20, width: 200, theme: theme,
     		        source: function (query, response) {
     		            var item = query.split(/,\s*/).pop();
     		            // update the search query.
     		            $("#bscid").jqxInput({ query: item });
     		            response(BSCList);
     		        },
     		        renderer: renderer
     		    });
     	   });
			
		    var center =  "<c:out value='${center}'/>";
		    if (center == 'TTML'){
		    	//alarmname change
				var urlAlarmName = "${pageContext.request.contextPath}/ajax/getAlarmName.htm?vendor="+$("#vendor").val()+"&alarmType="+alarmTypeT+"&network="+networkT;
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
			    $("#alarmName").jqxComboBox({ source: dataAdapterAlarmName, displayMember: "blockValue", valueMember: "blockValue", width: 200, height: 20, theme: theme,autoOpen: true });
			    var alarmName =  "<c:out value='${alarmName}'/>";
			    if(alarmName=="")
					$('#alarmName').val('');
				else
					$('#alarmName').val(alarmName);
		    //alarmname change
			var urlalarmMappingName = "${pageContext.request.contextPath}/ajax/getAlarmMappingName.htm?vendor="+$("#vendor").val()+"&alarmType="+alarmTypeT+"&network="+networkT;
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
			$("#alarmMappingName").jqxDropDownList({ source: dataAdapteralarmMappingName,checkboxes: true, displayMember: "alarmMappingName", valueMember: "alarmMappingName", width: 200, height: 20, theme: theme,enableHover: true });
			// Create a jqxComboBox choose not alarmMappingName
			$("#unAlarmMappingName").jqxDropDownList({ source: dataAdapteralarmMappingName,checkboxes: true, displayMember: "alarmMappingName", valueMember: "alarmMappingName", width: 200, height: 20, theme: theme,enableHover: true });
		    }
		}
	});	
	
	$("#alarmType").change(function(){
		if ($("#alarmType").val() != null && $("#alarmType").val() != '') {
			var vendorT = $('#vendor').val();
			if (vendorT=='')
			{
				vendorT='';
			}
			var networkT = "<c:out value='${netWork}'/>";
			
		    var center =  "<c:out value='${center}'/>";
		    if (center == 'TTML'){
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
			    $("#alarmName").jqxComboBox({ source: dataAdapterAlarmName, displayMember: "blockValue", valueMember: "blockValue", width: 200, height: 20, theme: theme,autoOpen: true });
			    var alarmName =  "<c:out value='${alarmName}'/>";
			    if(alarmName=="")
					$('#alarmName').val('');
				else
					$('#alarmName').val(alarmName);
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
			$("#alarmMappingName").jqxDropDownList({ source: dataAdapteralarmMappingName,checkboxes: true, displayMember: "alarmMappingName", valueMember: "alarmMappingName", width: 200, height: 20, theme: theme,enableHover: true });
			// Create a jqxComboBox choose not alarmMappingName
			$("#unAlarmMappingName").jqxDropDownList({ source: dataAdapteralarmMappingName,checkboxes: true, displayMember: "alarmMappingName", valueMember: "alarmMappingName", width: 200, height: 20, theme: theme,enableHover: true });
		    }
			
		}
		
	   
	});	
	  // handle context menu clicks.
    $("#Menu").on('itemclick', function (event) {
        var args = event.args;
        
        if ($.trim($(args).text()) == '<fmt:message key="global.button.editSelected"/>') {
       	  	var rowindex = $("#jqxgrid").jqxGrid('getselectedrowindex');
            var row = $("#jqxgrid").jqxGrid('getrowdata', rowindex);
        	window.location = 'form.htm?id='+row.id+'&center='+ "<c:out value='${center}'/>"+'&function='+"<c:out value='${function}'/>";   
        }
        if ($.trim($(args).text()) == '<fmt:message key="global.button.deleteMultiSelected"/>')  {
        	var answer = confirm ('<fmt:message key="messsage.confirm.delete"/>');
        	if (answer)
        	{
				var selectedrowindexes = $('#jqxgrid').jqxGrid('getselectedrowindexes'); 
        		var idList="";
        		var cond="";
        		//alert(selectedrowindexes);
        		//var rowIndexList = selectedrowindexes.split(",");
        		if (selectedrowindexes != null) {
        			for (var i=0; i<selectedrowindexes.length; i++) {
        				var row = $("#jqxgrid").jqxGrid('getrowdata', selectedrowindexes[i]);
        				idList+=cond+row.id;
        				cond=",";
        			}
        			// alert(idList);
        			window.location = 'delete.htm?idList='+idList+'&center='+"<c:out value='${center}'/>"+'&function='+"<c:out value='${function}'/>";
        		}
        		
        	}
          
        }
        if ($.trim($(args).text()) == '<fmt:message key="global.button.ackRow"/>')  {
        	var answer = confirm ('<fmt:message key="messsage.confirm.ackRow"/>');
        	if (answer)
        	{
				var selectedrowindexes = $('#jqxgrid').jqxGrid('getselectedrowindexes'); 
        		var idList="";
        		var cond="";
        		var idEndList="";
        		var condE="";
        		if (selectedrowindexes != null) {
        			for (var i=0; i<selectedrowindexes.length; i++) {
        				var row = $("#jqxgrid").jqxGrid('getrowdata', selectedrowindexes[i]);
        				//alert(row.edate);
        				if (row.edate==null||row.edate=='')
        					{
        						//alert(row.sdate);
		        				idList+=cond+row.id;
		        				cond=",";
        					}
        				else
        					{
        						idEndList+=condE+row.id;
	        					condE=",";
        					}
        			}	
        			//window.location = 'ack.htm?idList='+idList+'&idEndList='+idEndList+'&network='+"<c:out value='${netWork}'/>"+'&functionA='+"<c:out value='${function}'/>"+'&inshift=N'+'&etime='+$("#edate").val();
        			
        			$.getJSON("${pageContext.request.contextPath}/alarmLog/ack.htm",{idList:idList,idEndList:idEndList,netWork:"<c:out value='${netWork}'/>",functionA:"<c:out value='${function}'/>",inshift:"N",etime:$("#edate").val(),region:$("#region").val()}, function(j){
        	    		
	    				 if (j==1)
	    					 {
	    					 	alert("Xác nhận thành công!");
	    					 }
	    				 else
	    					 {
	    					 	alert("Xác nhận không thành công!");
	    					 }
        	     	   });
        	    //	window.location = 'ack.htm?idList='+idList+'&idEndList='+idEndList+'&network='+"<c:out value='${netWork}'/>"+'&function='+"<c:out value='${function}'/>"+'&inshift=Y'+'&etime='+$("#edate").val();
        	    	
	    		}
        			
				}
    		} 
        if ($.trim($(args).text()) == '<fmt:message key="global.button.unackRow"/>')  {
        	var answer = confirm ('<fmt:message key="messsage.confirm.unackRow"/>');
        	if (answer)
        	{
				var selectedrowindexes = $('#jqxgrid').jqxGrid('getselectedrowindexes'); 
        		var idList="";
        		var cond="";
        		var idEndList="";
        		var condE="";
        		if (selectedrowindexes != null) {
        			for (var i=0; i<selectedrowindexes.length; i++) {
        				var row = $("#jqxgrid").jqxGrid('getrowdata', selectedrowindexes[i]);
        				
       					//alert(row.edate);
       					if (row.ackTime!=null&&row.ackTime!='')
       					{
       						
       						if (row.ackTime.getTime()== row.edate.getTime())
       							{
    		        				idList+=cond+row.id;
    		        				cond=",";
       							}
       						else
       							{
        							idEndList+=condE+row.id;
    		       					condE=",";
       							}
       						
       					}
        			}
        			window.location = 'unack.htm?idList='+idList+'&idEndList='+idEndList+'&network='+"<c:out value='${netWork}'/>"+'&function='+"<c:out value='${function}'/>";
	
				}
    		} 
        }
        if ($.trim($(args).text()) == '<fmt:message key="global.button.ackRowShift"/>')  {
				var selectedrowindexes = $('#jqxgrid').jqxGrid('getselectedrowindexes'); 
				var idList="";
        		var cond="";
        		var idEndList="";
        		var condE="";
        		var alarm="";
        		var operator="";
        		var system="";
        		var sdatemin="";
        		var edateMax="";
        		var causebySys="";
        		var alarmType="";
        		var numsite=0;
        		var dept="";
        		var ct="";
        		var sdateminStr="";
        		var edatemaxStr="";
        		var mdSdatemin="";
        		var mdSdateminStr="";
        		var sdates=[];
        		var edates=[];
        		var con1='';
        		var con2='';
        		var con3='';
        		var con4='';
        		var con5='';
        		var con6='';
        		var team='';
        		var groups='';
        		var siteList="";
        		var countSite=0;
        		var region='';
        		
        		if (selectedrowindexes != null) {
        			for (var i=0; i<selectedrowindexes.length; i++) {
        				var row = $("#jqxgrid").jqxGrid('getrowdata', selectedrowindexes[i]);
        				 $("#row"+selectedrowindexes[i]+"jqxgrid").addClass("shiftId");
        				var shiftid=row.shiftId;
        				if (shiftid==null||shiftid=='null')
        				{
	        				var op= row.ne;
	        				var de= '';
	        				var alarmid='';
	        				var te='';
	        				var gru='';
	        				if (row.dept!=null &&row.dept!='null')
	       					{
	       						de=row.dept;
	       					}
	        				if (row.groups!=null &&row.groups!='null')
	       					{
	        					gru=row.groups;
	       					}
	        				if (row.team!=null &&row.team!='null')
	       					{
	        					te=row.team;
	       					}
	        				if (row.alarmMappingName!=null &&row.alarmMappingName!='null')
	       					{
	        					alarmid=row.alarmMappingName;
	       					}
	        				else
	        				{
	        					alarmid=row.alarmName;
	        				}
	        				var systemChose= "";
	        				var siteChose="";
	        				if (row.cellid!=null&&row.cellid!='null')
	    					{
	        					systemChose=row.cellid;
	    					}
	    					else
	    					{
	    						if (row.site!=null&&row.site!='null')
	        					{
	    							systemChose=row.site;
	        					}
	    					}
	        				if (systemChose!='' && systemChose.length>=6)
							{
	        					siteChose = systemChose.substr(0,6);
							}
	        				if (alarm!='')
	        				{
	        					 
	        					if(alarmid==alarm)
	       						{
									//them devie, tang coutsite
									if (systemChose!=''&&system.indexOf(systemChose)==-1)
									{
										system+=con2+systemChose;
										con2=',';
										numsite++;
									}
									//them siteList
									if (siteChose!=''&&siteList.indexOf(siteChose)==-1)
									{
										siteList+=con5+siteChose;
										con5=',';
										countSite++;
									}
									//them ne
									if (de!=''&&dept.indexOf(de)==-1)
									{
										dept+=con3+de;
										con3=',';
									}
									
									//them gru
									if (gru!=''&&groups.indexOf(gru)==-1)
									{
										groups+=con6+gru;
										con6=',';
									}
									//them ne
									if (te!=''&&team.indexOf(te)==-1)
									{
										team+=con4+te;
										con4=',';
									}
	        						//lay min sdate
	        						if (row.sdate!=null&&row.sdate!='null'&&row.sdate<sdatemin)
			    					{
	        							sdatemin = row.sdate;
	        						}
	        						if (row.mdSdate!=null&&row.mdSdate!='null'&&row.mdSdate<mdSdatemin)
			    					{
	        							mdSdatemin = row.mdSdate;
	        						}
	        						if (row.edate!=null&&row.edate!='null'&&row.edate>edateMax)
			    					{
	        							edateMax=row.edate;
			    					}
	       						}
	        					else
	       						{
	        						alert("Bạn chỉ được chọn các cảnh báo cùng Alarm Name Mapping!");
	        						ct="N";
	        						break;
	        					}
	        					
	        				}
	        				else
	       					{
	        					operator=op;
	        					dept=de;
	        					team = te;
	        					groups= gru;
	        					alarm = alarmid;
	        					/* if (row.alarmMappingName!=null&&row.alarmMappingName!='null')
		    					{
	        						alarm = alarmid;
		    					} */
	        					
	        					system=systemChose;
	        					if(system!='')
        						{
        							con2=',';
        						}
	        					if (systemChose!='' && systemChose.length>=6)
								{
	        						siteList = systemChose.substr(0,6);
		        					con5=',';
		        					countSite=1;
								}
	        					if(operator!='')
        						{
        							con1=',';
        						}
	        					if(dept!='')
        						{
        							con3=',';
        						}
	        					if(team!='')
        						{
        							con4=',';
        						}
	        					if(groups!='')
        						{
	        						con6=',';
        						}
	        					causebySys= row.causebySys;
	        					alarmType= row.alarmType;
	        					region = row.region;
	        					if (row.sdate!=null&&row.sdate!='null')
		    					{
	        						sdatemin = row.sdate;
		    					}
	        					if (row.mdSdate!=null&&row.mdSdate!='null')
		    					{
	        						mdSdatemin = row.mdSdate;
		    					}
        						if (row.edate!=null&&row.edate!='null')
		    					{
        							edateMax=row.edate;
		    					}
	        					if(system!='')
	        						{
	        							numsite=1;
	        						}
	        					
	        					con=",";
	       					}
	        				if (row.edate==null||row.edate=='')
	        					{
	        						//alert(row.edate);
			        				idList+=cond+row.id;
			        				cond=",";
	        					}
	        				else
	    					{
	    						idEndList+=condE+row.id;
	        					condE=",";
	    					}
        				}
        				else
   						{
    						alert("Tồn tại cảnh báo trong danh sách đã được đua vào ca trực!");
    						ct="N";
    						break;
   						}
        				
        			}
        			if(ct!='N' && ((idList!=null&& idList!='')||(idEndList!=null&&idEndList!='')))
    				{
        				
    					if (edateMax!=null &&edateMax!='')
   						{
    						edatemaxStr=dateToYMDHMS(new Date(edateMax));
   						}
    					if (sdatemin!=null &&sdatemin!='')
						{
    						sdateminStr=dateToYMDHMS(new Date(sdatemin));
						}
    					
    					if (mdSdatemin!=null &&mdSdatemin!='')
						{
    						mdSdateminStr=dateToYMDHMS(new Date(mdSdatemin));
						}
    					$("#alarm").val(alarm);
        				$("#operator").text(operator);
        				$("#countSite").val(numsite);
        				$("#sdate").text(sdateminStr);
        				$("#edate").val(edatemaxStr);
        				$("#dept").text(dept);
        				$("#groups").text(groups);
        				$("#teamProcess").text(team);
        				$("#causebySystem").val(causebySys);
        				$("#alarmTypeF").val(alarmType);
        				$("#mdSdate").val(mdSdateminStr);
        				$("#siteList").val(siteList);
        				$("#siteQuantity").val(countSite);
        				$("#regionF").val(region);
        				//LOAD SYSTEM GOI NHO THEO OPERATOR
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
   					 $.getJSON("${pageContext.request.contextPath}/ajax/getSystemByOperator.htm",{operator: operator,warningTp:alarmType}, function(j){

   			       			var systemList = new Array();
   			       			for (var i = 0; i < j.length; i++) {
   			       				systemList.push(j[i] ) ;
   			       			}
   			       			
   			       			$("#system").jqxInput({placeHolder: "Enter system", height: 25, width: '100%', minLength: 0, maxLength: 100, theme: theme,
   			       				source: function (query, response) {
   			   		           var item = query.split(/,\s*/).pop();
   			   		           // update the search query.
   			   		           $("#system").jqxInput({ query: item });
   			   		           response(systemList);
   				   		       },
   				   		       renderer: renderer
   			   		    
   			   		   		});
   			       			$("#system").val(system);	
   			       		});
        				
        				urlUser =  "${pageContext.request.contextPath}/ajax/getUserByDeparment.htm?dept="+dept+"&team="+team;
        				// prepare the data
        			    var sourceUser =
        			    {
        			        datatype: "json",
        			        url: urlUser,
        			        datafields: [
        			                     { name: 'username'},
        			                     { name: 'fullname'}
        			                 ],
        			        async: false
        			    };
        			    var dataAdapterUser = new $.jqx.dataAdapter(sourceUser);
        			    $("#cbUserProcess").jqxDropDownList({source: dataAdapterUser, displayMember: "username", valueMember: "username",checkboxes: true, width: 160, height: 25, theme: theme,autoOpen: true,enableHover: true });           
        			    $("#idList").val(idList);
            			$("#idEndList").val(idEndList);
        				$("#jqxwindow").jqxWindow('open');
    				}
    				else
    				{
    					if (ct!='N')
    						{
    							alert("Tất cả các cảnh báo lựa chọn đã được đưa vào ca trực");}
    				}
    				
        		}
    		
        }
     
        if ($.trim($(args).text()) == '<fmt:message key="global.button.exportExcel"/>')  {
        	alert ("thuonght");
        	var funtion = "<c:out value='${function}'/>";
        	 window.open('${pageContext.request.contextPath}/exportExcel-new/alarmLog.htm?sdateF='+"<c:out value='${sdateF}'/>"+
	        	'&sdateT='+"<c:out value='${sdateT}'/>"+
	        	'&edateF='+"<c:out value='${edateF}'/>"+
	        	'&edateT='+"<c:out value='${edateT}'/>"+
	        	 '&bscid='+"<c:out value='${bscid}'/>"+
	        	 '&cellid='+"<c:out value='${cellid}'/>"+
	        	 '&vendor='+"<c:out value='${vendor}'/>"+
	        	 '&district='+"<c:out value='${district}'/>"+
	        	 '&alarmName='+"<c:out value='${alarmName}'/>"+
	        	 '&province='+"<c:out value='${province}'/>"+
	        	 '&team='+"<c:out value='${team}'/>"+
	        	 '&alarmType='+"<c:out value='${alarmType}'/>"+
	        	 '&alarmMappingName='+"<c:out value='${alarmMappingName}'/>"+
	        	 '&statusFinish='+"<c:out value='${statusFinish}'/>"+
	        	 '&severity='+"<c:out value='${severity}'/>"+
	        	 '&network='+$("#network").val()+
	        	 '&function='+funtion+
	        	 '&statusView='+"<c:out value='${statusView}'/>"+
	        	 '&alarmInfo='+"<c:out value='${alarmInfo}'/>"+
	        	 '&duaration='+"<c:out value='${duaration}'/>"+
	        	 '&region='+"<c:out value='${region}'/>"+
	        	 '&unAlarmMappingName='+"<c:out value='${unAlarmMappingName}'/>"+
	        	 '&severityF='+"<c:out value='${severityF}'/>"+
	        	 '&statusProcess=' + '<c:out value="${statusProcess}"/>' +
	        	 '&center=' + '<c:out value="${center}"/>' +
	        	 '&typeExport=xlsx','_blank');
        	
        }
        
		if ($.trim($(args).text()) == '<fmt:message key="global.button.exportCSV"/>')  {
        	
        	var funtion = "<c:out value='${function}'/>";
        	 window.open('${pageContext.request.contextPath}/exportExcel-new/alarmLog.htm?sdateF='+"<c:out value='${sdateF}'/>"+
	        	'&sdateT='+"<c:out value='${sdateT}'/>"+
	        	'&edateF='+"<c:out value='${edateF}'/>"+
	        	'&edateT='+"<c:out value='${edateT}'/>"+
	        	 '&bscid='+"<c:out value='${bscid}'/>"+
	        	 '&cellid='+"<c:out value='${cellid}'/>"+
	        	 '&vendor='+"<c:out value='${vendor}'/>"+
	        	 '&district='+"<c:out value='${district}'/>"+
	        	 '&alarmName='+"<c:out value='${alarmName}'/>"+
	        	 '&province='+"<c:out value='${province}'/>"+
	        	 '&team='+"<c:out value='${team}'/>"+
	        	 '&alarmType='+"<c:out value='${alarmType}'/>"+
	        	 '&alarmMappingName='+"<c:out value='${alarmMappingName}'/>"+
	        	 '&statusFinish='+"<c:out value='${statusFinish}'/>"+
	        	 '&severity='+"<c:out value='${severity}'/>"+
	        	 '&network='+"<c:out value='${netWork}'/>"+
	        	 '&function='+funtion+
	        	 '&statusView='+"<c:out value='${statusView}'/>"+
	        	 '&alarmInfo='+"<c:out value='${alarmInfo}'/>"+
	        	 '&duaration='+"<c:out value='${duaration}'/>"+
	        	 '&region='+"<c:out value='${region}'/>"+
	        	 '&unAlarmMappingName='+"<c:out value='${unAlarmMappingName}'/>"+
	        	 '&severityF='+"<c:out value='${severityF}'/>"+
	        	 '&statusProcess=' + '<c:out value="${statusProcess}"/>' +
	        	 '&center=' + '<c:out value="${center}"/>' +
	        	 '&typeExport=csv','_blank');
        	
        }
        
		if ($.trim($(args).text()) == '<fmt:message key="global.button.exportTXT"/>')  {
			
			var funtion = "<c:out value='${function}'/>";
			 window.open('${pageContext.request.contextPath}/exportExcel-new/alarmLog.htm?sdateF='+"<c:out value='${sdateF}'/>"+
		    	'&sdateT='+"<c:out value='${sdateT}'/>"+
		    	'&edateF='+"<c:out value='${edateF}'/>"+
		    	'&edateT='+"<c:out value='${edateT}'/>"+
		    	 '&bscid='+"<c:out value='${bscid}'/>"+
		    	 '&cellid='+"<c:out value='${cellid}'/>"+
		    	 '&vendor='+"<c:out value='${vendor}'/>"+
		    	 '&district='+"<c:out value='${district}'/>"+
		    	 '&alarmName='+"<c:out value='${alarmName}'/>"+
		    	 '&province='+"<c:out value='${province}'/>"+
		    	 '&team='+"<c:out value='${team}'/>"+
		    	 '&alarmType='+"<c:out value='${alarmType}'/>"+
		    	 '&alarmMappingName='+"<c:out value='${alarmMappingName}'/>"+
		    	 '&statusFinish='+"<c:out value='${statusFinish}'/>"+
		    	 '&severity='+"<c:out value='${severity}'/>"+
		    	 '&network='+"<c:out value='${netWork}'/>"+
		    	 '&function='+funtion+
		    	 '&statusView='+"<c:out value='${statusView}'/>"+
		    	 '&alarmInfo='+"<c:out value='${alarmInfo}'/>"+
		    	 '&duaration='+"<c:out value='${duaration}'/>"+
		    	 '&region='+"<c:out value='${region}'/>"+
		    	 '&unAlarmMappingName='+"<c:out value='${unAlarmMappingName}'/>"+
	        	 '&severityF='+"<c:out value='${severityF}'/>"+
	        	 '&statusProcess=' + '<c:out value="${statusProcess}"/>' +
	        	 '&center=' + '<c:out value="${center}"/>' +
		    	 '&typeExport=txt','_blank');			
		}
		
		// nhan tin gui bo
		if ($.trim($(args).text()) == '<fmt:message key="global.button.chuyenBo"/>')  { 
			alert("dd")
			var selectedrowindexes = $('#jqxgrid').jqxGrid('getselectedrowindexes'); 
			var idList="";
    		var cond="";
    		//alert(selectedrowindexes);
    		//var rowIndexList = selectedrowindexes.split(",");
    		if (selectedrowindexes != null) {
    			for (var i=0; i<selectedrowindexes.length; i++) {
    				var row = $("#jqxgrid").jqxGrid('getrowdata', selectedrowindexes[i]);
    				idList+=cond+row.id;
    				cond=",";
    			}
    			window.location = 'chuyenBO.htm?idList='+idList+'&center='+"<c:out value='${center}'/>"+'&function='+"<c:out value='${function}'/>";
    			
        		/* $.ajax({
        			  url: '${pageContext.request.contextPath}/alarmLog-new/sendSMS.htm',
        			  type: 'POST',
        			  data : {idList: idList},
        			  success: function(result,status,xhr){
        				if (result = 1) {
        					alert('Chuyển thành công');
        				} else {
        					alert('Lỗi hệ thống');
        					console.log('loi khi thuc hien procedure');
        				}
        				  
        			  },
        			  error: function(){
        				  alert('Lỗi hệ thống');
        			  }
        		}); */
    		}
    		
    	} 
		// tao su co
		if ($.trim($(args).text()) == '<fmt:message key="global.button.createTrouble"/>')  { 
    		alert('Chỉ được chọn những cảnh báo cùng loại thiết bị (CORE CS, RAN 2G, ...)');
			
			var selectedrowindexes = $('#jqxgrid').jqxGrid('getselectedrowindexes'); 
			if (selectedrowindexes != null) {
				var row = $("#jqxgrid").jqxGrid('getrowdata', selectedrowindexes[0]);
				var checkNetwork = row.network;
				var checkNe = true;
				var isOpenWindow = true;
				var sdateMin = row.sdate;
				var idList = '(' + row.id;
			    var canhBao = '{[alarmID: ' + row.id + ', ne: ' + row.ne + ', sdate: ' + dateToYMDHMS(new Date(sdateMin)) + ']'
			    var effectNeList = [];
			    effectNeList.push(row.ne);
			    for (var i=1; i<selectedrowindexes.length; i++)  {
			    	row = $("#jqxgrid").jqxGrid('getrowdata', selectedrowindexes[i]);
			    	idList += ',' + row.id;
			    	checkNe = true;
			    	if (row.sdate < sdateMin) {
			    		sdateMin = row.sdate;
			    	}
			    	if (row.network != checkNetwork) {
			    		alert('Chỉ được chọn những cảnh báo cùng loại thiết bị (CORE CS, RAN 2G, ...)');
			    		isOpenWindow = false;
			    		break;
			    	}
			    	canhBao += ',[alarmID: ' + row.id + ', ne: ' + row.ne + ', sdate: ' + dateToYMDHMS(new Date(row.sdate)) + ']';
			    	for (var j = 0; j < effectNeList.length; j++) {
			    		if (effectNeList[j] == row.ne) {
			    			checkNe = false;
			    			break;
			    		}
			    	}
			    	if (checkNe) {
			    		effectNeList.push(row.ne);
			    	}	
			
			    } 
			    idList += ')';
			    canhBao += '}';
			    var effectNeStr = effectNeList[0];
			    for (var i = 1; i < effectNeList.length; i++) {
			    	if ((effectNeStr + ',' + effectNeList[i]).length <= 100) {
			    		effectNeStr += ',' + effectNeList[i];
			    	}
			    }
				//alert(row.alarmName);
				if (isOpenWindow) {
		    		
					
					$("#jqxwindowCreateTrouble").jqxWindow('open');
					$("#trouble").val(row.alarmName);
					$("#createTroubleSdate").val(dateToYMDHMS(sdateMin));
					$("#effectNe").val(effectNeStr);
					$("#canhBao").val(canhBao);
					$("#idList").val(idList);
					 	 
					var donVi = '<c:out value="${dept}"/>';
					$("#donVi").text(donVi);
					/*  var donViAnhHuongSource = [];
					if (donVi == 'NOCMB' || donVi == 'NOCMN' || donVi == 'NOCMT') {
						donViAnhHuongSource = ['NOCMB', 'NOCMN', 'NOCMT'];
					} else if (donVi == 'CNOC'){
						donViAnhHuongSource = ['NOCMB', 'NOCMN', 'NOCMT', 'MLMB', 'MLMN', 'MLMT'];
					}
					$("#donViAnhHuong").jqxDropDownList({ source: donViAnhHuongSource,
					  width: 120,  theme: theme,enableHover: true , autoDropDownHeight: true, checkboxes: true
					});			   
					if ('<c:out value="${dept}"/>' != 'CNOC') {
						$("#donViAnhHuong").jqxDropDownList('checkItem', '<c:out value="${dept}"/>');
					}	 	 */
					/* var urlheThong="${pageContext.request.contextPath}/ajax/getSysParaList.htm?code=LOAI_TB_SLA";
					//prepare the data
					var sourceheThong =
					{
					datatype: "json",
					url: urlheThong,
					datafields: [
					            { name: 'name'},
					            { name: 'value'}
					        ],
					async: false
					};
					var dataAdapterheThong = new $.jqx.dataAdapter(sourceheThong);

				   $("#effectSystem").jqxDropDownList({source: dataAdapterheThong, displayMember: "value", valueMember: "name", width: 120,  theme: theme,enableHover: true , autoDropDownHeight: true, checkboxes: true
				   });	 	
				    $("#effectSystem").jqxDropDownList('removeItem', 'ALL'); 
				    $("#effectSystem").jqxDropDownList('checkItem', row.network);
				  
				     */

				  
				 if (row.network != 'CS_CORE' && row.network != 'PS_CORE' && row.network != 'CORE_LTE') {
				    	$("#effectNe").hide();
				    } 
				    
				    
				}
				
			}
    	} 
 	});// end menu
 	
 	
 	$("#createTroubleBtSave").click(function (event) {
    	//alert("aaa");
    	
    	$.post('${pageContext.request.contextPath}/alarmLog-new/insertTrouble.htm',
    		      { 'canhBao': $("#canhBao").val(),
    					'donViAnhHuong': $("#donViAnhHuong").val(),
		    	    	'effectSystem': $("#effectSystem").val(),
		    	    	'effectNe': $("#effectNe").val(), 
		    	    	'effect': $("#effect").val(),
		    	    	'sdateStr': $("#createTroubleSdate").val(),
		    	    	'edateStr': $("#createTroubleEdate").val(),
		    	    	'reason': $("#reason").val(),
		    	    	'method': $("#method").val(),
		    	    	'result': $("#result").val(),
		    	    	'anhHuong': $("#effect").val(),
		    	    	'tenSuCo': $("#trouble").val(),
		    	    	'idList':  $("#idList").val(),
		    	    	'systemSdateStr':$("#createTroubleSdate").val(),
		    	    	'loaiSuCo': $("#troubleType").val()
    		      },
    		      function(result){
    		       if(result == "success"){
    		         alert("Tạo sự cố thành công");
    		         $("#effect").val('');
    		         $("#createTroubleSdate").val('');
    		         $("#createTroubleEdate").val('');
    		         $("#reason").val('');
    		         $("#method").val('');
    		         $("#result").val('');
    		         $("#trouble").val('');
    		         $("#troubleType").val('');
    		         $("#jqxwindowCreateTrouble").jqxWindow('close');
    		        }else if (result == "date format is not valid"){
    		         	alert("thông tin ngày tháng không đúng định dạng");
    		        } else if (result == "shift not found"){
    		        	alert("Ca trực không tồn tại");
    		        } else if (result == "error appear while insert process"){
    		        	alert("Lỗi hệ thống");
    		        	console.log("error appear while insert process");
    		        } else if (result == "trouble type not is valid") {
    		        	alert("Loại sự cố không được để trống");
    		        } else if (result == "dept not is valid") {
    		        	alert("Đơn vị ảnh hưởng không được để trống");
    		        }
    		          
    		      }).error(function(data){
    		        alert("Lỗi hệ thống");
    		       });
    	 
    });
    //call view detail 
   /*  $("#jqxgrid").on("cellclick", function (event) 
	{
	    var column = event.args.column.text;
	    //alert(column);
	    if (column=='Site' )
		    {
			    var rowindex = event.args.rowindex;
			    var row = $("#jqxgrid").jqxGrid('getrowdata', rowindex);
		    	var site = row.site;
		    	 window.open('/smartw/map/list.htm?siteid='+site,'_blank');
		    }
	}); */
	
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
	var llProvider = $("#actionProcess").val();
	//Create a jqxDropDownList LeaseLine
	var urlLeaseLine = "${pageContext.request.contextPath}/ajax/getLeaseLine.htm?llNode="+siteList+"&llProvider="+llProvider;
	// prepare the data
	var sourceLeaseLine =
	{
	    datatype: "json",
	    
        datafields: [
                     { name: 'leaseLine' }
                 ],
                 url: urlLeaseLine,
	    async: false
	};
	 var dataAdapterLeaseLine = new $.jqx.dataAdapter(sourceLeaseLine);
	$("#leaseLine").jqxDropDownList({ source: dataAdapterLeaseLine, displayMember: "leaseLine", valueMember: "leaseLine",  width: '100%',height: 20,theme: theme,autoOpen: true,enableHover: true });
	var leaseLine =  "<c:out value='${leaseLine}'/>";
	$("#leaseLine").jqxDropDownList('addItem', { label: '', value: ''}, 0 );
		if(leaseLine!=null&&leaseLine!="")
		$('#leaseLine').val(leaseLine);
		
	$('#actionProcess').on('change', function (event) { 
		var siteList = $("#siteList").val();
		var llProvider = $("#actionProcess").val();
		var urlLeaseLine = "${pageContext.request.contextPath}/ajax/getLeaseLine.htm?llNode="+siteList+"&llProvider="+llProvider;
		// prepare the data
		var sourceLeaseLine =
		{
		    datatype: "json",
		    
	        datafields: [
	                     { name: 'leaseLine' }
	                 ],
	                 url: urlLeaseLine,
		    async: false
		};
		 var dataAdapterLeaseLine = new $.jqx.dataAdapter(sourceLeaseLine);
		 $("#leaseLine").jqxDropDownList({ source: dataAdapterLeaseLine, displayMember: "leaseLine", valueMember: "leaseLine",  width: '100%',height: 20,theme: theme,autoOpen: true,enableHover: true });
			
	}); 
	
	
	//form ackroetoshift
	//input alarm
    //$("#alarm").jqxInput({placeHolder: "Enter alarm", height: 25, width: '100%', minLength: 0, maxLength: 170, theme: theme});
    ${alarmList}
	 $("#alarm").jqxInput({ placeHolder: "Enter alarm",  height: 25, width: '98%', minLength: 0, maxLength: 170, theme: theme,
       source: alarmList
   });
   var alarm =  "<c:out value='${alarm}'/>";
  // alert(bscid);
   if(alarm!="")
		$('#alarm').val(alarm);
	
	//$("#system").jqxInput({placeHolder: "Enter system", height: 25, width: '100%', minLength: 0, maxLength: 100, theme: theme});
    
	//Create a jqxDropDownList causeby sys
   	var urlCausebySys = "${pageContext.request.contextPath}/ajax/getCausebySys.htm";
    // prepare the data
    var sourceCausebySys =
    {
        datatype: "json",
        datafields: [
            { name: 'value' },
            { name: 'name' }
        ],
        url: urlCausebySys,
        async: false
    };
    var dataAdapterCausebySys = new $.jqx.dataAdapter(sourceCausebySys);
    $("#causebySystem").jqxDropDownList({ source: dataAdapterCausebySys, displayMember: "value", valueMember: "name", width: 250,height: 25,theme: theme,autoOpen: true,enableHover: true });
    var causebySys =  "<c:out value='${causebySystem}'/>";
    $("#causebySystem").jqxDropDownList('addItem', { label: '', value: ''}, 0 );
 	if(causebySys!=null&&causebySys!="")
		$('#causebySystem').val(causebySys);
 	
 	 //input causeby
    $("#causeby").jqxInput({placeHolder: "Enter causeby", height: 25, width: '100%', minLength: 0, maxLength: 200, theme: theme});
  //input alarmInfo
    $("#alarmInfoF").jqxInput({placeHolder: "Enter alarmInfo", height: 25, width: '100%', minLength: 0, maxLength: 900, theme: theme});
  //input actionProcess
    /* $("#actionProcess").jqxInput({placeHolder: "Enter contact info", height: 25, width: '100%', minLength: 0, maxLength: 900, theme: theme}); */
    $("#siteList").jqxInput({ height: 20, width: '100%', minLength: 0, maxLength: 200, theme: theme});
    $("#siteQuantity").jqxInput({ height: 20, width: '50%', minLength: 0, maxLength: 20, theme: theme});
    $("#countSite").jqxInput({ height: 20, width: '50%', minLength: 0, maxLength: 20, theme: theme});
    
  // ComboBox user

    $("#cbUserProcess").on('checkChange', function (event) {
        if (event.args) {
            var item = event.args.item;
            if (item) {
                var items = $("#cbUserProcess").jqxDropDownList('getCheckedItems');
                var checkedItems = "";
                $.each(items, function (index) {
                    checkedItems += this.value + ", ";                          
                });
                $("#userProcess").val(checkedItems);
            }
        }
    });
    
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
    $("#alarmTypeF").jqxComboBox({ source: dataAdapteralarmType, displayMember: "alarmType", valueMember: "alarmType", width: 150, height: 20, theme: theme,autoDropDownHeight: true,autoOpen: true  });
    var alarmTypeF =  "<c:out value='${alarmTypeF}'/>";
    if(alarmTypeF=="")
		$('#alarmTypeF').val('');
	else
		$('#alarmTypeF').val(alarmTypeF);
 
    $("#btCancel").click(function (event) {
        $("#jqxwindow").jqxWindow('close');

    });


    $("#btSave").click(function (event) {
    	
    	if ($("#alarm").val()==''||$("#operator").text()==''||$("#sdate").text()=='')
   		{
   			alert("Chưa nhập đầy đủ thông tin bắt buộc");
   		}
    	else
    	{
	    	var alarmWork = {};
	 		
			alarmWork.warningType  = "<c:out value='${netWork}'/>";
	    	//alarmWork.vendor  = $("#vendor").val();
	    	alarmWork.alarm = $("#alarm").val();
	    	alarmWork.operator = $("#operator").text();
	    	alarmWork.system = $("#system").val();
	    	alarmWork.countSite = $("#countSite").val();
	    	alarmWork.stimeStr = $("#sdate").text();
	    	alarmWork.etimeStr = $("#edate").val();
	    	alarmWork.teamProcess = $("#teamProcess").text();
	    	alarmWork.causebySystem = $("#causebySystem").val();
	    	alarmWork.userProcess = $("#userProcess").val();
	    	alarmWork.dept=$("#dept").text();
	    	alarmWork.alarmInfo = $("#alarmInfoF").val();
	    	alarmWork.causeby = $("#causeby").val();
	    	alarmWork.actionProcess = $("#actionProcess").val();
	    	alarmWork.alarmType =$("#alarmTypeF").val();
	    	alarmWork.siteList = $("#siteList").val();
	    	alarmWork.siteQuantity = $("#siteQuantity").val();
	    	alarmWork.mdSdateStr= $("#mdSdate").val();
	    	alarmWork.groups=$("#groups").val();
	    	alarmWork.contactDateStr=$("#contactTime").val();
	    	alarmWork.leaseLine=$("#leaseLine").val();
	    	alarmWork.region= "<c:out value='${regionF}'/>";
	    	alarmWork.standardName= $("#standardName").val();
    		
	    	$.ajax({
	    	    type: "POST",
	    	    url: "${pageContext.request.contextPath}/alarmLog/insertAlarmWork.htm",
	    	    data: JSON.stringify(alarmWork),
	    	    dataType: 'json',
	    	    contentType: 'application/json',
	    	    mimeType: 'application/json',
	    	    beforeSend: function(){},
	    	    complete: function(){},
	    	     
	    	    success: function(data){
	    	    	if (data=="1")
	    	    		{
		    	    		idList = $("#idList").val();
		        	    	idEndList =$("#idEndList").val();
		        	    	$.getJSON("${pageContext.request.contextPath}/alarmLog/ack.htm",{idList:idList,idEndList:idEndList,netWork:"<c:out value='${netWork}'/>",functionA:"<c:out value='${function}'/>",inshift:"Y",etime:$("#edate").val(),region:"<c:out value='${regionF}'/>"}, function(j){
		        	    		$("#jqxwindow").jqxWindow('close');
			        	    	$("#alarm").val("");
			    				$("#operator").text("");
			    				$("#system").val(system);
			    				$("#countSite").val("");
			    				$("#sdate").val("");
			    				$("#edate").val("");
			    				$("#teamProcess").text("");
			    				$("#causebySystem").val("");
			    				$("#alarmTypeF").val("");
			    				$("#siteList").val("");
			    				$("#siteQuantity").val("");
			    				 $("#alarmInfoF").val("");
			    				 $("#causeby").val("");
			    				 $("#actionProcess").val("");
			    				 $("#mdSdate").val("");
			    				 $("#contactTime").val("");
			    				 $("#regionF").val("");
			    				 $("#standardName").val("");
			    			    	$("#leaseLine").val("");
			    				 if (j==1)
			    					 {
			    					 	alert("Xác nhận và chuyển vào ca trực thành công!");
			    					 }
			    				 else
			    					 {
			    					 	alert("Xác nhận và chuyển vào ca trực không thành công!");
			    					 }
		        	     	   });
		        	    //	window.location = 'ack.htm?idList='+idList+'&idEndList='+idEndList+'&network='+"<c:out value='${netWork}'/>"+'&function='+"<c:out value='${function}'/>"+'&inshift=Y'+'&etime='+$("#edate").val();
		        	    	
	    	    		}
	    	    	else
	   	    		{
	   	    			alert("Định dạng ngày tháng không đúng, chưa nhập các thông tin bắt buộc hoặc thời gian kết thúc nhỏ hơn thời gian bắt đầu");
	   	    		}
	    	    	
	    	    }
	    	});
    	}
       
    });
    
    
    $("#system").change(function(){
		var system= $("#system").val();
		var siteList = $("#siteList").val();
		var siteQuantity =$("#siteQuantity").val();
		if (system!=null && system!='')
			{
				var systemVar = system.split(",");
				$("#countSite").val(systemVar.length);
				//site list
				var con="";
				if (siteList!=null && siteList!='')
				{
					con=",";
				}
				
				if (siteQuantity==null||siteQuantity=='')
				{
					siteQuantity=0;
				}
				for ( var i = 0; i < systemVar.length; i++) {
					var cell = systemVar[i];
					var site=cell;
					if (cell.length>6)
						{
							site = cell.substr(0,6);
						}
					if (siteList.indexOf(site)<0 )
					{
						siteList=siteList+con+site;
						con=",";
						siteQuantity=parseInt(siteQuantity)+1;
					}	
				}
			}
		else
			{
			$("#countSite").val(0);}
		
		$("#siteList").val(siteList);
		$("#siteQuantity").val(siteQuantity);
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
    
 // Create a jqxComboBox standard error
    var urlStandardName = "${pageContext.request.contextPath}/ajax/getStandardName.htm?vendor=&network=";
    // prepare the data
    var sourceStandardName =
    {
        datatype: "json",
        datafields: [
                     { name: 'alarmNameMapping'}
        ],
        url: urlStandardName,
        async: false
    };
    var dataAdapterStandardName = new $.jqx.dataAdapter(sourceStandardName);
    // Create a jqxComboBox
    $("#standardName").jqxComboBox({ source: dataAdapterStandardName, displayMember: "alarmNameMapping", valueMember: "alarmNameMapping", width: 570, height: 20, theme: theme,autoDropDownHeight: true  });
    var standardName =  "<c:out value='${alAlarmWorks.standardName}'/>";
		$('#standardName').val(standardName);
		
	//combobox region
	var urlRegion = "${pageContext.request.contextPath}/ajax/getRegionList.htm";
	console.log("urlRegion: "+urlRegion);
    var sourceRegion =
    {
       datatype: "json",
       url: urlRegion,
       datafields: [
                     { name: 'name'},
                     { name: 'value'}
                 ],
        async: false
   };
    console.log("sourceRegion: " + JSON.stringify(sourceRegion));
    var dataAdapterregion = new $.jqx.dataAdapter(sourceRegion);
    console.log("dataAdapterregion: " + JSON.stringify(dataAdapterregion));
    $("#region").jqxDropDownList({source: dataAdapterregion, displayMember: "value", valueMember: "name",checkboxes: true, width: 120, autoDropDownHeight: true, theme: theme,enableHover: true });           

    var cbregion = '<c:out value="${region}"/>';
   // alert(dept);
	if(cbregion=="")
		$('#region').val('Choose');
	else
	{
		console.log("khac null");
		var regionVar = cbregion.split(",");
		if (regionVar != null) {
			for (var i=0; i<regionVar.length; i++) {
				console.log(regionVar[i] + " debug");
				$("#region").jqxDropDownList('checkItem', regionVar[i] ); 
			}
		}
	}    
	
	
	//serverity
	var urlseverity = "${pageContext.request.contextPath}/ajax/getSeverity.htm";
	// prepare the data
	var sourceseverity =
	{
	    datatype: "json",
	    datafields: [
	        { name: 'name'},
	        { name: 'value'}
	    ],
	    url: urlseverity,
	    async: false
	};
	var dataAdapterServerity = new $.jqx.dataAdapter(sourceseverity);
	
	// Create a jqxComboBox choose alarmMappingName
	$("#severityF").jqxDropDownList({ source: dataAdapterServerity,checkboxes: true, displayMember: "value", valueMember: "name", width: 120,  theme: theme,enableHover: true , autoDropDownHeight: true});
	var cbseverityF = '<c:out value="${severityF}"/>';
	console.log("cbseverityF: " + cbseverityF);
	   // alert(dept);
		if(cbseverityF==""){
			console.log("cbse = null");
			$('#severityF').val('Choose');
		}else
		{
			
			var severityFVar = cbseverityF.split(",");
			
			if (severityFVar != null) {
				for (var i=0; i<severityFVar.length; i++) {
					console.log("severityFVar: "+ severityFVar[i] + "  " +severityFVar.length );
					$("#severityF").jqxDropDownList('checkItem', severityFVar[i] ); 
				}
			}
		}  
  var center = '<c:out value="${center}"/>';	
  var networkUrl = "${pageContext.request.contextPath}/bts/alarmLog-new/getNetwork.htm?center=" + center;
  var networkSource = {
	datatype: 'json',
	datafields: [{name: 'name'}, {name: 'value'}],
	url: networkUrl,
	async: false
  }
  var networkDataAdapter = new $.jqx.dataAdapter(networkSource);
 $("#network").jqxDropDownList({ source: networkDataAdapter, displayMember: "value", valueMember: "name", width: 120,  theme: theme,enableHover: true , autoDropDownHeight: true});
 var network = '<c:out value="${network}"/>';
 if(network=="")
		$('#network').val('');
	else
		$('#network').val(network);
 var func = '<c:out value="${function}"/>';	
 var statusUrl = "${pageContext.request.contextPath}/alarmLog-new/getStatus.htm?function=" + func;
 var statusSource = {
	datatype: 'json',
	datafields: [{name: 'name'}, {name: 'value'}],
	url: statusUrl,
	async: false
 }

</script>

<script>
$(document).ready(function(){
	var neTypeUrl = "${pageContext.request.contextPath}/ajax/getNeTypeList.htm";
	  var neTypeSource = {
		datatype: 'json',
		datafields: [{name: 'name'}, {name: 'value'}],
		url: neTypeUrl,
		async: false
	  }
	  
	var neTypeDataAdapter= new $.jqx.dataAdapter(neTypeSource);
	$("#neType").jqxDropDownList({
		source: neTypeDataAdapter, 
		displayMember: "value", 
		valueMember: "name",
		checkboxes: true, 
		width: 200, 
		autoDropDownHeight: true, 
		theme: theme,
		enableHover: true 
	});
	
	var neType = '<c:out value="${neTypeList}"/>';
	   // alert(dept);
	if(neTypeArray=="")
		$('#neType').val('Choose');
	else
	{
		var neTypeArray = neType.split(",");
		if (neTypeArray != null) {
			for (var i=0; i<neTypeArray.length; i++) {
				var result = $("#neType").jqxDropDownList('checkItem', neTypeArray[i]); 
				
			}
		}
	} 
	
});
	   
</script>
<script>
$("#createTroubleBtCancel").click(function (event) {
    $("#jqxwindowCreateTrouble").jqxWindow('close');

});
</script>
