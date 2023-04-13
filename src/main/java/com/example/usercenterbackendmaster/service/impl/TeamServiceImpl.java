package com.example.usercenterbackendmaster.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.usercenterbackendmaster.model.domain.Team;
import com.example.usercenterbackendmaster.service.TeamService;
import com.example.usercenterbackendmaster.mapper.TeamMapper;
import org.springframework.stereotype.Service;

/**
* @author dell
* @description 针对表【team(队伍)】的数据库操作Service实现
* @createDate 2023-04-13 22:10:55
*/
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
    implements TeamService{

}




