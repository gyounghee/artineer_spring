package com_artineer.spring_lecture_1.component;

import org.springframework.stereotype.Component;

@Component    // @Component를 붙이므로써 Container에 등록
public class CComponent {
    DComponent dComponent;

    public CComponent(DComponent dComponent) {
        this.dComponent =  dComponent;
    }
}
