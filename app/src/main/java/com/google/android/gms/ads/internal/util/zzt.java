package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC1870no;
import com.google.android.gms.internal.ads.C1393ap;
import com.google.android.gms.internal.ads.C1998r4;
import com.google.android.gms.internal.ads.C2084tg;
import com.google.android.gms.internal.ads.C2111u6;
import com.google.android.gms.internal.ads.InterfaceC1722jo;
import com.google.android.gms.internal.ads.x50;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes2.dex */
public class zzt extends zzaa {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    @Nullable
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (zzs.zzG()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oO("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse zzb(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final AbstractC1870no zzc(InterfaceC1722jo interfaceC1722jo, C1998r4 c1998r4, boolean z, @Nullable x50 x50Var) {
        return new C1393ap(interfaceC1722jo, c1998r4, z, new C2084tg(interfaceC1722jo, interfaceC1722jo.zzE(), new C2111u6(interfaceC1722jo.getContext())), x50Var);
    }
}
