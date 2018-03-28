package com.twein.girl.exception;

import com.twein.girl.enums.ResultEnum;

/**
 * Created by tweinyan on 28/03/2018.
 */
public class GirlException extends RuntimeException{
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
