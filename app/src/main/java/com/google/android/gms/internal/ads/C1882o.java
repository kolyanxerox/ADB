package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.o */
/* loaded from: classes2.dex */
public final class C1882o implements o000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000O f21618OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0oo0000 f21619OooO0O0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public ooo0Oo0 f21624OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public o0OoOo0 f21625OooO0oo;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f21621OooO0Oo = 0;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21623OooO0o0 = 0;

    /* renamed from: OooO0o, reason: collision with root package name */
    public byte[] f21622OooO0o = i80.f19998OooO0o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final r40 f21620OooO0OO = new r40();

    public C1882o(o000O o000o, o0oo0000 o0oo0000Var) {
        this.f21618OooO00o = o000o;
        this.f21619OooO0O0 = o0oo0000Var;
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final void OooO00o(long j, int i, int i2, int i3, o000O0O0 o000o0o02) {
        if (this.f21624OooO0oO == null) {
            this.f21618OooO00o.OooO00o(j, i, i2, i3, o000o0o02);
            return;
        }
        af0.OoooOOo("DRM on subtitles is not supported", o000o0o02 == null);
        int i4 = (this.f21623OooO0o0 - i3) - i2;
        this.f21624OooO0oO.OooO0OO(i4, i2, new OooOOOO.OooO0O0(this, j, i), this.f21622OooO0o);
        int i5 = i4 + i2;
        this.f21621OooO0Oo = i5;
        if (i5 == this.f21623OooO0o0) {
            this.f21621OooO0Oo = 0;
            this.f21623OooO0o0 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final int OooO0O0(q51 q51Var, int i, boolean z) throws EOFException {
        if (this.f21624OooO0oO == null) {
            return this.f21618OooO00o.OooO0O0(q51Var, i, z);
        }
        OooO0oO(i);
        int iOooOO0 = q51Var.OooOO0(this.f21622OooO0o, this.f21623OooO0o0, i);
        if (iOooOO0 != -1) {
            this.f21623OooO0o0 += iOooOO0;
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
        OooO0o(r40Var, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final void OooO0o(r40 r40Var, int i, int i2) {
        if (this.f21624OooO0oO == null) {
            this.f21618OooO00o.OooO0o(r40Var, i, i2);
            return;
        }
        OooO0oO(i);
        r40Var.OooO0o(this.f21622OooO0o, this.f21623OooO0o0, i);
        this.f21623OooO0o0 += i;
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final void OooO0o0(o0OoOo0 o0oooo0) {
        String str = o0oooo0.f22222OooOOO0;
        str.getClass();
        af0.OoooO0(AbstractC1813m4.OooO0O0(str) == 3);
        boolean zEquals = o0oooo0.equals(this.f21625OooO0oo);
        o0oo0000 o0oo0000Var = this.f21619OooO0O0;
        if (!zEquals) {
            this.f21625OooO0oo = o0oooo0;
            this.f21624OooO0oO = o0oo0000Var.OooO0o0(o0oooo0) ? o0oo0000Var.OooO0o(o0oooo0) : null;
        }
        ooo0Oo0 ooo0oo0 = this.f21624OooO0oO;
        o000O o000o = this.f21618OooO00o;
        if (ooo0oo0 == null) {
            o000o.OooO0o0(o0oooo0);
            return;
        }
        jb1 jb1Var = new jb1(o0oooo0);
        jb1Var.OooO0OO("application/x-media3-cues");
        jb1Var.f20240OooO = o0oooo0.f22222OooOOO0;
        jb1Var.f20256OooOOo0 = LocationRequestCompat.PASSIVE_INTERVAL;
        jb1Var.f20270Oooo00O = o0oo0000Var.OooO0oo(o0oooo0);
        o000o.OooO0o0(new o0OoOo0(jb1Var));
    }

    public final void OooO0oO(int i) {
        int length = this.f21622OooO0o.length;
        int i2 = this.f21623OooO0o0;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f21621OooO0Oo;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.f21622OooO0o;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f21621OooO0Oo, bArr2, 0, i3);
        this.f21621OooO0Oo = 0;
        this.f21623OooO0o0 = i3;
        this.f21622OooO0o = bArr2;
    }
}
