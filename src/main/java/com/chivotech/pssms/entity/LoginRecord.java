package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName login_record
 */
@TableName(value ="login_record")
@Data
public class LoginRecord implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer loginRecordId;

    /**
     * 
     */
    private Integer employeeId;

    /**
     * 
     */
    private String employeeName;

    /**
     * 
     */
    private Date time;

    /**
     * 
     */
    private String ipaddress;

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
        LoginRecord other = (LoginRecord) that;
        return (this.getLoginRecordId() == null ? other.getLoginRecordId() == null : this.getLoginRecordId().equals(other.getLoginRecordId()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getEmployeeName() == null ? other.getEmployeeName() == null : this.getEmployeeName().equals(other.getEmployeeName()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getIpaddress() == null ? other.getIpaddress() == null : this.getIpaddress().equals(other.getIpaddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoginRecordId() == null) ? 0 : getLoginRecordId().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getEmployeeName() == null) ? 0 : getEmployeeName().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getIpaddress() == null) ? 0 : getIpaddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginRecordId=").append(loginRecordId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", time=").append(time);
        sb.append(", ipaddress=").append(ipaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}