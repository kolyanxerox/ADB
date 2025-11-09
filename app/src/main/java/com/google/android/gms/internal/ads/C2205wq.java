package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.wq */
/* loaded from: classes2.dex */
public final class C2205wq implements InterfaceC1946pq {
    @Override // com.google.android.gms.internal.ads.InterfaceC1946pq
    public final void OooO00o(HashMap map) {
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOo0o0)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzv.zzp().OooO0Oo().zzE(Boolean.parseBoolean(str));
    }
}
