# LibNetty Project

A set of some useful libraries based on netty4.1.x.

> Since version 2.0, All modules are compiled based on JDK11.


## Modules

There are a number of modules in LibNetty, here is a quick overview:

### libnetty-fastcgi

The [`libnetty-fastcgi`](libnetty-fastcgi) module provides codec components for [`Fast-CGI`](https://fastcgi-archives.github.io/FastCGI_Specification.html).

### libnetty-handler

The [`libnetty-handler`](libnetty-handler) module provides additional features for `netty-handler`.

### libnetty-http

The [`libnetty-http`](libnetty-http) module provides additional utility functions for `HTTP/1.x`.

### libnetty-http-client

The [`libnetty-http-client`](libnetty-http-client) module provides a simplified, noblocking HTTP client, supports both synchronous and asynchronous(based on JDK8+ CompletableFuture) APIs.

### libnetty-http-server

The [`libnetty-http-server`](libnetty-http-server) module provides a simplified, noblocking HTTP server framework.

### libnetty-http2-client

> Under development !!!

The [`libnetty-http2-client`](libnetty-http2-client) module provides a simplified, noblocking HTTP 2 client, supports both synchronous and asynchronous(based on JDK8+ CompletableFuture) APIs.

### libnetty-http2-server

> Under development !!!

The [`libnetty-http2-server`](libnetty-http2-server) module provides a simplified, noblocking HTTP 2 server framework.

### libnetty-resp

The [`libnetty-resp`](libnetty-resp) module provides codec components for [`RESP(REdis Serialization Protocol)`](https://redis.io/topics/protocol).

### libnetty-resp3

The [`libnetty-resp3`](libnetty-resp3) module provides codec components for [`RESP3 specification`](https://github.com/antirez/RESP3/blob/master/spec.md).

### libnetty-transport

The [`libnetty-transport`](libnetty-transport) module provides additional features, such as `auto-selection of java/native transport`, for `netty-transport`.

