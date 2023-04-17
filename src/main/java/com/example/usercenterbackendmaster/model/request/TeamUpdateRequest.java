package com.example.usercenterbackendmaster.model.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 修改队伍信息请求体
 * @author dell
 * @date 2023/4/15 23:46
 */

@Data
public class TeamUpdateRequest implements Serializable {

    private static final long serialVersionUID = 2837038760247351066L;

    /**
     * id
     */
    private Long id;

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 0 - 公开，1 - 私有，2 - 加密
     */
    private Integer status;

    /**
     * 密码
     */
    private String password;

}
