package com.ironsource;

import android.content.Context;

/* renamed from: com.ironsource.bb */
/* loaded from: classes2.dex */
public final class C2966bb {

    /* renamed from: a */
    public static final C2966bb f7584a = new C2966bb();

    private C2966bb() {
    }

    /* renamed from: a */
    public final int m7900a(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return m7899a(context, context.getResources().getDisplayMetrics().heightPixels);
    }

    /* renamed from: b */
    public final int m7901b(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return m7899a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    /* renamed from: a */
    private final int m7899a(Context context, int i) {
        return o00O0.o000OOo.OooO(i / context.getResources().getDisplayMetrics().density);
    }
}
