package com.yupi.yuoj;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.yuoj.MainApplication;
import com.yupi.yuoj.mapper.QuestionMapper;
import com.yupi.yuoj.mapper.QuestionSubmitMapper;
import com.yupi.yuoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yupi.yuoj.model.entity.QuestionSubmit;
import com.yupi.yuoj.service.QuestionSubmitService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class springtest {

    @Resource
    private QuestionSubmitService questionSubmitService;

@Resource
private QuestionSubmitMapper questionSubmitMapper;
    @Test
    void test(){
        long id=1784176355148050433L;
        QuestionSubmit questionSubmit = questionSubmitMapper.selectById(id);
        if (questionSubmit == null) {
            // 如果查询结果为空，则返回空的分页对象
            System.out.println("klong");
        }
        int current=1;
        int size=5;
        // 构造分页对象
        Page<QuestionSubmit> page = new Page<>(current, size);
        // 构造查询条件
        LambdaQueryWrapper<QuestionSubmit> queryWrapper = new QueryWrapper<QuestionSubmit>().lambda()
                .eq(QuestionSubmit::getUserId, id);


        // 执行分页查询
        Page<QuestionSubmit> questionSubmitPage = questionSubmitMapper.selectPage(page, queryWrapper);
        System.out.println(questionSubmitPage);
    }


}
