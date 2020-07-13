package com.haiyu.manager.controller.system;

import com.haiyu.manager.response.PageDataResult;
import com.haiyu.manager.service.UserTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("bank")
public class BankController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserTestService userTestService;

    @RequestMapping("bankManage")
    public String permissionManage() {
        logger.info("进入权限管理");
        return "bank/bankManage";
    }

    @RequestMapping(value = "/userTestList", method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getPositionList(@RequestParam("pageNum") Integer pageNum,
                                          @RequestParam("pageSize") Integer pageSize) {
        System.out.println("进来了");
        PageDataResult pdr = new PageDataResult();
        try {

                if(null == pageNum) {
                    pageNum = 1;
                }
                if(null == pageSize) {
                    pageSize = 10;
                }
            System.out.println("pageNum :"+pageNum+"pageSize :"+pageSize);
            // 获取用户列表
            pdr = userTestService.getUserTestList(pageNum ,pageSize);
            logger.info("UserTest查询=pdr:" + pdr);
            System.out.println("出去了");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("省市区查询异常！", e);
        }
        return pdr;
    }

}
