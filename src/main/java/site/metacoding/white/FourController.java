package site.metacoding.white;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Four;
import site.metacoding.white.dto.RespDto;

@RestController
public class FourController {
	
	
	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four; // 디스패쳐 서블릿에게 돌아간다 // DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달한다
	}
	
	// 통신할 때는 이 방법이 좋다
	@GetMapping("/four/data")
	public ResponseEntity<Four> getData2() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		ResponseEntity<Four> response = new ResponseEntity<>(four,HttpStatus.OK);
		return response; // 디스패쳐 서블릿에게 돌아간다 // DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달한다
	}
	
	@GetMapping("/four/data2")
	public ResponseEntity<?> getData3() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new ResponseEntity<> (four, HttpStatus.CREATED); // 디스패쳐 서블릿에게 돌아간다 // DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달한다
	}
	
	
	@GetMapping("/four/dto")
	public RespDto<Four> getData4() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new RespDto<>(1, "성공", four);
	}
}
