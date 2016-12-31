package pkuhit.iih.qa.qasys;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "QAK01.AT01";
// 组织机构编码
public static final   String  ORGANIZATION_CODE = "QAK01.AT02";
// 根质控体系编码
public static final   String  ROOT_CODE = "QAK01.AT03";
// 版本号
public static final   String  VERSION_NO = "QAK01.AT04";
// 使用中标志
public static final   String  IN_USE_FLAG = "QAK01.AT05";


@Column(name="QA_SYS_CD") 
private  String code;

@Column(name="ORG_CD") 
private  String organizationCode;

@Column(name="RT_QA_SYS_CD") 
private  String rootCode;

@Column(name="VER_NO") 
private  String versionNo;

@Column(name="IN_USE_F") 
private  Integer inUseFlag;
// 组织机构名称
//@DictionaryTag(code = "organizationCode")
private  String organizationName;
// 根质控体系名称
@DictionaryTag(code = "rootCode")
private  String rootName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.organizationCode;
 }

 {
  this.organizationCode = organizationCode;
 }

 {
     return this.rootCode;
 }

 {
  this.rootCode = rootCode;
 }

 {
     return this.versionNo;
 }

 {
  this.versionNo = versionNo;
 }

 {
     return this.inUseFlag;
 }

 {
  this.inUseFlag = inUseFlag;
 }

 {
     return this.organizationName;
 }

 {
  this.organizationName = organizationName;
 }

 {
     return this.rootName;
 }

 {
  this.rootName = rootName;
 }

