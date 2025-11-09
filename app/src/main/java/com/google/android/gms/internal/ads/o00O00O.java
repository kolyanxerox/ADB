package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o00O00O implements o00O0000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final gn0 f21761OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f21762OooO0O0;

    public o00O00O(int i, gn0 gn0Var) {
        this.f21762OooO0O0 = i;
        this.f21761OooO00o = gn0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ee A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.o00O00O OooO0O0(int r20, com.google.android.gms.internal.ads.r40 r21) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o00O00O.OooO0O0(int, com.google.android.gms.internal.ads.r40):com.google.android.gms.internal.ads.o00O00O");
    }

    public final o00O0000 OooO00o(Class cls) {
        gn0 gn0Var = this.f21761OooO00o;
        int i = gn0Var.f19390OooOoO0;
        int i2 = 0;
        while (i2 < i) {
            o00O0000 o00o0000 = (o00O0000) gn0Var.get(i2);
            i2++;
            if (o00o0000.getClass() == cls) {
                return o00o0000;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o00O0000
    public final int zza() {
        return this.f21762OooO0O0;
    }
}
