package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class ji0 implements Oooo00O.OooO0OO, Oooo00O.OooO0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f20309OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final yi0 f20310OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f20311OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final HandlerThread f20312OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final LinkedBlockingQueue f20313OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final OoooOOO.o0O0oo00 f20314OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final int f20315OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final long f20316OooOoo0;

    public ji0(Context context, int i, String str, String str2, OoooOOO.o0O0oo00 o0o0oo00) {
        this.f20311OooOo0o = str;
        this.f20315OooOoo = i;
        this.f20309OooOo = str2;
        this.f20314OooOoOO = o0o0oo00;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f20312OooOoO = handlerThread;
        handlerThread.start();
        this.f20316OooOoo0 = System.currentTimeMillis();
        yi0 yi0Var = new yi0(19621000, this, this, context, handlerThread.getLooper());
        this.f20310OooOo0O = yi0Var;
        this.f20313OooOoO0 = new LinkedBlockingQueue();
        yi0Var.checkAvailabilityAndConnect();
    }

    @Override // Oooo00O.OooO0o
    public final void OooO(OooOooo.o000Oo0 o000oo02) throws InterruptedException {
        try {
            OooO0O0(4012, this.f20316OooOoo0, null);
            this.f20313OooOoO0.put(new ej0());
        } catch (InterruptedException unused) {
        }
    }

    public final void OooO00o() {
        yi0 yi0Var = this.f20310OooOo0O;
        if (yi0Var != null) {
            if (yi0Var.isConnected() || yi0Var.isConnecting()) {
                yi0Var.disconnect();
            }
        }
    }

    public final void OooO0O0(int i, long j, Exception exc) {
        this.f20314OooOoOO.OooO0oO(i, System.currentTimeMillis() - j, exc);
    }

    @Override // Oooo00O.OooO0OO
    public final void OooOO0(Bundle bundle) {
        bj0 bj0Var;
        long j = this.f20316OooOoo0;
        HandlerThread handlerThread = this.f20312OooOoO;
        try {
            bj0Var = (bj0) this.f20310OooOo0O.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            bj0Var = null;
        }
        if (bj0Var != null) {
            try {
                cj0 cj0Var = new cj0(1, 1, this.f20315OooOoo - 1, this.f20311OooOo0o, this.f20309OooOo);
                Parcel parcelOooO = bj0Var.OooO();
                AbstractC2218x2.OooO0OO(parcelOooO, cj0Var);
                Parcel parcelOooOOO = bj0Var.OooOOO(parcelOooO, 3);
                ej0 ej0Var = (ej0) AbstractC2218x2.OooO00o(parcelOooOOO, ej0.CREATOR);
                parcelOooOOO.recycle();
                OooO0O0(IronSourceConstants.errorCode_internal, j, null);
                this.f20313OooOoO0.put(ej0Var);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // Oooo00O.OooO0OO
    public final void OooOOO(int i) throws InterruptedException {
        try {
            OooO0O0(4011, this.f20316OooOoo0, null);
            this.f20313OooOoO0.put(new ej0());
        } catch (InterruptedException unused) {
        }
    }
}
