package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class b20 implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f17349OooO00o = 0;

    /* renamed from: OooO0O0 */
    public final p31 f17350OooO0O0;

    /* renamed from: OooO0OO */
    public final z31 f17351OooO0OO;

    /* renamed from: OooO0Oo */
    public final z31 f17352OooO0Oo;

    /* renamed from: OooO0o */
    public final q31 f17353OooO0o;

    /* renamed from: OooO0o0 */
    public final z31 f17354OooO0o0;

    /* renamed from: OooO0oO */
    public final v31 f17355OooO0oO;

    /* renamed from: OooO0oo */
    public final z31 f17356OooO0oo;

    public b20(C1834mp c1834mp, p31 p31Var, p31 p31Var2, C1764kt c1764kt, C1764kt c1764kt2, p31 p31Var3, q31 q31Var) {
        this.f17351OooO0OO = c1834mp;
        this.f17350OooO0O0 = p31Var;
        this.f17352OooO0Oo = p31Var2;
        this.f17353OooO0o = c1764kt;
        this.f17355OooO0oO = c1764kt2;
        this.f17354OooO0o0 = p31Var3;
        this.f17356OooO0oo = q31Var;
    }

    public x60 OooO00o() {
        return new x60((AbstractC1837ms) ((r31) this.f17351OooO0OO).f23738OooO00o, (Context) this.f17350OooO0O0.zzb(), (Executor) ((p31) this.f17352OooO0Oo).zzb(), (n10) ((p31) this.f17354OooO0o0).zzb(), ((C1876nu) this.f17353OooO0o).OooO00o(), (wk0) ((p31) this.f17355OooO0oO).zzb(), (f20) ((p31) this.f17356OooO0oo).zzb());
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f17349OooO00o) {
            case 0:
                Context contextOooO00o = ((C1834mp) this.f17351OooO0OO).OooO00o();
                ce0 ce0Var = (ce0) this.f17350OooO0O0.zzb();
                h20 h20Var = (h20) ((p31) this.f17352OooO0Oo).zzb();
                rd0 rd0Var = (rd0) ((C1764kt) this.f17353OooO0o).f20673OooO0O0.f18242OooOo0o;
                ii0.Oooo000(rd0Var);
                return new a20(contextOooO00o, ce0Var, h20Var, rd0Var, ((C1764kt) this.f17355OooO0oO).OooO00o(), (s50) ((p31) this.f17354OooO0o0).zzb(), (String) ((q31) this.f17356OooO0oo).zzb());
            case 1:
                return new f20(((C1834mp) this.f17351OooO0OO).OooO00o(), (k20) this.f17352OooO0Oo.zzb(), ((C2019rp) this.f17354OooO0o0).zzb(), ((C1876nu) this.f17353OooO0o).OooO00o(), (String) this.f17350OooO0O0.zzb(), (String) this.f17355OooO0oO.zzb(), (zzk) this.f17356OooO0oo.zzb());
            case 2:
                return OooO00o();
            case 3:
                return new ic0((C2130up) ((r31) this.f17351OooO0OO).f23738OooO00o, (Context) ((r31) this.f17353OooO0o).f23738OooO00o, (String) ((r31) this.f17355OooO0oO).f23738OooO00o, (fc0) this.f17350OooO0O0.zzb(), (ec0) ((p31) this.f17352OooO0Oo).zzb(), ((C1982qp) this.f17356OooO0oo).OooO00o(), (h20) ((p31) this.f17354OooO0o0).zzb());
            default:
                return new jc0((Context) ((r31) this.f17351OooO0OO).f23738OooO00o, (Executor) this.f17350OooO0O0.zzb(), (zzs) ((r31) this.f17353OooO0o).f23738OooO00o, (C2130up) ((r31) this.f17355OooO0oO).f23738OooO00o, (c90) ((p31) this.f17352OooO0Oo).zzb(), (e90) ((p31) this.f17354OooO0o0).zzb(), new ud0(), (C1509dw) ((p31) this.f17356OooO0oo).zzb());
        }
    }

    public b20(r31 r31Var, p31 p31Var, p31 p31Var2, p31 p31Var3, C1876nu c1876nu, p31 p31Var4, p31 p31Var5) {
        this.f17351OooO0OO = r31Var;
        this.f17350OooO0O0 = p31Var;
        this.f17352OooO0Oo = p31Var2;
        this.f17354OooO0o0 = p31Var3;
        this.f17353OooO0o = c1876nu;
        this.f17355OooO0oO = p31Var4;
        this.f17356OooO0oo = p31Var5;
    }

    public b20(r31 r31Var, p31 p31Var, r31 r31Var2, r31 r31Var3, p31 p31Var2, p31 p31Var3, p31 p31Var4) {
        this.f17351OooO0OO = r31Var;
        this.f17350OooO0O0 = p31Var;
        this.f17353OooO0o = r31Var2;
        this.f17355OooO0oO = r31Var3;
        this.f17352OooO0Oo = p31Var2;
        this.f17354OooO0o0 = p31Var3;
        this.f17356OooO0oo = p31Var4;
    }

    public b20(r31 r31Var, r31 r31Var2, r31 r31Var3, p31 p31Var, p31 p31Var2, C1982qp c1982qp, p31 p31Var3) {
        this.f17351OooO0OO = r31Var;
        this.f17353OooO0o = r31Var2;
        this.f17355OooO0oO = r31Var3;
        this.f17350OooO0O0 = p31Var;
        this.f17352OooO0Oo = p31Var2;
        this.f17356OooO0oo = c1982qp;
        this.f17354OooO0o0 = p31Var3;
    }

    public b20(z31 z31Var, z31 z31Var2, z31 z31Var3, C1876nu c1876nu, p31 p31Var, v31 v31Var, z31 z31Var4) {
        this.f17351OooO0OO = z31Var;
        this.f17352OooO0Oo = z31Var2;
        this.f17354OooO0o0 = z31Var3;
        this.f17353OooO0o = c1876nu;
        this.f17350OooO0O0 = p31Var;
        this.f17355OooO0oO = v31Var;
        this.f17356OooO0oo = z31Var4;
    }
}
