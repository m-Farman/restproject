package com.farman.restproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farman.restproject.model.xml.Note;
import com.farman.restproject.service.XmlService;

@RestController
@RequestMapping("/xml")
public class XmlParsingController {

	@Autowired
	XmlService xmlService;

	@GetMapping("/w3School")
	public Note getNoteExample() {
		return xmlService.getNoteFromW3School();
	}

}
