// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class GetShopListCsReqOuterClass {
  /**
   * Protobuf type {@code GetShopListCsReq}
   */
  public static final class GetShopListCsReq extends ProtoMessage<GetShopListCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 shop_type = 10;</code>
     */
    private int shopType;

    private GetShopListCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetShopListCsReq}
     */
    public static GetShopListCsReq newInstance() {
      return new GetShopListCsReq();
    }

    /**
     * <code>optional uint32 shop_type = 10;</code>
     * @return whether the shopType field is set
     */
    public boolean hasShopType() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 shop_type = 10;</code>
     * @return this
     */
    public GetShopListCsReq clearShopType() {
      bitField0_ &= ~0x00000001;
      shopType = 0;
      return this;
    }

    /**
     * <code>optional uint32 shop_type = 10;</code>
     * @return the shopType
     */
    public int getShopType() {
      return shopType;
    }

    /**
     * <code>optional uint32 shop_type = 10;</code>
     * @param value the shopType to set
     * @return this
     */
    public GetShopListCsReq setShopType(final int value) {
      bitField0_ |= 0x00000001;
      shopType = value;
      return this;
    }

    @Override
    public GetShopListCsReq copyFrom(final GetShopListCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        shopType = other.shopType;
      }
      return this;
    }

    @Override
    public GetShopListCsReq mergeFrom(final GetShopListCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasShopType()) {
        setShopType(other.shopType);
      }
      return this;
    }

    @Override
    public GetShopListCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      shopType = 0;
      return this;
    }

    @Override
    public GetShopListCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetShopListCsReq)) {
        return false;
      }
      GetShopListCsReq other = (GetShopListCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasShopType() || shopType == other.shopType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(shopType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(shopType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetShopListCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // shopType
            shopType = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
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
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.shopType, shopType);
      }
      output.endObject();
    }

    @Override
    public GetShopListCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -345279664:
          case -2103716125: {
            if (input.isAtField(FieldNames.shopType)) {
              if (!input.trySkipNullValue()) {
                shopType = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
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
    public GetShopListCsReq clone() {
      return new GetShopListCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetShopListCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetShopListCsReq(), data).checkInitialized();
    }

    public static GetShopListCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetShopListCsReq(), input).checkInitialized();
    }

    public static GetShopListCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetShopListCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetShopListCsReq messages
     */
    public static MessageFactory<GetShopListCsReq> getFactory() {
      return GetShopListCsReqFactory.INSTANCE;
    }

    private enum GetShopListCsReqFactory implements MessageFactory<GetShopListCsReq> {
      INSTANCE;

      @Override
      public GetShopListCsReq create() {
        return GetShopListCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName shopType = FieldName.forField("shopType", "shop_type");
    }
  }
}
