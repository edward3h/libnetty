package com.github.fmjsjx.libnetty.http.client;

import java.net.URI;

import com.github.fmjsjx.libnetty.http.client.HttpClient.ClientWrappedRequest;
import com.github.fmjsjx.libnetty.http.client.HttpClient.ClientWrappedRequestBuilder;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class DefaultRequest implements ClientWrappedRequest {

    private final HttpClient wrappedClient;

    private final HttpMethod method;
    private final URI uri;
    private final HttpHeaders headers;
    private final HttpHeaders trailingHeaders;
    private final ByteBuf content;

    @Override
    public HttpMethod method() {
        return method;
    }

    @Override
    public URI uri() {
        return uri;
    }

    @Override
    public HttpHeaders headers() {
        return headers;
    }

    @Override
    public HttpHeaders trailingHeaders() {
        return trailingHeaders;
    }

    @Override
    public ByteBuf content() {
        return content;
    }

    @Override
    public HttpClient wrappedClient() {
        return wrappedClient;
    }

    static final class Builder extends ClientWrappedRequestBuilder<Builder> {

        Builder(HttpClient wrappedClient) {
            super(wrappedClient);
        }

        Builder() {
            this(null);
        }

        @Override
        protected ClientWrappedRequest build0() {
            return new DefaultRequest(wrappedClient, method, uri, headers, trailingHeaders, content);
        }

    }

}