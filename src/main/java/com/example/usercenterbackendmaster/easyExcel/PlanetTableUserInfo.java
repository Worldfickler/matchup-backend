package com.example.usercenterbackendmaster.easyExcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author dell
 * @date 2023/4/6 18:08
 * 星球用户信息
 */

@Data
public class PlanetTableUserInfo {

    /**
     * 用户id
     */
    @ExcelProperty("成员编号")
    private String planetCode;

    /**
     * 用户昵称
     */
    @ExcelProperty("成员昵称")
    private String username;

}
