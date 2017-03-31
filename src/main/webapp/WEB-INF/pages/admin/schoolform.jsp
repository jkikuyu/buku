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
               
        <form:hidden path="id"/>
        <spring:bind path="school.name">
        <div class="form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
        </spring:bind>
            <appfuse:label styleClass="control-label" key="school.name"/>
            <form:input cssClass="form-control" path="name" id="name"/>
            <form:errors path="name" cssClass="help-block"/>
        </div>

<%--     <c:when test="${not empty school.name}">
        <div class="form-group">
            <label class="control-label"><fmt:message key="user.schools"/>:</label>
            <div class="readonly">
                <c:forEach var="school" items="${school.schoolList}" varStatus="status">
                    <c:out value="${school.label}"/><c:if test="${!status.last}">,</c:if>
                    <input type="hidden" name="userschools" value="<c:out value="${school.label}"/>"/>
                </c:forEach>
            </div>
        </div>
    </c:when> --%>
     <div class="form-group">
         <button type="submit" class="btn btn-default" name="save" onclick="bCancel=false">
             <i class="icon-ok icon-white"></i> <fmt:message key="button.save"/>
         </button>
     <div>

         <legend class="accordion-heading">
             <a data-toggle="collapse" href="#collapse-address"><fmt:message key="user.address.address"/></a>
         </legend>
         <div id="collapse-address" class="accordion-body collapse">
             <div class="form-group">
                 <appfuse:label styleClass="control-label" key="user.address.address"/>
                 <form:input cssClass="form-control" path="address.address" id="address.address"/>
             </div>
             <div class="row">
                 <div class="col-sm-7 form-group">
                     <appfuse:label styleClass="control-label" key="user.address.city"/>
                     <form:input cssClass="form-control" path="address.city" id="address.city"/>
                 </div>
                 <div class="col-sm-2 form-group">
                     <appfuse:label styleClass="control-label" key="user.address.province"/>
                     <form:input cssClass="form-control" path="address.province" id="address.province"/>
                 </div>
                 <div class="col-sm-3 form-group">
                     <appfuse:label styleClass="control-label" key="user.address.postalCode"/>
                     <form:input cssClass="form-control" path="address.postalCode" id="address.postalCode"/>
                 </div>
             </div>
             <div class="form-group">
                 <appfuse:label styleClass="control-label" key="user.address.country"/>
                 <appfuse:country name="address.country" prompt="" default="${user.address.country}"/>
             </div>
         </div>
             
      </div> 
             <div class="row">
                 <div class="col-sm-7 form-group">
                     <appfuse:label styleClass="control-label" key="user.address.city"/>
                     <form:input cssClass="form-control" path="address.city" id="address.city"/>
                 </div>
                 <div class="col-sm-2 form-group">
                     <appfuse:label styleClass="control-label" key="user.address.province"/>
                     <form:input cssClass="form-control" path="address.province" id="address.province"/>
                 </div>
                 <div class="col-sm-3 form-group">
                     <appfuse:label styleClass="control-label" key="user.address.postalCode"/>
                     <form:input cssClass="form-control" path="address.postalCode" id="address.postalCode"/>
                 </div>
             </div>
	        <div class="row">
	            <spring:bind path="user.telNo1">
	            <div class="col-sm-6 form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
	            </spring:bind>
	                <appfuse:label styleClass="control-label" key="user.telNo1"/>
	                <form:input cssClass="form-control" path="telNo1" id="telNo1"/>
	                <form:errors path="telNo1" cssClass="help-block"/>
	            </div>
	            <div class="col-sm-6 form-group">
	                <appfuse:label styleClass="control-label" key="user.telNo2"/>
	                <form:input cssClass="form-control" path="telNo2" id="telNo2"/>
	            </div>
	        </div>

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
    $('#footer').addClass('setImage');

    $('#menubar').addClass('setImage');


}
</script>
</c:set>

<v:javascript formName="user" staticJavascript="false"/>
<script type="text/javascript" src="<c:url value="/scripts/validator.jsp"/>"></script>

