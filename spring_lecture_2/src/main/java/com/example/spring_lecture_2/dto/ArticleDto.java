package com.example.spring_lecture_2.dto;

import com.example.spring_lecture_2.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// domain layer와 presentation layer가 구분이 되어야하고 이를 위해 tt영역(..?)에 사용하는 객체가 dto임
public class ArticleDto {
    @Getter
    public static class ReqPost {    // ArticleDto에 생성 요청을 할 때에 대한 객체
        String title;
        String content;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Res {
        private String id;
        private String title;
        private  String content;
    }
}
