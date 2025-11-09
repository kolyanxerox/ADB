package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.hn */
/* loaded from: classes2.dex */
public final class RunnableC1648hn implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ int f19827OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ String f19828OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ String f19829OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ C1907on f19830OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ int f19831OooOoO0;

    public RunnableC1648hn(C1907on c1907on, String str, String str2, int i, int i2) {
        this.f19828OooOo0O = str;
        this.f19829OooOo0o = str2;
        this.f19827OooOo = i;
        this.f19831OooOoO0 = i2;
        this.f19830OooOoO = c1907on;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapOooOOo.put("src", this.f19828OooOo0O);
        mapOooOOo.put("cachedSrc", this.f19829OooOo0o);
        mapOooOOo.put("bytesLoaded", Integer.toString(this.f19827OooOo));
        mapOooOOo.put("totalBytes", Integer.toString(this.f19831OooOoO0));
        mapOooOOo.put("cacheReady", "0");
        AbstractC1869nn.OooO0oo(this.f19830OooOoO, mapOooOOo);
    }
}
