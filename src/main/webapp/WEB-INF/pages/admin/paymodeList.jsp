<%@ include file="/common/taglibs.jsp" %>

<head>
    <title><fmt:message key="modeList.title"/></title>
<!--     <meta name="menu" content="AdminMenu"/>
 -->
 </head>

<c:if test="${not empty searchError}">
    <div class="alert alert-danger alert-dismissable">
        <a href="#" data-dismiss="alert" class="close">&times;</a>
        <c:out value="${searchError}"/>
    </div>
</c:if>

<div class="col-sm-10">
    <h2><fmt:message key="modeList.heading"/></h2>

    <form method="get" action="${ctx}/admin/modes" id="searchForm" class="form-inline">
    <div id="search" class="text-right">
        <span class="col-sm-9">
            <input type="text" size="20" name="q" id="query" value="${param.q}"
                   placeholder="<fmt:message key="search.enterTerms"/>" class="form-control input-sm">
        </span>
        <button id="button.search" class="btn btn-default btn-sm" type="submit">
            <i class="icon-search"></i> <fmt:message key="button.search"/>
        </button>
    </div>
    </form>

    <div id="actions" class="btn-group">
        <a class="btn btn-primary" href="<c:url value='/admin/paymodeform?method=Add&from=list'/>">
            <i class="icon-plus icon-white"></i> <fmt:message key="button.add"/></a>

        <a class="btn btn-default" href="<c:url value='/home'/>">
            <i class="icon-ok"></i> <fmt:message key="button.done"/></a>
    </div>

    <display:table name="modeList" cellspacing="0" cellpadding="0" requestURI=""
                   defaultsort="1" id="modes" pagesize="25" class="table table-condensed table-striped table-hover" export="true">
        <display:column property="name" escapeXml="true" sortable="true" titleKey="mode.name" style="width: 25%"
                        url="/admin/paymodeform?from=list" paramId="id" paramProperty="modeId"/>
        <display:column property="description" escapeXml="true" sortable="true" titleKey="mode.description"
                        style="width: 34%"/>
                        style="width: 16%; padding-left: 15px" media="html">

        <display:setProperty name="paging.banner.item_name"><fmt:message key="modeList.mode"/></display:setProperty>
        <display:setProperty name="paging.banner.items_name"><fmt:message key="modeList.modes"/></display:setProperty>

        <display:setProperty name="export.excel.filename" value="Payment Mode List.xls"/>
        <display:setProperty name="export.csv.filename" value="Payment Mode List.csv"/>
        <display:setProperty name="export.pdf.filename" value="Payment Mode List.pdf"/>
    </display:table>
</div>
<%-- <c:set var="scripts" scope="request">

<script type="text/javascript">
$('#footer').addClass('setImage');

$('#menubar').addClass('setImage');

</script>
</c:set>
 --%>