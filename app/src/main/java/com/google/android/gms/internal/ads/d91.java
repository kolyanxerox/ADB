package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class d91 extends t81 {

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final n81 f18210OooOO0O;
    public final boolean OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final C1528ee f18211OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final C2045se f18212OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public a91 f18213OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public z81 f18214OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public boolean f18215OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public boolean f18216OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public boolean f18217OooOOoo;

    public d91(n81 n81Var, boolean z) {
        boolean z2;
        this.f18210OooOO0O = n81Var;
        if (z) {
            n81Var.OooOOo0();
            z2 = true;
        } else {
            z2 = false;
        }
        this.OooOO0o = z2;
        this.f18212OooOOO0 = new C2045se();
        this.f18211OooOOO = new C1528ee();
        n81Var.OooO0Oo();
        this.f18213OooOOOO = new a91(new c91(n81Var.OooO0OO()), C2045se.f24068OooOOO0, a91.f16985OooO0o0);
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooO00o(g91 g91Var) {
        z81 z81Var = (z81) g91Var;
        g91 g91Var2 = z81Var.f26127OooOoO0;
        if (g91Var2 != null) {
            n81 n81Var = z81Var.f26123OooOo;
            n81Var.getClass();
            n81Var.OooO00o(g91Var2);
        }
        if (g91Var == this.f18214OooOOOo) {
            this.f18214OooOOOo = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final C1550f OooO0OO() {
        return this.f18210OooOO0O.OooO0OO();
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooO0Oo() {
        this.f18210OooOO0O.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOO0(gb1 gb1Var) {
        this.f24273OooOO0 = gb1Var;
        int i = i80.f19994OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        af0.OooOo0O(looperMyLooper);
        this.f24271OooO = new Handler(looperMyLooper, null);
        if (this.OooOO0o) {
            return;
        }
        this.f18216OooOOo0 = true;
        OooOo00(null, this.f18210OooOO0O);
    }

    @Override // com.google.android.gms.internal.ads.t81, com.google.android.gms.internal.ads.n81
    public final void OooOOO0() {
        this.f18215OooOOo = false;
        this.f18216OooOOo0 = false;
        super.OooOOO0();
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOOOo(C1550f c1550f) {
        if (this.f18217OooOOoo) {
            a91 a91Var = this.f18213OooOOOO;
            this.f18213OooOOOO = new a91(new w51(this.f18213OooOOOO.f25266OooO0O0, c1550f), a91Var.f16986OooO0OO, a91Var.f16987OooO0Oo);
        } else {
            this.f18213OooOOOO = new a91(new c91(c1550f), C2045se.f24068OooOOO0, a91.f16985OooO0o0);
        }
        this.f18210OooOO0O.OooOOOo(c1550f);
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOOo() {
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOOo0() {
        this.f18210OooOO0O.OooOOo0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // com.google.android.gms.internal.ads.t81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOoo(java.lang.Integer r13, com.google.android.gms.internal.ads.n81 r14, com.google.android.gms.internal.ads.AbstractC1787lf r15) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d91.OooOOoo(java.lang.Integer, com.google.android.gms.internal.ads.n81, com.google.android.gms.internal.ads.lf):void");
    }

    @Override // com.google.android.gms.internal.ads.n81
    /* renamed from: OooOo, reason: merged with bridge method [inline-methods] */
    public final z81 OooO0O0(h91 h91Var, eb1 eb1Var, long j) {
        z81 z81Var = new z81(h91Var, eb1Var, j);
        af0.OooooO0(z81Var.f26123OooOo == null);
        n81 n81Var = this.f18210OooOO0O;
        z81Var.f26123OooOo = n81Var;
        if (this.f18215OooOOo) {
            Object obj = this.f18213OooOOOO.f16987OooO0Oo;
            Object obj2 = h91Var.f19657OooO00o;
            if (obj != null && obj2.equals(a91.f16985OooO0o0)) {
                obj2 = this.f18213OooOOOO.f16987OooO0Oo;
            }
            h91 h91VarOooO00o = h91Var.OooO00o(obj2);
            long j2 = z81Var.f26128OooOoOO;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            n81 n81Var2 = z81Var.f26123OooOo;
            n81Var2.getClass();
            g91 g91VarOooO0O0 = n81Var2.OooO0O0(h91VarOooO00o, eb1Var, j);
            z81Var.f26127OooOoO0 = g91VarOooO0O0;
            if (z81Var.f26126OooOoO != null) {
                g91VarOooO0O0.OooO0oo(z81Var, j);
                return z81Var;
            }
        } else {
            this.f18214OooOOOo = z81Var;
            if (!this.f18216OooOOo0) {
                this.f18216OooOOo0 = true;
                OooOo00(null, n81Var);
            }
        }
        return z81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.t81
    public final /* bridge */ /* synthetic */ void OooOo0(Integer num) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.t81
    public final /* synthetic */ void OooOo0O(Integer num, long j) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.t81
    public final h91 OooOo0o(Integer num, h91 h91Var) {
        Object obj = this.f18213OooOOOO.f16987OooO0Oo;
        Object obj2 = h91Var.f19657OooO00o;
        if (obj != null && obj.equals(obj2)) {
            obj2 = a91.f16985OooO0o0;
        }
        return h91Var.OooO00o(obj2);
    }

    public final boolean OooOoO0(long j) {
        z81 z81Var = this.f18214OooOOOo;
        int iOooO00o = this.f18213OooOOOO.OooO00o(z81Var.f26124OooOo0O.f19657OooO00o);
        if (iOooO00o == -1) {
            return false;
        }
        a91 a91Var = this.f18213OooOOOO;
        C1528ee c1528ee = this.f18211OooOOO;
        a91Var.OooO0Oo(iOooO00o, c1528ee, false);
        long j2 = c1528ee.f18577OooO0Oo;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        z81Var.f26128OooOoOO = j;
        return true;
    }
}
