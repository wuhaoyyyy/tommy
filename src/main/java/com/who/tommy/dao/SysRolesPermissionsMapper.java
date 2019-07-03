package com.who.tommy.dao;

import com.who.tommy.entity.SysRolesPermissions;

public interface SysRolesPermissionsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRolesPermissions record);

    int insertSelective(SysRolesPermissions record);

    SysRolesPermissions selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRolesPermissions record);

    int updateByPrimaryKey(SysRolesPermissions record);
}