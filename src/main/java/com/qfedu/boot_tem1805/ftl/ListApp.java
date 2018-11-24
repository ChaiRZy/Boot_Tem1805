package com.qfedu.boot_tem1805.ftl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *@Author feri
 *@Date Created in 2018/11/23 16:46
 */
@Controller
public class ListApp {

    @RequestMapping("listapp")
    public String list(Model model){
        ArrayList<String> list1=new ArrayList<>();
        for(int i=1;i<11;i++){
            list1.add("第"+i+"名");
        }
        model.addAttribute("list1",list1);
        Set<String> set1=new HashSet<>();
        for(int i=1;i<6;i++){
            set1.add("薪资"+(i*10000));
        }
        model.addAttribute("set1",set1);

        //什么样的Map可以保证顺序？
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        for(int i=88;i<98;i++){
            map.put("组长"+(i-87),i*88);
        }
        model.addAttribute("map1",map);
        return "list";
    }
}
