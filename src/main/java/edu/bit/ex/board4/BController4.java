package edu.bit.ex.board4;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BController4 {
//	인터페이스위에 @붙이는 형식 
//	xml이 필요없음 sql세션 객체 필요없음
//	root.xml에 아래 한줄 추가 
//	
//	<mybatis-spring:scan base-package="edu.bit.mapper"/>
//	쿼리가 길어지면 사용하기 힘듬.
	
	
	@Inject
	Bservice4 bservice4;
	
	@RequestMapping("/list4")
	public String list(Model model) throws Exception {
		System.out.println("list4()");
		
		model.addAttribute("list", bservice4.SelectBoardList());
		
		return "list";
	}
	
}
