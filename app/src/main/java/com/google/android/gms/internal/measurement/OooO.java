package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class OooO implements Oooo0 {

    /* renamed from: OooOo0O */
    public final boolean f26412OooOo0O;

    public OooO(Boolean bool) {
        this.f26412OooOo0O = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 OooO0Oo(String str, C2051sk c2051sk, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f26412OooOo0O;
        if (zEquals) {
            return new o00O0O(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO) && this.f26412OooOo0O == ((OooO) obj).f26412OooOo0O;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f26412OooOo0O).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f26412OooOo0O);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final String zzc() {
        return Boolean.toString(this.f26412OooOo0O);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Double zzd() {
        return Double.valueOf(true != this.f26412OooOo0O ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Boolean zze() {
        return Boolean.valueOf(this.f26412OooOo0O);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 zzt() {
        return new OooO(Boolean.valueOf(this.f26412OooOo0O));
    }
}
