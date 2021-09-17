package com.jacobyang.ydd_marry.service.impl;/**
 * @Author: JacobYang
 * @Date: 2021/9/16 11:26
 * @Description:
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobyang.ydd_marry.dao.CommentsMapper;
import com.jacobyang.ydd_marry.entity.Comments;
import com.jacobyang.ydd_marry.service.CommentsService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: CommentsServiceImpl
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/16 11:26
 * @Version: 1.0
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements CommentsService {
}
