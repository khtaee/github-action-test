package com.example.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class CicdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}

	@GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String welcome() {
		return "Hello from the other side";
	}

}


//echo "# github-action-test" >> README.md
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/khtaee/github-action-test.git
//		git push -u origin main