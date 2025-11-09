package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class jk0 extends AbstractBinderC2181w2 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ok0 f20328OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ kk0 f20329OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk0(kk0 kk0Var, ok0 ok0Var) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.f20329OooOo0o = kk0Var;
        this.f20328OooOo0O = ok0Var;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        C1643hi c1643hi;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
        AbstractC2218x2.OooO0O0(parcel);
        int i2 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        if (string == null) {
            string = null;
        }
        this.f20328OooOo0O.zza(new fk0(i2, string));
        if (i2 == 8157 && (c1643hi = this.f20329OooOo0o.f20613OooO00o) != null) {
            kk0.f20611OooO0OO.OooO0OO("unbind LMD display overlay service", new Object[0]);
            c1643hi.OooOOO0(new b30(c1643hi, 16));
        }
        return true;
    }
}
