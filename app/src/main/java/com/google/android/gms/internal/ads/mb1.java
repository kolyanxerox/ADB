package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class mb1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f21187OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f21188OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f21189OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f21190OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f21191OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f21192OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean[] f21193OooO0oO = new boolean[15];

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f21194OooO0oo;

    public final void OooO00o(long j) {
        long j2 = this.f21190OooO0Oo;
        if (j2 == 0) {
            this.f21187OooO00o = j;
        } else if (j2 == 1) {
            long j3 = j - this.f21187OooO00o;
            this.f21188OooO0O0 = j3;
            this.f21191OooO0o = j3;
            this.f21192OooO0o0 = 1L;
        } else {
            long j4 = j - this.f21189OooO0OO;
            long jAbs = Math.abs(j4 - this.f21188OooO0O0);
            int i = (int) (j2 % 15);
            boolean[] zArr = this.f21193OooO0oO;
            if (jAbs <= 1000000) {
                this.f21192OooO0o0++;
                this.f21191OooO0o += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f21194OooO0oo--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f21194OooO0oo++;
            }
        }
        this.f21190OooO0Oo++;
        this.f21189OooO0OO = j;
    }

    public final void OooO0O0() {
        this.f21190OooO0Oo = 0L;
        this.f21192OooO0o0 = 0L;
        this.f21191OooO0o = 0L;
        this.f21194OooO0oo = 0;
        Arrays.fill(this.f21193OooO0oO, false);
    }

    public final boolean OooO0OO() {
        return this.f21190OooO0Oo > 15 && this.f21194OooO0oo == 0;
    }
}
