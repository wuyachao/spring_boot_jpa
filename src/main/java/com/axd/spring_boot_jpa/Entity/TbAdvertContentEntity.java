package com.axd.spring_boot_jpa.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_advert_content", schema = "db_linkbiz")
public class TbAdvertContentEntity {
    private int id;
    private int positionId;
    private int cityId;
    private String picSize;
    private String positionDesc;
    private String advertTitle;
    private byte targetType;
    private byte advertType;
    private String targetVal;
    private int sortOrder;
    private String imagePath;
    private int startTime;
    private int endTime;
    private int ctime;
    private int utime;
    private byte status;
    private int adminId;
    private String remarks;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "position_id", nullable = false)
    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    @Basic
    @Column(name = "city_id", nullable = false)
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "pic_size", nullable = false, length = 20)
    public String getPicSize() {
        return picSize;
    }

    public void setPicSize(String picSize) {
        this.picSize = picSize;
    }

    @Basic
    @Column(name = "position_desc", nullable = false, length = 50)
    public String getPositionDesc() {
        return positionDesc;
    }

    public void setPositionDesc(String positionDesc) {
        this.positionDesc = positionDesc;
    }

    @Basic
    @Column(name = "advert_title", nullable = false, length = 50)
    public String getAdvertTitle() {
        return advertTitle;
    }

    public void setAdvertTitle(String advertTitle) {
        this.advertTitle = advertTitle;
    }

    @Basic
    @Column(name = "target_type", nullable = false)
    public byte getTargetType() {
        return targetType;
    }

    public void setTargetType(byte targetType) {
        this.targetType = targetType;
    }

    @Basic
    @Column(name = "advert_type", nullable = false)
    public byte getAdvertType() {
        return advertType;
    }

    public void setAdvertType(byte advertType) {
        this.advertType = advertType;
    }

    @Basic
    @Column(name = "target_val", nullable = false, length = 255)
    public String getTargetVal() {
        return targetVal;
    }

    public void setTargetVal(String targetVal) {
        this.targetVal = targetVal;
    }

    @Basic
    @Column(name = "sort_order", nullable = false)
    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "image_path", nullable = false, length = 255)
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Basic
    @Column(name = "start_time", nullable = false)
    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = false)
    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "ctime", nullable = false)
    public int getCtime() {
        return ctime;
    }

    public void setCtime(int ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "utime", nullable = false)
    public int getUtime() {
        return utime;
    }

    public void setUtime(int utime) {
        this.utime = utime;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "admin_id", nullable = false)
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "remarks", nullable = true, length = -1)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbAdvertContentEntity that = (TbAdvertContentEntity) o;
        return id == that.id &&
                positionId == that.positionId &&
                cityId == that.cityId &&
                targetType == that.targetType &&
                advertType == that.advertType &&
                sortOrder == that.sortOrder &&
                startTime == that.startTime &&
                endTime == that.endTime &&
                ctime == that.ctime &&
                utime == that.utime &&
                status == that.status &&
                adminId == that.adminId &&
                Objects.equals(picSize, that.picSize) &&
                Objects.equals(positionDesc, that.positionDesc) &&
                Objects.equals(advertTitle, that.advertTitle) &&
                Objects.equals(targetVal, that.targetVal) &&
                Objects.equals(imagePath, that.imagePath) &&
                Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, positionId, cityId, picSize, positionDesc, advertTitle, targetType, advertType, targetVal, sortOrder, imagePath, startTime, endTime, ctime, utime, status, adminId, remarks);
    }
}
