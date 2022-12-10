package cn.sky03.mall.product.service.impl;

import cn.sky03.common.utils.PageUtils;
import cn.sky03.common.utils.Query;
import cn.sky03.mall.product.dao.AttrGroupDao;
import cn.sky03.mall.product.entity.AttrGroupEntity;
import cn.sky03.mall.product.service.AttrGroupService;
import cn.sky03.mall.product.service.AttrService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Autowired
    AttrService attrService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogId) {
//        //1、查询分组信息
//        List<AttrGroupEntity> attrGroupEntities = this.list(new QueryWrapper<AttrGroupEntity>().eq("catelog_id", catelogId));
//
//        //2、查询所有属性
//        List<AttrGroupWithAttrsVo> collect = attrGroupEntities.stream().map(group -> {
//            AttrGroupWithAttrsVo attrsVo = new AttrGroupWithAttrsVo();
//            BeanUtils.copyProperties(group,attrsVo);
//            List<AttrEntity> attrs = attrService.getRelationAttr(attrsVo.getAttrGroupId());
//            attrsVo.setAttrs(attrs);
//            return attrsVo;
//        }).collect(Collectors.toList());
//
//        return collect;
        return null;
    }
}