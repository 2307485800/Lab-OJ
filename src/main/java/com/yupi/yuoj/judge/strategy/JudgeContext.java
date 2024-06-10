package com.yupi.yuoj.judge.strategy;

import com.yupi.yuoj.model.dto.question.JudgeCase;
import com.yupi.yuoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.yuoj.model.entity.Question;
import com.yupi.yuoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;//判题的信息

    private List<String> inputList;//输入信息

    private List<String> outputList;//输出信息

    private List<JudgeCase> judgeCaseList;//转换为对象的判断用列

    private Question question;//对应的题目信息

    private QuestionSubmit questionSubmit;//提交的题目信息

}
