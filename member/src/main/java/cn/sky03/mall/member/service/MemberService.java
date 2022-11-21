package cn.sky03.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.sky03.common.utils.PageUtils;
import cn.sky03.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 21:01:50
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

