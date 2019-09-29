package com.cs.springboot.demo1.service;

import com.cs.springboot.demo1.config.MyFileConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/26
 * e-mail : clemeting@qq.com
 */
@Service
public class FileServiceImpl implements FileService {
    @Autowired
    MyFileConfig myFileConfig;

    @Override
    public void parseFile() {
        String filePath = myFileConfig.getFilePath();
        String fileType = myFileConfig.getFileType();

        System.out.println(filePath);
        System.out.println(fileType);

    }
}
