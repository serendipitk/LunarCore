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
import us.hebi.quickbuf.RepeatedMessage;

public final class SceneEntityGroupInfoOuterClass {
  /**
   * Protobuf type {@code SceneEntityGroupInfo}
   */
  public static final class SceneEntityGroupInfo extends ProtoMessage<SceneEntityGroupInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 state = 3;</code>
     */
    private int state;

    /**
     * <code>optional uint32 group_id = 9;</code>
     */
    private int groupId;

    /**
     * <code>repeated .SceneEntityInfo entity_list = 14;</code>
     */
    private final RepeatedMessage<SceneEntityInfoOuterClass.SceneEntityInfo> entityList = RepeatedMessage.newEmptyInstance(SceneEntityInfoOuterClass.SceneEntityInfo.getFactory());

    private SceneEntityGroupInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneEntityGroupInfo}
     */
    public static SceneEntityGroupInfo newInstance() {
      return new SceneEntityGroupInfo();
    }

    /**
     * <code>optional uint32 state = 3;</code>
     * @return whether the state field is set
     */
    public boolean hasState() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 state = 3;</code>
     * @return this
     */
    public SceneEntityGroupInfo clearState() {
      bitField0_ &= ~0x00000001;
      state = 0;
      return this;
    }

    /**
     * <code>optional uint32 state = 3;</code>
     * @return the state
     */
    public int getState() {
      return state;
    }

    /**
     * <code>optional uint32 state = 3;</code>
     * @param value the state to set
     * @return this
     */
    public SceneEntityGroupInfo setState(final int value) {
      bitField0_ |= 0x00000001;
      state = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @return this
     */
    public SceneEntityGroupInfo clearGroupId() {
      bitField0_ &= ~0x00000002;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @param value the groupId to set
     * @return this
     */
    public SceneEntityGroupInfo setGroupId(final int value) {
      bitField0_ |= 0x00000002;
      groupId = value;
      return this;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 14;</code>
     * @return whether the entityList field is set
     */
    public boolean hasEntityList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 14;</code>
     * @return this
     */
    public SceneEntityGroupInfo clearEntityList() {
      bitField0_ &= ~0x00000004;
      entityList.clear();
      return this;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEntityList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<SceneEntityInfoOuterClass.SceneEntityInfo> getEntityList() {
      return entityList;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<SceneEntityInfoOuterClass.SceneEntityInfo> getMutableEntityList() {
      bitField0_ |= 0x00000004;
      return entityList;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 14;</code>
     * @param value the entityList to add
     * @return this
     */
    public SceneEntityGroupInfo addEntityList(
        final SceneEntityInfoOuterClass.SceneEntityInfo value) {
      bitField0_ |= 0x00000004;
      entityList.add(value);
      return this;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 14;</code>
     * @param values the entityList to add
     * @return this
     */
    public SceneEntityGroupInfo addAllEntityList(
        final SceneEntityInfoOuterClass.SceneEntityInfo... values) {
      bitField0_ |= 0x00000004;
      entityList.addAll(values);
      return this;
    }

    @Override
    public SceneEntityGroupInfo copyFrom(final SceneEntityGroupInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        state = other.state;
        groupId = other.groupId;
        entityList.copyFrom(other.entityList);
      }
      return this;
    }

    @Override
    public SceneEntityGroupInfo mergeFrom(final SceneEntityGroupInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasState()) {
        setState(other.state);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasEntityList()) {
        getMutableEntityList().addAll(other.entityList);
      }
      return this;
    }

    @Override
    public SceneEntityGroupInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      state = 0;
      groupId = 0;
      entityList.clear();
      return this;
    }

    @Override
    public SceneEntityGroupInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneEntityGroupInfo)) {
        return false;
      }
      SceneEntityGroupInfo other = (SceneEntityGroupInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasState() || state == other.state)
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasEntityList() || entityList.equals(other.entityList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(state);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < entityList.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(entityList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(state);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * entityList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(entityList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEntityGroupInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // state
            state = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // entityList
            tag = input.readRepeatedMessage(entityList, tag);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.state, state);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.entityList, entityList);
      }
      output.endObject();
    }

    @Override
    public SceneEntityGroupInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109757585: {
            if (input.isAtField(FieldNames.state)) {
              if (!input.trySkipNullValue()) {
                state = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1483251935:
          case 1281457018: {
            if (input.isAtField(FieldNames.entityList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(entityList);
                bitField0_ |= 0x00000004;
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
    public SceneEntityGroupInfo clone() {
      return new SceneEntityGroupInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEntityGroupInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEntityGroupInfo(), data).checkInitialized();
    }

    public static SceneEntityGroupInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityGroupInfo(), input).checkInitialized();
    }

    public static SceneEntityGroupInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityGroupInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEntityGroupInfo messages
     */
    public static MessageFactory<SceneEntityGroupInfo> getFactory() {
      return SceneEntityGroupInfoFactory.INSTANCE;
    }

    private enum SceneEntityGroupInfoFactory implements MessageFactory<SceneEntityGroupInfo> {
      INSTANCE;

      @Override
      public SceneEntityGroupInfo create() {
        return SceneEntityGroupInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName state = FieldName.forField("state");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName entityList = FieldName.forField("entityList", "entity_list");
    }
  }
}
