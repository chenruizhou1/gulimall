package com.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author chenruizhou
 * @email 
 * @date 2023-04-27 10:17:36
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

