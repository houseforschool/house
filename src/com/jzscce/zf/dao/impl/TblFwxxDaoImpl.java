package com.jzscce.zf.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jzscce.zf.common.HibernateSessionFactory;
import com.jzscce.zf.dao.ItblFwxxDao;
import com.jzscce.zf.pojo.TblFwlx;
import com.jzscce.zf.pojo.TblFwxx;
import com.jzscce.zf.pojo.TblJd;
import com.jzscce.zf.pojo.TblQx;
import com.jzscce.zf.pojo.TblUser;


public class TblFwxxDaoImpl extends HibernateDaoSupport implements ItblFwxxDao {
	
	private TblJd tblJd;
	
	

	public TblJd getTblJd() {
		return tblJd;
	}

	public void setTblJd(TblJd tblJd) {
		this.tblJd = tblJd;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TblFwxx> queryAll() {

		List<TblFwxx> list = (List) super.getHibernateTemplate().find("from TblFwxx");
		return list;
	}

	// 根据Id找到此对象
	@Override
	public TblFwxx getById(int fwid) {

		return (TblFwxx) getHibernateTemplate().get(TblFwxx.class, fwid);
	}
	
	//根据Id显示房间类型
	@Override
	public TblFwlx getByIdLxid(int lxid) {
		
		return  (TblFwlx) getHibernateTemplate().get(TblFwlx.class, lxid);
	}
	
	//根据Id显示房间所在街道
	@Override
	public TblJd getByJdid(int jdid) {
		
		this.tblJd = (TblJd) getHibernateTemplate().get(TblJd.class, jdid);
		return  this.tblJd;
	}			
	
	//显示房间所在区县
	@Override
	public TblQx getByQxid() {
		
		return  (TblQx) getHibernateTemplate().get(TblQx.class, this.tblJd.getQxid());
	}
	
	
	//登录
	@SuppressWarnings("unchecked")
	public TblUser login(String uname, String upass) {
		//对象查询
		List<TblUser> list = (List)this.getHibernateTemplate().getSessionFactory().openSession().createCriteria(TblUser.class).add(Example.create(new TblUser(uname,upass))).list();
		return (TblUser) (list.size() > 0 ? list.get(0) : null);
	}

	//注册	
	@Override
	public boolean addUser(TblUser tblUser) {

		try {
			this.getHibernateTemplate().save(tblUser);
             return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}				
	
	//查询当前用户Id租房信息
	@SuppressWarnings("unchecked")
	public List<TblFwxx> myFwxxInfo(int uid) {
		List<TblFwxx> list = (List) super.getHibernateTemplate().find("from TblFwxx where uid='" + uid + "'");		 
		return list;
	}

	//发布租房信息	
	@Override
	public boolean addTblFwxx(TblFwxx tblFwxx) {

		try {
			this.getHibernateTemplate().save(tblFwxx);
             return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	

	// 根据id删除当前用户的租房信息
	@Override
	public boolean delete(int fwid) {
		try {
			super.getHibernateTemplate().delete(this.getByIdTdlFwxx(fwid));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// 根据Id找到此对象
	@Override
	public TblFwxx getByIdTdlFwxx(int fwid) {

		return (TblFwxx) getHibernateTemplate().get(TblFwxx.class, fwid);			
	}
	
	//修改当前用户的租房信息
	@Override
	public void update(TblFwxx tblFwxx) {
		super.getHibernateTemplate().update(tblFwxx);
		
	}
	
	
	//搜索
	@SuppressWarnings("unchecked")
	@Override
	public List<TblFwxx> search(String title) {
			
			
		List<TblFwxx> list = (List) super.getHibernateTemplate().find("from TblFwxx where title like '%"+title+"%'");
											
		return list;
	}
	@SuppressWarnings("unchecked")
	public List<TblFwxx> search(String title, int jdid){
		List<TblFwxx> list = (List) super.getHibernateTemplate().find("from TblFwxx where title like '%"+title+"%' and jdid="+jdid+"");
		
		return list;
	}
	@SuppressWarnings("unchecked")
	public List<TblFwxx> search(String title, int jdid, double zj, double zj1){
		List<TblFwxx> list = (List) super.getHibernateTemplate().find("from TblFwxx where title like '%"+title+"%' and jdid="+jdid+" and zj between "+zj+"and "+zj1+"");
		
		return list;
	}

	@Override
	public List<TblFwxx> QueryAll(int pageno, int pagesize) {
		Session se = HibernateSessionFactory.getSession();
		Criteria criter = se.createCriteria(TblFwxx.class);
		criter.setFirstResult((pageno - 1) * pagesize);
		criter.setMaxResults(pagesize);
		List<TblFwxx> list = criter.list();
		se.close();
		return list;
	}

	@Override
	public int QueryAllcount() {
		Session session = HibernateSessionFactory.getSession();		
		String hql = "select count(*) from TblFwxx";
		Query query = session.createQuery(hql);			
		Number q = (Number)query.uniqueResult();  //返回单个实例
		int count=q.intValue();  //返回数值
		
		return count;
	}
}
