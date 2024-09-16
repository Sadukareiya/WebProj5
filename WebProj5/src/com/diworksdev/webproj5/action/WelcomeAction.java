package com.diworksdev.webproj5.action;

// Struts2のActionSupportクラスをインポートします。
import com.opensymphony.xwork2.ActionSupport;

// WelcomeActionクラスはActionSupportクラスを継承(extends)しています。
public class WelcomeAction extends ActionSupport {

    // executeメソッドはStruts2のアクションメソッドです。
    // アクションが成功したときに呼ばれます。
    public String execute() {
        // このメソッドが成功した場合、"success"という結果を返します。
        return SUCCESS;
    }
}
