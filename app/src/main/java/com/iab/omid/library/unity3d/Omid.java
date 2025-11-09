package com.iab.omid.library.unity3d;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Omid {
    private static C2581b INSTANCE = new C2581b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m4510a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m4509a();
    }

    public static boolean isActive() {
        return INSTANCE.m4512b();
    }

    public static void updateLastActivity() {
        INSTANCE.m4513c();
    }
}
