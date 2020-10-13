package com.github.fmjsjx.libnetty.resp3;

import static com.github.fmjsjx.libnetty.resp.RespConstants.*;

import java.util.List;

import com.github.fmjsjx.libnetty.resp.RespCodecUtil;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.util.CharsetUtil;

/**
 * The default implementation of {@link Resp3BlobErrorMessage}.
 * 
 * @since 1.1
 *
 * @author MJ Fang
 */
public class DefaultBlobErrorMessage implements Resp3BlobErrorMessage {

    private final CharSequence code;
    private final String message;
    private final String text;

    /**
     * Construct a new {@link DefaultDoubleMessage} with the specified code ane
     * message.
     * 
     * @param code    the error code
     * @param message the error message
     */
    public DefaultBlobErrorMessage(CharSequence code, String message) {
        this(code, message, code + " " + message);
    }

    /**
     * Construct a new {@link DefaultDoubleMessage} with the specified code, message
     * and text.
     * 
     * @param code    the error code
     * @param message the error message
     * @param text    the full text of the error
     */
    public DefaultBlobErrorMessage(CharSequence code, String message, String text) {
        this.code = code;
        this.message = message;
        this.text = text;
    }

    @Override
    public void encode(ByteBufAllocator alloc, List<Object> out) throws Exception {
        byte[] value = text.getBytes(CharsetUtil.UTF_8);
        byte[] lengthValue = RespCodecUtil.longToAsciiBytes(value.length);
        ByteBuf buf = RespCodecUtil.buffer(alloc,
                TYPE_LENGTH + lengthValue.length + EOL_LENGTH + value.length + EOL_LENGTH);
        buf.writeByte(type().value()).writeBytes(lengthValue).writeShort(EOL_SHORT).writeBytes(value)
                .writeShort(EOL_SHORT);
        out.add(buf);
    }

    @Override
    public CharSequence code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public String text() {
        return text;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + type() + text + "]";
    }
}
