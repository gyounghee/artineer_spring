package com.example.spring_lecture_2.controller;

import com.example.spring_lecture_2.dto.Response;
import com.example.spring_lecture_2.vo.ApiCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController   // @RestController  →  아래의 객체를 컨트롤러로 쓰겠다. (웹의 진입점으로 쓰겠다)
public class PingController {
    @GetMapping("/")    //  ("/")  이 패스는 생략이 가능함
    public ResponseEntity<Response<String>> ping() {   // 이 요청이 들어왔을 때 실행될 함수를 만듦
        Response<String> response = Response.<String>builder()
                .code(ApiCode.SUCCESS).data("pong").build();
        // builder는 불편성 유지(수정 자체가 불가능)

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)   //  INTERNAL_SERVER_ERROR를 쓰게 되면 그 헤드 값에 있는 http status코드도 직접 수정이 가능 함
                .body(response);
    }

    /*  API 행위 표현
    @GetMapping("/users/13")       //  조회  →  13번 쨰 유저를 조회해줘

    @PostMapping("/users")         //  추가  →  유저라는 자원을 하나 추가할거야

    @PutMapping("/users/14")       //  수정  →  14번째 유저를 수정할거야

    @DeleteMapping("/users/14")    //  삭제  →  14번쨰 유저를 삭제할거야
    */
}




/*
class Obj {
    String param1;
    String param2;
    String param3;
    String param4;
    String param5;
    String param6;

    public Obj(String param1, String param2, String param3, String param4, String param5, String param6) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.param6 = param6;
    }
    //  하나의 객체에 의존성들이 많게 되면 생성자에 그 의존성들을 다 넣어주고 초기화를 하게 됨
    //  여기서 생길 수 있는 이슈
    //  파라미터를 구분할 수 있는 방법이 생성자에 들어가는 순서 밖에 없음 (순서로 구분하게 되면 가독성이 떨어짐)
    //  이를 개선하기 위해 SETTER를 통해 의존성 주입이 가능함
}

class Process {
    public static void main(String[] args) {
        final Obj obj = new Obj("p1", "p2", "p3", "p4", "p5","p6");
        // 생성자만을 사용하면 가독성이 떨어지고, SETTER를 사용하면 불변성을 유지하지 어려움

        // 1000줄 코드
        obj.setParam2("change p2");

        return obj;
    }
}
*/