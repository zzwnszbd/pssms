package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName material
 */
@TableName(value ="material")
@Data
public class Material implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
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
    private String remark;

    /**
     * 
     */
    private String materialUnit;

    /**
     * 
     */
    private String bagUnit;

    /**
     * 
     */
    private Integer prodTypeId;

    /**
     * 
     */
    private Integer materialTypeId;

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
        Material other = (Material) that;
        return (this.getMaterialId() == null ? other.getMaterialId() == null : this.getMaterialId().equals(other.getMaterialId()))
            && (this.getMaterialCode() == null ? other.getMaterialCode() == null : this.getMaterialCode().equals(other.getMaterialCode()))
            && (this.getMaterialName() == null ? other.getMaterialName() == null : this.getMaterialName().equals(other.getMaterialName()))
            && (this.getStyle() == null ? other.getStyle() == null : this.getStyle().equals(other.getStyle()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getMaterialUnit() == null ? other.getMaterialUnit() == null : this.getMaterialUnit().equals(other.getMaterialUnit()))
            && (this.getBagUnit() == null ? other.getBagUnit() == null : this.getBagUnit().equals(other.getBagUnit()))
            && (this.getProdTypeId() == null ? other.getProdTypeId() == null : this.getProdTypeId().equals(other.getProdTypeId()))
            && (this.getMaterialTypeId() == null ? other.getMaterialTypeId() == null : this.getMaterialTypeId().equals(other.getMaterialTypeId()))
            && (this.getFormula() == null ? other.getFormula() == null : this.getFormula().equals(other.getFormula()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMaterialId() == null) ? 0 : getMaterialId().hashCode());
        result = prime * result + ((getMaterialCode() == null) ? 0 : getMaterialCode().hashCode());
        result = prime * result + ((getMaterialName() == null) ? 0 : getMaterialName().hashCode());
        result = prime * result + ((getStyle() == null) ? 0 : getStyle().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getMaterialUnit() == null) ? 0 : getMaterialUnit().hashCode());
        result = prime * result + ((getBagUnit() == null) ? 0 : getBagUnit().hashCode());
        result = prime * result + ((getProdTypeId() == null) ? 0 : getProdTypeId().hashCode());
        result = prime * result + ((getMaterialTypeId() == null) ? 0 : getMaterialTypeId().hashCode());
        result = prime * result + ((getFormula() == null) ? 0 : getFormula().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", materialId=").append(materialId);
        sb.append(", materialCode=").append(materialCode);
        sb.append(", materialName=").append(materialName);
        sb.append(", style=").append(style);
        sb.append(", remark=").append(remark);
        sb.append(", materialUnit=").append(materialUnit);
        sb.append(", bagUnit=").append(bagUnit);
        sb.append(", prodTypeId=").append(prodTypeId);
        sb.append(", materialTypeId=").append(materialTypeId);
        sb.append(", formula=").append(formula);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}