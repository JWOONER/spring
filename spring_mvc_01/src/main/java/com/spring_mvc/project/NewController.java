package com.spring_mvc.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	// ��Ʈ�� ��û�� ���� ó�� : home.jsp �������� ���
	@RequestMapping("/")
	public String home() {
		return "home"; // �������� �̸� ��ȯ : newView.jsp
	
}
	//���� ��û ó��
	// url ���� �̸� : /newView
	@RequestMapping("/newView")
	public String newView() {
		return "new/newView"; // �������� �̸� ��ȯ : newView.jsp
	}
	
}
