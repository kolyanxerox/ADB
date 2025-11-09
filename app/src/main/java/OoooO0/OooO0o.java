package OoooO0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class OooO0o implements IInterface {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f13892OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13893OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final IBinder f13894OooOo0o;

    public /* synthetic */ OooO0o(IBinder iBinder, String str, int i) {
        this.f13893OooOo0O = i;
        this.f13894OooOo0o = iBinder;
        this.f13892OooOo = str;
    }

    public Parcel OooO(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13894OooOo0o.transact(i, parcel, parcelObtain, 0);
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

    public Parcel OooOOO(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13894OooOo0o.transact(i, parcel, parcelObtain, 0);
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
        switch (this.f13893OooOo0O) {
        }
        return this.f13894OooOo0o;
    }

    public void o000O(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f13894OooOo0o.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void o000O0O0(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f13894OooOo0o.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void o000O0o0(Parcel parcel) {
        try {
            this.f13894OooOo0o.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel o000O0oO() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f13892OooOo);
        return parcelObtain;
    }

    public Parcel o000O0oo(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13894OooOo0o.transact(i, parcel, parcelObtain, 0);
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

    public void o000OO00(Parcel parcel, int i) {
        try {
            this.f13894OooOo0o.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel o000OO0O() {
        switch (this.f13893OooOo0O) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f13892OooOo);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f13892OooOo);
                return parcelObtain2;
        }
    }
}
