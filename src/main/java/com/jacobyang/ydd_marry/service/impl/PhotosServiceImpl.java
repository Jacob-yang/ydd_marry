package com.jacobyang.ydd_marry.service.impl;/**
 * @Author: JacobYang
 * @Date: 2021/9/15 10:21
 * @Description:
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobyang.ydd_marry.dao.PhotosMapper;
import com.jacobyang.ydd_marry.entity.Photos;
import com.jacobyang.ydd_marry.service.PhotosService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PhotosServiceImpl
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/15 10:21
 * @Version: 1.0
 */
@Service
public class PhotosServiceImpl extends ServiceImpl<PhotosMapper, Photos> implements PhotosService {
}
