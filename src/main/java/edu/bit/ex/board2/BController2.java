package edu.bit.ex.board2;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BController2 {
	
	@Inject
	Bservice2 bservice2;
	
	@RequestMapping("/list2")
	public String list(Model model) throws Exception {
		System.out.println("list2()");
		
		model.addAttribute("list", bservice2.SelectBoardList());
		
		return "list";
	}
	
}
