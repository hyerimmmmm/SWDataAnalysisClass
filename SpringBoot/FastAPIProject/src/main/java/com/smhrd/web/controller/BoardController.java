package com.smhrd.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smhrd.web.entity.Board;
import com.smhrd.web.entity.SearchCriteria;
import com.smhrd.web.mapper.BoardMapper;

// ~~Application(main method 가지고 있는 파일) 하위 패키지로 해당하는 파일들을 생성

// FC(Front Controller)가 업무를 지시하는 역할을 하는 일반 자바클래스(POJO)
// --> 해당하는 파일을 통해서만, jsp or html 문서를 화면에 띄울 수 있음

// Spring Container가 해당하는 파일을 scan 할 수 있게끔 해주는 annotation
// annotation은 선언구문보다 위쪽에 작성하는 것이 원칙
@Controller
public class BoardController {
	
	// 데이터 흐름을 체크할 수 있는 log찍는 도구 꺼내오기
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired // --> container에 자동으로 생성된 객체를 연결하는 annotation
	BoardMapper mapper;
	
	// Spring boot는 RequestMapping을 선호하지 않음
	// 정확한 전송방식을 지정하는 것을 권장
	@GetMapping("/")
	public String board(Model model) {
		// Model -> request 경량화 버전
		// 내가 직접 생성할 필요없이, 매개변수로 받아오면 알아서 container 전달
		
		// 1. DAO 생성
		// BoardDAO dao = new BoardDAO();
		// 2. DAO 사용
		List<Board> boardList = mapper.selectBoard();
		// 3. 결과를 받아와서, request 영역에 데이터를 바인딩
		model.addAttribute("boardList", boardList);
		
		return "board";
		// --> 이동해야 할 페이지를 리턴
		// ViewResolver가 논리적인 주소값을 물리적인 주소값으로 변환
		// 내가 설정한 prefix + board + suffix
		// * forward 방식으로 이동: 요청 1번, 응답 1번
		//   --> 초기 요청 url이 변하지 않고, 요청 객체가 다음 페이지까지 유효
		// * redirect 방식: 요청 2번, 응답 2번
		
	}
	
	// 글쓰기 페이지를 열어줄 수 있는 메소드
	@GetMapping("/insert")
	public String insert() {
		return "insert";
	}
	
	// 글쓰기 기능을 동작하게 하는 메소드
	@PostMapping("/insert")
	public String insert(Board board) {
		logger.info("데이터 확인: " + board);
		int res = mapper.insertBoard(board);
		
		if(res == 1) {
			return "redirect:/";
		} else {
			return null;
		}
	}
	
	// 게시글 한 개 상세보기
	@GetMapping("/selectOne/{bnum}")
	public String selectOne(@PathVariable int bnum, Model model) {
		logger.info("수집 데이터: " + bnum);
		// 1. DB에서 게시글 한 개에 대한 정보를 조회
		Board board = mapper.selectOne(bnum);
		logger.info("조회한 데이터: " + board);
		
		// 2. 조회한 정보를 request 영역에 담아주기
		model.addAttribute("board", board);
		
		// 3. selectOne이라는 페이지로 forward 이동
		return "selectOne";
	}
	
	// 조회수 업데이트
	@GetMapping("/count")
	@ResponseBody // --> 페이지를 이동하는 메소드가 아니라, 비동기 통신을 처리하는 메소드임을 나타내는 annotation
	public void count(int bnum) {
		logger.info("count 데이터 수집: " + bnum);
		// 1. DB에서 한 개의 게시글 조회수를 1증가
		mapper.count(bnum);
	}
	
	// 검색
	@GetMapping("/search")
	public String search(SearchCriteria cri, Model model) {
		logger.info("검색기준: " + cri);
		// 1. DB에서 검색한 게시글들을 조회
		List<Board> boardList = mapper.search(cri);
		logger.info("검색 조건: " + boardList);
		
		// 2. scope에 담아주고, 페이지 이동
		model.addAttribute("boardList", boardList);
		
		return "board";
	}
	
	@GetMapping("/temp")
	public String temp(RedirectAttributes rttr) {
		// redirect로 이동했을 때, 마지막 이동하는 페이지에 수집한 데이터를 전송하고 싶다면 rttr 사용 가능
		// rttr의 경우에는 Model interface를 구현하고 있기 때문에 2번째로 저장할 수 있는 매개변수가 Object라고 작성은 되어있으나 문자열만 저장 가능
		// (url에 queryString 형식으로 전송되는거라 한계가 있음)
		rttr.addAttribute("temp", "temp");
		
		return "redirect:/";
	}
	
	@GetMapping("/crawling")
	public String crawling() {
		return "crawling";
	}
	
}
