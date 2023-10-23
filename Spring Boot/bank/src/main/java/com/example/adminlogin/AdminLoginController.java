package com.example.adminlogin;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminLoginController {

	// Login Data
	@PostMapping(value = "/adminlogin")
	public AdminLogin save(@RequestBody AdminLogin r1) {
		AdminLoginDA d = new AdminLoginDA();
		return d.check(r1);
	}
	
	// get new account no auto create
	@GetMapping(value ="/admin/new")
	public String getNewAccountNo() {
		AdminLoginDA d = new AdminLoginDA();
		return d.getNewId();
	}
	
	//Insert Data
		@PostMapping(value ="/saveadmin")
		public void insert(@RequestBody AdminLogin s1) {
			AdminLoginDA d1 = new AdminLoginDA ();
				d1.insert(s1);
		}
		
		@GetMapping(value ="/adminlogin/{id}")
		public AdminLogin getadminById(@PathVariable("id") int id) {
			AdminLogin ss1 ;
			AdminLoginDA d = new AdminLoginDA();
			ss1=d.adminById(id);
			return ss1;
		}
		//row count
		@GetMapping(value="/row-count")
		public AdminLogin getAllRowCount() {
			AdminLogin d;
			AdminLoginDA dd = new AdminLoginDA();
			d= dd.countAllCustomer();
			return d;
		}
		
		//change password admin
		@PostMapping(value ="/admin-password")
		public boolean changePasswords(@RequestBody AdminChangePin p) {
			AdminLoginDA d = new AdminLoginDA();
				return d.changePassword(p);
		}
}