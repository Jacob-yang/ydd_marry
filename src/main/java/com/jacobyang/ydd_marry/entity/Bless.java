package com.jacobyang.ydd_marry.entity;/**
 * @Author: JacobYang
 * @Date: 2021/9/13 17:54
 * @Description:
 */

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: Bless
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/13 17:54
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bless {
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    private String openId;

    private String avatarUrl;

    private String nickName;

    @TableField(fill = FieldFill.INSERT)        // 新增的时候填充数据
    private Date createTime;

}
