package com.chivotech.pssms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName: MaterialInputController
 * Package: com.chivotech.pssms.controller
 * Description:
 *
 * @Author zzw
 * @Create 2024/8/27 16:54
 */
public class MaterialInputController {
    @PostMapping("/import")
    public String materialInputImport(@RequestParam("file") MultipartFile file){
        return null;
    }
}
