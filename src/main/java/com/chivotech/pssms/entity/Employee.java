package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName employee
 */
@TableName(value ="employee")
@Data
public class Employee implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer employeeId;

    /**
     * 
     */
    private String employeeName;

    /**
     * 
     */
    private Integer departmentId;

    /**
     * 
     */
    private String sex;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String university;

    /**
     * 
     */
    private String major;

    /**
     * 
     */
    private String education;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Integer status;

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
        Employee other = (Employee) that;
        return (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getEmployeeName() == null ? other.getEmployeeName() == null : this.getEmployeeName().equals(other.getEmployeeName()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getUniversity() == null ? other.getUniversity() == null : this.getUniversity().equals(other.getUniversity()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getEmployeeName() == null) ? 0 : getEmployeeName().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getUniversity() == null) ? 0 : getUniversity().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeId=").append(employeeId);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", university=").append(university);
        sb.append(", major=").append(major);
        sb.append(", education=").append(education);
        sb.append(", address=").append(address);
        sb.append(", remark=").append(remark);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}