package com.jw.springbootupload.config;

import com.jw.springbootupload.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * @program: spring-boot-action
 * @description: 文件上传模块-配置类
 * @author: jiankai
 * @create: 2021-08-16 15:09
 **/
@Service
public class FileUploadConfiguration implements CommandLineRunner {

    @Autowired
    FileStorageService fileStorageService;

    @Override
    public void run(String... args) throws Exception {
        fileStorageService.clear();
        fileStorageService.init();
    }
}
