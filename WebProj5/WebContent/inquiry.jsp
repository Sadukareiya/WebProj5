<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>お問い合わせフォーム</title>
</head>
<body>
    <!-- method="post" はフォーム送信時にPOSTメソッドを使用することを示します。 -->
    <!-- action="InquiryCompleteAction" で、フォームが送信されたときに実行されるアクションを指定しています。 -->
    <s:form method="post" action="InquiryCompleteAction">

        <!-- 名前を入力するためのフィールド。type="text" は通常のテキスト入力です。 -->
        名前: <input type="text" name="name"/><br>

        <!-- 問い合わせの種類を選ぶためのセレクトボックス。 -->
        <!-- <select> タグを使用して、3つの選択肢（会社、製品、アフターサポート）を用意しています。 -->
        お問い合わせの種類:<br>
        <select name="qtype">
            <option value="company">会社について</option>
            <option value="product">製品について</option>
            <option value="support">アフターサポートについて</option>
        </select>
        <br>

        <!-- お問い合わせ内容を記述するテキストエリア。複数行のテキスト入力が可能です。 -->
        お問い合わせ内容:<br>
        <s:textarea name="body"/>
        <br>

        <!-- フォームを送信するためのボタン。 -->
        <s:submit value="登録"/>
    </s:form>
</body>
</html>
