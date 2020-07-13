package com.haiyu.manager.service;

import com.haiyu.manager.dto.PositionSearchDTO;
import com.haiyu.manager.response.PageDataResult;

public interface PositionService {
    PageDataResult getPositionList(PositionSearchDTO positionSearchDTO, Integer pageNum, Integer pageSize);
}
