package com.yjq.programmer.enums;


public enum RentalItemTypeEnum {

    NORMAL(1,"普通内容"),

    ILLEGAL(2,"违章内容"),

    ;

    Integer code;

    String desc;

    RentalItemTypeEnum(Integer code, String desc) {
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
