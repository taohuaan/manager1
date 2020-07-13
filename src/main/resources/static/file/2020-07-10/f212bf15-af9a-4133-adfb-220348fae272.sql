alter table BATCHINFORMATION add(batchdealclass varchar2(100)); 
 
delete from  BATCHINFORMATION;
insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS01', 'ÿ���LISϵ�y�w��commision����', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS01');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS04', '�ӿۿ�����  MidMonth����  Monthend ���� broker �ӿۿ����� broker Monthend ���� ͬ��Statement�ļ�·����Ϣ��̎��', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS04');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS05', '��҇Ӌ��   Finance    ', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS05');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS08', 'ÿ��AMS��LIS����  ������ͬ��', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS08');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS10', '������δ���x����  ������ͬ��', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS10');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS11', 'Amortization���� Finance', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS11');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS12', '�A��  Finance      ', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS12');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS13', '�A�����D  Finance ', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS13');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS17', 'Agency �l�P��̎��', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS17');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS18', 'Agency �رP��̎��', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS18');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS19', 'Broker �l�P��̎��', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS19');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS20', 'Broker �رP��̎��', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS20');

delete from  LDSysVar  where sysvar = 'WebPath'; 
 
insert into LDSysVar (SYSVAR, SYSVARTYPE, SYSVARVALUE)
values ('WebPath', null, 'http://?IP?:8001/WLS_CMS');
