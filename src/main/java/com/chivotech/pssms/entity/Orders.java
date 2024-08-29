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
 * @TableName orders
 */
@TableName(value ="orders")
@Data
public class Orders implements Serializable {
    /**
     * 
     */
    @TableId
    private String orderNo;

    /**
     * 
     */
    private Integer supplierId;

    /**
     * 
     */
    private Integer invalid;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private String verifyPerson;

    /**
     * 
     */
    private Date verifyDate;

    /**
     * 
     */
    private String employeeName;

    /**
     * 
     */
    private Date orderDate;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private Integer orderType;

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
        Orders other = (Orders) that;
        return (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getInvalid() == null ? other.getInvalid() == null : this.getInvalid().equals(other.getInvalid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getVerifyPerson() == null ? other.getVerifyPerson() == null : this.getVerifyPerson().equals(other.getVerifyPerson()))
            && (this.getVerifyDate() == null ? other.getVerifyDate() == null : this.getVerifyDate().equals(other.getVerifyDate()))
            && (this.getEmployeeName() == null ? other.getEmployeeName() == null : this.getEmployeeName().equals(other.getEmployeeName()))
            && (this.getOrderDate() == null ? other.getOrderDate() == null : this.getOrderDate().equals(other.getOrderDate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getInvalid() == null) ? 0 : getInvalid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getVerifyPerson() == null) ? 0 : getVerifyPerson().hashCode());
        result = prime * result + ((getVerifyDate() == null) ? 0 : getVerifyDate().hashCode());
        result = prime * result + ((getEmployeeName() == null) ? 0 : getEmployeeName().hashCode());
        result = prime * result + ((getOrderDate() == null) ? 0 : getOrderDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderNo=").append(orderNo);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", invalid=").append(invalid);
        sb.append(", status=").append(status);
        sb.append(", verifyPerson=").append(verifyPerson);
        sb.append(", verifyDate=").append(verifyDate);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", remark=").append(remark);
        sb.append(", orderType=").append(orderType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}