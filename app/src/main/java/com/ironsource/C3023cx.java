package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.ironsource.cx */
/* loaded from: classes2.dex */
public final class C3023cx {

    /* renamed from: a */
    private final InterfaceC3707tp f7860a;

    /* renamed from: b */
    private View f7861b;

    /* renamed from: c */
    private boolean f7862c;

    /* renamed from: d */
    private final ViewTreeObserver.OnGlobalLayoutListener f7863d;

    /* renamed from: e */
    private final ViewTreeObserver.OnWindowFocusChangeListener f7864e;

    /* renamed from: f */
    private final Rect f7865f;

    public C3023cx(InterfaceC3707tp onVisibilityChangeListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(onVisibilityChangeListener, "onVisibilityChangeListener");
        this.f7860a = onVisibilityChangeListener;
        this.f7863d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ironsource.OooOOOO
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C3023cx.m8247a(this.f28479OooOo0O);
            }
        };
        this.f7864e = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.ironsource.OooOo00
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                C3023cx.m8248a(this.f28483OooO00o, z);
            }
        };
        this.f7865f = new Rect();
    }

    /* renamed from: a */
    private final void m8246a() {
        boolean zM8251c = m8251c();
        if (this.f7862c != zM8251c) {
            this.f7862c = zM8251c;
            this.f7860a.mo7854a(zM8251c);
        }
    }

    /* renamed from: b */
    public final void m8250b() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        View view = this.f7861b;
        if (view != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.f7863d);
        }
        View view2 = this.f7861b;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.f7864e);
        }
        this.f7861b = null;
    }

    /* renamed from: c */
    public final boolean m8251c() {
        View view = this.f7861b;
        if (view != null) {
            return C3058dx.m8423a(view, this.f7865f);
        }
        return false;
    }

    /* renamed from: a */
    public final void m8249a(View view) {
        kotlin.jvm.internal.OooOo.OooO0o0(view, "view");
        this.f7861b = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f7863d);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f7864e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8247a(C3023cx this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m8246a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8248a(C3023cx this$0, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m8246a();
    }
}
