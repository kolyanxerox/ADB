package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class o000Oo0 implements Parcelable.Creator {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f26508OooO00o;

    public /* synthetic */ o000Oo0(int i) {
        this.f26508OooO00o = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f26508OooO00o) {
            case 0:
                int iOooOooO = o000O00.o00O0O0O.OooOooO(parcel);
                Bundle bundleOooO0Oo = null;
                String strOooO = null;
                boolean zOooOo0o = false;
                long jOooOoO = 0;
                long jOooOoO2 = 0;
                while (parcel.dataPosition() < iOooOooO) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        jOooOoO = o000O00.o00O0O0O.OooOoO(parcel, i);
                    } else if (c == 2) {
                        jOooOoO2 = o000O00.o00O0O0O.OooOoO(parcel, i);
                    } else if (c == 3) {
                        zOooOo0o = o000O00.o00O0O0O.OooOo0o(parcel, i);
                    } else if (c == 7) {
                        bundleOooO0Oo = o000O00.o00O0O0O.OooO0Oo(parcel, i);
                    } else if (c != '\b') {
                        o000O00.o00O0O0O.OooOoo0(parcel, i);
                    } else {
                        strOooO = o000O00.o00O0O0O.OooO(parcel, i);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO);
                return new o000O0o(jOooOoO, jOooOoO2, zOooOo0o, bundleOooO0Oo, strOooO);
            default:
                int iOooOooO2 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO2 = null;
                int iOooOoO0 = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iOooOooO2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iOooOoO0 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                    } else if (c2 == 2) {
                        strOooO2 = o000O00.o00O0O0O.OooO(parcel, i2);
                    } else if (c2 != 3) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i2);
                    } else {
                        intent = (Intent) o000O00.o00O0O0O.OooO0oo(parcel, i2, Intent.CREATOR);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO2);
                return new o000O00(iOooOoO0, strOooO2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f26508OooO00o) {
            case 0:
                return new o000O0o[i];
            default:
                return new o000O00[i];
        }
    }
}
