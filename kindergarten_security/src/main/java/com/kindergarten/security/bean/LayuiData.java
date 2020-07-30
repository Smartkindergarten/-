package com.kindergarten.security.bean;

import java.util.List;

public class LayuiData<T> {

    private Integer code,count;
    private String msg;
    private List<T> data;

    public LayuiData(Integer code, Integer count, String msg, List<T> data) {
        this.code = code;
        this.count = count;
        this.msg = msg;
        this.data = data;
    }

    public LayuiData() {
    }

    public LayuiData(Integer code, Integer count, List<T> data) {
        this.code = code;
        this.count = count;
        this.data = data;
    }

    public LayuiData(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "LayuiData{" +
                "code=" + code +
                ", count=" + count +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
