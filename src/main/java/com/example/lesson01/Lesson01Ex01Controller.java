package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01") // 클래스에 위치한 Mapping이 먼저 읽힘
@Controller // Spring bean으로 등록
public class Lesson01Ex01Controller {
	
	// http://localhost:8080/lesson01/ex01/1
	@ResponseBody // 리턴되는 값이 Response Body에 넣어준다. => HTML 응답
	@RequestMapping("/1")
	public String ex01_1() { // 리턴타입을 String으로 하겠다, 메소드가 String이다.
		return "<h1>문자열을 Response Body에 보내는 예제</h1>";
	}
	
	// http://localhost:8080/lesson01/ex01/2
	// Map 리턴 => JSON 변환
	// 누군가 변환을 해준다.
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("라즈베리", 22);
		map.put("앵두", 31);
		map.put("체리", 105);
		map.put("딸기", 82);
		
		// map을 리턴하면 JSON이 된다.
		// spring web starter jackson 라이브러리가 포함되어 있기 때문
		
		return map;
	}
	
	
	
	
}
