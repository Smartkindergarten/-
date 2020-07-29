package com.kindergarten.security.bean;

public class Security {

    private int id,sex,age,phone,rid,securityState;
    private String securityName,securityPwd,securityAdd,securityRegtime;

    public Security() {
    }

    public Security(int id, int sex, int age, int phone, int rid, int securityState, String securityName, String securityPwd, String securityAdd, String securityRegtime) {
        this.id = id;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.rid = rid;
        this.securityState = securityState;
        this.securityName = securityName;
        this.securityPwd = securityPwd;
        this.securityAdd = securityAdd;
        this.securityRegtime = securityRegtime;
    }

    @Override
    public String toString() {
        return "Security{" +
                "id=" + id +
                ", sex=" + sex +
                ", age=" + age +
                ", phone=" + phone +
                ", rid=" + rid +
                ", securityState=" + securityState +
                ", securityName='" + securityName + '\'' +
                ", securityPwd='" + securityPwd + '\'' +
                ", securityAdd='" + securityAdd + '\'' +
                ", securityRegtime='" + securityRegtime + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getSecurityState() {
        return securityState;
    }

    public void setSecurityState(int securityState) {
        this.securityState = securityState;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityPwd() {
        return securityPwd;
    }

    public void setSecurityPwd(String securityPwd) {
        this.securityPwd = securityPwd;
    }

    public String getSecurityAdd() {
        return securityAdd;
    }

    public void setSecurityAdd(String securityAdd) {
        this.securityAdd = securityAdd;
    }

    public String getSecurityRegtime() {
        return securityRegtime;
    }

    public void setSecurityRegtime(String securityRegtime) {
        this.securityRegtime = securityRegtime;
    }
}
