package Oooo00O;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o00Ooo extends OoooO0.OooO0o {
    public final Oooo0o.OooO0O0 o0OoO0o(Oooo0o.OooO0OO oooO0OO, o0ooOOo o0ooooo) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f13892OooOo);
        int i = OoooO00.OooOOO0.f13898OooO00o;
        parcelObtain.writeStrongBinder(oooO0OO);
        parcelObtain.writeInt(1);
        o0ooooo.writeToParcel(parcelObtain, 0);
        parcelObtain = Parcel.obtain();
        try {
            this.f13894OooOo0o.transact(2, parcelObtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            return Oooo0o.OooO0OO.o000O0o0(parcelObtain.readStrongBinder());
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcelObtain.recycle();
        }
    }
}
