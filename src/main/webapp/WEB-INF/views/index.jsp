<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/31
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" %>
<html>
<head>
    <title>首页</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <jsp:include page="/common/common.jsp"></jsp:include>

</head>
<body>
<h2>模态框（Modal）插件方法</h2>
<!-- 按钮触发模态框 -->
<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
    开始演示模态框
</button>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="false">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true">×
                </button>
            </div>
            <div class="modal-body">
                <form id="formDetil" class="easyui-form"   method="POST" >
                    <div  class="table-responsive"style="padding-left: 20%">
                        <tr>
                            <td style="border: none; padding-left: 0;">
                                姓名:
                                <input type="text" name="name"  required="true" >
                            </td><br /><br />
                            <td style="border: none;padding-left: 20px;">
                                年龄:
                                <input type="text" name="age"  required="true">
                            </td><br /><br />
                        </tr>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭 </button>
                <button type="button" class="btn btn-primary">提交更改</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<script>
    $(function () { $('#myModal').modal({
        keyboard: true
    })});
</script>
</body>
</html>