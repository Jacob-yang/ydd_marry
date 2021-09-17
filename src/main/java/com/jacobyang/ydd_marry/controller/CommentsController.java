package com.jacobyang.ydd_marry.controller;/**
 * @Author: JacobYang
 * @Date: 2021/9/16 11:22
 * @Description:
 */

import com.jacobyang.ydd_marry.entity.Bless;
import com.jacobyang.ydd_marry.entity.Comments;
import com.jacobyang.ydd_marry.service.CommentsService;
import com.jacobyang.ydd_marry.web.response.Result;
import com.jacobyang.ydd_marry.web.response.ResultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: CommentsController
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/16 11:22
 * @Version: 1.0
 */
@RestController
@RequestMapping("/comments")
public class CommentsController extends ResultController {

    @Autowired
    private CommentsService service;

    @GetMapping("/get")
    public Result getBless(){
        List<Comments> list = service.list();
        return success(list);

    }

    @PostMapping("/add")
    public Result Add(@RequestBody Comments comments){
        boolean save = service.save(comments);
        return success(save);

    }


}
