package com.who.tommy.dao;

import com.who.tommy.entity.SysRoles;

public interface SysRolesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoles record);

    int insertSelective(SysRoles record);

    SysRoles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoles record);

    int updateByPrimaryKey(SysRoles record);
}