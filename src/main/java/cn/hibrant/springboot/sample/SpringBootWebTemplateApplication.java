package cn.hibrant.springboot.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(basePackages = "cn.hibrant.springboot.sample.core.dao", annotationClass = Repository.class)
public class SpringBootWebTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebTemplateApplication.class, args);
	}
}
