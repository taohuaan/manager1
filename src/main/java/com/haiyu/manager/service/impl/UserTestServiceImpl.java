package com.haiyu.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiyu.manager.dao.UserTestMapper;
import com.haiyu.manager.dto.UserTestDTO;
import com.haiyu.manager.response.PageDataResult;
import com.haiyu.manager.service.UserTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserTestServiceImpl implements UserTestService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserTestMapper userTestMapper;

    @Override
    public PageDataResult getUserTestList( Integer pageNum, Integer pageSize) {
        PageDataResult pageDataResult = new PageDataResult();
        List<UserTestDTO> userTests = userTestMapper.getUserTestList();

        List<UserTestDTO> listtemp = new ArrayList<UserTestDTO>();
        int start = (pageNum-1)*pageSize;
        int end = start + pageSize;

        for(int i = 0; i < userTests.size() ; i++ ){

            if(i >= start && i < end){
                listtemp.add(userTests.get(i));
            }

        }

        PageHelper.startPage(pageNum, pageSize);

        if(listtemp.size() != 0){
            PageInfo<UserTestDTO> pageInfo = new PageInfo<UserTestDTO>(userTests);
            pageDataResult.setList(listtemp);
            pageDataResult.setTotals((int) pageInfo.getTotal());
        }

        return pageDataResult;
    }



}
