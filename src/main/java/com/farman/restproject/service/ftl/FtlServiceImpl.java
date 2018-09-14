package com.farman.restproject.service.ftl;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service
public class FtlServiceImpl implements FtlService {

	@Autowired
	Configuration ftlConfig;

	@Override
	public String getPaymentAvailables() {
		Template template= null;
		try {
			template = ftlConfig.getTemplate("src/main/resources/templates/paymentTypes.ftl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("message", "Please find the details!");

		HashMap<String, String> map = new HashMap<>();
		map.put("amex", "American Express");
		map.put("cash", "Cash");
		map.put("mc", "Master Cards");
		map.put("visa", "Visa Cards");
		map.put("wallet", "All E Wallets");

		data.put("payments", map);

		Writer out = new StringWriter();
		try {
			template.process(data, out);
			String html = out.toString();
			return html;
		} catch (TemplateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failed";
	}

}
