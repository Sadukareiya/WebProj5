package com.diworksdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.diworksdev.webproj5.dto.HelloStrutsDTO;
import com.diworksdev.webproj5.util.DBConnector;

public class HelloStrutsDAO {

    // HelloStrutsDTOのリスト
    private List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<>();

    /**
     * データベースからユーザー情報を取得するメソッド
     */
    public List<HelloStrutsDTO> select() {
        DBConnector db = new DBConnector();
        Connection con = db.getConnection();
        String sql = "SELECT * FROM users";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HelloStrutsDTO dto = new HelloStrutsDTO();
                dto.setUserId(rs.getInt("user_id"));
                dto.setUserName(rs.getString("user_name"));
                dto.setPassword(rs.getString("password"));
                dto.setResult("MySQLと接続できます。");
                helloStrutsDTOList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return helloStrutsDTOList;
    }
}
