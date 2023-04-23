package com.example.usercenterbackendmaster.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用的删除请求参数
 * @author dell
 * @date 2023/4/20 17:26
 */

@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = 6279862015050484265L;

    private long id;

}
