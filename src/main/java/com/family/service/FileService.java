package com.family.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:05 2017/11/2
 */
public interface FileService {

    /**
     * 上传文件
     * @param file 文件
     * @param fileName 文件名称
     * @param path 上传路径
     * @return
     */
     String upload(MultipartFile file, String fileName, String path);
}
