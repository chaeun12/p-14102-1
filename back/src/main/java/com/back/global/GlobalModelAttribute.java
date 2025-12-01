package com.back.global;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalModelAttribute {

    // 모든 컨트롤러의 모든 요청 메서드 실행 전에 자동 실행됨
    @ModelAttribute("siteName")
    public String siteName() {
        return "커뮤니티 사이트 A"; // 모든 컨트롤러에서 공통 사용 가능
    }
}