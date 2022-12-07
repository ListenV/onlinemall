package cn.sky03.mall.product;

import cn.sky03.mall.product.entity.BrandEntity;
import cn.sky03.mall.product.service.BrandService;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.util.List;

@SpringBootTest
class ProductApplicationTests {

	@Autowired
	private BrandService brandService;

	@Autowired
	OSS oss;
	@Value("${aliyun.oss.bucketName}")
	String bucketName;

	@Autowired
	OSSClient ossClient;

	@Test
	void contextLoads() {
		List<BrandEntity> lists = brandService.list();

		for ( BrandEntity brand : lists) {
			System.out.println(brand);
		}
	}

	@Test
	void aliyunOssTest(){
		// 填写Object完整路径，例如exampledir/exampleobject.txt。Object完整路径中不能包含Bucket名称。
		String objectName = "exampledir/exampleobject.txt";

		try {
			String content = "Hello OSS";
			oss.putObject(bucketName, objectName, new ByteArrayInputStream(content.getBytes()));
		} catch (OSSException oe) {
			System.out.println("Caught an OSSException, which means your request made it to OSS, "
					+ "but was rejected with an error response for some reason.");
			System.out.println("Error Message:" + oe.getErrorMessage());
			System.out.println("Error Code:" + oe.getErrorCode());
			System.out.println("Request ID:" + oe.getRequestId());
			System.out.println("Host ID:" + oe.getHostId());
		} catch (ClientException ce) {
			System.out.println("Caught an ClientException, which means the client encountered "
					+ "a serious internal problem while trying to communicate with OSS, "
					+ "such as not being able to access the network.");
			System.out.println("Error Message:" + ce.getMessage());
		} finally {
			if (oss != null) {
				oss.shutdown();
			}
		}
	}
}
