package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.oOOO0OO0;
import com.google.android.gms.internal.ads.oOOOoo00;

/* loaded from: classes2.dex */
final class zzbi implements oOOO0OO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f16232OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzbk f16233OooO0O0;

    public zzbi(String str, zzbk zzbkVar) {
        this.f16232OooO00o = str;
        this.f16233OooO0O0 = zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.oOOO0OO0
    public final void zza(oOOOoo00 oooooo00) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load URL: " + this.f16232OooO00o + "\n" + oooooo00.toString());
        this.f16233OooO0O0.zza(null);
    }
}
