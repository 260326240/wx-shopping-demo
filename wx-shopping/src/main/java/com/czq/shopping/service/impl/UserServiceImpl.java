package com.czq.shopping.service.impl;

import com.czq.shopping.model.User;
import com.czq.shopping.dao.UserMapper;
import com.czq.shopping.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author chenzeqiang
 * @since 2018-11-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
