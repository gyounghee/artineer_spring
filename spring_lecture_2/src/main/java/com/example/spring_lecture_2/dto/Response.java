package com.example.spring_lecture_2.dto;

import com.example.spring_lecture_2.vo.ApiCode;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Response<T> {
    private ApiCode code;
    private T data;

    /*        →   빌더와 생성자를 만들 때 썼던 코드들도 필요가 없게됨

      private Response (){}

    public Response(ApiCode code, String data) {
        this.code = code;
        this.data = data;
    }

     */


    /*   @ Getter라는 어노테이션을 쓰면 아래의 코드들이 자동으로 생성됨

    public ApiCode getCode() {
        return code;
    }

    public String getData() {
        return data;
    }

     */


    /*   @Builder라는 어노테이션을 쓰면 아래의 코드들이 자동 생성됨

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Response response;

        public Builder() {
            this.response = new Response();
        }

        public Builder code(ApiCode code) {
            this.response.code = code;
            return this;
        }

        public Builder data(String data) {
            this.response.data = data;
            return this;
        }

        public Response build() {
            return this.response;
        }
    }

     */
}