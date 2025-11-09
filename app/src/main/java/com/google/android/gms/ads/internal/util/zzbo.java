package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C2249xx;
import com.google.android.gms.internal.ads.C2274yl;
import com.google.android.gms.internal.ads.O0O0;
import com.google.android.gms.internal.ads.o0O;
import com.google.android.gms.internal.ads.oOO0O0O0;
import com.google.android.gms.internal.ads.oOOO0O0o;
import java.util.Map;
import o00000oO.OooOOO;

/* loaded from: classes2.dex */
public final class zzbo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static oOOO0O0o f16240OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f16241OooO0O0 = new Object();

    public zzbo(Context context) {
        oOOO0O0o oooo0o0o;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f16241OooO0O0) {
            try {
                if (f16240OooO00o == null) {
                    AbstractC1448c7.OooO00o(context);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o0000)).booleanValue()) {
                        oooo0o0o = zzaz.zzb(context);
                    } else {
                        oooo0o0o = new oOOO0O0o(new O0O0(new C2249xx(context.getApplicationContext())), new C2249xx(new o0O(23)));
                        oooo0o0o.OooO0OO();
                    }
                    f16240OooO00o = oooo0o0o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final OooOOO zza(String str) {
        C2274yl c2274yl = new C2274yl();
        f16240OooO00o.OooO00o(new zzbm(str, null, c2274yl));
        return c2274yl;
    }

    public final OooOOO zzb(int i, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbk zzbkVar = new zzbk();
        zzbi zzbiVar = new zzbi(str, zzbkVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbj zzbjVar = new zzbj(i, str, zzbkVar, zzbiVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, "GET", zzbjVar.zzl(), zzbjVar.zzx());
            } catch (oOO0O0O0 e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
            }
        }
        f16240OooO00o.OooO00o(zzbjVar);
        return zzbkVar;
    }
}
