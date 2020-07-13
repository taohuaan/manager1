alter table BATCHINFORMATION add(batchdealclass varchar2(100)); 
 
delete from  BATCHINFORMATION;
insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS01', '每天從LIS系統遷移commision數據', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS01');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS04', '加扣款跑批  MidMonth跑批  Monthend 跑批 broker 加扣款跑批 broker Monthend 跑批 同步Statement文件路徑信息批處理', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS04');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS05', '考覈計算   Finance    ', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS05');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS08', '每日AMS到LIS跑批  代理人同步', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS08');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS10', '代理人未來離職跑批  代理人同步', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS10');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS11', 'Amortization跑批 Finance', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS11');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS12', '預估  Finance      ', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS12');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS13', '預估反轉  Finance ', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS13');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS17', 'Agency 發盤批處理', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS17');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS18', 'Agency 回盤批處理', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS18');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS19', 'Broker 發盤批處理', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS19');

insert into BATCHINFORMATION (BATCHCODE, BATCHDESCRIPT, MAKEDATE, MAKETIME, MODIFYDATE, MODIFYTIME, BATCHDEALCLASS)
values ('CMS20', 'Broker 回盤批處理', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', to_date('11-04-2019', 'dd-mm-yyyy'), '17:41:00', 'Batch_AMSToLIS_AMS20');

delete from  LDSysVar  where sysvar = 'WebPath'; 
 
insert into LDSysVar (SYSVAR, SYSVARTYPE, SYSVARVALUE)
values ('WebPath', null, 'http://?IP?:8001/WLS_CMS');
