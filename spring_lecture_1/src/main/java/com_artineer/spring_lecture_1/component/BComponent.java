package com_artineer.spring_lecture_1.component;

import org.springframework.stereotype.Component;

@Component   // @Component를 붙이므로써 Container에 등록
public class BComponent {
}


// 순환참조 → 서로가 의존하고 있는 구조