package com.jzscce.zf.pojo;

/**
 * TblQx entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class TblQx implements java.io.Serializable {

	// Fields

	private Integer qxid;
	private String qx;

	// Constructors

	/** default constructor */
	public TblQx() {
	}

	/** full constructor */
	public TblQx(String qx) {
		this.qx = qx;
	}

	// Property accessors

	public Integer getQxid() {
		return this.qxid;
	}

	public void setQxid(Integer qxid) {
		this.qxid = qxid;
	}

	public String getQx() {
		return this.qx;
	}

	public void setQx(String qx) {
		this.qx = qx;
	}

}