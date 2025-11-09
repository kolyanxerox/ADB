package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class g20 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19196OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1548ey f19197OooOo0o;

    public /* synthetic */ g20(C1548ey c1548ey, int i) {
        this.f19196OooOo0O = i;
        this.f19197OooOo0o = c1548ey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19196OooOo0O) {
            case 0:
                C1548ey c1548ey = this.f19197OooOo0o;
                ((h20) c1548ey.f18706OooOo).f19525OooO00o.OooO0O0((ConcurrentHashMap) c1548ey.f18708OooOo0o, false);
                break;
            case 1:
                C1548ey c1548ey2 = this.f19197OooOo0o;
                ((h20) c1548ey2.f18706OooOo).f19525OooO00o.OooO0O0((ConcurrentHashMap) c1548ey2.f18708OooOo0o, true);
                break;
            default:
                C1548ey c1548ey3 = this.f19197OooOo0o;
                k20 k20Var = ((h20) c1548ey3.f18706OooOo).f19525OooO00o;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1548ey3.f18708OooOo0o;
                k20Var.getClass();
                if (!concurrentHashMap.isEmpty()) {
                    k20Var.OooO00o(concurrentHashMap);
                    String strGenerateUrl = k20Var.f20420OooO0o.generateUrl(concurrentHashMap);
                    zze.zza(strGenerateUrl);
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0Oo0o)).booleanValue() || k20Var.f20421OooO0o0) {
                        k20Var.f20418OooO0OO.execute(new l20(k20Var, strGenerateUrl, 1));
                        break;
                    }
                } else {
                    zzo.zze("Empty paramMap.");
                    break;
                }
                break;
        }
    }
}
