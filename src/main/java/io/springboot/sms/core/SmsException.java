/*
 * Copyright (c) 2018 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.springboot.sms.core;

/**
 * The type SmsException.
 *
 * @author cn-src
 */
public class SmsException extends RuntimeException {

	/**
	 * Instantiates a new SmsException.
	 * @param message the message
	 */
	public SmsException(final String message) {
		super(message);
	}

	/**
	 * Instantiates a new SmsException.
	 * @param cause the cause
	 */
	public SmsException(final Throwable cause) {
		super(cause);
	}

}
