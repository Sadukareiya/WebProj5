package com.diworksdev.webproj5.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.webproj5.dao.HelloStrutsDAO;
import com.diworksdev.webproj5.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * HelloStrutsActionクラスは、Struts2のアクションクラス
 * このクラスは、ユーザーのデータを取得し、セッションに保存する
 * セッションはウェブサイトでユーザーの情報を一時的に保存するための仕組み
 */
public class HelloStrutsAction extends ActionSupport implements SessionAware {

    // HelloStrutsDTOのリストを保持するためのフィールド
    private List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();

    // セッションを管理するためのマップ
    private Map<String, Object> session;

    /**
     * アクションのメインメソッドです。
     * ユーザーのデータを取得して、セッションに保存します。
     */
    public String execute() {
        String ret = ERROR;

        // HelloStrutsDAOのインスタンスを作成し、データを取得
        HelloStrutsDAO dao = new HelloStrutsDAO();
        helloStrutsDTOList = dao.select();

        // データが取得できた場合
        if (helloStrutsDTOList.size() > 0) {
            // セッションにデータを保存
            session.put("helloStrutsDTOList", helloStrutsDTOList);
            ret = SUCCESS; // 成功結果を設定
        } else {
            // データがない場合はエラー
            ret = ERROR;
        }

        return ret; // 結果を返す
    }

    /**
     * セッションを取得するためのメソッドです。
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッションを設定するためのメソッドです。
     *
     * @param session セッションのマップ
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
