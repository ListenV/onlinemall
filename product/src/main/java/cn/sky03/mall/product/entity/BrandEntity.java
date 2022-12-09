package cn.sky03.mall.product.entity;

import cn.sky03.common.valid.AddGroup;
import cn.sky03.common.valid.DeleteGroup;
import cn.sky03.common.valid.UpdateGroup;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 * 
 * @author sky03
 * @email i@sky03.cn
 * @date 2022-11-21 17:40:24
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	@NotNull(message = "修改、删除必须指定id", groups = {UpdateGroup.class, DeleteGroup.class})
	@Null(message = "新增不能指定ID", groups = AddGroup.class)
	private Long brandId;
	/**
	 * 品牌名
	 */

	@NotBlank(message = "品牌名必须提交！", groups = {AddGroup.class, UpdateGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotEmpty(groups = AddGroup.class)
	@URL(message = "logo必须是合法URL地址！", groups = AddGroup.class)
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "^[a-zA-Z]$")
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull(groups = AddGroup.class)
	@Min(value =0 ,message = "排序必须要大于等于0", groups = AddGroup.class)
	private Integer sort;

}
