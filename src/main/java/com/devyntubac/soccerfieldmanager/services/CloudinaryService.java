package com.devyntubac.soccerfieldmanager.services;

import java.util.Map;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import java.util.Date;
import java.io.IOException;
import java.text.SimpleDateFormat;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Service
public class CloudinaryService {
    @Autowired
    private Cloudinary cloudinary;

    public Map<String, Object> uploadImg(MultipartFile file, String folder) throws IOException{
        String originalFilename = file.getOriginalFilename();

        if(originalFilename == null){
            throw new IllegalArgumentException("El archivo no puede estar nulo");
        }

        String newName = originalFilename.substring(0,originalFilename.lastIndexOf('.'));

        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    
        String fileName = newName + "_" + timestamp;

        @SuppressWarnings({"unchecked"})
        Map<String, Object> uploadResult = cloudinary.uploader().upload(file.getBytes(),
        ObjectUtils.asMap(
            "folder", folder,
            "public_id", fileName
        ));
    }
}
