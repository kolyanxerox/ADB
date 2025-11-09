package o0OOO0o;

import OooooOo.oOOOOo0O;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
public final class OooOo00 extends AbsSavedState {
    public static final Parcelable.Creator<OooOo00> CREATOR = new oOOOOo0O(5);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Bundle f32990OooOo0O;

    public OooOo00(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f32990OooOo0O = parcel.readBundle(classLoader == null ? OooOo00.class.getClassLoader() : classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f32990OooOo0O);
    }
}
