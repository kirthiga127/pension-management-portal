package com.pms.portal.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pms.portal.exception.AadharNumberNotFound;
import com.pms.portal.exception.AuthorizationException;
import com.pms.portal.exception.PensionerDetailException;
import com.pms.portal.model.PensionDetail;
import com.pms.portal.model.PensionerInput;
import com.pms.portal.model.ProcessPensionInput;
import com.pms.portal.model.ProcessPensionResponse;

import io.swagger.annotations.ApiOperation;



@FeignClient(name = "processpension-microservice", url = "http://localhost:8100/process/api/final")
public interface ProcessPensionFeignClient {

	@PostMapping("/PensionDetail")
	@ApiOperation(notes = "Returns the Pension Details", value = "Find the pension details")
	public PensionDetail getPensionDetail(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@RequestBody PensionerInput pensionerInput) throws AuthorizationException, PensionerDetailException, AadharNumberNotFound;
	
	
	@PostMapping("/ProcessPension")
	@ApiOperation(notes = "Returns the Process Responce Code(10 or 21)", value = "Find Process Responce Code, If Process code is 10 then Suceess and 21 means not success")
	public ProcessPensionResponse getprocessingCode(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@RequestBody ProcessPensionInput processPensionInput) throws AuthorizationException, AadharNumberNotFound;
}
