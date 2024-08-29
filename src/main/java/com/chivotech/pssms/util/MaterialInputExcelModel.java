package com.chivotech.pssms.util;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: MaterialInputExcelModel
 * Package: com.chivotech.pssms.util
 * Description:
 *
 * @Author zzw
 * @Create 2024/8/27 17:01
 */
@Data
public class MaterialInputExcelModel {
    @ExcelProperty("供应商代码")
    private String supplierId;
    @ExcelProperty("到货日期")
    private String orderDate;
    @ExcelProperty("仓库代码")
    private String storageId;
    @ExcelProperty("物料编码")
    private String materialCode;
    @ExcelProperty("物料名称")
    private String materialName;
    @ExcelProperty("规格型号")
    private String style;
    @ExcelProperty("计量单位")
    private String unitName;
    @ExcelProperty("采购单号")
    private String orderId;
    @ExcelProperty("生产批号")
    private String batchNo;
    @ExcelProperty("数量")
    private BigDecimal orderCount;
}
