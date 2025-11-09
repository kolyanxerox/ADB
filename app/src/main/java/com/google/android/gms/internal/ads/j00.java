package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class j00 {

    /* renamed from: OooO00o */
    public final vd0 f20138OooO00o;

    /* renamed from: OooO0O0 */
    public final Executor f20139OooO0O0;

    /* renamed from: OooO0OO */
    public final n10 f20140OooO0OO;

    /* renamed from: OooO0Oo */
    public final c10 f20141OooO0Oo;

    /* renamed from: OooO0o */
    public final h20 f20142OooO0o;

    /* renamed from: OooO0o0 */
    public final Context f20143OooO0o0;

    /* renamed from: OooO0oO */
    public final hg0 f20144OooO0oO;

    /* renamed from: OooO0oo */
    public final s50 f20145OooO0oo;

    public j00(vd0 vd0Var, Executor executor, n10 n10Var, Context context, h20 h20Var, hg0 hg0Var, s50 s50Var, c10 c10Var) {
        this.f20138OooO00o = vd0Var;
        this.f20139OooO0O0 = executor;
        this.f20140OooO0OO = n10Var;
        this.f20143OooO0o0 = context;
        this.f20142OooO0o = h20Var;
        this.f20144OooO0oO = hg0Var;
        this.f20145OooO0oo = s50Var;
        this.f20141OooO0Oo = c10Var;
    }

    public static final void OooO0O0(InterfaceC1722jo interfaceC1722jo) {
        interfaceC1722jo.Oooo0OO("/videoClicked", AbstractC2005rb.f23824OooO0oo);
        AbstractC1870no abstractC1870noZzN = interfaceC1722jo.zzN();
        synchronized (abstractC1870noZzN.f21530OooOoO0) {
            abstractC1870noZzN.f21543Oooo0o = true;
        }
        interfaceC1722jo.Oooo0OO("/getNativeAdViewSignals", AbstractC2005rb.f23833OooOOoo);
        interfaceC1722jo.Oooo0OO("/getNativeClickMeta", AbstractC2005rb.f23835OooOo00);
    }

    public final void OooO00o(InterfaceC1722jo interfaceC1722jo) {
        OooO0O0(interfaceC1722jo);
        interfaceC1722jo.Oooo0OO("/video", AbstractC2005rb.OooOO0o);
        interfaceC1722jo.Oooo0OO("/videoMeta", AbstractC2005rb.f23828OooOOO0);
        interfaceC1722jo.Oooo0OO("/precache", new C1820mb(27));
        interfaceC1722jo.Oooo0OO("/delayPageLoaded", AbstractC2005rb.f23830OooOOOo);
        interfaceC1722jo.Oooo0OO("/instrument", AbstractC2005rb.f23827OooOOO);
        interfaceC1722jo.Oooo0OO("/log", AbstractC2005rb.f23823OooO0oO);
        interfaceC1722jo.Oooo0OO("/click", new C1895ob(0, null, null));
        if (this.f20138OooO00o.f24952OooO0O0 != null) {
            AbstractC1870no abstractC1870noZzN = interfaceC1722jo.zzN();
            synchronized (abstractC1870noZzN.f21530OooOoO0) {
                abstractC1870noZzN.f21546Oooo0oo = true;
            }
            interfaceC1722jo.Oooo0OO("/open", new C2264yb(null, null, null, null, null));
        } else {
            AbstractC1870no abstractC1870noZzN2 = interfaceC1722jo.zzN();
            synchronized (abstractC1870noZzN2.f21530OooOoO0) {
                abstractC1870noZzN2.f21546Oooo0oo = false;
            }
        }
        if (zzv.zzo().OooO0o0(interfaceC1722jo.getContext())) {
            Object map = new HashMap();
            if (interfaceC1722jo.OooO0OO() != null) {
                map = interfaceC1722jo.OooO0OO().o0ooOoO;
            }
            interfaceC1722jo.Oooo0OO("/logScionEvent", new C1895ob(1, interfaceC1722jo.getContext(), map));
        }
    }
}
