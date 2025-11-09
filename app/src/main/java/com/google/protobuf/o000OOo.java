package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class o000OOo {

    /* renamed from: OooO00o */
    public final CodedInputStream f28219OooO00o;

    /* renamed from: OooO0O0 */
    public int f28220OooO0O0;

    /* renamed from: OooO0OO */
    public int f28221OooO0OO;

    /* renamed from: OooO0Oo */
    public int f28222OooO0Oo = 0;

    public o000OOo(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.f28219OooO00o = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static void OooOoO(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static void OooOoOO(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final Object OooO(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i = o0O0O00.f28310OooO00o[fieldType.ordinal()];
        CodedInputStream codedInputStream = this.f28219OooO00o;
        switch (i) {
            case 1:
                OooOo(0);
                return Boolean.valueOf(codedInputStream.readBool());
            case 2:
                return OooO0o0();
            case 3:
                OooOo(1);
                return Double.valueOf(codedInputStream.readDouble());
            case 4:
                OooOo(0);
                return Integer.valueOf(codedInputStream.readEnum());
            case 5:
                OooOo(5);
                return Integer.valueOf(codedInputStream.readFixed32());
            case 6:
                OooOo(1);
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                OooOo(5);
                return Float.valueOf(codedInputStream.readFloat());
            case 8:
                OooOo(0);
                return Integer.valueOf(codedInputStream.readInt32());
            case 9:
                OooOo(0);
                return Long.valueOf(codedInputStream.readInt64());
            case 10:
                return OooOOOO(cls, extensionRegistryLite);
            case 11:
                OooOo(5);
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                OooOo(1);
                return Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                OooOo(0);
                return Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                OooOo(0);
                return Long.valueOf(codedInputStream.readSInt64());
            case 15:
                OooOo(2);
                return codedInputStream.readStringRequireUtf8();
            case 16:
                OooOo(0);
                return Integer.valueOf(codedInputStream.readUInt32());
            case 17:
                OooOo(0);
                return Long.valueOf(codedInputStream.readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final int OooO00o() {
        int i = this.f28222OooO0Oo;
        if (i != 0) {
            this.f28220OooO0O0 = i;
            this.f28222OooO0Oo = 0;
        } else {
            this.f28220OooO0O0 = this.f28219OooO00o.readTag();
        }
        int i2 = this.f28220OooO0O0;
        if (i2 == 0 || i2 == this.f28221OooO0OO) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.getTagFieldNumber(i2);
    }

    public final void OooO0O0(Object obj, o0oO0O0o o0oo0o0o, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.f28221OooO0OO;
        this.f28221OooO0OO = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.f28220OooO0O0), 4);
        try {
            o0oo0o0o.OooO0OO(obj, this, extensionRegistryLite);
            if (this.f28220OooO0O0 == this.f28221OooO0OO) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.f28221OooO0OO = i;
        }
    }

    public final void OooO0OO(Object obj, o0oO0O0o o0oo0o0o, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        CodedInputStream codedInputStream = this.f28219OooO00o;
        int uInt32 = codedInputStream.readUInt32();
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = codedInputStream.pushLimit(uInt32);
        codedInputStream.recursionDepth++;
        o0oo0o0o.OooO0OO(obj, this, extensionRegistryLite);
        codedInputStream.checkLastTagWas(0);
        codedInputStream.recursionDepth--;
        codedInputStream.popLimit(iPushLimit);
    }

    public final void OooO0Oo(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof OooOOOO;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.readBool()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Boolean.valueOf(codedInputStream.readBool()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            OooOo0o(totalBytesRead);
            return;
        }
        OooOOOO oooOOOO = (OooOOOO) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 0) {
            do {
                oooOOOO.addBoolean(codedInputStream.readBool());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            oooOOOO.addBoolean(codedInputStream.readBool());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        OooOo0o(totalBytesRead2);
    }

    public final void OooO0o(List list) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.f28220OooO0O0) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(OooO0o0());
            CodedInputStream codedInputStream = this.f28219OooO00o;
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == this.f28220OooO0O0);
        this.f28222OooO0Oo = tag;
    }

    public final ByteString OooO0o0() throws InvalidProtocolBufferException.InvalidWireTypeException {
        OooOo(2);
        return this.f28219OooO00o.readBytes();
    }

    public final void OooO0oO(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof o0000O0;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.readDouble()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = codedInputStream.readUInt32();
            OooOoOO(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(codedInputStream.readDouble()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        o0000O0 o0000o02 = (o0000O0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 1) {
            do {
                o0000o02.addDouble(codedInputStream.readDouble());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt322 = codedInputStream.readUInt32();
        OooOoOO(uInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
        do {
            o0000o02.addDouble(codedInputStream.readDouble());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void OooO0oo(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof o00O0O0;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readEnum()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readEnum()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            OooOo0o(totalBytesRead);
            return;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 0) {
            do {
                o00o0o0.addInt(codedInputStream.readEnum());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            o00o0o0.addInt(codedInputStream.readEnum());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        OooOo0o(totalBytesRead2);
    }

    public final void OooOO0(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof o00O0O0;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                OooOoO(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag;
            return;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 2) {
            int uInt322 = codedInputStream.readUInt32();
            OooOoO(uInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
            do {
                o00o0o0.addInt(codedInputStream.readFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            o00o0o0.addInt(codedInputStream.readFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f28220OooO0O0);
        this.f28222OooO0Oo = tag2;
    }

    public final void OooOO0O(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof oo0O;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = codedInputStream.readUInt32();
            OooOoOO(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        oo0O oo0o = (oo0O) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 1) {
            do {
                oo0o.addLong(codedInputStream.readFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt322 = codedInputStream.readUInt32();
        OooOoOO(uInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
        do {
            oo0o.addLong(codedInputStream.readFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void OooOO0o(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof o00O00O;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                OooOoO(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(codedInputStream.readFloat()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(codedInputStream.readFloat()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag;
            return;
        }
        o00O00O o00o00o = (o00O00O) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 2) {
            int uInt322 = codedInputStream.readUInt32();
            OooOoO(uInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
            do {
                o00o00o.addFloat(codedInputStream.readFloat());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            o00o00o.addFloat(codedInputStream.readFloat());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f28220OooO0O0);
        this.f28222OooO0Oo = tag2;
    }

    public final void OooOOO(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof oo0O;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            OooOo0o(totalBytesRead);
            return;
        }
        oo0O oo0o = (oo0O) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 0) {
            do {
                oo0o.addLong(codedInputStream.readInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            oo0o.addLong(codedInputStream.readInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        OooOo0o(totalBytesRead2);
    }

    public final void OooOOO0(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof o00O0O0;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            OooOo0o(totalBytesRead);
            return;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 0) {
            do {
                o00o0o0.addInt(codedInputStream.readInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            o00o0o0.addInt(codedInputStream.readInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        OooOo0o(totalBytesRead2);
    }

    public final Object OooOOOO(Class cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        OooOo(2);
        o0oO0O0o o0oo0o0oOooO00o = o0O00O.f28290OooO0OO.OooO00o(cls);
        Object objNewInstance = o0oo0o0oOooO00o.newInstance();
        OooO0OO(objNewInstance, o0oo0o0oOooO00o, extensionRegistryLite);
        o0oo0o0oOooO00o.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    public final void OooOOOo(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof o00O0O0;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                OooOoO(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag;
            return;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 2) {
            int uInt322 = codedInputStream.readUInt32();
            OooOoO(uInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
            do {
                o00o0o0.addInt(codedInputStream.readSFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            o00o0o0.addInt(codedInputStream.readSFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f28220OooO0O0);
        this.f28222OooO0Oo = tag2;
    }

    public final void OooOOo(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof o00O0O0;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readSInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readSInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            OooOo0o(totalBytesRead);
            return;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 0) {
            do {
                o00o0o0.addInt(codedInputStream.readSInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            o00o0o0.addInt(codedInputStream.readSInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        OooOo0o(totalBytesRead2);
    }

    public final void OooOOo0(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof oo0O;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = codedInputStream.readUInt32();
            OooOoOO(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readSFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        oo0O oo0o = (oo0O) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 1) {
            do {
                oo0o.addLong(codedInputStream.readSFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt322 = codedInputStream.readUInt32();
        OooOoOO(uInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
        do {
            oo0o.addLong(codedInputStream.readSFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void OooOOoo(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof oo0O;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readSInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            OooOo0o(totalBytesRead);
            return;
        }
        oo0O oo0o = (oo0O) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 0) {
            do {
                oo0o.addLong(codedInputStream.readSInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            oo0o.addLong(codedInputStream.readSInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        OooOo0o(totalBytesRead2);
    }

    public final void OooOo(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (WireFormat.getTagWireType(this.f28220OooO0O0) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final void OooOo0(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof o00O0O0;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readUInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readUInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            OooOo0o(totalBytesRead);
            return;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 0) {
            do {
                o00o0o0.addInt(codedInputStream.readUInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            o00o0o0.addInt(codedInputStream.readUInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        OooOo0o(totalBytesRead2);
    }

    public final void OooOo00(List list, boolean z) throws IOException {
        String string;
        int tag;
        int tag2;
        if (WireFormat.getTagWireType(this.f28220OooO0O0) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z2 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (z2 && !z) {
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.add(OooO0o0());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        do {
            if (z) {
                OooOo(2);
                string = codedInputStream.readStringRequireUtf8();
            } else {
                OooOo(2);
                string = codedInputStream.readString();
            }
            list.add(string);
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == this.f28220OooO0O0);
        this.f28222OooO0Oo = tag;
    }

    public final void OooOo0O(List list) throws IOException {
        int tag;
        int tag2;
        boolean z = list instanceof oo0O;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.f28220OooO0O0);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readUInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f28220OooO0O0);
                this.f28222OooO0Oo = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readUInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            OooOo0o(totalBytesRead);
            return;
        }
        oo0O oo0o = (oo0O) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f28220OooO0O0);
        if (tagWireType2 == 0) {
            do {
                oo0o.addLong(codedInputStream.readUInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f28220OooO0O0);
            this.f28222OooO0Oo = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            oo0o.addLong(codedInputStream.readUInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        OooOo0o(totalBytesRead2);
    }

    public final void OooOo0o(int i) throws InvalidProtocolBufferException {
        if (this.f28219OooO00o.getTotalBytesRead() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final boolean OooOoO0() {
        int i;
        CodedInputStream codedInputStream = this.f28219OooO00o;
        if (codedInputStream.isAtEnd() || (i = this.f28220OooO0O0) == this.f28221OooO0OO) {
            return false;
        }
        return codedInputStream.skipField(i);
    }
}
