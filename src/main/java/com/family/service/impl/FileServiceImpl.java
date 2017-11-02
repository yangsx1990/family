package com.family.service.impl;

import com.family.service.FileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:06 2017/11/2
 */
@Service
public class FileServiceImpl  implements FileService{

    @Value("${user.server.url}")
    private String serverDomain;

    @Override
    public String upload(MultipartFile file, String fileName, String path) {
        String picUrl = serverDomain;
        // 获取文件名
        File dest = new File(path, fileName);
        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
            picUrl += "/" + fileName;
        } catch (IOException e) {
            e.printStackTrace();
            picUrl="";
        }
        return picUrl;
    }
}
