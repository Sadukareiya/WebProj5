package com.diworksdev.webproj5.dto;

public class HelloStrutsDTO {

    private int userId;
    private String userName;
    private String password;
    private String result;

    /**
     * userIdを取得するメソッド
     */
    public int getUserId() {
        return userId;
    }

    /**
     * userIdを設定するメソッド
     * @param userId 設定するuserId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * userNameを取得するメソッド
     */
    public String getUserName() {
        return userName;
    }

    /**
     * userNameを設定するメソッド
     * @param userName 設定するuserName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * passwordを取得するメソッド
     */
    public String getPassword() {
        return password;
    }

    /**
     * passwordを設定するメソッド
     * @param password 設定するpassword
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * resultを取得するメソッド
     */
    public String getResult() {
        return result;
    }

    /**
     * resultを設定するメソッド
     * @param result 設定するresult
     */
    public void setResult(String result) {
        this.result = result;
    }
}
