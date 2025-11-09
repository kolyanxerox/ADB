package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.oy */
/* loaded from: classes2.dex */
public final class C1917oy extends AbstractC1397at {

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static final /* synthetic */ int f23138Oooo00O = 0;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final Executor f23139OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final C2065sy f23140OooOO0O;
    public final InterfaceC2176vy OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final C2139uy f23141OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final C1439bz f23142OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final C2213wy f23143OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final n31 f23144OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public final n31 f23145OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final n31 f23146OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public final n31 f23147OooOOoo;

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f23148OooOo;
    public AbstractBinderC2181w2 OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public final n31 f23149OooOo00;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f23150OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f23151OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final C1663i1 f23152OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final C2088tk f23153OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final VersionInfoParcel f23154OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final C1991qy f23155OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final Context f23156OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final d90 f23157OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final HashMap f23158OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final ArrayList f23159Oooo000;

    static {
        pm0 pm0Var = rm0.f23913OooOo0o;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        ii0.OooOooo(6, objArr);
        rm0.OooOOO(6, objArr);
    }

    public C1917oy(OooOOOo.o0ooOOo o0ooooo, Executor executor, C2065sy c2065sy, InterfaceC2176vy interfaceC2176vy, C1439bz c1439bz, C2139uy c2139uy, C2213wy c2213wy, n31 n31Var, n31 n31Var2, n31 n31Var3, n31 n31Var4, n31 n31Var5, C2088tk c2088tk, C1663i1 c1663i1, VersionInfoParcel versionInfoParcel, Context context, C1991qy c1991qy, d90 d90Var) {
        super(o0ooooo);
        this.f23139OooOO0 = executor;
        this.f23140OooOO0O = c2065sy;
        this.OooOO0o = interfaceC2176vy;
        this.f23142OooOOO0 = c1439bz;
        this.f23141OooOOO = c2139uy;
        this.f23143OooOOOO = c2213wy;
        this.f23144OooOOOo = n31Var;
        this.f23146OooOOo0 = n31Var2;
        this.f23145OooOOo = n31Var3;
        this.f23147OooOOoo = n31Var4;
        this.f23149OooOo00 = n31Var5;
        this.f23153OooOoO0 = c2088tk;
        this.f23152OooOoO = c1663i1;
        this.f23154OooOoOO = versionInfoParcel;
        this.f23156OooOoo0 = context;
        this.f23155OooOoo = c1991qy;
        this.f23157OooOooO = d90Var;
        this.f23158OooOooo = new HashMap();
        this.f23159Oooo000 = new ArrayList();
    }

    public static boolean OooO0oo(View view) {
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0o0o)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        zzv.zzq();
        long jZzx = zzs.zzx(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return jZzx >= ((long) ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0oO0)).intValue());
        }
        return false;
    }

    public final synchronized boolean OooO(Bundle bundle) {
        if (this.f23151OooOo0o) {
            return true;
        }
        boolean zOooOO0O = this.OooOO0o.OooOO0O(bundle);
        this.f23151OooOo0o = zOooOO0O;
        return zOooOO0O;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1397at
    public final void OooO00o() {
        RunnableC1806ly runnableC1806ly = new RunnableC1806ly(this, 0);
        Executor executor = this.f23139OooOO0;
        executor.execute(runnableC1806ly);
        if (this.f23140OooOO0O.OooO0oO() != 7) {
            InterfaceC2176vy interfaceC2176vy = this.OooOO0o;
            Objects.requireNonNull(interfaceC2176vy);
            executor.execute(new RunnableC1442c1(interfaceC2176vy, 27));
        }
        super.OooO00o();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void OooO0O0(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f23151OooOo0o     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L7
            goto L89
        L7:
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.f17833o000OooO     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.a7 r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r1.OooO00o(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.kd0 r0 = r3.f17100OooO0O0     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.f20554o0OoOo0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            java.util.HashMap r0 = r3.f23158OooOooo     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L44
            java.util.HashMap r2 = r3.f23158OooOooo     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L29
            goto L89
        L44:
            r4 = move-exception
            goto L90
        L46:
            if (r7 != 0) goto L8b
            com.google.android.gms.internal.ads.v6 r7 = com.google.android.gms.internal.ads.AbstractC1448c7.f17915o00Oo0oo     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.a7 r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = r0.OooO00o(r7)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L44
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L89
            if (r5 == 0) goto L89
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L44
        L64:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L89
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L44
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L44
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L44
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            boolean r0 = OooO0oo(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            r3.OooOO0o(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L89:
            monitor-exit(r3)
            return
        L8b:
            r3.OooOO0o(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L90:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1917oy.OooO0O0(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x0059, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:10:0x0012, B:12:0x001a, B:15:0x0027, B:16:0x002c, B:18:0x003e, B:21:0x0047, B:23:0x004d), top: B:32:0x0001, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void OooO0OO(android.view.View r8, android.view.View r9, java.util.Map r10, java.util.Map r11, boolean r12) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.bz r0 = r7.f23142OooOOO0     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.w2 r1 = r7.OooOo0     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.ads.iz r2 = r0.f17623OooO0o0     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L2c
            android.widget.FrameLayout r3 = r1.zzh()     // Catch: java.lang.Throwable -> L59
            if (r3 != 0) goto L12
            goto L2c
        L12:
            com.google.android.gms.internal.ads.uy r0 = r0.f17620OooO0OO     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0.OooO0o()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L2c
            android.widget.FrameLayout r0 = r1.zzh()     // Catch: com.google.android.gms.internal.ads.C2018ro -> L26 java.lang.Throwable -> L59
            android.view.View r1 = r2.OooO00o()     // Catch: com.google.android.gms.internal.ads.C2018ro -> L26 java.lang.Throwable -> L59
            r0.addView(r1)     // Catch: com.google.android.gms.internal.ads.C2018ro -> L26 java.lang.Throwable -> L59
            goto L2c
        L26:
            r0 = move-exception
            java.lang.String r1 = "web view can not be obtained"
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch: java.lang.Throwable -> L59
        L2c:
            android.widget.ImageView$ScaleType r6 = r7.OooOO0()     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.vy r0 = r7.OooOO0o     // Catch: java.lang.Throwable -> L59
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.OooO0Oo(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L59
            boolean r8 = r7.f23148OooOo     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L5c
            com.google.android.gms.internal.ads.sy r8 = r7.f23140OooOO0O     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.jo r9 = r8.OooOOO0()     // Catch: java.lang.Throwable -> L59
            if (r9 != 0) goto L47
            goto L5c
        L47:
            com.google.android.gms.internal.ads.jo r8 = r8.OooOOO0()     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L5c
            androidx.collection.ArrayMap r9 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L59
            r9.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r10 = "onSdkAdUserInteractionClick"
            r8.OooO0o(r10, r9)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r7)
            return
        L59:
            r0 = move-exception
            r8 = r0
            goto L5e
        L5c:
            monitor-exit(r7)
            return
        L5e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L59
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1917oy.OooO0OO(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void OooO0Oo(View view, int i) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOO0o)).booleanValue()) {
            AbstractBinderC2181w2 abstractBinderC2181w2 = this.OooOo0;
            if (abstractBinderC2181w2 == null) {
                zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                this.f23139OooOO0.execute(new OooooOo.oOOOoo00(this, view, abstractBinderC2181w2 instanceof ViewTreeObserverOnGlobalLayoutListenerC2287yy, i));
            }
        }
    }

    public final synchronized void OooO0o(InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17830o000OoOo)).booleanValue()) {
            zzs.zza.post(new RunnableC1769ky(this, interfaceViewOnClickListenerC1881nz, 0));
        } else {
            OooOOO(interfaceViewOnClickListenerC1881nz);
        }
    }

    public final void OooO0o0(View view) {
        C2274yl c2274yl;
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO0)).booleanValue();
        C2065sy c2065sy = this.f23140OooOO0O;
        if (!zBooleanValue || c2065sy.OooO0oO() == 3) {
            OooOOO0(view, c2065sy.OooOOOO());
            return;
        }
        synchronized (c2065sy) {
            c2274yl = c2065sy.f24189OooOOO;
        }
        if (c2274yl == null) {
            return;
        }
        C1548ey c1548ey = new C1548ey(this, false, view, 1);
        c2274yl.addListener(new wp0(0, c2274yl, c1548ey), this.f23139OooOO0);
    }

    public final synchronized void OooO0oO(InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17830o000OoOo)).booleanValue()) {
            zzs.zza.post(new RunnableC1769ky(this, interfaceViewOnClickListenerC1881nz, 1));
        } else {
            OooOOOO(interfaceViewOnClickListenerC1881nz);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    public final synchronized ImageView.ScaleType OooOO0() {
        ?? r0 = this.OooOo0;
        if (r0 == 0) {
            zzo.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        Oooo0o.OooO0O0 oooO0O0Zzj = r0.zzj();
        if (oooO0O0Zzj != null) {
            return (ImageView.ScaleType) Oooo0o.OooO0OO.o000O0oO(oooO0O0Zzj);
        }
        return C1439bz.f17616OooOO0O;
    }

    public final void OooOO0O() {
        o00000oO.OooOOO oooOOO;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO0)).booleanValue()) {
            OooOOo0("Google", true);
            return;
        }
        C2065sy c2065sy = this.f23140OooOO0O;
        synchronized (c2065sy) {
            oooOOO = c2065sy.f24190OooOOO0;
        }
        if (oooOOO == null) {
            return;
        }
        sj0 sj0Var = new sj0(this, 17);
        oooOOO.addListener(new wp0(0, oooOOO, sj0Var), this.f23139OooOO0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    public final synchronized void OooOO0o(View view, Map map, Map map2) {
        this.f23142OooOOO0.OooO00o(this.OooOo0);
        this.OooOO0o.OooO00o(view, map, map2, OooOO0());
        this.f23151OooOo0o = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    public final synchronized void OooOOO(InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz) {
        Iterator<String> itKeys;
        View view;
        InterfaceC1552f1 interfaceC1552f1;
        try {
            if (!this.f23150OooOo0O) {
                this.OooOo0 = (AbstractBinderC2181w2) interfaceViewOnClickListenerC1881nz;
                C1439bz c1439bz = this.f23142OooOOO0;
                c1439bz.f17624OooO0oO.execute(new wp0(c1439bz, interfaceViewOnClickListenerC1881nz));
                this.OooOO0o.OooO0OO(interfaceViewOnClickListenerC1881nz.zzf(), interfaceViewOnClickListenerC1881nz.zzm(), interfaceViewOnClickListenerC1881nz.zzn(), interfaceViewOnClickListenerC1881nz, interfaceViewOnClickListenerC1881nz);
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17867o00O0O00)).booleanValue() && (interfaceC1552f1 = this.f23152OooOoO.f19893OooO0O0) != null) {
                    interfaceC1552f1.zzo(interfaceViewOnClickListenerC1881nz.zzf());
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17833o000OooO)).booleanValue()) {
                    kd0 kd0Var = this.f17100OooO0O0;
                    if (kd0Var.f20554o0OoOo0 && (itKeys = kd0Var.f20544Ooooooo.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ?? r2 = this.OooOo0;
                            WeakReference weakReference = r2 == 0 ? null : (WeakReference) r2.zzl().get(next);
                            this.f23158OooOooo.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC1517e3 viewOnAttachStateChangeListenerC1517e3 = new ViewOnAttachStateChangeListenerC1517e3(this.f23156OooOoo0, view);
                                this.f23159Oooo000.add(viewOnAttachStateChangeListenerC1517e3);
                                viewOnAttachStateChangeListenerC1517e3.f18476Oooo00O.add(new C1843my(this, next));
                                viewOnAttachStateChangeListenerC1517e3.OooO0OO(3);
                            }
                        }
                    }
                }
                if (interfaceViewOnClickListenerC1881nz.zzi() != null) {
                    ViewOnAttachStateChangeListenerC1517e3 viewOnAttachStateChangeListenerC1517e3Zzi = interfaceViewOnClickListenerC1881nz.zzi();
                    viewOnAttachStateChangeListenerC1517e3Zzi.f18476Oooo00O.add(this.f23153OooOoO0);
                    viewOnAttachStateChangeListenerC1517e3Zzi.OooO0OO(3);
                }
            }
        } finally {
        }
    }

    public final void OooOOO0(View view, f60 f60Var) {
        InterfaceC1722jo interfaceC1722joOooOO0o = this.f23140OooOO0O.OooOO0o();
        if (!this.f23141OooOOO.OooO0OO() || f60Var == null || interfaceC1722joOooOO0o == null || view == null) {
            return;
        }
        ((C1658hx) zzv.zzB()).OooOO0(f60Var.f18791OooO00o, view);
    }

    public final void OooOOOO(InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz) {
        View viewZzf = interfaceViewOnClickListenerC1881nz.zzf();
        interfaceViewOnClickListenerC1881nz.zzl();
        this.OooOO0o.OooOO0o(viewZzf);
        if (interfaceViewOnClickListenerC1881nz.zzh() != null) {
            interfaceViewOnClickListenerC1881nz.zzh().setClickable(false);
            interfaceViewOnClickListenerC1881nz.zzh().removeAllViews();
        }
        if (interfaceViewOnClickListenerC1881nz.zzi() != null) {
            ViewOnAttachStateChangeListenerC1517e3 viewOnAttachStateChangeListenerC1517e3Zzi = interfaceViewOnClickListenerC1881nz.zzi();
            viewOnAttachStateChangeListenerC1517e3Zzi.f18476Oooo00O.remove(this.f23153OooOoO0);
        }
        this.OooOo0 = null;
    }

    public final synchronized void OooOOOo() {
        this.f23150OooOo0O = true;
        this.f23139OooOO0.execute(new RunnableC1806ly(this, 1));
        C1472cv c1472cv = this.f17101OooO0OO;
        c1472cv.getClass();
        c1472cv.o0000Ooo(new C2150v8(null));
    }

    public final f60 OooOOo0(String str, boolean z) {
        String str2;
        f60 f60Var;
        Object objOooOO0;
        if (this.f23141OooOOO.OooO0OO() && !TextUtils.isEmpty(str)) {
            C2065sy c2065sy = this.f23140OooOO0O;
            InterfaceC1722jo interfaceC1722joOooOO0o = c2065sy.OooOO0o();
            InterfaceC1722jo interfaceC1722joOooOOO0 = c2065sy.OooOOO0();
            if (interfaceC1722joOooOO0o == null && interfaceC1722joOooOOO0 == null) {
                zzo.zzj("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z2 = false;
            boolean z3 = interfaceC1722joOooOO0o != null;
            boolean z4 = interfaceC1722joOooOOO0 != null;
            int i = 2;
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO00o)).booleanValue()) {
                this.f23141OooOOO.OooO00o();
                int iOooO00o = this.f23141OooOOO.OooO00o().OooO00o();
                int i2 = iOooO00o - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        zzo.zzj("Unknown omid media type: " + (iOooO00o != 1 ? iOooO00o != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return null;
                    }
                    if (interfaceC1722joOooOO0o == null) {
                        zzo.zzj("Omid media type was display but there was no display webview.");
                        return null;
                    }
                    z4 = false;
                    z2 = true;
                } else {
                    if (interfaceC1722joOooOOO0 == null) {
                        zzo.zzj("Omid media type was video but there was no video webview.");
                        return null;
                    }
                    z4 = true;
                }
            } else {
                z2 = z3;
            }
            if (z2) {
                str2 = null;
            } else {
                str2 = "javascript";
                interfaceC1722joOooOO0o = interfaceC1722joOooOOO0;
            }
            if (interfaceC1722joOooOO0o != null) {
                if (!((C1658hx) zzv.zzB()).OooOO0o(this.f23156OooOoo0)) {
                    zzo.zzj("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                VersionInfoParcel versionInfoParcel = this.f23154OooOoOO;
                String str3 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                if (!z4) {
                    i = this.f23140OooOO0O.OooO0oO() == 3 ? 4 : 3;
                    i = 2;
                }
                d60 d60VarZzB = zzv.zzB();
                WebView webViewOooOOo = interfaceC1722joOooOO0o.OooOOo();
                String str4 = this.f17100OooO0O0.f20557ooOO;
                ((C1658hx) d60VarZzB).getClass();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo0)).booleanValue() && ze0.f26157OooO0Oo.f29577OooOo0o) {
                    OoooO0O.o0000O0O o0000o0o2 = new OoooO0O.o0000O0O();
                    o0000o0o2.f13931OooO00o = str;
                    o0000o0o2.f13932OooO0O0 = str3;
                    o0000o0o2.f13933OooO0OO = str2;
                    o0000o0o2.f13934OooO0Oo = i;
                    o0000o0o2.f13935OooO0o = webViewOooOOo;
                    o0000o0o2.f13937OooO0oO = str4;
                    o0000o0o2.f13936OooO0o0 = i;
                    try {
                        objOooOO0 = o0000o0o2.OooOO0();
                    } catch (RuntimeException e) {
                        zzv.zzp().OooO0oO("omid exception", e);
                        objOooOO0 = null;
                    }
                    f60Var = (f60) objOooOO0;
                } else {
                    f60Var = null;
                }
                if (f60Var == null) {
                    zzo.zzj("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                C2065sy c2065sy2 = this.f23140OooOO0O;
                synchronized (c2065sy2) {
                    c2065sy2.OooOO0o = f60Var;
                }
                interfaceC1722joOooOO0o.Oooo0oo(f60Var);
                if (z4) {
                    yg0 yg0Var = f60Var.f18791OooO00o;
                    if (interfaceC1722joOooOOO0 != null) {
                        ((C1658hx) zzv.zzB()).OooOO0(yg0Var, interfaceC1722joOooOOO0.OooO0oO());
                    }
                    this.f23148OooOo = true;
                }
                if (z) {
                    ((C1658hx) zzv.zzB()).OooOO0O(f60Var.f18791OooO00o);
                    interfaceC1722joOooOO0o.OooO0o("onSdkLoaded", new ArrayMap());
                }
                return f60Var;
            }
            zzo.zzj("Webview is null in InternalNativeAd");
        }
        return null;
    }
}
