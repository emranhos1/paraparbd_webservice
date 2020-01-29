package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role_name")
public class RoleName {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "role_name_id")
    private int roleNameId;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "created_date")
    private Date createdDate;

    public int getRoleNameId() {
        return roleNameId;
    }

    public void setRoleNameId(int roleNameId) {
        this.roleNameId = roleNameId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
