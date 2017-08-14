<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <jsp:param name="nav" value="8"/>
    </jsp:include>
    <div class="mainpanel">
        <div class="pageheader">
            <div class="row">
                <div class="col-md-11">
                    <h2>
                        <i class="fa  fa-sitemap"></i>团队管理<span>管理团队成员的操作权限内容</span>
                    </h2>
                </div>
                <div class="col-md-1">
                    <p>
                        <a class="btn btn-primary" href="create" >新增团队</a>
                    </p>
                </div>
            </div>

        </div>
        <div class="contentpanel">
            <div class="row">
                <c:if test="${status>0}">
                    <div class="col-md-12" id="action_alert">
                        <div class="alert alert-success">
                            <button type="button" class="close" data-dismiss="alert"
                                    aria-hidden="true">&times;</button>
                            操作成功!
                        </div>
                    </div>
                </c:if>

                <c:if test="${groups.size()==0}">
                    <div class="col-md-12">
                        <div class="alert alert-danger">
                            <button type="button" class="close" data-dismiss="alert"
                                    aria-hidden="true">&times;</button>
                            您目前还没有创建团队!
                        </div>
                    </div>
                </c:if>

                <c:if test="${groups.size()>0}">
                    <div class="col-md-12">
                        <div class="table-responsive">
                            <table class="table table-success table-buglist">
                                <thead>
                                <tr>
                                    <th>#</th>
                                    <th>名&nbsp;称&nbsp;</th>
                                    <th>时&nbsp;间&nbsp;</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="group" items="${groups}">
                                    <tr>
                                        <td>${group.id}</td>
                                        <td>${group.name}</td>
                                        <td>${group.createdate}</td>
                                        <td class="table-action"><a
                                                href="view?id=${group.id }"
                                                class="edit-row"><i class="fa fa-pencil"></i></a>&nbsp;<a
                                                href="delete?id=${group.id }" class="delete-row"><i
                                                class="fa fa-trash-o"></i></a></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </c:if>
            </div>
        </div>
    </div>
    </div>
</section>
<jsp:include page="../common/scripts.jsp"></jsp:include>
</body>
</html>
