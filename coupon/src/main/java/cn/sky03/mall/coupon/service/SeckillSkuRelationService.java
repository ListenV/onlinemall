package cn.sky03.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.sky03.common.utils.PageUtils;
import cn.sky03.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 20:51:28
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

