package com.haiyu.manager.dao;

import com.haiyu.manager.dto.PositionDTO;
import com.haiyu.manager.dto.PositionSearchDTO;
import com.haiyu.manager.pojo.BaseAdminRole;
import com.haiyu.manager.pojo.BasePosition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mapper.MyMapper;

import java.util.List;

@Repository
public interface PositionMapper extends MyMapper<BasePosition> {

    List<PositionDTO> getPositionList(PositionSearchDTO positionSearchDTO);

//    List<BaseAdminRole> getRoles();
//
//    int updateRole(BaseAdminRole role);
//
//    int updateRoleStatus(@Param("id") Integer id, @Param("roleStatus") Integer roleStatus);

}