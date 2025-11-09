package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class qk0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Runnable f23624OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23625OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1643hi f23626OooOo0o;

    public /* synthetic */ qk0(C1643hi c1643hi, Runnable runnable, int i) {
        this.f23625OooOo0O = i;
        this.f23626OooOo0o = c1643hi;
        this.f23624OooOo = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23625OooOo0O) {
            case 0:
                Runnable runnable = this.f23624OooOo;
                C1643hi c1643hi = this.f23626OooOo0o;
                c1643hi.getClass();
                try {
                    runnable.run();
                    return;
                } catch (RuntimeException e) {
                    ((or0) c1643hi.f19788OooOoO).OooO00o("error caused by ", e);
                    return;
                }
            default:
                C1643hi c1643hi2 = this.f23626OooOo0o;
                Runnable runnable2 = this.f23624OooOo;
                if (((bk0) c1643hi2.f19794OooOooo) != null || c1643hi2.f19785OooOo) {
                    if (!c1643hi2.f19785OooOo) {
                        runnable2.run();
                        return;
                    }
                    ((or0) c1643hi2.f19788OooOoO).OooO0OO("Waiting to bind to the service.", new Object[0]);
                    synchronized (((ArrayList) c1643hi2.f19790OooOoOO)) {
                        ((ArrayList) c1643hi2.f19790OooOoOO).add(runnable2);
                    }
                    return;
                }
                ((or0) c1643hi2.f19788OooOoO).OooO0OO("Initiate binding to the service.", new Object[0]);
                synchronized (((ArrayList) c1643hi2.f19790OooOoOO)) {
                    ((ArrayList) c1643hi2.f19790OooOoOO).add(runnable2);
                }
                rk0 rk0Var = new rk0(c1643hi2);
                c1643hi2.f19793OooOooO = rk0Var;
                c1643hi2.f19785OooOo = true;
                if (((Context) c1643hi2.f19786OooOo0O).bindService((Intent) c1643hi2.f19787OooOo0o, rk0Var, 1)) {
                    return;
                }
                ((or0) c1643hi2.f19788OooOoO).OooO0OO("Failed to bind to the service.", new Object[0]);
                c1643hi2.f19785OooOo = false;
                synchronized (((ArrayList) c1643hi2.f19790OooOoOO)) {
                    ((ArrayList) c1643hi2.f19790OooOoOO).clear();
                }
                return;
        }
    }
}
