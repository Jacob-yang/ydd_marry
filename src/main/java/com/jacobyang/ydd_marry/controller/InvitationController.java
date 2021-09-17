package com.jacobyang.ydd_marry.controller;/**
 * @Author: JacobYang
 * @Date: 2021/9/13 16:57
 * @Description:
 */

import com.jacobyang.ydd_marry.entity.Invitation;
import com.jacobyang.ydd_marry.service.InvitationService;
import com.jacobyang.ydd_marry.web.response.Result;
import com.jacobyang.ydd_marry.web.response.ResultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: InvitationController
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/13 16:57
 * @Version: 1.0
 */
@RestController
@RequestMapping("/invitation")
public class InvitationController extends ResultController {

    Map map = new HashMap<>();
    @Autowired
    private InvitationService service;
    @GetMapping("/get")
    public Result getInvitation(){
        Invitation obj = service.getById(1);
        return success(obj);

    }
}
