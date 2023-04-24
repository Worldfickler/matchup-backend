package com.example.usercenterbackendmaster.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 队伍和用户信息封装类
 * @author dell
 * @date 2023/4/16 10:35
 */

@Data
public class TeamUserVO implements Serializable {

    private static final long serialVersionUID = 3386506051707015003L;

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
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 0 - 公开，1 - 私有，2 - 加密
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人用户信息
     */
    UserVO createUser;

    /**
     * 已加入队伍的人数
     */
    private Integer hasJoinNum;

    /**
     * 是否已加入
     */
    private boolean hasJoin = false;

}
