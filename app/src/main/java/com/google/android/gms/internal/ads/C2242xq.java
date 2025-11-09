package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.xq */
/* loaded from: classes2.dex */
public final class C2242xq implements InterfaceC1946pq {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f25786OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final zzj f25787OooO0O0 = zzv.zzp().OooO0Oo();

    public C2242xq(Context context) {
        this.f25786OooO00o = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1946pq
    public final void OooO00o(HashMap map) throws IOException {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z = Boolean.parseBoolean(str);
        this.f25787OooO0O0.zzD(z);
        if (z) {
            zzad.zzc(this.f25786OooO00o);
        }
    }
}
