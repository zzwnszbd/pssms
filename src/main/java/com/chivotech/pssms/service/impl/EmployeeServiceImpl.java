package com.chivotech.pssms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chivotech.pssms.entity.Employee;
import com.chivotech.pssms.service.EmployeeService;
import com.chivotech.pssms.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【employee】的数据库操作Service实现
* @createDate 2024-08-27 14:50:18
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




