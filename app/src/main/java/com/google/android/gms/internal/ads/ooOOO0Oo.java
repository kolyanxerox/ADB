package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ooOOO0Oo implements InterfaceC1893oO {

    /* renamed from: OooO, reason: collision with root package name */
    public int f23047OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oOo0000O f23048OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo0 f23049OooO0O0 = new o000OOo0(new byte[10], 10);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f23050OooO0OO = 0;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f23051OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public boolean f23052OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public h70 f23053OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public boolean f23054OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public boolean f23055OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f23056OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f23057OooOO0O;

    public ooOOO0Oo(oOo0000O ooo0000o) {
        this.f23048OooO00o = ooo0000o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1893oO
    public final void OooO00o(h70 h70Var, o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        this.f23053OooO0o0 = h70Var;
        this.f23048OooO00o.OooO0Oo(o0000ooo, ooo00o00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.o000OOo0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.oOo0000O] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // com.google.android.gms.internal.ads.InterfaceC1893oO
    public final void OooO0O0(int i, r40 r40Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        long jOooO0O0;
        long j;
        int i6;
        af0.OooOo0O(this.f23053OooO0o0);
        int i7 = i & 1;
        ?? r3 = this.f23048OooO00o;
        int i8 = -1;
        int i9 = 2;
        ?? r8 = 0;
        if (i7 != 0) {
            int i10 = this.f23050OooO0OO;
            if (i10 != 0 && i10 != 1) {
                if (i10 != 2) {
                    int i11 = this.f23056OooOO0;
                    if (i11 != -1) {
                        AbstractC1641hg.OooOOo0("PesReader", "Unexpected start indicator: expected " + i11 + " more bytes");
                    }
                    r3.OooO00o(r40Var.f23747OooO0OO == 0);
                } else {
                    AbstractC1641hg.OooOOo0("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f23050OooO0OO = 1;
            this.f23051OooO0Oo = 0;
        }
        int i12 = i;
        while (r40Var.OooOOOO() > 0) {
            int i13 = this.f23050OooO0OO;
            if (i13 != 0) {
                ?? r10 = this.f23049OooO0O0;
                if (i13 != 1) {
                    if (i13 != i9) {
                        int iOooOOOO = r40Var.OooOOOO();
                        int i14 = this.f23056OooOO0;
                        int i15 = i14 == i8 ? r8 : iOooOOOO - i14;
                        if (i15 > 0) {
                            iOooOOOO -= i15;
                            r40Var.OooO(r40Var.f23746OooO0O0 + iOooOOOO);
                        }
                        r3.OooO0O0(r40Var);
                        int i16 = this.f23056OooOO0;
                        if (i16 != i8) {
                            int i17 = i16 - iOooOOOO;
                            this.f23056OooOO0 = i17;
                            if (i17 == 0) {
                                r3.OooO00o(r8);
                                this.f23050OooO0OO = 1;
                                this.f23051OooO0Oo = r8;
                            }
                        }
                    } else {
                        if (OooO0OO(r40Var, r10.f21725OooO0O0, Math.min(10, this.f23047OooO)) && OooO0OO(r40Var, null, this.f23047OooO)) {
                            r10.OooOOoo(r8);
                            if (this.f23052OooO0o) {
                                r10.OooOo0(4);
                                long jOooO0o = r10.OooO0o(3);
                                r10.OooOo0(1);
                                int iOooO0o = r10.OooO0o(15) << 15;
                                r10.OooOo0(1);
                                long jOooO0o2 = r10.OooO0o(15);
                                r10.OooOo0(1);
                                if (this.f23055OooO0oo || !this.f23054OooO0oO) {
                                    j = jOooO0o;
                                    i6 = iOooO0o;
                                } else {
                                    r10.OooOo0(4);
                                    j = jOooO0o;
                                    r10.OooOo0(1);
                                    int iOooO0o2 = r10.OooO0o(15) << 15;
                                    r10.OooOo0(1);
                                    long jOooO0o3 = r10.OooO0o(15);
                                    r10.OooOo0(1);
                                    i6 = iOooO0o;
                                    this.f23053OooO0o0.OooO0O0((r10.OooO0o(3) << 30) | iOooO0o2 | jOooO0o3);
                                    this.f23055OooO0oo = true;
                                }
                                jOooO0O0 = this.f23053OooO0o0.OooO0O0(jOooO0o2 | (j << 30) | i6);
                            } else {
                                jOooO0O0 = -9223372036854775807L;
                            }
                            i12 |= true != this.f23057OooOO0O ? 0 : 4;
                            r3.OooO0OO(i12, jOooO0O0);
                            this.f23050OooO0OO = 3;
                            this.f23051OooO0Oo = 0;
                            r8 = 0;
                            i8 = -1;
                            i9 = 2;
                        }
                    }
                    i2 = i8;
                    i3 = r8;
                    i4 = i9;
                } else {
                    i3 = r8;
                    if (OooO0OO(r40Var, r10.f21725OooO0O0, 9)) {
                        r10.OooOOoo(i3);
                        int iOooO0o3 = r10.OooO0o(24);
                        if (iOooO0o3 != 1) {
                            androidx.datastore.preferences.protobuf.OooO00o.OooOo00(iOooO0o3, "Unexpected start code prefix: ", "PesReader");
                            this.f23056OooOO0 = -1;
                            i2 = -1;
                            i5 = 0;
                            i4 = 2;
                        } else {
                            r10.OooOo0(8);
                            int iOooO0o4 = r10.OooO0o(16);
                            r10.OooOo0(5);
                            this.f23057OooOO0O = r10.OooOo0o();
                            i4 = 2;
                            r10.OooOo0(2);
                            this.f23052OooO0o = r10.OooOo0o();
                            this.f23054OooO0oO = r10.OooOo0o();
                            r10.OooOo0(6);
                            int iOooO0o5 = r10.OooO0o(8);
                            this.f23047OooO = iOooO0o5;
                            i2 = -1;
                            if (iOooO0o4 == 0) {
                                this.f23056OooOO0 = -1;
                            } else {
                                int i18 = (iOooO0o4 - 3) - iOooO0o5;
                                this.f23056OooOO0 = i18;
                                if (i18 < 0) {
                                    androidx.datastore.preferences.protobuf.OooO00o.OooOo00(i18, "Found negative packet payload size: ", "PesReader");
                                    this.f23056OooOO0 = -1;
                                }
                            }
                            i5 = 2;
                        }
                        this.f23050OooO0OO = i5;
                        i3 = 0;
                        this.f23051OooO0Oo = 0;
                    } else {
                        i4 = 2;
                        i2 = -1;
                    }
                }
            } else {
                i2 = i8;
                i3 = r8;
                i4 = i9;
                r40Var.OooOO0O(r40Var.OooOOOO());
            }
            i9 = i4;
            r8 = i3;
            i8 = i2;
        }
    }

    public final boolean OooO0OO(r40 r40Var, byte[] bArr, int i) {
        int iMin = Math.min(r40Var.OooOOOO(), i - this.f23051OooO0Oo);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            r40Var.OooOO0O(iMin);
        } else {
            r40Var.OooO0o(bArr, this.f23051OooO0Oo, iMin);
        }
        int i2 = this.f23051OooO0Oo + iMin;
        this.f23051OooO0Oo = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1893oO
    public final void zzc() {
        this.f23050OooO0OO = 0;
        this.f23051OooO0Oo = 0;
        this.f23055OooO0oo = false;
        this.f23048OooO00o.zze();
    }
}
