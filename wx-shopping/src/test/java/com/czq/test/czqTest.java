package com.czq.test;

import java.sql.Time;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.injector.methods.SelectPage;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.toolkit.PackageHelper;
import com.czq.shopping.dao.UserMapper;
import com.czq.shopping.model.User;
import com.czq.shopping.service.IUserService;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class czqTest {
	@Autowired
	IUserService iUserService;
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void czq() {
		List<User> user = userMapper.selectList(null);  
		
		for (Iterator iterator = user.iterator(); iterator.hasNext();) {
			User user2 = (User) iterator.next();
			System.out.println(user2.toString());
		}
//		System.out.println("----------===============");
//        IPage<User> page=new Page(1,5);
//        page = userMapper.selectPage(page, null);
//        user = page.getRecords();
//    	for (Iterator iterator = user.iterator(); iterator.hasNext();) {
//			User user2 = (User) iterator.next();
//			System.out.println(user2.toString());
//		}
		
//		   EntityWrapper<User> wrapper = new EntityWrapper<User>();
//	        wrapper.eq("name", "666");
//	        UserEntity u2 = userService.selectOne(wrapper);
//		for(int i =1;i<=1000;i++)
//		{
//			userMapper.insert(new User((long)i,i+"",i,0));
//		}
	}
}
