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

public final class SelectRogueBuffCsReqOuterClass {
  /**
   * Protobuf type {@code SelectRogueBuffCsReq}
   */
  public static final class SelectRogueBuffCsReq extends ProtoMessage<SelectRogueBuffCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 maze_buff_id = 13;</code>
     */
    private int mazeBuffId;

    private SelectRogueBuffCsReq() {
    }

    /**
     * @return a new empty instance of {@code SelectRogueBuffCsReq}
     */
    public static SelectRogueBuffCsReq newInstance() {
      return new SelectRogueBuffCsReq();
    }

    /**
     * <code>optional uint32 maze_buff_id = 13;</code>
     * @return whether the mazeBuffId field is set
     */
    public boolean hasMazeBuffId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 maze_buff_id = 13;</code>
     * @return this
     */
    public SelectRogueBuffCsReq clearMazeBuffId() {
      bitField0_ &= ~0x00000001;
      mazeBuffId = 0;
      return this;
    }

    /**
     * <code>optional uint32 maze_buff_id = 13;</code>
     * @return the mazeBuffId
     */
    public int getMazeBuffId() {
      return mazeBuffId;
    }

    /**
     * <code>optional uint32 maze_buff_id = 13;</code>
     * @param value the mazeBuffId to set
     * @return this
     */
    public SelectRogueBuffCsReq setMazeBuffId(final int value) {
      bitField0_ |= 0x00000001;
      mazeBuffId = value;
      return this;
    }

    @Override
    public SelectRogueBuffCsReq copyFrom(final SelectRogueBuffCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mazeBuffId = other.mazeBuffId;
      }
      return this;
    }

    @Override
    public SelectRogueBuffCsReq mergeFrom(final SelectRogueBuffCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMazeBuffId()) {
        setMazeBuffId(other.mazeBuffId);
      }
      return this;
    }

    @Override
    public SelectRogueBuffCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mazeBuffId = 0;
      return this;
    }

    @Override
    public SelectRogueBuffCsReq clearQuick() {
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
      if (!(o instanceof SelectRogueBuffCsReq)) {
        return false;
      }
      SelectRogueBuffCsReq other = (SelectRogueBuffCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasMazeBuffId() || mazeBuffId == other.mazeBuffId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(mazeBuffId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mazeBuffId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SelectRogueBuffCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 104: {
            // mazeBuffId
            mazeBuffId = input.readUInt32();
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
        output.writeUInt32(FieldNames.mazeBuffId, mazeBuffId);
      }
      output.endObject();
    }

    @Override
    public SelectRogueBuffCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 144210285:
          case 896621575: {
            if (input.isAtField(FieldNames.mazeBuffId)) {
              if (!input.trySkipNullValue()) {
                mazeBuffId = input.readUInt32();
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
    public SelectRogueBuffCsReq clone() {
      return new SelectRogueBuffCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SelectRogueBuffCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SelectRogueBuffCsReq(), data).checkInitialized();
    }

    public static SelectRogueBuffCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SelectRogueBuffCsReq(), input).checkInitialized();
    }

    public static SelectRogueBuffCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SelectRogueBuffCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SelectRogueBuffCsReq messages
     */
    public static MessageFactory<SelectRogueBuffCsReq> getFactory() {
      return SelectRogueBuffCsReqFactory.INSTANCE;
    }

    private enum SelectRogueBuffCsReqFactory implements MessageFactory<SelectRogueBuffCsReq> {
      INSTANCE;

      @Override
      public SelectRogueBuffCsReq create() {
        return SelectRogueBuffCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mazeBuffId = FieldName.forField("mazeBuffId", "maze_buff_id");
    }
  }
}
