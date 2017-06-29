package rbb.poc.dummy.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import rbb.poc.dummy.entity.LogonResponse;
import rbb.poc.dummy.entity.LogonResquest;
import rbb.poc.dummy.service.LogonService;

@Controller
public class LogonController {
	
	@Autowired
	public LogonService LogonService;
	
	@RequestMapping(value = "/logon", method = RequestMethod.POST)
	@ResponseBody
	public LogonResponse logon(LogonResquest request) {
		return LogonService.logon(request);
	}
	
}
