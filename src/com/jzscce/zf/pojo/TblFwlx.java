package com.jzscce.zf.pojo;

/**
 * TblFwlx entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class TblFwlx implements java.io.Serializable {

	// Fields

	private Integer lxid;
	private String fwlx;

	// Constructors

	/** default constructor */
	public TblFwlx() {
	}

	/** full constructor */
	public TblFwlx(String fwlx) {
		this.fwlx = fwlx;
	}

	// Property accessors

	public Integer getLxid() {
		return this.lxid;
	}

	public void setLxid(Integer lxid) {
		this.lxid = lxid;
	}

	public String getFwlx() {
		return this.fwlx;
	}

	public void setFwlx(String fwlx) {
		this.fwlx = fwlx;
	}

}