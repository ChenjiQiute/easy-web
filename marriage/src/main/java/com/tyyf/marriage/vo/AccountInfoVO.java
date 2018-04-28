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
 * @date 创建时间: 2018年4月26日 上午11:14:52  
 * @Email chenjiqiute@msfintech.com
 */
@Getter
@Setter
public class AccountInfoVO {
	@ApiModelProperty(value = "详情id")
	private String uuidCustomer;
	@ApiModelProperty(value = "真实姓名")
    private String realName;
	@ApiModelProperty(value = "昵称")
    private String nickName;
	@ApiModelProperty(value = "性别")
    private Integer gender;
	@ApiModelProperty(value = "年龄")
    private Integer age;
	@ApiModelProperty(value = "身高")
    private Integer height;
	@ApiModelProperty(value = "体重")
    private Integer weight;
	@ApiModelProperty(value = "教育情况")
    private String education;
	@ApiModelProperty(value = "月收入")
    private String salary;
	@ApiModelProperty(value = "单身情况")
    private String singleStatus;
	@ApiModelProperty(value = "子女状态")
    private Integer childStatus;
	@ApiModelProperty(value = "购房情况")
    private String houseStatus;
	@ApiModelProperty(value = "购车情况")
    private String carStatus;
	@ApiModelProperty(value = "自我介绍")
    private String introduction;
	@ApiModelProperty(value = "工作城市")
    private String workingCity;
	@ApiModelProperty(value = "职业")
    private String occupation;
	@ApiModelProperty(value = "兴趣爱好")
    private String hobby;
	@ApiModelProperty(value = "居住地")
    private String domicile;
}
