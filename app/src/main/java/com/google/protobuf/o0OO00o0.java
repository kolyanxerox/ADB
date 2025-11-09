package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class o0OO00o0 {
    public abstract UnknownFieldSetLite OooO00o(Object obj);

    public final boolean OooO0O0(int i, o000OOo o000ooo2, Object obj) throws IOException {
        int i2 = o000ooo2.f28220OooO0O0;
        int tagFieldNumber = WireFormat.getTagFieldNumber(i2);
        int tagWireType = WireFormat.getTagWireType(i2);
        if (tagWireType == 0) {
            o000ooo2.OooOo(0);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 0), Long.valueOf(o000ooo2.f28219OooO00o.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            o000ooo2.OooOo(1);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 1), Long.valueOf(o000ooo2.f28219OooO00o.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 2), o000ooo2.OooO0o0());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            o000ooo2.OooOo(5);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 5), Integer.valueOf(o000ooo2.f28219OooO00o.readFixed32()));
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i3 = i + 1;
        if (i3 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (o000ooo2.OooO00o() != Integer.MAX_VALUE && OooO0O0(i3, o000ooo2, unknownFieldSetLiteNewInstance)) {
        }
        if (iMakeTag != o000ooo2.f28220OooO0O0) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        unknownFieldSetLiteNewInstance.makeImmutable();
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 3), unknownFieldSetLiteNewInstance);
        return true;
    }

    public abstract void OooO0OO(Object obj, Object obj2);
}
