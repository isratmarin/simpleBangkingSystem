package com.example.transection;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class TransectionController {

	// Insert Data
	@PostMapping(value = "/teansactionsave")
	public void insert(@RequestBody Transection s) {
		TransectionDA d = new TransectionDA();
		d.insert(s);
	}

	// by account no
	@GetMapping(value = "/transaction")
	public List<Transection> transectionByAccountno() {

		TransectionDA d = new TransectionDA();
		return d.transectionByAccountno();

	}

	@GetMapping(value = "/transaction/{fromDate}/{toDate}")
	public List<Transection> transection(@PathVariable String fromDate, @PathVariable String toDate) {

		TransectionDA d = new TransectionDA();
		return d.transection(fromDate, toDate);

	}

}
