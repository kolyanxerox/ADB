package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class oO00O0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f26684OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f26685OooO0O0;

    static {
        Charset.forName("US-ASCII");
        f26684OooO00o = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f26685OooO0O0 = bArr;
        ByteBuffer.wrap(bArr);
    }
}
