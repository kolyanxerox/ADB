package o0ooOO0;

import OooooOo.oOOOOo0O;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
public final class OooO0o extends AbsSavedState {
    public static final Parcelable.Creator<OooO0o> CREATOR = new oOOOOo0O(7);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f33012OooOo0O;

    public OooO0o(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f33012OooOo0O = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f33012OooOo0O ? 1 : 0);
    }
}
