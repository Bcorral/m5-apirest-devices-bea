package com.example.demo.rest;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HelloController {
	
	private final Logger log = LoggerFactory.getLogger(HelloController.class);
	/**
	 * http://localhost:8080/api/hello
	 * @return
	 */
	@GetMapping("/hello")
	public String hello() {
		//System.out.println("executing hello word metod from syso"); esto sonar dice que no utilicemos syso  sino los log
		log.info("executing hello word metod from syso");
		// diferentes niveles de controller
		//log.warn("executing hello word metod from syso");
		//log.error("executing hello word metod from syso");
		return "Hola mundo";
	}
}
