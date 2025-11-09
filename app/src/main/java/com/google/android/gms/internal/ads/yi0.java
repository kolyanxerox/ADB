package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;

/* loaded from: classes2.dex */
public final class yi0 extends zzc {

    /* renamed from: OoooOoO, reason: collision with root package name */
    public final int f25928OoooOoO;

    public yi0(int i, Oooo00O.OooO0OO oooO0OO, Oooo00O.OooO0o oooO0o, Context context, Looper looper) {
        super(116, oooO0OO, oooO0o, context, looper);
        this.f25928OoooOoO = i;
    }

    @Override // Oooo00O.OooOO0O
    public final IInterface OooO0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof bj0 ? (bj0) iInterfaceQueryLocalInterface : new bj0(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o() {
        return "com.google.android.gms.gass.START";
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o0() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // Oooo00O.OooOO0O, Oooo000.OooO0OO
    public final int getMinApkVersion() {
        return this.f25928OoooOoO;
    }
}
