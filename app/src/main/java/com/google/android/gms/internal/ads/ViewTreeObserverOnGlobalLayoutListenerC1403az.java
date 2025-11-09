package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.az */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1403az extends AbstractBinderC1818m9 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC1881nz {

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public static final gn0 f17125Oooo0O0;

    /* renamed from: OooOo, reason: collision with root package name */
    public FrameLayout f17126OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f17127OooOo0O;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final C2163vl f17129OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public FrameLayout f17130OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public View f17131OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public C1917oy f17132OooOoo;

    /* renamed from: OooOooO, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC1517e3 f17134OooOooO;

    /* renamed from: Oooo0, reason: collision with root package name */
    public GestureDetector f17136Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public InterfaceC1634h9 f17137Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public boolean f17138Oooo00O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public HashMap f17128OooOo0o = new HashMap();

    /* renamed from: OooOooo, reason: collision with root package name */
    public Oooo0o.OooO0O0 f17135OooOooo = null;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public boolean f17139Oooo00o = false;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final int f17133OooOoo0 = 244410000;

    static {
        pm0 pm0Var = rm0.f23913OooOo0o;
        Object[] objArr = {"2011", "1009", "3010"};
        ii0.OooOooo(3, objArr);
        f17125Oooo0O0 = rm0.OooOOO(3, objArr);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1403az(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f17126OooOo = frameLayout;
        this.f17130OooOoO0 = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f17127OooOo0O = str;
        zzv.zzy();
        ViewTreeObserverOnGlobalLayoutListenerC1500dm viewTreeObserverOnGlobalLayoutListenerC1500dm = new ViewTreeObserverOnGlobalLayoutListenerC1500dm(frameLayout, this);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC1500dm.f23178OooOo0O).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC1500dm.o00000oo(viewTreeObserver3);
        }
        zzv.zzy();
        ViewTreeObserverOnScrollChangedListenerC1536em viewTreeObserverOnScrollChangedListenerC1536em = new ViewTreeObserverOnScrollChangedListenerC1536em(frameLayout, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC1536em.f23178OooOo0O).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC1536em.o00000oo(viewTreeObserver2);
        }
        this.f17129OooOoO = AbstractC2200wl.f25325OooO0o;
        this.f17134OooOooO = new ViewOnAttachStateChangeListenerC1517e3(this.f17126OooOo.getContext(), this.f17126OooOo);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized void OooOOO(String str, View view) {
        if (!this.f17139Oooo00o) {
            if (view == null) {
                this.f17128OooOo0o.remove(str);
                return;
            }
            this.f17128OooOo0o.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (zzbv.zzi(this.f17133OooOoo0)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final synchronized void o000O0O0(String str) {
        DisplayMetrics displayMetrics;
        try {
            FrameLayout frameLayout = new FrameLayout(this.f17130OooOoO0.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f17130OooOoO0.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        zzo.zzk("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.f17130OooOoO0.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o000O0o0() {
        int iZza;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOO0o)).booleanValue()) {
            C1917oy c1917oy = this.f17132OooOoo;
            synchronized (c1917oy) {
                iZza = c1917oy.OooOO0o.zza();
            }
            if (iZza != 0) {
                this.f17136Oooo0 = new GestureDetector(this.f17126OooOo.getContext(), new GestureDetectorOnGestureListenerC1549ez(this.f17132OooOoo, this));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean zZzB;
        C1917oy c1917oy = this.f17132OooOoo;
        if (c1917oy != null) {
            synchronized (c1917oy) {
                zZzB = c1917oy.OooOO0o.zzB();
            }
            if (zZzB) {
                C1917oy c1917oy2 = this.f17132OooOoo;
                synchronized (c1917oy2) {
                    c1917oy2.OooOO0o.zzi();
                }
                this.f17132OooOoo.OooO0OO(view, this.f17126OooOo, zzl(), zzm(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C1917oy c1917oy = this.f17132OooOoo;
        if (c1917oy != null) {
            FrameLayout frameLayout = this.f17126OooOo;
            c1917oy.OooO0O0(frameLayout, zzl(), zzm(), C1917oy.OooO0oo(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C1917oy c1917oy = this.f17132OooOoo;
        if (c1917oy != null) {
            FrameLayout frameLayout = this.f17126OooOo;
            c1917oy.OooO0O0(frameLayout, zzl(), zzm(), C1917oy.OooO0oo(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int iZza;
        C1917oy c1917oy = this.f17132OooOoo;
        if (c1917oy != null) {
            FrameLayout frameLayout = this.f17126OooOo;
            synchronized (c1917oy) {
                c1917oy.OooOO0o.OooOOOO(motionEvent, frameLayout);
            }
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOO0o)).booleanValue() && this.f17136Oooo0 != null) {
                C1917oy c1917oy2 = this.f17132OooOoo;
                synchronized (c1917oy2) {
                    iZza = c1917oy2.OooOO0o.zza();
                }
                if (iZza != 0) {
                    this.f17136Oooo0.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final synchronized Oooo0o.OooO0O0 zzb(String str) {
        return new Oooo0o.OooO0OO(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final synchronized void zzc() {
        try {
            if (this.f17139Oooo00o) {
                return;
            }
            C1917oy c1917oy = this.f17132OooOoo;
            if (c1917oy != null) {
                c1917oy.OooO0oO(this);
                this.f17132OooOoo = null;
            }
            this.f17128OooOo0o.clear();
            this.f17126OooOo.removeAllViews();
            this.f17130OooOoO0.removeAllViews();
            this.f17128OooOo0o = null;
            this.f17126OooOo = null;
            this.f17130OooOoO0 = null;
            this.f17131OooOoOO = null;
            this.f17134OooOooO = null;
            this.f17139Oooo00o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final void zzd(Oooo0o.OooO0O0 oooO0O0) {
        onTouch(this.f17126OooOo, (MotionEvent) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final synchronized void zzdt(String str, Oooo0o.OooO0O0 oooO0O0) {
        OooOOO(str, (View) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final synchronized void zzdu(Oooo0o.OooO0O0 oooO0O0) {
        C1917oy c1917oy = this.f17132OooOoo;
        View view = (View) Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        synchronized (c1917oy) {
            c1917oy.OooOO0o.OooOO0(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final synchronized void zzdv(InterfaceC1634h9 interfaceC1634h9) {
        if (!this.f17139Oooo00o) {
            this.f17138Oooo00O = true;
            this.f17137Oooo000 = interfaceC1634h9;
            C1917oy c1917oy = this.f17132OooOoo;
            if (c1917oy != null) {
                C1991qy c1991qy = c1917oy.f23155OooOoo;
                synchronized (c1991qy) {
                    c1991qy.f23708OooO00o = interfaceC1634h9;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final synchronized void zzdw(Oooo0o.OooO0O0 oooO0O0) {
        if (this.f17139Oooo00o) {
            return;
        }
        this.f17135OooOooo = oooO0O0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final synchronized void zzdx(Oooo0o.OooO0O0 oooO0O0) {
        if (this.f17139Oooo00o) {
            return;
        }
        Object objO000O0oO = Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        if (!(objO000O0oO instanceof C1917oy)) {
            zzo.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        C1917oy c1917oy = this.f17132OooOoo;
        if (c1917oy != null) {
            c1917oy.OooO0oO(this);
        }
        synchronized (this) {
            this.f17129OooOoO.execute(new RunnableC1442c1(this, 28));
            C1917oy c1917oy2 = (C1917oy) objO000O0oO;
            this.f17132OooOoo = c1917oy2;
            c1917oy2.OooO0o(this);
            this.f17132OooOoo.OooO0o0(this.f17126OooOo);
            C1917oy c1917oy3 = this.f17132OooOoo;
            FrameLayout frameLayout = this.f17130OooOoO0;
            f60 f60VarOooOOOO = c1917oy3.f23140OooOO0O.OooOOOO();
            if (c1917oy3.f23141OooOOO.OooO0OO() && f60VarOooOOOO != null && frameLayout != null) {
                C1658hx c1658hx = (C1658hx) zzv.zzB();
                yg0 yg0Var = f60VarOooOOOO.f18791OooO00o;
                c1658hx.getClass();
                C1658hx.OooOOOo(new z50(yg0Var, frameLayout, 0));
            }
            if (this.f17138Oooo00O) {
                C1991qy c1991qy = this.f17132OooOoo.f23155OooOoo;
                InterfaceC1634h9 interfaceC1634h9 = this.f17137Oooo000;
                synchronized (c1991qy) {
                    c1991qy.f23708OooO00o = interfaceC1634h9;
                }
            }
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17932o0oOO)).booleanValue() && !TextUtils.isEmpty(this.f17132OooOoo.f23141OooOOO.OooO0O0())) {
                o000O0O0(this.f17132OooOoo.f23141OooOOO.OooO0O0());
            }
            o000O0o0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final synchronized void zze(Oooo0o.OooO0O0 oooO0O0, int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final /* synthetic */ View zzf() {
        return this.f17126OooOo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.f17139Oooo00o && (weakReference = (WeakReference) this.f17128OooOo0o.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final FrameLayout zzh() {
        return this.f17130OooOoO0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final ViewOnAttachStateChangeListenerC1517e3 zzi() {
        return this.f17134OooOooO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final Oooo0o.OooO0O0 zzj() {
        return this.f17135OooOooo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized String zzk() {
        return this.f17127OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized Map zzl() {
        return this.f17128OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized Map zzm() {
        return this.f17128OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized JSONObject zzo() {
        JSONObject jSONObjectOooOOO;
        C1917oy c1917oy = this.f17132OooOoo;
        if (c1917oy == null) {
            return null;
        }
        FrameLayout frameLayout = this.f17126OooOo;
        Map mapZzl = zzl();
        Map mapZzm = zzm();
        synchronized (c1917oy) {
            jSONObjectOooOOO = c1917oy.OooOO0o.OooOOO(frameLayout, mapZzl, mapZzm, c1917oy.OooOO0());
        }
        return jSONObjectOooOOO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz
    public final synchronized JSONObject zzp() {
        JSONObject jSONObjectOooOOo;
        C1917oy c1917oy = this.f17132OooOoo;
        if (c1917oy == null) {
            return null;
        }
        FrameLayout frameLayout = this.f17126OooOo;
        Map mapZzl = zzl();
        Map mapZzm = zzm();
        synchronized (c1917oy) {
            jSONObjectOooOOo = c1917oy.OooOO0o.OooOOo(frameLayout, mapZzl, mapZzm, c1917oy.OooOO0());
        }
        return jSONObjectOooOOo;
    }
}
