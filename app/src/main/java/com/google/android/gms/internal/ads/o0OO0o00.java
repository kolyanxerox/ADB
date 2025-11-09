package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o0OO0o00 implements o0OOO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final long f22105OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0OOO00 f22106OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final long f22107OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f22108OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final o0OOOO00 f22109OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public long f22110OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public long f22111OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public long f22112OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public long f22113OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public long f22114OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public long f22115Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public long f22116Oooo00O;

    public o0OO0o00(o0OOOO00 o0oooo00, long j, long j2, long j3, long j4, boolean z) {
        af0.OoooO0(j >= 0 && j2 > j);
        this.f22109OooOoO0 = o0oooo00;
        this.f22107OooOo0o = j;
        this.f22105OooOo = j2;
        if (j3 == j2 - j || z) {
            this.f22110OooOoOO = j4;
            this.f22108OooOoO = 4;
        } else {
            this.f22108OooOoO = 0;
        }
        this.f22106OooOo0O = new o0OOO00();
    }

    @Override // com.google.android.gms.internal.ads.o0OOO0
    public final void OooO0Oo(long j) {
        this.f22111OooOoo = Math.max(0L, Math.min(j, this.f22110OooOoOO - 1));
        this.f22108OooOoO = 2;
        this.f22113OooOooO = this.f22107OooOo0o;
        this.f22114OooOooo = this.f22105OooOo;
        this.f22115Oooo000 = 0L;
        this.f22116Oooo00O = this.f22110OooOoOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    @Override // com.google.android.gms.internal.ads.o0OOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooOO0O(com.google.android.gms.internal.ads.o000000 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0OO0o00.OooOO0O(com.google.android.gms.internal.ads.o000000):long");
    }

    @Override // com.google.android.gms.internal.ads.o0OOO0
    public final /* bridge */ /* synthetic */ o000O00 zze() {
        if (this.f22110OooOoOO != 0) {
            return new o0OOooO0(this);
        }
        return null;
    }
}
