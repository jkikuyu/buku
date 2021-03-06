<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="categoryProfile.title"/></title>
</head>

<c:set var="delObject" scope="request"><fmt:message key="categoryList.category"/></c:set>
<script type="text/javascript">var msgDelConfirm =
   "<fmt:message key="delete.confirm"><fmt:param value="${delObject}"/></fmt:message>";
</script>

<div class="col-sm-10">
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
               cssClass="well" onsubmit="return validateCategory(this)">
               
        <form:hidden path="categoryId"/>
        <spring:bind path="category.categoryName">
        <div class="form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
        </spring:bind>
            <appfuse:label styleClass="control-label" key="category.categoryName"/>
            <form:input cssClass="form-control" path="categoryName" id="categoryName"/>
            <form:errors path="categoryName" cssClass="help-block"/>
        </div>
        <spring:bind path="category.description">
        <div class="form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
        </spring:bind>
            <appfuse:label styleClass="control-label" key="category.description"/>
            <form:input cssClass="form-control" path="description" id="description"/>
            <form:errors path="description" cssClass="help-block"/>
        </div>

<%--     <c:when test="${not empty category.name}">
        <div class="form-group">
            <label class="control-label"><fmt:message key="user.categorys"/>:</label>
            <div class="readonly">
                <c:forEach var="category" items="${category.categoryList}" varStatus="status">
                    <c:out value="${category.label}"/><c:if test="${!status.last}">,</c:if>
                    <input type="hidden" name="category" value="<c:out value="${category.label}"/>"/>
                </c:forEach>
            </div>
        </div>
    </c:when> --%>
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
// This is here so we can exclude the selectAll call when categorys is hidden
function onFormSubmit(theForm) {
    return validateCategory(theForm);

}
$('#footer').addClass('setImage');

$('#menubar').addClass('setImage');

</script>
</c:set>

<v:javascript formName="category" staticJavascript="false"/>
<script type="text/javascript" src="<c:url value="/scripts/validator.jsp"/>"></script>

