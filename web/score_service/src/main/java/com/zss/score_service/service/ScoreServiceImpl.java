package com.zss.score_service.service;

import com.zss.scc.dao.entity.Score;
import com.zss.scc.dao.mapper.ScoreMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {
    
    @Resource
    private ScoreMapper scoreMapper;
    
    @Override
    public Score getScoreByUserIdAndYm(Long userId, String ym) {
        return scoreMapper.getScoreByUserIdAndYm(userId, ym);
    }
    
    @Override
    public Score getScoreByCompCodeAndUserIdAndYm(String compCode, Long userId, String ym) {
        return scoreMapper.getScoreByCompCodeAndUserIdAndYm(compCode, userId, ym);
    }
    
    @Override
    public List<Score> getScoreByUserId(Long userId) {
        return scoreMapper.getScoreByUserId(userId);
    }
    
    @Override
    public List<Score> getAllScore() {
        List<Score> result  = scoreMapper.getAllScore();
        System.out.println(result);
        return result;
    }
}
