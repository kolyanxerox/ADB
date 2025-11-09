package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.a2 */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC1370a2 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: Oooo00o, reason: collision with root package name */
    public static final Handler f16878Oooo00o = new Handler(Looper.getMainLooper());

    /* renamed from: OooOo, reason: collision with root package name */
    public final PowerManager f16879OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f16880OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Application f16881OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public C2291z1 f16882OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final KeyguardManager f16883OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final zzavw f16884OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public WeakReference f16885OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public WeakReference f16886OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final C1958q1 f16887OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public byte f16888OooOooo = -1;

    /* renamed from: Oooo000, reason: collision with root package name */
    public int f16889Oooo000 = -1;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public long f16890Oooo00O = -3;

    public ViewOnAttachStateChangeListenerC1370a2(Context context, zzavw zzavwVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16880OooOo0O = applicationContext;
        this.f16884OooOoOO = zzavwVar;
        this.f16879OooOo = (PowerManager) applicationContext.getSystemService("power");
        this.f16883OooOoO0 = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f16881OooOo0o = application;
            this.f16887OooOooO = new C1958q1(application, this);
        }
        OooO00o(null);
    }

    public final void OooO00o(View view) {
        long j;
        WeakReference weakReference = this.f16885OooOoo;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            OooO0o0(view2);
        }
        this.f16885OooOoo = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                OooO0Oo(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f16890Oooo00O = j;
    }

    public final void OooO0O0(Activity activity, int i) {
        Window window;
        if (this.f16885OooOoo == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f16885OooOoo;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f16889Oooo000 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO() {
        /*
            r10 = this;
            r0 = 1
            java.lang.ref.WeakReference r1 = r10.f16885OooOoo
            if (r1 != 0) goto L7
            goto Lc2
        L7:
            r2 = 0
            if (r1 == 0) goto L11
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            goto L12
        L11:
            r1 = r2
        L12:
            r3 = -1
            r4 = -3
            if (r1 != 0) goto L1c
            r10.f16890Oooo00O = r4
            r10.f16888OooOooo = r3
            return
        L1c:
            int r6 = r1.getVisibility()
            r7 = 0
            if (r6 == 0) goto L25
            r6 = r0
            goto L26
        L25:
            r6 = r7
        L26:
            boolean r8 = r1.isShown()
            if (r8 != 0) goto L2e
            r6 = r6 | 2
        L2e:
            android.os.PowerManager r8 = r10.f16879OooOo
            if (r8 == 0) goto L3a
            boolean r8 = r8.isScreenOn()
            if (r8 != 0) goto L3a
            r6 = r6 | 4
        L3a:
            com.google.android.gms.internal.ads.zzavw r8 = r10.f16884OooOoOO
            boolean r8 = r8.f26398OooO00o
            if (r8 != 0) goto L88
            android.app.KeyguardManager r8 = r10.f16883OooOoO0
            if (r8 == 0) goto L86
            boolean r8 = r8.inKeyguardRestrictedInputMode()
            if (r8 == 0) goto L86
            char[] r8 = com.google.android.gms.internal.ads.AbstractC2217x1.f25494OooO00o
            android.view.View r8 = r1.getRootView()
            if (r8 != 0) goto L53
            r8 = r1
        L53:
            android.content.Context r8 = r8.getContext()
        L57:
            boolean r9 = r8 instanceof android.content.ContextWrapper
            if (r9 == 0) goto L6e
            r9 = 10
            if (r7 >= r9) goto L6e
            boolean r9 = r8 instanceof android.app.Activity
            if (r9 == 0) goto L66
            android.app.Activity r8 = (android.app.Activity) r8
            goto L6f
        L66:
            android.content.ContextWrapper r8 = (android.content.ContextWrapper) r8
            android.content.Context r8 = r8.getBaseContext()
            int r7 = r7 + r0
            goto L57
        L6e:
            r8 = r2
        L6f:
            if (r8 != 0) goto L72
            goto L86
        L72:
            android.view.Window r0 = r8.getWindow()
            if (r0 != 0) goto L79
            goto L7d
        L79:
            android.view.WindowManager$LayoutParams r2 = r0.getAttributes()
        L7d:
            if (r2 == 0) goto L86
            int r0 = r2.flags
            r2 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r2
            if (r0 != 0) goto L88
        L86:
            r6 = r6 | 8
        L88:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getGlobalVisibleRect(r0)
            if (r0 != 0) goto L95
            r6 = r6 | 16
        L95:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getLocalVisibleRect(r0)
            if (r0 != 0) goto La2
            r6 = r6 | 32
        La2:
            int r0 = r1.getWindowVisibility()
            int r1 = r10.f16889Oooo000
            if (r1 == r3) goto Lab
            r0 = r1
        Lab:
            if (r0 == 0) goto Laf
            r6 = r6 | 64
        Laf:
            byte r0 = r10.f16888OooOooo
            if (r0 == r6) goto Lc2
            byte r0 = (byte) r6
            r10.f16888OooOooo = r0
            if (r6 != 0) goto Lbd
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lc0
        Lbd:
            long r0 = (long) r6
            long r0 = r4 - r0
        Lc0:
            r10.f16890Oooo00O = r0
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC1370a2.OooO0OO():void");
    }

    public final void OooO0Oo(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f16886OooOoo0 = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f16882OooOoO == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C2291z1 c2291z1 = new C2291z1(this, 0);
            this.f16882OooOoO = c2291z1;
            this.f16880OooOo0O.registerReceiver(c2291z1, intentFilter);
        }
        Application application = this.f16881OooOo0o;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f16887OooOooO);
            } catch (Exception unused) {
            }
        }
    }

    public final void OooO0o0(View view) {
        try {
            WeakReference weakReference = this.f16886OooOoo0;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f16886OooOoo0 = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        C2291z1 c2291z1 = this.f16882OooOoO;
        if (c2291z1 != null) {
            try {
                this.f16880OooOo0O.unregisterReceiver(c2291z1);
            } catch (Exception unused3) {
            }
            this.f16882OooOoO = null;
        }
        Application application = this.f16881OooOo0o;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f16887OooOooO);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        OooO0O0(activity, 0);
        OooO0OO();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        OooO0OO();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        OooO0O0(activity, 4);
        OooO0OO();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        OooO0O0(activity, 0);
        OooO0OO();
        f16878Oooo00o.post(new RunnableC1442c1(this, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        OooO0OO();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        OooO0O0(activity, 0);
        OooO0OO();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        OooO0OO();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        OooO0OO();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        OooO0OO();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f16889Oooo000 = -1;
        OooO0Oo(view);
        OooO0OO();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f16889Oooo000 = -1;
        OooO0OO();
        f16878Oooo00o.post(new RunnableC1442c1(this, 2));
        OooO0o0(view);
    }
}
