/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enjoylearn.springjsf;

import javax.inject.Named;
import org.springframework.stereotype.Component;

/**
 *
 * @author sihai
 */
@Component("tt")
//not work @Named("tt")
//not work @javax.faces.bean.ManagedBean
public class TestController {
    public String getName(){
        return "你好";
    }
}
