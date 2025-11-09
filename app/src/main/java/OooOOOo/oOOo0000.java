package OooooOo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
public final class oOOo0000 extends AbsSavedState {
    public static final Parcelable.Creator<oOOo0000> CREATOR = new oOOOOo0O(0);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f15065OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f15066OooOo0o;

    public oOOo0000(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15065OooOo0O = parcel.readInt();
        this.f15066OooOo0o = parcel.readInt() != 0;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f15065OooOo0O);
        parcel.writeInt(this.f15066OooOo0o ? 1 : 0);
    }
}
