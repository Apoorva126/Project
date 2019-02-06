package com.apoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CategoryController {
@RequestMapping("/category")
public String showCategory(Model mv)
{
	mv.addAttribute("pageinfo","ManageCategory");
	return "Category";
	}
}
