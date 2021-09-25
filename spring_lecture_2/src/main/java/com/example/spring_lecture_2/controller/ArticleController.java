package com.example.spring_lecture_2.controller;

import com.example.spring_lecture_2.domain.Article;
import com.example.spring_lecture_2.dto.ArticleDto;
import com.example.spring_lecture_2.dto.Response;
import com.example.spring_lecture_2.service.ArticleService;
import com.example.spring_lecture_2.vo.ApiCode;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor  // 알아서 생성자를 만들어줌
@RequestMapping("/api/v1/article")   // 아래 함수들이 쓰는 패스값 중 공통된 것을 묶은 것
@RestController
public class ArticleController {
    private final ArticleService articleService;

    /* @RequiredArgsConstructor 어노테이션을 썼기 때문에 생성자 주입하는 코드가 필요없게 됨
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }
    */

    @PostMapping   //  article을 생성하기 위해
    public Response<Long> post(@RequestBody ArticleDto.ReqPost request) {   //  반환한 것이 생성된 ariticle의 id값이기 때문에 Long으로 return
        Article article = Article.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();

        Long id = articleService.save(article);

        return Response.<Long>builder()
                .code(ApiCode.SUCCESS)
                .data(id)
                .build();
    }

    @GetMapping("/{id}")
    public Response<ArticleDto.Res> get(@PathVariable Long id)  {
        Article article = articleService.findById(id);

        ArticleDto.Res response = ArticleDto.Res.builder()
                .id(String.valueOf(article.getId()))
                .title(article.getTitle())
                .content(article.getContent())
                .build();

        return Response.<ArticleDto.Res>builder()
                .code(ApiCode.SUCCESS)
                .data(response)
                .build();
    }
}
