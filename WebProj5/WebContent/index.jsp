<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>INDEX</title>
</head>
<body>
	<!-- HelloStrutsAction へのフォーム -->
	<s:form action="HelloStrutsAction">
		<!-- フォームの送信ボタン -->
		<s:submit value="HelloStruts"/>
	</s:form>

	<!--  WelcomeAction へのフォーム -->
	<s:form action="WelcomeAction">
		<!-- フォームの送信ボタン -->
		<s:submit value="Welcome"/>
	</s:form>
</body>
</html>