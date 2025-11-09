package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wb0 implements kb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final JSONObject f25290OooO00o;

    public wb0(Context context) {
        this.f25290OooO00o = OooOOo0.o0OOO0o.OooOo0o(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        return ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000OO)).booleanValue() ? ii0.OooooOO(new vb0()) : ii0.OooooOO(new wa0(this, 1));
    }
}
