package com.jacobyang.ydd_marry.service.impl;/**
 * @Author: JacobYang
 * @Date: 2021/9/13 16:59
 * @Description:
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobyang.ydd_marry.dao.InvitationMapper;
import com.jacobyang.ydd_marry.entity.Invitation;
import com.jacobyang.ydd_marry.service.InvitationService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: InvitationServiceImpl
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/13 16:59
 * @Version: 1.0
 */
@Service
public class InvitationServiceImpl extends ServiceImpl<InvitationMapper,Invitation> implements InvitationService {
}
