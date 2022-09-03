package com.liuec.ssm.controller;

import com.liuec.ssm.pojo.Emp;
import com.liuec.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/emp")
    public String getAll(Model model){
        List<Emp> list = empService.getAllEmp();
        model.addAttribute("list",list);
        return "emp_list";
    }
}
