package com.example.usercenterbackendmaster.service;

import com.example.usercenterbackendmaster.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.usercenterbackendmaster.model.domain.User;

/**
* @author dell
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2023-04-13 22:10:55
*/
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     * @param team 队伍信息
     * @param loginUser 当前用户
     * @return
     */
    long addTeam(Team team, User loginUser);

}
