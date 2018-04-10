package com.crazyhonest.common.client.baseobjects;

import java.io.Serializable;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.crazyhonest.common.client.request.UserPostReq;
import com.crazyhonest.common.client.request.UserUpdateReq;
import com.crazyhonest.common.client.response.UserRetrieveRsp;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5334616780755819013L;
	/**
	 * ID
	 */
	@Id
	@JsonProperty("id")
	private String id;

	/**
	 * 昵称
	 */
	@Field("nickname")
	@JsonProperty("nickname")
	private String nickname;
	/**
	 * 性别
	 */
	@Field("sex")
	@JsonProperty("sex")
	private Integer sex;
	/**
	 * 生日
	 */
	@Field("birthday")
	@JsonProperty("birthday")
	private String birthday;
	/**
	 * qq号
	 */
	@Field("qq")
	@JsonProperty("qq")
	private String qq;
	/**
	 * 微信号
	 */
	@Field("wechat")
	@JsonProperty("wechat")
	private String wechat;
	/**
	 * 注册IP
	 */
	@Field("reg_ip")
	@JsonProperty("reg_ip")
	private String regIp;
	/**
	 * 注册时间
	 */
	@Field("reg_time")
	@JsonProperty("reg_time")
	private Long regTime;
	/**
	 * 最后登录IP
	 */
	@Field("last_login_ip")
	@JsonProperty("last_login_ip")
	private String lastLoginIp;
	/**
	 * 最后登录时间
	 */
	@Field("last_login_time")
	@JsonProperty("last_login_time")
	private Long lastLoginTime;
	/**
	 * 会员状态
	 */
	@Field("status")
	@JsonProperty("status")
	private Integer status;
	/**
	 * 用户积分
	 */
	@Field("score")
	@JsonProperty("score")
	private Integer score;
	/**
	 * 头像
	 */
	@Field("avatar")
	@JsonProperty("avatar")
	private String avatar;

	public UserObject convert(final UserPostReq body, final Long time) {
		// TODO
		return new UserObject();
	}	

	public UserRetrieveRsp convert(final UserObject body) {
		// TODO
		return new UserRetrieveRsp();
	}

	public UserObject convert(UserObject obj, final UserUpdateReq body, final Long time) {
		// TODO
		return obj;
	}

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

	public UserObject setAvatar(String avatar) {
		this.avatar = avatar;
		return this;
	}

	public UserObject setBirthday(String birthday) {
		this.birthday = birthday;
		return this;
	}

	public UserObject setId(String id) {
		this.id = id;
		return this;
	}

	public UserObject setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
		return this;
	}

	public UserObject setLastLoginTime(Long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
		return this;
	}

	public UserObject setNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	public UserObject setQq(String qq) {
		this.qq = qq;
		return this;
	}

	public UserObject setRegIp(String regIp) {
		this.regIp = regIp;
		return this;
	}

	public UserObject setRegTime(Long regTime) {
		this.regTime = regTime;
		return this;
	}

	public UserObject setScore(Integer score) {
		this.score = score;
		return this;
	}

	public UserObject setSex(Integer sex) {
		this.sex = sex;
		return this;
	}

	public UserObject setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public UserObject setWechat(String wechat) {
		this.wechat = wechat;
		return this;
	}
}
