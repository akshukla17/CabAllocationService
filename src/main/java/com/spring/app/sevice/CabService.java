package com.spring.app.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.model.Cab;
import com.spring.app.repository.CabRepository;

@Service
public class CabService {
	
	@Autowired
	private CabRepository cabRepo;
	public void addCab(Cab cab) {
		cabRepo.save(cab);
	}

}
