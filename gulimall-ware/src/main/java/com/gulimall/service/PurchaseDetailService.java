package com.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenruizhou
 * @email 
 * @date 2023-04-27 16:18:47
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

