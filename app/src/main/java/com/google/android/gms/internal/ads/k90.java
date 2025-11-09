package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class k90 implements kb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20465OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f20466OooO0O0;

    public /* synthetic */ k90(Object obj, int i) {
        this.f20465OooO00o = i;
        this.f20466OooO0O0 = obj;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        switch (this.f20465OooO00o) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            default:
                return 49;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        int i = 0;
        int i2 = 2;
        Object obj = this.f20466OooO0O0;
        switch (this.f20465OooO00o) {
            case 0:
                return ii0.OooooOO(new l90(ContextCompat.checkSelfPermission((Context) obj, "com.google.android.gms.permission.AD_ID") == 0, 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return ii0.OooooOO(new v90(i, arrayList));
            case 2:
                return ii0.OooooOO(new l90(((vd0) obj).f24964OooOOOo, 1));
            case 3:
                String str = null;
                lc0 lc0Var = (lc0) obj;
                if (lc0Var == null) {
                    return ii0.OooooOO(new r90(str, i2));
                }
                int i3 = Oooo0OO.o0ooOOo.f13854OooO00o;
                String str2 = lc0Var.f20848OooO00o;
                return (str2 == null || str2.trim().isEmpty()) ? ii0.OooooOO(new r90(str, i2)) : ii0.OooooOO(new r90(str2, i2));
            case 4:
                return ii0.OooooOO(new wa0((jd0) obj, 0));
            case 5:
                return ii0.OooooOO(new x90(2, (Bundle) obj));
            default:
                return ii0.Ooooooo(ii0.o00Oo0(ii0.OooooOO(new Bundle()), ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoOoo)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), new o0O0o00O(13), AbstractC2200wl.f25321OooO00o);
        }
    }
}
