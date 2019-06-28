package com.jzscce.zf.biz.impl;

import java.util.List;

import com.jzscce.zf.biz.ItblFwxxBiz;
import com.jzscce.zf.dao.impl.TblFwxxDaoImpl;
import com.jzscce.zf.pojo.TblFwlx;
import com.jzscce.zf.pojo.TblFwxx;
import com.jzscce.zf.pojo.TblJd;
import com.jzscce.zf.pojo.TblQx;
import com.jzscce.zf.pojo.TblUser;

public class TblFwxxBizImpl implements ItblFwxxBiz {

	private TblFwxxDaoImpl daoImpl;
	
	
	
	public TblFwxxDaoImpl getDaoImpl() {
		return daoImpl;
	}



	public void setDaoImpl(TblFwxxDaoImpl daoImpl) {
		this.daoImpl = daoImpl;
	}



	@Override
	public List<TblFwxx> queryAll() {
		
		return this.daoImpl.queryAll();
	}



	@Override
	public TblFwxx getById(int fwid) {

		return this.daoImpl.getById(fwid);
	}



	@Override
	public TblFwlx getByLxid(int lxid) {
		return this.daoImpl.getByIdLxid(lxid);
	}



	@Override
	public TblJd getByJdid(int jdid) {

		return this.daoImpl.getByJdid(jdid);
	}



	@Override
	public TblQx getByQxid() {

		return this.daoImpl.getByQxid();
	}



	@Override
	public TblUser login(String uname, String upass) {
		return this.daoImpl.login(uname, upass);
	}



	@Override
	public boolean addUser(TblUser tblUser) {
		
		return this.daoImpl.addUser(tblUser);
	}



	@Override
	public List<TblFwxx> myFwxxInfo(int uid) {

		return this.daoImpl.myFwxxInfo(uid);
	}



	@Override
	public boolean addTblFwxx(TblFwxx tblFwxx) {

		return this.daoImpl.addTblFwxx(tblFwxx);
	}



	@Override
	public boolean delete(int fwid) {

		return this.daoImpl.delete(fwid);
	}



	@Override
	public TblFwxx getByIdTdlFwxx(int fwid) {

		return this.daoImpl.getByIdTdlFwxx(fwid);
	}



	@Override
	public void update(TblFwxx tblFwxx) {
		this.daoImpl.update(tblFwxx);
		
	}



	@Override
	public List<TblFwxx> search(String title) {

		return this.daoImpl.search(title);
	}



	@Override
	public List<TblFwxx> search(String title, int jdid) {		
		return this.daoImpl.search(title, jdid);
	}



	@Override
	public List<TblFwxx> search(String title, int jdid, double zj, double zj1) {
		return this.daoImpl.search(title, jdid, zj, zj1);
	}
	
	public List<TblFwxx> QueryAll(int pageno, int pagesize) {

		return this.daoImpl.QueryAll(pageno, pagesize);
	}

	@Override
	public int QueryAllcount() {

		return this.daoImpl.QueryAllcount();
	}
}
