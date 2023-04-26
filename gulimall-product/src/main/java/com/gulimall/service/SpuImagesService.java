package com.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chenruizhou
 * @email 
 * @date 2023-04-26 17:22:12
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

