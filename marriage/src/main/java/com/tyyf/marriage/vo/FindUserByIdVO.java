/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月24日 下午5:24:57
 * @Email chenjiqiute@msfintech.com
 */
@Getter
@Setter
public class FindUserByIdVO {
	@ApiModelProperty(value = "id")
    private String id;
	@ApiModelProperty(value = "手机号")
    private String mobile;
	@ApiModelProperty(value = "电子邮箱地址")
    private String email;
	@ApiModelProperty(value = "微信账户")
	private String wechatAccount;
	@ApiModelProperty(value = "支付宝账户")
    private String alipayAccount;
	@ApiModelProperty(value = "是否会员")
    private Integer accountType;
	@ApiModelProperty(value = "推荐人")
    private String recommendPersion;
}
