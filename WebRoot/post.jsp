<%@ page contentType="text/html;charset=gbk"%>
<%@ taglib uri="/struts-tags" prefix="s"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<HEAD>
<TITLE>���ݳ��ⷿ</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">

<link href="style/mycss.css" rel="stylesheet" type="text/css" />
<link href="style/texts.css" rel="stylesheet" type="text/css" />
<link href="style/btn.css" rel="stylesheet" type="text/css" />
<script language="javascript">
<!--
var v = new Array(19);
var n = new Array(19);
v[0] = new Array('0');
n[0] = new Array('����--');
v[1] = new Array('1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38');
n[1] = new Array('�йش�','������ѧ','�廪��ѧ','�ϵ�','����·','������','ѧԺ·','��ֱ����','����Ժ','����ׯ','������','�����','˫����','������','���','������','������','��ɽ','���·','����·','����·','�򷻵�','�ʼҿ�','����','���¹�','��̫ƽׯ','����','����','�ļ���','������','��Ȫ��','�ռ���','��ׯ','κ����','������','��԰·','����԰','����');
v[2] = new Array('39','40','41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60','61','62','63','64','65','66','67','68','69','70','71','72','73','74','75','76','77','78','79','80','81','82','83','84','85','86','87','88','89','90','91');
n[2] = new Array('���˴�','��Ԫ��','������','��չ','������','����','��ɯ','�Ž��','������','����','������','�˼�԰','������','����¥','˫��','��ͷ','������','���ӵ�','���ׯ','���԰','�׶�����','С��','��ƽ��','С����','ʮ�����','����ׯ','��ׯ��','����Ӫ','��ĥ��','���䷿','��ׯ','�߱���','��Ӫ','ƽ��','����','����','��յ','��̨','�޸�ׯ','���','����Ӫ','̫����','����','���˴�','��ó','���Ӻ�','������','����','����ׯ','���ҵ�','������','��̨·','����');
v[3] = new Array('92','93','94','95','96','97','98','99');
n[3] = new Array('ǰ��','��̳','��������','��̶��','������','������·','��������','����');
v[4] = new Array('100','101','102','103','104','105','106','107','108','109','110','111','112','113','114','115','116');
n[4] = new Array('�׹�·','���԰','���п�','������','������','��ƽ��','����','������','��դ��','���п�','ţ��','��ֽ��','��Ȼͤ','�����ֵ�','�㰲����','�㰲����','����');
v[5] = new Array('117','118','119','120','121','122','123','124','125','126','127','128','129','130','131','132','133','134');
n[5] = new Array('��ֱ��','������','������','��ɽ','����ʮ��','����','������','������','����վ','��ƽ��','Ӻ�͹�','��ֱ����','������','����','����','������','������','����');
v[6] = new Array('135','136','137','138','139','140','141','142','143','144','145','146','147','148','149','150','151','152');
n[6] = new Array('����·','������','����ʿ·','��̳','������','չ��·','����','����','��ֱ��','�½ֿ�','ʲɲ��','�ذ���','��¥','����','���ڽ�','��������','��ʤ��','����');
v[7] = new Array('153','154','155','156','157','158','159','160','161','162','163','164','165','166','167');
n[7] = new Array('��Է','�в�','�»�','����','��˳','��԰','��ׯ','º��','�ż���','̨��','������','����','�t��','���ֵ�','����');
v[8] = new Array('168','169','170','171','172','173','174','175','176','177','178','179','180','181','182','183');
n[8] = new Array('��ȪӪ','��ׯ','��̨·','¬����','̫ƽ��','������','�Ƹ�','�´�','�Ұ���','���ұ�','����԰','�����','��Է','���ߵ�','������Ӫ','����');
v[9] = new Array('184','185','186','187','188','189','190','191','192','193','194','195','196','197','198','199','200','201','202');
n[9] = new Array('�Ǳ�','����','�Ͽ�','���ؿ�','ɳ��','������','��ͨԷ','����','����','ʮ����','����','����','�޴�','����','С��ɽ','����','��С��','���߼�','����');
v[10] = new Array('203','204','205','206','207','208','209','210','211','212','213','214','215','216','217','218','219','220');
n[10] = new Array('�˷�','��Դ','��У·','�ƴ�','������','�ɹ�','��ׯ','孺�','���Ƶ�','����Ӫ','����','����','κ��ׯ','����','����','�Ӹ�ׯ','��갴�','����');
v[11] = new Array('221','222','223','224','225','226','227','228','229','230','231','232','233','234','235');
n[11] = new Array('����','���ӽֵ�','������','��̨','��ƽ','��Ȫ','����','̶����','��ƽ','��ׯ','���ɽ','���','ի��','��ˮ','����');
v[12] = new Array('236','237','238','239','240','241','242','243','244','245');
n[12] = new Array('�˱�ɽ','�ų�','ƻ��԰','³��','��ɽ','�˽�','�𶥽�','����','������','����');
v[13] = new Array('246','247','248','249','250','251','252','253','254','255','256','257','258','259','260','261','262','263','264','265','266','267','268','269','270','271','272');
n[13] = new Array('�ǹ�','����','����','ӭ��','����','�ǳ�','����','������','�ܿڵ�','����','�ִ�','��','�����','ʯ¥','����','��ʯ��','�ŷ�','ʮ��','������','�ӱ���','����ׯ','��ɽ','ʷ��Ӫ','�Ͻ�','ϼ����','����','����');
v[14] = new Array('273','274','275','276','277','278','279','280','281','282','283','284','285','286','287','288','289','290','291','292','293','294','295');
n[14] = new Array('ʤ��','����','ʯ԰','�ʺ�','����','ţ��ɽ','����','�Ϸ���','��ɳ��','����','��СӪ','�ϲ�','ľ��','������','����','�����ׯ','����','����','����','����Ӫ','��ȫӪ','��ʯ��','����');
v[15] = new Array('296','297','298','299','300','301','302','303','304','305','306','307','308','309','310','311','312');
n[15] = new Array('Ϫ��ׯ','ʮ�ﱤ','����կ','������','�޸�ׯ','�����','��ׯ','̫ʦ��','�³���','�ű���','����','������','�����','ʯ��','�����ׯ','�¼���','����');
v[16] = new Array('313','314','315','316','317','318','319','320','321','322','323','324','325','326');
n[16] = new Array('��ɽ','Ȫ��','����','����','����','����','����','������','�Ŷɺ�','����','������','���ӿ�','��ɽ','����');
v[17] = new Array('327','328','329','330','331','332','333','334','335','336','337','338','339','340','341','342');
n[17] = new Array('����','��ׯ','�˴���','������','��ׯ','����','�ĺ�','ǧ�ҵ�','����','���Ӫ','��ɽӪ','��ׯ��','��Ӫ','����','����Ȫ','����');
v[18] = new Array('343','344','345','346','347','348','349','350','351','352','353','354','355','356','357','358','359','360','361','362');
n[18] = new Array('����','�˹�','����','����','����','�𺣺�','ƽ����','����ׯ','����Ӫ','���ߴ�','�ĸ�ׯ','�϶��ֺ�','����Ӫ','��ɽ','���ҵ�','����ׯ','ɽ��ׯ','������','�ܶ�կ','����');


	function selectjd(){
		var row = document.mf.qxid.value;//alert(row);
		var col = v[row].length;//alert(col);
		document.mf.jdid.length = 0;
		document.mf.jdid.options[0] = new Option('����--','0');
		for(var i=0;i<col;i++) {
			if(v[row][i]!=0){
				document.mf.jdid.options[i+1] = new Option(n[row][i],v[row][i]);
			}
		}
	}
	
	function validateTitle(){
		var pass = false;
		if(document.mf.title.value ==""){
			alert("���ⲻ��Ϊ��");
			pass = false;
		}else {
			pass = true;
		}
		if(isNaN(document.mf.zj.value)){
			alert("���������");
			pass = false;
		}
		return pass;
	}

	function vzj() {
		if(isNaN(document.mf.zj.value)){
			var oMsgDiv = document.getElementById("mid");
			oMsgDiv.innerHTML = "<font color='red'>����һ������</font>";
		}else{
			var oMsgDiv = document.getElementById("mid");
			oMsgDiv.innerHTML = "";
		}
	}
-->
</script>
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

			${tblUser.uname}</font>
		</td>
	</tr>
	<tr>
		<td width='150'><a href="tblFwxx!myFwxxInfo.action">�����ҵ��ⷿ��Ϣ</a></td>
	</tr>
	<tr>
		<td width='100'><a href="post.jsp">�����ⷿ��Ϣ</a></td>
	</tr>
	<tr>
		<td width='100'><a href="index.jsp">������ҳ</a></td>
	</tr>
	<tr>
		<td width='100'><a href="tblFwxx!leave.action">[ע��]</a></td>
	</tr>
	</table>
</td>
    <td width="35" background="images/layout_24.gif">&nbsp;</td>
    <td width="495">

	<form action="tblFwxx!postConfirm.action" method="post"  name="mf" onsubmit="return validateTitle()">
		<input type="hidden" name="affirm" value="n">
		<table>
			<tr>
				<td colspan="2">�����ⷿ��Ϣ��</td>
			</tr>
			<tr>
				<td colspan="2"><hr/></td>
			</tr>
			<tr>
			  <td>���⣺</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
			  <td>���أ�</td>
				<td><select name="qxid" onchange="selectjd()"> 
					<option value="0">����--</option> 
					<option value="1">����</option> 
					<option value="2">����</option> 
					<option value="3">����</option> 
					<option value="4">����</option> 
					<option value="5">����</option> 
					<option value="6">����</option> 
					<option value="7">ͨ��</option> 
					<option value="8">��̨</option> 
					<option value="9">��ƽ</option> 
					<option value="10">����</option> 
					<option value="11">��ͷ��</option> 
					<option value="12">ʯ��ɽ</option> 
					<option value="13">��ɽ</option> 
					<option value="14">˳��</option> 
					<option value="15">����</option> 
					<option value="16">����</option> 
					<option value="17">����</option> 
					<option value="18">ƽ��</option> 
 
				</select></td>
			</tr>
			<tr>
			  <td>�ֵ���</td>
				<td>
				
				<select id="jdid" name="jdid"> 
					<option value="0">����--</option>																			 
							 
				</select></td>
			</tr>
			<tr>
			  <td>���</td>
				<td><input type="text" name="zj">Ԫ/��</td>
			</tr>
			<tr>
			  <td>���ͣ�</td>
				<td><select name="shi"> 
					<option value="1">1</option> 
					<option value="2">2</option> 
					<option value="3">3</option> 
					<option value="4">4</option> 
					<option value="5">5</option> 
					<option value="6">6</option> 
					<option value="7">7</option> 
					<option value="8">8</option> 
					<option value="9">9</option> 
				</select>��<select name="ting"> 
					<option value="1">1</option> 
					<option value="2">2</option> 
					<option value="3">3</option> 
					<option value="4">4</option> 
					<option value="5">5</option> 
				</select>��</td>
			</tr>
			<tr>
			  <td>�������ͣ�</td>
				<td><select name="lxid"> 
					<option value="0">����--</option> 
					<option value="1">������</option> 
					<option value="2">ƽ��</option> 
					<option value="3">��ͨסլ</option> 
					<option value="4">��Ԣ</option> 
					<option value="5">����</option> 
 
				</select></td>
			</tr>
			<tr>
			  <td>��ϵ�绰��</td>
				<td><input type="text" name="telephone"></td>
			</tr>
			<tr>
			  <td>��ϵ�ˣ�</td>
				<td><input type="text" name="lxr"></td>
			</tr>
			<tr>
			  <td>������Ϣ��</td>
				<td><textarea name="fwxx" rows="10" cols="40"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
				<div align="center"><input type="submit" value="�ύ" class="btn"></div>				</td>
			</tr>
		</table>
	</form>
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