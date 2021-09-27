package com.example.spring_lecture_2.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Article {
    // 이 객체가 api로 내려갈 때는 표현할 수 있는 표현의 영역으로 한 번 바꾼다음에 내려가야함, 그 표현의 영역에 있는 것이 dto
    // dto  →  어떤 표현을 위해서 만드는 객체
    Long id;
    String title;
    String content;
}
