package com.zss.score_service.service;

import com.zss.scc.dao.entity.Score;

import java.util.List;

public interface ScoreService {
    
    Score getScoreByUserIdAndYm(Long userId, String ym);
    
    Score getScoreByCompCodeAndUserIdAndYm(String compCode, Long userId, String ym);
    
    List<Score> getScoreByUserId(Long userId);
    
    List<Score> getAllScore();
}
