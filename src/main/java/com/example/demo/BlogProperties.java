package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class BlogProperties {
    @Value("${com.didispace.blog.name}")
    private String name;

    @Value("${com.didispace.blog.title}")
    private String title;
    /**
    * 设置
    */
    public void setName(String name){
        this.name=name;
    }
    /**
     * 获取
     */
    public String getName(){
        return this.name;
    }

    /**
     * 设置
     */
    public void setTitle(String title){
        this.title=title;
    }
    /**
     * 获取
     */
    public String getTitle(){
        return this.title;
    }

}
