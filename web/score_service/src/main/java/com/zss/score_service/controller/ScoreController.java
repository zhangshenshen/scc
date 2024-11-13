package com.zss.score_service.controller;


import com.zss.scc.dao.entity.Score;
import com.zss.score_service.service.ScoreService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class ScoreController {
    
    @Resource
    private ScoreService scoreService;
    
    
    @GetMapping("/score/{$userId}")
    @ResponseBody
    public Score getScoreByUserIdAndYm(@PathVariable Long userId, @BindParam("ym") String ym) {
        if (ym == null) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
            ym = sdf.format(date);
            System.out.println("生成的ym字符串为：" + ym);
        }
        
        return scoreService.getScoreByUserIdAndYm(userId, ym);
    }
    
    @GetMapping("/all")
    @ResponseBody
    public List<Score> getAllScores() {
        return scoreService.getAllScore();
    }
    
}
