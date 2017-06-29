package rbb.poc.dummy.service;

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
		
		return response;
	}

}
