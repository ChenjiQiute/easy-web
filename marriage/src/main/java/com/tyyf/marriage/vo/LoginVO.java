/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
public class LoginVO {
	@Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    @NotBlank(message = "手机号码不能为空")
	@ApiModelProperty(value = "手机号")
    private String mobile;
	
	@NotEmpty
	@Size(min=6 ,max= 20 ,message = "密码长度不符合标准")
	@ApiModelProperty(value = "密码")
    private String password;

}
