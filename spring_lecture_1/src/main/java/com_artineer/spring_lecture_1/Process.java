package com_artineer.spring_lecture_1;

import com_artineer.spring_lecture_1.component.AComponent;
import com_artineer.spring_lecture_1.component.BComponent;
import com_artineer.spring_lecture_1.component.CComponent;
import com_artineer.spring_lecture_1.component.DComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component  // ApplicationRunner는 @Component가 있어야 동작하기 때문에 Component라는 어노테이션을 붙임
// Process는 Component가 아닌데 @Component 어노테이션을 붙이는 이유
// spring은 Bean이 등록된 애들끼리만 커뮤니케이션이 됨. (등록이 안되있어도 커뮤니케이션이 되긴하지만 권장하지 않음)
// 또한, ApplicationRunner를 써야하기 때문 / ApplicationRunner는 @Component가 있어야 동작함

public class Process implements ApplicationRunner {
    /*    ③    */
    @Autowired    // @Component는 spring Container에 등록을 하는 것이라면, Autowired는 등록된 객체들(Bean들)을 가져와주는 어노테이션
    AComponent aComponent;    // AComponent aComponent = new AComponent();  를 할 필요없이 의존성 주입이 됨

    @Override
    public void run(ApplicationArguments args) throws Exception{
        DComponent dComponent = new DComponent();
        CComponent cComponent = new CComponent();

        /*    ①
        BComponent bComponent = new BComponent();
        CComponent cComponent = new CComponent();
        DComponent dComponent = new DComponent();

        AComponent aComponent = new AComponent(bComponent, cComponent, dComponent);
        // spring이 제공해주는 의존성 관리를 안쓰게 되면 → AComponent를 위해 B,C,DComponent를 다 만들어야 하는 상황  (쓸데없는 것 까지 생각해야하는 불편함)
        // spring은 이런 것 들을 전혀 생각하지 않게하기 위해 '의존성 관리' 라는 것을 제공함
        */

        /*    ②
        // Container를 만들어 놓은 상태에서 AComponent를 생성한다고 하면  위와 같이 코드를 짤 필요가 없음
        AComponent aComponent = Container.getInstance().getaComponent();  // AComponent를 생성하려면 Container에서 Instance를 가져오고 거기에서 AComponent를 가져오면 된다.
        */
    }
}
// 이렇게 돌려보면 해시값..? 주소값..? 이 동일하게 나옴
// 직접 의존성을 관리해서 짰던 코드에 대한 이슈들을 해결하기 위해서 Container를 만들었고
// 이 Container에서 Component들을 관리해주다보니 중복 / singleton / 의존되있는 Component들까지 고려해야하는 문제들이 사라짐2