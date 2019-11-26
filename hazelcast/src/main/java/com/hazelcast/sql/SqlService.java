/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.sql;

import com.hazelcast.cluster.Address;
import com.hazelcast.sql.impl.operation.QueryOperation;

/**
 * Service to query Hazelcast data with SQL.
 */
public interface SqlService {
    /** Unique service name. */
    String SERVICE_NAME = "hz:impl:sqlService";

    /**
     * Execute query.
     *
     * @param sql SQL.
     * @param args Arguments.
     * @return Cursor.
     */
    SqlCursor query(String sql, Object... args);

    /**
     * Sends the request to the target node.
     *
     * @param operation Operation.
     * @param address Address.
     */
    void sendRequest(QueryOperation operation, Address address);
}