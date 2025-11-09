package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.kn */
/* loaded from: classes2.dex */
public final class RunnableC1758kn implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ int f20624OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ String f20625OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ String f20626OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ long f20627OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ int f20628OooOoO0;

    /* renamed from: OooOoOO */
    public final /* synthetic */ long f20629OooOoOO;

    /* renamed from: OooOoo */
    public final /* synthetic */ int f20630OooOoo;

    /* renamed from: OooOoo0 */
    public final /* synthetic */ boolean f20631OooOoo0;

    /* renamed from: OooOooO */
    public final /* synthetic */ int f20632OooOooO;

    /* renamed from: OooOooo */
    public final /* synthetic */ C1980qn f20633OooOooo;

    public RunnableC1758kn(C1980qn c1980qn, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f20625OooOo0O = str;
        this.f20626OooOo0o = str2;
        this.f20624OooOo = i;
        this.f20628OooOoO0 = i2;
        this.f20627OooOoO = j;
        this.f20629OooOoOO = j2;
        this.f20631OooOoo0 = z;
        this.f20630OooOoo = i3;
        this.f20632OooOooO = i4;
        this.f20633OooOooo = c1980qn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapOooOOo.put("src", this.f20625OooOo0O);
        mapOooOOo.put("cachedSrc", this.f20626OooOo0o);
        mapOooOOo.put("bytesLoaded", Integer.toString(this.f20624OooOo));
        mapOooOOo.put("totalBytes", Integer.toString(this.f20628OooOoO0));
        mapOooOOo.put("bufferedDuration", Long.toString(this.f20627OooOoO));
        mapOooOOo.put("totalDuration", Long.toString(this.f20629OooOoOO));
        mapOooOOo.put("cacheReady", true != this.f20631OooOoo0 ? "0" : "1");
        mapOooOOo.put("playerCount", Integer.toString(this.f20630OooOoo));
        mapOooOOo.put("playerPreparedCount", Integer.toString(this.f20632OooOooO));
        AbstractC1869nn.OooO0oo(this.f20633OooOooo, mapOooOOo);
    }
}
