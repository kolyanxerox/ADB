package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.v2 */
/* loaded from: classes2.dex */
public abstract class AbstractC2144v2 implements IInterface {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final IBinder f24836OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f24837OooOo0o;

    public AbstractC2144v2(IBinder iBinder, String str) {
        this.f24836OooOo0O = iBinder;
        this.f24837OooOo0o = str;
    }

    public final Parcel OooO() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f24837OooOo0o);
        return parcelObtain;
    }

    public final Parcel OooOOO(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f24836OooOo0O.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24836OooOo0O;
    }

    public final void o000O0O0(Parcel parcel, int i) {
        try {
            this.f24836OooOo0O.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final void o000OO0O(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f24836OooOo0O.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
