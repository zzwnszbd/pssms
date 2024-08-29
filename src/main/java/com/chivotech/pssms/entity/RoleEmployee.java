package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName role_employee
 */
@TableName(value ="role_employee")
@Data
public class RoleEmployee implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer roleEmployeeId;

    /**
     * 
     */
    private Integer employeeId;

    /**
     * 
     */
    private Integer roleId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RoleEmployee other = (RoleEmployee) that;
        return (this.getRoleEmployeeId() == null ? other.getRoleEmployeeId() == null : this.getRoleEmployeeId().equals(other.getRoleEmployeeId()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleEmployeeId() == null) ? 0 : getRoleEmployeeId().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleEmployeeId=").append(roleEmployeeId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}