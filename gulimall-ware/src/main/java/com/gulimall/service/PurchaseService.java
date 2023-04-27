package com.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author chenruizhou
 * @email 
 * @date 2023-04-27 16:18:47
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

