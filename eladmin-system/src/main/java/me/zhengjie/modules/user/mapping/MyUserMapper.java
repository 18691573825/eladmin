package me.zhengjie.modules.user.mapping;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.zhengjie.modules.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 项目名称: eladmin
 * @ClassName UserMapping
 * @Description
 * @Author huipanxing huipanxing@chinasofti.com   @Date 2021/4/20 14:24
 */
@Mapper
public interface MyUserMapper extends BaseMapper<UserEntity> {
}
