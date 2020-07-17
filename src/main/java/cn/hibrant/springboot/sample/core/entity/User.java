package cn.hibrant.springboot.sample.core.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("t_user")
public class User {

	@TableId(type = IdType.AUTO)
	private int id;
	private String loginId;
	private String password;
	private String username;
	private int kind;
	private int status;
	private Date createtime;
	private Date updatetime;
}
