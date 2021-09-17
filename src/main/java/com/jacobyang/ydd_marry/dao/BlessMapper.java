package com.jacobyang.ydd_marry.dao;/**
 * @Author: JacobYang
 * @Date: 2021/9/13 17:57
 * @Description:
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacobyang.ydd_marry.entity.Bless;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: BlessMapper
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/13 17:57
 * @Version: 1.0
 */
@Repository
@Mapper
public interface BlessMapper extends BaseMapper<Bless> {
}
