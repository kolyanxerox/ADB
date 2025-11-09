package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.in */
/* loaded from: classes2.dex */
public final class RunnableC1685in implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f20063OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ String f20064OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f20065OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ long f20066OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ long f20067OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ long f20068OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ boolean f20069OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ long f20070OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ int f20071OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ int f20072OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ AbstractC1869nn f20073Oooo000;

    public RunnableC1685in(AbstractC1869nn abstractC1869nn, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f20064OooOo0O = str;
        this.f20065OooOo0o = str2;
        this.f20063OooOo = j;
        this.f20067OooOoO0 = j2;
        this.f20066OooOoO = j3;
        this.f20068OooOoOO = j4;
        this.f20070OooOoo0 = j5;
        this.f20069OooOoo = z;
        this.f20071OooOooO = i;
        this.f20072OooOooo = i2;
        this.f20073Oooo000 = abstractC1869nn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapOooOOo.put("src", this.f20064OooOo0O);
        mapOooOOo.put("cachedSrc", this.f20065OooOo0o);
        mapOooOOo.put("bufferedDuration", Long.toString(this.f20063OooOo));
        mapOooOOo.put("totalDuration", Long.toString(this.f20067OooOoO0));
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue()) {
            mapOooOOo.put("qoeLoadedBytes", Long.toString(this.f20066OooOoO));
            mapOooOOo.put("qoeCachedBytes", Long.toString(this.f20068OooOoOO));
            mapOooOOo.put("totalBytes", Long.toString(this.f20070OooOoo0));
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            mapOooOOo.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        mapOooOOo.put("cacheReady", true != this.f20069OooOoo ? "0" : "1");
        mapOooOOo.put("playerCount", Integer.toString(this.f20071OooOooO));
        mapOooOOo.put("playerPreparedCount", Integer.toString(this.f20072OooOooo));
        AbstractC1869nn.OooO0oo(this.f20073Oooo000, mapOooOOo);
    }
}
