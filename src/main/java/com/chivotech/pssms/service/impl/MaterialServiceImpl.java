package com.chivotech.pssms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chivotech.pssms.entity.Material;
import com.chivotech.pssms.mapper.MaterialMapper;
import com.chivotech.pssms.service.MaterialService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【material】的数据库操作Service实现
* @createDate 2024-08-27 14:50:19
*/
@Service
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, Material>
    implements MaterialService{

}




