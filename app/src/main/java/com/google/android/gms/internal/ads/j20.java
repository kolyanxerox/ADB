package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class j20 implements hf0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f20157OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final f20 f20159OooOo0o;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final HashMap f20158OooOo0O = new HashMap();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final HashMap f20160OooOoO0 = new HashMap();

    public j20(f20 f20Var, Set set, Oooo0OO.o00Ooo o00ooo2) {
        this.f20159OooOo0o = f20Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i20 i20Var = (i20) it.next();
            HashMap map = this.f20160OooOoO0;
            i20Var.getClass();
            map.put(ef0.RENDERER, i20Var);
        }
        this.f20157OooOo = o00ooo2;
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void OooO00o(ef0 ef0Var, String str, Throwable th) {
        HashMap map = this.f20158OooOo0O;
        if (map.containsKey(ef0Var)) {
            ((Oooo0OO.oo000o) this.f20157OooOo).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(ef0Var)).longValue();
            String strValueOf = String.valueOf(str);
            this.f20159OooOo0o.f18766OooO00o.put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f20160OooOoO0.containsKey(ef0Var)) {
            OooO0O0(ef0Var, false);
        }
    }

    public final void OooO0O0(ef0 ef0Var, boolean z) {
        i20 i20Var = (i20) this.f20160OooOoO0.get(ef0Var);
        if (i20Var == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        HashMap map = this.f20158OooOo0O;
        ef0 ef0Var2 = i20Var.f19900OooO0O0;
        if (map.containsKey(ef0Var2)) {
            ((Oooo0OO.oo000o) this.f20157OooOo).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(ef0Var2)).longValue();
            this.f20159OooOo0o.f18766OooO00o.put("label.".concat(i20Var.f19899OooO00o), str + jElapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void OooO0o(ef0 ef0Var, String str) {
        HashMap map = this.f20158OooOo0O;
        if (map.containsKey(ef0Var)) {
            ((Oooo0OO.oo000o) this.f20157OooOo).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(ef0Var)).longValue();
            String strValueOf = String.valueOf(str);
            this.f20159OooOo0o.f18766OooO00o.put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f20160OooOoO0.containsKey(ef0Var)) {
            OooO0O0(ef0Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void Oooo0oO(ef0 ef0Var, String str) {
        ((Oooo0OO.oo000o) this.f20157OooOo).getClass();
        this.f20158OooOo0O.put(ef0Var, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void OooO0o0(String str) {
    }
}
