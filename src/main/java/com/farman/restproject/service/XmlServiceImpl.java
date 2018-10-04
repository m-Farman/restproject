package com.farman.restproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.farman.restproject.controller.GreetingController;
import com.farman.restproject.model.xml.Note;

@Service
public class XmlServiceImpl implements XmlService {

	private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

	@Autowired
	Environment environment;
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Note getNoteFromW3School() {
		String noteUrl = environment.getProperty("w3School.note.xml.url");

		try {
			Note resposne = restTemplate.getForObject(noteUrl, Note.class);
			log.info(" response heading is " + resposne.getHeading());
			return resposne;
		} catch (HttpStatusCodeException exception) {
			log.error("HttpStatusCodeException : " + exception.getMessage());
		} catch (Exception e) {
			log.error("Exception : " + e.getMessage());
		}
		return null;
	}

}
