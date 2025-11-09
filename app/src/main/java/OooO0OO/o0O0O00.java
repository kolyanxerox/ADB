package Oooo0oO;

import com.google.android.gms.ads.internal.client.zzs;

/* loaded from: classes2.dex */
public final class o0O0O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f13885OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f13886OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f13887OooO0OO;

    public o0O0O00() {
        this.f13885OooO00o = 0;
        this.f13886OooO0O0 = 0;
        this.f13887OooO0OO = 0;
    }

    public static o0O0O00 OooO00o(zzs zzsVar) {
        return zzsVar.zzd ? new o0O0O00(3, 0, 0) : zzsVar.zzi ? new o0O0O00(2, 0, 0) : zzsVar.zzh ? new o0O0O00(0, 0, 0) : new o0O0O00(1, zzsVar.zzf, zzsVar.zzc);
    }

    public boolean OooO0O0() {
        return this.f13885OooO00o == 3;
    }

    public o0O0O00(int i, int i2, int i3) {
        this.f13885OooO00o = i;
        this.f13887OooO0OO = i2;
        this.f13886OooO0O0 = i3;
    }

    public /* synthetic */ o0O0O00(int i, int i2, int i3, boolean z) {
        this.f13885OooO00o = i;
        this.f13886OooO0O0 = i2;
        this.f13887OooO0OO = i3;
    }
}
