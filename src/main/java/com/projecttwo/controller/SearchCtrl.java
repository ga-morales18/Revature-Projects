package com.projecttwo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.maps.errors.ApiException;
import com.projecttwo.model.Condition;
import com.projecttwo.model.Doctor;
import com.projecttwo.model.Patient;
import com.projecttwo.model.Procedure;
import com.projecttwo.model.Specialty;
import com.projecttwo.repository.DoctorDao;
import com.projecttwo.service.DocSearch;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class SearchCtrl {

	@Autowired
	DocSearch dSearch;
	
	@RequestMapping(value="/getdoctorsbylocation", method = RequestMethod.GET, params = { "origin" })
	public List<String> getDriveDist(String origin) {
		List<String> distance = new ArrayList<>();
		List<String> addrDest = new ArrayList<>();
		DoctorDao dDao = new DoctorDao();
		List<Doctor> dList = dDao.selectAll();
		for(Doctor d: dList) {
			addrDest.add(d.getStreet()+","+ d.getState());
		}
		String[] addrDes = addrDest.toArray(new String[addrDest.size()]);
		
		
		try {
			distance = dSearch.getDriveDist(origin, addrDes);
		} catch (ApiException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return distance;
	}
	
	@RequestMapping(value="/getspecialties", method=RequestMethod.GET)
	public List<Specialty> selectAllSpecialties(){
		return dSearch.selectAllSpecialties();
	}
	
	@RequestMapping(value="/getprocedures", method=RequestMethod.GET)
	public List<Procedure> selectAllProcedures(){
		return dSearch.selectAllProcedures();
	}
	
	@RequestMapping(value="/getconditions", method=RequestMethod.GET)
	public List<Condition> selectAllConditions(){
		return dSearch.selectAllConditions();
	}
	
//	@RequestMapping(value="/getdoctorsbyspecialty", method=RequestMethod.GET)
//	public List<Doctor> getAllPatients(){
//		return dSearch.getAllPatients();
//	}
	
}