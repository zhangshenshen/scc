package com.zss.commission_service.controller;

import com.zss.commission_service.service.CommissionService;
import com.zss.scc.dao.entity.Commission;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class CommissionController {
    
    @Resource
    private CommissionService commissionService;
    
    
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    
    
    @GetMapping("/{$userId}")
    @ResponseBody
    public List<Commission> getCommissionByUserIdAndYm(@PathVariable Long userId, @RequestParam("ym") String ym) {
        if (ym == null) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
            ym = sdf.format(date);
            System.out.println("生成的ym字符串为：" + ym);
        }
        return commissionService.getCommissionByUserIdAndYm(userId, ym);
    }
    
    @GetMapping("/get")
    @ResponseBody
    public List<Commission> getAllCommission() {
        return commissionService.getAllCommissions();
    }
    
    @PostMapping("/add")
    @ResponseBody
    public Commission addCommission(@ModelAttribute Commission commission) {
        return commissionService.addCommission(commission);
    }
    
}
