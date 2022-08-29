package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// http Method -> Mapping 기술 4가지 (get, post, put, delete)

// form 태그는 get과 post 밖에 못한다 form 태그가 만들어진 시점이 옛날이고 이후에 put, delete가 생겨서 못한다 -> 자바스크립트로 요청해야 한다 
// GET -> 주소창, 하이퍼링크
// POST, GET -> form 태그
// PUT, DELTE, GET, POST -> JS

// 포스트맨 -> 4가지 요청을 쉽게 테스트 해볼 수 있다.
@RestController // data를 응답, 파일이 아님
public class FirstController {
	@GetMapping("/first")
	// 서비스랑 다오를 만들줄 알면 외부에서 서비스를 어떻게 때리냐
	// 서비스를 컴퍼지션 하면 끝, has의 관계, 의존하게 만들면 된다
	// 컨트롤러 만들줄 알면 클라이언트와 통신이 가능해진다
	public String getData() {
		return "<h1>data</h1>";
	}

	@PostMapping("/first")
	public String postData() {
		return "<h1>insert data</h1>";
	}

	@PutMapping("/first")
	public String putDat() {
		return "<h1>update data</h1>";
	}

	@DeleteMapping("/first")
	public String deleteDat() {
		return "<h1>delete data</h1>";
	}

}
