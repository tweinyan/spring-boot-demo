package com.twein.girl.repository;

import com.twein.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by tweinyan on 23/03/2018.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer>{
    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
