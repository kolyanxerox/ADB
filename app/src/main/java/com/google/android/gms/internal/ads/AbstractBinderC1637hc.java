package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.hc */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1637hc extends AbstractBinderC2181w2 implements InterfaceC1674ic {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f19694OooOo0O = 0;

    public AbstractBinderC1637hc() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            zzf(string);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
