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

public final class ClientTurnSnapshotStatusOuterClass {
  /**
   * Protobuf type {@code ClientTurnSnapshotStatus}
   */
  public static final class ClientTurnSnapshotStatus extends ProtoMessage<ClientTurnSnapshotStatus> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     */
    private final SpBarInfoOuterClass.SpBarInfo spBar = SpBarInfoOuterClass.SpBarInfo.newInstance();

    private ClientTurnSnapshotStatus() {
    }

    /**
     * @return a new empty instance of {@code ClientTurnSnapshotStatus}
     */
    public static ClientTurnSnapshotStatus newInstance() {
      return new ClientTurnSnapshotStatus();
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     * @return whether the spBar field is set
     */
    public boolean hasSpBar() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     * @return this
     */
    public ClientTurnSnapshotStatus clearSpBar() {
      bitField0_ &= ~0x00000001;
      spBar.clear();
      return this;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSpBar()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SpBarInfoOuterClass.SpBarInfo getSpBar() {
      return spBar;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SpBarInfoOuterClass.SpBarInfo getMutableSpBar() {
      bitField0_ |= 0x00000001;
      return spBar;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     * @param value the spBar to set
     * @return this
     */
    public ClientTurnSnapshotStatus setSpBar(final SpBarInfoOuterClass.SpBarInfo value) {
      bitField0_ |= 0x00000001;
      spBar.copyFrom(value);
      return this;
    }

    @Override
    public ClientTurnSnapshotStatus copyFrom(final ClientTurnSnapshotStatus other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        spBar.copyFrom(other.spBar);
      }
      return this;
    }

    @Override
    public ClientTurnSnapshotStatus mergeFrom(final ClientTurnSnapshotStatus other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSpBar()) {
        getMutableSpBar().mergeFrom(other.spBar);
      }
      return this;
    }

    @Override
    public ClientTurnSnapshotStatus clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      spBar.clear();
      return this;
    }

    @Override
    public ClientTurnSnapshotStatus clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      spBar.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ClientTurnSnapshotStatus)) {
        return false;
      }
      ClientTurnSnapshotStatus other = (ClientTurnSnapshotStatus) o;
      return bitField0_ == other.bitField0_
        && (!hasSpBar() || spBar.equals(other.spBar));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(spBar);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(spBar);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ClientTurnSnapshotStatus mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // spBar
            input.readMessage(spBar);
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
        output.writeMessage(FieldNames.spBar, spBar);
      }
      output.endObject();
    }

    @Override
    public ClientTurnSnapshotStatus mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109608054:
          case -896253135: {
            if (input.isAtField(FieldNames.spBar)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(spBar);
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
    public ClientTurnSnapshotStatus clone() {
      return new ClientTurnSnapshotStatus().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ClientTurnSnapshotStatus parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ClientTurnSnapshotStatus(), data).checkInitialized();
    }

    public static ClientTurnSnapshotStatus parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ClientTurnSnapshotStatus(), input).checkInitialized();
    }

    public static ClientTurnSnapshotStatus parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ClientTurnSnapshotStatus(), input).checkInitialized();
    }

    /**
     * @return factory for creating ClientTurnSnapshotStatus messages
     */
    public static MessageFactory<ClientTurnSnapshotStatus> getFactory() {
      return ClientTurnSnapshotStatusFactory.INSTANCE;
    }

    private enum ClientTurnSnapshotStatusFactory implements MessageFactory<ClientTurnSnapshotStatus> {
      INSTANCE;

      @Override
      public ClientTurnSnapshotStatus create() {
        return ClientTurnSnapshotStatus.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName spBar = FieldName.forField("spBar", "sp_bar");
    }
  }
}
