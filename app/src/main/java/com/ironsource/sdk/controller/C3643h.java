package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.C3034d9;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3722u5;
import com.ironsource.InterfaceC3742up;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.sdk.controller.C3657v;

/* renamed from: com.ironsource.sdk.controller.h */
/* loaded from: classes2.dex */
public class C3643h extends FrameLayout implements InterfaceC3742up {

    /* renamed from: a */
    private Context f11547a;

    /* renamed from: b */
    private C3657v f11548b;

    /* renamed from: c */
    private final InterfaceC3767vf f11549c;

    /* renamed from: com.ironsource.sdk.controller.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = C3643h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(C3643h.this);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.h$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = C3643h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(C3643h.this);
            }
        }
    }

    public C3643h(Context context) {
        super(context);
        this.f11549c = C3495on.m11199U().mo8686f();
        this.f11547a = context;
        setClickable(true);
    }

    /* renamed from: b */
    private void m12034b() {
        ((Activity) this.f11547a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f11547a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f11549c.mo4827H(activity) == 1) {
                int i = rect.bottom - rect2.bottom;
                if (i > 0) {
                    return i;
                }
                return 0;
            }
            int i2 = rect.right - rect2.right;
            if (i2 > 0) {
                return i2;
            }
            return 0;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return 0;
        }
    }

    @SuppressLint({"DiscouragedApi", "InternalInsetResource"})
    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f11547a;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f11547a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return 0;
        }
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f11547a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f11547a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11548b.m12191F();
        this.f11548b.m12208a(true, C3034d9.h.f8093Z);
    }

    @Override // com.ironsource.InterfaceC3742up
    public boolean onBackButtonPressed() {
        return C3722u5.m12540a().m12541a((Activity) this.f11547a);
    }

    @Override // com.ironsource.InterfaceC3742up
    public void onCloseRequested() {
        m12034b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11548b.m12187B();
        this.f11548b.m12208a(false, C3034d9.h.f8093Z);
        C3657v c3657v = this.f11548b;
        if (c3657v != null) {
            c3657v.m12203a(C3657v.u.Gone);
            this.f11548b.m12188C();
            this.f11548b.m12189D();
        }
        removeAllViews();
    }

    @Override // com.ironsource.InterfaceC3742up
    public void onOrientationChanged(String str, int i) {
    }

    /* renamed from: a */
    private void m12032a() {
        ((Activity) this.f11547a).runOnUiThread(new a());
    }

    /* renamed from: a */
    private void m12033a(int i, int i2) {
        try {
            Context context = this.f11547a;
            if (context != null) {
                int iMo4827H = this.f11549c.mo4827H(context);
                if (iMo4827H == 1) {
                    setPadding(0, i, 0, i2);
                } else if (iMo4827H == 2) {
                    setPadding(0, i, i2, 0);
                }
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* renamed from: a */
    public void m12035a(C3657v c3657v) {
        this.f11548b = c3657v;
        c3657v.m12204a(this);
        this.f11548b.m12190E();
        this.f11547a = this.f11548b.m12224q();
        m12033a(getStatusBarPadding(), getNavigationBarPadding());
        m12032a();
    }
}
