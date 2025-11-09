package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o00O00 extends o0Oo0oo implements o0000OO0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0000oOO.o0O00 f26511OooOo0O;

    public o00O00(o0000oOO.o0O00 o0o00) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f26511OooOo0O = o0o00;
    }

    @Override // com.google.android.gms.internal.measurement.o0Oo0oo
    public final boolean OooO(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f26511OooOo0O);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        o0OO00O.OooO0Oo(parcel);
        o00000oO(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o0000OO0
    public final void o00000oO(long j, Bundle bundle, String str, String str2) {
        this.f26511OooOo0O.OooO00o(j, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.o0000OO0
    public final int zzf() {
        return System.identityHashCode(this.f26511OooOo0O);
    }
}
