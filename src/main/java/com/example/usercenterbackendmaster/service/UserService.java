package com.example.usercenterbackendmaster.service;

import com.example.usercenterbackendmaster.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.example.usercenterbackendmaster.constant.UserConstant.ADMIN_ROLE;
import static com.example.usercenterbackendmaster.constant.UserConstant.USER_LOGIN_STATE;

/**
* @author dell
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-03-13 14:51:00
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 验证密码
     * @param planetCode 星球编号
     * @return 用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param request 用户登录状态
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户注销
     * @param request 用户登录状态
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 根据标签搜索用户
     * @param tagNameList 用户拥有的标签
     * @return
     */
    List<User> searchUsersByTags(List<String> tagNameList);

    /**
     * 用户脱敏
     * @param originUser 未脱敏的用户信息
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 更新用户信息
     * @param user 用户信息
     * @return
     */
    Integer updateUser(User user, User loginUser);

    /**
     * 获取当前登录用户信息
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 是否为管理员
     * @param request 用户登录状态
     * @return
     */
    boolean isAdmin(HttpServletRequest request);

    /**
     * 是否为管理员
     * @param loginUser 用户登录
     * @return
     */
    boolean isAdmin(User loginUser);

}
