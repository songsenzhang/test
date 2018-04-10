package com.crazyhonest.common.client.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRetrieveRsp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8637009219850341049L;
	/**
	 * ID
	 */
	@JsonProperty("id")
	private String id;
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

	public String getId() {
		return id;
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

	public UserRetrieveRsp setAvatar(String avatar) {
		this.avatar = avatar;
		return this;
	}

	public UserRetrieveRsp setBirthday(String birthday) {
		this.birthday = birthday;
		return this;
	}

	public UserRetrieveRsp setId(String id) {
		this.id = id;
		return this;
	}

	public UserRetrieveRsp setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
		return this;
	}

	public UserRetrieveRsp setLastLoginTime(Long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
		return this;
	}

	public UserRetrieveRsp setNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	public UserRetrieveRsp setQq(String qq) {
		this.qq = qq;
		return this;
	}

	public UserRetrieveRsp setRegIp(String regIp) {
		this.regIp = regIp;
		return this;
	}

	public UserRetrieveRsp setRegTime(Long regTime) {
		this.regTime = regTime;
		return this;
	}

	public UserRetrieveRsp setScore(Integer score) {
		this.score = score;
		return this;
	}

	public UserRetrieveRsp setSex(Integer sex) {
		this.sex = sex;
		return this;
	}

	public UserRetrieveRsp setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public UserRetrieveRsp setWechat(String wechat) {
		this.wechat = wechat;
		return this;
	}

}
