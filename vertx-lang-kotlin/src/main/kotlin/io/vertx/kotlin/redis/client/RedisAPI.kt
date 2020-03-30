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
package io.vertx.kotlin.redis.client

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.client.RedisAPI
import io.vertx.redis.client.Response

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.append]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.appendAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.append(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.asking]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.askingAwait(): Response? {
  return awaitResult {
    this.asking(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.auth]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.authAwait(arg0: String): Response? {
  return awaitResult {
    this.auth(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bgrewriteaof]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.bgrewriteaofAwait(): Response? {
  return awaitResult {
    this.bgrewriteaof(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bgsave]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.bgsaveAwait(args: List<String>): Response? {
  return awaitResult {
    this.bgsave(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bitcount]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.bitcountAwait(args: List<String>): Response? {
  return awaitResult {
    this.bitcount(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bitfield]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.bitfieldAwait(args: List<String>): Response? {
  return awaitResult {
    this.bitfield(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bitop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.bitopAwait(args: List<String>): Response? {
  return awaitResult {
    this.bitop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bitpos]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.bitposAwait(args: List<String>): Response? {
  return awaitResult {
    this.bitpos(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.blpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.blpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.blpop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.brpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.brpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.brpop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.brpoplpush]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.brpoplpushAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.brpoplpush(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bzpopmax]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.bzpopmaxAwait(args: List<String>): Response? {
  return awaitResult {
    this.bzpopmax(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bzpopmin]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.bzpopminAwait(args: List<String>): Response? {
  return awaitResult {
    this.bzpopmin(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.client]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.clientAwait(args: List<String>): Response? {
  return awaitResult {
    this.client(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cluster]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.clusterAwait(args: List<String>): Response? {
  return awaitResult {
    this.cluster(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.command]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.commandAwait(): Response? {
  return awaitResult {
    this.command(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.config]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.configAwait(args: List<String>): Response? {
  return awaitResult {
    this.config(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.dbsize]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.dbsizeAwait(): Response? {
  return awaitResult {
    this.dbsize(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.debug]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.debugAwait(args: List<String>): Response? {
  return awaitResult {
    this.debug(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.decr]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.decrAwait(arg0: String): Response? {
  return awaitResult {
    this.decr(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.decrby]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.decrbyAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.decrby(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.del]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.delAwait(args: List<String>): Response? {
  return awaitResult {
    this.del(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.discard]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.discardAwait(): Response? {
  return awaitResult {
    this.discard(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.dump]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.dumpAwait(arg0: String): Response? {
  return awaitResult {
    this.dump(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.echo]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.echoAwait(arg0: String): Response? {
  return awaitResult {
    this.echo(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.eval]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.evalAwait(args: List<String>): Response? {
  return awaitResult {
    this.eval(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.evalsha]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.evalshaAwait(args: List<String>): Response? {
  return awaitResult {
    this.evalsha(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.exec]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.execAwait(): Response? {
  return awaitResult {
    this.exec(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.exists]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.existsAwait(args: List<String>): Response? {
  return awaitResult {
    this.exists(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.expire]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.expireAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.expire(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.expireat]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.expireatAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.expireat(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.flushall]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.flushallAwait(args: List<String>): Response? {
  return awaitResult {
    this.flushall(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.flushdb]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.flushdbAwait(args: List<String>): Response? {
  return awaitResult {
    this.flushdb(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geoadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.geoaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.geoadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geodist]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.geodistAwait(args: List<String>): Response? {
  return awaitResult {
    this.geodist(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geohash]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.geohashAwait(args: List<String>): Response? {
  return awaitResult {
    this.geohash(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geopos]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.geoposAwait(args: List<String>): Response? {
  return awaitResult {
    this.geopos(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.georadius]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.georadiusAwait(args: List<String>): Response? {
  return awaitResult {
    this.georadius(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.georadiusRo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.georadiusRoAwait(args: List<String>): Response? {
  return awaitResult {
    this.georadiusRo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.georadiusbymember]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.georadiusbymemberAwait(args: List<String>): Response? {
  return awaitResult {
    this.georadiusbymember(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.georadiusbymemberRo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.georadiusbymemberRoAwait(args: List<String>): Response? {
  return awaitResult {
    this.georadiusbymemberRo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.get]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.getAwait(arg0: String): Response? {
  return awaitResult {
    this.get(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.getbit]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.getbitAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.getbit(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.getrange]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.getrangeAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.getrange(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.getset]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.getsetAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.getset(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hdel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hdelAwait(args: List<String>): Response? {
  return awaitResult {
    this.hdel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hexists]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hexistsAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.hexists(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hget]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hgetAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.hget(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hgetall]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hgetallAwait(arg0: String): Response? {
  return awaitResult {
    this.hgetall(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hincrby]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hincrbyAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.hincrby(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hincrbyfloat]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hincrbyfloatAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.hincrbyfloat(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hkeys]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hkeysAwait(arg0: String): Response? {
  return awaitResult {
    this.hkeys(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hlen]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hlenAwait(arg0: String): Response? {
  return awaitResult {
    this.hlen(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hmget]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hmgetAwait(args: List<String>): Response? {
  return awaitResult {
    this.hmget(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hmset]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hmsetAwait(args: List<String>): Response? {
  return awaitResult {
    this.hmset(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.host]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hostAwait(args: List<String>): Response? {
  return awaitResult {
    this.host(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hscan]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hscanAwait(args: List<String>): Response? {
  return awaitResult {
    this.hscan(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hset]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hsetAwait(args: List<String>): Response? {
  return awaitResult {
    this.hset(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hsetnx]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hsetnxAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.hsetnx(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hstrlen]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hstrlenAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.hstrlen(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hvals]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.hvalsAwait(arg0: String): Response? {
  return awaitResult {
    this.hvals(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.incr]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.incrAwait(arg0: String): Response? {
  return awaitResult {
    this.incr(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.incrby]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.incrbyAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.incrby(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.incrbyfloat]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.incrbyfloatAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.incrbyfloat(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.info]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.infoAwait(args: List<String>): Response? {
  return awaitResult {
    this.info(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.keys]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.keysAwait(arg0: String): Response? {
  return awaitResult {
    this.keys(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lastsave]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.lastsaveAwait(): Response? {
  return awaitResult {
    this.lastsave(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.latency]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.latencyAwait(args: List<String>): Response? {
  return awaitResult {
    this.latency(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lindex]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.lindexAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.lindex(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.linsert]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @param arg3 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.linsertAwait(arg0: String, arg1: String, arg2: String, arg3: String): Response? {
  return awaitResult {
    this.linsert(arg0, arg1, arg2, arg3, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.llen]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.llenAwait(arg0: String): Response? {
  return awaitResult {
    this.llen(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lolwut]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.lolwutAwait(args: List<String>): Response? {
  return awaitResult {
    this.lolwut(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lpop]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.lpopAwait(arg0: String): Response? {
  return awaitResult {
    this.lpop(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lpush]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.lpushAwait(args: List<String>): Response? {
  return awaitResult {
    this.lpush(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lpushx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.lpushxAwait(args: List<String>): Response? {
  return awaitResult {
    this.lpushx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lrange]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.lrangeAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.lrange(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lrem]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.lremAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.lrem(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lset]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.lsetAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.lset(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ltrim]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.ltrimAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.ltrim(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.memory]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.memoryAwait(args: List<String>): Response? {
  return awaitResult {
    this.memory(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.mget]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.mgetAwait(args: List<String>): Response? {
  return awaitResult {
    this.mget(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.migrate]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.migrateAwait(args: List<String>): Response? {
  return awaitResult {
    this.migrate(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.module]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.moduleAwait(args: List<String>): Response? {
  return awaitResult {
    this.module(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.monitor]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.monitorAwait(): Response? {
  return awaitResult {
    this.monitor(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.move]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.moveAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.move(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.mset]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.msetAwait(args: List<String>): Response? {
  return awaitResult {
    this.mset(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.msetnx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.msetnxAwait(args: List<String>): Response? {
  return awaitResult {
    this.msetnx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.multi]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.multiAwait(): Response? {
  return awaitResult {
    this.multi(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.object]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.objectAwait(args: List<String>): Response? {
  return awaitResult {
    this.`object`(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.persist]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.persistAwait(arg0: String): Response? {
  return awaitResult {
    this.persist(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pexpire]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pexpireAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.pexpire(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pexpireat]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pexpireatAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.pexpireat(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pfaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.pfadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfcount]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pfcountAwait(args: List<String>): Response? {
  return awaitResult {
    this.pfcount(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfdebug]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pfdebugAwait(args: List<String>): Response? {
  return awaitResult {
    this.pfdebug(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfmerge]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pfmergeAwait(args: List<String>): Response? {
  return awaitResult {
    this.pfmerge(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfselftest]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pfselftestAwait(): Response? {
  return awaitResult {
    this.pfselftest(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ping]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pingAwait(args: List<String>): Response? {
  return awaitResult {
    this.ping(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.post]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.postAwait(args: List<String>): Response? {
  return awaitResult {
    this.post(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.psetex]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.psetexAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.psetex(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.psubscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.psubscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.psubscribe(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.psync]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.psyncAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.psync(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pttl]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pttlAwait(arg0: String): Response? {
  return awaitResult {
    this.pttl(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.publish]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.publishAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.publish(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pubsub]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.pubsubAwait(args: List<String>): Response? {
  return awaitResult {
    this.pubsub(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.punsubscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.punsubscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.punsubscribe(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.randomkey]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.randomkeyAwait(): Response? {
  return awaitResult {
    this.randomkey(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.readonly]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.readonlyAwait(): Response? {
  return awaitResult {
    this.readonly(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.readwrite]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.readwriteAwait(): Response? {
  return awaitResult {
    this.readwrite(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rename]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.renameAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.rename(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.renamenx]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.renamenxAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.renamenx(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.replconf]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.replconfAwait(args: List<String>): Response? {
  return awaitResult {
    this.replconf(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.replicaof]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.replicaofAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.replicaof(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.restore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.restoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.restore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.restoreAsking]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.restoreAskingAwait(args: List<String>): Response? {
  return awaitResult {
    this.restoreAsking(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.role]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.roleAwait(): Response? {
  return awaitResult {
    this.role(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rpop]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.rpopAwait(arg0: String): Response? {
  return awaitResult {
    this.rpop(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rpoplpush]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.rpoplpushAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.rpoplpush(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rpush]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.rpushAwait(args: List<String>): Response? {
  return awaitResult {
    this.rpush(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rpushx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.rpushxAwait(args: List<String>): Response? {
  return awaitResult {
    this.rpushx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.saddAwait(args: List<String>): Response? {
  return awaitResult {
    this.sadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.save]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.saveAwait(): Response? {
  return awaitResult {
    this.save(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.scan]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.scanAwait(args: List<String>): Response? {
  return awaitResult {
    this.scan(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.scard]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.scardAwait(arg0: String): Response? {
  return awaitResult {
    this.scard(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.script]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.scriptAwait(args: List<String>): Response? {
  return awaitResult {
    this.script(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sdiff]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sdiffAwait(args: List<String>): Response? {
  return awaitResult {
    this.sdiff(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sdiffstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sdiffstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.sdiffstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.select]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.selectAwait(arg0: String): Response? {
  return awaitResult {
    this.select(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.set]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.setAwait(args: List<String>): Response? {
  return awaitResult {
    this.set(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.setbit]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.setbitAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.setbit(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.setex]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.setexAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.setex(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.setnx]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.setnxAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.setnx(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.setrange]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.setrangeAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.setrange(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.shutdown]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.shutdownAwait(args: List<String>): Response? {
  return awaitResult {
    this.shutdown(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sinter]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sinterAwait(args: List<String>): Response? {
  return awaitResult {
    this.sinter(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sinterstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sinterstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.sinterstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sismember]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sismemberAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.sismember(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.slaveof]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.slaveofAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.slaveof(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.slowlog]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.slowlogAwait(args: List<String>): Response? {
  return awaitResult {
    this.slowlog(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.smembers]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.smembersAwait(arg0: String): Response? {
  return awaitResult {
    this.smembers(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.smove]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.smoveAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.smove(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sort]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sortAwait(args: List<String>): Response? {
  return awaitResult {
    this.sort(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.spop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.spopAwait(args: List<String>): Response? {
  return awaitResult {
    this.spop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.srandmember]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.srandmemberAwait(args: List<String>): Response? {
  return awaitResult {
    this.srandmember(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.srem]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sremAwait(args: List<String>): Response? {
  return awaitResult {
    this.srem(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sscan]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sscanAwait(args: List<String>): Response? {
  return awaitResult {
    this.sscan(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.strlen]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.strlenAwait(arg0: String): Response? {
  return awaitResult {
    this.strlen(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.subscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.subscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.subscribe(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.substr]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.substrAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.substr(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sunion]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sunionAwait(args: List<String>): Response? {
  return awaitResult {
    this.sunion(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sunionstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.sunionstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.sunionstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.swapdb]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.swapdbAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.swapdb(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sync]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.syncAwait(): Response? {
  return awaitResult {
    this.sync(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.time]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.timeAwait(): Response? {
  return awaitResult {
    this.time(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.touch]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.touchAwait(args: List<String>): Response? {
  return awaitResult {
    this.touch(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ttl]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.ttlAwait(arg0: String): Response? {
  return awaitResult {
    this.ttl(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.type]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.typeAwait(arg0: String): Response? {
  return awaitResult {
    this.type(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.unlink]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.unlinkAwait(args: List<String>): Response? {
  return awaitResult {
    this.unlink(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.unsubscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.unsubscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.unsubscribe(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.unwatch]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.unwatchAwait(): Response? {
  return awaitResult {
    this.unwatch(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.wait]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.waitAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.wait(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.watch]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.watchAwait(args: List<String>): Response? {
  return awaitResult {
    this.watch(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xack]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xackAwait(args: List<String>): Response? {
  return awaitResult {
    this.xack(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.xadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xclaim]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xclaimAwait(args: List<String>): Response? {
  return awaitResult {
    this.xclaim(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xdel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xdelAwait(args: List<String>): Response? {
  return awaitResult {
    this.xdel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xgroup]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xgroupAwait(args: List<String>): Response? {
  return awaitResult {
    this.xgroup(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xinfo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xinfoAwait(args: List<String>): Response? {
  return awaitResult {
    this.xinfo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xlen]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xlenAwait(arg0: String): Response? {
  return awaitResult {
    this.xlen(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xpending]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xpendingAwait(args: List<String>): Response? {
  return awaitResult {
    this.xpending(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.xrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xread]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xreadAwait(args: List<String>): Response? {
  return awaitResult {
    this.xread(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xreadgroup]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xreadgroupAwait(args: List<String>): Response? {
  return awaitResult {
    this.xreadgroup(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xrevrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xrevrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.xrevrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xsetid]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xsetidAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.xsetid(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xtrim]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.xtrimAwait(args: List<String>): Response? {
  return awaitResult {
    this.xtrim(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.zadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zcard]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zcardAwait(arg0: String): Response? {
  return awaitResult {
    this.zcard(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zcount]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zcountAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zcount(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zincrby]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zincrbyAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zincrby(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zinterstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zinterstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zinterstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zlexcount]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zlexcountAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zlexcount(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zpopmax]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zpopmaxAwait(args: List<String>): Response? {
  return awaitResult {
    this.zpopmax(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zpopmin]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zpopminAwait(args: List<String>): Response? {
  return awaitResult {
    this.zpopmin(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrangebylex]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zrangebylexAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrangebylex(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrangebyscore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zrangebyscoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrangebyscore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrank]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zrankAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.zrank(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrem]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zremAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrem(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zremrangebylex]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zremrangebylexAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zremrangebylex(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zremrangebyrank]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zremrangebyrankAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zremrangebyrank(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zremrangebyscore]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zremrangebyscoreAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zremrangebyscore(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrevrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zrevrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrevrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrevrangebylex]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zrevrangebylexAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrevrangebylex(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrevrangebyscore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zrevrangebyscoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrevrangebyscore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrevrank]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zrevrankAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.zrevrank(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zscan]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zscanAwait(args: List<String>): Response? {
  return awaitResult {
    this.zscan(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zscore]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zscoreAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.zscore(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zunionstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
suspend fun RedisAPI.zunionstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zunionstore(args, it)
  }
}

