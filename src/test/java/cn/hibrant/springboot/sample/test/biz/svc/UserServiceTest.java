package cn.hibrant.springboot.sample.test.biz.svc;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.hibrant.springboot.sample.biz.consts.UserKind;
import cn.hibrant.springboot.sample.biz.svc.UserService;
import cn.hibrant.springboot.sample.core.entity.User;
import cn.hibrant.springboot.sample.test.SpringBootTestBase;

public class UserServiceTest extends SpringBootTestBase {

	@Autowired
	private UserService userSvc;
	
	@Test
	public void test() throws JsonProcessingException {
		User user = new User();
		user.setLoginId("liujian" + System.currentTimeMillis());
		user.setPassword("123");
		user.setUsername("刘剑");
		user.setKind(UserKind.normal.getValue());
		userSvc.save(user);
		System.out.println(user.getId());
		
		List<User> userList = userSvc.list(new QueryWrapper<User>().lambda().eq(User::getUsername, "刘剑"));
		System.out.println(new ObjectMapper().writeValueAsString(userList));
	}
}
