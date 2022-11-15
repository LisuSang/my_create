package com.myweb.utils;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class WebUtils {
    public static <T> T copyParamToBean(Map value, T bean){
        try{
            System.out.println("current"+bean);
            /**
             * 用beanutils注入user
             */
            BeanUtils.populate(bean,value);
            System.out.println("after"+bean);
        }catch (Exception e){
            e.printStackTrace();
        }
        return bean;
    }
    public static int parseInt(String strInt,int defalutValue){
        try{
            if(strInt != null)
            return Integer.parseInt(strInt);
        } catch (Exception e){
            e.printStackTrace();
        }
        return defalutValue;
    }
}
