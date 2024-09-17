package com.diworksdev.webproj5.dto;

/**
 * ユーザーのログイン情報を保持するDTOクラス
 * DTOは"Data Transfer Object"の略で、データのやり取りに使用します
 */
public class LoginDTO {

    // ユーザー名を格納するフィールド
    private String username;

    // パスワードを格納するフィールド
    private String password;

    /**
     * ユーザー名を取得するためのメソッド
     */
    public String getUsername() {
        return username;
    }

    /**
     * ユーザー名を設定するためのメソッド
     * @param username ユーザー名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * パスワードを取得するためのメソッド
     */
    public String getPassword() {
        return password;
    }

    /**
     * パスワードを設定するためのメソッド
     * @param password パスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
