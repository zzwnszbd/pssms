package com.chivotech.pssms.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chivotech.pssms.entity.MaterialInput;
import com.chivotech.pssms.mapper.MaterialInputMapper;
import com.chivotech.pssms.service.MaterialInputService;
import com.chivotech.pssms.util.MaterialInputExcelModel;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
* @author Administrator
* @description 针对表【material_input】的数据库操作Service实现
* @createDate 2024-08-27 14:50:19
*/
@Service
public class MaterialInputServiceImpl extends ServiceImpl<MaterialInputMapper, MaterialInput>
    implements MaterialInputService{

    @Override
    public boolean execelImport(InputStream inputStream, String name) {
        try {
            List<MaterialInputExcelModel> list=new ArrayList<>();
            EasyExcel.read(inputStream)
                    //根据MaterialInputExcelModel模板将excel中的每一行数据进行解析成一个MaterialInputExcelModel对象
                   // 然后将解析后的MaterialInputExcelModel对象放入list中
                    .head(MaterialInputExcelModel.class)
                    .sheet()
                    .registerReadListener(new AnalysisEventListener<MaterialInputExcelModel>() {

                        @Override
                        public void invoke(MaterialInputExcelModel excelData, AnalysisContext analysisContext) {
                            list.add(excelData);
                        }

                        @Override
                        public void doAfterAllAnalysed(AnalysisContext analysisContext) {

                        }
                    }).doRead();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}




