package com.crazyhonest.common.client.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPostReq implements Serializable {

	private static final long serialVersionUID = 2444807353935399213L;

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
	// /**
	// * 注册IP
	// */
	// @JsonProperty("reg_ip")
	// private String regIp;
	// /**
	// * 注册时间
	// */
	// @JsonProperty("reg_time")
	// private Long regTime;
	// /**
	// * 最后登录IP
	// */
	// @JsonProperty("last_login_ip")
	// private String lastLoginIp;
	// /**
	// * 最后登录时间
	// */
	// @JsonProperty("last_login_time")
	// private Long lastLoginTime;
	// /**
	// * 会员状态
	// */
	// @JsonProperty("status")
	// private Integer status;
	// /**
	// * 用户积分
	// */
	// @JsonProperty("score")
	// private Integer score;
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

	public String getNickname() {
		return nickname;
	}

	public String getQq() {
		return qq;
	}

	public Integer getSex() {
		return sex;
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

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserPostReq [nickname=");
		builder.append(nickname);
		builder.append(", sex=");
		builder.append(sex);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", qq=");
		builder.append(qq);
		builder.append(", wechat=");
		builder.append(wechat);
		builder.append(", avatar=");
		builder.append(avatar);
		builder.append("]");
		return builder.toString();
	}

}
