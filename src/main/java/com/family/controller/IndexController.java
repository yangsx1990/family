package com.family.controller;

import com.family.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午3:58 2017/11/2
 */
@RestController
public class IndexController {

    @Autowired
    FileService fileService;

    @Value("${upload.path}")
    private String uploadPath;

    @RequestMapping("/test")
    public void test(){
        System.out.println("222");
    }

    @RequestMapping("/upload")
    public ResponseEntity<String> upload(@RequestParam("test") MultipartFile file) {
        if (file.isEmpty()) {
            throw new RuntimeException("上传图片不能为空");
        }
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
        String fileName = new SimpleDateFormat().format(new Date()) + suffix;
        String path = fileService.upload(file, fileName, uploadPath);
        return new ResponseEntity<String>(path, HttpStatus.OK);
    }
}
