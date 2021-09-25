package com.example.spring_lecture_2.service;

import com.example.spring_lecture_2.domain.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    private Long id = 0L;
    final List<Article> database = new ArrayList<>();

    private  Long getID() {
        return ++id;
    }

    public Long save(Article request) {
        Article domain = Article.builder()
                .id(getID())
                .title(request.getTitle())
                .content(request.getContent())
                .build();

        database.add(domain);     // save하는 애니까 DB에 넣어줌
        return domain.getId();    // 최종적으로 domain의 id를 넘겨줌
    }

    public Article findById(Long id) {
        return database.stream().filter(article -> article.getId().equals(id)).findFirst().get();
        // article id와 파라미터로 들어온 id가 같은 article만 찾아서 그 중 첫번쨰를 뽑아라
    }
}
