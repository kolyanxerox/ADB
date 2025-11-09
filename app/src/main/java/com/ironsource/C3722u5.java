package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3419mh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.C3657v;

/* renamed from: com.ironsource.u5 */
/* loaded from: classes2.dex */
public class C3722u5 {

    /* renamed from: a */
    public static C3722u5 f12145a;

    /* renamed from: com.ironsource.u5$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12146a;

        static {
            int[] iArr = new int[C3419mh.a.values().length];
            f12146a = iArr;
            try {
                iArr[C3419mh.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12146a[C3419mh.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12146a[C3419mh.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public static C3722u5 m12540a() {
        C3722u5 c3722u5 = f12145a;
        return c3722u5 == null ? new C3722u5() : c3722u5;
    }

    /* renamed from: a */
    public boolean m12541a(Activity activity) throws NumberFormatException {
        if (a.f12146a[C3527pk.m11417e().m11422b().ordinal()] != 3) {
            return false;
        }
        try {
            C3657v c3657v = (C3657v) C3045dk.m8333b((Context) activity).mo8343a().m12006j();
            if (c3657v == null) {
                return true;
            }
            c3657v.m12220k("back");
            return true;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
