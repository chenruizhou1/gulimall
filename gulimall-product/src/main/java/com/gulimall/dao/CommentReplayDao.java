package com.gulimall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author chenruizhou
 * @email 
 * @date 2023-04-26 17:22:12
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
