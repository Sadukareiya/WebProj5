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
</body>
</html>
