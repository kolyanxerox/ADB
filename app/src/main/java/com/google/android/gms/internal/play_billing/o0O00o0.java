package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class o0O00o0 {
    protected int zza;

    public abstract int OooO00o(o0OO000o o0oo000o);

    public final byte[] OooO0O0() {
        try {
            o0OoO00O o0ooo00o = (o0OoO00O) this;
            int iOooO0o0 = o0ooo00o.OooO0o0();
            byte[] bArr = new byte[iOooO0o0];
            o0O0000O o0o0000o = new o0O0000O(bArr, iOooO0o0);
            o0OO000o o0oo000oOooO00o = o0O0oo00.f27130OooO0OO.OooO00o(o0ooo00o.getClass());
            o0O0O0o0 o0o0o0o0 = o0o0000o.f27084OooOo0o;
            if (o0o0o0o0 == null) {
                o0o0o0o0 = new o0O0O0o0(o0o0000o);
            }
            o0oo000oOooO00o.OooO0oO(o0ooo00o, o0o0o0o0);
            if (iOooO0o0 - o0o0000o.f27085OooOoO == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(OooO0oO.OooOo.OooOO0O("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
