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

import java.util.Map;

import org.eclipse.bridgeiot.lib.offering.OfferingDescription;
import org.eclipse.bridgeiot.lib.serverwrapper.BridgeIotHttpResponse;

/**
 * Handles incoming Offering requests
 * 
 */
@FunctionalInterface
public interface AccessRequestHandler {

    /**
     * Process incoming Offering requests
     * 
     * @param offeringDescription
     *            Reference to OfferingDescription
     * @param inputData
     *            Input parameter list
     * @return
     */
    public BridgeIotHttpResponse processRequestHandler(OfferingDescription offeringDescription,
            Map<String, Object> inputData, String subscriptionId, String sessionId);

}
