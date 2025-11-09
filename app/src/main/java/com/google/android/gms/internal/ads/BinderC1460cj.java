package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.cj */
/* loaded from: classes2.dex */
public final class BinderC1460cj extends AbstractBinderC2181w2 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f18002OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f18003OooOo0o;

    public BinderC1460cj(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f18002OooOo0O = str;
        this.f18003OooOo0o = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BinderC1460cj)) {
            BinderC1460cj binderC1460cj = (BinderC1460cj) obj;
            if (Oooo00O.o000000O.OooOO0o(this.f18002OooOo0O, binderC1460cj.f18002OooOo0O) && Oooo00O.o000000O.OooOO0o(Integer.valueOf(this.f18003OooOo0o), Integer.valueOf(binderC1460cj.f18003OooOo0o))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f18002OooOo0O);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f18003OooOo0o);
        return true;
    }
}
