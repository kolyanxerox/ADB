package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.InterfaceC1584fx;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzbm implements InterfaceC1584fx {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f16577OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final zzb f16578OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f16579OooOo0o;

    @VisibleForTesting
    public zzbm(zzb zzbVar, int i, @Nullable String str) {
        this.f16578OooOo0O = zzbVar;
        this.f16579OooOo0o = i;
        this.f16577OooOo = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zze(@Nullable final zzbk zzbkVar) {
        if (zzbkVar == null || this.f16579OooOo0o != 2 || TextUtils.isEmpty(this.f16577OooOo)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbl
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                zzbm zzbmVar = this.zza;
                zzbmVar.f16578OooOo0O.zzd(zzbmVar.f16577OooOo, zzbkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zzf(@Nullable String str) {
    }
}
