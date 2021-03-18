package com.bio.services;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bio.model.Request;
import com.bio.model.Response;
import com.bio.model.Transactions;
import com.bio.util.CommonUtil;

@RestController
public class CommonController {

	@Autowired
	public CommonUtil utility;

	public static Logger _LOGGER = LoggerFactory.getLogger(CommonController.class);
	@PostMapping(value = "/submitDeviceReq")
	public @ResponseBody Response submitDeviceRequest(@RequestBody Request request) {

		LocalDateTime currentTime=LocalDateTime.now();

		if(request!=null && request.getDvcSrNo()!=null && request.getDvcTime()!=null){
			String fileName="submitDeviceRequest_Content"+"_"+currentTime.toLocalDate()+"_"+currentTime.getHour()+"_"+currentTime.getMinute()+"_"+currentTime.getSecond();
			_LOGGER.info("Device Details {} ",request);
			utility.writeToFile(new File(fileName), request.toString());
			return new Response(request);
		}
		else
			return new Response("submitDeviceReq->0");
	}

	//@PostMapping(value = "/submitTransRequest")
	@PostMapping(value = "/")
	public @ResponseBody Response submitTransactionRequest(@RequestBody Request request) {
		
		if(request!=null && request.getTrans()!=null && request.getTrans().size()>0){
			
			_LOGGER.info("Device Details {} ",request);
			LocalDateTime currentTime=LocalDateTime.now();
			String fileName="submitDeviceRequest_Content"+"_"+currentTime.toLocalDate()+"_"+currentTime.getHour()+"_"+currentTime.getMinute()+"_"+currentTime.getSecond()+".txt";
			_LOGGER.info("Device Details {} ",request);
			utility.writeToFile(new File(fileName), request.toString());


			for(Transactions transaction:request.getTrans()){
				_LOGGER.info("Device Details {} ",request);
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
