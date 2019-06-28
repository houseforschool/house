package com.jzscce.zf.struts.action;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.Cookie;

import com.jzscce.zf.biz.impl.TblFwxxBizImpl;
import com.jzscce.zf.pojo.TblFwlx;
import com.jzscce.zf.pojo.TblFwxx;
import com.jzscce.zf.pojo.TblJd;
import com.jzscce.zf.pojo.TblQx;
import com.jzscce.zf.pojo.TblUser;


@SuppressWarnings("serial")
public class TblFwxxAction  extends BaseAction{
	//  分页所需要的属性
	
	private int pageno;  //  显示第几页
	private String pagemsg; // 如果数据为空 
	private int count;  // 总条数
	private int pagesize = 6;   // 显示几页
	private int pageMax = 0;  //  尾页
	
	public int getPageno() {
		return pageno;
	}

	public void setPageno(int pageno) {
		this.pageno = pageno;
	}

	public String getPagemsg() {
		return pagemsg;
	}

	public void setPagemsg(String pagemsg) {
		this.pagemsg = pagemsg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public int getPageMax() {
		return pageMax;
	}

	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}
	// 自动登录
	private String remember;

	public String getRemember() {
		return remember;
	}

	public void setRemember(String remember) {
		this.remember = remember;
	}
	private TblFwxxBizImpl bizImpl;
	
	private int fwid;
	private int uid;
	private int jdid;
	private int lxid;
	private int shi;
	private int ting;
	private String fwxx;
	private double zj;
	private double zj1;
	private String title;
	private Timestamp date;
	private int date1;
	private String telephone;
	private String lxr;

	private TblFwxx tblFwxx;
	
	private  List<TblFwxx> tblFwList;
	
	private TblFwlx tblFwlx;
	
	public List<TblFwxx> getTblFwList() {
		return tblFwList;
	}

	public void setTblFwList(List<TblFwxx> tblFwList) {
		this.tblFwList = tblFwList;
	}

	private TblJd tblJd;
	
	private TblQx tblQx;
	
	private int qxid;

	private TblUser tblUser;
	
	
	private String uname;
	
	private String upass;

	public int getDate1() {
		return date1;
	}

	public void setDate1(int date1) {
		this.date1 = date1;
	}


	public double getZj1() {
		return zj1;
	}

	public void setZj1(double zj1) {
		this.zj1 = zj1;
	}

	public TblFwxxBizImpl getBizImpl() {
		return bizImpl;
	}

	public void setBizImpl(TblFwxxBizImpl bizImpl) {
		this.bizImpl = bizImpl;
	}

	public int getFwid() {
		return fwid;
	}

	public void setFwid(int fwid) {
		this.fwid = fwid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getJdid() {
		return jdid;
	}

	public void setJdid(int jdid) {
		this.jdid = jdid;
	}

	public int getLxid() {
		return lxid;
	}

	public void setLxid(int lxid) {
		this.lxid = lxid;
	}

	public int getShi() {
		return shi;
	}

	public void setShi(int shi) {
		this.shi = shi;
	}

	public int getTing() {
		return ting;
	}

	public void setTing(int ting) {
		this.ting = ting;
	}

	public String getFwxx() {
		return fwxx;
	}

	public void setFwxx(String fwxx) {
		this.fwxx = fwxx;
	}

	public double getZj() {
		return zj;
	}

	public void setZj(double zj) {
		this.zj = zj;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public TblFwxx getTblFwxx() {
		return tblFwxx;
	}

	public void setTblFwxx(TblFwxx tblFwxx) {
		this.tblFwxx = tblFwxx;
	}

	public TblFwlx getTblFwlx() {
		return tblFwlx;
	}

	public void setTblFwlx(TblFwlx tblFwlx) {
		this.tblFwlx = tblFwlx;
	}

	public TblJd getTblJd() {
		return tblJd;
	}

	public void setTblJd(TblJd tblJd) {
		this.tblJd = tblJd;
	}

	public TblQx getTblQx() {
		return tblQx;
	}

	public void setTblQx(TblQx tblQx) {
		this.tblQx = tblQx;
	}

	public int getQxid() {
		return qxid;
	}

	public void setQxid(int qxid) {
		this.qxid = qxid;
	}

	public TblUser getTblUser() {
		return tblUser;
	}

	public void setTblUser(TblUser tblUser) {
		this.tblUser = tblUser;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	// 查询全部
	public String query()	
	{			
		List<TblFwxx> tblFwxxList = this.bizImpl.queryAll();
		super.getSession().put("tblFwxxList",tblFwxxList);
		return "goScce";
		
	}
	
	// 登录
	public String login()
	{
		
		if (this.remember!=null) {
			/**
			 *  out.println("自动登陆");
			 *	服务器端设置Cookie
			 */
			
			//创建Cookie 
			Cookie cookie = new Cookie("autoLogin","allowAutoLogin"); 
			//设置Cookie的超时时间 
			cookie.setMaxAge(24 * 60 * 60 *60); 
			//把Cookie发送到客户端 
			super.getResponse().addCookie(cookie); 
			
			//到底做还是不做数据库操作			
		}
		this.tblUser = this.bizImpl.login(uname, upass);
		super.getSession().put("tblUser",tblUser);
		if(this.tblUser!=null)
		{	
			return queryAllPage();
		}
		return "login_form";
	}
	
	// 登录
	public String login_form()
	{		
		this.tblUser = this.bizImpl.login(uname, upass);
		super.getSession().put("tblUser",tblUser);
		if(this.tblUser!=null)
		{	
			return queryAllPage();
		}
		return "login_form";
			
	}
	
	//注销
	public String leave()
	{
		//清除一个session的方法：根据key清除
		super.getSession().remove("tblUser");		
		//跳到主页		 				
		return query();
	}
	
	//用户注册
	public String addUser()
	{
		
		boolean bo = false; 
		if(!bo)
		{	
			this.bizImpl.addUser(new TblUser(this.uname,this.upass));
			return "loginScce";
		}
		return "loginError";
	}	
	
	public String showInfo()
	{		
		//显示前清空
		super.getSession().remove("tblFwxx");
		super.getSession().remove("tblFwlx");		
		super.getSession().remove("tblJd");		
		super.getSession().remove("tblQx");
		
		//  就是这种方法
		
		//显示租房详细信息
		tblFwxx = this.bizImpl.getById(this.fwid);
		super.getSession().put("tblFwxx",tblFwxx);
		
		//显示租房类型
		tblFwlx = this.bizImpl.getByLxid(lxid);
		super.getSession().put("tblFwlx",tblFwlx);
		
		//显示租房街道
		tblJd = this.bizImpl.getByJdid(jdid);
		super.getSession().put("tblJd",tblJd);
	
		//显示租房区县
		tblQx = this.bizImpl.getByQxid();
		super.getSession().put("tblQx",tblQx);

		
		return "showInfo";
		
	}
	
	//查看当前用户的租房信息
	public String myFwxxInfo()
	{
		//获取当前用户
		this.tblUser = (TblUser)super.getSession().get("tblUser");				
		
		//根据用户id查询
		List<TblFwxx> myTblFwxxList = this.bizImpl.myFwxxInfo(this.tblUser.getUid());			
		
		super.getSession().put("myTblFwxxList",myTblFwxxList);
		
		return "myFwxxInfo";		
	}
	
	//发布租房信息
	public String postConfirm()
	{
					
		this.tblUser = (TblUser) super.getSession().get("tblUser");
		
		 tblFwxx = new TblFwxx(this.tblUser.getUid(), jdid, lxid, shi, ting, fwxx, zj, title, telephone, lxr);
		 		
		 
		this.bizImpl.addTblFwxx(tblFwxx);
		return myFwxxInfo();
	}
	
	//根据id删除一条租房信息
	public String del()
	{
		
		boolean bo = this.bizImpl.delete(fwid);
		if(bo)
		{
			
			return myFwxxInfo();
		}
		else
			return "";
	}
	
	//跳转到修改
	public String updInfo()
	{
		//清空
		super.getSession().remove("tblFwxx");
		super.getSession().remove("tblFwlx");		
		super.getSession().remove("tblJd");		
		super.getSession().remove("tblQx");
		
		this.tblFwxx = this.bizImpl.getById(fwid);
		
		super.getSession().put("fwid",fwid);
		super.getSession().put("tblFwxx",tblFwxx);
		
		//显示租房类型
		tblFwlx = this.bizImpl.getByLxid(this.tblFwxx.getLxid());
		super.getSession().put("tblFwlx",tblFwlx);
		
		//显示租房街道
		tblJd = this.bizImpl.getByJdid(this.tblFwxx.getJdid());
		super.getSession().put("tblJd",tblJd);
	
		//显示租房区县
		tblQx = this.bizImpl.getByQxid();
		super.getSession().put("tblQx",tblQx);

		
		return "updInfo";
	}
	
	//修改提交
	public String upd()
	{	
		
		//根据当前用户获取修改对象的uid
		 this.tblUser = (TblUser) super.getSession().get("tblUser");
		 		 
		 this.fwid = Integer.parseInt(super.getSession().get("fwid").toString());		 		 
		 
		 date =  this.bizImpl.getByIdTdlFwxx(fwid).getDate();		 
		 
		tblFwxx = new TblFwxx(fwid,this.tblUser.getUid(), jdid, lxid, shi, ting, fwxx, zj, title,date,telephone, lxr);
		this.bizImpl.update(tblFwxx);
		return myFwxxInfo();
	}
	
	//搜索
	public String sea()
	{		
		//用户没登入前不能搜索
		if(super.getSession().get("tblUser")!=null)
		{
			//清空
			super.getSession().remove("tblFwList");	
			
			List<TblFwxx> tblFwList = null;
			
			//title不为空
			if( !title.equals(""))
			{
				//高级搜索：所有条件不为空
				if(jdid !=0)
				{
					if(zj != 0.0 && zj1 != 0.0)
					{																					
						tblFwList = this.bizImpl.search(title,jdid,zj,zj1);										
						
					}
					else
					{
						tblFwList = this.bizImpl.search(title,jdid);																	
					}
				}
				//普通搜索：根据title模糊查询
				else
				{	
					tblFwList = this.bizImpl.search(title);
				}
			}	
			
			//title为空查询所有
			else			
			{
				tblFwList = this.bizImpl.queryAll();
			}
			super.getSession().put("tblFwList",tblFwList);
			return "list";
			
		}
		return "goScce";
	}
	//  hibernate分页
	public String queryAllPage(){
			
			//清空
			super.getSession().remove("tblFwxxList");		
			
			if (pageMax == 0) {
				
				int count =  this.bizImpl.QueryAllcount();
				
				pageMax = count / pagesize;
				if (count % pagesize != 0) {
					pageMax += 1;
				}
			}
			if (pageno <= 0) {
				pageno = 1;
				pagemsg = "<font color='#FF0000'>已经是第一页了！</font>";
			} else if (pageno > pageMax) {
				pageno = pageMax;
				pagemsg = "<font color='#FF0000'>已经是最后一页了！</font>";
			} else {
				pagemsg = "";
			}
			if (pageno > 0 && pageno <= pageMax) {
				tblFwList = this.bizImpl.QueryAll(pageno, pagesize);
				super.getSession().put("tblFwxxList", tblFwList);
				
				super.getRequest().put("pageno", pageno);
				super.getRequest().put("pageMax", pageMax);
				super.getRequest().put("pagemsg", pagemsg);
			}		
			
			return "goScce";
		}
}
