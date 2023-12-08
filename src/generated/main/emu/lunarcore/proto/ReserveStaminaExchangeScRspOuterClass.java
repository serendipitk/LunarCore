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

public final class ReserveStaminaExchangeScRspOuterClass {
  /**
   * Protobuf type {@code ReserveStaminaExchangeScRsp}
   */
  public static final class ReserveStaminaExchangeScRsp extends ProtoMessage<ReserveStaminaExchangeScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 num = 14;</code>
     */
    private int num;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    private ReserveStaminaExchangeScRsp() {
    }

    /**
     * @return a new empty instance of {@code ReserveStaminaExchangeScRsp}
     */
    public static ReserveStaminaExchangeScRsp newInstance() {
      return new ReserveStaminaExchangeScRsp();
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return whether the num field is set
     */
    public boolean hasNum() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return this
     */
    public ReserveStaminaExchangeScRsp clearNum() {
      bitField0_ &= ~0x00000001;
      num = 0;
      return this;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return the num
     */
    public int getNum() {
      return num;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @param value the num to set
     * @return this
     */
    public ReserveStaminaExchangeScRsp setNum(final int value) {
      bitField0_ |= 0x00000001;
      num = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public ReserveStaminaExchangeScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public ReserveStaminaExchangeScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    @Override
    public ReserveStaminaExchangeScRsp copyFrom(final ReserveStaminaExchangeScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        num = other.num;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public ReserveStaminaExchangeScRsp mergeFrom(final ReserveStaminaExchangeScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNum()) {
        setNum(other.num);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public ReserveStaminaExchangeScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      num = 0;
      retcode = 0;
      return this;
    }

    @Override
    public ReserveStaminaExchangeScRsp clearQuick() {
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
      if (!(o instanceof ReserveStaminaExchangeScRsp)) {
        return false;
      }
      ReserveStaminaExchangeScRsp other = (ReserveStaminaExchangeScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasNum() || num == other.num)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(num);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(num);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ReserveStaminaExchangeScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // num
            num = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.num, num);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public ReserveStaminaExchangeScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109446: {
            if (input.isAtField(FieldNames.num)) {
              if (!input.trySkipNullValue()) {
                num = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public ReserveStaminaExchangeScRsp clone() {
      return new ReserveStaminaExchangeScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ReserveStaminaExchangeScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ReserveStaminaExchangeScRsp(), data).checkInitialized();
    }

    public static ReserveStaminaExchangeScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ReserveStaminaExchangeScRsp(), input).checkInitialized();
    }

    public static ReserveStaminaExchangeScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ReserveStaminaExchangeScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ReserveStaminaExchangeScRsp messages
     */
    public static MessageFactory<ReserveStaminaExchangeScRsp> getFactory() {
      return ReserveStaminaExchangeScRspFactory.INSTANCE;
    }

    private enum ReserveStaminaExchangeScRspFactory implements MessageFactory<ReserveStaminaExchangeScRsp> {
      INSTANCE;

      @Override
      public ReserveStaminaExchangeScRsp create() {
        return ReserveStaminaExchangeScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName num = FieldName.forField("num");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}
