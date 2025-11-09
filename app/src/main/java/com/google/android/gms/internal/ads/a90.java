package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class a90 extends zzbq {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final de0 f16984OooOo0O;

    public a90(Context context, C2130up c2130up, ud0 ud0Var, C2213wy c2213wy, zzbl zzblVar) {
        de0 de0Var = new de0(c2213wy, (h20) c2130up.f24692OooOo.zzb());
        ((c90) de0Var.f18240OooOo).f17967OooOo0O.set(zzblVar);
        s20 s20Var = new s20();
        s20Var.f23977OooOo0o = c2130up;
        s20Var.f23975OooOo = context;
        s20Var.f23979OooOoO0 = de0Var;
        s20Var.f23976OooOo0O = ud0Var;
        s20Var.f23978OooOoO = c2130up.OooOoo();
        ud0Var.f24639OooOOo = (c90) de0Var.f18240OooOo;
        this.f16984OooOo0O = new de0(24, s20Var, ud0Var.f24627OooO0OO);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zze() {
        String str;
        de0 de0Var = this.f16984OooOo0O;
        synchronized (de0Var) {
            str = null;
            try {
                BinderC1913ou binderC1913ou = (BinderC1913ou) de0Var.f18243OooOoO0;
                if (binderC1913ou != null) {
                    str = binderC1913ou.f23118OooOo0O;
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zzf() {
        String str;
        de0 de0Var = this.f16984OooOo0O;
        synchronized (de0Var) {
            str = null;
            try {
                BinderC1913ou binderC1913ou = (BinderC1913ou) de0Var.f18243OooOoO0;
                if (binderC1913ou != null) {
                    str = binderC1913ou.f23118OooOo0O;
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzmVar) {
        this.f16984OooOo0O.OooOOo(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized void zzh(zzm zzmVar, int i) {
        this.f16984OooOo0O.OooOOo(zzmVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    @Override // com.google.android.gms.ads.internal.client.zzbr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzi() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.de0 r0 = r2.f16984OooOo0O     // Catch: java.lang.Throwable -> L1c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r0.f18242OooOo0o     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.s20 r1 = (com.google.android.gms.internal.ads.s20) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.f23980OooOoOO     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.jt r1 = (com.google.android.gms.internal.ads.C1727jt) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L14
            boolean r1 = r1.f20385OooOo0O     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            r1 = move-exception
            goto L18
        L1c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a90.zzi():boolean");
    }
}
