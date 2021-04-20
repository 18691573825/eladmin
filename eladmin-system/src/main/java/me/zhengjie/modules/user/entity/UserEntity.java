package me.zhengjie.modules.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 项目名称: eladmin
 * @ClassName User
 * @Description
 * @Author huipanxing huipanxing@chinasofti.com   @Date 2021/4/20 14:22
 */
@TableName("sys_user")
@Data
public class UserEntity {

    public String userId;

    public String deptId;

}
