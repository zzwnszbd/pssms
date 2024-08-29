package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName order_detail
 */
@TableName(value ="order_detail")
@Data
public class OrderDetail implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer orderDetailId;

    /**
     * 
     */
    private String orderNo;

    /**
     * 
     */
    private Integer materialId;

    /**
     * 
     */
    private String materialCode;

    /**
     * 
     */
    private String materialName;

    /**
     * 
     */
    private String style;

    /**
     * 
     */
    private String unitName;

    /**
     * 
     */
    private String orderId;

    /**
     * 
     */
    private String batchNo;

    /**
     * 
     */
    private BigDecimal orderCount;

    /**
     * 
     */
    private String orderFlag;

    /**
     * 
     */
    private Integer storageId;

    /**
     * 
     */
    private String storageName;

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
        OrderDetail other = (OrderDetail) that;
        return (this.getOrderDetailId() == null ? other.getOrderDetailId() == null : this.getOrderDetailId().equals(other.getOrderDetailId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getMaterialId() == null ? other.getMaterialId() == null : this.getMaterialId().equals(other.getMaterialId()))
            && (this.getMaterialCode() == null ? other.getMaterialCode() == null : this.getMaterialCode().equals(other.getMaterialCode()))
            && (this.getMaterialName() == null ? other.getMaterialName() == null : this.getMaterialName().equals(other.getMaterialName()))
            && (this.getStyle() == null ? other.getStyle() == null : this.getStyle().equals(other.getStyle()))
            && (this.getUnitName() == null ? other.getUnitName() == null : this.getUnitName().equals(other.getUnitName()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getOrderCount() == null ? other.getOrderCount() == null : this.getOrderCount().equals(other.getOrderCount()))
            && (this.getOrderFlag() == null ? other.getOrderFlag() == null : this.getOrderFlag().equals(other.getOrderFlag()))
            && (this.getStorageId() == null ? other.getStorageId() == null : this.getStorageId().equals(other.getStorageId()))
            && (this.getStorageName() == null ? other.getStorageName() == null : this.getStorageName().equals(other.getStorageName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderDetailId() == null) ? 0 : getOrderDetailId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getMaterialId() == null) ? 0 : getMaterialId().hashCode());
        result = prime * result + ((getMaterialCode() == null) ? 0 : getMaterialCode().hashCode());
        result = prime * result + ((getMaterialName() == null) ? 0 : getMaterialName().hashCode());
        result = prime * result + ((getStyle() == null) ? 0 : getStyle().hashCode());
        result = prime * result + ((getUnitName() == null) ? 0 : getUnitName().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getOrderCount() == null) ? 0 : getOrderCount().hashCode());
        result = prime * result + ((getOrderFlag() == null) ? 0 : getOrderFlag().hashCode());
        result = prime * result + ((getStorageId() == null) ? 0 : getStorageId().hashCode());
        result = prime * result + ((getStorageName() == null) ? 0 : getStorageName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderDetailId=").append(orderDetailId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", materialId=").append(materialId);
        sb.append(", materialCode=").append(materialCode);
        sb.append(", materialName=").append(materialName);
        sb.append(", style=").append(style);
        sb.append(", unitName=").append(unitName);
        sb.append(", orderId=").append(orderId);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", orderFlag=").append(orderFlag);
        sb.append(", storageId=").append(storageId);
        sb.append(", storageName=").append(storageName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}