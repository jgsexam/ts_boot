package com.exam.service.impl;

import com.exam.pojo.PaperTypeObjScoreDO;
import com.exam.mapper.PaperTypeObjScoreMapper;
import com.exam.service.PaperTypeObjScoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生-试卷-每个题型-客观题得分表（一题一分） 服务实现类
 * </p>
 *
 * @author 杨德石
 * @since 2019-05-13
 */
@Service
public class PaperTypeObjScoreServiceImpl extends ServiceImpl<PaperTypeObjScoreMapper, PaperTypeObjScoreDO> implements PaperTypeObjScoreService {

}
