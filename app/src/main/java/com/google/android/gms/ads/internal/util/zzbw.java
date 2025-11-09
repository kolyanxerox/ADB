package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1386ai;
import com.google.android.gms.internal.ads.eg0;
import com.google.android.gms.internal.ads.ii0;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class zzbw extends zzb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzu f16247OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f16248OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzv f16249OooO0Oo;

    public zzbw(Context context, String str, String str2, @Nullable eg0 eg0Var, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.f16247OooO0O0 = new com.google.android.gms.ads.internal.util.client.zzu(com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
        this.f16248OooO0OO = str2;
        this.f16249OooO0Oo = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        String str = this.f16248OooO0OO;
        com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.f16247OooO0O0;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.f16249OooO0Oo;
        if (zzvVar == null) {
            zzuVar.zza(str);
            return;
        }
        try {
            new C1386ai(zzvVar.zzb(), zzuVar, AbstractC2200wl.f25326OooO0o0, null, 15).OooOoO(1, 0L, str);
        } catch (NullPointerException | RejectedExecutionException unused) {
            ii0.OooooOO(com.google.android.gms.ads.internal.util.client.zzt.zzb);
        }
    }
}
