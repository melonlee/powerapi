<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="host"
       value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}"></c:set>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="../common/style.jsp"></jsp:include>
</head>
<body>
<section>
    <jsp:include page="../common/leftmenu.jsp" flush="true">
        <jsp:param name="nav" value="7"/>
    </jsp:include>
    <div class="mainpanel">
        <div class="pageheader">
            <div class="row">
                <div class="col-md-11">
                    <h2>
                        <i class="fa fa-shield"></i>监控管理<span>实现单个API及多步业务流API监控，准确感知终端用户体验，提高整体业务质量</span>
                    </h2>
                </div>
                <div class="col-md-1">
                    <p>
                        <a class="btn btn-primary" href="create">新增监控 </a>
                    </p>
                </div>
            </div>
        </div>
        <div class="contentpanel">
        </div>
    </div>
</section>

<jsp:include page="../common/scripts.jsp"></jsp:include>
<script type="text/javascript">

    $(document).ready(function () {

    });
</script>
</body>
</html>
