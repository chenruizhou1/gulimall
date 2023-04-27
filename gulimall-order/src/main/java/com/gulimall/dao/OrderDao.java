package com.gulimall.dao;

import com.gulimall.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenruizhou
 * @email 
 * @date 2023-04-27 10:17:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
