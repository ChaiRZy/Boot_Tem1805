package com.qfedu.boot_tem1805.thymeleaf;

import com.qfedu.boot_tem1805.domain.Student;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/11/23 17:20
 */
@Controller
public class HelloController {

    @RequestMapping("thyhello")
    public String hello(Model model){
        model.addAttribute("str","第一次使用");
        model.addAttribute("num",1688);
        Student student=new Student();
        student.setName("下课");
        student.setAge(18);
        model.addAttribute("stu",student);
        return "thello";
    }

    @RequestMapping("thylist")
    public String list(Model model){
        model.addAttribute("ishave",true);
        List<Student> studentList=new ArrayList<>();
        for(int i=1;i<10;i++){
            Student student=new Student();
            student.setName("张"+i);
            student.setAge(18);
            studentList.add(student);
        }
        model.addAttribute("students",studentList);

        HashMap<Integer,String> map=new HashMap<>();
        for(int i=1;i<20;i++){
            map.put(i,"java"+i);
        }
        model.addAttribute("map1",map);
        return "tstudy";
    }
}
