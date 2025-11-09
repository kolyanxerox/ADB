package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class oo00o implements o00000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f23026OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O f23027OooO0O0;

    public oo00o(int i) {
        this.f23026OooO00o = i;
        switch (i) {
            case 1:
                this.f23027OooO0O0 = new o000O0(35152, 2, "image/png");
                break;
            case 2:
                this.f23027OooO0O0 = new o00O0OOO();
                break;
            default:
                this.f23027OooO0O0 = new o000O0(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        switch (this.f23026OooO00o) {
            case 0:
                ((o000O0) this.f23027OooO0O0).OooO0O0(j, j2);
                break;
            case 1:
                ((o000O0) this.f23027OooO0O0).OooO0O0(j, j2);
                break;
            default:
                ((o00O0OOO) this.f23027OooO0O0).OooO0O0(j, j2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) {
        switch (this.f23026OooO00o) {
            case 0:
                return ((o000O0) this.f23027OooO0O0).OooO0OO(o00000oo2);
            case 1:
                return ((o000O0) this.f23027OooO0O0).OooO0OO(o00000oo2);
            default:
                return ((o00O0OOO) this.f23027OooO0O0).OooO0OO(o00000oo2);
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        switch (this.f23026OooO00o) {
            case 0:
                ((o000O0) this.f23027OooO0O0).OooO0o(o0000ooo);
                break;
            case 1:
                ((o000O0) this.f23027OooO0O0).OooO0o(o0000ooo);
                break;
            default:
                ((o00O0OOO) this.f23027OooO0O0).f21811OooO0O0 = (v91) o0000ooo;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final int OooO0o0(o00000OO o00000oo2, o0000O00 o0000o00) {
        switch (this.f23026OooO00o) {
            case 0:
                return ((o000O0) this.f23027OooO0O0).OooO0o0(o00000oo2, o0000o00);
            case 1:
                return ((o000O0) this.f23027OooO0O0).OooO0o0(o00000oo2, o0000o00);
            default:
                return ((o00O0OOO) this.f23027OooO0O0).OooO0o0(o00000oo2, o0000o00);
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        switch (this.f23026OooO00o) {
            case 0:
                pm0 pm0Var = rm0.f23913OooOo0o;
                break;
            case 1:
                pm0 pm0Var2 = rm0.f23913OooOo0o;
                break;
            default:
                pm0 pm0Var3 = rm0.f23913OooOo0o;
                break;
        }
        return gn0.f19388OooOoO;
    }
}
