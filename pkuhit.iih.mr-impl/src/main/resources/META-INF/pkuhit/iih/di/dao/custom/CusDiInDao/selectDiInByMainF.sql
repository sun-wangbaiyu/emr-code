select
  DI_SN,
  EN_SN,
  PAR_DI_SN,
  ORG_CD,
  LVL,
  LVL1_SORT_NO,
  LVL2_SORT_NO,
  DI_TYPE_CD,
  DI_CD,
  DI_NM,
  ICD_CD,
  ADD_DESCR,
  MAIN_F,
  DI_TIME,
  DI_EMP_ID,
  DI_DEPT_CD,
  MEMO,
  SORT_NO,
  SPELL_NO,
  WUBI_NO,
  UPD_CNT,
  CRT_TIME,
  CRT_USER_ID,
  CRT_DEPT_CD,
  LAST_UPD_TIME,
  LAST_UPD_DEPT_CD,
  LAST_UPD_USER_ID,
  DEL_F,
  DI_TYPE_NM
  from DI_IN t
 where t.en_sn = /*enSn*/'p5s1'
  and t.main_f = /*mainF*/'p5s1'
 and   t.del_f = 0
 order by t.lvl1_sort_no, t.lvl2_sort_no
