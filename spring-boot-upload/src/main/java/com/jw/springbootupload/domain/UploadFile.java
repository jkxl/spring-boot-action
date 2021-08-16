package com.jw.springbootupload.domain;

/**
 * @program: spring-boot-action
 * @description: 上传文件实体
 * @author: jiankai
 * @create: 2021-08-16 15:12
 **/
public class UploadFile {
    private String fileName;
    private String url;

    public UploadFile(String fileName, String url) {
        this.fileName = fileName;
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
