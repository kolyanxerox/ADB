package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sr */
/* loaded from: classes2.dex */
public final class C2058sr implements InterfaceC1481d3 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C1836mr f24142OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public InterfaceC1722jo f24143OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Executor f24144OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f24146OooOoO0;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f24145OooOoO = false;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public boolean f24147OooOoOO = false;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final C1910or f24148OooOoo0 = new C1910or();

    public C2058sr(Executor executor, C1836mr c1836mr, Oooo0OO.o00Ooo o00ooo2) {
        this.f24144OooOo0o = executor;
        this.f24142OooOo = c1836mr;
        this.f24146OooOoO0 = o00ooo2;
    }

    public final void OooO00o() {
        try {
            JSONObject jSONObjectZzb = this.f24142OooOo.zzb(this.f24148OooOoo0);
            if (this.f24143OooOo0O != null) {
                this.f24144OooOo0o.execute(new wp0(18, this, jSONObjectZzb));
            }
        } catch (JSONException e) {
            zze.zzb("Failed to call video active view js", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final void Ooooo00(C1444c3 c1444c3) {
        boolean z = this.f24147OooOoOO ? false : c1444c3.f17668OooOO0;
        C1910or c1910or = this.f24148OooOoo0;
        c1910or.f23081OooO00o = z;
        ((Oooo0OO.oo000o) this.f24146OooOoO0).getClass();
        c1910or.f23083OooO0OO = SystemClock.elapsedRealtime();
        c1910or.f23085OooO0o0 = c1444c3;
        if (this.f24145OooOoO) {
            OooO00o();
        }
    }
}
