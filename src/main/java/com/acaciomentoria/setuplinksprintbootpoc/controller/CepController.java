package com.acaciomentoria.setuplinksprintbootpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acaciomentoria.setuplinksprintbootpoc.model.CEPResponse;
import com.acaciomentoria.setuplinksprintbootpoc.service.CepService;

@RestController
@RequestMapping(value = "/poc/cep")
public class CepController {

	@Autowired
	CepService service;

	@GetMapping(value = "/{cep}")
	public ResponseEntity<CEPResponse> getCEP(@PathVariable(value = "cep") String cep) {
		CEPResponse response = service.getCEP(cep);
		return ResponseEntity.ok(response);
	}
}
