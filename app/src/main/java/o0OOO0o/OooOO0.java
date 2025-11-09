package o0OOO0o;

import OoooOoo.oOO0OoO0;
import android.os.Parcel;
import android.os.Parcelable;
import o0ooOO0.o0OOO0o;

/* loaded from: classes2.dex */
public final class OooOO0 implements Parcelable {
    public static final Parcelable.Creator<OooOO0> CREATOR = new oOO0OoO0(7);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f32980OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public o0OOO0o f32981OooOo0o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32980OooOo0O);
        parcel.writeParcelable(this.f32981OooOo0o, 0);
    }
}
