package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC3011cl;

/* renamed from: com.ironsource.rk */
/* loaded from: classes2.dex */
public final class C3597rk extends WebView implements InterfaceC3046dl {

    /* renamed from: a */
    private InterfaceC3011cl f11193a;

    /* renamed from: b */
    private InterfaceC3742up f11194b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3597rk(Context context) {
        super(context);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
    }

    /* renamed from: a */
    public final void m11729a() {
        this.f11194b = null;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent event) {
        InterfaceC3742up interfaceC3742up;
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        if (i == 4 && (interfaceC3742up = this.f11194b) != null && interfaceC3742up.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3597rk(Context context, AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(attrs, "attrs");
    }

    /* renamed from: a */
    public final void m11730a(InterfaceC3742up interfaceC3742up) {
        this.f11194b = interfaceC3742up;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3597rk(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(attrs, "attrs");
    }

    @Override // com.ironsource.InterfaceC3046dl
    /* renamed from: a */
    public void mo8376a(String script) {
        kotlin.jvm.internal.OooOo.OooO0o0(script, "script");
        InterfaceC3011cl interfaceC3011cl = this.f11193a;
        if (interfaceC3011cl == null) {
            kotlin.jvm.internal.OooOo.OooOO0o("javascriptEngine");
            throw null;
        }
        if (!interfaceC3011cl.mo8177a()) {
            InterfaceC3011cl interfaceC3011cl2 = this.f11193a;
            if (interfaceC3011cl2 == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("javascriptEngine");
                throw null;
            }
            interfaceC3011cl2.mo8175a(this);
        }
        InterfaceC3011cl interfaceC3011cl3 = this.f11193a;
        if (interfaceC3011cl3 != null) {
            interfaceC3011cl3.mo8176a(script);
        } else {
            kotlin.jvm.internal.OooOo.OooOO0o("javascriptEngine");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3597rk(Context context, InterfaceC3011cl javascriptEngine) {
        this(context);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(javascriptEngine, "javascriptEngine");
        this.f11193a = javascriptEngine;
    }

    public /* synthetic */ C3597rk(Context context, InterfaceC3011cl interfaceC3011cl, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(context, (i & 2) != 0 ? new InterfaceC3011cl.a(0, 1, null) : interfaceC3011cl);
    }
}
