package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.w10;

/* loaded from: classes2.dex */
public final class o000O000 implements o000O0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f28090OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00 f28091OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o000oOoO f28092OooO0OO;

    public o000O000(o00 o00Var, o000oOoO o000oooo2, OooO00o oooO00o) {
        this.f28091OooO0O0 = o00Var;
        o000oooo2.getClass();
        this.f28092OooO0OO = o000oooo2;
        this.f28090OooO00o = oooO00o;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final int OooO00o(o0ooOOo o0ooooo) {
        this.f28091OooO0O0.getClass();
        o000OOo0 o000ooo02 = o0ooooo.unknownFields;
        int i = o000ooo02.f28105OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iOooOOo0 = 0;
        for (int i2 = 0; i2 < o000ooo02.f28102OooO00o; i2++) {
            int i3 = o000ooo02.f28103OooO0O0[i2] >>> 3;
            iOooOOo0 += OooOo00.OooOOo0(3, (OooOOO0) o000ooo02.f28104OooO0OO[i2]) + OooOo00.OooOoO0(i3) + OooOo00.OooOo(2) + (OooOo00.OooOo(1) * 2);
        }
        o000ooo02.f28105OooO0Oo = iOooOOo0;
        return iOooOOo0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final void OooO0O0(Object obj, o0000O00 o0000o00) {
        this.f28092OooO0OO.getClass();
        androidx.datastore.preferences.protobuf.OooO00o.OooOo(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final void OooO0OO(Object obj, w10 w10Var, Oooo0 oooo0) {
        this.f28091OooO0O0.getClass();
        o00.OooO00o(obj);
        this.f28092OooO0OO.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final boolean OooO0Oo(o0ooOOo o0ooooo, o0ooOOo o0ooooo2) {
        this.f28091OooO0O0.getClass();
        return o0ooooo.unknownFields.equals(o0ooooo2.unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final void OooO0o(Object obj, byte[] bArr, int i, int i2, OooOOOO.OooO0O0 oooO0O0) {
        o0ooOOo o0ooooo = (o0ooOOo) obj;
        if (o0ooooo.unknownFields == o000OOo0.f28101OooO0o) {
            o0ooooo.unknownFields = o000OOo0.OooO0OO();
        }
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final int OooO0o0(o0ooOOo o0ooooo) {
        this.f28091OooO0O0.getClass();
        return o0ooooo.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final boolean isInitialized(Object obj) {
        this.f28092OooO0OO.getClass();
        androidx.datastore.preferences.protobuf.OooO00o.OooOo(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final void makeImmutable(Object obj) {
        this.f28091OooO0O0.getClass();
        ((o0ooOOo) obj).unknownFields.f28106OooO0o0 = false;
        this.f28092OooO0OO.getClass();
        androidx.datastore.preferences.protobuf.OooO00o.OooOo(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final void mergeFrom(Object obj, Object obj2) {
        o000O.OooOo(this.f28091OooO0O0, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O0O0
    public final Object newInstance() {
        OooO00o oooO00o = this.f28090OooO00o;
        return oooO00o instanceof o0ooOOo ? ((o0ooOOo) oooO00o).OooOOOo() : oooO00o.OooO0OO().OooO0O0();
    }
}
