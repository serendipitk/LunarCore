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
import us.hebi.quickbuf.RepeatedInt;

public final class ChallengeStoryBuffInfoOuterClass {
  /**
   * Protobuf type {@code ChallengeStoryBuffInfo}
   */
  public static final class ChallengeStoryBuffInfo extends ProtoMessage<ChallengeStoryBuffInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 buff_list = 2;</code>
     */
    private final RepeatedInt buffList = RepeatedInt.newEmptyInstance();

    private ChallengeStoryBuffInfo() {
    }

    /**
     * @return a new empty instance of {@code ChallengeStoryBuffInfo}
     */
    public static ChallengeStoryBuffInfo newInstance() {
      return new ChallengeStoryBuffInfo();
    }

    /**
     * <code>repeated uint32 buff_list = 2;</code>
     * @return whether the buffList field is set
     */
    public boolean hasBuffList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 buff_list = 2;</code>
     * @return this
     */
    public ChallengeStoryBuffInfo clearBuffList() {
      bitField0_ &= ~0x00000001;
      buffList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 buff_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getBuffList() {
      return buffList;
    }

    /**
     * <code>repeated uint32 buff_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableBuffList() {
      bitField0_ |= 0x00000001;
      return buffList;
    }

    /**
     * <code>repeated uint32 buff_list = 2;</code>
     * @param value the buffList to add
     * @return this
     */
    public ChallengeStoryBuffInfo addBuffList(final int value) {
      bitField0_ |= 0x00000001;
      buffList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 buff_list = 2;</code>
     * @param values the buffList to add
     * @return this
     */
    public ChallengeStoryBuffInfo addAllBuffList(final int... values) {
      bitField0_ |= 0x00000001;
      buffList.addAll(values);
      return this;
    }

    @Override
    public ChallengeStoryBuffInfo copyFrom(final ChallengeStoryBuffInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        buffList.copyFrom(other.buffList);
      }
      return this;
    }

    @Override
    public ChallengeStoryBuffInfo mergeFrom(final ChallengeStoryBuffInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBuffList()) {
        getMutableBuffList().addAll(other.buffList);
      }
      return this;
    }

    @Override
    public ChallengeStoryBuffInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffList.clear();
      return this;
    }

    @Override
    public ChallengeStoryBuffInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeStoryBuffInfo)) {
        return false;
      }
      ChallengeStoryBuffInfo other = (ChallengeStoryBuffInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBuffList() || buffList.equals(other.buffList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < buffList.length(); i++) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(buffList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * buffList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(buffList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeStoryBuffInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // buffList [packed=true]
            input.readPackedUInt32(buffList, tag);
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
          case 16: {
            // buffList [packed=false]
            tag = input.readRepeatedUInt32(buffList, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.buffList, buffList);
      }
      output.endObject();
    }

    @Override
    public ChallengeStoryBuffInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1522789487:
          case 55792906: {
            if (input.isAtField(FieldNames.buffList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(buffList);
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
    public ChallengeStoryBuffInfo clone() {
      return new ChallengeStoryBuffInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeStoryBuffInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeStoryBuffInfo(), data).checkInitialized();
    }

    public static ChallengeStoryBuffInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeStoryBuffInfo(), input).checkInitialized();
    }

    public static ChallengeStoryBuffInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeStoryBuffInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeStoryBuffInfo messages
     */
    public static MessageFactory<ChallengeStoryBuffInfo> getFactory() {
      return ChallengeStoryBuffInfoFactory.INSTANCE;
    }

    private enum ChallengeStoryBuffInfoFactory implements MessageFactory<ChallengeStoryBuffInfo> {
      INSTANCE;

      @Override
      public ChallengeStoryBuffInfo create() {
        return ChallengeStoryBuffInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName buffList = FieldName.forField("buffList", "buff_list");
    }
  }
}
