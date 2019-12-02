package cn.itsource.crm.util;

import lombok.Getter;

/**
 * @Description ajax结果的封装类
 * @Author solargen
 * @Date 2019/11/30 10:36
 * @Version v1.0
 **/
@Getter
public class AjaxResult {

    private boolean success = true;
    private String message = "操作成功!";
    private Object restObj;

    private AjaxResult(){}

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public AjaxResult setRestObj(Object restObj) {
        this.restObj = restObj;
        return this;
    }
}
