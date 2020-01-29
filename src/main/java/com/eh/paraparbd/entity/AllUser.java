package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "all_User")
public class AllUser {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="all_user_id")
    private int allUserId;
    @Column(name="user_id")
    private int userId;
    @Column(name="user_role")
    private String userRole;
    @Column(name="active_status")
    private int activeStatus;
    @Column(name="active_date")
    private Date activeDate;
    @Column(name="inactive_date")
    private Date inactiveDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAllUserId() {
        return allUserId;
    }

    public void setAllUserId(int allUserId) {
        this.allUserId = allUserId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public int getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(int activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public Date getInactiveDate() {
        return inactiveDate;
    }

    public void setInactiveDate(Date inactiveDate) {
        this.inactiveDate = inactiveDate;
    }
}
