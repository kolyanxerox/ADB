package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC1500dm;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzck {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final View f16272OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public Activity f16273OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f16274OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16275OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f16276OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f16277OooO0o0;

    public zzck(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f16273OooO0O0 = activity;
        this.f16272OooO00o = view;
        this.f16276OooO0o = onGlobalLayoutListener;
    }

    public final void OooO00o() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (this.f16274OooO0OO) {
            return;
        }
        Activity activity = this.f16273OooO0O0;
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f16276OooO0o;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        com.google.android.gms.ads.internal.zzv.zzy();
        ViewTreeObserverOnGlobalLayoutListenerC1500dm viewTreeObserverOnGlobalLayoutListenerC1500dm = new ViewTreeObserverOnGlobalLayoutListenerC1500dm(this.f16272OooO00o, onGlobalLayoutListener);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC1500dm.f23178OooOo0O).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC1500dm.o00000oo(viewTreeObserver2);
        }
        this.f16274OooO0OO = true;
    }

    public final void zza() {
        View decorView;
        this.f16277OooO0o0 = false;
        Activity activity = this.f16273OooO0O0;
        if (activity != null && this.f16274OooO0OO) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f16276OooO0o);
            }
            this.f16274OooO0OO = false;
        }
    }

    public final void zzb() {
        this.f16277OooO0o0 = true;
        if (this.f16275OooO0Oo) {
            OooO00o();
        }
    }

    public final void zzc() {
        this.f16275OooO0Oo = true;
        if (this.f16277OooO0o0) {
            OooO00o();
        }
    }

    public final void zzd() {
        View decorView;
        this.f16275OooO0Oo = false;
        Activity activity = this.f16273OooO0O0;
        if (activity != null && this.f16274OooO0OO) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f16276OooO0o);
            }
            this.f16274OooO0OO = false;
        }
    }

    public final void zze(Activity activity) {
        this.f16273OooO0O0 = activity;
    }
}
