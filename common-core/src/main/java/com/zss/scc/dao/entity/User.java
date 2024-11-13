package com.zss.scc.dao.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, length = 64)
    private String compCode;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date updateTime;
    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private String userName;
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
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
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
