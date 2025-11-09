package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Optional;

/* loaded from: classes2.dex */
public final /* synthetic */ class tg0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24315OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ kg0 f24316OooOo0o;

    public /* synthetic */ tg0(kg0 kg0Var, int i) {
        this.f24315OooOo0O = i;
        this.f24316OooOo0o = kg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24315OooOo0O) {
            case 0:
                this.f24316OooOo0o.OooO0oo();
                return;
            case 1:
                kg0 kg0Var = this.f24316OooOo0o;
                synchronized (kg0Var) {
                    if (kg0Var.OooOO0o.get()) {
                        try {
                            kg0Var.f20598OooO0oO.zze(kg0Var.f20597OooO0o0);
                        } catch (RemoteException unused) {
                            zzo.zzj("Failed to call onAdsAvailable");
                            return;
                        }
                    }
                }
                return;
            case 2:
                kg0 kg0Var2 = this.f24316OooOo0o;
                synchronized (kg0Var2) {
                    if (kg0Var2.OooOO0o.get()) {
                        try {
                            kg0Var2.f20598OooO0oO.zzf(kg0Var2.f20597OooO0o0);
                        } catch (RemoteException unused2) {
                            zzo.zzj("Failed to call onAdsExhausted");
                            return;
                        }
                    }
                }
                return;
            default:
                kg0 kg0Var3 = this.f24316OooOo0o;
                sj0 sj0Var = kg0Var3.f20602OooOOO;
                if (sj0Var != null) {
                    AdFormat adFormat = AdFormat.getAdFormat(kg0Var3.f20597OooO0o0.zzb);
                    ((Oooo0OO.oo000o) kg0Var3.f20604OooOOOO).getClass();
                    sj0Var.OooOOOo(adFormat, Optional.empty(), "paeo_ts", System.currentTimeMillis(), Optional.empty());
                    return;
                }
                return;
        }
    }
}
