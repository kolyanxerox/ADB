package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p7 */
/* loaded from: classes2.dex */
public final class C1927p7 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public CustomTabsSession f23235OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public CustomTabsClient f23236OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public a41 f23237OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public InterfaceC1890o7 f23238OooO0Oo;

    public static boolean OooO00o(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(xh0.OooOOO(context));
                    }
                }
            }
        }
        return false;
    }
}
