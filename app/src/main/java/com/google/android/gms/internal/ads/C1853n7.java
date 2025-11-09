package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.n7 */
/* loaded from: classes2.dex */
public final class C1853n7 extends CustomTabsServiceConnection {

    /* renamed from: OooOo */
    public h20 f21423OooOo;

    /* renamed from: OooOo0O */
    public final AtomicBoolean f21424OooOo0O = new AtomicBoolean(false);

    /* renamed from: OooOo0o */
    public Context f21425OooOo0o;

    /* renamed from: OooOoO */
    public CustomTabsClient f21426OooOoO;

    /* renamed from: OooOoO0 */
    public CustomTabsSession f21427OooOoO0;

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        this.f21426OooOoO = customTabsClient;
        customTabsClient.warmup(0L);
        this.f21427OooOoO0 = customTabsClient.newSession(new C1816m7(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f21426OooOoO = null;
        this.f21427OooOoO0 = null;
    }
}
