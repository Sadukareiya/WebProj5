<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <!-- ページの文字エンコーディングとCSSの読み込みを設定 -->
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <title>LOGIN</title>
</head>
<body>

    <!-- ログイン成功時のメッセージを表示 -->
    <!-- セッションから取得したユーザー名を表示 -->
    <s:property value="#session.loginDTOList.get(0).username"/>さん、ようこそ！
    <br>

    <!-- ユーザー名とパスワードのリストを表示するテーブル -->
    <table>
        <tbody>
            <tr>
                <!-- テーブルのヘッダー -->
                <th>USERNAME</th>
                <th>PASSWORD</th>
            </tr>

            <!-- セッションに保存されたユーザー情報を繰り返し表示 -->
            <s:iterator value="#session.loginDTOList">
                <tr>
                    <!-- ユーザー名とパスワードを表示 -->
                    <td><s:property value="username"/></td>
                    <td><s:property value="password"/></td>
                </tr>
            </s:iterator>
        </tbody>
    </table>

</body>
</html>
