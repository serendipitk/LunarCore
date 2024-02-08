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

public final class CommonRogueQueryScRspOuterClass {
  /**
   * Protobuf type {@code CommonRogueQueryScRsp}
   */
  public static final class CommonRogueQueryScRsp extends ProtoMessage<CommonRogueQueryScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>optional .CommonRogueQuery common_rogue_query = 4;</code>
     */
    private final CommonRogueQueryOuterClass.CommonRogueQuery commonRogueQuery = CommonRogueQueryOuterClass.CommonRogueQuery.newInstance();

    private CommonRogueQueryScRsp() {
    }

    /**
     * @return a new empty instance of {@code CommonRogueQueryScRsp}
     */
    public static CommonRogueQueryScRsp newInstance() {
      return new CommonRogueQueryScRsp();
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public CommonRogueQueryScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public CommonRogueQueryScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .CommonRogueQuery common_rogue_query = 4;</code>
     * @return whether the commonRogueQuery field is set
     */
    public boolean hasCommonRogueQuery() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .CommonRogueQuery common_rogue_query = 4;</code>
     * @return this
     */
    public CommonRogueQueryScRsp clearCommonRogueQuery() {
      bitField0_ &= ~0x00000002;
      commonRogueQuery.clear();
      return this;
    }

    /**
     * <code>optional .CommonRogueQuery common_rogue_query = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCommonRogueQuery()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public CommonRogueQueryOuterClass.CommonRogueQuery getCommonRogueQuery() {
      return commonRogueQuery;
    }

    /**
     * <code>optional .CommonRogueQuery common_rogue_query = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public CommonRogueQueryOuterClass.CommonRogueQuery getMutableCommonRogueQuery() {
      bitField0_ |= 0x00000002;
      return commonRogueQuery;
    }

    /**
     * <code>optional .CommonRogueQuery common_rogue_query = 4;</code>
     * @param value the commonRogueQuery to set
     * @return this
     */
    public CommonRogueQueryScRsp setCommonRogueQuery(
        final CommonRogueQueryOuterClass.CommonRogueQuery value) {
      bitField0_ |= 0x00000002;
      commonRogueQuery.copyFrom(value);
      return this;
    }

    @Override
    public CommonRogueQueryScRsp copyFrom(final CommonRogueQueryScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        commonRogueQuery.copyFrom(other.commonRogueQuery);
      }
      return this;
    }

    @Override
    public CommonRogueQueryScRsp mergeFrom(final CommonRogueQueryScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasCommonRogueQuery()) {
        getMutableCommonRogueQuery().mergeFrom(other.commonRogueQuery);
      }
      return this;
    }

    @Override
    public CommonRogueQueryScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      commonRogueQuery.clear();
      return this;
    }

    @Override
    public CommonRogueQueryScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      commonRogueQuery.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof CommonRogueQueryScRsp)) {
        return false;
      }
      CommonRogueQueryScRsp other = (CommonRogueQueryScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasCommonRogueQuery() || commonRogueQuery.equals(other.commonRogueQuery));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(commonRogueQuery);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(commonRogueQuery);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public CommonRogueQueryScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // commonRogueQuery
            input.readMessage(commonRogueQuery);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.commonRogueQuery, commonRogueQuery);
      }
      output.endObject();
    }

    @Override
    public CommonRogueQueryScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1847205721:
          case 1954524623: {
            if (input.isAtField(FieldNames.commonRogueQuery)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(commonRogueQuery);
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
    public CommonRogueQueryScRsp clone() {
      return new CommonRogueQueryScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static CommonRogueQueryScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new CommonRogueQueryScRsp(), data).checkInitialized();
    }

    public static CommonRogueQueryScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new CommonRogueQueryScRsp(), input).checkInitialized();
    }

    public static CommonRogueQueryScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new CommonRogueQueryScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating CommonRogueQueryScRsp messages
     */
    public static MessageFactory<CommonRogueQueryScRsp> getFactory() {
      return CommonRogueQueryScRspFactory.INSTANCE;
    }

    private enum CommonRogueQueryScRspFactory implements MessageFactory<CommonRogueQueryScRsp> {
      INSTANCE;

      @Override
      public CommonRogueQueryScRsp create() {
        return CommonRogueQueryScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName commonRogueQuery = FieldName.forField("commonRogueQuery", "common_rogue_query");
    }
  }
}
