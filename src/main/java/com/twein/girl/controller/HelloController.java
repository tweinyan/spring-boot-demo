package com.twein.girl.controller;

import com.twein.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tweinyan on 22/03/2018.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value="/say/{id}", method= RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return "id: " + id;
//        return girlProperties.getCupSize();
    }
}
