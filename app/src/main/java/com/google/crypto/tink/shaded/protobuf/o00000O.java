package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public final class o00000O extends o00000OO {
    @Override // com.google.crypto.tink.shaded.protobuf.o00000OO
    public final void OooO00o(Object obj, long j) {
        ((OooO0O0) ((o0OO00O) oOO00O.f28126OooO0OO.OooO(obj, j))).f28011OooOo0O = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000OO
    public final void OooO0O0(Object obj, Object obj2, long j) {
        o00O00O o00o00o = oOO00O.f28126OooO0OO;
        o0OO00O o0oo00oMutableCopyWithCapacity = (o0OO00O) o00o00o.OooO(obj, j);
        o0OO00O o0oo00o = (o0OO00O) o00o00o.OooO(obj2, j);
        int size = o0oo00oMutableCopyWithCapacity.size();
        int size2 = o0oo00o.size();
        if (size > 0 && size2 > 0) {
            if (!((OooO0O0) o0oo00oMutableCopyWithCapacity).f28011OooOo0O) {
                o0oo00oMutableCopyWithCapacity = o0oo00oMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            o0oo00oMutableCopyWithCapacity.addAll(o0oo00o);
        }
        if (size > 0) {
            o0oo00o = o0oo00oMutableCopyWithCapacity;
        }
        oOO00O.OooOOOo(obj, j, o0oo00o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000OO
    public final List OooO0OO(Object obj, long j) {
        o0OO00O o0oo00o = (o0OO00O) oOO00O.f28126OooO0OO.OooO(obj, j);
        if (((OooO0O0) o0oo00o).f28011OooOo0O) {
            return o0oo00o;
        }
        int size = o0oo00o.size();
        o0OO00O o0oo00oMutableCopyWithCapacity = o0oo00o.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        oOO00O.OooOOOo(obj, j, o0oo00oMutableCopyWithCapacity);
        return o0oo00oMutableCopyWithCapacity;
    }
}
