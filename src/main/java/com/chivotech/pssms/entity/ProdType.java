package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName prod_type
 */
@TableName(value ="prod_type")
@Data
public class ProdType implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer prodTypeId;

    /**
     * 
     */
    private String prodTypeCode;

    /**
     * 
     */
    private String prodTypeName;

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
        ProdType other = (ProdType) that;
        return (this.getProdTypeId() == null ? other.getProdTypeId() == null : this.getProdTypeId().equals(other.getProdTypeId()))
            && (this.getProdTypeCode() == null ? other.getProdTypeCode() == null : this.getProdTypeCode().equals(other.getProdTypeCode()))
            && (this.getProdTypeName() == null ? other.getProdTypeName() == null : this.getProdTypeName().equals(other.getProdTypeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProdTypeId() == null) ? 0 : getProdTypeId().hashCode());
        result = prime * result + ((getProdTypeCode() == null) ? 0 : getProdTypeCode().hashCode());
        result = prime * result + ((getProdTypeName() == null) ? 0 : getProdTypeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prodTypeId=").append(prodTypeId);
        sb.append(", prodTypeCode=").append(prodTypeCode);
        sb.append(", prodTypeName=").append(prodTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}