package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.c2 */
/* loaded from: classes2.dex */
public final class C1443c2 {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final String[] f17651OooO0o0 = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f17652OooO00o = 0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f17653OooO0O0 = 0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f17654OooO0OO = -1;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f17655OooO0Oo = false;

    public C1443c2(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C1407b2(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }
}
