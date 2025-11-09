package com.iab.omid.library.ironsrc;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Omid {
    private static C2532b INSTANCE = new C2532b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m4254a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m4253a();
    }

    public static boolean isActive() {
        return INSTANCE.m4256b();
    }

    public static void updateLastActivity() {
        INSTANCE.m4257c();
    }
}
