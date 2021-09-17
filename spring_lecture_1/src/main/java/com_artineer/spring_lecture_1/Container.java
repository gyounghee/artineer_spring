package com_artineer.spring_lecture_1;

import com_artineer.spring_lecture_1.component.AComponent;
import com_artineer.spring_lecture_1.component.BComponent;
import com_artineer.spring_lecture_1.component.CComponent;
import com_artineer.spring_lecture_1.component.DComponent;

public class Container {
    private static final Container singleton = new Container();

    private AComponent aComponent;
    private BComponent bComponent;
    private CComponent cComponent;
    private DComponent dComponent;

    private Container() { }  // 생성자의 접근제어를 private으로 바꿔주기 위해서 만들어줌
                             // Container는 singleton타입인데 singleton타입인 객체를 생성자를 접근할 수 있게 해버리면 새로운 인스턴스를 만들 수 있기 때문에 이를 막기위해 짜줌

    public static Container getInstance() {
        return singleton;
    }

    public synchronized AComponent getaComponent(){   // 단 하나의 인스턴스만 만들기 위해 짠 코드
        if(bComponent == null) {
            bComponent = new BComponent();
        }
        /*
        if(cComponent == null) {
            cComponent = new CComponent();
        }

        if(dComponent == null) {
            dComponent = new DComponent();
        }
        */
        if(aComponent == null) {
            aComponent = new AComponent();
            // aComponent = new AComponent(bComponent, cComponent, dComponent);
        }

        return aComponent;
    }

}
