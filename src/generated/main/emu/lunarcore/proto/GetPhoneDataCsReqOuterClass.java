// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class GetPhoneDataCsReqOuterClass {
  /**
   * Protobuf type {@code GetPhoneDataCsReq}
   */
  public static final class GetPhoneDataCsReq extends ProtoMessage<GetPhoneDataCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    private GetPhoneDataCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetPhoneDataCsReq}
     */
    public static GetPhoneDataCsReq newInstance() {
      return new GetPhoneDataCsReq();
    }

    @Override
    public GetPhoneDataCsReq copyFrom(final GetPhoneDataCsReq other) {
      cachedSize = other.cachedSize;
      return this;
    }

    @Override
    public GetPhoneDataCsReq mergeFrom(final GetPhoneDataCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      return this;
    }

    @Override
    public GetPhoneDataCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      return this;
    }

    @Override
    public GetPhoneDataCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetPhoneDataCsReq)) {
        return false;
      }
      GetPhoneDataCsReq other = (GetPhoneDataCsReq) o;
      return true;
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetPhoneDataCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      output.endObject();
    }

    @Override
    public GetPhoneDataCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GetPhoneDataCsReq clone() {
      return new GetPhoneDataCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetPhoneDataCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetPhoneDataCsReq(), data).checkInitialized();
    }

    public static GetPhoneDataCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPhoneDataCsReq(), input).checkInitialized();
    }

    public static GetPhoneDataCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPhoneDataCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetPhoneDataCsReq messages
     */
    public static MessageFactory<GetPhoneDataCsReq> getFactory() {
      return GetPhoneDataCsReqFactory.INSTANCE;
    }

    private enum GetPhoneDataCsReqFactory implements MessageFactory<GetPhoneDataCsReq> {
      INSTANCE;

      @Override
      public GetPhoneDataCsReq create() {
        return GetPhoneDataCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
    }
  }
}