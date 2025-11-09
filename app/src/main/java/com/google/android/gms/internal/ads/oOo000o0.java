package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class oOo000o0 {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final byte[] f22868OooO0o0 = {0, 0, 1};

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f22869OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f22870OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f22871OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f22872OooO0Oo;

    public final void OooO00o(byte[] bArr, int i, int i2) {
        if (this.f22869OooO00o) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f22872OooO0Oo;
            int length = bArr2.length;
            int i4 = this.f22870OooO0O0 + i3;
            if (length < i4) {
                this.f22872OooO0Oo = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f22872OooO0Oo, this.f22870OooO0O0, i3);
            this.f22870OooO0O0 += i3;
        }
    }
}
