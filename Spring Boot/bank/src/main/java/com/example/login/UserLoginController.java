package com.example.login;




import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserLoginController {
	
	//Login Data
		@PostMapping(value="/login")
		public UserLogin save(@RequestBody UserLogin s1){
			UserLoginDA d=new UserLoginDA();
			
			return d.check(s1);
		}
		
//		@GetMapping(value ="/holderlogin/{accountNo}")
//		public UserLogin getholderByAccountno(@PathVariable("accountNo") int accountNo) {
//			UserLogin ss1 ;
//			UserLoginDA d = new UserLoginDA();
//			ss1=d.holderByAccountno(accountNo);
//			return ss1;
//		}
	
}
