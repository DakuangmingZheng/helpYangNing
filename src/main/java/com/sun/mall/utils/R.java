package com.sun.mall.utils;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.io.Serializable;
import java.util.HashMap;

public class R extends HashMap<String,Object> implements Serializable {
    private static final String REQ = "success";
    private static final String CODE = "code";
    private static final String MSG = "message";
    private static final String DATA = "data";


    R(boolean success,String code, String msg,Object data){
        super.put(REQ,success);
        super.put(CODE,code);
        super.put(MSG,msg);
        super.put(DATA,data);

    }
    R(boolean success,String code, String msg){
        super.put(REQ,success);
        super.put(CODE,code);
        super.put(MSG,msg);

    }
    public static R ok(Object data){
        return new R(true,"200","success",data);
    }
    public static R fail(String msg){
        return new R(false,"500",msg,null);
    }
}
