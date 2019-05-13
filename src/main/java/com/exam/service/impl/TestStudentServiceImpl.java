package com.exam.service.impl;

import com.exam.pojo.TestStudentDO;
import com.exam.mapper.TestStudentMapper;
import com.exam.service.TestStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 考试-学生表 服务实现类
 * </p>
 *
 * @author 杨德石
 * @since 2019-05-13
 */
@Service
public class TestStudentServiceImpl extends ServiceImpl<TestStudentMapper, TestStudentDO> implements TestStudentService {

}
