package com.lantaiyuan.ebus.custom.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.lanqiao.ssm.common.model.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/***
 * 
* <p>Title: UserAddressSetting</p>
* <p>Description: 地址管理实体类</p>
* <p>Company: lty</p>
* @author liuhao
* @date 2017年7月7日 下午5:11:20
 */
public class UserAddressSetting extends Model{
    /***serialVersionUID***/
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private Integer id;

	@NotNull
    private Integer addressUserId;

    private String firmName;

    private String homeName;

    private BigDecimal firmLongitude;

    private BigDecimal firmLatitude;

    private BigDecimal homeLongitude;

    private BigDecimal homeLatitude;

    @NotBlank(message = "上班时间不能为空!")
    @Pattern(regexp = "\\d{2}:\\d{2}",message="上班时间格式错误!")
    private String upTime;

    @NotBlank(message = "下班时间不能为空!")
    @Pattern(regexp = "\\d{2}:\\d{2}",message="下班时间格式错误!")
    private String downTime;

    @JsonIgnore
    private Date gmtCreate;

    @JsonIgnore
    private Date gmtModified;

    @NotBlank
    private String cityCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddressUserId() {
        return addressUserId;
    }

    public void setAddressUserId(Integer addressUserId) {
        this.addressUserId = addressUserId;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName == null ? null : firmName.trim();
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName == null ? null : homeName.trim();
    }

    public BigDecimal getFirmLongitude() {
        return firmLongitude;
    }

    public void setFirmLongitude(BigDecimal firmLongitude) {
        this.firmLongitude = firmLongitude;
    }

    public BigDecimal getFirmLatitude() {
        return firmLatitude;
    }

    public void setFirmLatitude(BigDecimal firmLatitude) {
        this.firmLatitude = firmLatitude;
    }

    public BigDecimal getHomeLongitude() {
        return homeLongitude;
    }

    public void setHomeLongitude(BigDecimal homeLongitude) {
        this.homeLongitude = homeLongitude;
    }

    public BigDecimal getHomeLatitude() {
        return homeLatitude;
    }

    public void setHomeLatitude(BigDecimal homeLatitude) {
        this.homeLatitude = homeLatitude;
    }

    public String getUpTime() {
        return upTime;
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime == null ? null : upTime.trim();
    }

    public String getDownTime() {
        return downTime;
    }

    public void setDownTime(String downTime) {
        this.downTime = downTime == null ? null : downTime.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }
}