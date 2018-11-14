package com.czq.shopping.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czq.shopping.dao.UserMapper;
import com.czq.shopping.model.User;
import com.czq.shopping.service.IUserService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * <p>
 * 系统用户表 前端控制器
 * </p>
 *
 * @author chenzeqiang
 * @since 2018-11-13
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserMapper userMapper;
	
	@RequestMapping("/test")
	public String czqTest(Map<String,Object> model ) {
		List<User> user =userMapper.selectList(null);
		model.put("user", user);
		return "/index";
	}
	@RequestMapping("page")
	public String czqPagetest(Map<String,Object> model) {
      IPage<User> page=new Page(1,5);
      page = userMapper.selectPage(page, null);
//      page.getCurrent();//默认页
//      page.getPages();//当前总分页数；
//      page.getSize();//总页数
//      page.getTotal();//总条数
      model.put("page", page);
		return "/indexPage";
	}
}

