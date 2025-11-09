package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class o0000oo implements o000O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21683OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f21684OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f21685OooO0OO;

    public /* synthetic */ o0000oo(Object obj, int i, long j) {
        this.f21683OooO00o = i;
        this.f21685OooO0OO = obj;
        this.f21684OooO0O0 = j;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        switch (this.f21683OooO00o) {
            case 0:
                o0000O0 o0000o02 = (o0000O0) this.f21685OooO0OO;
                af0.OooOo0O(o0000o02.f21667OooOO0O);
                C2249xx c2249xx = o0000o02.f21667OooOO0O;
                long[] jArr = (long[]) c2249xx.f25815OooOo0o;
                int iOooOO0 = i80.OooOO0(jArr, Math.max(0L, Math.min((o0000o02.f21663OooO0o0 * j) / 1000000, o0000o02.f21666OooOO0 - 1)), false);
                long j2 = iOooOO0 == -1 ? 0L : jArr[iOooOO0];
                long[] jArr2 = (long[]) c2249xx.f25813OooOo;
                long j3 = iOooOO0 != -1 ? jArr2[iOooOO0] : 0L;
                int i = o0000o02.f21663OooO0o0;
                long j4 = (j2 * 1000000) / i;
                long j5 = this.f21684OooO0O0;
                o000O00O o000o00o2 = new o000O00O(j4, j3 + j5);
                if (j4 == j || iOooOO0 == jArr.length - 1) {
                    return new o000Oo0(o000o00o2, o000o00o2);
                }
                int i2 = iOooOO0 + 1;
                return new o000Oo0(o000o00o2, new o000O00O((jArr[i2] * 1000000) / i, j5 + jArr2[i2]));
            case 1:
                return (o000Oo0) this.f21685OooO0OO;
            default:
                o00oOoo o00oooo = (o00oOoo) this.f21685OooO0OO;
                o000Oo0 o000oo0OooO00o = o00oooo.f21836OooO[0].OooO00o(j);
                int i3 = 1;
                while (true) {
                    o00O00[] o00o00Arr = o00oooo.f21836OooO;
                    if (i3 >= o00o00Arr.length) {
                        return o000oo0OooO00o;
                    }
                    o000Oo0 o000oo0OooO00o2 = o00o00Arr[i3].OooO00o(j);
                    if (o000oo0OooO00o2.f21729OooO00o.f21698OooO0O0 < o000oo0OooO00o.f21729OooO00o.f21698OooO0O0) {
                        o000oo0OooO00o = o000oo0OooO00o2;
                    }
                    i3++;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final long zza() {
        switch (this.f21683OooO00o) {
        }
        return this.f21684OooO0O0;
    }

    @Override // com.google.android.gms.internal.ads.o000O00
    public final boolean zzh() {
        switch (this.f21683OooO00o) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public o0000oo(long j, long j2) {
        this.f21683OooO00o = 1;
        this.f21684OooO0O0 = j;
        o000O00O o000o00o2 = j2 == 0 ? o000O00O.f21696OooO0OO : new o000O00O(0L, j2);
        this.f21685OooO0OO = new o000Oo0(o000o00o2, o000o00o2);
    }
}
