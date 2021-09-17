package com.jacobyang.ydd_marry.entity;/**
 * @Author: JacobYang
 * @Date: 2021/9/16 11:24
 * @Description:
 */

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: Comments
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/16 11:24
 * @Version: 1.0
 */
@Data
public class Comments {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String openId;

    private String avatarUrl;

    private String nickName;

    @TableField(fill = FieldFill.INSERT)        // 新增的时候填充数据
    private Date createTime;

    private String words;

    private String color;
}
