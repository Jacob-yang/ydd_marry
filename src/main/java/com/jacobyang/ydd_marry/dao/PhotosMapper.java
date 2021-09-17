package com.jacobyang.ydd_marry.dao;/**
 * @Author: JacobYang
 * @Date: 2021/9/15 10:22
 * @Description:
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacobyang.ydd_marry.entity.Photos;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: PhotosMapper
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/15 10:22
 * @Version: 1.0
 */
@Repository
@Mapper
public interface PhotosMapper extends BaseMapper<Photos> {
}
