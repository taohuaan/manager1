package com.haiyu.manager.pojo;

import javax.persistence.*;

@Table(name = "positionmanage")
public class BasePosition {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 省名称
     */
    @Column(name = "provincename")
    private String provinceName;

    /**
     * 市名称
     */
    @Column(name = "cityname")
    private String cityName;


    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private String updateTime;

    /**
     * 获取权限角色ID
     *
     * @return id - 权限角色ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置权限角色ID
     *
     * @param id 权限角色ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取省名称
     *
     * @return provinceName - 省名称
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 设置省名称
     *
     * @param provinceName 省名称
     */
    public void setRoleName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 获取市名称
     *
     * @return cityName - 市名称
     */
    public String getcityName() {
        return cityName;
    }

    /**
     * 设置市名称
     *
     * @param cityName 市名称
     */
    public void setcityName(String cityName) {
        this.cityName = cityName;
    }


    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


}