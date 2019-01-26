package com.axd.spring_boot_jpa.Repository;

import com.axd.spring_boot_jpa.Entity.TbAdvertContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdvertContentRepository extends JpaRepository<TbAdvertContentEntity,String> {

}

