<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="schoolProfile.title"/></title>
</head>

<c:set var="delObject" scope="request"><fmt:message key="schoolList.school"/></c:set>
<script type="text/javascript">var msgDelConfirm =
   "<fmt:message key="delete.confirm"><fmt:param value="${delObject}"/></fmt:message>";
</script>

<div class="col-sm-10">
    <h2><fmt:message key="schoolProfile.heading"/></h2>
    <c:choose>
        <c:when test="${param.from == 'list'}">
            <p><fmt:message key="schoolProfile.admin.message"/></p>
        </c:when>
        <c:otherwise>
            <p><fmt:message key="schoolProfile.message"/></p>
        </c:otherwise>
    </c:choose>
</div>
<div class="col-sm-7">
    <spring:bind path="school.*">
        <c:if test="${not empty status.errorMessages}">
            <div class="alert alert-danger alert-dismissable">
                <a href="#" data-dismiss="alert" class="close">&times;</a>
                <c:forEach var="error" items="${status.errorMessages}">
                    <c:out value="${error}" escapeXml="false"/><br/>
                </c:forEach>
            </div>
        </c:if>
    </spring:bind>

    <form:form commandName="school" method="post" action="schoolform" id="schoolForm" autocomplete="off"
               cssClass="well" onsubmit="return validateSchool(this)">
               
        <form:hidden path="schoolId"/>
        <spring:bind path="school.shortName">
        	<div class="form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
        </spring:bind>
	        <appfuse:label styleClass="control-label" key="school.shortName"/>
	        <form:input cssClass="form-control" path="shortName" id="shortName"/>
	        <form:errors path="shortName" cssClass="help-block"/>
         	</div>
            
        <spring:bind path="school.longName">
	        <div class="form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
        </spring:bind>
            <appfuse:label styleClass="control-label" key="school.longName"/>
            <form:input cssClass="form-control" path="longName" id="longName"/>
            <form:errors path="longName" cssClass="help-block"/>
     	</div>

<%--     <c:when test="${not empty school.name}">
        <div class="form-group">
            <label class="control-label"><fmt:message key="school.schools"/>:</label>
            <div class="readonly">
                <c:forEach var="school" items="${school.schoolList}" varStatus="status">
                    <c:out value="${school.label}"/><c:if test="${!status.last}">,</c:if>
                    <input type="hidden" name="schools" value="<c:out value="${school.label}"/>"/>
                </c:forEach>
            </div>
        </div>
    </c:when> --%>

         <legend class="accordion-heading">
             <a data-toggle="collapse" href="#collapse-address"><fmt:message key="school.address.physicalAddress"/></a>
         </legend>
         <div id="collapse-address" class="accordion-body collapse">
                <div class="form-group">
                    <appfuse:label styleClass="control-label" key="school.address.physicalAddress"/>
                    <form:input cssClass="form-control" path="address.physicalAddress" id="address.physicalAddress"/>
                </div>
             <div class="row">
                 <div class="col-sm-7 form-group">
                     <appfuse:label styleClass="control-label" key="school.address.city"/>
                     <form:input cssClass="form-control" path="address.city" id="address.city"/>
                 </div>
			<%--  
                <div class="col-sm-3 form-group">
                     <appfuse:label styleClass="control-label" key="school.address.postalCode"/>
                     <form:input cssClass="form-control" path="address.postalCode" id="address.postalCode"/>
                 </div> 
                 --%>
             </div>
             <div class="form-group">
                 <appfuse:label styleClass="control-label" key="school.address.country"/>
<%--                  <appfuse:country name="address.country" prompt="" default="${school.address.country}"/>

 --%>             </div>
         </div>
             
     <!--  </div>  -->
            <%--  
				<div class="row">
                 <div class="col-sm-7 form-group">
                     <appfuse:label styleClass="control-label" key="school.address.city"/>
                     <form:input cssClass="form-control" path="address.city" id="address.city"/>
                 </div>
                 <div class="col-sm-2 form-group">
                     <appfuse:label styleClass="control-label" key="school.address.province"/>
                     <form:input cssClass="form-control" path="address.province" id="address.province"/>
                 </div>
                 <div class="col-sm-3 form-group">
                     <appfuse:label styleClass="control-label" key="school.address.postalCode"/>
                     <form:input cssClass="form-control" path="address.postalCode" id="address.postalCode"/>
                 </div>
             </div> 
        --%>
	        <div class="row">
	            <spring:bind path="school.telNo1">
	            <div class="col-sm-6 form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
	            </spring:bind>
	                <appfuse:label styleClass="control-label" key="school.telNo1"/>
	                <form:input cssClass="form-control" path="telNo1" id="telNo1"/>
	                <form:errors path="telNo1" cssClass="help-block"/>
	            </div>
	            <div class="col-sm-6 form-group">
	                <appfuse:label styleClass="control-label" key="school.telNo2"/>
	                <form:input cssClass="form-control" path="telNo2" id="telNo2"/>
	            </div>
	      <!--   </div> -->
		     <div class="form-group">
		         <button type="submit" class="btn btn-default" name="save" onclick="bCancel=false">
		             <i class="icon-ok icon-white"></i> <fmt:message key="button.save"/>
		         </button>
	
	            <c:if test="${param.from == 'list' and param.method != 'Add'}">
	              <button type="submit" class="btn btn-default" name="delete" onclick="bCancel=true;return confirmMessage(msgDelConfirm)">
	                  <i class="icon-trash"></i> <fmt:message key="button.delete"/>
	              </button>
	            </c:if>
	
	            <button type="submit" class="btn btn-default" name="cancel" onclick="bCancel=true">
	                <i class="icon-remove"></i> <fmt:message key="button.cancel"/>
	            </button>
	        </div>
    </form:form>
</div>

<c:set var="scripts" scope="request">
<script type="text/javascript">
// This is here so we can exclude the selectAll call when schools is hidden
function onFormSubmit(theForm) {
    return validateSchool(theForm);

}
</script>
</c:set>

<v:javascript formName="school" staticJavascript="false"/>
<script type="text/javascript" src="<c:url value="/scripts/validator.jsp"/>"></script>

