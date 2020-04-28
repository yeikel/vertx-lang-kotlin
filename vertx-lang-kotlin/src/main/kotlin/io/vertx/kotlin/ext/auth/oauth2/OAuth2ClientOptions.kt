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
package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.ext.auth.oauth2.OAuth2ClientOptions
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpVersion
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.ProxyOptions
import io.vertx.ext.auth.PubSecKeyOptions
import io.vertx.ext.auth.oauth2.OAuth2FlowType
import io.vertx.ext.jwt.JWTOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.ext.auth.oauth2.OAuth2ClientOptions] objects.
 *
 * Options describing how an OAuth2  will make connections.
 *
 * @param alpnVersions  Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiation. When the list is empty, the client provides a best effort list according to [io.vertx.core.http.HttpClientOptions]: <ul>   <li>: [ "h2", "http/1.1" ]</li>   <li>otherwise: [[io.vertx.core.http.HttpClientOptions]]</li> </ul>
 * @param authorizationPath  Get the Oauth2 authorization resource path. e.g.: /oauth/authorize
 * @param clientID  Set the provider client id
 * @param clientSecret  Set the provider client secret
 * @param clientSecretParameterName  Override the HTTP form field name for client secret
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param decoderInitialBufferSize  set to <code>initialBufferSizeHttpDecoder</code> the initial buffer of the HttpDecoder.
 * @param defaultHost  Set the default host name to be used by this client in requests if none is provided when making the request.
 * @param defaultPort  Set the default port to be used by this client in requests if none is provided when making the request.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param extraParameters  Set extra parameters to be sent to the provider on each request
 * @param flow 
 * @param forceSni  By default, the server name is only sent for Fully Qualified Domain Name (FQDN), setting this property to <code>true</code> forces the server name to be always sent.
 * @param headers  Set custom headers to be sent with every request to the provider
 * @param http2ClearTextUpgrade  Set to <code>true</code> when an <i>h2c</i> connection is established using an HTTP/1.1 upgrade request, and <code>false</code> when an <i>h2c</i> connection is established directly (with prior knowledge).
 * @param http2ConnectionWindowSize  Set the default HTTP/2 connection window size. It overrides the initial window size set by , so the connection window size is greater than for its streams, in order the data throughput. <p/> A value of <code>-1</code> reuses the initial window size setting.
 * @param http2KeepAliveTimeout  Set the keep alive timeout for HTTP/2 connections, in seconds. <p/> This value determines how long a connection remains unused in the pool before being evicted and closed. <p/> A timeout of <code>0</code> means there is no timeout.
 * @param http2MaxPoolSize  Set the maximum pool size for HTTP/2 connections
 * @param http2MultiplexingLimit  Set a client limit of the number concurrent streams for each HTTP/2 connection, this limits the number of streams the client can create for a connection. The effective number of streams for a connection is the min of this value and the server's initial settings. <p/> Setting the value to <code>-1</code> means to use the value sent by the server's initial settings. <code>-1</code> is the default value.
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.http.HttpClientOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param initialSettings  Set the HTTP/2 connection settings immediately sent by to the server when the client connects.
 * @param introspectionPath  Set the provider token introspection resource path
 * @param jdkSslEngineOptions 
 * @param jwkPath 
 * @param jwtOptions 
 * @param keepAlive  Set whether keep alive is enabled on the client
 * @param keepAliveTimeout  Set the keep alive timeout for HTTP/1.x, in seconds. <p/> This value determines how long a connection remains unused in the pool before being evicted and closed. <p/> A timeout of <code>0</code> means there is no timeout.
 * @param keyCertOptions  Set the key/cert options.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param logoutPath  Set the provider logout path
 * @param maxChunkSize  Set the maximum HTTP chunk size
 * @param maxHeaderSize  Set the maximum length of all headers for HTTP/1.x .
 * @param maxInitialLineLength  Set the maximum length of the initial line for HTTP/1.x (e.g. <code>"HTTP/1.1 200 OK"</code>)
 * @param maxPoolSize  Set the maximum pool size for connections
 * @param maxRedirects  Set to <code>maxRedirects</code> the maximum number of redirection a request can follow.
 * @param maxWaitQueueSize  Set the maximum requests allowed in the wait queue, any requests beyond the max size will result in a ConnectionPoolTooBusyException.  If the value is set to a negative number then the queue will be unbounded.
 * @param maxWebSocketFrameSize  Set the max WebSocket frame size
 * @param maxWebSocketMessageSize  Set the max WebSocket message size
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param openSslEngineOptions 
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param pipelining  Set whether pipe-lining is enabled on the client
 * @param pipeliningLimit  Set the limit of pending requests a pipe-lined HTTP/1 connection can send.
 * @param poolCleanerPeriod  Set the connection pool cleaner period in milli seconds, a non positive value disables expiration checks and connections will remain in the pool until they are closed.
 * @param protocolVersion  Set the protocol version.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param pubSecKeys  The provider PubSec key options
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param revocationPath  Set the Oauth2 revocation resource path. e.g.: /oauth/revoke
 * @param scopeSeparator  Set the provider scope separator
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sendUnmaskedFrames  Set <code>true</code> when the client wants to skip frame masking. <p> You may want to set it <code>true</code> on server by server WebSocket communication: in this case you are by passing RFC6455 protocol. <p> It's <code>false</code> as default.
 * @param site  Root URL for the provider without trailing slashes
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param tenant  Sets an optional tenant. Tenants are used in some OpenID servers as placeholders for the URLs. The tenant should be set prior to any URL as it affects the way the URLs will be stored. Some provders may name this differently, for example: `realm`.
 * @param tokenPath  Get the Oauth2 token resource path. e.g.: /oauth/token
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param tryUseCompression  Set whether compression is enabled
 * @param tryUsePerFrameWebSocketCompression  Set whether the client will offer the WebSocket per-frame deflate compression extension.
 * @param tryUsePerMessageWebSocketCompression  Set whether the client will offer the WebSocket per-message deflate compression extension.
 * @param useAlpn  Set the ALPN usage.
 * @param useBasicAuthorizationHeader  Flag to use HTTP basic auth header with client id, client secret.
 * @param userAgent  Set a custom user agent to use when communicating to a provider
 * @param userInfoParameters  Set custom parameters to be sent during the userInfo resource request
 * @param userInfoPath  Set the provider userInfo resource path
 * @param validateIssuer 
 * @param verifyHost  Set whether hostname verification is enabled
 * @param webSocketCompressionAllowClientNoContext  Set whether the <code>client_no_context_takeover</code> parameter of the WebSocket per-message deflate compression extension will be offered.
 * @param webSocketCompressionLevel  Set the WebSocket deflate compression level.
 * @param webSocketCompressionRequestServerNoContext  Set whether the <code>server_no_context_takeover</code> parameter of the WebSocket per-message deflate compression extension will be offered.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2ClientOptions original] using Vert.x codegen.
 */
fun oAuth2ClientOptionsOf(
  alpnVersions: Iterable<HttpVersion>? = null,
  authorizationPath: String? = null,
  clientID: String? = null,
  clientSecret: String? = null,
  clientSecretParameterName: String? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  decoderInitialBufferSize: Int? = null,
  defaultHost: String? = null,
  defaultPort: Int? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  extraParameters: io.vertx.core.json.JsonObject? = null,
  flow: OAuth2FlowType? = null,
  forceSni: Boolean? = null,
  headers: io.vertx.core.json.JsonObject? = null,
  http2ClearTextUpgrade: Boolean? = null,
  http2ConnectionWindowSize: Int? = null,
  http2KeepAliveTimeout: Int? = null,
  http2MaxPoolSize: Int? = null,
  http2MultiplexingLimit: Int? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  initialSettings: io.vertx.core.http.Http2Settings? = null,
  introspectionPath: String? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  jwkPath: String? = null,
  jwtOptions: io.vertx.ext.jwt.JWTOptions? = null,
  keepAlive: Boolean? = null,
  keepAliveTimeout: Int? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  logoutPath: String? = null,
  maxChunkSize: Int? = null,
  maxHeaderSize: Int? = null,
  maxInitialLineLength: Int? = null,
  maxPoolSize: Int? = null,
  maxRedirects: Int? = null,
  maxWaitQueueSize: Int? = null,
  maxWebSocketFrameSize: Int? = null,
  maxWebSocketMessageSize: Int? = null,
  metricsName: String? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  pipelining: Boolean? = null,
  pipeliningLimit: Int? = null,
  poolCleanerPeriod: Int? = null,
  protocolVersion: HttpVersion? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  pubSecKeys: Iterable<io.vertx.ext.auth.PubSecKeyOptions>? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  revocationPath: String? = null,
  scopeSeparator: String? = null,
  sendBufferSize: Int? = null,
  sendUnmaskedFrames: Boolean? = null,
  site: String? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  tenant: String? = null,
  tokenPath: String? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  tryUseCompression: Boolean? = null,
  tryUsePerFrameWebSocketCompression: Boolean? = null,
  tryUsePerMessageWebSocketCompression: Boolean? = null,
  useAlpn: Boolean? = null,
  useBasicAuthorizationHeader: Boolean? = null,
  userAgent: String? = null,
  userInfoParameters: io.vertx.core.json.JsonObject? = null,
  userInfoPath: String? = null,
  validateIssuer: Boolean? = null,
  verifyHost: Boolean? = null,
  webSocketCompressionAllowClientNoContext: Boolean? = null,
  webSocketCompressionLevel: Int? = null,
  webSocketCompressionRequestServerNoContext: Boolean? = null): OAuth2ClientOptions = io.vertx.ext.auth.oauth2.OAuth2ClientOptions().apply {

  if (alpnVersions != null) {
    this.setAlpnVersions(alpnVersions.toList())
  }
  if (authorizationPath != null) {
    this.setAuthorizationPath(authorizationPath)
  }
  if (clientID != null) {
    this.setClientID(clientID)
  }
  if (clientSecret != null) {
    this.setClientSecret(clientSecret)
  }
  if (clientSecretParameterName != null) {
    this.setClientSecretParameterName(clientSecretParameterName)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (decoderInitialBufferSize != null) {
    this.setDecoderInitialBufferSize(decoderInitialBufferSize)
  }
  if (defaultHost != null) {
    this.setDefaultHost(defaultHost)
  }
  if (defaultPort != null) {
    this.setDefaultPort(defaultPort)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (extraParameters != null) {
    this.setExtraParameters(extraParameters)
  }
  if (flow != null) {
    this.setFlow(flow)
  }
  if (forceSni != null) {
    this.setForceSni(forceSni)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (http2ClearTextUpgrade != null) {
    this.setHttp2ClearTextUpgrade(http2ClearTextUpgrade)
  }
  if (http2ConnectionWindowSize != null) {
    this.setHttp2ConnectionWindowSize(http2ConnectionWindowSize)
  }
  if (http2KeepAliveTimeout != null) {
    this.setHttp2KeepAliveTimeout(http2KeepAliveTimeout)
  }
  if (http2MaxPoolSize != null) {
    this.setHttp2MaxPoolSize(http2MaxPoolSize)
  }
  if (http2MultiplexingLimit != null) {
    this.setHttp2MultiplexingLimit(http2MultiplexingLimit)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (initialSettings != null) {
    this.setInitialSettings(initialSettings)
  }
  if (introspectionPath != null) {
    this.setIntrospectionPath(introspectionPath)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (jwkPath != null) {
    this.setJwkPath(jwkPath)
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (keepAlive != null) {
    this.setKeepAlive(keepAlive)
  }
  if (keepAliveTimeout != null) {
    this.setKeepAliveTimeout(keepAliveTimeout)
  }
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (logoutPath != null) {
    this.setLogoutPath(logoutPath)
  }
  if (maxChunkSize != null) {
    this.setMaxChunkSize(maxChunkSize)
  }
  if (maxHeaderSize != null) {
    this.setMaxHeaderSize(maxHeaderSize)
  }
  if (maxInitialLineLength != null) {
    this.setMaxInitialLineLength(maxInitialLineLength)
  }
  if (maxPoolSize != null) {
    this.setMaxPoolSize(maxPoolSize)
  }
  if (maxRedirects != null) {
    this.setMaxRedirects(maxRedirects)
  }
  if (maxWaitQueueSize != null) {
    this.setMaxWaitQueueSize(maxWaitQueueSize)
  }
  if (maxWebSocketFrameSize != null) {
    this.setMaxWebSocketFrameSize(maxWebSocketFrameSize)
  }
  if (maxWebSocketMessageSize != null) {
    this.setMaxWebSocketMessageSize(maxWebSocketMessageSize)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (pipelining != null) {
    this.setPipelining(pipelining)
  }
  if (pipeliningLimit != null) {
    this.setPipeliningLimit(pipeliningLimit)
  }
  if (poolCleanerPeriod != null) {
    this.setPoolCleanerPeriod(poolCleanerPeriod)
  }
  if (protocolVersion != null) {
    this.setProtocolVersion(protocolVersion)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (revocationPath != null) {
    this.setRevocationPath(revocationPath)
  }
  if (scopeSeparator != null) {
    this.setScopeSeparator(scopeSeparator)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (sendUnmaskedFrames != null) {
    this.setSendUnmaskedFrames(sendUnmaskedFrames)
  }
  if (site != null) {
    this.setSite(site)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (sslEngineOptions != null) {
    this.setSslEngineOptions(sslEngineOptions)
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (tenant != null) {
    this.setTenant(tenant)
  }
  if (tokenPath != null) {
    this.setTokenPath(tokenPath)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (trustOptions != null) {
    this.setTrustOptions(trustOptions)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (tryUseCompression != null) {
    this.setTryUseCompression(tryUseCompression)
  }
  if (tryUsePerFrameWebSocketCompression != null) {
    this.setTryUsePerFrameWebSocketCompression(tryUsePerFrameWebSocketCompression)
  }
  if (tryUsePerMessageWebSocketCompression != null) {
    this.setTryUsePerMessageWebSocketCompression(tryUsePerMessageWebSocketCompression)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (useBasicAuthorizationHeader != null) {
    this.setUseBasicAuthorizationHeader(useBasicAuthorizationHeader)
  }
  if (userAgent != null) {
    this.setUserAgent(userAgent)
  }
  if (userInfoParameters != null) {
    this.setUserInfoParameters(userInfoParameters)
  }
  if (userInfoPath != null) {
    this.setUserInfoPath(userInfoPath)
  }
  if (validateIssuer != null) {
    this.setValidateIssuer(validateIssuer)
  }
  if (verifyHost != null) {
    this.setVerifyHost(verifyHost)
  }
  if (webSocketCompressionAllowClientNoContext != null) {
    this.setWebSocketCompressionAllowClientNoContext(webSocketCompressionAllowClientNoContext)
  }
  if (webSocketCompressionLevel != null) {
    this.setWebSocketCompressionLevel(webSocketCompressionLevel)
  }
  if (webSocketCompressionRequestServerNoContext != null) {
    this.setWebSocketCompressionRequestServerNoContext(webSocketCompressionRequestServerNoContext)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.oauth2.OAuth2ClientOptions] objects.
 *
 * Options describing how an OAuth2  will make connections.
 *
 * @param alpnVersions  Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiation. When the list is empty, the client provides a best effort list according to [io.vertx.core.http.HttpClientOptions]: <ul>   <li>: [ "h2", "http/1.1" ]</li>   <li>otherwise: [[io.vertx.core.http.HttpClientOptions]]</li> </ul>
 * @param authorizationPath  Get the Oauth2 authorization resource path. e.g.: /oauth/authorize
 * @param clientID  Set the provider client id
 * @param clientSecret  Set the provider client secret
 * @param clientSecretParameterName  Override the HTTP form field name for client secret
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param decoderInitialBufferSize  set to <code>initialBufferSizeHttpDecoder</code> the initial buffer of the HttpDecoder.
 * @param defaultHost  Set the default host name to be used by this client in requests if none is provided when making the request.
 * @param defaultPort  Set the default port to be used by this client in requests if none is provided when making the request.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param extraParameters  Set extra parameters to be sent to the provider on each request
 * @param flow 
 * @param forceSni  By default, the server name is only sent for Fully Qualified Domain Name (FQDN), setting this property to <code>true</code> forces the server name to be always sent.
 * @param headers  Set custom headers to be sent with every request to the provider
 * @param http2ClearTextUpgrade  Set to <code>true</code> when an <i>h2c</i> connection is established using an HTTP/1.1 upgrade request, and <code>false</code> when an <i>h2c</i> connection is established directly (with prior knowledge).
 * @param http2ConnectionWindowSize  Set the default HTTP/2 connection window size. It overrides the initial window size set by , so the connection window size is greater than for its streams, in order the data throughput. <p/> A value of <code>-1</code> reuses the initial window size setting.
 * @param http2KeepAliveTimeout  Set the keep alive timeout for HTTP/2 connections, in seconds. <p/> This value determines how long a connection remains unused in the pool before being evicted and closed. <p/> A timeout of <code>0</code> means there is no timeout.
 * @param http2MaxPoolSize  Set the maximum pool size for HTTP/2 connections
 * @param http2MultiplexingLimit  Set a client limit of the number concurrent streams for each HTTP/2 connection, this limits the number of streams the client can create for a connection. The effective number of streams for a connection is the min of this value and the server's initial settings. <p/> Setting the value to <code>-1</code> means to use the value sent by the server's initial settings. <code>-1</code> is the default value.
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.http.HttpClientOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param initialSettings  Set the HTTP/2 connection settings immediately sent by to the server when the client connects.
 * @param introspectionPath  Set the provider token introspection resource path
 * @param jdkSslEngineOptions 
 * @param jwkPath 
 * @param jwtOptions 
 * @param keepAlive  Set whether keep alive is enabled on the client
 * @param keepAliveTimeout  Set the keep alive timeout for HTTP/1.x, in seconds. <p/> This value determines how long a connection remains unused in the pool before being evicted and closed. <p/> A timeout of <code>0</code> means there is no timeout.
 * @param keyCertOptions  Set the key/cert options.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param logoutPath  Set the provider logout path
 * @param maxChunkSize  Set the maximum HTTP chunk size
 * @param maxHeaderSize  Set the maximum length of all headers for HTTP/1.x .
 * @param maxInitialLineLength  Set the maximum length of the initial line for HTTP/1.x (e.g. <code>"HTTP/1.1 200 OK"</code>)
 * @param maxPoolSize  Set the maximum pool size for connections
 * @param maxRedirects  Set to <code>maxRedirects</code> the maximum number of redirection a request can follow.
 * @param maxWaitQueueSize  Set the maximum requests allowed in the wait queue, any requests beyond the max size will result in a ConnectionPoolTooBusyException.  If the value is set to a negative number then the queue will be unbounded.
 * @param maxWebSocketFrameSize  Set the max WebSocket frame size
 * @param maxWebSocketMessageSize  Set the max WebSocket message size
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param openSslEngineOptions 
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param pipelining  Set whether pipe-lining is enabled on the client
 * @param pipeliningLimit  Set the limit of pending requests a pipe-lined HTTP/1 connection can send.
 * @param poolCleanerPeriod  Set the connection pool cleaner period in milli seconds, a non positive value disables expiration checks and connections will remain in the pool until they are closed.
 * @param protocolVersion  Set the protocol version.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param pubSecKeys  The provider PubSec key options
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param revocationPath  Set the Oauth2 revocation resource path. e.g.: /oauth/revoke
 * @param scopeSeparator  Set the provider scope separator
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sendUnmaskedFrames  Set <code>true</code> when the client wants to skip frame masking. <p> You may want to set it <code>true</code> on server by server WebSocket communication: in this case you are by passing RFC6455 protocol. <p> It's <code>false</code> as default.
 * @param site  Root URL for the provider without trailing slashes
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param tenant  Sets an optional tenant. Tenants are used in some OpenID servers as placeholders for the URLs. The tenant should be set prior to any URL as it affects the way the URLs will be stored. Some provders may name this differently, for example: `realm`.
 * @param tokenPath  Get the Oauth2 token resource path. e.g.: /oauth/token
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param tryUseCompression  Set whether compression is enabled
 * @param tryUsePerFrameWebSocketCompression  Set whether the client will offer the WebSocket per-frame deflate compression extension.
 * @param tryUsePerMessageWebSocketCompression  Set whether the client will offer the WebSocket per-message deflate compression extension.
 * @param useAlpn  Set the ALPN usage.
 * @param useBasicAuthorizationHeader  Flag to use HTTP basic auth header with client id, client secret.
 * @param userAgent  Set a custom user agent to use when communicating to a provider
 * @param userInfoParameters  Set custom parameters to be sent during the userInfo resource request
 * @param userInfoPath  Set the provider userInfo resource path
 * @param validateIssuer 
 * @param verifyHost  Set whether hostname verification is enabled
 * @param webSocketCompressionAllowClientNoContext  Set whether the <code>client_no_context_takeover</code> parameter of the WebSocket per-message deflate compression extension will be offered.
 * @param webSocketCompressionLevel  Set the WebSocket deflate compression level.
 * @param webSocketCompressionRequestServerNoContext  Set whether the <code>server_no_context_takeover</code> parameter of the WebSocket per-message deflate compression extension will be offered.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2ClientOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("oAuth2ClientOptionsOf(alpnVersions, authorizationPath, clientID, clientSecret, clientSecretParameterName, connectTimeout, crlPaths, crlValues, decoderInitialBufferSize, defaultHost, defaultPort, enabledCipherSuites, enabledSecureTransportProtocols, extraParameters, flow, forceSni, headers, http2ClearTextUpgrade, http2ConnectionWindowSize, http2KeepAliveTimeout, http2MaxPoolSize, http2MultiplexingLimit, idleTimeout, idleTimeoutUnit, initialSettings, introspectionPath, jdkSslEngineOptions, jwkPath, jwtOptions, keepAlive, keepAliveTimeout, keyCertOptions, keyStoreOptions, localAddress, logActivity, logoutPath, maxChunkSize, maxHeaderSize, maxInitialLineLength, maxPoolSize, maxRedirects, maxWaitQueueSize, maxWebSocketFrameSize, maxWebSocketMessageSize, metricsName, openSslEngineOptions, pemKeyCertOptions, pemTrustOptions, pfxKeyCertOptions, pfxTrustOptions, pipelining, pipeliningLimit, poolCleanerPeriod, protocolVersion, proxyOptions, pubSecKeys, receiveBufferSize, reuseAddress, reusePort, revocationPath, scopeSeparator, sendBufferSize, sendUnmaskedFrames, site, soLinger, ssl, sslEngineOptions, sslHandshakeTimeout, sslHandshakeTimeoutUnit, tcpCork, tcpFastOpen, tcpKeepAlive, tcpNoDelay, tcpQuickAck, tenant, tokenPath, trafficClass, trustAll, trustOptions, trustStoreOptions, tryUseCompression, tryUsePerFrameWebSocketCompression, tryUsePerMessageWebSocketCompression, useAlpn, useBasicAuthorizationHeader, userAgent, userInfoParameters, userInfoPath, validateIssuer, verifyHost, webSocketCompressionAllowClientNoContext, webSocketCompressionLevel, webSocketCompressionRequestServerNoContext)")
)
fun OAuth2ClientOptions(
  alpnVersions: Iterable<HttpVersion>? = null,
  authorizationPath: String? = null,
  clientID: String? = null,
  clientSecret: String? = null,
  clientSecretParameterName: String? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  decoderInitialBufferSize: Int? = null,
  defaultHost: String? = null,
  defaultPort: Int? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  extraParameters: io.vertx.core.json.JsonObject? = null,
  flow: OAuth2FlowType? = null,
  forceSni: Boolean? = null,
  headers: io.vertx.core.json.JsonObject? = null,
  http2ClearTextUpgrade: Boolean? = null,
  http2ConnectionWindowSize: Int? = null,
  http2KeepAliveTimeout: Int? = null,
  http2MaxPoolSize: Int? = null,
  http2MultiplexingLimit: Int? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  initialSettings: io.vertx.core.http.Http2Settings? = null,
  introspectionPath: String? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  jwkPath: String? = null,
  jwtOptions: io.vertx.ext.jwt.JWTOptions? = null,
  keepAlive: Boolean? = null,
  keepAliveTimeout: Int? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  logoutPath: String? = null,
  maxChunkSize: Int? = null,
  maxHeaderSize: Int? = null,
  maxInitialLineLength: Int? = null,
  maxPoolSize: Int? = null,
  maxRedirects: Int? = null,
  maxWaitQueueSize: Int? = null,
  maxWebSocketFrameSize: Int? = null,
  maxWebSocketMessageSize: Int? = null,
  metricsName: String? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  pipelining: Boolean? = null,
  pipeliningLimit: Int? = null,
  poolCleanerPeriod: Int? = null,
  protocolVersion: HttpVersion? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  pubSecKeys: Iterable<io.vertx.ext.auth.PubSecKeyOptions>? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  revocationPath: String? = null,
  scopeSeparator: String? = null,
  sendBufferSize: Int? = null,
  sendUnmaskedFrames: Boolean? = null,
  site: String? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  tenant: String? = null,
  tokenPath: String? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  tryUseCompression: Boolean? = null,
  tryUsePerFrameWebSocketCompression: Boolean? = null,
  tryUsePerMessageWebSocketCompression: Boolean? = null,
  useAlpn: Boolean? = null,
  useBasicAuthorizationHeader: Boolean? = null,
  userAgent: String? = null,
  userInfoParameters: io.vertx.core.json.JsonObject? = null,
  userInfoPath: String? = null,
  validateIssuer: Boolean? = null,
  verifyHost: Boolean? = null,
  webSocketCompressionAllowClientNoContext: Boolean? = null,
  webSocketCompressionLevel: Int? = null,
  webSocketCompressionRequestServerNoContext: Boolean? = null): OAuth2ClientOptions = io.vertx.ext.auth.oauth2.OAuth2ClientOptions().apply {

  if (alpnVersions != null) {
    this.setAlpnVersions(alpnVersions.toList())
  }
  if (authorizationPath != null) {
    this.setAuthorizationPath(authorizationPath)
  }
  if (clientID != null) {
    this.setClientID(clientID)
  }
  if (clientSecret != null) {
    this.setClientSecret(clientSecret)
  }
  if (clientSecretParameterName != null) {
    this.setClientSecretParameterName(clientSecretParameterName)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (decoderInitialBufferSize != null) {
    this.setDecoderInitialBufferSize(decoderInitialBufferSize)
  }
  if (defaultHost != null) {
    this.setDefaultHost(defaultHost)
  }
  if (defaultPort != null) {
    this.setDefaultPort(defaultPort)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (extraParameters != null) {
    this.setExtraParameters(extraParameters)
  }
  if (flow != null) {
    this.setFlow(flow)
  }
  if (forceSni != null) {
    this.setForceSni(forceSni)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (http2ClearTextUpgrade != null) {
    this.setHttp2ClearTextUpgrade(http2ClearTextUpgrade)
  }
  if (http2ConnectionWindowSize != null) {
    this.setHttp2ConnectionWindowSize(http2ConnectionWindowSize)
  }
  if (http2KeepAliveTimeout != null) {
    this.setHttp2KeepAliveTimeout(http2KeepAliveTimeout)
  }
  if (http2MaxPoolSize != null) {
    this.setHttp2MaxPoolSize(http2MaxPoolSize)
  }
  if (http2MultiplexingLimit != null) {
    this.setHttp2MultiplexingLimit(http2MultiplexingLimit)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (initialSettings != null) {
    this.setInitialSettings(initialSettings)
  }
  if (introspectionPath != null) {
    this.setIntrospectionPath(introspectionPath)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (jwkPath != null) {
    this.setJwkPath(jwkPath)
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (keepAlive != null) {
    this.setKeepAlive(keepAlive)
  }
  if (keepAliveTimeout != null) {
    this.setKeepAliveTimeout(keepAliveTimeout)
  }
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (logoutPath != null) {
    this.setLogoutPath(logoutPath)
  }
  if (maxChunkSize != null) {
    this.setMaxChunkSize(maxChunkSize)
  }
  if (maxHeaderSize != null) {
    this.setMaxHeaderSize(maxHeaderSize)
  }
  if (maxInitialLineLength != null) {
    this.setMaxInitialLineLength(maxInitialLineLength)
  }
  if (maxPoolSize != null) {
    this.setMaxPoolSize(maxPoolSize)
  }
  if (maxRedirects != null) {
    this.setMaxRedirects(maxRedirects)
  }
  if (maxWaitQueueSize != null) {
    this.setMaxWaitQueueSize(maxWaitQueueSize)
  }
  if (maxWebSocketFrameSize != null) {
    this.setMaxWebSocketFrameSize(maxWebSocketFrameSize)
  }
  if (maxWebSocketMessageSize != null) {
    this.setMaxWebSocketMessageSize(maxWebSocketMessageSize)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (pipelining != null) {
    this.setPipelining(pipelining)
  }
  if (pipeliningLimit != null) {
    this.setPipeliningLimit(pipeliningLimit)
  }
  if (poolCleanerPeriod != null) {
    this.setPoolCleanerPeriod(poolCleanerPeriod)
  }
  if (protocolVersion != null) {
    this.setProtocolVersion(protocolVersion)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (revocationPath != null) {
    this.setRevocationPath(revocationPath)
  }
  if (scopeSeparator != null) {
    this.setScopeSeparator(scopeSeparator)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (sendUnmaskedFrames != null) {
    this.setSendUnmaskedFrames(sendUnmaskedFrames)
  }
  if (site != null) {
    this.setSite(site)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (sslEngineOptions != null) {
    this.setSslEngineOptions(sslEngineOptions)
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (tenant != null) {
    this.setTenant(tenant)
  }
  if (tokenPath != null) {
    this.setTokenPath(tokenPath)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (trustOptions != null) {
    this.setTrustOptions(trustOptions)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (tryUseCompression != null) {
    this.setTryUseCompression(tryUseCompression)
  }
  if (tryUsePerFrameWebSocketCompression != null) {
    this.setTryUsePerFrameWebSocketCompression(tryUsePerFrameWebSocketCompression)
  }
  if (tryUsePerMessageWebSocketCompression != null) {
    this.setTryUsePerMessageWebSocketCompression(tryUsePerMessageWebSocketCompression)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (useBasicAuthorizationHeader != null) {
    this.setUseBasicAuthorizationHeader(useBasicAuthorizationHeader)
  }
  if (userAgent != null) {
    this.setUserAgent(userAgent)
  }
  if (userInfoParameters != null) {
    this.setUserInfoParameters(userInfoParameters)
  }
  if (userInfoPath != null) {
    this.setUserInfoPath(userInfoPath)
  }
  if (validateIssuer != null) {
    this.setValidateIssuer(validateIssuer)
  }
  if (verifyHost != null) {
    this.setVerifyHost(verifyHost)
  }
  if (webSocketCompressionAllowClientNoContext != null) {
    this.setWebSocketCompressionAllowClientNoContext(webSocketCompressionAllowClientNoContext)
  }
  if (webSocketCompressionLevel != null) {
    this.setWebSocketCompressionLevel(webSocketCompressionLevel)
  }
  if (webSocketCompressionRequestServerNoContext != null) {
    this.setWebSocketCompressionRequestServerNoContext(webSocketCompressionRequestServerNoContext)
  }
}

