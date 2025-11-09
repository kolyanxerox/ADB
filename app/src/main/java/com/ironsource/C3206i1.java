package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: com.ironsource.i1 */
/* loaded from: classes2.dex */
public final class C3206i1 {

    /* renamed from: a */
    public static final C3206i1 f8961a = new C3206i1();

    private C3206i1() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    /* renamed from: a */
    public static final int m9248a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return 0;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m9250b() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static final MeasurementManager m9249a(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        if (Build.VERSION.SDK_INT < 30 || m9248a() < 4) {
            return null;
        }
        try {
            return androidx.privacysandbox.ads.adservices.customaudience.OooO00o.OooOOO0(context.getSystemService(androidx.privacysandbox.ads.adservices.customaudience.OooO00o.OooOOo()));
        } catch (Exception unused) {
            return null;
        }
    }
}
