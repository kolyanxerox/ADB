package OoooOOO;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class o00OOOO0 extends o000O000 implements Iterable {
    public static final Parcelable.Creator<o00OOOO0> CREATOR = new o000OOo(20);
    private final Bundle zza;

    public o00OOOO0(Bundle bundle) {
        this.zza = bundle;
    }

    public final String OooO(String str) {
        return this.zza.getString(str);
    }

    public final Long OooO0o(String str) {
        return Long.valueOf(this.zza.getLong(str));
    }

    public final Object OooO0o0(String str) {
        return this.zza.get(str);
    }

    public final Double OooO0oO() {
        return Double.valueOf(this.zza.getDouble("value"));
    }

    public final int OooOO0() {
        return this.zza.size();
    }

    public final Bundle OooOO0O() {
        return new Bundle(this.zza);
    }

    public final /* synthetic */ Bundle OooOO0o() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o0o0Oo(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOOOo(2, OooOO0O(), parcel);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
