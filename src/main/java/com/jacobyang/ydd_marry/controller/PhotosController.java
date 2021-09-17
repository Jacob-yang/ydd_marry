package com.jacobyang.ydd_marry.controller;/**
 * @Author: JacobYang
 * @Date: 2021/9/15 10:18
 * @Description:
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.jacobyang.ydd_marry.entity.Bless;
import com.jacobyang.ydd_marry.entity.Invitation;
import com.jacobyang.ydd_marry.entity.Photos;
import com.jacobyang.ydd_marry.service.InvitationService;
import com.jacobyang.ydd_marry.service.PhotosService;
import com.jacobyang.ydd_marry.web.response.Result;
import com.jacobyang.ydd_marry.web.response.ResultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: PhotosController
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/15 10:18
 * @Version: 1.0
 */
@RestController
@RequestMapping("/photo")
public class PhotosController extends ResultController{
    Map map = new HashMap<>();
    @Autowired
    private PhotosService service;

    @GetMapping("/get")
    public Result getInvitation(String video){
        if(StringUtils.isNotEmpty(video)){
            Photos byId = service.getById(1);
            return success(byId);
        }
        QueryWrapper<Photos> wrapper = new QueryWrapper();
        wrapper.ge("id",2);
        List<Photos> list = service.list(wrapper);
        return success(list);
    }
}
