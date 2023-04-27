package com.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chenruizhou
 * @email 
 * @date 2023-04-27 16:15:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

