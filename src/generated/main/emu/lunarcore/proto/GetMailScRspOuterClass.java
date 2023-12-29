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

public final class GetMailScRspOuterClass {
  /**
   * Protobuf type {@code GetMailScRsp}
   */
  public static final class GetMailScRsp extends ProtoMessage<GetMailScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 1;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 total_num = 2;</code>
     */
    private int totalNum;

    /**
     * <code>optional uint32 start = 4;</code>
     */
    private int start;

    /**
     * <code>optional bool is_end = 5;</code>
     */
    private boolean isEnd;

    /**
     * <code>repeated .ClientMail notice_mail_list = 8;</code>
     */
    private final RepeatedMessage<ClientMailOuterClass.ClientMail> noticeMailList = RepeatedMessage.newEmptyInstance(ClientMailOuterClass.ClientMail.getFactory());

    /**
     * <code>repeated .ClientMail mail_list = 15;</code>
     */
    private final RepeatedMessage<ClientMailOuterClass.ClientMail> mailList = RepeatedMessage.newEmptyInstance(ClientMailOuterClass.ClientMail.getFactory());

    private GetMailScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetMailScRsp}
     */
    public static GetMailScRsp newInstance() {
      return new GetMailScRsp();
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return this
     */
    public GetMailScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetMailScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 total_num = 2;</code>
     * @return whether the totalNum field is set
     */
    public boolean hasTotalNum() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 total_num = 2;</code>
     * @return this
     */
    public GetMailScRsp clearTotalNum() {
      bitField0_ &= ~0x00000002;
      totalNum = 0;
      return this;
    }

    /**
     * <code>optional uint32 total_num = 2;</code>
     * @return the totalNum
     */
    public int getTotalNum() {
      return totalNum;
    }

    /**
     * <code>optional uint32 total_num = 2;</code>
     * @param value the totalNum to set
     * @return this
     */
    public GetMailScRsp setTotalNum(final int value) {
      bitField0_ |= 0x00000002;
      totalNum = value;
      return this;
    }

    /**
     * <code>optional uint32 start = 4;</code>
     * @return whether the start field is set
     */
    public boolean hasStart() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 start = 4;</code>
     * @return this
     */
    public GetMailScRsp clearStart() {
      bitField0_ &= ~0x00000004;
      start = 0;
      return this;
    }

    /**
     * <code>optional uint32 start = 4;</code>
     * @return the start
     */
    public int getStart() {
      return start;
    }

    /**
     * <code>optional uint32 start = 4;</code>
     * @param value the start to set
     * @return this
     */
    public GetMailScRsp setStart(final int value) {
      bitField0_ |= 0x00000004;
      start = value;
      return this;
    }

    /**
     * <code>optional bool is_end = 5;</code>
     * @return whether the isEnd field is set
     */
    public boolean hasIsEnd() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional bool is_end = 5;</code>
     * @return this
     */
    public GetMailScRsp clearIsEnd() {
      bitField0_ &= ~0x00000008;
      isEnd = false;
      return this;
    }

    /**
     * <code>optional bool is_end = 5;</code>
     * @return the isEnd
     */
    public boolean getIsEnd() {
      return isEnd;
    }

    /**
     * <code>optional bool is_end = 5;</code>
     * @param value the isEnd to set
     * @return this
     */
    public GetMailScRsp setIsEnd(final boolean value) {
      bitField0_ |= 0x00000008;
      isEnd = value;
      return this;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 8;</code>
     * @return whether the noticeMailList field is set
     */
    public boolean hasNoticeMailList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 8;</code>
     * @return this
     */
    public GetMailScRsp clearNoticeMailList() {
      bitField0_ &= ~0x00000010;
      noticeMailList.clear();
      return this;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNoticeMailList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ClientMailOuterClass.ClientMail> getNoticeMailList() {
      return noticeMailList;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ClientMailOuterClass.ClientMail> getMutableNoticeMailList() {
      bitField0_ |= 0x00000010;
      return noticeMailList;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 8;</code>
     * @param value the noticeMailList to add
     * @return this
     */
    public GetMailScRsp addNoticeMailList(final ClientMailOuterClass.ClientMail value) {
      bitField0_ |= 0x00000010;
      noticeMailList.add(value);
      return this;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 8;</code>
     * @param values the noticeMailList to add
     * @return this
     */
    public GetMailScRsp addAllNoticeMailList(final ClientMailOuterClass.ClientMail... values) {
      bitField0_ |= 0x00000010;
      noticeMailList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .ClientMail mail_list = 15;</code>
     * @return whether the mailList field is set
     */
    public boolean hasMailList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .ClientMail mail_list = 15;</code>
     * @return this
     */
    public GetMailScRsp clearMailList() {
      bitField0_ &= ~0x00000020;
      mailList.clear();
      return this;
    }

    /**
     * <code>repeated .ClientMail mail_list = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMailList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ClientMailOuterClass.ClientMail> getMailList() {
      return mailList;
    }

    /**
     * <code>repeated .ClientMail mail_list = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ClientMailOuterClass.ClientMail> getMutableMailList() {
      bitField0_ |= 0x00000020;
      return mailList;
    }

    /**
     * <code>repeated .ClientMail mail_list = 15;</code>
     * @param value the mailList to add
     * @return this
     */
    public GetMailScRsp addMailList(final ClientMailOuterClass.ClientMail value) {
      bitField0_ |= 0x00000020;
      mailList.add(value);
      return this;
    }

    /**
     * <code>repeated .ClientMail mail_list = 15;</code>
     * @param values the mailList to add
     * @return this
     */
    public GetMailScRsp addAllMailList(final ClientMailOuterClass.ClientMail... values) {
      bitField0_ |= 0x00000020;
      mailList.addAll(values);
      return this;
    }

    @Override
    public GetMailScRsp copyFrom(final GetMailScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        totalNum = other.totalNum;
        start = other.start;
        isEnd = other.isEnd;
        noticeMailList.copyFrom(other.noticeMailList);
        mailList.copyFrom(other.mailList);
      }
      return this;
    }

    @Override
    public GetMailScRsp mergeFrom(final GetMailScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasTotalNum()) {
        setTotalNum(other.totalNum);
      }
      if (other.hasStart()) {
        setStart(other.start);
      }
      if (other.hasIsEnd()) {
        setIsEnd(other.isEnd);
      }
      if (other.hasNoticeMailList()) {
        getMutableNoticeMailList().addAll(other.noticeMailList);
      }
      if (other.hasMailList()) {
        getMutableMailList().addAll(other.mailList);
      }
      return this;
    }

    @Override
    public GetMailScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      totalNum = 0;
      start = 0;
      isEnd = false;
      noticeMailList.clear();
      mailList.clear();
      return this;
    }

    @Override
    public GetMailScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      noticeMailList.clearQuick();
      mailList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetMailScRsp)) {
        return false;
      }
      GetMailScRsp other = (GetMailScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasTotalNum() || totalNum == other.totalNum)
        && (!hasStart() || start == other.start)
        && (!hasIsEnd() || isEnd == other.isEnd)
        && (!hasNoticeMailList() || noticeMailList.equals(other.noticeMailList))
        && (!hasMailList() || mailList.equals(other.mailList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(totalNum);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(start);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 40);
        output.writeBoolNoTag(isEnd);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < noticeMailList.length(); i++) {
          output.writeRawByte((byte) 66);
          output.writeMessageNoTag(noticeMailList.get(i));
        }
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < mailList.length(); i++) {
          output.writeRawByte((byte) 122);
          output.writeMessageNoTag(mailList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(totalNum);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(start);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * noticeMailList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(noticeMailList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * mailList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(mailList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetMailScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // totalNum
            totalNum = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // start
            start = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // isEnd
            isEnd = input.readBool();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // noticeMailList
            tag = input.readRepeatedMessage(noticeMailList, tag);
            bitField0_ |= 0x00000010;
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // mailList
            tag = input.readRepeatedMessage(mailList, tag);
            bitField0_ |= 0x00000020;
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
        output.writeUInt32(FieldNames.totalNum, totalNum);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.start, start);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeBool(FieldNames.isEnd, isEnd);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedMessage(FieldNames.noticeMailList, noticeMailList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.mailList, mailList);
      }
      output.endObject();
    }

    @Override
    public GetMailScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -849911390:
          case -576949237: {
            if (input.isAtField(FieldNames.totalNum)) {
              if (!input.trySkipNullValue()) {
                totalNum = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109757538: {
            if (input.isAtField(FieldNames.start)) {
              if (!input.trySkipNullValue()) {
                start = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100465489:
          case -1179770810: {
            if (input.isAtField(FieldNames.isEnd)) {
              if (!input.trySkipNullValue()) {
                isEnd = input.readBool();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 17373677:
          case 1540899199: {
            if (input.isAtField(FieldNames.noticeMailList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(noticeMailList);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -10520843:
          case -308519386: {
            if (input.isAtField(FieldNames.mailList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(mailList);
                bitField0_ |= 0x00000020;
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
    public GetMailScRsp clone() {
      return new GetMailScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetMailScRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetMailScRsp(), data).checkInitialized();
    }

    public static GetMailScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMailScRsp(), input).checkInitialized();
    }

    public static GetMailScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMailScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetMailScRsp messages
     */
    public static MessageFactory<GetMailScRsp> getFactory() {
      return GetMailScRspFactory.INSTANCE;
    }

    private enum GetMailScRspFactory implements MessageFactory<GetMailScRsp> {
      INSTANCE;

      @Override
      public GetMailScRsp create() {
        return GetMailScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName totalNum = FieldName.forField("totalNum", "total_num");

      static final FieldName start = FieldName.forField("start");

      static final FieldName isEnd = FieldName.forField("isEnd", "is_end");

      static final FieldName noticeMailList = FieldName.forField("noticeMailList", "notice_mail_list");

      static final FieldName mailList = FieldName.forField("mailList", "mail_list");
    }
  }
}
