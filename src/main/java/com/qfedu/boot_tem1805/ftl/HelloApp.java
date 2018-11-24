package com.qfedu.boot_tem1805.ftl;

import com.qfedu.boot_tem1805.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 *@Author feri
 *@Date Created in 2018/11/23 16:23
 */
@Controller
public class HelloApp {

    @RequestMapping("helloapp")
    public String hello(Model model){
        model.addAttribute("name","1805开发工程师");
        model.addAttribute("num1",2233L);
        model.addAttribute("num2",true);
        model.addAttribute("str1","我们都是最棒的");
        Student student=new Student();
        student.setName("1805");
        student.setAge(21);
        model.addAttribute("stu",student);
        model.addAttribute("mydate",new Date());

        return "hello";
    }
}
