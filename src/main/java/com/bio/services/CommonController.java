package com.bio.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bio.model.Request;
import com.bio.model.Response;

@RestController
/* @RequestMapping("/service") */
public class CommonController {


    @PostMapping(value = "/submitDeviceReq")
	public @ResponseBody Response submitDeviceRequest(@RequestBody Request request) {
		if(request!=null && request.getDvcSrNo()!=null && request.getDvcTime()!=null)
			return new Response("1");
		else
			return new Response("0");

	}
	
    @PostMapping(value = "/sumitTransRequest")
	public @ResponseBody Response submitTransactionRequest(@RequestBody Request request) {
		if(request!=null && request.getTrans()!=null && request.getTrans().size()>0)
			return new Response("1");
		else
			return new Response("0");

	}
    
    @GetMapping(value="/getRequest")
    public @ResponseBody Response getRequest() {
    	return new Response("1");
    }


}
