package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z00 {

    /* renamed from: OooO */
    public final s50 f26050OooO;

    /* renamed from: OooO0O0 */
    public final zza f26052OooO0O0;

    /* renamed from: OooO0OO */
    public final Context f26053OooO0OO;

    /* renamed from: OooO0Oo */
    public final h20 f26054OooO0Oo;

    /* renamed from: OooO0o */
    public final C1663i1 f26055OooO0o;

    /* renamed from: OooO0o0 */
    public final Executor f26056OooO0o0;

    /* renamed from: OooO0oO */
    public final VersionInfoParcel f26057OooO0oO;

    /* renamed from: OooOO0 */
    public final hg0 f26059OooOO0;

    /* renamed from: OooOO0O */
    public final x50 f26060OooOO0O;
    public final xd0 OooOO0o;

    /* renamed from: OooOOO0 */
    public ep0 f26061OooOOO0;

    /* renamed from: OooO00o */
    public final s00 f26051OooO00o = new s00();

    /* renamed from: OooO0oo */
    public final C1895ob f26058OooO0oo = new C1895ob();

    public z00(x00 x00Var) {
        this.f26053OooO0OO = x00Var.f25485OooOo0o;
        this.f26056OooO0o0 = x00Var.f25486OooOoO;
        this.f26055OooO0o = x00Var.f25488OooOoOO;
        this.f26057OooO0oO = x00Var.f25490OooOoo0;
        this.f26052OooO0O0 = x00Var.f25484OooOo0O;
        this.f26050OooO = x00Var.f25487OooOoO0;
        this.f26059OooOO0 = x00Var.f25489OooOoo;
        this.f26054OooO0Oo = x00Var.f25483OooOo;
        this.f26060OooOO0O = x00Var.f25491OooOooO;
        this.OooOO0o = x00Var.f25492OooOooo;
    }

    public final synchronized o00000oO.OooOOO OooO00o(String str, JSONObject jSONObject) {
        ep0 ep0Var = this.f26061OooOOO0;
        if (ep0Var == null) {
            return yp0.f25991OooOo0o;
        }
        return ii0.ooOO(ep0Var, new C1617gt(this, str, jSONObject, 1), this.f26056OooO0o0);
    }

    public final synchronized void OooO0O0(Map map) {
        ep0 ep0Var = this.f26061OooOOO0;
        if (ep0Var == null) {
            return;
        }
        sj0 sj0Var = new sj0(map, 18);
        ep0Var.addListener(new wp0(0, ep0Var, sj0Var), this.f26056OooO0o0);
    }

    public final synchronized void OooO0OO(String str, InterfaceC2042sb interfaceC2042sb) {
        ep0 ep0Var = this.f26061OooOOO0;
        if (ep0Var == null) {
            return;
        }
        u00 u00Var = new u00(str, interfaceC2042sb, 0);
        ep0Var.addListener(new wp0(0, ep0Var, u00Var), this.f26056OooO0o0);
    }

    public final synchronized void OooO0Oo(String str, InterfaceC2042sb interfaceC2042sb) {
        ep0 ep0Var = this.f26061OooOOO0;
        if (ep0Var == null) {
            return;
        }
        u00 u00Var = new u00(str, interfaceC2042sb, 1);
        ep0Var.addListener(new wp0(0, ep0Var, u00Var), this.f26056OooO0o0);
    }
}
