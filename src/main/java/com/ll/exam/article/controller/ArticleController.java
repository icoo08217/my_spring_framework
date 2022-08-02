package com.ll.exam.article.controller;

import com.ll.exam.annotation.GetMapping;
import com.ll.exam.annotation.Controller;

@Controller
public class ArticleController {
    @GetMapping("/usr/article/list") // /usr/article/list/free 와 같이 관련된 요청을 처리하는 함수이다.
    // 아래 showList 는 Get /usr/article/list 으로 요청이 왔을 때 실행 되어야 하는 함수이다.
    public void showList() {

    }
}
