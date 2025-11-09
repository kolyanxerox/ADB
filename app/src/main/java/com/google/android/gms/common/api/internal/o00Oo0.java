package com.google.android.gms.common.api.internal;

import OooOooo.o000O00O;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class o00Oo0 {

    /* renamed from: OooO00o */
    public final int f16731OooO00o;

    public o00Oo0(int i) {
        this.f16731OooO00o = i;
    }

    public static Status OooO0oO(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean OooO00o(Oooo0 oooo0);

    public abstract o000O00O[] OooO0O0(Oooo0 oooo0);

    public abstract void OooO0OO(Status status);

    public abstract void OooO0Oo(RuntimeException runtimeException);

    public abstract void OooO0o(OooO0oO.OooOOO0 oooOOO0, boolean z);

    public abstract void OooO0o0(Oooo0 oooo0);
}
