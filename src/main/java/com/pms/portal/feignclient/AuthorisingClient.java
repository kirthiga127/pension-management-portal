package com.pms.portal.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pms.portal.exception.AuthorizationException;
import com.pms.portal.model.JwtRequest;

@FeignClient(name = "authorization-microservice", url = "http://localhost:8400/auth/api/final")
public interface AuthorisingClient {
    
	@PostMapping(value = "/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws AuthorizationException;

	@PostMapping(value = "/authorize")
	public boolean authorizeTheRequest(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader);
	
}