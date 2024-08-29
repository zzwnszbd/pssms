package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName authority
 */
@TableName(value ="authority")
@Data
public class Authority implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer authorityId;

    /**
     * 
     */
    private String authorityName;

    /**
     * 
     */
    private Integer root;

    /**
     * 
     */
    private String controller;

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
        Authority other = (Authority) that;
        return (this.getAuthorityId() == null ? other.getAuthorityId() == null : this.getAuthorityId().equals(other.getAuthorityId()))
            && (this.getAuthorityName() == null ? other.getAuthorityName() == null : this.getAuthorityName().equals(other.getAuthorityName()))
            && (this.getRoot() == null ? other.getRoot() == null : this.getRoot().equals(other.getRoot()))
            && (this.getController() == null ? other.getController() == null : this.getController().equals(other.getController()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthorityId() == null) ? 0 : getAuthorityId().hashCode());
        result = prime * result + ((getAuthorityName() == null) ? 0 : getAuthorityName().hashCode());
        result = prime * result + ((getRoot() == null) ? 0 : getRoot().hashCode());
        result = prime * result + ((getController() == null) ? 0 : getController().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authorityId=").append(authorityId);
        sb.append(", authorityName=").append(authorityName);
        sb.append(", root=").append(root);
        sb.append(", controller=").append(controller);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}