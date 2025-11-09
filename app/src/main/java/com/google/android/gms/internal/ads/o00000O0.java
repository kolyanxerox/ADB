package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class o00000O0 implements o000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f21653OooO00o = new byte[4096];

    @Override // com.google.android.gms.internal.ads.o000O
    public final void OooO00o(long j, int i, int i2, int i3, o000O0O0 o000o0o02) {
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final int OooO0O0(q51 q51Var, int i, boolean z) throws EOFException {
        int iOooOO0 = q51Var.OooOO0(this.f21653OooO00o, 0, Math.min(4096, i));
        if (iOooOO0 != -1) {
            return iOooOO0;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final int OooO0OO(q51 q51Var, int i, boolean z) {
        return OooO0O0(q51Var, i, z);
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final void OooO0Oo(int i, r40 r40Var) {
        r40Var.OooOO0O(i);
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final void OooO0o(r40 r40Var, int i, int i2) {
        r40Var.OooOO0O(i);
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final void OooO0o0(o0OoOo0 o0oooo0) {
    }
}
