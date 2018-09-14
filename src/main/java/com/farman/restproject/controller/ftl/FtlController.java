package com.farman.restproject.controller.ftl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.farman.restproject.service.ftl.FtlService;

@RestController
@RequestMapping("ftl")
public class FtlController {

	@Autowired
	FtlService ftlService;

	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public String getPaymentHtml() {
		return ftlService.getPaymentAvailables();
	}

}
