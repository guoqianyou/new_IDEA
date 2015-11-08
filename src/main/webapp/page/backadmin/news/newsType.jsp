<%--
  Created by IntelliJ IDEA.
  User: guoqi
  Date: 2015/10/1
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
</head>
<body>
<!-- 标题 -->
<section class="content-header">
  <h1>
    新闻管理
    <small>类型管理</small>
  </h1>
  <ol class="breadcrumb">
    <li><a href="#"><i class="fa fa-dashboard"></i> 主页</a></li>
    <li class="active">新闻类型</li>
  </ol>
</section>
<!--  正文内容-->
<!-- Main content -->
<section class="content">
  <div class="row">
    <div class="col-xs-12">
      <div class="box">
        <div class="box-header">
          <h3 class="box-title">新闻类别</h3>
        </div>
        <!-- /.box-header -->
        <div class="box-body">
          <table id="example2" class="table table-bordered table-hover">
            <thead>
            <tr>
              <th>类别名字</th>
              <th>类别代码</th>
              <th>描述</th>
              <th>操作</th>
            </tr>
            </thead>
          </table>
        </div>
      </div>
      <!-- /.box-body -->
    </div>
    <!-- /.box -->
  </div>
</section>
<!-- /.content -->
<script type="text/javascript">
  $.loadFile('${pageContext.request.contextPath}/custom/js/newsType.js');
</script>
</body>
</html>