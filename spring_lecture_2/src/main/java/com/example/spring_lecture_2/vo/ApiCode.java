package com.example.spring_lecture_2.vo;

import com.fasterxml.jackson.annotation.JsonFormat;   // +) spring은 데이터를 변환할 때 jackson이라는 라이브러리를 사용함
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ApiCode {   // ApiCode를 통해 code와 desc을 묶어서 결합도가 떨어지는 이슈 개선, 중복에 대한 이슈 사라짐
    SUCCESS("CM0000","정상입니다") //  enum의 특성 → spring은 enum객체를 API에서 컨버팅 할 때 이름객체를 씀
                                            // 이름객체가 아닌 속성들을 내려주고 싶을 떈, @JsonFormat(shape = JsonFormat.Shape.OBJECT)를 써주면 됨
    ;

    private final String name;
    private final String desc;

    ApiCode(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /*  @Getter 어노테이션을 썼으니 지워도 됨

    // ↓ 직접 사용(접근)을 해야하기 때문에 GETTER를 만듦
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

     */
}
