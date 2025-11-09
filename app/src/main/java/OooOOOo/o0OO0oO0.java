package OoooOOO;

import Oooo00O.o000000O;
import Oooo0OO.o00Ooo;
import Oooo0OO.oo000o;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.o000O0o;
import java.util.concurrent.atomic.AtomicInteger;
import o000OOoO.OooO;

/* loaded from: classes2.dex */
public final class o0OO0oO0 implements o0oo0000 {

    /* renamed from: OoooOoO */
    public static volatile o0OO0oO0 f14514OoooOoO;

    /* renamed from: OooOo */
    public final OooO f14515OooOo;

    /* renamed from: OooOo0O */
    public final Context f14516OooOo0O;

    /* renamed from: OooOo0o */
    public final boolean f14517OooOo0o;

    /* renamed from: OooOoO */
    public final o0O f14518OooOoO;

    /* renamed from: OooOoO0 */
    public final o00O0OO f14519OooOoO0;

    /* renamed from: OooOoOO */
    public final o0O0O0o0 f14520OooOoOO;

    /* renamed from: OooOoo */
    public final oO0O0O00 f14521OooOoo;

    /* renamed from: OooOoo0 */
    public final o0OO0o00 f14522OooOoo0;

    /* renamed from: OooOooO */
    public final oOO00OO f14523OooOooO;

    /* renamed from: OooOooo */
    public final o0O00o00 f14524OooOooo;

    /* renamed from: Oooo */
    public oO00OO0O f14525Oooo;

    /* renamed from: Oooo0 */
    public final o0oOOo f14526Oooo0;

    /* renamed from: Oooo000 */
    public final oo000o f14527Oooo000;

    /* renamed from: Oooo00O */
    public final oO00o000 f14528Oooo00O;

    /* renamed from: Oooo00o */
    public final oO0O0OoO f14529Oooo00o;

    /* renamed from: Oooo0O0 */
    public final oO00O0oO f14530Oooo0O0;

    /* renamed from: Oooo0OO */
    public final String f14531Oooo0OO;

    /* renamed from: Oooo0o */
    public oOo000o0 f14532Oooo0o;

    /* renamed from: Oooo0o0 */
    public o0oO0Ooo f14533Oooo0o0;

    /* renamed from: Oooo0oO */
    public o00OOO00 f14534Oooo0oO;

    /* renamed from: Oooo0oo */
    public o0O00OO f14535Oooo0oo;

    /* renamed from: OoooO */
    public volatile Boolean f14536OoooO;

    /* renamed from: OoooO0 */
    public Boolean f14537OoooO0;

    /* renamed from: OoooO0O */
    public long f14539OoooO0O;

    /* renamed from: OoooOO0 */
    public volatile boolean f14540OoooOO0;

    /* renamed from: OoooOOO */
    public int f14541OoooOOO;

    /* renamed from: OoooOo0 */
    public final long f14543OoooOo0;
    public int o000oOoO;

    /* renamed from: OoooO00 */
    public boolean f14538OoooO00 = false;

    /* renamed from: OoooOOo */
    public final AtomicInteger f14542OoooOOo = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:128:0x00a9, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00ae, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0OO0oO0(OoooOOO.oO0000o0 r11) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o0OO0oO0.<init>(OoooOOO.oO0000o0):void");
    }

    public static final void OooOO0(o0O0o o0o0o) {
        if (o0o0o == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void OooOO0O(o0o0000 o0o0000Var) {
        if (o0o0000Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void OooOO0o(o0O000Oo o0o000oo) {
        if (o0o000oo == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!o0o000oo.f14334OooOo0o) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(o0o000oo.getClass())));
        }
    }

    public static final void OooOOO0(oO0Oo oo0oo) {
        if (oo0oo == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!oo0oo.f14751OooOo0o) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(oo0oo.getClass())));
        }
    }

    public static o0OO0oO0 OooOOoo(Context context, o000O0o o000o0o2, Long l) {
        Bundle bundle;
        if (o000o0o2 != null) {
            Bundle bundle2 = o000o0o2.zzd;
            o000o0o2 = new o000O0o(o000o0o2.zza, o000o0o2.zzb, o000o0o2.zzc, bundle2, null);
        }
        o000000O.OooO0oo(context);
        o000000O.OooO0oo(context.getApplicationContext());
        if (f14514OoooOoO == null) {
            synchronized (o0OO0oO0.class) {
                try {
                    if (f14514OoooOoO == null) {
                        f14514OoooOoO = new o0OO0oO0(new oO0000o0(context, o000o0o2, l));
                    }
                } finally {
                }
            }
        } else if (o000o0o2 != null && (bundle = o000o0o2.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            o000000O.OooO0oo(f14514OoooOoO);
            f14514OoooOoO.f14536OoooO = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        o000000O.OooO0oo(f14514OoooOoO);
        return f14514OoooOoO;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO(int r19, java.io.IOException r20, byte[] r21) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o0OO0oO0.OooO(int, java.io.IOException, byte[]):void");
    }

    @Override // OoooOOO.o0oo0000
    public final o0O0O0o0 OooO00o() {
        o0O0O0o0 o0o0o0o0 = this.f14520OooOoOO;
        OooOOO0(o0o0o0o0);
        return o0o0o0o0;
    }

    @Override // OoooOOO.o0oo0000
    public final o0OO0o00 OooO0O0() {
        o0OO0o00 o0oo0o00 = this.f14522OooOoo0;
        OooOOO0(o0oo0o00);
        return o0oo0o00;
    }

    @Override // OoooOOO.o0oo0000
    public final OooO OooO0OO() {
        return this.f14515OooOo;
    }

    @Override // OoooOOO.o0oo0000
    public final Context OooO0Oo() {
        return this.f14516OooOo0O;
    }

    public final boolean OooO0o() {
        return OooO0oO() == 0;
    }

    @Override // OoooOOO.o0oo0000
    public final o00Ooo OooO0o0() {
        return this.f14527Oooo000;
    }

    public final int OooO0oO() {
        o0OO0o00 o0oo0o00 = this.f14522OooOoo0;
        OooOOO0(o0oo0o00);
        o0oo0o00.OooOO0O();
        o00O0OO o00o0oo = this.f14519OooOoO0;
        if (o00o0oo.OooOo()) {
            return 1;
        }
        OooOOO0(o0oo0o00);
        o0oo0o00.OooOO0O();
        if (!this.f14540OoooOO0) {
            return 8;
        }
        o0O o0o = this.f14518OooOoO;
        OooOO0O(o0o);
        o0o.OooOO0O();
        Boolean boolValueOf = o0o.OooOOOO().contains("measurement_enabled") ? Boolean.valueOf(o0o.OooOOOO().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        OooO oooO = ((o0OO0oO0) o00o0oo.f14574OooOo0O).f14515OooOo;
        Boolean boolOooOo0o = o00o0oo.OooOo0o("firebase_analytics_collection_enabled");
        return boolOooOo0o != null ? boolOooOo0o.booleanValue() ? 0 : 4 : (this.f14536OoooO == null || this.f14536OoooO.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0oo() {
        /*
            r6 = this;
            boolean r0 = r6.f14538OoooO00
            if (r0 == 0) goto L96
            OoooOOO.o0OO0o00 r0 = r6.f14522OooOoo0
            OooOOO0(r0)
            r0.OooOO0O()
            java.lang.Boolean r0 = r6.f14537OoooO0
            Oooo0OO.oo000o r1 = r6.f14527Oooo000
            if (r0 == 0) goto L34
            long r2 = r6.f14539OoooO0O
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f14539OoooO0O
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f14539OoooO0O = r0
            OoooOOO.oOO00OO r0 = r6.f14523OooOooO
            OooOO0O(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.Oooo00O(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.Oooo00O(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f14516OooOo0O
            OooOOo0.Oooo000 r3 = Oooo0o0.OooOO0.OooO00o(r1)
            boolean r3 = r3.OooO0Oo()
            r4 = 1
            if (r3 != 0) goto L74
            OoooOOO.o00O0OO r3 = r6.f14519OooOoO0
            boolean r3 = r3.OooOOO()
            if (r3 != 0) goto L74
            boolean r3 = OoooOOO.oOO00OO.OoooOoO(r1)
            if (r3 == 0) goto L75
            boolean r1 = OoooOOO.oOO00OO.OooOooO(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.f14537OoooO0 = r1
            if (r2 == 0) goto L8f
            OoooOOO.o0O00OO r1 = r6.OooOOo()
            java.lang.String r1 = r1.OooOOo()
            boolean r0 = r0.OooOOOO(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f14537OoooO0 = r0
        L8f:
            java.lang.Boolean r0 = r6.f14537OoooO0
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o0OO0oO0.OooO0oo():boolean");
    }

    public final o0O00o00 OooOOO() {
        return this.f14524OooOooo;
    }

    public final o0oO0Ooo OooOOOO() {
        OooOO0o(this.f14533Oooo0o0);
        return this.f14533Oooo0o0;
    }

    public final oOo000o0 OooOOOo() {
        OooOO0o(this.f14532Oooo0o);
        return this.f14532Oooo0o;
    }

    public final o0O00OO OooOOo() {
        OooOO0o(this.f14535Oooo0oo);
        return this.f14535Oooo0oo;
    }

    public final o00OOO00 OooOOo0() {
        OooOOO0(this.f14534Oooo0oO);
        return this.f14534Oooo0oO;
    }
}
