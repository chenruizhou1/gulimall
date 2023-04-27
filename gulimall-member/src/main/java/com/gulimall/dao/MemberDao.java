package com.gulimall.dao;

import com.gulimall.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenruizhou
 * @email 
 * @date 2023-04-27 16:15:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
