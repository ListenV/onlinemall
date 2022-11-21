package cn.sky03.mall.order.dao;

import cn.sky03.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 21:20:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
