package com.collegeproject.nba_priemer_stats.controller;

import com.collegeproject.nba_priemer_stats.model.Article;
import com.collegeproject.nba_priemer_stats.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/articles")
    public List<Article> getArticles(
            @RequestParam(required = false) String source,
            @RequestParam(required = false) String player,
            @RequestParam(required = false) String team,
            @RequestParam(required = false) Integer limit) {
        return articleService.fetchArticles(source, player, team, limit);
    }
}
