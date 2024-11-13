package com.zss.scc.dao.mapper;

import com.zss.scc.dao.entity.Commission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommissionMapper {
    
    List<Commission> selectCommissionByUserIdAndYm(Long id, String ym);
    
    Commission selectCommissionByCompCodeAndUserIdAndYm(String compCode,Long userId,String ym);
    
    List<Commission> selectCommissionListByUserId(Long userId);
    
    List<Commission> selectAllCommission();
    
    Commission addCommission(Commission commission);
    
    
}
