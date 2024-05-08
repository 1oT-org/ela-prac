package org.example.elaprac.controller;

import org.example.elaprac.dto.ArticleDTO;
import org.example.elaprac.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("health")
    public String healthCheck() {
        return "fine!";
    }

    @GetMapping("articles/{articleCode}")
    public ArticleDTO findArticleByArticleCode(@PathVariable("articleCode") int articleCode) {
        return articleService.findArticleByArticleCode(articleCode);
    }

}
