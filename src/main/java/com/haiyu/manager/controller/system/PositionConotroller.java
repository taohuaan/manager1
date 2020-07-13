package com.haiyu.manager.controller.system;

import com.haiyu.manager.dto.PositionSearchDTO;
import com.haiyu.manager.dto.UserSearchDTO;
import com.haiyu.manager.response.PageDataResult;
import com.haiyu.manager.service.AdminPermissionService;
import com.haiyu.manager.service.PositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("position")
public class PositionConotroller {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PositionService positionService;

    /**
     *
     * 功能描述: 跳到省市区管理
     *
     * @param:
     * @return:
     * @auther: youqing
     * @date: 2018/11/30 9:22
     */
    @RequestMapping("positionManage")
    public String permissionManage() {
        logger.info("进入权限管理");
        return "/position/positionManage";
    }

    @RequestMapping(value = "/getPositionList", method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getPositionList(@RequestParam("pageNum") Integer pageNum,
                                          @RequestParam("pageSize") Integer pageSize, PositionSearchDTO positionSearchDTO) {
        PageDataResult pdr = new PageDataResult();
        try {
            if(null == pageNum) {
                pageNum = 1;
            }
            if(null == pageSize) {
                pageSize = 10;
            }
            // 获取用户列表
            pdr = positionService.getPositionList(positionSearchDTO, pageNum ,pageSize);
            logger.info("省市区查询=pdr:" + pdr);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("省市区查询异常！", e);
        }
        return pdr;
    }

}
