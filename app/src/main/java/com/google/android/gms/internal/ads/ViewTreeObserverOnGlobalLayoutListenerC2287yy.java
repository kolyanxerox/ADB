package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yy */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2287yy extends AbstractBinderC2077t9 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC1881nz {

    /* renamed from: OooOo0O */
    public final WeakReference f26037OooOo0O;

    /* renamed from: OooOoO */
    public C1917oy f26039OooOoO;

    /* renamed from: OooOoOO */
    public final ViewOnAttachStateChangeListenerC1517e3 f26041OooOoOO;

    /* renamed from: OooOo0o */
    public final HashMap f26038OooOo0o = new HashMap();

    /* renamed from: OooOo */
    public final HashMap f26036OooOo = new HashMap();

    /* renamed from: OooOoO0 */
    public final HashMap f26040OooOoO0 = new HashMap();

    public ViewTreeObserverOnGlobalLayoutListenerC2287yy(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzv.zzy();
        ViewTreeObserverOnGlobalLayoutListenerC1500dm viewTreeObserverOnGlobalLayoutListenerC1500dm = new ViewTreeObserverOnGlobalLayoutListenerC1500dm(view, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC1500dm.f23178OooOo0O).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC1500dm.o00000oo(viewTreeObserver3);
        }
        zzv.zzy();
        ViewTreeObserverOnScrollChangedListenerC1536em viewTreeObserverOnScrollChangedListenerC1536em = new ViewTreeObserverOnScrollChangedListenerC1536em(view, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC1536em.f23178OooOo0O).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC1536em.o00000oo(viewTreeObserver2);
        }
        this.f26037OooOo0O = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f26038OooOo0o.put(str, new WeakReference(view4));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f26040OooOoO0.putAll(this.f26038OooOo0o);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f26036OooOo.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f26040OooOoO0.putAll(this.f26036OooOo);
        this.f26041OooOoOO = new ViewOnAttachStateChangeListenerC1517e3(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized void OooOOO(String str, View view) {
        this.f26040OooOoO0.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.f26038OooOo0o.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C1917oy c1917oy = this.f26039OooOoO;
        if (c1917oy != null) {
            c1917oy.OooO0OO(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C1917oy c1917oy = this.f26039OooOoO;
        if (c1917oy != null) {
            c1917oy.OooO0O0(zzf(), zzl(), zzm(), C1917oy.OooO0oo(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C1917oy c1917oy = this.f26039OooOoO;
        if (c1917oy != null) {
            c1917oy.OooO0O0(zzf(), zzl(), zzm(), C1917oy.OooO0oo(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C1917oy c1917oy = this.f26039OooOoO;
        if (c1917oy != null) {
            View viewZzf = zzf();
            synchronized (c1917oy) {
                c1917oy.OooOO0o.OooOOOO(motionEvent, viewZzf);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2114u9
    public final synchronized void zzb(Oooo0o.OooO0O0 oooO0O0) {
        try {
            if (this.f26039OooOoO != null) {
                Object objO000O0oO = Oooo0o.OooO0OO.o000O0oO(oooO0O0);
                if (!(objO000O0oO instanceof View)) {
                    zzo.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                C1917oy c1917oy = this.f26039OooOoO;
                View view = (View) objO000O0oO;
                synchronized (c1917oy) {
                    c1917oy.OooOO0o.OooOO0(view);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2114u9
    public final synchronized void zzc(Oooo0o.OooO0O0 oooO0O0) {
        Object objO000O0oO = Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        if (!(objO000O0oO instanceof C1917oy)) {
            zzo.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        C1917oy c1917oy = this.f26039OooOoO;
        if (c1917oy != null) {
            c1917oy.OooO0oO(this);
        }
        C1917oy c1917oy2 = (C1917oy) objO000O0oO;
        if (!c1917oy2.f23141OooOOO.OooO0Oo()) {
            zzo.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f26039OooOoO = c1917oy2;
        c1917oy2.OooO0o(this);
        this.f26039OooOoO.OooO0o0(zzf());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2114u9
    public final synchronized void zzd() {
        C1917oy c1917oy = this.f26039OooOoO;
        if (c1917oy != null) {
            c1917oy.OooO0oO(this);
            this.f26039OooOoO = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final View zzf() {
        return (View) this.f26037OooOo0O.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.f26040OooOoO0.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final ViewOnAttachStateChangeListenerC1517e3 zzi() {
        return this.f26041OooOoOO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized Oooo0o.OooO0O0 zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized Map zzl() {
        return this.f26040OooOoO0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized Map zzm() {
        return this.f26038OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized Map zzn() {
        return this.f26036OooOo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized JSONObject zzp() {
        JSONObject jSONObjectOooOOo;
        C1917oy c1917oy = this.f26039OooOoO;
        if (c1917oy == null) {
            return null;
        }
        View viewZzf = zzf();
        Map mapZzl = zzl();
        Map mapZzm = zzm();
        synchronized (c1917oy) {
            jSONObjectOooOOo = c1917oy.OooOO0o.OooOOo(viewZzf, mapZzl, mapZzm, c1917oy.OooOO0());
        }
        return jSONObjectOooOOo;
    }
}
