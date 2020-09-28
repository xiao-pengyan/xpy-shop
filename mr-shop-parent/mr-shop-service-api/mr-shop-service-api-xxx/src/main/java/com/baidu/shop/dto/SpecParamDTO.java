package com.baidu.shop.dto;

import com.baidu.shop.validate.group.MrOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName SpecParamDTO
 * @Description: TODO
 * @Author xiaopengyan
 * @Date 2020/9/3
 * @Version V1.0
 **/
@Data
@ApiModel(value = "规格参数传输DTO")
public class SpecParamDTO {

    @ApiModelProperty(value = "主键",example = "1")
    @NotNull(message = "id不能为空",groups = {MrOperation.Update.class})
    private Integer id;

    @ApiModelProperty(value = "商品分类id",example = "1")
    private Integer cid;

    @ApiModelProperty(value = "规格组id",example = "1")
    private Integer groupId;

    @ApiModelProperty(value = "规格参数名称")
    private String name;

    @ApiModelProperty(value = "是否是数字类型参数，true或false",example = "0")
    @NotNull(message = "是否是数字类型参数不能为空",groups = {MrOperation.Add.class,MrOperation.Update.class})
    private Boolean numeric;

    @ApiModelProperty(value = "数字类型参数的单位，非数字类型可以为空")
    private String unit;

    @ApiModelProperty(value = "是否是sku通用属性，true或false",example = "0")
    @NotNull(message = "是否是sku通用属性不能为空",groups = {MrOperation.Update.class,MrOperation.Add.class})
    private Boolean generic;

    @ApiModelProperty(value = "是否用于搜索过滤，true或false",example = "0")
    @NotNull(message = "是否用于搜索过滤不能为空",groups = {MrOperation.Add.class,MrOperation.Update.class})
    private Boolean searching;

    @ApiModelProperty(value = "数值类型参数，如果需要搜索，则添加分段间隔值")
    private String segments;

}
