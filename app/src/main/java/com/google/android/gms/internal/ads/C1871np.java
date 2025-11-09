package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.np */
/* loaded from: classes2.dex */
public final class C1871np implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21562OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1687ip f21563OooO0O0;

    public /* synthetic */ C1871np(C1687ip c1687ip, int i) {
        this.f21562OooO00o = i;
        this.f21563OooO0O0 = c1687ip;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f21562OooO00o) {
            case 0:
                WeakReference weakReference = this.f21563OooO0O0.f20082OooO0Oo;
                ii0.Oooo000(weakReference);
                return weakReference;
            case 1:
                return new C2150v8(this.f21563OooO0O0.f20080OooO0O0);
            case 2:
                C1687ip c1687ip = this.f21563OooO0O0;
                return new zzk(c1687ip.f20080OooO0O0, c1687ip.f20079OooO00o);
            case 3:
                C1687ip c1687ip2 = this.f21563OooO0O0;
                String strZzc = zzv.zzq().zzc(c1687ip2.f20080OooO0O0, c1687ip2.f20079OooO00o.afmaVersion);
                ii0.Oooo000(strZzc);
                return strZzc;
            default:
                return Long.valueOf(this.f21563OooO0O0.f20081OooO0OO);
        }
    }
}
