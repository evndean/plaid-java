package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;
import com.plaid.client.internal.gson.Optional;
import com.plaid.client.request.common.Product;

import java.util.ArrayList;
import java.util.List;

import static com.plaid.client.internal.Util.notEmpty;
import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /sandbox/processor_token/create endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api/</a>
 */
public class SandboxProcessorTokenCreateRequest extends BaseClientRequest {
  private String institutionId;
  private Optional<Options> options = Optional.empty();

  public SandboxProcessorTokenCreateRequest(String institutionId, List<Product> initialProducts) {
    notNull(institutionId, "institutionId");

    this.institutionId = institutionId;
  }
}
