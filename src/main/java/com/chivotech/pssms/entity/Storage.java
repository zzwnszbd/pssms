package com.chivotech.pssms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName storage
 */
@TableName(value ="storage")
@Data
public class Storage implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer storageId;

    /**
     * 
     */
    private String storageCode;

    /**
     * 
     */
    private String storageName;

    /**
     * 
     */
    private String chairman;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String position;

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
        Storage other = (Storage) that;
        return (this.getStorageId() == null ? other.getStorageId() == null : this.getStorageId().equals(other.getStorageId()))
            && (this.getStorageCode() == null ? other.getStorageCode() == null : this.getStorageCode().equals(other.getStorageCode()))
            && (this.getStorageName() == null ? other.getStorageName() == null : this.getStorageName().equals(other.getStorageName()))
            && (this.getChairman() == null ? other.getChairman() == null : this.getChairman().equals(other.getChairman()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStorageId() == null) ? 0 : getStorageId().hashCode());
        result = prime * result + ((getStorageCode() == null) ? 0 : getStorageCode().hashCode());
        result = prime * result + ((getStorageName() == null) ? 0 : getStorageName().hashCode());
        result = prime * result + ((getChairman() == null) ? 0 : getChairman().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storageId=").append(storageId);
        sb.append(", storageCode=").append(storageCode);
        sb.append(", storageName=").append(storageName);
        sb.append(", chairman=").append(chairman);
        sb.append(", phone=").append(phone);
        sb.append(", position=").append(position);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}