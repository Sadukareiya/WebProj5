package com.diworksdev.webproj5.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.webproj5.dao.LoginDAO;
import com.diworksdev.webproj5.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * LoginActionクラスは、ユーザーのログイン処理を行います。
 * Struts2のActionクラスを継承し、SessionAwareインターフェースを実装することで
 * セッション管理を行います。
 */
public class LoginAction extends ActionSupport implements SessionAware {

    // ユーザー名とパスワードを保存する変数
    private String username;
    private String password;

    // データベースから取得したユーザー情報を保存するリスト
    private List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

    // セッション情報を管理するためのMap
    private Map<String, Object> session;

    /**
     * executeメソッドは、ログイン処理のエントリポイントです。
     * @return ログイン成功ならSUCCESS、失敗ならERROR
     */
    public String execute() {
        String ret = ERROR; // 初期状態はログイン失敗を示す"ERROR"

        // 入力されたユーザー名とパスワードを確認（デバッグ用の出力）
        System.out.println("入力されたユーザー名: " + username);
        System.out.println("入力されたパスワード: " + password);

        // LoginDAOを使って、データベースからユーザー情報を取得
        LoginDAO dao = new LoginDAO();
        loginDTOList = dao.select(username, password);

        // データベースから取得したユーザー情報と入力情報を比較
        if (this.username.equals(loginDTOList.get(0).getUsername()) &&
            this.password.equals(loginDTOList.get(0).getPassword())) {
            // ログイン成功時、セッションにユーザー情報を格納
            session.put("loginDTOList", loginDTOList);
            ret = SUCCESS; // 成功を示す"SUCCESS"を返す
        } else {
            // ログイン失敗時、セッションにエラーメッセージを格納
            session.put("loginDTOList", loginDTOList);
            ret = ERROR; // 失敗を示す"ERROR"を返す
        }

        return ret; // 結果を返す
    }

    // ユーザー名のgetterメソッド
    public String getUsername() {
        return username;
    }

    // ユーザー名のsetterメソッド
    public void setUsername(String username) {
        this.username = username;
    }

    // パスワードのgetterメソッド
    public String getPassword() {
        return password;
    }

    // パスワードのsetterメソッド
    public void setPassword(String password) {
        this.password = password;
    }

    // セッションのgetterメソッド
    public Map<String, Object> getSession() {
        return session;
    }

    // セッションのsetterメソッド
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
