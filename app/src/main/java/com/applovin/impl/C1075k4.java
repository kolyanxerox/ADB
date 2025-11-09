package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.k4 */
/* loaded from: classes.dex */
public class C1075k4 {

    /* renamed from: a */
    private final Activity f987a;

    /* renamed from: b */
    private final int f988b;

    /* renamed from: c */
    private final int f989c;

    /* renamed from: d */
    private final boolean f990d;

    /* renamed from: e */
    private final boolean f991e;

    public C1075k4(Activity activity) {
        this.f987a = activity;
        int iM1231d = AbstractC1078k7.m1231d(activity);
        this.f989c = iM1231d;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.f990d = zIsTablet;
        this.f988b = m1133a(iM1231d, zIsTablet);
        this.f991e = zIsTablet && 2 == m1134a(activity);
    }

    /* renamed from: a */
    public void m1137a(AbstractC1207b abstractC1207b) {
        int i;
        if (!abstractC1207b.m2545J0() || (i = this.f988b) == -1) {
            m1136a(abstractC1207b.m2601g0());
        } else {
            m1135a(i);
        }
    }

    /* renamed from: a */
    private int m1133a(int i, boolean z) {
        if (z && this.f991e) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 9;
        }
        return i == 3 ? 8 : -1;
    }

    /* renamed from: a */
    private void m1136a(AbstractC1207b.c cVar) {
        if (cVar == AbstractC1207b.c.ACTIVITY_PORTRAIT) {
            if (this.f990d && this.f991e) {
                int i = this.f989c;
                if (i != 1 && i != 3) {
                    m1135a(1);
                    return;
                } else if (i == 1) {
                    m1135a(9);
                    return;
                } else {
                    m1135a(1);
                    return;
                }
            }
            int i2 = this.f989c;
            if (i2 != 0 && i2 != 2) {
                m1135a(1);
                return;
            } else {
                m1135a(i2 != 0 ? 9 : 1);
                return;
            }
        }
        if (cVar == AbstractC1207b.c.ACTIVITY_LANDSCAPE) {
            if (this.f990d && this.f991e) {
                int i3 = this.f989c;
                if (i3 != 0 && i3 != 2) {
                    m1135a(0);
                    return;
                } else {
                    m1135a(i3 != 2 ? 0 : 8);
                    return;
                }
            }
            int i4 = this.f989c;
            if (i4 != 1 && i4 != 3) {
                m1135a(0);
            } else {
                m1135a(i4 == 1 ? 0 : 8);
            }
        }
    }

    /* renamed from: a */
    private static int m1134a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = AbstractC1078k7.m1241f(context).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    /* renamed from: a */
    private void m1135a(int i) {
        try {
            this.f987a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }
}
