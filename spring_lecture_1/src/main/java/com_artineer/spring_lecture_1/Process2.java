package com_artineer.spring_lecture_1;

import com_artineer.spring_lecture_1.component.AComponent;
import com_artineer.spring_lecture_1.component.BComponent;
import com_artineer.spring_lecture_1.component.CComponent;
import com_artineer.spring_lecture_1.component.DComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Process2 implements ApplicationRunner {
    /*    ③    */
    @Autowired    // @Component는 spring Container에 등록을 하는 것이라면, Autowired는 등록된 객체들(Bean들)을 가져와주는 어노테이션
    AComponent aComponent;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*     ①
        BComponent bComponent = new BComponent();
        CComponent cComponent = new CComponent();
        DComponent dComponent = new DComponent();
        AComponent aComponent = new AComponent(bComponent, cComponent, dComponent);
        */

        /*      ②
        // Container를 만들면 Process2에서도 위의 코드처럼 작성 할 필요가 없다,
        AComponent aComponent = Container.getInstance().getaComponent();
        */

        System.out.println(aComponent);
    }
}
