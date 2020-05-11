package vn.com.cyberlogitec.practice3;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisRead {

	private static ApplicationContext ctx;

	public static void main(String[] args) throws NullPointerException, IOException {
		
		ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
	}

}
