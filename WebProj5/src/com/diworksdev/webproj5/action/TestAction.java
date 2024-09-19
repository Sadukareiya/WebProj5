package com.diworksdev.webproj5.action;

import java.util.ArrayList;   // リストのインポート
import java.util.List;        // リストのインポート
import java.util.Map;         // マップのインポート

import org.apache.struts2.interceptor.SessionAware;  // セッションのインターフェース

import com.diworksdev.webproj5.dao.TestDAO;          // DAOクラスのインポート
import com.diworksdev.webproj5.dto.LoginDTO;         // DTOクラスのインポート
import com.opensymphony.xwork2.ActionSupport;        // Strutsのサポートクラス

// TestAction クラスは Struts2 のアクションを表し、セッションを扱います
public class TestAction extends ActionSupport implements SessionAware {
    private String username;    // ユーザー名
    private String password;    // パスワード
    private List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();  // ログイン情報を保持するリスト
    private Map<String, Object> session;  // セッション情報を扱うマップ

    // execute メソッドは、アクションの実行時に呼び出されます
    public String execute() {
        String ret = ERROR;  // 初期状態はエラー

        TestDAO dao = new TestDAO();  // DAOオブジェクトの作成
        int count = dao.insert(username, password);  // ユーザー情報をデータベースに挿入

        // データベースへの挿入が成功した場合
        if (count > 0) {
            ret = SUCCESS;  // 成功を返す
        } else {
            ret = ERROR;    // エラーを返す
        }

        // データベースからユーザー情報を取得し、セッションに保存
        loginDTOList = dao.select(username, password);
        session.put("loginDTOList", loginDTOList);

        return ret;  // 結果を返す
    }

    // ユーザー名のゲッター
    public String getUsername() {
        return username;
    }

    // ユーザー名のセッター
    public void setUsername(String username) {
        this.username = username;
    }

    // パスワードのゲッター
    public String getPassword() {
        return password;
    }

    // パスワードのセッター
    public void setPassword(String password) {
        this.password = password;
    }

    // セッションのゲッター
    public Map<String, Object> getSession() {
        return session;
    }

    // セッションのセッター
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
