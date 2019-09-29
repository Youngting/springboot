package com.cs.springboot.demo1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/26
 * e-mail : clemeting@qq.com
 */
@Component
@ConfigurationProperties(prefix = "myfile.config")
public class MyFileConfig {
    String filePath;
    String fileType;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
