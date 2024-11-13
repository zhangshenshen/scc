package com.zss.scc.dao.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
public class Commission {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(nullable = false)
    private Long userId;
    
    @Column(nullable = false, length = 16)
    private String compCode;
    
    @Column(nullable = false)
    private BigDecimal commission;
    
    @Column(nullable = false, length = 64)
    private String commissionType;
    
    // 标记删除
    @Column(nullable = false, length = 64)
    private String recordStatus;
    
    @Column(nullable = false, length = 8)
    private String ym;
    
    @Column
    private Long contributedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date updateTime;
    
    @Column
    private Long perfAssignId;
    
    
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getCompCode() {
        return compCode;
    }
    
    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }
    
    public BigDecimal getCommission() {
        return commission;
    }
    
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }
    
    public String getCommissionType() {
        return commissionType;
    }
    
    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }
    
    public String getRecordStatus() {
        return recordStatus;
    }
    
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    public String getYm() {
        return ym;
    }
    
    public void setYm(String ym) {
        this.ym = ym;
    }
    
    public Long getContributedBy() {
        return contributedBy;
    }
    
    public void setContributedBy(Long contributeBy) {
        this.contributedBy = contributeBy;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Long getPerfAssignId() {
        return perfAssignId;
    }
    
    public void setPerfAssignId(Long perfAssignId) {
        this.perfAssignId = perfAssignId;
    }
}
