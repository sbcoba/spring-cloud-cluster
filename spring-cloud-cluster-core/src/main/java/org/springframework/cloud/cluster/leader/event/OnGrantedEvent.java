/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.cluster.leader.event;

import org.springframework.cloud.cluster.leader.Context;

/**
 * Generic event representing that leader has been granted.
 *
 * @author Janne Valkealahti
 *
 */
@SuppressWarnings("serial")
public class OnGrantedEvent extends AbstractLeaderEvent {

	/**
	 * Instantiates a new granted event.
	 * 
	 * @param source the component that published the event (never {@code null})
	 * @param context the context associated with this event
	 */
	public OnGrantedEvent(Object source, Context context) {
		super(source, context);
	}

}
