package cn.cych.controller;

import cn.cych.domains.Items;
import cn.cych.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController{

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findById.do")
    public String itemFind(Model model){

        Items items = itemsService.findById(1);
        System.out.println(items);
        model.addAttribute("item",items);
        return "itemDetail";

    }

}