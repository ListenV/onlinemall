package cn.sky03.mall.product.dao;

import cn.sky03.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 17:40:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
