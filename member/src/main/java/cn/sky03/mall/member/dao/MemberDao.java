package cn.sky03.mall.member.dao;

import cn.sky03.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 21:01:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
