package com.jacobyang.ydd_marry.controller;/**
 * @Author: JacobYang
 * @Date: 2021/9/13 17:55
 * @Description:
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jacobyang.ydd_marry.entity.Bless;
import com.jacobyang.ydd_marry.entity.Invitation;
import com.jacobyang.ydd_marry.service.BlessService;
import com.jacobyang.ydd_marry.service.InvitationService;
import com.jacobyang.ydd_marry.web.response.Result;
import com.jacobyang.ydd_marry.web.response.ResultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Wrapper;
import java.util.List;

/**
 * @ClassName: BlessController
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/13 17:55
 * @Version: 1.0
 */
@RestController
@RequestMapping("/bless")
public class BlessController extends ResultController {

    @Autowired
    private BlessService service;
    @GetMapping("/get")
    public Result getBless(){
        List<Bless> list = service.list();
        return success(list);

    }
    @GetMapping("/get/openid")
    public Result getBlessByOpenid( String openId){
        QueryWrapper<Bless> wrapper = new QueryWrapper();
        wrapper.eq("open_id",openId);
        Bless one = service.getOne(wrapper);
        return success(one);

    }
    @PostMapping("/add")
    public Result Add(@RequestBody Bless bless){
        boolean save = service.save(bless);
        return success(save);

    }

}
