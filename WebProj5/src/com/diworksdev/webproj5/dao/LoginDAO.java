package com.diworksdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj5.dto.LoginDTO;
import com.diworksdev.webproj5.util.DBConnector;

/**
 * LoginDAOクラスはデータベースからユーザー情報を取得するためのクラス
 * 主にユーザー名とパスワードを使ってデータベースの検索を行います。
 */
public class LoginDAO {

    // ユーザー名を保存する変数
    public String username;

    // パスワードを保存する変数
    public String password;

    // データベースの検索結果を保存するためのリスト
    public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

    /**
     * データベースからユーザー名とパスワードを使ってユーザー情報を取得するメソッドです。
     * @param username ユーザー名
     * @param password パスワード
     */
    public List<LoginDTO> select(String username, String password) {
        // データベースに接続するためのオブジェクトを取得します
        DBConnector db = new DBConnector();
        Connection con = db.getConnection();

        // データベースでユーザー名とパスワードを条件に検索するためのSQL文
        String sql = "select * from users where user_name=? and password=?";

        try {
            // SQLを実行するために準備します（PreparedStatementを使用）
            PreparedStatement ps = con.prepareStatement(sql);

            // SQLクエリの1番目の「?」にユーザー名をセットします
            ps.setString(1, username);

            // SQLクエリの2番目の「?」にパスワードをセットします
            ps.setString(2, password);

            // SQLを実行し、結果をResultSetオブジェクトに格納します
            ResultSet rs = ps.executeQuery();

            // 検索結果がある限り、ループして結果を処理します
            while (rs.next()) {
                // LoginDTOオブジェクトを作成し、取得したユーザー名とパスワードをセットします
                LoginDTO dto = new LoginDTO();
                dto.setUsername(rs.getString("user_name"));
                dto.setPassword(rs.getString("password"));

                // リストにDTOを追加します
                loginDTOList.add(dto);
            }

            // もし検索結果がなかった場合は、"該当なし"のメッセージをDTOにセットしてリストに追加します
            if (loginDTOList.size() <= 0) {
                LoginDTO dto = new LoginDTO();
                dto.setUsername("該当なし");
                dto.setPassword("該当なし");
                loginDTOList.add(dto);
            }

        } catch (SQLException e) {
            // SQLの実行に失敗した場合のエラーメッセージを表示します
            e.printStackTrace();
        } finally {
            // データベース接続を閉じます（必ず実行されます）
            try {
                con.close();
            } catch (SQLException e) {
                // 接続を閉じる際のエラーをキャッチします
                e.printStackTrace();
            }
        }

        // 検索結果のリストを返します
        return loginDTOList;
    }
}

