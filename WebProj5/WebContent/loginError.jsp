<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <!-- ページの文字エンコーディングとCSSの読み込みを設定 -->
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <title>LoginError</title>
</head>
<body>

    <!-- ログインエラーメッセージを表示 -->
    <h1>エラーが発生しました</h1>
    <br>
    <h3>ログインできません。</h3>

    <!-- 該当者がいない場合のエラーメッセージを表示 -->
    <!-- セッションから取得した情報を基に条件分岐 -->
    <s:if test='(#session.loginDTOList.get(0).username)=="該当なし"'>
        該当者はいませんでした。
    </s:if>
    <br>

    <!-- 試みたユーザー名とパスワードを表示するテーブル -->
    <table>
        <tbody>
            <tr>
                <!-- テーブルのヘッダー -->
                <th>USERNAME</th>
                <th>PASSWORD</th>
            </tr>

            <!-- セッションに保存されたログイン情報を繰り返し表示 -->
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
