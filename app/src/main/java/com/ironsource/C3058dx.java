package com.ironsource;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ironsource.dx */
/* loaded from: classes2.dex */
public final class C3058dx {
    /* renamed from: a */
    public static final boolean m8423a(View view, Rect rect) {
        kotlin.jvm.internal.OooOo.OooO0o0(view, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
