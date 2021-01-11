package com.qcl.service.impl;

import com.qcl.entity.Blog;
import com.qcl.mapper.BlogMapper;
import com.qcl.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {


}
