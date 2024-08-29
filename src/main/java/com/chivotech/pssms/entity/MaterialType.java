package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName material_type
 */
@TableName(value ="material_type")
@Data
public class MaterialType implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer materialTypeId;

    /**
     * 
     */
    private String materialTypeCode;

    /**
     * 
     */
    private String materialTypeName;

    /**
     * 
     */
    private String formula;

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
        MaterialType other = (MaterialType) that;
        return (this.getMaterialTypeId() == null ? other.getMaterialTypeId() == null : this.getMaterialTypeId().equals(other.getMaterialTypeId()))
            && (this.getMaterialTypeCode() == null ? other.getMaterialTypeCode() == null : this.getMaterialTypeCode().equals(other.getMaterialTypeCode()))
            && (this.getMaterialTypeName() == null ? other.getMaterialTypeName() == null : this.getMaterialTypeName().equals(other.getMaterialTypeName()))
            && (this.getFormula() == null ? other.getFormula() == null : this.getFormula().equals(other.getFormula()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMaterialTypeId() == null) ? 0 : getMaterialTypeId().hashCode());
        result = prime * result + ((getMaterialTypeCode() == null) ? 0 : getMaterialTypeCode().hashCode());
        result = prime * result + ((getMaterialTypeName() == null) ? 0 : getMaterialTypeName().hashCode());
        result = prime * result + ((getFormula() == null) ? 0 : getFormula().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", materialTypeId=").append(materialTypeId);
        sb.append(", materialTypeCode=").append(materialTypeCode);
        sb.append(", materialTypeName=").append(materialTypeName);
        sb.append(", formula=").append(formula);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}