package com_artineer.spring_lecture_1.component;

import org.springframework.stereotype.Component;

@Component    //   @Component  →  spring Container에 등록하는 어노테이션
// Component 어노테이션을 쓰게 되면 Bean이 됨.  →  spring Conatiner가 관리하도록 해줌
public class AComponent {
    BComponent bComponent;      // 필드 주입
    // Acomponent가 Bcomponent를 소유하고 있는 경우 → Acomponent가 Bcomponent에 의존된다.
    // 즉, Bcomponent가 수정이 되면 그 영향이 Acomponent에도 전달이 된다.

   /*    ②
    @Autowired
    public AComponent(BComponent bComponent) {
        this.bComponent = bComponent;        //   생성자 주입  (가장 권장되는 방식)  →  '순환참조'라는 이슈 때문에 사용
                                             //  @Autowired를 넣는 위치에 따라 주입 방식이 결정됨  →  현재는 생성자 위치에 넣었으니 생성자 주입이 됨

    }

    public void setbComponent(BComponent bComponent) {
        this.bComponent = bComponent;          // SETTER 주입   ( 잘 안씀 )
    }
    */

    /*   ①
    @Autowired
    CComponent cComponent;
    @Autowired
    DComponent dComponent;

    public AComponent(BComponent bComponent, CComponent cComponent, DComponent dComponent) {  // ACompoennt 자기들의 인스턴스를 받기위해 생성자 파라미터를 받고,
        this.bComponent = bComponent;
        this.cComponent = cComponent;
        this.dComponent = dComponent;
        // 이와 같이 의존성을 주입함
        // 이러한 것을 의존성 주입이라고 말함.
    */
    }

