/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.incis.Portofolio;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 *
 * @author KRSNBUSER64
 */

@Controller
@RequestMapping
public class MainController {

    @GetMapping
    public @ResponseBody String connectionTest () {
        return "Connection Success!";
    }
}
