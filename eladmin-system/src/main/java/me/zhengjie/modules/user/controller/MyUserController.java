package me.zhengjie.modules.user.controller;

import cn.hutool.core.bean.BeanUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.zhengjie.modules.user.dto.UserDto;
import me.zhengjie.modules.user.entity.UserEntity;
import me.zhengjie.modules.user.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称: eladmin
 * @ClassName UserController
 * @Description
 * @Author huipanxing huipanxing@chinasofti.com   @Date 2021/4/20 14:20
 */
@Api(tags = "用户测试接口")
@RestController
@RequestMapping("/user")
public class MyUserController {


    @Autowired
    public MyUserService myUserService;

    @ApiOperation("获取用户")
    @GetMapping(value = "/get")
    public ResponseEntity<UserDto> getUser(@RequestParam("id") String id){
        UserEntity userEntity = myUserService.getById(id);
        UserDto userDto = BeanUtil.copyProperties(userEntity, UserDto.class);
        return new ResponseEntity(userDto, HttpStatus.OK);
    }
}
