package com.exam.service.impl;

import com.exam.pojo.TestLogDO;
import com.exam.mapper.TestLogMapper;
import com.exam.service.TestLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 考试日志表 服务实现类
 * </p>
 *
 * @author 杨德石
 * @since 2019-05-13
 */
@Service
public class TestLogServiceImpl extends ServiceImpl<TestLogMapper, TestLogDO> implements TestLogService {

}
