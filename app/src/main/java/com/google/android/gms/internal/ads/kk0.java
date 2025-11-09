package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.ironsource.C3126fq;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class kk0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final or0 f20611OooO0OO = new or0("OverlayDisplayService");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final Intent f20612OooO0Oo = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage(C3126fq.f8595b);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C1643hi f20613OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f20614OooO0O0;

    public kk0(Context context) {
        if (sk0.OooO00o(context)) {
            this.f20613OooO00o = new C1643hi(context.getApplicationContext(), f20611OooO0OO, f20612OooO0Oo);
        } else {
            this.f20613OooO00o = null;
        }
        this.f20614OooO0O0 = context.getPackageName();
    }

    public static void OooO0O0(String str, Consumer consumer) {
        if ((str == null ? "" : str).trim().isEmpty()) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    public static boolean OooO0OO(ok0 ok0Var, String str, List list) {
        if (list.stream().anyMatch(new ug0(1))) {
            return true;
        }
        f20611OooO0OO.OooO00o(str, new Object[0]);
        ok0Var.zza(new fk0(8160, null));
        return false;
    }

    public final void OooO00o(gk0 gk0Var, ok0 ok0Var, int i) {
        C1643hi c1643hi = this.f20613OooO00o;
        if (c1643hi == null) {
            f20611OooO0OO.OooO00o("error: %s", "Play Store not found.");
        } else {
            if (OooO0OO(ok0Var, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(gk0Var.f19375OooO00o, gk0Var.f19376OooO0O0))) {
                c1643hi.OooOOO0(new qk0(c1643hi, new RunnableC1795ln(this, gk0Var, i, ok0Var), 1));
            }
        }
    }
}
