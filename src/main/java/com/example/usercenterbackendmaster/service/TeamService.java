package com.example.usercenterbackendmaster.service;

import com.example.usercenterbackendmaster.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.usercenterbackendmaster.model.domain.User;
import com.example.usercenterbackendmaster.model.dto.TeamQuery;
import com.example.usercenterbackendmaster.model.request.TeamJoinRequest;
import com.example.usercenterbackendmaster.model.request.TeamQuitRequest;
import com.example.usercenterbackendmaster.model.request.TeamUpdateRequest;
import com.example.usercenterbackendmaster.model.vo.TeamUserVO;

import java.util.List;

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

    /**
     * 搜索队伍
     * @param teamQuery 队伍信息
     * @param isAdmin 是否为管理员
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     * @param teamUpdateRequest 更新队伍的信息
     * @param loginUser 登录用户
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     * @param teamJoinRequest 加入队伍的信息
     * @param loginUser 登录用户
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     * @param teamQuitRequest 退出队伍的信息
     * @param loginUser 登录用户
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);
}
