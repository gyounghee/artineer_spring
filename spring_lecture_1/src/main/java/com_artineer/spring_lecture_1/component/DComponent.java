package com_artineer.spring_lecture_1.component;

import org.springframework.stereotype.Component;

@Component    // @Component를 붙이므로써 Container에 등록
public class DComponent {
    CComponent cComponent;

    public DComponent(CComponent cComponent){
        this.cComponent = cComponent;
    }
}
