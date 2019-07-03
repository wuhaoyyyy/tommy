package com.who.tommy.dao;

import com.who.tommy.entity.SysUsersRoles;

public interface SysUsersRolesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUsersRoles record);

    int insertSelective(SysUsersRoles record);

    SysUsersRoles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUsersRoles record);

    int updateByPrimaryKey(SysUsersRoles record);
}