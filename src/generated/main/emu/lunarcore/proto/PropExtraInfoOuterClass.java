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

public final class PropExtraInfoOuterClass {
  /**
   * Protobuf type {@code PropExtraInfo}
   */
  public static final class PropExtraInfo extends ProtoMessage<PropExtraInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .PropRogueInfo rogue_info = 2;</code>
     */
    private final PropRogueInfoOuterClass.PropRogueInfo rogueInfo = PropRogueInfoOuterClass.PropRogueInfo.newInstance();

    private PropExtraInfo() {
    }

    /**
     * @return a new empty instance of {@code PropExtraInfo}
     */
    public static PropExtraInfo newInstance() {
      return new PropExtraInfo();
    }

    /**
     * <code>optional .PropRogueInfo rogue_info = 2;</code>
     * @return whether the rogueInfo field is set
     */
    public boolean hasRogueInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .PropRogueInfo rogue_info = 2;</code>
     * @return this
     */
    public PropExtraInfo clearRogueInfo() {
      bitField0_ &= ~0x00000001;
      rogueInfo.clear();
      return this;
    }

    /**
     * <code>optional .PropRogueInfo rogue_info = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public PropRogueInfoOuterClass.PropRogueInfo getRogueInfo() {
      return rogueInfo;
    }

    /**
     * <code>optional .PropRogueInfo rogue_info = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public PropRogueInfoOuterClass.PropRogueInfo getMutableRogueInfo() {
      bitField0_ |= 0x00000001;
      return rogueInfo;
    }

    /**
     * <code>optional .PropRogueInfo rogue_info = 2;</code>
     * @param value the rogueInfo to set
     * @return this
     */
    public PropExtraInfo setRogueInfo(final PropRogueInfoOuterClass.PropRogueInfo value) {
      bitField0_ |= 0x00000001;
      rogueInfo.copyFrom(value);
      return this;
    }

    @Override
    public PropExtraInfo copyFrom(final PropExtraInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueInfo.copyFrom(other.rogueInfo);
      }
      return this;
    }

    @Override
    public PropExtraInfo mergeFrom(final PropExtraInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueInfo()) {
        getMutableRogueInfo().mergeFrom(other.rogueInfo);
      }
      return this;
    }

    @Override
    public PropExtraInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueInfo.clear();
      return this;
    }

    @Override
    public PropExtraInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PropExtraInfo)) {
        return false;
      }
      PropExtraInfo other = (PropExtraInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueInfo() || rogueInfo.equals(other.rogueInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(rogueInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PropExtraInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // rogueInfo
            input.readMessage(rogueInfo);
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
        output.writeMessage(FieldNames.rogueInfo, rogueInfo);
      }
      output.endObject();
    }

    @Override
    public PropExtraInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 655808936:
          case -1124583437: {
            if (input.isAtField(FieldNames.rogueInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueInfo);
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
    public PropExtraInfo clone() {
      return new PropExtraInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PropExtraInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PropExtraInfo(), data).checkInitialized();
    }

    public static PropExtraInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PropExtraInfo(), input).checkInitialized();
    }

    public static PropExtraInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PropExtraInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating PropExtraInfo messages
     */
    public static MessageFactory<PropExtraInfo> getFactory() {
      return PropExtraInfoFactory.INSTANCE;
    }

    private enum PropExtraInfoFactory implements MessageFactory<PropExtraInfo> {
      INSTANCE;

      @Override
      public PropExtraInfo create() {
        return PropExtraInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueInfo = FieldName.forField("rogueInfo", "rogue_info");
    }
  }
}
