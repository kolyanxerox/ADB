package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class rk0 implements ServiceConnection {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ C1643hi f23873OooOo0O;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1643hi c1643hi = this.f23873OooOo0O;
        ((or0) c1643hi.f19788OooOoO).OooO0OO("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        c1643hi.OooOOO0(new c60(11, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1643hi c1643hi = this.f23873OooOo0O;
        ((or0) c1643hi.f19788OooOoO).OooO0OO("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        c1643hi.OooOOO0(new b30(this, 17));
    }
}
