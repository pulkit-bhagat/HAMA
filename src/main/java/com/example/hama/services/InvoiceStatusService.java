package com.example.hama.services;

import java.util.List;
import java.util.Optional;

import com.example.hama.repositories.InvoiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hama.models.InvoiceStatus;

@Service
public class InvoiceStatusService {
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;
	
	//Return list of countries
	public List<InvoiceStatus> getInvoiceStatuses(){
		return invoiceStatusRepository.findAll();
	}
	
	//SAve new InvoiceStatus
	public void save(InvoiceStatus invoiceStatus) {
		invoiceStatusRepository.save(invoiceStatus);
	}
	
	//get by id
	public Optional<InvoiceStatus> findById(int id) {
		return invoiceStatusRepository.findById(id);
	}

	public void delete(Integer id) {
		invoiceStatusRepository.deleteById(id);
	}

}
