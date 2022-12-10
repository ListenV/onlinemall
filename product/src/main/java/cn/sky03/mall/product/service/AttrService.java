package cn.sky03.mall.product.service;

import cn.sky03.common.utils.PageUtils;
import cn.sky03.mall.product.entity.AttrEntity;
import cn.sky03.mall.product.entity.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 17:40:24
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    @Transactional
    void saveAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrGroupId);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);
}

