package cn.sky03.mall.product.service.impl;

import cn.sky03.common.utils.PageUtils;
import cn.sky03.common.utils.Query;
import cn.sky03.mall.product.dao.AttrDao;
import cn.sky03.mall.product.dao.AttrGroupDao;
import cn.sky03.mall.product.dao.CategoryDao;
import cn.sky03.mall.product.entity.AttrEntity;
import cn.sky03.mall.product.entity.vo.AttrVo;
import cn.sky03.mall.product.service.AttrService;
import cn.sky03.mall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Autowired
    AttrGroupDao attrGroupDao;

    @Autowired
    CategoryDao categoryDao;

    @Autowired
    CategoryService categoryService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageUtils(page);
    }

    @Transactional
    @Override
    public void saveAttr(AttrVo attr) {
//        AttrEntity attrEntity = new AttrEntity();
////        attrEntity.setAttrName(attr.getAttrName());
//        BeanUtils.copyProperties(attr,attrEntity);
//        //1、保存基本数据
//        this.save(attrEntity);
//        //2、保存关联关系
//        if(attr.getAttrType() == ProductConstant.AttrEnum.ATTR_TYPE_BASE.getCode() && attr.getAttrGroupId()!=null){
//            AttrAttrgroupRelationEntity relationEntity = new AttrAttrgroupRelationEntity();
//            relationEntity.setAttrGroupId(attr.getAttrGroupId());
//            relationEntity.setAttrId(attrEntity.getAttrId());
//            relationDao.insert(relationEntity);
//        }
    }

    @Override
    public PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type) {
        return null;
//        QueryWrapper<AttrEntity> queryWrapper = new QueryWrapper<AttrEntity>().eq("attr_type","base".equalsIgnoreCase(type)?ProductConstant.AttrEnum.ATTR_TYPE_BASE.getCode():ProductConstant.AttrEnum.ATTR_TYPE_SALE.getCode());
//
//        if(catelogId != 0){
//            queryWrapper.eq("catelog_id",catelogId);
//        }
//
//        String key = (String) params.get("key");
//        if(!StringUtils.isEmpty(key)){
//            //attr_id  attr_name
//            queryWrapper.and((wrapper)->{
//                wrapper.eq("attr_id",key).or().like("attr_name",key);
//            });
//        }
//
//        IPage<AttrEntity> page = this.page(
//                new Query<AttrEntity>().getPage(params),
//                queryWrapper
//        );
//
//        PageUtils pageUtils = new PageUtils(page);
//        List<AttrEntity> records = page.getRecords();
//        List<AttrRespVo> respVos = records.stream().map((attrEntity) -> {
//            AttrRespVo attrRespVo = new AttrRespVo();
//            BeanUtils.copyProperties(attrEntity, attrRespVo);
//
//            //1、设置分类和分组的名字
//            if("base".equalsIgnoreCase(type)){
//                AttrAttrgroupRelationEntity attrId = relationDao.selectOne(new QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", attrEntity.getAttrId()));
//                if (attrId != null && attrId.getAttrGroupId()!=null) {
//                    AttrGroupEntity attrGroupEntity = attrGroupDao.selectById(attrId.getAttrGroupId());
//                    attrRespVo.setGroupName(attrGroupEntity.getAttrGroupName());
//                }
//
//            }
//
//            CategoryEntity categoryEntity = categoryDao.selectById(attrEntity.getCatelogId());
//            if (categoryEntity != null) {
//                attrRespVo.setCatelogName(categoryEntity.getName());
//            }
//            return attrRespVo;
//        }).collect(Collectors.toList());
//
//        pageUtils.setList(respVos);
//        return pageUtils;
    }

    /**
     * 根据分组id查找关联的所有基本属性
     *
     * @param attrgroupId
     * @return
     */
    @Override
    public List<AttrEntity> getRelationAttr(Long attrgroupId) {
//        List<AttrAttrgroupRelationEntity> entities = relationDao.selectList(new QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_group_id", attrgroupId));
//
//        List<Long> attrIds = entities.stream().map((attr) -> {
//            return attr.getAttrId();
//        }).collect(Collectors.toList());
//
//        if(attrIds == null || attrIds.size() == 0){
//            return null;
//        }
//        Collection<AttrEntity> attrEntities = this.listByIds(attrIds);
//        return (List<AttrEntity>) attrEntities;
        return null;
    }

}