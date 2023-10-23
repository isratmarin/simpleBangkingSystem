package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class HolderController {
	@Autowired 
	HolderDA d;
	
	@Autowired 
	Holder s;
	
	//Insert Data
	@PostMapping(value ="/save")
	public void insert(@RequestBody Holder s) {
			d.insert(s);

	}
	
	//Show Data
			List<Holder> pList = new ArrayList<>();

			
			@RequestMapping(value = "/all")
			public List<Holder> allHolders() {
				pList = d.allHolder();
				return pList;
			}
			
			//by account no
			@GetMapping(value ="/holder/{accountNo}")
			public Holder getholderByAccountno(@PathVariable("accountNo") int accountNo) {
				s=d.holderByAccountno(accountNo);
				return s;
			}

			
			// get new account no auto create
			@GetMapping(value ="/holder/new")
			public String getNewAccountNo() {
				return d.getNewAccountNo();
			}
			
			
		    //Update Data
			@PostMapping(value ="/update")
			public void update(@RequestBody Holder p) {
				System.out.println(p.accountNo);
					d.updateHolder(p);
			}
			
			//change password
			@PostMapping(value ="/password")
			public boolean changePasswords(@RequestBody ChangePin p) {
					return d.changePassword(p);
			}
			
			//Update status
			@PostMapping(value ="/status")
			public void updateStatus(@RequestBody Holder p) {
				System.out.println(p.accountNo);
				System.out.println(p.status);
					d.updateHolderStatus(p);
			}
			//Update transfer data
			@PostMapping(value ="/updatetransfer")
			public void updateTransfer(@RequestBody UpdateTransfer p1) {
					d.updateTransfer(p1);
			}
			
		   //Delete Data
			@PostMapping(value ="/delete")
			public void delete(@RequestBody Holder x) {
					d.deleteHolder(x);
			}
			
			@GetMapping(value="/rowcount")
			public Holder getAllRowCount() {
				Holder s;
				s= d.countAllCustomer();
				return s;
			}
			//user profile
			@GetMapping(value ="/holderlogin/{accountNo}")
			public Holder getholderByAccountno1(@PathVariable("accountNo") int accountNo) {
				Holder s ;
				s=d.holderByAccountno1(accountNo);
				return s;
			}

}
