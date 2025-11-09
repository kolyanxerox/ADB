package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.wo */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2203wo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f25347OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ BinderC2240xo f25348OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f25349OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f25350OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f25351OooOoO0;

    public /* synthetic */ RunnableC2203wo(BinderC2240xo binderC2240xo, int i, int i2, boolean z, boolean z2) {
        this.f25348OooOo0O = binderC2240xo;
        this.f25349OooOo0o = i;
        this.f25347OooOo = i2;
        this.f25351OooOoO0 = z;
        this.f25350OooOoO = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        boolean z2;
        zzee zzeeVar;
        zzee zzeeVar2;
        zzee zzeeVar3;
        BinderC2240xo binderC2240xo = this.f25348OooOo0O;
        int i2 = this.f25349OooOo0o;
        int i3 = this.f25347OooOo;
        boolean z3 = this.f25351OooOoO0;
        boolean z4 = this.f25350OooOoO;
        synchronized (binderC2240xo.f25657OooOo0o) {
            try {
                boolean z5 = binderC2240xo.f25662OooOoo0;
                if (z5 || i3 != 1) {
                    i = i3;
                    z = false;
                } else {
                    i3 = 1;
                    i = 1;
                    z = true;
                }
                boolean z6 = i2 != i3;
                if (z6 && i == 1) {
                    z2 = true;
                    i = 1;
                } else {
                    z2 = false;
                }
                boolean z7 = z6 && i == 2;
                boolean z8 = z6 && i == 3;
                binderC2240xo.f25662OooOoo0 = z5 || z;
                if (z) {
                    try {
                        zzee zzeeVar4 = binderC2240xo.f25660OooOoOO;
                        if (zzeeVar4 != null) {
                            zzeeVar4.zzi();
                        }
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (z2 && (zzeeVar3 = binderC2240xo.f25660OooOoOO) != null) {
                    zzeeVar3.zzh();
                }
                if (z7 && (zzeeVar2 = binderC2240xo.f25660OooOoOO) != null) {
                    zzeeVar2.zzg();
                }
                if (z8) {
                    zzee zzeeVar5 = binderC2240xo.f25660OooOoOO;
                    if (zzeeVar5 != null) {
                        zzeeVar5.zze();
                    }
                    binderC2240xo.f25656OooOo0O.OooO0O0();
                }
                if (z3 != z4 && (zzeeVar = binderC2240xo.f25660OooOoOO) != null) {
                    zzeeVar.zzf(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
