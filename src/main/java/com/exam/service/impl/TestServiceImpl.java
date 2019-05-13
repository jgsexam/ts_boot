package com.exam.service.impl;

import com.exam.pojo.TestDO;
import com.exam.mapper.TestMapper;
import com.exam.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 考试表 服务实现类
 * </p>
 *
 * @author 杨德石
 * @since 2019-05-13
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestDO> implements TestService {

}
