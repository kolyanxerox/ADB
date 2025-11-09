package Oooo00O;

import OooOooo.o000Oo0;
import Oooo00o.o000O000;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class o00oO0o extends o000O000 {
    public static final Parcelable.Creator<o00oO0o> CREATOR = new OooOoo0.o000OOo(11);

    /* renamed from: OooOo0O */
    public final int f13826OooOo0O;

    /* renamed from: OooOo0o */
    public final IBinder f13827OooOo0o;
    private final o000Oo0 zac;
    private final boolean zad;
    private final boolean zae;

    public o00oO0o(int i, IBinder iBinder, o000Oo0 o000oo02, boolean z, boolean z2) {
        this.f13826OooOo0O = i;
        this.f13827OooOo0o = iBinder;
        this.zac = o000oo02;
        this.zad = z;
        this.zae = z2;
    }

    public final o000Oo0 OooO0o0() {
        return this.zac;
    }

    public final boolean equals(Object obj) {
        Object o0000oo02;
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o00oO0o) {
                o00oO0o o00oo0o = (o00oO0o) obj;
                if (this.zac.equals(o00oo0o.zac)) {
                    Object o0000oo03 = null;
                    IBinder iBinder = this.f13827OooOo0o;
                    if (iBinder == null) {
                        o0000oo02 = null;
                    } else {
                        int i = OooO0O0.f13733OooOo0o;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        o0000oo02 = iInterfaceQueryLocalInterface instanceof OooOo00 ? (OooOo00) iInterfaceQueryLocalInterface : new o0000OO0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                    }
                    IBinder iBinder2 = o00oo0o.f13827OooOo0o;
                    if (iBinder2 != null) {
                        int i2 = OooO0O0.f13733OooOo0o;
                        IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        o0000oo03 = iInterfaceQueryLocalInterface2 instanceof OooOo00 ? (OooOo00) iInterfaceQueryLocalInterface2 : new o0000OO0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                    }
                    if (o000000O.OooOO0o(o0000oo02, o0000oo03)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(this.f13826OooOo0O);
        o00Oo0oo.o00oO0o.OooOOo(parcel, 2, this.f13827OooOo0o);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 3, this.zac, i);
        boolean z = this.zad;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zae;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
