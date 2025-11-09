package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class oO0O000 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final byte[] f22563OooO0o = {0, 0, 1};

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f22564OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f22565OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f22566OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f22567OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f22568OooO0o0;

    public final void OooO00o(byte[] bArr, int i, int i2) {
        if (this.f22564OooO00o) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f22568OooO0o0;
            int length = bArr2.length;
            int i4 = this.f22566OooO0OO + i3;
            if (length < i4) {
                this.f22568OooO0o0 = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f22568OooO0o0, this.f22566OooO0OO, i3);
            this.f22566OooO0OO += i3;
        }
    }
}
