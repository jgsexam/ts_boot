package com.exam.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 考试日志表
 * </p>
 *
 * @author 杨德石
 * @since 2019-05-13
 */
@TableName("ts_test_log")
public class TestLogDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "log_id", type = IdType.AUTO)
    private String logId;

    /**
     * 考试时间
     */
    private String logTime;

    /**
     * 考场
     */
    private String logRoom;

    /**
     * 考试人数
     */
    private Integer logStudentNum;

    /**
     * 考试试卷名
     */
    private String logTitle;

    /**
     * 及格率
     */
    private BigDecimal logPass;

    /**
     * 乐观锁
     */
    private Integer logVersion;

    /**
     * 1正常0删除
     */
    private Integer logDelete;


    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    public String getLogRoom() {
        return logRoom;
    }

    public void setLogRoom(String logRoom) {
        this.logRoom = logRoom;
    }

    public Integer getLogStudentNum() {
        return logStudentNum;
    }

    public void setLogStudentNum(Integer logStudentNum) {
        this.logStudentNum = logStudentNum;
    }

    public String getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(String logTitle) {
        this.logTitle = logTitle;
    }

    public BigDecimal getLogPass() {
        return logPass;
    }

    public void setLogPass(BigDecimal logPass) {
        this.logPass = logPass;
    }

    public Integer getLogVersion() {
        return logVersion;
    }

    public void setLogVersion(Integer logVersion) {
        this.logVersion = logVersion;
    }

    public Integer getLogDelete() {
        return logDelete;
    }

    public void setLogDelete(Integer logDelete) {
        this.logDelete = logDelete;
    }

    @Override
    public String toString() {
        return "TestLogDO{" +
        "logId=" + logId +
        ", logTime=" + logTime +
        ", logRoom=" + logRoom +
        ", logStudentNum=" + logStudentNum +
        ", logTitle=" + logTitle +
        ", logPass=" + logPass +
        ", logVersion=" + logVersion +
        ", logDelete=" + logDelete +
        "}";
    }
}
