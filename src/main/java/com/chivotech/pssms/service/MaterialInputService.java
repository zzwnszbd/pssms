package com.chivotech.pssms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chivotech.pssms.entity.MaterialInput;

import java.io.InputStream;

/**
* @author Administrator
* @description 针对表【material_input】的数据库操作Service
* @createDate 2024-08-27 14:50:19
*/
public interface MaterialInputService extends IService<MaterialInput> {
    public boolean execelImport(InputStream inputStream,String name);
}
