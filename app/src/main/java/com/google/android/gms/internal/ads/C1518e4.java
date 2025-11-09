package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.e4 */
/* loaded from: classes2.dex */
public final class C1518e4 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public zzby f18479OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Context f18480OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f18481OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final zzei f18482OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final AppOpenAd.AppOpenAdLoadCallback f18483OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f18484OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final BinderC2082te f18485OooO0oO = new BinderC2082te();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final zzr f18486OooO0oo = zzr.zza;

    public C1518e4(Context context, String str, zzei zzeiVar, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f18480OooO0O0 = context;
        this.f18481OooO0OO = str;
        this.f18482OooO0Oo = zzeiVar;
        this.f18484OooO0o0 = i;
        this.f18483OooO0o = appOpenAdLoadCallback;
    }

    public final void OooO00o() {
        zzei zzeiVar = this.f18482OooO0Oo;
        String str = this.f18481OooO0OO;
        Context context = this.f18480OooO0O0;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzby zzbyVarZze = zzbc.zza().zze(context, zzs.zzb(), str, this.f18485OooO0oO);
            this.f18479OooO00o = zzbyVarZze;
            if (zzbyVarZze != null) {
                int i = this.f18484OooO0o0;
                if (i != 3) {
                    this.f18479OooO00o.zzI(new zzy(i));
                }
                zzeiVar.zzq(jCurrentTimeMillis);
                this.f18479OooO00o.zzH(new BinderC2071t3(this.f18483OooO0o, str));
                this.f18479OooO00o.zzab(this.f18486OooO0oo.zza(context, zzeiVar));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
