package Oooo00o;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o000O0o extends RuntimeException {
    public o000O0o(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
