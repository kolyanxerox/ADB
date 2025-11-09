package o00000O0;

import OooooOo.oOOOOo0O;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
public final class o0OO00O extends AbsSavedState {
    public static final Parcelable.Creator<o0OO00O> CREATOR = new oOOOOo0O(4);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public CharSequence f29209OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f29210OooOo0o;

    public o0OO00O(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f29209OooOo0O = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f29210OooOo0o = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f29209OooOo0O) + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f29209OooOo0O, parcel, i);
        parcel.writeInt(this.f29210OooOo0o ? 1 : 0);
    }
}
