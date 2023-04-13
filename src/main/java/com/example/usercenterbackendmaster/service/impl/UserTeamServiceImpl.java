package com.example.usercenterbackendmaster.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.usercenterbackendmaster.model.domain.UserTeam;
import com.example.usercenterbackendmaster.service.UserTeamService;
import com.example.usercenterbackendmaster.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
* @author dell
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2023-04-13 22:21:00
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




