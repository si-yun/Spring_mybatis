package edu.bit.ex.board3;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BController3 {
//	�������̽����� @���̴� ���� 
//	xml�� �ʿ���� sql���� ��ü �ʿ����
//	root.xml�� �Ʒ� ���� �߰� 
//	
//	<mybatis-spring:scan base-package="edu.bit.mapper"/>
//	������ ������� ����ϱ� ����.
	
	
	@Inject
	Bservice3 bservice3;
	
	@RequestMapping("/list3")
	public String list(Model model) throws Exception {
		System.out.println("list3()");
		
		model.addAttribute("list", bservice3.SelectBoardList());
		
		return "list";
	}
	
}
