<%@ page contentType="text/html;charset=gbk"%>
<%@ taglib uri="/struts-tags" prefix="s"  %>



<HTML>
<HEAD>
<TITLE>���ݳ��ⷿ</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">

<link href="style/mycss.css" rel="stylesheet" type="text/css" />
<link href="style/texts.css" rel="stylesheet" type="text/css" />
<link href="style/btn.css" rel="stylesheet" type="text/css" />

</HEAD>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>

<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td colspan="5"><img src="images/top.jpg" width="780" height="213"></td>
  </tr>
  <tr>
    <td colspan="5"><img src="images/middle1.jpg" width="780" height="47"></td>
  </tr>
  <tr>
    <td width="38" background="images/middle2.jpg">&nbsp;</td>
    <td width="172" valign="top">

<script language="javascript">
<!--
	function login(){
		if( document.myForm.uname.value =="" ){
			alert("�û�������Ϊ��");
			return false;
		}else if(document.myForm.upass.value == ""){
			alert("���벻��Ϊ��");
			return false;
		} else {
			return true;
		}
	}
-->
</script>

	<table align="center">
	<tr>
		<td width=''><font color='red'>��ǰ�û���

			${tblUser.uname }</font>
		</td>
	</tr>
	<tr>
		<td width='150'><a href="my.htm">�����ҵ��ⷿ��Ϣ</a></td>
	</tr>
	<tr>
		<td width='100'><a href="post.htm">�����ⷿ��Ϣ</a></td>
	</tr>
	<tr>
		<td width='100'><a href="my.htm">������ҳ</a></td>
	</tr>
	<tr>
		<td width='100'><a href="index.htm">[ע��]</a></td>
	</tr>
	</table>
</td>
    <td width="35" background="images/layout_24.gif">&nbsp;</td>
    <td width="495">
	<table>
		<tr>
			<td width="3%">&nbsp;</td>
			<td width="97%">
			
			
			
			<table>
				<tr>
					<TD width='250'>����</TD>
					<TD width='90' align='center'>�����</TD>
					<TD align='center'>��������</TD>
				</tr>
				<tr>
					<td colspan='3'><hr/></td>
				</tr>
																			
				
				<s:iterator value="#session.tblFwList" var="tblFwxx">
			    <tr>
			    	<td>
			    		<a href='tblFwxx!showInfo.action?fwid=<s:property value="#tblFwxx.fwid" />&&lxid=<s:property value="#tblFwxx.lxid" />&&jdid=<s:property value="#tblFwxx.jdid" />'>
							<s:property value="#tblFwxx.title" />
						</a>
					</td>
					<td align='center' style='height:30px;'>
						<s:property value="#tblFwxx.zj" />Ԫ
					</td>
					<td align='center'>
						<s:property value="#tblFwxx.date" />
					</td><td>
					
				</tr>	
				</s:iterator>
				
				<tr>
					<td colspan='3'><hr/></td>
				</tr>
			</table>
			
			
			
			</td>
		</tr>
		<tr>
			<td colspan="2"></td>
		</tr>
	</table>
	</td>
    <td width="40" background="images/middle4.jpg">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="5"><img src="images/bottom.jpg" width="780" height="82"></td>
  </tr>
</table>
<P align="center">2010 Jz Scce ��Ȩ����</P>
<br/>
</BODY>
</HTML>