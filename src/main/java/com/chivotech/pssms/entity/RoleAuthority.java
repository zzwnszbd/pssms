package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName role_authority
 */
@TableName(value ="role_authority")
@Data
public class RoleAuthority implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer roleAuthorityId;

    /**
     * 
     */
    private Integer authorityId;

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
        RoleAuthority other = (RoleAuthority) that;
        return (this.getRoleAuthorityId() == null ? other.getRoleAuthorityId() == null : this.getRoleAuthorityId().equals(other.getRoleAuthorityId()))
            && (this.getAuthorityId() == null ? other.getAuthorityId() == null : this.getAuthorityId().equals(other.getAuthorityId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleAuthorityId() == null) ? 0 : getRoleAuthorityId().hashCode());
        result = prime * result + ((getAuthorityId() == null) ? 0 : getAuthorityId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleAuthorityId=").append(roleAuthorityId);
        sb.append(", authorityId=").append(authorityId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}