package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class m10 {

    /* renamed from: OooO */
    public final C1947pr f21012OooO;

    /* renamed from: OooO00o */
    public final C1950pu f21013OooO00o;

    /* renamed from: OooO0O0 */
    public final C2322zw f21014OooO0O0;

    /* renamed from: OooO0OO */
    public final C1508dv f21015OooO0OO;

    /* renamed from: OooO0Oo */
    public final C1766kv f21016OooO0Oo;

    /* renamed from: OooO0o */
    public final C1473cw f21017OooO0o;

    /* renamed from: OooO0o0 */
    public final C1877nv f21018OooO0o0;

    /* renamed from: OooO0oO */
    public final Executor f21019OooO0oO;

    /* renamed from: OooO0oo */
    public final C2285yw f21020OooO0oo;

    /* renamed from: OooOO0 */
    public final zzb f21021OooOO0;

    /* renamed from: OooOO0O */
    public final InterfaceC1792lk f21022OooOO0O;
    public final C1663i1 OooOO0o;

    /* renamed from: OooOOO */
    public final s50 f21023OooOOO;

    /* renamed from: OooOOO0 */
    public final C2284yv f21024OooOOO0;

    /* renamed from: OooOOOO */
    public final hg0 f21025OooOOOO;

    /* renamed from: OooOOOo */
    public final h20 f21026OooOOOo;

    /* renamed from: OooOOo */
    public final q10 f21027OooOOo;

    /* renamed from: OooOOo0 */
    public final C1468cr f21028OooOOo0;

    public m10(C1950pu c1950pu, C1508dv c1508dv, C1766kv c1766kv, C1877nv c1877nv, C1473cw c1473cw, Executor executor, C2285yw c2285yw, C1947pr c1947pr, zzb zzbVar, InterfaceC1792lk interfaceC1792lk, C1663i1 c1663i1, C2284yv c2284yv, s50 s50Var, hg0 hg0Var, h20 h20Var, C2322zw c2322zw, C1468cr c1468cr, q10 q10Var) {
        this.f21013OooO00o = c1950pu;
        this.f21015OooO0OO = c1508dv;
        this.f21016OooO0Oo = c1766kv;
        this.f21018OooO0o0 = c1877nv;
        this.f21017OooO0o = c1473cw;
        this.f21019OooO0oO = executor;
        this.f21020OooO0oo = c2285yw;
        this.f21012OooO = c1947pr;
        this.f21021OooOO0 = zzbVar;
        this.f21022OooOO0O = interfaceC1792lk;
        this.OooOO0o = c1663i1;
        this.f21024OooOOO0 = c2284yv;
        this.f21023OooOOO = s50Var;
        this.f21025OooOOOO = hg0Var;
        this.f21026OooOOOo = h20Var;
        this.f21014OooO0O0 = c2322zw;
        this.f21028OooOOo0 = c1468cr;
        this.f21027OooOOo = q10Var;
    }

    public static final C2274yl OooO0O0(InterfaceC1722jo interfaceC1722jo, String str, String str2, Bundle bundle) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17846o000oo)).booleanValue()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), bundle, "rendering-webview-load-html-start");
        }
        C2274yl c2274yl = new C2274yl();
        interfaceC1722jo.zzN().f21533OooOoo0 = new C1548ey(6, bundle, c2274yl);
        interfaceC1722jo.OooOoo0(str, str2);
        return c2274yl;
    }

    public final void OooO00o(InterfaceC1722jo interfaceC1722jo, boolean z, C2116ub c2116ub, Bundle bundle) {
        InterfaceC1552f1 interfaceC1552f1;
        C2148v6 c2148v6 = AbstractC1448c7.f17846o000oo;
        if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), bundle, "rendering-configure-webview-start");
        }
        interfaceC1722jo.zzN().OooOOO(new zza() { // from class: com.google.android.gms.internal.ads.j10
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.f20146OooOo0O.f21013OooO00o.onAdClicked();
            }
        }, this.f21016OooO0Oo, this.f21018OooO0o0, new InterfaceC1783lb() { // from class: com.google.android.gms.internal.ads.k10
            @Override // com.google.android.gms.internal.ads.InterfaceC1783lb
            public final void OooO00o(String str, String str2) {
                this.f20411OooOo0O.f21017OooO0o.OooO00o(str, str2);
            }
        }, new v00(this, 2), z, c2116ub, this.f21021OooOO0, new C1847n1(this, 19), this.f21022OooOO0O, this.f21023OooOOO, this.f21025OooOOOO, this.f21026OooOOOo, null, this.f21014OooO0O0, null, null, null, this.f21028OooOOo0);
        interfaceC1722jo.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.l10
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                m10 m10Var = this.f20770OooOo0O;
                m10Var.getClass();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOooOo)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    m10Var.f21027OooOOo.f23479OooO00o = motionEvent;
                }
                m10Var.f21021OooOO0.zza();
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        interfaceC1722jo.setOnClickListener(new ViewOnClickListenerC1936pg(this, 1));
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17867o00O0O00)).booleanValue() && (interfaceC1552f1 = this.OooOO0o.f19893OooO0O0) != null) {
            interfaceC1552f1.zzo(interfaceC1722jo.OooO0oO());
        }
        C2285yw c2285yw = this.f21020OooO0oo;
        Executor executor = this.f21019OooO0oO;
        c2285yw.o00000o0(interfaceC1722jo, executor);
        c2285yw.o00000o0(new g00(interfaceC1722jo, 2), executor);
        c2285yw.o00000oo(interfaceC1722jo.OooO0oO());
        interfaceC1722jo.Oooo0OO("/trackActiveViewUnit", new C1895ob(5, this, interfaceC1722jo));
        C1947pr c1947pr = this.f21012OooO;
        c1947pr.getClass();
        c1947pr.f23408OooOooo = new WeakReference(interfaceC1722jo);
        if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), bundle, "rendering-configure-webview-end");
        }
    }
}
