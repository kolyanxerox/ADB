package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class a41 extends CustomTabsServiceConnection {

    /* renamed from: OooOo0O */
    public final WeakReference f16907OooOo0O;

    public a41(C1927p7 c1927p7) {
        this.f16907OooOo0O = new WeakReference(c1927p7);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        C1927p7 c1927p7 = (C1927p7) this.f16907OooOo0O.get();
        if (c1927p7 != null) {
            c1927p7.f23236OooO0O0 = customTabsClient;
            customTabsClient.warmup(0L);
            InterfaceC1890o7 interfaceC1890o7 = c1927p7.f23238OooO0Oo;
            if (interfaceC1890o7 != null) {
                interfaceC1890o7.zza();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1927p7 c1927p7 = (C1927p7) this.f16907OooOo0O.get();
        if (c1927p7 != null) {
            c1927p7.f23236OooO0O0 = null;
            c1927p7.f23235OooO00o = null;
        }
    }
}
