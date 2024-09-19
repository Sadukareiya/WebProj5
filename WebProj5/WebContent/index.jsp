<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>INDEX</title>
</head>
<body>
    <!-- HelloStrutsActionへのフォーム -->
    <s:form action="HelloStrutsAction">
        <!-- ボタンを押すと、HelloStrutsActionが実行されます -->
        <s:submit value="HelloStruts"/>
    </s:form>

    <!-- WelcomeActionへのフォーム -->
    <s:form action="WelcomeAction">
        <!-- ボタンを押すと、WelcomeActionが実行されます -->
        <s:submit value="Welcome"/>
    </s:form>

    <!-- InquiryActionへのフォーム -->
    <s:form action="InquiryAction">
        <!-- ボタンを押すと、InquiryActionが実行されます -->
        <s:submit value="問い合わせ"/>
    </s:form>

    <!-- 新規ユーザー登録フォーム -->
	<br>
	<h3>新規ユーザー登録</h3>

	<!-- GET 通信を使用したフォーム -->
	<h4>GET 通信</h4>
	<s:form method="get" action="TestAction">
    	<s:textfield name="username" label="ユーザー名" />
    	<s:password name="password" label="パスワード" />
    	<s:submit value="送信" />
	</s:form>

	<!-- POST 通信を使用したフォーム -->
	<h4>POST 通信</h4>
	<s:form method="post" action="TestAction">
    	<s:textfield name="username" label="ユーザー名" />
    	<s:password name="password" label="パスワード" />
    	<s:submit value="送信" />
	</s:form>

</body>
</html>
