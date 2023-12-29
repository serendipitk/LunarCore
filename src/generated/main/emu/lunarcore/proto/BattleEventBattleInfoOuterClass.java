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

public final class BattleEventBattleInfoOuterClass {
  /**
   * Protobuf type {@code BattleEventBattleInfo}
   */
  public static final class BattleEventBattleInfo extends ProtoMessage<BattleEventBattleInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 battle_event_id = 1;</code>
     */
    private int battleEventId;

    /**
     * <code>optional .BattleEventInitedData status = 2;</code>
     */
    private final BattleEventInitedDataOuterClass.BattleEventInitedData status = BattleEventInitedDataOuterClass.BattleEventInitedData.newInstance();

    private BattleEventBattleInfo() {
    }

    /**
     * @return a new empty instance of {@code BattleEventBattleInfo}
     */
    public static BattleEventBattleInfo newInstance() {
      return new BattleEventBattleInfo();
    }

    /**
     * <code>optional uint32 battle_event_id = 1;</code>
     * @return whether the battleEventId field is set
     */
    public boolean hasBattleEventId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 battle_event_id = 1;</code>
     * @return this
     */
    public BattleEventBattleInfo clearBattleEventId() {
      bitField0_ &= ~0x00000001;
      battleEventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 battle_event_id = 1;</code>
     * @return the battleEventId
     */
    public int getBattleEventId() {
      return battleEventId;
    }

    /**
     * <code>optional uint32 battle_event_id = 1;</code>
     * @param value the battleEventId to set
     * @return this
     */
    public BattleEventBattleInfo setBattleEventId(final int value) {
      bitField0_ |= 0x00000001;
      battleEventId = value;
      return this;
    }

    /**
     * <code>optional .BattleEventInitedData status = 2;</code>
     * @return whether the status field is set
     */
    public boolean hasStatus() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .BattleEventInitedData status = 2;</code>
     * @return this
     */
    public BattleEventBattleInfo clearStatus() {
      bitField0_ &= ~0x00000002;
      status.clear();
      return this;
    }

    /**
     * <code>optional .BattleEventInitedData status = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableStatus()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public BattleEventInitedDataOuterClass.BattleEventInitedData getStatus() {
      return status;
    }

    /**
     * <code>optional .BattleEventInitedData status = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public BattleEventInitedDataOuterClass.BattleEventInitedData getMutableStatus() {
      bitField0_ |= 0x00000002;
      return status;
    }

    /**
     * <code>optional .BattleEventInitedData status = 2;</code>
     * @param value the status to set
     * @return this
     */
    public BattleEventBattleInfo setStatus(
        final BattleEventInitedDataOuterClass.BattleEventInitedData value) {
      bitField0_ |= 0x00000002;
      status.copyFrom(value);
      return this;
    }

    @Override
    public BattleEventBattleInfo copyFrom(final BattleEventBattleInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        battleEventId = other.battleEventId;
        status.copyFrom(other.status);
      }
      return this;
    }

    @Override
    public BattleEventBattleInfo mergeFrom(final BattleEventBattleInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBattleEventId()) {
        setBattleEventId(other.battleEventId);
      }
      if (other.hasStatus()) {
        getMutableStatus().mergeFrom(other.status);
      }
      return this;
    }

    @Override
    public BattleEventBattleInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleEventId = 0;
      status.clear();
      return this;
    }

    @Override
    public BattleEventBattleInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      status.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof BattleEventBattleInfo)) {
        return false;
      }
      BattleEventBattleInfo other = (BattleEventBattleInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBattleEventId() || battleEventId == other.battleEventId)
        && (!hasStatus() || status.equals(other.status));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(battleEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(status);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(battleEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(status);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public BattleEventBattleInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // battleEventId
            battleEventId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // status
            input.readMessage(status);
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
        output.writeUInt32(FieldNames.battleEventId, battleEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.status, status);
      }
      output.endObject();
    }

    @Override
    public BattleEventBattleInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -79510147:
          case -766250873: {
            if (input.isAtField(FieldNames.battleEventId)) {
              if (!input.trySkipNullValue()) {
                battleEventId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -892481550: {
            if (input.isAtField(FieldNames.status)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(status);
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
    public BattleEventBattleInfo clone() {
      return new BattleEventBattleInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static BattleEventBattleInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new BattleEventBattleInfo(), data).checkInitialized();
    }

    public static BattleEventBattleInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattleEventBattleInfo(), input).checkInitialized();
    }

    public static BattleEventBattleInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattleEventBattleInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating BattleEventBattleInfo messages
     */
    public static MessageFactory<BattleEventBattleInfo> getFactory() {
      return BattleEventBattleInfoFactory.INSTANCE;
    }

    private enum BattleEventBattleInfoFactory implements MessageFactory<BattleEventBattleInfo> {
      INSTANCE;

      @Override
      public BattleEventBattleInfo create() {
        return BattleEventBattleInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName battleEventId = FieldName.forField("battleEventId", "battle_event_id");

      static final FieldName status = FieldName.forField("status");
    }
  }
}
