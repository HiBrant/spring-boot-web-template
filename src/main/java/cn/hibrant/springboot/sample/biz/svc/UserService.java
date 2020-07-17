package cn.hibrant.springboot.sample.biz.svc;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.hibrant.springboot.sample.core.dao.UserMapper;
import cn.hibrant.springboot.sample.core.entity.User;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}
