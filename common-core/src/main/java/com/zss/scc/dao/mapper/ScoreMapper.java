package com.zss.scc.dao.mapper;

import com.zss.scc.dao.entity.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScoreMapper {
    
    List<Score> getAllScore();
    
    List<Score> getScoreByUserId(Long userId);
    
    Score getScoreByUserIdAndYm(Long userId, String ym);
    
    Score getScoreByCompCodeAndUserIdAndYm(String compCode, Long userId, String ym);
}
