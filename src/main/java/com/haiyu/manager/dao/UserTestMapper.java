package com.haiyu.manager.dao;

import com.haiyu.manager.dto.PositionDTO;
import com.haiyu.manager.dto.PositionSearchDTO;
import com.haiyu.manager.dto.UserTestDTO;
import com.haiyu.manager.pojo.BaseAdminRole;
import com.haiyu.manager.pojo.BaseUserTest;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mapper.MyMapper;

import java.util.List;

@Repository
public interface UserTestMapper extends MyMapper<BaseUserTest> {

    List<UserTestDTO> getUserTestList();

//    List<BaseAdminRole> getRoles();
//
//    int updateRole(BaseAdminRole role);
//
//    int updateRoleStatus(@Param("id") Integer id, @Param("roleStatus") Integer roleStatus);

}