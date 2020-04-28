/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.sqlclient

import io.vertx.core.Future
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.sqlclient.Pool
import io.vertx.sqlclient.SqlClient
import io.vertx.sqlclient.SqlConnection
import java.util.function.Function

/**
 * Suspending version of method [io.vertx.sqlclient.Pool.getConnection]
 *
 * @return [SqlConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Pool] using Vert.x codegen.
 */
suspend fun Pool.getConnectionAwait(): SqlConnection {
  return awaitResult {
    this.getConnection(it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.Pool.withTransaction]
 *
 * @param function the code to execute
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Pool] using Vert.x codegen.
 */
suspend fun <T> Pool.withTransactionAwait(function: (SqlClient) -> Future<T>): T {
  return awaitResult {
    this.withTransaction(function, it::handle)
  }
}

