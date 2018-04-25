/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.vo;

import java.util.Date;

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
public class UpdateUserVO {
	@ApiModelProperty(value = "id")
    private String uuid;
	@ApiModelProperty(value = "手机号")
    private String mobile;
	@ApiModelProperty(value = "电子邮箱地址")
    private String email;
	@ApiModelProperty(value = "密码")
    private String password;
	@ApiModelProperty(value = "微信账户")
	private String wechatAccount;
	@ApiModelProperty(value = "支付宝账户")
    private String alipayAccount;
	@ApiModelProperty(value = "是否会员")
    private Integer accountType;
	@ApiModelProperty(value = "推荐人")
    private String recommendPersion;
	@ApiModelProperty(value = "删除状态")
    private Integer deleteType;
}
