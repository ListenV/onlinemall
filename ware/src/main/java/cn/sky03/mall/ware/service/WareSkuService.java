package cn.sky03.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.sky03.common.utils.PageUtils;
import cn.sky03.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 21:27:23
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

