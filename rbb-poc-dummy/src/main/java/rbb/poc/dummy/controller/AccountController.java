package rbb.poc.dummy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import rbb.poc.dummy.entity.rtrvAcctSummryRequest;
import rbb.poc.dummy.entity.rtrvAcctSummryResponse;
import rbb.poc.dummy.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	public AccountService accountService;
	
	@RequestMapping(value = "/rtrvAcctSummry", method = RequestMethod.POST)
    @ResponseBody
    public rtrvAcctSummryResponse rtrvAcctSummry(rtrvAcctSummryRequest request) {
        return this.accountService.rtrvAcctSummry(request);
    }
	
}
