package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";//templates 기준
    }

    @PostMapping("/articles/create")//new.mustache에서 method방식이 post이므로 PostMapping으로 받아야함 인자변수에는 action부분
    public String createArticle(ArticleForm form){//클라이언트에서 입력된 데이터가 AritcleForm 파라미터로 던져진다.
        System.out.println(form.toString());
        return "";
    }
}
