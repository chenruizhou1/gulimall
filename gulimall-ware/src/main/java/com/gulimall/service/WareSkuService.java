package com.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author chenruizhou
 * @email 
 * @date 2023-04-27 16:18:47
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

