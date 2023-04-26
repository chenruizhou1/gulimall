package com.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author chenruizhou
 * @email 
 * @date 2023-04-26 17:22:12
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

