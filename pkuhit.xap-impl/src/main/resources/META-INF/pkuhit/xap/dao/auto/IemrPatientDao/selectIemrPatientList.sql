select
  *
from
  IEMR_PATIENT
where 1=1
/*%if condition != null */
 and ( patient_name like /* @contain(condition) */'%X%' --患者姓名  
 or inpatient_no like /* @contain(condition) */'%X%' --住院号
 or tel like /* @contain(condition) */'%X%') --手机号
/*%end */
 and del_f = 0
 order by last_upd_time desc nulls last
