package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class OooOo00 implements Oooo0, OooOOOO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final HashMap f26429OooOo0O = new HashMap();

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public Oooo0 OooO0Oo(String str, C2051sk c2051sk, ArrayList arrayList) {
        return "toString".equals(str) ? new o00O0O(toString()) : OooOOOO.OooO0o(this, new o00O0O(str), c2051sk, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.OooOOOO
    public final void OooO0o0(String str, Oooo0 oooo0) {
        HashMap map = this.f26429OooOo0O;
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
        if (obj instanceof OooOo00) {
            return this.f26429OooOo0O.equals(((OooOo00) obj).f26429OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26429OooOo0O.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f26429OooOo0O;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final String zzc() {
        return "[object Object]";
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
        return new OooOOO(this.f26429OooOo0O.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.OooOOOO
    public final boolean zzj(String str) {
        return this.f26429OooOo0O.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.OooOOOO
    public final Oooo0 zzk(String str) {
        HashMap map = this.f26429OooOo0O;
        return map.containsKey(str) ? (Oooo0) map.get(str) : Oooo0.OooOO0o;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 zzt() {
        OooOo00 oooOo00 = new OooOo00();
        for (Map.Entry entry : this.f26429OooOo0O.entrySet()) {
            boolean z = entry.getValue() instanceof OooOOOO;
            HashMap map = oooOo00.f26429OooOo0O;
            if (z) {
                map.put((String) entry.getKey(), (Oooo0) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((Oooo0) entry.getValue()).zzt());
            }
        }
        return oooOo00;
    }
}
