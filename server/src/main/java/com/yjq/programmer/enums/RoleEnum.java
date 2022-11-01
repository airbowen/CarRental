package com.yjq.programmer.enums;


public enum RoleEnum {

    CUSTOMER("ghakX3if","客户"),

    SELLER("rTPGL52v","销售"),

    ADMIN("bOkASbHt","管理员"),

    ;

    String code;

    String desc;

    RoleEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
