package py.com.spv.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControler {
	
	@GetMapping({"/index", "/", "/home"})
	public String index() {
		return	"index";
	}
	
}
