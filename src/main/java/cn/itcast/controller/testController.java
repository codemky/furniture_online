package cn.itcast.controller;

import cn.itcast.pojo.TbAdmin;
import cn.itcast.service.TestService;
import cn.itcast.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2019-03-29 8:32
 */
@Controller

public class testController {


    @Autowired
    private TestServiceImpl service;


    @RequestMapping("/list")
    public String findAdminById(Model model){
//        TbAdmin byId = service.findById(1);
//        model.addAttribute("admin",byId);
        return "test";
    }
}
