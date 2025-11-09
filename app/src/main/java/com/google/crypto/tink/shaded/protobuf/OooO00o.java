package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class OooO00o implements o0000O {
    protected int memoizedHashCode;

    public abstract int OooO00o(o000O0O0 o000o0o02);

    public final String OooO0O0(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract oo000o OooO0OO();

    public final byte[] OooO0Oo() {
        try {
            int iOooO00o = ((o0ooOOo) this).OooO00o(null);
            byte[] bArr = new byte[iOooO00o];
            OooOo00 oooOo00 = new OooOo00(bArr, iOooO00o);
            OooO0o0(oooOo00);
            if (iOooO00o - oooOo00.f28039OooO0o == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(OooO0O0("byte array"), e);
        }
    }

    public abstract void OooO0o0(OooOo00 oooOo00);
}
