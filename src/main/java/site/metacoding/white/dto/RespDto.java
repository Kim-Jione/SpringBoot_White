package site.metacoding.white.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // json 컨버팅
@AllArgsConstructor
public class RespDto<T> {
	private Integer code; // -1 실패, 1 성공
	private String msg; // 통신 결과 메시지로 담기
	private T body;
}
