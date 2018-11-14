package com.czq.shopping.service.impl;

import com.czq.shopping.model.Config;
import com.czq.shopping.dao.ConfigMapper;
import com.czq.shopping.service.IConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenzeqiang
 * @since 2018-11-09
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements IConfigService {

}
