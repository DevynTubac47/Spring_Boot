package com.devyntubac.soccerfieldmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class CloudinaryConfig {
    @Bean
    Cloudinary cloudinary(){
        return new Cloudinary(ObjectUtils.asMap(
            "cloud_name:","djgyxcaw5",
            "api_key","576414399247788",
            "api_secret","uF5vo7DydRbP4CE_QAwT726LBjE"
        ));
    }
}
