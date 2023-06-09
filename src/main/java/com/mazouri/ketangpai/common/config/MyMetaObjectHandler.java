package com.mazouri.ketangpai.common.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("checked", 0, metaObject);
        this.setFieldValByName("isEnd", 0, metaObject);
        this.setFieldValByName("likeNum", 0, metaObject);
        this.setFieldValByName("readNum", 0, metaObject);
        this.setFieldValByName("archived", 0, metaObject);
        this.setFieldValByName("isTop", 0, metaObject);
        this.setFieldValByName("isEssence", 0, metaObject);
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.setFieldValByName("isDeleted",0,metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
