package com.zss.scc.dao.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
public class Score {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Integer beginLevel;
    @Column(nullable = false)
    private Integer beginMaxHistoryLevel;
    @Column(nullable = false)
    private BigDecimal beginScore;
    @Column(nullable = false)
    private Integer beginStatus;
    @Column(nullable = false, length = 16)
    private String compCode;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createTime;
    @Column(nullable = false)
    private Integer endLevel;
    @Column(nullable = false)
    private Integer endMaxHistoryLevel;
    @Column(nullable = false)
    private BigDecimal endScore;
    @Column(nullable = false)
    private Integer endStatus;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date updateTime;
    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false, length = 8)
    private String ym;
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getBeginLevel() {
        return beginLevel;
    }
    
    public void setBeginLevel(Integer beginLevel) {
        this.beginLevel = beginLevel;
    }
    
    public Integer getBeginMaxHistoryLevel() {
        return beginMaxHistoryLevel;
    }
    
    public void setBeginMaxHistoryLevel(Integer beginMaxHistoryLevel) {
        this.beginMaxHistoryLevel = beginMaxHistoryLevel;
    }
    
    public BigDecimal getBeginScore() {
        return beginScore;
    }
    
    public void setBeginScore(BigDecimal beginScore) {
        this.beginScore = beginScore;
    }
    
    public Integer getBeginStatus() {
        return beginStatus;
    }
    
    public void setBeginStatus(Integer beginStatus) {
        this.beginStatus = beginStatus;
    }
    
    public String getCompCode() {
        return compCode;
    }
    
    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Integer getEndLevel() {
        return endLevel;
    }
    
    public void setEndLevel(Integer endLevel) {
        this.endLevel = endLevel;
    }
    
    public Integer getEndMaxHistoryLevel() {
        return endMaxHistoryLevel;
    }
    
    public void setEndMaxHistoryLevel(Integer endMaxHistoryLevel) {
        this.endMaxHistoryLevel = endMaxHistoryLevel;
    }
    
    public BigDecimal getEndScore() {
        return endScore;
    }
    
    public void setEndScore(BigDecimal endScore) {
        this.endScore = endScore;
    }
    
    public Integer getEndStatus() {
        return endStatus;
    }
    
    public void setEndStatus(Integer endStatus) {
        this.endStatus = endStatus;
    }
    
    public Date getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getYm() {
        return ym;
    }
    
    public void setYm(String ym) {
        this.ym = ym;
    }
}
