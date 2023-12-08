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

public final class NpcTalkInfoOuterClass {
  /**
   * Protobuf type {@code NpcTalkInfo}
   */
  public static final class NpcTalkInfo extends ProtoMessage<NpcTalkInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 npc_talk_id = 14;</code>
     */
    private int npcTalkId;

    private NpcTalkInfo() {
    }

    /**
     * @return a new empty instance of {@code NpcTalkInfo}
     */
    public static NpcTalkInfo newInstance() {
      return new NpcTalkInfo();
    }

    /**
     * <code>optional uint32 npc_talk_id = 14;</code>
     * @return whether the npcTalkId field is set
     */
    public boolean hasNpcTalkId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 npc_talk_id = 14;</code>
     * @return this
     */
    public NpcTalkInfo clearNpcTalkId() {
      bitField0_ &= ~0x00000001;
      npcTalkId = 0;
      return this;
    }

    /**
     * <code>optional uint32 npc_talk_id = 14;</code>
     * @return the npcTalkId
     */
    public int getNpcTalkId() {
      return npcTalkId;
    }

    /**
     * <code>optional uint32 npc_talk_id = 14;</code>
     * @param value the npcTalkId to set
     * @return this
     */
    public NpcTalkInfo setNpcTalkId(final int value) {
      bitField0_ |= 0x00000001;
      npcTalkId = value;
      return this;
    }

    @Override
    public NpcTalkInfo copyFrom(final NpcTalkInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        npcTalkId = other.npcTalkId;
      }
      return this;
    }

    @Override
    public NpcTalkInfo mergeFrom(final NpcTalkInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNpcTalkId()) {
        setNpcTalkId(other.npcTalkId);
      }
      return this;
    }

    @Override
    public NpcTalkInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      npcTalkId = 0;
      return this;
    }

    @Override
    public NpcTalkInfo clearQuick() {
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
      if (!(o instanceof NpcTalkInfo)) {
        return false;
      }
      NpcTalkInfo other = (NpcTalkInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasNpcTalkId() || npcTalkId == other.npcTalkId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(npcTalkId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(npcTalkId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public NpcTalkInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // npcTalkId
            npcTalkId = input.readUInt32();
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
        output.writeUInt32(FieldNames.npcTalkId, npcTalkId);
      }
      output.endObject();
    }

    @Override
    public NpcTalkInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 836037928:
          case 1634324016: {
            if (input.isAtField(FieldNames.npcTalkId)) {
              if (!input.trySkipNullValue()) {
                npcTalkId = input.readUInt32();
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
    public NpcTalkInfo clone() {
      return new NpcTalkInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static NpcTalkInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new NpcTalkInfo(), data).checkInitialized();
    }

    public static NpcTalkInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcTalkInfo(), input).checkInitialized();
    }

    public static NpcTalkInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcTalkInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating NpcTalkInfo messages
     */
    public static MessageFactory<NpcTalkInfo> getFactory() {
      return NpcTalkInfoFactory.INSTANCE;
    }

    private enum NpcTalkInfoFactory implements MessageFactory<NpcTalkInfo> {
      INSTANCE;

      @Override
      public NpcTalkInfo create() {
        return NpcTalkInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName npcTalkId = FieldName.forField("npcTalkId", "npc_talk_id");
    }
  }
}
