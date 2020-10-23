package com.plaid.client.response;

/**
 * Response from /sandbox/processor_token/create endpoint.
 */
public class SandboxProcessorTokenCreateResponse extends BaseResponse {
  private String processorToken;

  public String getProcessorToken() {
    return processorToken;
  }
}
