package com.commercetools_training.commercetools_training;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.oauth2.*;

public class Client {

	public static ProjectApiRoot createApiClient() {
		final ProjectApiRoot apiRoot = ApiRootBuilder.of()
				.defaultClient(ClientCredentialsBuilder.of()
				.withClientId("x7AoTT1JGhNDxY5Y3xibVsU7")
				.withClientSecret("pL4FnAWh7cd0KAdG-oedFo1Oa8ONJXuc")
				.build(),
				ServiceRegion.AWS_EU_CENTRAL_1)
		        .build("demo-aus-dev");
		return apiRoot;
	}
	
}
