/**
 * @作者 勉成翌
 * @签名 太极生两仪，两仪生四象，四象生八卦，八卦定吉凶，吉凶生大业！
 * @Email 1991993249@qq.com
 * @创建时间 2021/4/20 10:40 下午
 */
package com.mcy.mcymissyou.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = Exception.class)
    public void handleException(HttpServletRequest req, Exception e){

    }
}
