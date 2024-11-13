package com.zss.commission_service.service;

import com.zss.scc.dao.entity.Commission;

import java.util.List;

public interface CommissionService {
    
    List<Commission> getCommissionByUserIdAndYm(Long userId, String ym);
    
    List<Commission> getAllCommissionByUserId(Long userId);
    
    List<Commission> getAllCommissions();
    
    Commission addCommission(Commission commission);
}
