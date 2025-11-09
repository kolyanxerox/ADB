package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pr */
/* loaded from: classes2.dex */
public final class C1947pr implements InterfaceC1481d3, InterfaceC1436bv, zzr, InterfaceC1399av {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C1799lr f23400OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C1836mr f23401OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Executor f23402OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final C1860ne f23403OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f23404OooOoOO;

    /* renamed from: OooOo, reason: collision with root package name */
    public final HashSet f23399OooOo = new HashSet();

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final AtomicBoolean f23406OooOoo0 = new AtomicBoolean(false);

    /* renamed from: OooOoo, reason: collision with root package name */
    public final C1910or f23405OooOoo = new C1910or();

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f23407OooOooO = false;

    /* renamed from: OooOooo, reason: collision with root package name */
    public WeakReference f23408OooOooo = new WeakReference(this);

    public C1947pr(C1823me c1823me, C1836mr c1836mr, Executor executor, C1799lr c1799lr, Oooo0OO.o00Ooo o00ooo2) {
        this.f23400OooOo0O = c1799lr;
        Charset charset = AbstractC1565fe.f18932OooO00o;
        c1823me.OooO00o();
        this.f23403OooOoO0 = new C1860ne(0, c1823me.f21223OooO0O0);
        this.f23401OooOo0o = c1836mr;
        this.f23402OooOoO = executor;
        this.f23404OooOoOO = o00ooo2;
    }

    public final synchronized void OooO00o() {
        try {
            if (this.f23408OooOooo.get() == null) {
                synchronized (this) {
                    OooO0o0();
                    this.f23407OooOooO = true;
                }
                return;
            }
            if (this.f23407OooOooO || !this.f23406OooOoo0.get()) {
                return;
            }
            try {
                C1910or c1910or = this.f23405OooOoo;
                ((Oooo0OO.oo000o) this.f23404OooOoOO).getClass();
                c1910or.f23083OooO0OO = SystemClock.elapsedRealtime();
                JSONObject jSONObjectZzb = this.f23401OooOo0o.zzb(this.f23405OooOoo);
                Iterator it = this.f23399OooOo.iterator();
                while (it.hasNext()) {
                    this.f23402OooOoO.execute(new RunnableC1873nr((InterfaceC1722jo) it.next(), jSONObjectZzb, 0));
                }
                C1860ne c1860ne = this.f23403OooOoO0;
                c1860ne.getClass();
                C1786le c1786le = new C1786le(1, c1860ne, jSONObjectZzb);
                C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
                dp0 dp0VarOoOO = ii0.ooOO(c1860ne.f21472OooO0O0, c1786le, c2163vl);
                dp0VarOoOO.addListener(new wp0(0, dp0VarOoOO, new or0("ActiveViewListener.callActiveViewJs", 3)), c2163vl);
                return;
            } catch (Exception e) {
                zze.zzb("Failed to call ActiveViewJS", e);
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final void OooO0o0() {
        Iterator it = this.f23399OooOo.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            C1799lr c1799lr = this.f23400OooOo0O;
            if (!zHasNext) {
                C1762kr c1762kr = c1799lr.f20940OooO0o0;
                C1823me c1823me = c1799lr.f20936OooO0O0;
                o00000oO.OooOOO oooOOO = c1823me.f21223OooO0O0;
                C1712je c1712je = new C1712je(0, str2, c1762kr);
                C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
                ep0 ep0VarOoooooo = ii0.Ooooooo(oooOOO, c1712je, c2163vl);
                c1823me.f21223OooO0O0 = ep0VarOoooooo;
                c1823me.f21223OooO0O0 = ii0.Ooooooo(ep0VarOoooooo, new C1712je(0, str, c1799lr.f20939OooO0o), c2163vl);
                return;
            }
            InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) it.next();
            interfaceC1722jo.OooOoo("/updateActiveView", c1799lr.f20940OooO0o0);
            interfaceC1722jo.OooOoo("/untrackActiveViewUnit", c1799lr.f20939OooO0o);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1436bv
    public final synchronized void OooOO0(Context context) {
        this.f23405OooOoo.f23084OooO0Oo = "u";
        OooO00o();
        OooO0o0();
        this.f23407OooOooO = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1436bv
    public final synchronized void OooOOO(Context context) {
        this.f23405OooOoo.f23082OooO0O0 = true;
        OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1436bv
    public final synchronized void Oooo000(Context context) {
        this.f23405OooOoo.f23082OooO0O0 = false;
        OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final synchronized void Ooooo00(C1444c3 c1444c3) {
        C1910or c1910or = this.f23405OooOoo;
        c1910or.f23081OooO00o = c1444c3.f17668OooOO0;
        c1910or.f23085OooO0o0 = c1444c3;
        OooO00o();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdE() {
        this.f23405OooOoo.f23082OooO0O0 = false;
        OooO00o();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdi() {
        this.f23405OooOoo.f23082OooO0O0 = true;
        OooO00o();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final synchronized void zzr() {
        if (this.f23406OooOoo0.compareAndSet(false, true)) {
            C1799lr c1799lr = this.f23400OooOo0O;
            C1762kr c1762kr = c1799lr.f20940OooO0o0;
            C1823me c1823me = c1799lr.f20936OooO0O0;
            c1823me.OooO00o();
            o00000oO.OooOOO oooOOO = c1823me.f21223OooO0O0;
            C1786le c1786le = new C1786le(0, "/updateActiveView", c1762kr);
            C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
            c1823me.f21223OooO0O0 = ii0.ooOO(oooOOO, c1786le, c2163vl);
            C1762kr c1762kr2 = c1799lr.f20939OooO0o;
            c1823me.OooO00o();
            c1823me.f21223OooO0O0 = ii0.ooOO(c1823me.f21223OooO0O0, new C1786le(0, "/untrackActiveViewUnit", c1762kr2), c2163vl);
            c1799lr.f20938OooO0Oo = this;
            OooO00o();
        }
    }
}
