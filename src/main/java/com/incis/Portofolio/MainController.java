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
// @RequestMapping(path="/demo")
@RequestMapping
public class MainController {
    // @Autowired
    // private UserRepository userRepository;
    
    // @PostMapping(path="/add")
    // public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email){
    //     UserModel n = new UserModel();
    //     n.setName(name);
    //     n.setEmail(email);
    //     userRepository.save(n);
    //     return "Successfully Saved";
    // }
    
    // @GetMapping(path="/all")
    // public @ResponseBody Iterable<UserModel> getAllUsers(){
    //     return userRepository.findAll();
    // }

    // @GetMapping(path="/test")
    @GetMapping
    public @ResponseBody String connectionTest () {
        return "Connection Success!";
    }
}
