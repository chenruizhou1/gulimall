package com.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author chenruizhou
 * @email 
 * @date 2023-04-27 10:17:36
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

