/**
 * Copyright (c) 2016-2017 in alphabetical order:
 * Bosch Software Innovations GmbH, Robert Bosch GmbH, Siemens AG
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Denis Kramer     (Bosch Software Innovations GmbH)
 *    Stefan Schmid    (Robert Bosch GmbH)
 *    Andreas Ziller   (Siemens AG)
 */
package org.eclipse.bridgeiot.lib.handlers;

import java.util.concurrent.ExecutionException;

import org.eclipse.bridgeiot.lib.feed.IAccessFeed;
import org.eclipse.bridgeiot.lib.offering.AccessResponse;

/**
 * Handles successful feed notifications
 * 
 */
@FunctionalInterface
public interface FeedNotificationSuccessHandler {

    /**
     * Process incoming feed data
     * 
     * @param reference
     *            Reference to Feed
     * @param response
     *            Incoming Data
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public void processNotificationOnSuccess(IAccessFeed reference, AccessResponse response)
            throws InterruptedException, ExecutionException;
}
