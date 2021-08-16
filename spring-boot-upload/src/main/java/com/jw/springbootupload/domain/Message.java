package com.jw.springbootupload.domain;

/**
 * @program: spring-boot-action
 * @description: 返回实体
 * @author: jiankai
 * @create: 2021-08-16 15:12
 **/
public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
