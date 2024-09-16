<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <!-- ページの文字エンコーディングを指定 -->
    <meta charset="utf-8">
    <!-- 外部のCSSファイルを読み込む -->
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <!-- ページタイトル -->
    <title>HelloStruts</title>
</head>
<body>
    <!-- ページの見出し -->
    <h1>HelloStruts2!</h1>
    <br>

    <!-- データをテーブル形式で表示 -->
    <table>
        <tbody>
            <!-- テーブルのヘッダー -->
            <tr>
                <th>USERID</th>
                <th>USERNAME</th>
                <th>PASSWORD</th>
                <th>RESULT</th>
            </tr>
            <!-- セッションからデータリストを取得して繰り返し表示 -->
            <s:iterator value="#session.helloStrutsDTOList">
                <tr>
                    <!-- データの各プロパティを表示 -->
                    <td><s:property value="userId"/></td>
                    <td><s:property value="userName"/></td>
                    <td><s:property value="password"/></td>
                    <td><s:property value="result"/></td>
                </tr>
            </s:iterator>
        </tbody>
    </table>
</body>
</html>
