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
public class InsertUserVO {
	@ApiModelProperty(value = "手机号")
    private String mobile;
	@ApiModelProperty(value = "密码")
    private String password;

}
