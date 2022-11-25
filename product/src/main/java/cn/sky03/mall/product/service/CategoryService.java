package cn.sky03.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.sky03.common.utils.PageUtils;
import cn.sky03.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 17:40:24
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

