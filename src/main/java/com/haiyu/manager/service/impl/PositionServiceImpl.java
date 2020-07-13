package com.haiyu.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiyu.manager.dao.PositionMapper;
import com.haiyu.manager.dto.PositionDTO;
import com.haiyu.manager.dto.PositionSearchDTO;
import com.haiyu.manager.response.PageDataResult;
import com.haiyu.manager.service.PositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Title: AdminUserServiceImpl
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/11/21 11:04
 */
@Service
public class PositionServiceImpl implements PositionService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public PageDataResult getPositionList(PositionSearchDTO positionSearch, Integer pageNum, Integer pageSize) {
        PageDataResult pageDataResult = new PageDataResult();
        List<PositionDTO> positions = positionMapper.getPositionList(positionSearch);

        PageHelper.startPage(pageNum, pageSize);

        if(positions.size() != 0){
            PageInfo<PositionDTO> pageInfo = new PageInfo<PositionDTO>(positions);
            pageDataResult.setList(positions);
            pageDataResult.setTotals((int) pageInfo.getTotal());
        }

        return pageDataResult;
    }


//    @Override
//    public Map<String,Object> addUser(BaseAdminUser user) {
//        Map<String,Object> data = new HashMap();
//        try {
//            BaseAdminUser old = baseAdminUserMapper.getUserByUserName(user.getSysUserName(),null);
//            if(old != null){
//                data.put("code",0);
//                data.put("msg","用户名已存在！");
//                logger.error("用户[新增]，结果=用户名已存在！");
//                return data;
//            }
//            String phone = user.getUserPhone();
//            if(phone.length() != 11){
//                data.put("code",0);
//                data.put("msg","手机号位数不对！");
//                logger.error("置用户[新增或更新]，结果=手机号位数不对！");
//                return data;
//            }
//            String username = user.getSysUserName();
//            if(user.getSysUserPwd() == null){
//                String password = DigestUtils.Md5(username,"123456");
//                user.setSysUserPwd(password);
//            }else{
//                String password = DigestUtils.Md5(username,user.getSysUserPwd());
//                user.setSysUserPwd(password);
//            }
//            user.setRegTime(DateUtils.getCurrentDate());
//            user.setUserStatus(1);
//            int result = baseAdminUserMapper.insert(user);
//            if(result == 0){
//                data.put("code",0);
//                data.put("msg","新增失败！");
//                logger.error("用户[新增]，结果=新增失败！");
//                return data;
//            }
//            data.put("code",1);
//            data.put("msg","新增成功！");
//            logger.info("用户[新增]，结果=新增成功！");
//        } catch (Exception e) {
//            e.printStackTrace();
//            logger.error("用户[新增]异常！", e);
//            return data;
//        }
//        return data;
//    }
//
//
//    @Override
//    public Map <String, Object> updateUser(BaseAdminUser user) {
//        Map<String,Object> data = new HashMap();
//        Integer id = user.getId();
//        BaseAdminUser old = baseAdminUserMapper.getUserByUserName(user.getSysUserName(),id);
//        if(old != null){
//            data.put("code",0);
//            data.put("msg","用户名已存在！");
//            logger.error("用户[更新]，结果=用户名已存在！");
//            return data;
//        }
//        String username = user.getSysUserName();
//        if(user.getSysUserPwd() != null){
//            String password = DigestUtils.Md5(username,user.getSysUserPwd());
//            user.setSysUserPwd(password);
//        }
//
//        int result = baseAdminUserMapper.updateUser(user);
//        if(result == 0){
//            data.put("code",0);
//            data.put("msg","更新失败！");
//            logger.error("用户[更新]，结果=更新失败！");
//            return data;
//        }
//        data.put("code",1);
//        data.put("msg","更新成功！");
//        logger.info("用户[更新]，结果=更新成功！");
//        return data;
//    }
//
//    @Override
//    public BaseAdminUser getUserById(Integer id) {
//        return baseAdminUserMapper.selectByPrimaryKey(id);
//    }
//
//
//    @Override
//    public Map <String, Object> delUser(Integer id,Integer status) {
//        Map<String, Object> data = new HashMap<>();
//        try {
//            // 删除用户
//            int result = baseAdminUserMapper.updateUserStatus(id,status);
//            if(result == 0){
//                data.put("code",0);
//                data.put("msg","删除用户失败");
//                logger.error("删除用户失败");
//                return data;
//            }
//            data.put("code",1);
//            data.put("msg","删除用户成功");
//            logger.info("删除用户成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//            logger.error("删除用户异常！", e);
//        }
//        return data;
//    }
//
//    @Override
//    public Map <String, Object> recoverUser(Integer id, Integer status) {
//        Map<String, Object> data = new HashMap<>();
//        try {
//            int result = baseAdminUserMapper.updateUserStatus(id,status);
//            if(result == 0){
//                data.put("code",0);
//                data.put("msg","恢复用户失败");
//            }
//            data.put("code",1);
//            data.put("msg","恢复用户成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//            logger.error("恢复用户异常！", e);
//        }
//        return data;
//    }
//
//    @Override
//    public BaseAdminUser findByUserName(String userName) {
//        return baseAdminUserMapper.findByUserName(userName);
//    }
//
//
//    @Override
//    public int updatePwd(String userName, String password) {
//        password = DigestUtils.Md5(userName,password);
//        return baseAdminUserMapper.updatePwd(userName,password);
//    }
}
