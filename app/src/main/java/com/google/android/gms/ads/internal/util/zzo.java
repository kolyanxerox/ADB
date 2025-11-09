package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.C1927p7;
import com.google.android.gms.internal.ads.InterfaceC1890o7;
import com.google.android.gms.internal.ads.a41;
import com.google.android.gms.internal.ads.xh0;

/* loaded from: classes2.dex */
final class zzo implements InterfaceC1890o7 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C1927p7 f16306OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f16307OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Uri f16308OooO0OO;

    public zzo(C1927p7 c1927p7, Context context, Uri uri) {
        this.f16306OooO00o = c1927p7;
        this.f16307OooO0O0 = context;
        this.f16308OooO0OO = uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1890o7
    public final void zza() {
        C1927p7 c1927p7 = this.f16306OooO00o;
        CustomTabsClient customTabsClient = c1927p7.f23236OooO0O0;
        if (customTabsClient == null) {
            c1927p7.f23235OooO00o = null;
        } else if (c1927p7.f23235OooO00o == null) {
            c1927p7.f23235OooO00o = customTabsClient.newSession(null);
        }
        CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder(c1927p7.f23235OooO00o).build();
        Intent intent = customTabsIntentBuild.intent;
        Context context = this.f16307OooO0O0;
        intent.setPackage(xh0.OooOOO(context));
        customTabsIntentBuild.launchUrl(context, this.f16308OooO0OO);
        Activity activity = (Activity) context;
        a41 a41Var = c1927p7.f23237OooO0OO;
        if (a41Var == null) {
            return;
        }
        activity.unbindService(a41Var);
        c1927p7.f23236OooO0O0 = null;
        c1927p7.f23235OooO00o = null;
        c1927p7.f23237OooO0OO = null;
    }
}
