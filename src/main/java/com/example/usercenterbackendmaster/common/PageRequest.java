package com.example.usercenterbackendmaster.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用的分页请求参数
 * @author dell
 * @date 2023/4/15 22:02
 */

@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = 5191795669627260710L;

    /**
     * 页面大小
     */
    protected int pageSize;

    /**
     * 当前是第几页
     */
    protected int pageNum;

}
