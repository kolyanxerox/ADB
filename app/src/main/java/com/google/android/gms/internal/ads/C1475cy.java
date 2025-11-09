package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cy */
/* loaded from: classes2.dex */
public final class C1475cy implements InterfaceC2176vy {

    /* renamed from: OooO, reason: collision with root package name */
    public final C2322zw f18069OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f18070OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2213wy f18071OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final JSONObject f18072OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final z00 f18073OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final C1663i1 f18074OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final C2065sy f18075OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final C2320zu f18076OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final C1950pu f18077OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final kd0 f18078OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final VersionInfoParcel f18079OooOO0O;
    public final vd0 OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final ViewOnClickListenerC1586fz f18080OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final C1947pr f18081OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f18082OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final C2285yw f18083OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public final q10 f18084OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final hg0 f18085OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public final mf0 f18086OooOOoo;

    /* renamed from: OooOo00, reason: collision with root package name */
    public final x50 f18088OooOo00;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f18089OooOo0O;

    /* renamed from: OooOoo, reason: collision with root package name */
    public zzdd f18094OooOoo;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final C1512dz f18096OooOooO;
    public boolean OooOo0 = false;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f18090OooOo0o = false;

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f18087OooOo = false;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public Point f18092OooOoO0 = new Point();

    /* renamed from: OooOoO, reason: collision with root package name */
    public Point f18091OooOoO = new Point();

    /* renamed from: OooOoOO, reason: collision with root package name */
    public long f18093OooOoOO = 0;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public long f18095OooOoo0 = 0;

    public C1475cy(Context context, C2213wy c2213wy, JSONObject jSONObject, z00 z00Var, C2065sy c2065sy, C1663i1 c1663i1, C2320zu c2320zu, C1950pu c1950pu, C2322zw c2322zw, kd0 kd0Var, VersionInfoParcel versionInfoParcel, vd0 vd0Var, C1947pr c1947pr, ViewOnClickListenerC1586fz viewOnClickListenerC1586fz, Oooo0OO.o00Ooo o00ooo2, C2285yw c2285yw, hg0 hg0Var, mf0 mf0Var, x50 x50Var, q10 q10Var, C1512dz c1512dz) {
        this.f18070OooO00o = context;
        this.f18071OooO0O0 = c2213wy;
        this.f18072OooO0OO = jSONObject;
        this.f18073OooO0Oo = z00Var;
        this.f18075OooO0o0 = c2065sy;
        this.f18074OooO0o = c1663i1;
        this.f18076OooO0oO = c2320zu;
        this.f18077OooO0oo = c1950pu;
        this.f18069OooO = c2322zw;
        this.f18078OooOO0 = kd0Var;
        this.f18079OooOO0O = versionInfoParcel;
        this.OooOO0o = vd0Var;
        this.f18081OooOOO0 = c1947pr;
        this.f18080OooOOO = viewOnClickListenerC1586fz;
        this.f18082OooOOOO = o00ooo2;
        this.f18083OooOOOo = c2285yw;
        this.f18085OooOOo0 = hg0Var;
        this.f18086OooOOoo = mf0Var;
        this.f18088OooOo00 = x50Var;
        this.f18084OooOOo = q10Var;
        this.f18096OooOooO = c1512dz;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO(String str) throws JSONException {
        OooOo(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO00o(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f18070OooO00o;
        OooOo0O(zzbv.zzg(context, view), zzbv.zzd(context, map, map2, view, scaleType), zzbv.zzf(view), zzbv.zze(context, view), OooOOoo(view), null, zzbv.zzh(context, this.f18078OooOO0), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0O0() {
        this.f18087OooOo = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0OO(View view, Map map, Map map2, InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz, InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz2) {
        this.f18092OooOoO0 = new Point();
        this.f18091OooOoO = new Point();
        if (!this.f18089OooOo0O) {
            this.f18083OooOOOo.o00000oo(view);
            this.f18089OooOo0O = true;
        }
        view.setOnTouchListener(interfaceViewOnClickListenerC1881nz);
        view.setClickable(true);
        view.setOnClickListener(interfaceViewOnClickListenerC1881nz2);
        C1947pr c1947pr = this.f18081OooOOO0;
        c1947pr.getClass();
        c1947pr.f23408OooOooo = new WeakReference(this);
        boolean zZzi = zzbv.zzi(this.f18079OooOO0O.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(interfaceViewOnClickListenerC1881nz);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(interfaceViewOnClickListenerC1881nz2);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(interfaceViewOnClickListenerC1881nz);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0Oo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f18070OooO00o;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = zzbv.zzg(context, view2);
        JSONObject jSONObjectZzf = zzbv.zzf(view2);
        JSONObject jSONObjectZze = zzbv.zze(context, view2);
        String strOooOo00 = OooOo00(map, view);
        OooOo(true == ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17908o00OOooO)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strOooOo00, zzbv.zzc(strOooOo00, context, this.f18091OooOoO, this.f18092OooOoO0), null, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o(android.view.View r17, android.view.View r18, java.util.Map r19, java.util.Map r20, boolean r21, android.widget.ImageView.ScaleType r22, int r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1475cy.OooO0o(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean, android.widget.ImageView$ScaleType, int):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0o0(Bundle bundle) throws JSONException {
        if (bundle == null) {
            zzo.zze("Click data is null. No click is reported.");
        } else if (!OooOo0("click_reporting")) {
            zzo.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            OooOo(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzbc.zzb().zzk(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0oO(InterfaceC2263ya interfaceC2263ya) {
        if (!this.f18072OooO0OO.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzo.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC1586fz viewOnClickListenerC1586fz = this.f18080OooOOO;
        viewOnClickListenerC1586fz.f19144OooOo = interfaceC2263ya;
        C1895ob c1895ob = viewOnClickListenerC1586fz.f19148OooOoO0;
        z00 z00Var = viewOnClickListenerC1586fz.f19145OooOo0O;
        if (c1895ob != null) {
            z00Var.OooO0Oo("/unconfirmedClick", c1895ob);
        }
        C1895ob c1895ob2 = new C1895ob(4, viewOnClickListenerC1586fz, interfaceC2263ya);
        viewOnClickListenerC1586fz.f19148OooOoO0 = c1895ob2;
        z00Var.OooO0OO("/unconfirmedClick", c1895ob2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0oo(zzdd zzddVar) {
        this.f18094OooOoo = zzddVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOO0(View view) {
        if (!this.f18072OooO0OO.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzo.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            ViewOnClickListenerC1586fz viewOnClickListenerC1586fz = this.f18080OooOOO;
            view.setOnClickListener(viewOnClickListenerC1586fz);
            view.setClickable(true);
            viewOnClickListenerC1586fz.f19150OooOoo0 = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final boolean OooOO0O(Bundle bundle) {
        if (OooOo0("impression_reporting")) {
            return OooOo0O(null, null, null, null, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo0O0)).booleanValue() ? OooOOoo(null) : null, zzbc.zzb().zzk(bundle, null), false, null);
        }
        zzo.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOO0o(View view) {
        this.f18092OooOoO0 = new Point();
        this.f18091OooOoO = new Point();
        if (view != null) {
            C2285yw c2285yw = this.f18083OooOOOo;
            synchronized (c2285yw) {
                if (c2285yw.f26031OooOo.containsKey(view)) {
                    ((ViewOnAttachStateChangeListenerC1517e3) c2285yw.f26031OooOo.get(view)).f18476Oooo00O.remove(c2285yw);
                    c2285yw.f26031OooOo.remove(view);
                }
            }
        }
        this.f18089OooOo0O = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final JSONObject OooOOO(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f18070OooO00o;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = zzbv.zzg(context, view);
        JSONObject jSONObjectZzf = zzbv.zzf(view);
        JSONObject jSONObjectZze = zzbv.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e) {
            zzo.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOOO0(Bundle bundle) {
        if (bundle == null) {
            zzo.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!OooOo0("touch_reporting")) {
            zzo.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f18074OooO0o.f19893OooO0O0.zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOOOO(MotionEvent motionEvent, View view) {
        this.f18092OooOoO0 = zzbv.zza(motionEvent, view);
        ((Oooo0OO.oo000o) this.f18082OooOOOO).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f18095OooOoo0 = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f18084OooOOo.f23479OooO00o = motionEvent;
            this.f18093OooOoOO = jCurrentTimeMillis;
            this.f18091OooOoO = this.f18092OooOoO0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f18092OooOoO0;
        motionEventObtain.setLocation(point.x, point.y);
        this.f18074OooO0o.f19893OooO0O0.zzk(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final boolean OooOOOo() {
        return this.f18072OooO0OO.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final JSONObject OooOOo(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectOooOOO = OooOOO(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f18087OooOo && this.f18072OooO0OO.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectOooOOO != null) {
                jSONObject.put("nas", jSONObjectOooOOO);
                return jSONObject;
            }
        } catch (JSONException e) {
            zzo.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOOo0(zzdh zzdhVar) {
        zzez zzezVar;
        zzez zzezVar2;
        try {
            if (this.f18090OooOo0o) {
                return;
            }
            mf0 mf0Var = this.f18086OooOOoo;
            kd0 kd0Var = this.f18078OooOO0;
            hg0 hg0Var = this.f18085OooOOo0;
            if (zzdhVar == null) {
                C2065sy c2065sy = this.f18075OooO0o0;
                synchronized (c2065sy) {
                    zzezVar = c2065sy.f24185OooO0oO;
                }
                if (zzezVar != null) {
                    this.f18090OooOo0o = true;
                    synchronized (c2065sy) {
                        zzezVar2 = c2065sy.f24185OooO0oO;
                    }
                    hg0Var.OooO0O0(zzezVar2.zzf(), kd0Var.f20552o0OOO0o, mf0Var);
                    OooOo0o();
                    return;
                }
            }
            this.f18090OooOo0o = true;
            hg0Var.OooO0O0(zzdhVar.zzf(), kd0Var.f20552o0OOO0o, mf0Var);
            OooOo0o();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final String OooOOoo(View view) {
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17901o00OOOO)).booleanValue()) {
            return null;
        }
        try {
            return this.f18074OooO0o.f19893OooO0O0.zzh(this.f18070OooO00o, view, null);
        } catch (Exception unused) {
            zzo.zzg("Exception getting data.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo(android.view.View r13, org.json.JSONObject r14, org.json.JSONObject r15, org.json.JSONObject r16, org.json.JSONObject r17, java.lang.String r18, org.json.JSONObject r19, org.json.JSONObject r20, boolean r21, boolean r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1475cy.OooOo(android.view.View, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, java.lang.String, org.json.JSONObject, org.json.JSONObject, boolean, boolean):void");
    }

    public final boolean OooOo0(String str) {
        JSONObject jSONObjectOptJSONObject = this.f18072OooO0OO.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    public final String OooOo00(Map map, View view) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iOooO0oO = this.f18075OooO0o0.OooO0oO();
        if (iOooO0oO == 1) {
            return "1099";
        }
        if (iOooO0oO == 2) {
            return "2099";
        }
        if (iOooO0oO != 6) {
            return null;
        }
        return "3099";
    }

    public final boolean OooOo0O(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) throws JSONException {
        Context context = this.f18070OooO00o;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f18072OooO0OO);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17901o00OOOO)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            JSONObject jSONObject7 = new JSONObject();
            zzv.zzq();
            DisplayMetrics displayMetricsZzu = zzs.zzu((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzbc.zzb().zzb(context, displayMetricsZzu.widthPixels));
                jSONObject7.put("height", zzbc.zzb().zzb(context, displayMetricsZzu.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0o0)).booleanValue();
            z00 z00Var = this.f18073OooO0Oo;
            if (zBooleanValue) {
                z00Var.OooO0OO("/clickRecorded", new C1402ay(this, 1));
            } else {
                z00Var.OooO0OO("/logScionEvent", new C1402ay(this, 0));
            }
            z00Var.OooO0OO("/nativeImpression", new C1895ob(this, view));
            ze0.OooOOo0(z00Var.OooO00o("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.OooOo0) {
                return true;
            }
            this.OooOo0 = zzv.zzt().zzn(context, this.f18079OooOO0O.afmaVersion, this.f18078OooOO0.f20511OooOoo.toString(), this.OooOO0o.f24955OooO0o);
            return true;
        } catch (JSONException e) {
            zzo.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final void OooOo0o() {
        try {
            zzdd zzddVar = this.f18094OooOoo;
            if (zzddVar != null) {
                zzddVar.zze();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final boolean zzB() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOO0o)).booleanValue()) {
            return this.OooOO0o.f24950OooO.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final int zza() {
        vd0 vd0Var = this.OooOO0o;
        if (vd0Var.f24950OooO == null) {
            return 0;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOO0o)).booleanValue()) {
            return vd0Var.f24950OooO.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void zzi() {
        View view;
        if (this.f18072OooO0OO.optBoolean("custom_one_point_five_click_enabled", false)) {
            ViewOnClickListenerC1586fz viewOnClickListenerC1586fz = this.f18080OooOOO;
            if (viewOnClickListenerC1586fz.f19144OooOo == null || viewOnClickListenerC1586fz.f19149OooOoOO == null) {
                return;
            }
            viewOnClickListenerC1586fz.f19147OooOoO = null;
            viewOnClickListenerC1586fz.f19149OooOoOO = null;
            WeakReference weakReference = viewOnClickListenerC1586fz.f19150OooOoo0;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                viewOnClickListenerC1586fz.f19150OooOoo0 = null;
            }
            try {
                viewOnClickListenerC1586fz.f19144OooOo.zze();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void zzj() {
        z00 z00Var = this.f18073OooO0Oo;
        synchronized (z00Var) {
            ep0 ep0Var = z00Var.f26061OooOOO0;
            if (ep0Var == null) {
                return;
            }
            C1658hx c1658hx = new C1658hx(2, (byte) 0);
            ep0Var.addListener(new wp0(0, ep0Var, c1658hx), z00Var.f26056OooO0o0);
            z00Var.f26061OooOOO0 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void zzq() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f18072OooO0OO);
            ze0.OooOOo0(this.f18073OooO0Oo.OooO00o("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void zzs() throws JSONException {
        OooOo0O(null, null, null, null, null, null, false, null);
    }
}
