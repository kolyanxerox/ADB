package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class OooOOO0 implements Oooo0, OooOOOO {

    /* renamed from: OooOo0O */
    public final String f26427OooOo0O;

    /* renamed from: OooOo0o */
    public final HashMap f26428OooOo0o = new HashMap();

    public OooOOO0(String str) {
        this.f26427OooOo0O = str;
    }

    public abstract Oooo0 OooO00o(C2051sk c2051sk, List list);

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 OooO0Oo(String str, C2051sk c2051sk, ArrayList arrayList) {
        return "toString".equals(str) ? new o00O0O(this.f26427OooOo0O) : OooOOOO.OooO0o(this, new o00O0O(str), c2051sk, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.OooOOOO
    public final void OooO0o0(String str, Oooo0 oooo0) {
        HashMap map = this.f26428OooOo0o;
        if (oooo0 == null) {
            map.remove(str);
        } else {
            map.put(str, oooo0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        String str = this.f26427OooOo0O;
        if (str != null) {
            return str.equals(oooOOO0.f26427OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26427OooOo0O;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final String zzc() {
        return this.f26427OooOo0O;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Iterator zzf() {
        return new OooOOO(this.f26428OooOo0o.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.OooOOOO
    public final boolean zzj(String str) {
        return this.f26428OooOo0o.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.OooOOOO
    public final Oooo0 zzk(String str) {
        HashMap map = this.f26428OooOo0o;
        return map.containsKey(str) ? (Oooo0) map.get(str) : Oooo0.OooOO0o;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public Oooo0 zzt() {
        return this;
    }
}
