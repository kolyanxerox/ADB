package com.iab.omid.library.applovin.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: com.iab.omid.library.applovin.utils.h */
/* loaded from: classes2.dex */
public final class C2512h {
    /* renamed from: a */
    public static String m4172a(View view) {
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
    public static Activity m4173b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static View m4174c(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: d */
    public static float m4175d(View view) {
        return view.getZ();
    }

    /* renamed from: e */
    public static boolean m4176e(View view) {
        Activity activityM4173b = m4173b(view);
        if (activityM4173b != null) {
            return activityM4173b.isInPictureInPictureMode();
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m4177f(View view) {
        return m4172a(view) == null;
    }

    /* renamed from: g */
    public static boolean m4178g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m4174c(view);
        }
        return true;
    }
}
