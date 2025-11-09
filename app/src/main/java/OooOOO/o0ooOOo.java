package Oooooo;

import OooooOo.oOOOOo0O;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public final class o0ooOOo extends AbsSavedState {
    public static final Parcelable.Creator<o0ooOOo> CREATOR = new oOOOOo0O(1);

    /* renamed from: OooOo, reason: collision with root package name */
    public final boolean f15089OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f15090OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f15091OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final boolean f15092OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f15093OooOoO0;

    public o0ooOOo(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15090OooOo0O = parcel.readInt();
        this.f15091OooOo0o = parcel.readInt();
        this.f15089OooOo = parcel.readInt() == 1;
        this.f15093OooOoO0 = parcel.readInt() == 1;
        this.f15092OooOoO = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f15090OooOo0O);
        parcel.writeInt(this.f15091OooOo0o);
        parcel.writeInt(this.f15089OooOo ? 1 : 0);
        parcel.writeInt(this.f15093OooOoO0 ? 1 : 0);
        parcel.writeInt(this.f15092OooOoO ? 1 : 0);
    }

    public o0ooOOo(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.f15090OooOo0O = bottomSheetBehavior.f27408Oooo0O0;
        this.f15091OooOo0o = bottomSheetBehavior.f27378OooO0Oo;
        this.f15089OooOo = bottomSheetBehavior.f27376OooO0O0;
        this.f15093OooOoO0 = bottomSheetBehavior.f27406Oooo00O;
        this.f15092OooOoO = bottomSheetBehavior.f27407Oooo00o;
    }
}
