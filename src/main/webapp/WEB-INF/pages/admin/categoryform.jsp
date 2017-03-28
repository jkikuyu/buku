<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="categoryProfile.title"/></title>
</head>

<c:set var="delObject" scope="request"><fmt:message key="categoryList.category"/></c:set>
<script type="text/javascript">var msgDelConfirm =
   "<fmt:message key="delete.confirm"><fmt:param value="${delObject}"/></fmt:message>";
</script>

<div class="col-sm-2">
    <h2><fmt:message key="categoryProfile.heading"/></h2>
    <c:choose>
        <c:when test="${param.from == 'list'}">
            <p><fmt:message key="categoryProfile.admin.message"/></p>
        </c:when>
        <c:otherwise>
            <p><fmt:message key="categoryProfile.message"/></p>
        </c:otherwise>
    </c:choose>
</div>
<div class="col-sm-7">
    <spring:bind path="category.*">
        <c:if test="${not empty status.errorMessages}">
            <div class="alert alert-danger alert-dismissable">
                <a href="#" data-dismiss="alert" class="close">&times;</a>
                <c:forEach var="error" items="${status.errorMessages}">
                    <c:out value="${error}" escapeXml="false"/><br/>
                </c:forEach>
            </div>
        </c:if>
    </spring:bind>

    <form:form commandName="category" method="post" action="categoryform" id="categoryForm" autocomplete="off"
               cssClass="well" onsubmit="return validatecategory(this)">
        <form:hidden path="id"/>
        <form:hidden path="version"/>
        <input type="hidden" name="from" value="<c:out value="${param.from}"/>"/>

        <spring:bind path="user.username">
        <div class="form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
        </spring:bind>
            <appfuse:label styleClass="control-label" key="category.categoryname"/>
            <form:input cssClass="form-control" path="name" id="categoryname"/>
            <form:errors path="name" cssClass="help-block"/>
        </div>

        <div class="row">
            <spring:bind path="category.name">
            <div class="col-sm-6 form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
            </spring:bind>
                <appfuse:label styleClass="control-label" key="category.name"/>
                <form:input cssClass="form-control" path="name" id="name" maxlength="50"/>
                <form:errors path="name" cssClass="help-block"/>
            </div>
            <spring:bind path="category.description">
            <div class="col-sm-6 form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
            </spring:bind>
                <appfuse:label styleClass="control-label" key="user.description"/>
                <form:input cssClass="form-control" path="description" id="description" maxlength="50"/>
                <form:errors path="description" cssClass="help-block"/>
            </div>
        </div>
	<c:choose>
</c:choose>
        <div class="form-group">
            <button type="submit" class="btn btn-primary" name="save" onclick="bCancel=false">
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
// This is here so we can exclude the selectAll call when category is hidden
function onFormSubmit(theForm) {
    return validatecategory(theForm);
}
</script>
</c:set>

<v:javascript formName="user" staticJavascript="false"/>
<script type="text/javascript" src="<c:url value="/scripts/validator.jsp"/>"></script>

