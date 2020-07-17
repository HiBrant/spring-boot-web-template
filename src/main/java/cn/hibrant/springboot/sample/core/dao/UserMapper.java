package cn.hibrant.springboot.sample.core.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import cn.hibrant.springboot.sample.core.entity.User;

@Repository
public interface UserMapper extends BaseMapper<User> {

}
