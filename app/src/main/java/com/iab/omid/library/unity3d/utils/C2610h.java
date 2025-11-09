package com.iab.omid.library.unity3d.utils;

import android.view.View;

/* renamed from: com.iab.omid.library.unity3d.utils.h */
/* loaded from: classes2.dex */
public final class C2610h {
    /* renamed from: a */
    public static String m4664a(View view) {
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
    public static View m4665b(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static float m4666c(View view) {
        return view.getZ();
    }

    /* renamed from: d */
    public static boolean m4667d(View view) {
        return m4664a(view) == null;
    }

    /* renamed from: e */
    public static boolean m4668e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m4665b(view);
        }
        return true;
    }
}
