package edu.bupt.iblog.controller.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

	@RequestMapping("/login")
	public String login() {
		return null;
	}
}
