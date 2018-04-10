package com.crazyhonest.common.client.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserUpdateReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7802002634094893886L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 昵称
	 */
	@JsonProperty("nickname")
	private String nickname;
	/**
	 * 性别
	 */
	@JsonProperty("sex")
	private Integer sex;
	/**
	 * 生日
	 */
	@JsonProperty("birthday")
	private String birthday;
	/**
	 * qq号
	 */
	@JsonProperty("qq")
	private String qq;
	/**
	 * 微信号
	 */
	@JsonProperty("wechat")
	private String wechat;
	/**
	 * 注册IP
	 */
	@JsonProperty("reg_ip")
	private String regIp;
	/**
	 * 注册时间
	 */
	@JsonProperty("reg_time")
	private Long regTime;
	/**
	 * 最后登录IP
	 */
	@JsonProperty("last_login_ip")
	private String lastLoginIp;
	/**
	 * 最后登录时间
	 */
	@JsonProperty("last_login_time")
	private Long lastLoginTime;
	/**
	 * 会员状态
	 */
	@JsonProperty("status")
	private Integer status;
	/**
	 * 用户积分
	 */
	@JsonProperty("score")
	private Integer score;
	/**
	 * 头像
	 */
	@JsonProperty("avatar")
	private String avatar;

	public String getAvatar() {
		return avatar;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public Long getLastLoginTime() {
		return lastLoginTime;
	}

	public String getNickname() {
		return nickname;
	}

	public String getQq() {
		return qq;
	}

	public String getRegIp() {
		return regIp;
	}

	public Long getRegTime() {
		return regTime;
	}

	public Integer getScore() {
		return score;
	}

	public Integer getSex() {
		return sex;
	}

	public Integer getStatus() {
		return status;
	}

	public String getWechat() {
		return wechat;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public void setLastLoginTime(Long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public void setRegTime(Long regTime) {
		this.regTime = regTime;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserUpdateReq [nickname=");
		builder.append(nickname);
		builder.append(", sex=");
		builder.append(sex);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", qq=");
		builder.append(qq);
		builder.append(", wechat=");
		builder.append(wechat);
		builder.append(", regIp=");
		builder.append(regIp);
		builder.append(", regTime=");
		builder.append(regTime);
		builder.append(", lastLoginIp=");
		builder.append(lastLoginIp);
		builder.append(", lastLoginTime=");
		builder.append(lastLoginTime);
		builder.append(", status=");
		builder.append(status);
		builder.append(", score=");
		builder.append(score);
		builder.append(", avatar=");
		builder.append(avatar);
		builder.append("]");
		return builder.toString();
	}

}
