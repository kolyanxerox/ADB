package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o000oOoO implements Oooo0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f26509OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f26510OooOo0o;

    public o000oOoO(String str, ArrayList arrayList) {
        this.f26509OooOo0O = str;
        ArrayList arrayList2 = new ArrayList();
        this.f26510OooOo0o = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 OooO0Oo(String str, C2051sk c2051sk, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000oOoO)) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        String str = this.f26509OooOo0O;
        if (str == null ? o000oooo2.f26509OooOo0O == null : str.equals(o000oooo2.f26509OooOo0O)) {
            return this.f26510OooOo0o.equals(o000oooo2.f26510OooOo0o);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26509OooOo0O;
        return this.f26510OooOo0o.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 zzt() {
        return this;
    }
}
