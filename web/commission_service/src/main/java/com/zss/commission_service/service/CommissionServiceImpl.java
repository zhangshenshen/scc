package com.zss.commission_service.service;

import com.zss.scc.dao.entity.Commission;
import com.zss.scc.dao.mapper.CommissionMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommissionServiceImpl implements CommissionService {
    
    @Resource
    private CommissionMapper commissionMapper;
    
    
    @Override
    public List<Commission> getCommissionByUserIdAndYm(Long userId, String ym) {
        return commissionMapper.selectCommissionByUserIdAndYm(userId, ym);
    }
    
    @Override
    public List<Commission> getAllCommissionByUserId(Long userId) {
        return commissionMapper.selectCommissionListByUserId(userId);
    }
    
    @Override
    public List<Commission> getAllCommissions() {
        return commissionMapper.selectAllCommission();
    }
    
    @Override
    public Commission addCommission(Commission commission) {
        return commissionMapper.addCommission(commission);
    }
    
    
}
