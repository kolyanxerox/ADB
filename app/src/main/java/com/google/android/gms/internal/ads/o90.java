package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o90 implements kb0 {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static String f22366OooO0Oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f22367OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f22368OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f22369OooO0OO;

    public /* synthetic */ o90(int i, Object obj, Object obj2) {
        this.f22367OooO00o = i;
        this.f22368OooO0O0 = obj;
        this.f22369OooO0OO = obj2;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        switch (this.f22367OooO00o) {
            case 0:
                return 4;
            case 1:
                return 10;
            case 2:
                return 54;
            case 3:
                return 60;
            case 4:
                return 23;
            case 5:
                return 27;
            case 6:
                return 41;
            default:
                return 48;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        switch (this.f22367OooO00o) {
            case 0:
                ((Oooo0OO.oo000o) ((Oooo0OO.o00Ooo) this.f22368OooO0O0)).getClass();
                return ii0.OooooOO(new p90((vd0) this.f22369OooO0OO, System.currentTimeMillis()));
            case 1:
                if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17876o00O0OoO)).booleanValue()) {
                    return ii0.Ooooooo(((C1978ql) this.f22369OooO0OO).OooO0o0(), new o0O0o00O(10), (cq0) this.f22368OooO0O0);
                }
                return ii0.OooooOO(new v90(1, null));
            case 2:
                return ((C2163vl) this.f22368OooO0O0).OooO0O0(new CallableC1736k1(this, 12));
            case 3:
                zze.zza("HsdpMigrationSignal.produce");
                if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oO0OO)).booleanValue()) {
                    return ii0.OooooOO(new ua0(1, null));
                }
                boolean z = false;
                try {
                    if (((Intent) this.f22369OooO0OO).resolveActivity(((Context) this.f22368OooO0O0).getPackageManager()) != null) {
                        zze.zza("HSDP intent is supported");
                        z = true;
                    }
                } catch (Exception e) {
                    zzv.zzp().OooO0oo("HsdpMigrationSignal.isHsdpMigrationSupported", e);
                }
                return ii0.OooooOO(new ua0(1, Boolean.valueOf(z)));
            case 4:
                return ((C2163vl) this.f22368OooO0O0).OooO0O0(new CallableC1736k1(this, 20));
            case 5:
                return ((C2163vl) this.f22368OooO0O0).OooO0O0(new CallableC1736k1(this, 22));
            case 6:
                yp0 yp0VarOooooOO = ii0.OooooOO((String) this.f22369OooO0OO);
                o0O0o00O o0o0o00o = new o0O0o00O(12);
                cq0 cq0Var = (cq0) this.f22368OooO0O0;
                return ii0.OoooOoO(ii0.Ooooooo(yp0VarOooooOO, o0o0o00o, cq0Var), Throwable.class, new C2043sc(this, 13), cq0Var);
            default:
                return ((C2163vl) this.f22368OooO0O0).OooO0O0(new xb0(this, 1));
        }
    }

    public o90(VersionInfoParcel versionInfoParcel, C2163vl c2163vl) {
        this.f22367OooO00o = 2;
        this.f22369OooO0OO = versionInfoParcel;
        this.f22368OooO0O0 = c2163vl;
    }

    public o90(C2163vl c2163vl, Context context, Set set) {
        this.f22367OooO00o = 5;
        this.f22368OooO0O0 = c2163vl;
        this.f22369OooO0OO = set;
    }
}
