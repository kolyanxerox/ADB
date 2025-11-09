package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class gu0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final az0 f19473OooO00o = az0.OooO00o(new byte[0]);

    public static final az0 OooO00o(int i) {
        return az0.OooO00o(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final az0 OooO0O0(int i) {
        return az0.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
