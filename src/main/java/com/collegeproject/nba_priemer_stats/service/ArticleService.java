package com.collegeproject.nba_priemer_stats.service;

import com.collegeproject.nba_priemer_stats.model.Article;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ArticleService {
    private final RestTemplate restTemplate;

    public ArticleService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Article> fetchArticles(String source, String player, String team, Integer limit) {
        String url = "https://nba-stories.onrender.com/articles";
        StringBuilder params = new StringBuilder();

        if (source != null) params.append("&source=").append(source);
        if (player != null) params.append("&player=").append(player);
        if (team != null) params.append("&team=").append(team);
        if (limit != null) params.append("&limit=").append(limit);

        if (!params.isEmpty()) {
            url += "?" + params.substring(1); // remove the first '&'
        }

        Article[] articles = restTemplate.getForObject(url, Article[].class);
        return List.of(articles);
    }
}
