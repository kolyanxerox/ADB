package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class az0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f17140OooO00o;

    public az0(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f17140OooO00o = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static az0 OooO00o(byte[] bArr) {
        if (bArr != null) {
            return new az0(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] OooO0O0() {
        byte[] bArr = this.f17140OooO00o;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof az0) {
            return Arrays.equals(((az0) obj).f17140OooO00o, this.f17140OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17140OooO00o);
    }

    public final String toString() {
        byte[] bArr = this.f17140OooO00o;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & ForkServer.ERROR) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return OooO0oO.OooOo.OooOO0O("Bytes(", sb.toString(), ")");
    }
}
