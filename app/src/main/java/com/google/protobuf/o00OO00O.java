package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00OO00O extends o00OO0O0 {
    @Override // com.google.protobuf.o00OO0O0
    public final void OooO00o(Object obj, long j) {
        ((Internal.ProtobufList) o0OO.f28347OooO0OO.OooOOO0(obj, j)).makeImmutable();
    }

    @Override // com.google.protobuf.o00OO0O0
    public final void OooO0O0(Object obj, Object obj2, long j) {
        o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) o0oo0oo0.OooOOO0(obj, j);
        Internal.ProtobufList protobufList = (Internal.ProtobufList) o0oo0oo0.OooOOO0(obj2, j);
        int size = protobufListMutableCopyWithCapacity2.size();
        int size2 = protobufList.size();
        if (size > 0 && size2 > 0) {
            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size2 + size);
            }
            protobufListMutableCopyWithCapacity2.addAll(protobufList);
        }
        if (size > 0) {
            protobufList = protobufListMutableCopyWithCapacity2;
        }
        o0OO.OooOOoo(obj, j, protobufList);
    }

    @Override // com.google.protobuf.o00OO0O0
    public final List OooO0OO(Object obj, long j) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) o0OO.f28347OooO0OO.OooOOO0(obj, j);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        o0OO.OooOOoo(obj, j, protobufListMutableCopyWithCapacity2);
        return protobufListMutableCopyWithCapacity2;
    }
}
