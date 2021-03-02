package com.bio.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bio.model.Request;
import com.bio.model.Response;
import com.bio.model.Transactions;

@RestController
public class CommonController {

public static Logger _LOGGER = LoggerFactory.getLogger(CommonController.class);
    @PostMapping(value = "/submitDeviceReq")
	public @ResponseBody Response submitDeviceRequest(@RequestBody Request request) {
		if(request!=null && request.getDvcSrNo()!=null && request.getDvcTime()!=null){
			_LOGGER.info("Device Details {} ",request);
			return new Response(request);
		}
		else
			return new Response("submitDeviceReq->0");

	}
	
    //@PostMapping(value = "/submitTransRequest")
    @PostMapping(value = "/")
	public @ResponseBody Response submitTransactionRequest(@RequestBody Request request) {
    	System.out.println("submitTransactionRequest{} "+request);
    	if(request!=null && request.getTrans()!=null && request.getTrans().size()>0){
			_LOGGER.info("Device Details {} ",request);
					
			for(Transactions transaction:request.getTrans()){
				_LOGGER.info("Transaction Details {} ",	transaction);
			}
			return new Response(request);
		}
		else
			return new Response("submitTransRequest ->0");

	}
    
    @GetMapping(value="/getRequest")
    public @ResponseBody Response getRequest() {
    	System.out.println("getRequest{} ");
    	return new Response("getRequest->1");
    }


}
