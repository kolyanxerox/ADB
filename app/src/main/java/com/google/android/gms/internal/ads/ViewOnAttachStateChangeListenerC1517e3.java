package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.e3 */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC1517e3 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: Oooo0O0 */
    public static final long f18463Oooo0O0 = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17806o000O00)).longValue();

    /* renamed from: OooOo */
    public final PowerManager f18464OooOo;

    /* renamed from: OooOo0O */
    public final Context f18465OooOo0O;

    /* renamed from: OooOo0o */
    public final Application f18466OooOo0o;

    /* renamed from: OooOoO */
    public C2291z1 f18467OooOoO;

    /* renamed from: OooOoO0 */
    public final KeyguardManager f18468OooOoO0;

    /* renamed from: OooOoOO */
    public WeakReference f18469OooOoOO;

    /* renamed from: OooOoo */
    public final C1958q1 f18470OooOoo;

    /* renamed from: OooOoo0 */
    public final WeakReference f18471OooOoo0;

    /* renamed from: Oooo0 */
    public final Rect f18474Oooo0;

    /* renamed from: Oooo00o */
    public final DisplayMetrics f18477Oooo00o;

    /* renamed from: OooOooO */
    public final zzbx f18472OooOooO = new zzbx(f18463Oooo0O0);

    /* renamed from: OooOooo */
    public boolean f18473OooOooo = false;

    /* renamed from: Oooo000 */
    public int f18475Oooo000 = -1;

    /* renamed from: Oooo00O */
    public final HashSet f18476Oooo00O = new HashSet();

    public ViewOnAttachStateChangeListenerC1517e3(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f18465OooOo0O = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f18464OooOo = (PowerManager) applicationContext.getSystemService("power");
        this.f18468OooOoO0 = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f18466OooOo0o = application;
            this.f18470OooOoo = new C1958q1(application, this);
        }
        this.f18477Oooo00o = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f18474Oooo0 = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f18471OooOoo0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            OooO0o(view2);
        }
        this.f18471OooOoo0 = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                OooO0o0(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect OooO00o(Rect rect) {
        float f = rect.left;
        float f2 = this.f18477Oooo00o.density;
        return new Rect((int) (f / f2), (int) (rect.top / f2), (int) (rect.right / f2), (int) (rect.bottom / f2));
    }

    public final void OooO0O0(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.f18471OooOoo0;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f18475Oooo000 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0134, code lost:
    
        if (r10 == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0136, code lost:
    
        r4 = 1;
        r14 = true;
        r15 = true;
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0159, code lost:
    
        if (r10 == 0) goto L183;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r27v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(int r31) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC1517e3.OooO0OO(int):void");
    }

    public final void OooO0Oo() {
        zzs.zza.post(new RunnableC1442c1(this, 4));
    }

    public final void OooO0o(View view) {
        try {
            WeakReference weakReference = this.f18469OooOoOO;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f18469OooOoOO = null;
            }
        } catch (Exception e) {
            zzo.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzo.zzh("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f18467OooOoO != null) {
            try {
                zzv.zzw().zzd(this.f18465OooOo0O, this.f18467OooOoO);
            } catch (IllegalStateException e3) {
                zzo.zzh("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzv.zzp().OooO0oo("ActiveViewUnit.stopScreenStatusMonitoring", e4);
            }
            this.f18467OooOoO = null;
        }
        Application application = this.f18466OooOo0o;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f18470OooOoo);
            } catch (Exception e5) {
                zzo.zzh("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void OooO0o0(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f18469OooOoOO = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f18467OooOoO == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f18467OooOoO = new C2291z1(this, 1);
            zzv.zzw().zzc(this.f18465OooOo0O, this.f18467OooOoO, intentFilter);
        }
        Application application = this.f18466OooOo0o;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f18470OooOoo);
            } catch (Exception e) {
                zzo.zzh("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        OooO0O0(activity, 0);
        OooO0OO(3);
        OooO0Oo();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        OooO0OO(3);
        OooO0Oo();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        OooO0O0(activity, 4);
        OooO0OO(3);
        OooO0Oo();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        OooO0O0(activity, 0);
        OooO0OO(3);
        OooO0Oo();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        OooO0OO(3);
        OooO0Oo();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        OooO0O0(activity, 0);
        OooO0OO(3);
        OooO0Oo();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        OooO0OO(3);
        OooO0Oo();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        OooO0OO(2);
        OooO0Oo();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        OooO0OO(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f18475Oooo000 = -1;
        OooO0o0(view);
        OooO0OO(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f18475Oooo000 = -1;
        OooO0OO(3);
        OooO0Oo();
        OooO0o(view);
    }
}
