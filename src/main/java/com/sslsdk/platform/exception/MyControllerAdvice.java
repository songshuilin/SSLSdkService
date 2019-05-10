package com.sslsdk.platform.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/03--09:18
 */
@ControllerAdvice
public class MyControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder){
        System.out.println("initBinder");
    }

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("author","游戏人日程");
    }

    /**
     * 处理系统的异常
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex){
        Map map=new HashMap();
        map.put("errno",100);
        map.put("error",ex.getMessage());
        return  map;
    }

    /**
     * 处理自己的异常
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = ControllerException.class)
    public Map myErrorHandler(ControllerException ex){
        Map map=new HashMap();
        map.put("errno",ex.getCode());
        map.put("error",ex.getMsg());
        return  map;
    }
}
