package com.google.protobuf;

import com.google.protobuf.Internal;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public abstract class OooOOO0 {
    public static int OooO(byte[] bArr, int i, Internal.ProtobufList protobufList, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        o00O0O0 o00o0o0 = (o00O0O0) protobufList;
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o + iOooOOo;
        while (iOooOOo < i2) {
            o00o0o0.addInt(OooO0O0(bArr, iOooOOo));
            iOooOOo += 4;
        }
        if (iOooOOo == i2) {
            return iOooOOo;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int OooO00o(byte[] bArr, int i, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iOooOOo) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            oooOO0O.f28165OooO0OO = ByteString.EMPTY;
            return iOooOOo;
        }
        oooOO0O.f28165OooO0OO = ByteString.copyFrom(bArr, iOooOOo, i2);
        return iOooOOo + i2;
    }

    public static int OooO0O0(byte[] bArr, int i) {
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (bArr[i] & ForkServer.ERROR) | ((bArr[i + 1] & ForkServer.ERROR) << 8) | ((bArr[i + 2] & ForkServer.ERROR) << 16);
    }

    public static long OooO0OO(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int OooO0Oo(o0oO0O0o o0oo0o0o, byte[] bArr, int i, int i2, int i3, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        Object objNewInstance = o0oo0o0o.newInstance();
        int iOooOo0 = OooOo0(objNewInstance, o0oo0o0o, bArr, i, i2, i3, oooOO0O);
        o0oo0o0o.makeImmutable(objNewInstance);
        oooOO0O.f28165OooO0OO = objNewInstance;
        return iOooOo0;
    }

    public static int OooO0o(o0oO0O0o o0oo0o0o, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        int iOooO0o0 = OooO0o0(o0oo0o0o, bArr, i2, i3, oooOO0O);
        protobufList.add(oooOO0O.f28165OooO0OO);
        while (iOooO0o0 < i3) {
            int iOooOOo = OooOOo(bArr, iOooO0o0, oooOO0O);
            if (i != oooOO0O.f28163OooO00o) {
                break;
            }
            iOooO0o0 = OooO0o0(o0oo0o0o, bArr, iOooOOo, i3, oooOO0O);
            protobufList.add(oooOO0O.f28165OooO0OO);
        }
        return iOooO0o0;
    }

    public static int OooO0o0(o0oO0O0o o0oo0o0o, byte[] bArr, int i, int i2, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        Object objNewInstance = o0oo0o0o.newInstance();
        int iOooOo0O = OooOo0O(objNewInstance, o0oo0o0o, bArr, i, i2, oooOO0O);
        o0oo0o0o.makeImmutable(objNewInstance);
        oooOO0O.f28165OooO0OO = objNewInstance;
        return iOooOo0O;
    }

    public static int OooO0oO(byte[] bArr, int i, Internal.ProtobufList protobufList, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        OooOOOO oooOOOO = (OooOOOO) protobufList;
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o + iOooOOo;
        while (iOooOOo < i2) {
            iOooOOo = OooOo00(bArr, iOooOOo, oooOO0O);
            oooOOOO.addBoolean(oooOO0O.f28164OooO0O0 != 0);
        }
        if (iOooOOo == i2) {
            return iOooOOo;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int OooO0oo(byte[] bArr, int i, Internal.ProtobufList protobufList, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        o0000O0 o0000o02 = (o0000O0) protobufList;
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o + iOooOOo;
        while (iOooOOo < i2) {
            o0000o02.addDouble(Double.longBitsToDouble(OooO0OO(bArr, iOooOOo)));
            iOooOOo += 8;
        }
        if (iOooOOo == i2) {
            return iOooOOo;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int OooOO0(byte[] bArr, int i, Internal.ProtobufList protobufList, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        oo0O oo0o = (oo0O) protobufList;
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o + iOooOOo;
        while (iOooOOo < i2) {
            oo0o.addLong(OooO0OO(bArr, iOooOOo));
            iOooOOo += 8;
        }
        if (iOooOOo == i2) {
            return iOooOOo;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int OooOO0O(byte[] bArr, int i, Internal.ProtobufList protobufList, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        o00O00O o00o00o = (o00O00O) protobufList;
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o + iOooOOo;
        while (iOooOOo < i2) {
            o00o00o.addFloat(Float.intBitsToFloat(OooO0O0(bArr, iOooOOo)));
            iOooOOo += 4;
        }
        if (iOooOOo == i2) {
            return iOooOOo;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int OooOO0o(byte[] bArr, int i, Internal.ProtobufList protobufList, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        o00O0O0 o00o0o0 = (o00O0O0) protobufList;
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o + iOooOOo;
        while (iOooOOo < i2) {
            iOooOOo = OooOOo(bArr, iOooOOo, oooOO0O);
            o00o0o0.addInt(CodedInputStream.decodeZigZag32(oooOO0O.f28163OooO00o));
        }
        if (iOooOOo == i2) {
            return iOooOOo;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int OooOOO(byte[] bArr, int i, Internal.ProtobufList protobufList, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        o00O0O0 o00o0o0 = (o00O0O0) protobufList;
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o + iOooOOo;
        while (iOooOOo < i2) {
            iOooOOo = OooOOo(bArr, iOooOOo, oooOO0O);
            o00o0o0.addInt(oooOO0O.f28163OooO00o);
        }
        if (iOooOOo == i2) {
            return iOooOOo;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int OooOOO0(byte[] bArr, int i, Internal.ProtobufList protobufList, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        oo0O oo0o = (oo0O) protobufList;
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o + iOooOOo;
        while (iOooOOo < i2) {
            iOooOOo = OooOo00(bArr, iOooOOo, oooOO0O);
            oo0o.addLong(CodedInputStream.decodeZigZag64(oooOO0O.f28164OooO0O0));
        }
        if (iOooOOo == i2) {
            return iOooOOo;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int OooOOOO(byte[] bArr, int i, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        int iOooOOo = OooOOo(bArr, i, oooOO0O);
        int i2 = oooOO0O.f28163OooO00o;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            oooOO0O.f28165OooO0OO = "";
            return iOooOOo;
        }
        oooOO0O.f28165OooO0OO = new String(bArr, iOooOOo, i2, Internal.UTF_8);
        return iOooOOo + i2;
    }

    public static int OooOOOo(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int iOooOo00 = OooOo00(bArr, i2, oooOO0O);
            unknownFieldSetLite.storeField(i, Long.valueOf(oooOO0O.f28164OooO0O0));
            return iOooOo00;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i, Long.valueOf(OooO0OO(bArr, i2)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int iOooOOo = OooOOo(bArr, i2, oooOO0O);
            int i4 = oooOO0O.f28163OooO00o;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - iOooOOo) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                unknownFieldSetLite.storeField(i, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i, ByteString.copyFrom(bArr, iOooOOo, i4));
            }
            return iOooOOo + i4;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i, Integer.valueOf(OooO0O0(bArr, i2)));
            return i2 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i5 = (i & (-8)) | 4;
        int i6 = oooOO0O.f28167OooO0o0 + 1;
        oooOO0O.f28167OooO0o0 = i6;
        if (i6 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iOooOOo2 = OooOOo(bArr, i2, oooOO0O);
            i7 = oooOO0O.f28163OooO00o;
            if (i7 == i5) {
                i2 = iOooOOo2;
                break;
            }
            i2 = OooOOOo(i7, bArr, iOooOOo2, i3, unknownFieldSetLiteNewInstance, oooOO0O);
        }
        oooOO0O.f28167OooO0o0--;
        if (i2 > i3 || i7 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, unknownFieldSetLiteNewInstance);
        return i2;
    }

    public static int OooOOo(byte[] bArr, int i, OooOO0O oooOO0O) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return OooOOo0(b, bArr, i2, oooOO0O);
        }
        oooOO0O.f28163OooO00o = b;
        return i2;
    }

    public static int OooOOo0(int i, byte[] bArr, int i2, OooOO0O oooOO0O) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            oooOO0O.f28163OooO00o = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            oooOO0O.f28163OooO00o = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            oooOO0O.f28163OooO00o = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            oooOO0O.f28163OooO00o = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                oooOO0O.f28163OooO00o = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int OooOOoo(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, OooOO0O oooOO0O) {
        o00O0O0 o00o0o0 = (o00O0O0) protobufList;
        int iOooOOo = OooOOo(bArr, i2, oooOO0O);
        o00o0o0.addInt(oooOO0O.f28163OooO00o);
        while (iOooOOo < i3) {
            int iOooOOo2 = OooOOo(bArr, iOooOOo, oooOO0O);
            if (i != oooOO0O.f28163OooO00o) {
                break;
            }
            iOooOOo = OooOOo(bArr, iOooOOo2, oooOO0O);
            o00o0o0.addInt(oooOO0O.f28163OooO00o);
        }
        return iOooOOo;
    }

    public static int OooOo0(Object obj, o0oO0O0o o0oo0o0o, byte[] bArr, int i, int i2, int i3, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        o0oOOo o0oooo = (o0oOOo) o0oo0o0o;
        int i4 = oooOO0O.f28167OooO0o0 + 1;
        oooOO0O.f28167OooO0o0 = i4;
        if (i4 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iOooOooo = o0oooo.OooOooo(obj, bArr, i, i2, i3, oooOO0O);
        oooOO0O.f28167OooO0o0--;
        oooOO0O.f28165OooO0OO = obj;
        return iOooOooo;
    }

    public static int OooOo00(byte[] bArr, int i, OooOO0O oooOO0O) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            oooOO0O.f28164OooO0O0 = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        oooOO0O.f28164OooO0O0 = j2;
        return i3;
    }

    public static int OooOo0O(Object obj, o0oO0O0o o0oo0o0o, byte[] bArr, int i, int i2, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        int iOooOOo0 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iOooOOo0 = OooOOo0(i3, bArr, iOooOOo0, oooOO0O);
            i3 = oooOO0O.f28163OooO00o;
        }
        int i4 = iOooOOo0;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = oooOO0O.f28167OooO0o0 + 1;
        oooOO0O.f28167OooO0o0 = i5;
        if (i5 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i6 = i4 + i3;
        o0oo0o0o.OooO0Oo(obj, bArr, i4, i6, oooOO0O);
        oooOO0O.f28167OooO0o0--;
        oooOO0O.f28165OooO0OO = obj;
        return i6;
    }

    public static int OooOo0o(int i, byte[] bArr, int i2, int i3, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return OooOo00(bArr, i2, oooOO0O);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return OooOOo(bArr, i2, oooOO0O) + oooOO0O.f28163OooO00o;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = OooOOo(bArr, i2, oooOO0O);
            i5 = oooOO0O.f28163OooO00o;
            if (i5 == i4) {
                break;
            }
            i2 = OooOo0o(i5, bArr, i2, i3, oooOO0O);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }
}
