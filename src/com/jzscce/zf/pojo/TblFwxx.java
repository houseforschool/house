package com.jzscce.zf.pojo;

import java.sql.Timestamp;

/**
 * TblFwxx entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class TblFwxx implements java.io.Serializable {

	// Fields

	private Integer fwid;
	private Integer uid;
	private Integer jdid;
	private Integer lxid;
	private Integer shi;
	private Integer ting;
	private String fwxx;
	private Double zj;
	private String title;
	private Timestamp date;
	private String telephone;
	private String lxr;

	// Constructors

	/** default constructor */
	public TblFwxx() {
	}

	/** minimal constructor */
	public TblFwxx(String title) {
		this.title = title;
	}

	/** full constructor */
	public TblFwxx(Integer uid, Integer jdid, Integer lxid, Integer shi,
			Integer ting, String fwxx, Double zj, String title, Timestamp date,
			String telephone, String lxr) {
		this.uid = uid;
		this.jdid = jdid;
		this.lxid = lxid;
		this.shi = shi;
		this.ting = ting;
		this.fwxx = fwxx;
		this.zj = zj;
		this.title = title;
		this.date = date;
		this.telephone = telephone;
		this.lxr = lxr;
	}

	

	
	public TblFwxx(Integer uid, Integer jdid, Integer lxid, Integer shi,
			Integer ting, String fwxx, Double zj, String title, 
			String telephone, String lxr) {
		this.uid = uid;
		this.jdid = jdid;
		this.lxid = lxid;
		this.shi = shi;
		this.ting = ting;
		this.fwxx = fwxx;
		this.zj = zj;
		this.title = title;
		
		this.telephone = telephone;
		this.lxr = lxr;
	}
	
	public TblFwxx(Integer fwid,Integer uid, Integer jdid, Integer lxid, Integer shi,
			Integer ting, String fwxx, Double zj, String title, Timestamp date,
			String telephone, String lxr) {
		this.fwid = fwid;
		this.uid = uid;
		this.jdid = jdid;
		this.lxid = lxid;
		this.shi = shi;
		this.ting = ting;
		this.fwxx = fwxx;
		this.zj = zj;
		this.title = title;
		this.date = date;
		this.telephone = telephone;
		this.lxr = lxr;
	}
	
	public TblFwxx(Integer fwid,Integer uid, Integer jdid, Integer lxid, Integer shi,
			Integer ting, String fwxx, Double zj, String title, 
			String telephone, String lxr) {
		this.fwid = fwid;
		this.uid = uid;
		this.jdid = jdid;
		this.lxid = lxid;
		this.shi = shi;
		this.ting = ting;
		this.fwxx = fwxx;
		this.zj = zj;
		this.title = title;
		
		this.telephone = telephone;
		this.lxr = lxr;
	}
	
	// Property accessors

	public Integer getFwid() {
		return this.fwid;
	}

	public void setFwid(Integer fwid) {
		this.fwid = fwid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getJdid() {
		return this.jdid;
	}

	public void setJdid(Integer jdid) {
		this.jdid = jdid;
	}

	public Integer getLxid() {
		return this.lxid;
	}

	public void setLxid(Integer lxid) {
		this.lxid = lxid;
	}

	public Integer getShi() {
		return this.shi;
	}

	public void setShi(Integer shi) {
		this.shi = shi;
	}

	public Integer getTing() {
		return this.ting;
	}

	public void setTing(Integer ting) {
		this.ting = ting;
	}

	public String getFwxx() {
		return this.fwxx;
	}

	public void setFwxx(String fwxx) {
		this.fwxx = fwxx;
	}

	public Double getZj() {
		return this.zj;
	}

	public void setZj(Double zj) {
		this.zj = zj;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

}