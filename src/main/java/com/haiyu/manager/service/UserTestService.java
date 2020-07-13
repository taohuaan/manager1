package com.haiyu.manager.service;

import com.haiyu.manager.dto.PositionSearchDTO;
import com.haiyu.manager.response.PageDataResult;

public interface UserTestService {
    PageDataResult getUserTestList( Integer pageNum, Integer pageSize);
}
