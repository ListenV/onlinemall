package cn.sky03.mall.product.service;

import cn.sky03.common.utils.PageUtils;
import cn.sky03.mall.product.entity.AttrGroupEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 属性分组
 *
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 17:40:24
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);
}

