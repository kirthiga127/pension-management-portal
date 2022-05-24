package com.cts.portal.model;

import lombok.Data;

@Data
public class ProcessPensionResponse {
	private int processPensionStatusCode;

	public ProcessPensionResponse(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}

	public ProcessPensionResponse() {
	
	}

	public int getProcessPensionStatusCode() {
		return processPensionStatusCode;
	}

	public void setProcessPensionStatusCode(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}
	
	
	
	
}