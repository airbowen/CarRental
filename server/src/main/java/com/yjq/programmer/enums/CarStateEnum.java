package com.yjq.programmer.enums;


public enum CarStateEnum {

    WAIT(1,"待出租"),

    ALREADY(2,"已出租"),

    ;

    Integer code;

    String desc;

    CarStateEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
