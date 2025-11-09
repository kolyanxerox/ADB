package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
public final class OooOO0O extends AbsSavedState {
    public static final Parcelable.Creator<OooOO0O> CREATOR = new OooOO0();

    /* renamed from: OooOo, reason: collision with root package name */
    public int f27317OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f27318OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f27319OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f27320OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public float f27321OooOoO0;

    public OooOO0O(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f27318OooOo0O = parcel.readByte() != 0;
        this.f27319OooOo0o = parcel.readByte() != 0;
        this.f27317OooOo = parcel.readInt();
        this.f27321OooOoO0 = parcel.readFloat();
        this.f27320OooOoO = parcel.readByte() != 0;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f27318OooOo0O ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27319OooOo0o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f27317OooOo);
        parcel.writeFloat(this.f27321OooOoO0);
        parcel.writeByte(this.f27320OooOoO ? (byte) 1 : (byte) 0);
    }
}
