package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.nz0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class oo0o0Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f28134OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f28135OooO0O0;

    static {
        Charset.forName("US-ASCII");
        f28134OooO00o = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f28135OooO0O0 = bArr;
        ByteBuffer.wrap(bArr);
        nz0.OooO0o(bArr, 0, 0, false);
    }

    public static void OooO00o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int OooO0O0(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
