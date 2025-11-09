package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class OooOO0 implements Oooo0 {

    /* renamed from: OooOo0O */
    public final Oooo0 f26423OooOo0O;

    /* renamed from: OooOo0o */
    public final String f26424OooOo0o;

    public OooOO0(String str) {
        this.f26423OooOo0O = Oooo0.OooOO0o;
        this.f26424OooOo0o = str;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 OooO0Oo(String str, C2051sk c2051sk, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO0 = (OooOO0) obj;
        return this.f26424OooOo0o.equals(oooOO0.f26424OooOo0o) && this.f26423OooOo0O.equals(oooOO0.f26423OooOo0O);
    }

    public final int hashCode() {
        return this.f26423OooOo0O.hashCode() + (this.f26424OooOo0o.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 zzt() {
        return new OooOO0(this.f26424OooOo0o, this.f26423OooOo0O.zzt());
    }

    public OooOO0(String str, Oooo0 oooo0) {
        this.f26423OooOo0O = oooo0;
        this.f26424OooOo0o = str;
    }
}
