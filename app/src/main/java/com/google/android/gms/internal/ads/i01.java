package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class i01 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f19888OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f19889OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final ByteBuffer f19890OooO0OO;

    static {
        Charset.forName("US-ASCII");
        f19888OooO00o = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f19889OooO0O0 = bArr;
        f19890OooO0OO = ByteBuffer.wrap(bArr);
        nz0.OooOooo(bArr, 0, 0);
    }
}
