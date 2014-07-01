/**
 * Copyright 2005-2013 hdiv.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hdiv.config.annotation;

import org.hdiv.validator.Validation;
import org.springframework.util.Assert;

/**
 * Contains the data for a editable validation rule.
 */
public class RuleRegistration {

	/**
	 * Validation rule.
	 */
	private Validation validation;

	public RuleRegistration(String name) {
		this.validation = new Validation();
		this.validation.setName(name);
	}

	public RuleRegistration componentType(String componentType) {
		Assert.notNull(componentType, "Component type is required");
		this.validation.setComponentType(componentType);
		return this;
	}

	public RuleRegistration acceptedPattern(String acceptedPattern) {
		Assert.notNull(acceptedPattern, "Accepted pattern is required");
		this.validation.setAcceptedPattern(acceptedPattern);
		return this;
	}

	public RuleRegistration rejectedPattern(String rejectedPattern) {
		Assert.notNull(rejectedPattern, "Rejected pattern is required");
		this.validation.setRejectedPattern(rejectedPattern);
		return this;
	}

	protected Validation getRule() {
		return validation;
	}

}
