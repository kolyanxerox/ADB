package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class oOo0o0oO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f22923OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f22924OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f22925OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f22926OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public Object f22927OooO0o0;

    public oOo0o0oO(r51 r51Var) {
        this.f22927OooO0o0 = r51Var;
    }

    public void OooO00o(int i) {
        this.f22923OooO00o = 1 == ((this.f22923OooO00o ? 1 : 0) | i);
        this.f22924OooO0O0 += i;
    }

    public void OooO0O0(byte[] bArr, int i, int i2) {
        if (this.f22923OooO00o) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f22927OooO0o0;
            int length = bArr2.length;
            int i4 = this.f22926OooO0Oo + i3;
            if (length < i4) {
                this.f22927OooO0o0 = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, (byte[]) this.f22927OooO0o0, this.f22926OooO0Oo, i3);
            this.f22926OooO0Oo += i3;
        }
    }

    public void OooO0OO() {
        this.f22923OooO00o = false;
        this.f22925OooO0OO = false;
    }

    public void OooO0Oo(int i) {
        af0.OooooO0(!this.f22923OooO00o);
        boolean z = i == this.f22924OooO0O0;
        this.f22923OooO00o = z;
        if (z) {
            this.f22926OooO0Oo = 3;
            this.f22925OooO0OO = false;
        }
    }

    public boolean OooO0o0(int i) {
        if (!this.f22923OooO00o) {
            return false;
        }
        this.f22926OooO0Oo -= i;
        this.f22923OooO00o = false;
        this.f22925OooO0OO = true;
        return true;
    }

    public oOo0o0oO(int i) {
        this.f22924OooO0O0 = i;
        byte[] bArr = new byte[131];
        this.f22927OooO0o0 = bArr;
        bArr[2] = 1;
    }
}
