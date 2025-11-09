package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.MotionEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ie */
/* loaded from: classes2.dex */
public final class C1676ie implements lp0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f20027OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f20028OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f20029OooO0OO;

    /* renamed from: OooO0Oo */
    public final Object f20030OooO0Oo;

    /* renamed from: OooO0o0 */
    public final Object f20031OooO0o0;

    public C1676ie(C2229xd c2229xd, String str, InterfaceC1492de interfaceC1492de, InterfaceC1455ce interfaceC1455ce) {
        this.f20027OooO00o = 0;
        this.f20031OooO0o0 = c2229xd;
        this.f20028OooO0O0 = str;
        this.f20030OooO0Oo = interfaceC1492de;
        this.f20029OooO0OO = interfaceC1455ce;
    }

    public o00000oO.OooOOO OooO00o(Object obj) {
        C2274yl c2274yl = new C2274yl();
        C2155vd c2155vdOooO0OO = ((C2229xd) this.f20031OooO0o0).OooO0OO();
        zze.zza("callJs > getEngine: Promise created");
        c2155vdOooO0OO.OooOO0O(new C1386ai(this, c2155vdOooO0OO, obj, c2274yl, 6, false), new C2249xx(15, c2274yl, c2155vdOooO0OO));
        return c2274yl;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) {
        o00000oO.OooOOO oooOOOOoooo00;
        yp0 yp0VarOooooOO;
        switch (this.f20027OooO00o) {
            case 0:
                return OooO00o(obj);
            case 1:
                MotionEvent motionEvent = (MotionEvent) this.f20031OooO0o0;
                C1468cr c1468cr = (C1468cr) this.f20029OooO0OO;
                c1468cr.getClass();
                int iIntValue = ((Integer) obj).intValue();
                Uri.Builder builder = (Uri.Builder) this.f20030OooO0Oo;
                if (iIntValue != 1) {
                    builder.appendQueryParameter((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0O00), "10");
                    return ii0.OooooOO(builder.toString());
                }
                Uri.Builder builderBuildUpon = builder.build().buildUpon();
                builderBuildUpon.appendQueryParameter((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0O0), "1");
                builderBuildUpon.appendQueryParameter((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0O00), "12");
                if (((String) this.f20028OooO0O0).contains((CharSequence) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0O0O))) {
                    builderBuildUpon.authority((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0O));
                }
                Uri uriBuild = builderBuildUpon.build();
                g60 g60Var = c1468cr.f18046OooO0OO;
                g60Var.getClass();
                try {
                    MeasurementManagerFutures measurementManagerFutures = g60Var.f19241OooO00o;
                    Objects.requireNonNull(measurementManagerFutures);
                    oooOOOOoooo00 = measurementManagerFutures.registerSourceAsync(uriBuild, motionEvent);
                } catch (Exception e) {
                    oooOOOOoooo00 = ii0.Ooooo00(e);
                }
                return ii0.ooOO(tp0.OooOOo(oooOOOOoooo00), new C2043sc(builder, 2), c1468cr.f18048OooO0o);
            case 2:
                return ii0.ooOO(((x40) this.f20030OooO0Oo).Oooo000((C2197wi) this.f20031OooO0o0), (lp0) this.f20028OooO0O0, (C2163vl) ((de0) this.f20029OooO0OO).f18242OooOo0o);
            case 3:
                a80 a80Var = (a80) this.f20029OooO0OO;
                jf0 jf0VarOooO0oO = ze0.OooO0oO(a80Var.f16981OooOO0, 12);
                kd0 kd0Var = (kd0) this.f20030OooO0Oo;
                jf0VarOooO0oO.OooO0o(kd0Var.f20514OooOooo);
                jf0VarOooO0oO.zzi();
                i60 i60Var = (i60) this.f20028OooO0O0;
                rd0 rd0Var = (rd0) this.f20031OooO0o0;
                o00000oO.OooOOO oooOOOO00Oo0 = ii0.o00Oo0(i60Var.OooO0O0(rd0Var, kd0Var), kd0Var.f20527OoooO0, TimeUnit.MILLISECONDS, a80Var.f16977OooO0o);
                a80Var.f16980OooO0oo.OooO00o(rd0Var, kd0Var, oooOOOO00Oo0, a80Var.f16975OooO0OO);
                af0.OoooooO(oooOOOO00Oo0, a80Var.f16982OooOO0O, jf0VarOooO0oO, false);
                return oooOOOO00Oo0;
            default:
                gh0 gh0Var = (gh0) this.f20029OooO0OO;
                p80 p80Var = (p80) this.f20030OooO0Oo;
                de0 de0Var = (de0) this.f20031OooO0o0;
                kc0 kc0Var = (kc0) this.f20028OooO0O0;
                oe0 oe0Var = (oe0) obj;
                synchronized (gh0Var) {
                    try {
                        gh0Var.f19349OooO0O0 = true;
                        oe0Var.f22979OooO00o = (InterfaceC1691iu) ((C1847n1) p80Var.f23242OooOo0o).f21381OooOo0o;
                        if (gh0Var.f19348OooO00o) {
                            yp0VarOooooOO = ii0.OooooOO(new ue0(oe0Var, kc0Var));
                        } else {
                            de0Var.OooOOoo(kc0Var.f20482OooO0oO, oe0Var);
                            yp0VarOooooOO = yp0.f25991OooOo0o;
                        }
                    } finally {
                    }
                }
                return yp0VarOooooOO;
        }
    }

    public /* synthetic */ C1676ie(C1468cr c1468cr, Uri.Builder builder, String str, MotionEvent motionEvent) {
        this.f20027OooO00o = 1;
        this.f20029OooO0OO = c1468cr;
        this.f20030OooO0Oo = builder;
        this.f20028OooO0O0 = str;
        this.f20031OooO0o0 = motionEvent;
    }

    public /* synthetic */ C1676ie(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f20027OooO00o = i;
        this.f20029OooO0OO = obj;
        this.f20030OooO0Oo = obj2;
        this.f20031OooO0o0 = obj3;
        this.f20028OooO0O0 = obj4;
    }
}
