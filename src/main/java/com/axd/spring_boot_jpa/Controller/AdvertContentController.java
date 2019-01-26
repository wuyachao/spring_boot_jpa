package com.axd.spring_boot_jpa.Controller;

import com.axd.spring_boot_jpa.Entity.TbAdvertContentEntity;
import com.axd.spring_boot_jpa.Repository.AdvertContentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/advert")
public class AdvertContentController {
    @Resource
    private AdvertContentRepository ad;
    @GetMapping("/content/all")
    public List<TbAdvertContentEntity> allAdvertContent(){
        return ad.findAll();
    }
}
