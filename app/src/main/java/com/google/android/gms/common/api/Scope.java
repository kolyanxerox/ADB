package com.google.android.gms.common.api;

import OooOoo0.o000OOo;
import Oooo00O.o000000O;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class Scope extends o000O000 implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new o000OOo(6);

    /* renamed from: OooOo0O */
    public final int f16683OooOo0O;
    private final String zzb;

    public Scope(int i, String str) {
        o000000O.OooO0o(str, "scopeUri must not be null or empty");
        this.f16683OooOo0O = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.zzb.equals(((Scope) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(this.f16683OooOo0O);
        o00oO0o.OooOo0(parcel, 2, this.zzb);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
