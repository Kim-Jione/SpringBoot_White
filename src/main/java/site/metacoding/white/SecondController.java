package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 데이터 받기 
// GET -> http body가 없음 -> QueryString(목표: 데이터베이스에 where절 거는 것), PathVariable(PK) -> Form (GET) -> 브라우저(주소뒤에 ?)
// POST, PUT -> http body 담아준다 -> Form(POST) -> JS
// DELETE -> http body가 없음 -> QueryString, PathVariable(PK)

/*
 * GET localhost:8000/board/2
 * GET localhost:8000/board?content=스프링
 * DELETE localhost:8000/board/id=1
 * */

@RestController
public class SecondController {

	@GetMapping("/second/{id}") // PK(id)가 1인것
	public String getData(@PathVariable Integer id) {
		return "id: " + id;
		// http://localhost:8000/second/5
		// id: 5
	}

	// QueryString = x-www-머시기 타입이다
	@GetMapping("/second") // PK(id)가 1인것
	public String getData2(String title, String content) {
		return "title:" + title + ", content:" + content;
		// http://localhost:8000/second?title=스프링&content=스프링내용
		// title:스프링, content:스프링내용
	}

	// BR -> title=제목&content=내용
	@PostMapping("/second")
	public String getData(String title, String content) { // 스프링 팟싱 기본 적략 : x-www-form-머시기
		return "title : " + title + ", content : " + content;
	}
	
	@PutMapping("/second")
	public String putData(String title, String content) { // 스프링 팟싱 기본 적략 : x-www-form-머시기
		return "title : " + title + ", content : " + content;
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) { // 스프링 팟싱 기본 적략 : x-www-form-머시기
		return id+ "delete ok";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


