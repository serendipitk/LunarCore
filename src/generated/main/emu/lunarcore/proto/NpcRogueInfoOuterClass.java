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

public final class NpcRogueInfoOuterClass {
  /**
   * Protobuf type {@code NpcRogueInfo}
   */
  public static final class NpcRogueInfo extends ProtoMessage<NpcRogueInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * repeated KELFICDMDDG CEEFGPGODAA = 9;
     * </pre>
     *
     * <code>optional uint32 GENMIFOCMJA = 1;</code>
     */
    private int gENMIFOCMJA;

    /**
     * <code>optional uint32 rogue_npc_id = 6;</code>
     */
    private int rogueNpcId;

    /**
     * <code>optional uint32 INJPFALMDHJ = 12;</code>
     */
    private int iNJPFALMDHJ;

    /**
     * <code>optional uint32 GBMDBBBMBEJ = 14;</code>
     */
    private int gBMDBBBMBEJ;

    /**
     * <code>optional bool finish_dialogue = 5;</code>
     */
    private boolean finishDialogue;

    /**
     * <code>optional bool MNINDBMAJKL = 7;</code>
     */
    private boolean mNINDBMAJKL;

    /**
     * <code>optional bool AGBFDIIKPKF = 13;</code>
     */
    private boolean aGBFDIIKPKF;

    /**
     * <code>repeated .NpcRogueInfo.HCGOEHLPCMDEntry HCGOEHLPCMD = 15;</code>
     */
    private final RepeatedMessage<HCGOEHLPCMDEntry> hCGOEHLPCMD = RepeatedMessage.newEmptyInstance(HCGOEHLPCMDEntry.getFactory());

    private NpcRogueInfo() {
    }

    /**
     * @return a new empty instance of {@code NpcRogueInfo}
     */
    public static NpcRogueInfo newInstance() {
      return new NpcRogueInfo();
    }

    /**
     * <pre>
     * repeated KELFICDMDDG CEEFGPGODAA = 9;
     * </pre>
     *
     * <code>optional uint32 GENMIFOCMJA = 1;</code>
     * @return whether the gENMIFOCMJA field is set
     */
    public boolean hasGENMIFOCMJA() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * repeated KELFICDMDDG CEEFGPGODAA = 9;
     * </pre>
     *
     * <code>optional uint32 GENMIFOCMJA = 1;</code>
     * @return this
     */
    public NpcRogueInfo clearGENMIFOCMJA() {
      bitField0_ &= ~0x00000001;
      gENMIFOCMJA = 0;
      return this;
    }

    /**
     * <pre>
     * repeated KELFICDMDDG CEEFGPGODAA = 9;
     * </pre>
     *
     * <code>optional uint32 GENMIFOCMJA = 1;</code>
     * @return the gENMIFOCMJA
     */
    public int getGENMIFOCMJA() {
      return gENMIFOCMJA;
    }

    /**
     * <pre>
     * repeated KELFICDMDDG CEEFGPGODAA = 9;
     * </pre>
     *
     * <code>optional uint32 GENMIFOCMJA = 1;</code>
     * @param value the gENMIFOCMJA to set
     * @return this
     */
    public NpcRogueInfo setGENMIFOCMJA(final int value) {
      bitField0_ |= 0x00000001;
      gENMIFOCMJA = value;
      return this;
    }

    /**
     * <code>optional uint32 rogue_npc_id = 6;</code>
     * @return whether the rogueNpcId field is set
     */
    public boolean hasRogueNpcId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 rogue_npc_id = 6;</code>
     * @return this
     */
    public NpcRogueInfo clearRogueNpcId() {
      bitField0_ &= ~0x00000002;
      rogueNpcId = 0;
      return this;
    }

    /**
     * <code>optional uint32 rogue_npc_id = 6;</code>
     * @return the rogueNpcId
     */
    public int getRogueNpcId() {
      return rogueNpcId;
    }

    /**
     * <code>optional uint32 rogue_npc_id = 6;</code>
     * @param value the rogueNpcId to set
     * @return this
     */
    public NpcRogueInfo setRogueNpcId(final int value) {
      bitField0_ |= 0x00000002;
      rogueNpcId = value;
      return this;
    }

    /**
     * <code>optional uint32 INJPFALMDHJ = 12;</code>
     * @return whether the iNJPFALMDHJ field is set
     */
    public boolean hasINJPFALMDHJ() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 INJPFALMDHJ = 12;</code>
     * @return this
     */
    public NpcRogueInfo clearINJPFALMDHJ() {
      bitField0_ &= ~0x00000004;
      iNJPFALMDHJ = 0;
      return this;
    }

    /**
     * <code>optional uint32 INJPFALMDHJ = 12;</code>
     * @return the iNJPFALMDHJ
     */
    public int getINJPFALMDHJ() {
      return iNJPFALMDHJ;
    }

    /**
     * <code>optional uint32 INJPFALMDHJ = 12;</code>
     * @param value the iNJPFALMDHJ to set
     * @return this
     */
    public NpcRogueInfo setINJPFALMDHJ(final int value) {
      bitField0_ |= 0x00000004;
      iNJPFALMDHJ = value;
      return this;
    }

    /**
     * <code>optional uint32 GBMDBBBMBEJ = 14;</code>
     * @return whether the gBMDBBBMBEJ field is set
     */
    public boolean hasGBMDBBBMBEJ() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 GBMDBBBMBEJ = 14;</code>
     * @return this
     */
    public NpcRogueInfo clearGBMDBBBMBEJ() {
      bitField0_ &= ~0x00000008;
      gBMDBBBMBEJ = 0;
      return this;
    }

    /**
     * <code>optional uint32 GBMDBBBMBEJ = 14;</code>
     * @return the gBMDBBBMBEJ
     */
    public int getGBMDBBBMBEJ() {
      return gBMDBBBMBEJ;
    }

    /**
     * <code>optional uint32 GBMDBBBMBEJ = 14;</code>
     * @param value the gBMDBBBMBEJ to set
     * @return this
     */
    public NpcRogueInfo setGBMDBBBMBEJ(final int value) {
      bitField0_ |= 0x00000008;
      gBMDBBBMBEJ = value;
      return this;
    }

    /**
     * <code>optional bool finish_dialogue = 5;</code>
     * @return whether the finishDialogue field is set
     */
    public boolean hasFinishDialogue() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional bool finish_dialogue = 5;</code>
     * @return this
     */
    public NpcRogueInfo clearFinishDialogue() {
      bitField0_ &= ~0x00000010;
      finishDialogue = false;
      return this;
    }

    /**
     * <code>optional bool finish_dialogue = 5;</code>
     * @return the finishDialogue
     */
    public boolean getFinishDialogue() {
      return finishDialogue;
    }

    /**
     * <code>optional bool finish_dialogue = 5;</code>
     * @param value the finishDialogue to set
     * @return this
     */
    public NpcRogueInfo setFinishDialogue(final boolean value) {
      bitField0_ |= 0x00000010;
      finishDialogue = value;
      return this;
    }

    /**
     * <code>optional bool MNINDBMAJKL = 7;</code>
     * @return whether the mNINDBMAJKL field is set
     */
    public boolean hasMNINDBMAJKL() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional bool MNINDBMAJKL = 7;</code>
     * @return this
     */
    public NpcRogueInfo clearMNINDBMAJKL() {
      bitField0_ &= ~0x00000020;
      mNINDBMAJKL = false;
      return this;
    }

    /**
     * <code>optional bool MNINDBMAJKL = 7;</code>
     * @return the mNINDBMAJKL
     */
    public boolean getMNINDBMAJKL() {
      return mNINDBMAJKL;
    }

    /**
     * <code>optional bool MNINDBMAJKL = 7;</code>
     * @param value the mNINDBMAJKL to set
     * @return this
     */
    public NpcRogueInfo setMNINDBMAJKL(final boolean value) {
      bitField0_ |= 0x00000020;
      mNINDBMAJKL = value;
      return this;
    }

    /**
     * <code>optional bool AGBFDIIKPKF = 13;</code>
     * @return whether the aGBFDIIKPKF field is set
     */
    public boolean hasAGBFDIIKPKF() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional bool AGBFDIIKPKF = 13;</code>
     * @return this
     */
    public NpcRogueInfo clearAGBFDIIKPKF() {
      bitField0_ &= ~0x00000040;
      aGBFDIIKPKF = false;
      return this;
    }

    /**
     * <code>optional bool AGBFDIIKPKF = 13;</code>
     * @return the aGBFDIIKPKF
     */
    public boolean getAGBFDIIKPKF() {
      return aGBFDIIKPKF;
    }

    /**
     * <code>optional bool AGBFDIIKPKF = 13;</code>
     * @param value the aGBFDIIKPKF to set
     * @return this
     */
    public NpcRogueInfo setAGBFDIIKPKF(final boolean value) {
      bitField0_ |= 0x00000040;
      aGBFDIIKPKF = value;
      return this;
    }

    /**
     * <code>repeated .NpcRogueInfo.HCGOEHLPCMDEntry HCGOEHLPCMD = 15;</code>
     * @return whether the hCGOEHLPCMD field is set
     */
    public boolean hasHCGOEHLPCMD() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>repeated .NpcRogueInfo.HCGOEHLPCMDEntry HCGOEHLPCMD = 15;</code>
     * @return this
     */
    public NpcRogueInfo clearHCGOEHLPCMD() {
      bitField0_ &= ~0x00000080;
      hCGOEHLPCMD.clear();
      return this;
    }

    /**
     * <code>repeated .NpcRogueInfo.HCGOEHLPCMDEntry HCGOEHLPCMD = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableHCGOEHLPCMD()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<HCGOEHLPCMDEntry> getHCGOEHLPCMD() {
      return hCGOEHLPCMD;
    }

    /**
     * <code>repeated .NpcRogueInfo.HCGOEHLPCMDEntry HCGOEHLPCMD = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<HCGOEHLPCMDEntry> getMutableHCGOEHLPCMD() {
      bitField0_ |= 0x00000080;
      return hCGOEHLPCMD;
    }

    /**
     * <code>repeated .NpcRogueInfo.HCGOEHLPCMDEntry HCGOEHLPCMD = 15;</code>
     * @param value the hCGOEHLPCMD to add
     * @return this
     */
    public NpcRogueInfo addHCGOEHLPCMD(final HCGOEHLPCMDEntry value) {
      bitField0_ |= 0x00000080;
      hCGOEHLPCMD.add(value);
      return this;
    }

    /**
     * <code>repeated .NpcRogueInfo.HCGOEHLPCMDEntry HCGOEHLPCMD = 15;</code>
     * @param values the hCGOEHLPCMD to add
     * @return this
     */
    public NpcRogueInfo addAllHCGOEHLPCMD(final HCGOEHLPCMDEntry... values) {
      bitField0_ |= 0x00000080;
      hCGOEHLPCMD.addAll(values);
      return this;
    }

    @Override
    public NpcRogueInfo copyFrom(final NpcRogueInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        gENMIFOCMJA = other.gENMIFOCMJA;
        rogueNpcId = other.rogueNpcId;
        iNJPFALMDHJ = other.iNJPFALMDHJ;
        gBMDBBBMBEJ = other.gBMDBBBMBEJ;
        finishDialogue = other.finishDialogue;
        mNINDBMAJKL = other.mNINDBMAJKL;
        aGBFDIIKPKF = other.aGBFDIIKPKF;
        hCGOEHLPCMD.copyFrom(other.hCGOEHLPCMD);
      }
      return this;
    }

    @Override
    public NpcRogueInfo mergeFrom(final NpcRogueInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGENMIFOCMJA()) {
        setGENMIFOCMJA(other.gENMIFOCMJA);
      }
      if (other.hasRogueNpcId()) {
        setRogueNpcId(other.rogueNpcId);
      }
      if (other.hasINJPFALMDHJ()) {
        setINJPFALMDHJ(other.iNJPFALMDHJ);
      }
      if (other.hasGBMDBBBMBEJ()) {
        setGBMDBBBMBEJ(other.gBMDBBBMBEJ);
      }
      if (other.hasFinishDialogue()) {
        setFinishDialogue(other.finishDialogue);
      }
      if (other.hasMNINDBMAJKL()) {
        setMNINDBMAJKL(other.mNINDBMAJKL);
      }
      if (other.hasAGBFDIIKPKF()) {
        setAGBFDIIKPKF(other.aGBFDIIKPKF);
      }
      if (other.hasHCGOEHLPCMD()) {
        getMutableHCGOEHLPCMD().addAll(other.hCGOEHLPCMD);
      }
      return this;
    }

    @Override
    public NpcRogueInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gENMIFOCMJA = 0;
      rogueNpcId = 0;
      iNJPFALMDHJ = 0;
      gBMDBBBMBEJ = 0;
      finishDialogue = false;
      mNINDBMAJKL = false;
      aGBFDIIKPKF = false;
      hCGOEHLPCMD.clear();
      return this;
    }

    @Override
    public NpcRogueInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      hCGOEHLPCMD.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof NpcRogueInfo)) {
        return false;
      }
      NpcRogueInfo other = (NpcRogueInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasGENMIFOCMJA() || gENMIFOCMJA == other.gENMIFOCMJA)
        && (!hasRogueNpcId() || rogueNpcId == other.rogueNpcId)
        && (!hasINJPFALMDHJ() || iNJPFALMDHJ == other.iNJPFALMDHJ)
        && (!hasGBMDBBBMBEJ() || gBMDBBBMBEJ == other.gBMDBBBMBEJ)
        && (!hasFinishDialogue() || finishDialogue == other.finishDialogue)
        && (!hasMNINDBMAJKL() || mNINDBMAJKL == other.mNINDBMAJKL)
        && (!hasAGBFDIIKPKF() || aGBFDIIKPKF == other.aGBFDIIKPKF)
        && (!hasHCGOEHLPCMD() || hCGOEHLPCMD.equals(other.hCGOEHLPCMD));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(gENMIFOCMJA);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(rogueNpcId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(iNJPFALMDHJ);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(gBMDBBBMBEJ);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 40);
        output.writeBoolNoTag(finishDialogue);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 56);
        output.writeBoolNoTag(mNINDBMAJKL);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 104);
        output.writeBoolNoTag(aGBFDIIKPKF);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        for (int i = 0; i < hCGOEHLPCMD.length(); i++) {
          output.writeRawByte((byte) 122);
          output.writeMessageNoTag(hCGOEHLPCMD.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gENMIFOCMJA);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rogueNpcId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(iNJPFALMDHJ);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gBMDBBBMBEJ);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += (1 * hCGOEHLPCMD.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(hCGOEHLPCMD);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public NpcRogueInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // gENMIFOCMJA
            gENMIFOCMJA = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // rogueNpcId
            rogueNpcId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // iNJPFALMDHJ
            iNJPFALMDHJ = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // gBMDBBBMBEJ
            gBMDBBBMBEJ = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // finishDialogue
            finishDialogue = input.readBool();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // mNINDBMAJKL
            mNINDBMAJKL = input.readBool();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // aGBFDIIKPKF
            aGBFDIIKPKF = input.readBool();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // hCGOEHLPCMD
            tag = input.readRepeatedMessage(hCGOEHLPCMD, tag);
            bitField0_ |= 0x00000080;
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
        output.writeUInt32(FieldNames.gENMIFOCMJA, gENMIFOCMJA);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.rogueNpcId, rogueNpcId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.iNJPFALMDHJ, iNJPFALMDHJ);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.gBMDBBBMBEJ, gBMDBBBMBEJ);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.finishDialogue, finishDialogue);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeBool(FieldNames.mNINDBMAJKL, mNINDBMAJKL);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeBool(FieldNames.aGBFDIIKPKF, aGBFDIIKPKF);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRepeatedMessage(FieldNames.hCGOEHLPCMD, hCGOEHLPCMD);
      }
      output.endObject();
    }

    @Override
    public NpcRogueInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 543187766: {
            if (input.isAtField(FieldNames.gENMIFOCMJA)) {
              if (!input.trySkipNullValue()) {
                gENMIFOCMJA = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1140086238:
          case 1751967038: {
            if (input.isAtField(FieldNames.rogueNpcId)) {
              if (!input.trySkipNullValue()) {
                rogueNpcId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 535806911: {
            if (input.isAtField(FieldNames.iNJPFALMDHJ)) {
              if (!input.trySkipNullValue()) {
                iNJPFALMDHJ = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1904002038: {
            if (input.isAtField(FieldNames.gBMDBBBMBEJ)) {
              if (!input.trySkipNullValue()) {
                gBMDBBBMBEJ = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 552830859:
          case 764736516: {
            if (input.isAtField(FieldNames.finishDialogue)) {
              if (!input.trySkipNullValue()) {
                finishDialogue = input.readBool();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1486036461: {
            if (input.isAtField(FieldNames.mNINDBMAJKL)) {
              if (!input.trySkipNullValue()) {
                mNINDBMAJKL = input.readBool();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1115149894: {
            if (input.isAtField(FieldNames.aGBFDIIKPKF)) {
              if (!input.trySkipNullValue()) {
                aGBFDIIKPKF = input.readBool();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1102985776: {
            if (input.isAtField(FieldNames.hCGOEHLPCMD)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(hCGOEHLPCMD);
                bitField0_ |= 0x00000080;
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
    public NpcRogueInfo clone() {
      return new NpcRogueInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static NpcRogueInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new NpcRogueInfo(), data).checkInitialized();
    }

    public static NpcRogueInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcRogueInfo(), input).checkInitialized();
    }

    public static NpcRogueInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcRogueInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating NpcRogueInfo messages
     */
    public static MessageFactory<NpcRogueInfo> getFactory() {
      return NpcRogueInfoFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code HCGOEHLPCMDEntry}
     */
    public static final class HCGOEHLPCMDEntry extends ProtoMessage<HCGOEHLPCMDEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 key = 1;</code>
       */
      private int key;

      /**
       * <code>optional uint32 value = 2;</code>
       */
      private int value_;

      private HCGOEHLPCMDEntry() {
      }

      /**
       * @return a new empty instance of {@code HCGOEHLPCMDEntry}
       */
      public static HCGOEHLPCMDEntry newInstance() {
        return new HCGOEHLPCMDEntry();
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return this
       */
      public HCGOEHLPCMDEntry clearKey() {
        bitField0_ &= ~0x00000001;
        key = 0;
        return this;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return the key
       */
      public int getKey() {
        return key;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public HCGOEHLPCMDEntry setKey(final int value) {
        bitField0_ |= 0x00000001;
        key = value;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return this
       */
      public HCGOEHLPCMDEntry clearValue() {
        bitField0_ &= ~0x00000002;
        value_ = 0;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return the value_
       */
      public int getValue() {
        return value_;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public HCGOEHLPCMDEntry setValue(final int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        return this;
      }

      @Override
      public HCGOEHLPCMDEntry copyFrom(final HCGOEHLPCMDEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          key = other.key;
          value_ = other.value_;
        }
        return this;
      }

      @Override
      public HCGOEHLPCMDEntry mergeFrom(final HCGOEHLPCMDEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasKey()) {
          setKey(other.key);
        }
        if (other.hasValue()) {
          setValue(other.value_);
        }
        return this;
      }

      @Override
      public HCGOEHLPCMDEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key = 0;
        value_ = 0;
        return this;
      }

      @Override
      public HCGOEHLPCMDEntry clearQuick() {
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
        if (!(o instanceof HCGOEHLPCMDEntry)) {
          return false;
        }
        HCGOEHLPCMDEntry other = (HCGOEHLPCMDEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasKey() || key == other.key)
          && (!hasValue() || value_ == other.value_);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(value_);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(value_);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public HCGOEHLPCMDEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // key
              key = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 16) {
                break;
              }
            }
            case 16: {
              // value_
              value_ = input.readUInt32();
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
          output.writeUInt32(FieldNames.key, key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeUInt32(FieldNames.value_, value_);
        }
        output.endObject();
      }

      @Override
      public HCGOEHLPCMDEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  key = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  value_ = input.readUInt32();
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
      public HCGOEHLPCMDEntry clone() {
        return new HCGOEHLPCMDEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static HCGOEHLPCMDEntry parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new HCGOEHLPCMDEntry(), data).checkInitialized();
      }

      public static HCGOEHLPCMDEntry parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new HCGOEHLPCMDEntry(), input).checkInitialized();
      }

      public static HCGOEHLPCMDEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new HCGOEHLPCMDEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating HCGOEHLPCMDEntry messages
       */
      public static MessageFactory<HCGOEHLPCMDEntry> getFactory() {
        return HCGOEHLPCMDEntryFactory.INSTANCE;
      }

      private enum HCGOEHLPCMDEntryFactory implements MessageFactory<HCGOEHLPCMDEntry> {
        INSTANCE;

        @Override
        public HCGOEHLPCMDEntry create() {
          return HCGOEHLPCMDEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName key = FieldName.forField("key");

        static final FieldName value_ = FieldName.forField("value");
      }
    }

    private enum NpcRogueInfoFactory implements MessageFactory<NpcRogueInfo> {
      INSTANCE;

      @Override
      public NpcRogueInfo create() {
        return NpcRogueInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName gENMIFOCMJA = FieldName.forField("GENMIFOCMJA");

      static final FieldName rogueNpcId = FieldName.forField("rogueNpcId", "rogue_npc_id");

      static final FieldName iNJPFALMDHJ = FieldName.forField("INJPFALMDHJ");

      static final FieldName gBMDBBBMBEJ = FieldName.forField("GBMDBBBMBEJ");

      static final FieldName finishDialogue = FieldName.forField("finishDialogue", "finish_dialogue");

      static final FieldName mNINDBMAJKL = FieldName.forField("MNINDBMAJKL");

      static final FieldName aGBFDIIKPKF = FieldName.forField("AGBFDIIKPKF");

      static final FieldName hCGOEHLPCMD = FieldName.forField("HCGOEHLPCMD");
    }
  }
}
