package com.jacobyang.ydd_marry.dao;/**
 * @Author: JacobYang
 * @Date: 2021/9/13 17:03
 * @Description:
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacobyang.ydd_marry.entity.Invitation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: InvitationMapper
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/13 17:03
 * @Version: 1.0
 */
@Repository
@Mapper
public interface InvitationMapper extends BaseMapper<Invitation> {
}
