package rbb.poc.dummy.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import rbb.poc.dummy.entity.LogonResponse;
import rbb.poc.dummy.entity.LogonResquest;
import rbb.poc.dummy.entity.comm.responseInfo;

@Service
public class LogonService {
	
	public LogonResponse logon(LogonResquest request){
		LogonResponse response = new LogonResponse();
		responseInfo responseInfo = new responseInfo();
		
		responseInfo.setCode("000");
		responseInfo.setType("0");
		response.setResponseInfo(responseInfo);
		response.setTotalAmount(new BigDecimal("238810"));
		response.setPersonalAmount(new BigDecimal("80200"));
		response.setBusinessAmount(new BigDecimal("158610"));
		response.setAvailableAmount(new BigDecimal("300000"));
		
		return response;
	}

}
