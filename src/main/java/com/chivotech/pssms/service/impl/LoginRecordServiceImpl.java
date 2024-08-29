package com.chivotech.pssms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chivotech.pssms.entity.LoginRecord;
import com.chivotech.pssms.service.LoginRecordService;
import com.chivotech.pssms.mapper.LoginRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【login_record】的数据库操作Service实现
* @createDate 2024-08-27 14:50:18
*/
@Service
public class LoginRecordServiceImpl extends ServiceImpl<LoginRecordMapper, LoginRecord>
    implements LoginRecordService{

}




