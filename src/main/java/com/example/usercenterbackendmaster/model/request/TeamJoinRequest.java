package com.example.usercenterbackendmaster.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 加入队伍信息请求体
 * @author dell
 * @date 2023/4/15 23:46
 */

@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 2837038760247351066L;

    /**
     * id
     */
    private Long id;

    /**
     * 密码
     */
    private String password;

}
