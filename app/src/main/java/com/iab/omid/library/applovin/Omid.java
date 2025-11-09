package com.iab.omid.library.applovin;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Omid {
    private static C2481b INSTANCE = new C2481b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m4001a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m4000a();
    }

    public static boolean isActive() {
        return INSTANCE.m4003b();
    }

    public static void updateLastActivity() {
        INSTANCE.m4004c();
    }
}
