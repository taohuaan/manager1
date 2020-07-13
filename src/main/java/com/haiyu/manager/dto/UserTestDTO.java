package com.haiyu.manager.dto;

import lombok.Data;

@Data
public class UserTestDTO {

    private Integer id;

    private String username;

    private String sex;

    private String city;

    private String sign;

    private String experience;

    private String socre;

    private String classify;

    private String wealth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSocre() {
        return socre;
    }

    public void setSocre(String socre) {
        this.socre = socre;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getWealth() {
        return wealth;
    }

    public void setWealth(String wealth) {
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return "UserTestDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", sign='" + sign + '\'' +
                ", experience='" + experience + '\'' +
                ", socre='" + socre + '\'' +
                ", classify='" + classify + '\'' +
                ", wealth='" + wealth + '\'' +
                '}';
    }
}
