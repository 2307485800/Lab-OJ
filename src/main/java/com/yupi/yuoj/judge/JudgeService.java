package com.yupi.yuoj.judge;

import com.yupi.yuoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;


public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
