package com.qcl.service.impl;

import com.qcl.entity.User;
import com.qcl.mapper.UserMapper;
import com.qcl.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qcl
 * @since 2021-01-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
