package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName material_input
 */
@TableName(value ="material_input")
@Data
public class MaterialInput implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer materialInputId;

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
    private String batchNo;

    /**
     * 
     */
    private String orderId;

    /**
     * 
     */
    private Integer supplierId;

    /**
     * 
     */
    private String supplierName;

    /**
     * 
     */
    private Integer storageId;

    /**
     * 
     */
    private String storageName;

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
    private BigDecimal orderCount;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private Date orderDate;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private String orderNo;

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
        MaterialInput other = (MaterialInput) that;
        return (this.getMaterialInputId() == null ? other.getMaterialInputId() == null : this.getMaterialInputId().equals(other.getMaterialInputId()))
            && (this.getMaterialId() == null ? other.getMaterialId() == null : this.getMaterialId().equals(other.getMaterialId()))
            && (this.getMaterialCode() == null ? other.getMaterialCode() == null : this.getMaterialCode().equals(other.getMaterialCode()))
            && (this.getMaterialName() == null ? other.getMaterialName() == null : this.getMaterialName().equals(other.getMaterialName()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
            && (this.getStorageId() == null ? other.getStorageId() == null : this.getStorageId().equals(other.getStorageId()))
            && (this.getStorageName() == null ? other.getStorageName() == null : this.getStorageName().equals(other.getStorageName()))
            && (this.getStyle() == null ? other.getStyle() == null : this.getStyle().equals(other.getStyle()))
            && (this.getUnitName() == null ? other.getUnitName() == null : this.getUnitName().equals(other.getUnitName()))
            && (this.getOrderCount() == null ? other.getOrderCount() == null : this.getOrderCount().equals(other.getOrderCount()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getOrderDate() == null ? other.getOrderDate() == null : this.getOrderDate().equals(other.getOrderDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMaterialInputId() == null) ? 0 : getMaterialInputId().hashCode());
        result = prime * result + ((getMaterialId() == null) ? 0 : getMaterialId().hashCode());
        result = prime * result + ((getMaterialCode() == null) ? 0 : getMaterialCode().hashCode());
        result = prime * result + ((getMaterialName() == null) ? 0 : getMaterialName().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
        result = prime * result + ((getStorageId() == null) ? 0 : getStorageId().hashCode());
        result = prime * result + ((getStorageName() == null) ? 0 : getStorageName().hashCode());
        result = prime * result + ((getStyle() == null) ? 0 : getStyle().hashCode());
        result = prime * result + ((getUnitName() == null) ? 0 : getUnitName().hashCode());
        result = prime * result + ((getOrderCount() == null) ? 0 : getOrderCount().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getOrderDate() == null) ? 0 : getOrderDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", materialInputId=").append(materialInputId);
        sb.append(", materialId=").append(materialId);
        sb.append(", materialCode=").append(materialCode);
        sb.append(", materialName=").append(materialName);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", orderId=").append(orderId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", storageId=").append(storageId);
        sb.append(", storageName=").append(storageName);
        sb.append(", style=").append(style);
        sb.append(", unitName=").append(unitName);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", userName=").append(userName);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", status=").append(status);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}