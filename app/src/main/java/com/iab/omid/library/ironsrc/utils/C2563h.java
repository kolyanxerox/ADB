package com.iab.omid.library.ironsrc.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: com.iab.omid.library.ironsrc.utils.h */
/* loaded from: classes2.dex */
public final class C2563h {
    /* renamed from: a */
    public static String m4425a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* renamed from: b */
    public static Activity m4426b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static View m4427c(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: d */
    public static float m4428d(View view) {
        return view.getZ();
    }

    /* renamed from: e */
    public static boolean m4429e(View view) {
        Activity activityM4426b = m4426b(view);
        if (activityM4426b != null) {
            return activityM4426b.isInPictureInPictureMode();
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m4430f(View view) {
        return m4425a(view) == null;
    }

    /* renamed from: g */
    public static boolean m4431g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m4427c(view);
        }
        return true;
    }
}
