package com.chivotech.pssms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chivotech.pssms.entity.Department;
import com.chivotech.pssms.service.DepartmentService;
import com.chivotech.pssms.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【department】的数据库操作Service实现
* @createDate 2024-08-27 14:50:18
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




