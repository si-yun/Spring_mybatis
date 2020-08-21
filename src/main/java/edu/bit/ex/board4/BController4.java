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
//	�������̽����� @���̴� ���� 
//	xml�� �ʿ���� sql���� ��ü �ʿ����
//	root.xml�� �Ʒ� ���� �߰� 
//	
//	<mybatis-spring:scan base-package="edu.bit.mapper"/>
//	������ ������� ����ϱ� ����.
	
	
	@Inject
	Bservice4 bservice4;
	
	@RequestMapping("/list4")
	public String list(Model model) throws Exception {
		System.out.println("list4()");
		
		model.addAttribute("list", bservice4.SelectBoardList());
		
		return "list";
	}
	
}
