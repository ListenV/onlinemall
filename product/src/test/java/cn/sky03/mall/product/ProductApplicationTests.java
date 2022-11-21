package cn.sky03.mall.product;

import cn.sky03.mall.product.entity.BrandEntity;
import cn.sky03.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {

	@Autowired
	private BrandService brandService;

	@Test
	void contextLoads() {
		List<BrandEntity> lists = brandService.list();

		for ( BrandEntity brand : lists) {
			System.out.println(brand);
		}
	}

}
