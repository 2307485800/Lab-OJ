package com.yupi.yuoj.judge.strategy;

import com.yupi.yuoj.judge.codesandbox.model.JudgeInfo;
import org.springframework.stereotype.Service;

@Service
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
