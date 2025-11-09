package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c80 implements p60 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f17953OooO00o;

    /* renamed from: OooO0O0 */
    public final Context f17954OooO0O0;

    /* renamed from: OooO0OO */
    public final Executor f17955OooO0OO;

    /* renamed from: OooO0Oo */
    public final i10 f17956OooO0Oo;

    public /* synthetic */ c80(Context context, Executor executor, i10 i10Var, int i) {
        this.f17953OooO00o = i;
        this.f17954OooO0O0 = context;
        this.f17955OooO0OO = executor;
        this.f17956OooO0Oo = i10Var;
    }

    public static final void OooO0OO(rd0 rd0Var, kd0 kd0Var, l60 l60Var) {
        try {
            ee0 ee0Var = (ee0) l60Var.f20809OooO0O0;
            try {
                ee0Var.f18580OooO00o.OoooooO(((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24954OooO0Oo, kd0Var.f20506OooOo0O.toString());
            } catch (Throwable th) {
                throw new yd0(th);
            }
        } catch (Exception e) {
            zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(l60Var.f20808OooO00o)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final Object OooO00o(rd0 rd0Var, kd0 kd0Var, l60 l60Var) {
        switch (this.f17953OooO00o) {
            case 0:
                de0 de0Var = new de0(rd0Var, kd0Var, l60Var.f20808OooO00o);
                h10 h10Var = new h10(new wj0(l60Var, 26), null, 0);
                C1577fq c1577fq = (C1577fq) this.f17956OooO0Oo;
                C1540eq c1540eq = new C1540eq(c1577fq.f18994OooO0OO, c1577fq.f18995OooO0Oo, de0Var, h10Var);
                c1540eq.o00o0O().o00000o0(new C2316zq((ee0) l60Var.f20809OooO0O0, 0), this.f17955OooO0OO);
                ((e70) l60Var.f20810OooO0OO).o000O0o0((e80) c1540eq.f18677OoooOO0.zzb());
                return c1540eq.o00ooo();
            default:
                de0 de0Var2 = new de0(rd0Var, kd0Var, l60Var.f20808OooO00o);
                h10 h10Var2 = new h10(new sj0(l60Var, 24), null, 0);
                C1577fq c1577fq2 = (C1577fq) this.f17956OooO0Oo;
                C1540eq c1540eq2 = new C1540eq(c1577fq2.f18994OooO0OO, c1577fq2.f18995OooO0Oo, de0Var2, h10Var2);
                c1540eq2.o00o0O().o00000o0(new C2316zq((ee0) l60Var.f20809OooO0O0, 0), this.f17955OooO0OO);
                C1508dv c1508dv = (C1508dv) c1540eq2.f18665Oooo00O.zzb();
                C1950pu c1950pu = (C1950pu) c1540eq2.f18666Oooo00o.zzb();
                C1877nv c1877nv = (C1877nv) c1540eq2.f18669Oooo0o.zzb();
                C1547ex c1547ex = (C1547ex) c1540eq2.f18676OoooO0O.zzb();
                f70 f70Var = (f70) l60Var.f20810OooO0OO;
                h80 h80Var = new h80(c1877nv, c1950pu, c1508dv, c1547ex);
                synchronized (f70Var) {
                    f70Var.f18798OooOo0O = h80Var;
                }
                return c1540eq2.o00ooo();
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void OooO0O0(rd0 rd0Var, kd0 kd0Var, l60 l60Var) {
        yd0 yd0Var;
        switch (this.f17953OooO00o) {
            case 0:
                try {
                    vd0 vd0Var = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
                    int i = vd0Var.f24963OooOOOO.f13884OooOo0o;
                    JSONObject jSONObject = kd0Var.f20506OooOo0O;
                    IInterface iInterface = l60Var.f20810OooO0OO;
                    Object obj = l60Var.f20809OooO0O0;
                    Context context = this.f17954OooO0O0;
                    zzm zzmVar = vd0Var.f24954OooO0Oo;
                    if (i == 3) {
                        ee0 ee0Var = (ee0) obj;
                        try {
                            ee0Var.f18580OooO00o.o000OOo(new Oooo0o.OooO0OO(context), zzmVar, jSONObject.toString(), (InterfaceC1383af) iInterface);
                            return;
                        } finally {
                        }
                    }
                    ee0 ee0Var2 = (ee0) obj;
                    try {
                        ee0Var2.f18580OooO00o.o0000oO(new Oooo0o.OooO0OO(context), zzmVar, jSONObject.toString(), (InterfaceC1383af) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e) {
                    zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(l60Var.f20808OooO00o)), e);
                    return;
                }
                zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(l60Var.f20808OooO00o)), e);
                return;
            default:
                if (((ee0) l60Var.f20809OooO0O0).OooO00o()) {
                    OooO0OO(rd0Var, kd0Var, l60Var);
                    return;
                }
                C2051sk c2051sk = new C2051sk(this, rd0Var, kd0Var, l60Var, 11, false);
                f70 f70Var = (f70) l60Var.f20810OooO0OO;
                synchronized (f70Var) {
                    f70Var.f18797OooOo = c2051sk;
                }
                Object obj2 = l60Var.f20809OooO0O0;
                Context context2 = this.f17954OooO0O0;
                ee0 ee0Var3 = (ee0) obj2;
                vd0 vd0Var2 = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
                InterfaceC1828mj interfaceC1828mj = (InterfaceC1828mj) l60Var.f20810OooO0OO;
                String string = kd0Var.f20506OooOo0O.toString();
                try {
                    ee0Var3.f18580OooO00o.OooOOoo(new Oooo0o.OooO0OO(context2), vd0Var2.f24954OooO0Oo, interfaceC1828mj, string);
                    return;
                } finally {
                }
        }
    }
}
