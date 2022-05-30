package com.pms.portal.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pms.portal.exception.AadharNumberNotFound;
import com.pms.portal.exception.AuthorizationException;
import com.pms.portal.model.PensionerDetail;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

//@FeignClient(name = "pensionerdetail-microservice", url = "http://localhost:8200/pensioner/api/final")
@FeignClient(name = "pensionerdetail-microservice", url = "http://890387-pensioner-detail-lb-341589305.us-east-1.elb.amazonaws.com/pensioner/api/final")
public interface PensionerDetailFeignClient {

	@GetMapping("/getAllPensioner")
	@ApiOperation(notes = "Returns the Pension Details", value = "Find All Pensioner Details")
	public List<PensionerDetail> getAllPensioner(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader) throws AuthorizationException;
	
	@GetMapping("/PensionerDetailByAadhaar/{aadharNumber}")
	@ApiOperation(notes = "Returns the Pension Details by aadharCard Number", value = "Find Pension Details By Aadhar Card number")
	public PensionerDetail getPensionerDetailByAadhar(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@ApiParam(name = "aadharNumber", value = "Aadhar Card Number") 
			@PathVariable long aadharNumber) throws AuthorizationException, AadharNumberNotFound;
}
