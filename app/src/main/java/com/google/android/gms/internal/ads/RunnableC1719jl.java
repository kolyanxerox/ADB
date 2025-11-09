package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.jl */
/* loaded from: classes2.dex */
public final class RunnableC1719jl implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ Context f20330OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C2274yl f20331OooOo0o;

    public RunnableC1719jl(Context context, C2274yl c2274yl) {
        this.f20330OooOo0O = context;
        this.f20331OooOo0o = c2274yl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2274yl c2274yl = this.f20331OooOo0o;
        try {
            c2274yl.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.f20330OooOo0O));
        } catch (OooOooo.o000O0O0 | OooOooo.o000OO0O | IOException | IllegalStateException e) {
            c2274yl.zzd(e);
            zzo.zzh("Exception while getting advertising Id info", e);
        }
    }
}
