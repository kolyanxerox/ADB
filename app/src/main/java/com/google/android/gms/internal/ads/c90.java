package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c90 implements AppEventListener, InterfaceC2173vv, InterfaceC1656hv, InterfaceC2135uu, InterfaceC1399av, zza, InterfaceC2024ru, InterfaceC1988qv, InterfaceC2283yu, InterfaceC1401ax {

    /* renamed from: OooOooO, reason: collision with root package name */
    public final h20 f17974OooOooO;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AtomicReference f17967OooOo0O = new AtomicReference();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicReference f17968OooOo0o = new AtomicReference();

    /* renamed from: OooOo, reason: collision with root package name */
    public final AtomicReference f17966OooOo = new AtomicReference();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicReference f17970OooOoO0 = new AtomicReference();

    /* renamed from: OooOoO, reason: collision with root package name */
    public final AtomicReference f17969OooOoO = new AtomicReference();

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicBoolean f17971OooOoOO = new AtomicBoolean(true);

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final AtomicBoolean f17973OooOoo0 = new AtomicBoolean(false);

    /* renamed from: OooOoo, reason: collision with root package name */
    public final AtomicBoolean f17972OooOoo = new AtomicBoolean(false);

    /* renamed from: OooOooo, reason: collision with root package name */
    public final ArrayBlockingQueue f17975OooOooo = new ArrayBlockingQueue(((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO00)).intValue());

    public c90(h20 h20Var) {
        this.f17974OooOooO = h20Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1988qv
    public final void OooO00o(zzu zzuVar) {
        Object obj = this.f17966OooOo.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzdr) obj).zze(zzuVar);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final synchronized zzbl OooO0o() {
        return (zzbl) this.f17967OooOo0O.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2283yu
    public final void OooO0o0(zze zzeVar) {
        Object obj = this.f17969OooOoO.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzct) obj).zzd(zzeVar);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final void OooOO0(zzcm zzcmVar) {
        this.f17968OooOo0o.set(zzcmVar);
        this.f17973OooOoo0.set(true);
        OooOOO();
    }

    public final void OooOOO() {
        if (this.f17973OooOoo0.get() && this.f17972OooOoo.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.f17975OooOooo;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f17968OooOo0o.get();
                if (obj != null) {
                    try {
                        ((zzcm) obj).zzc((String) pair.first, (String) pair.second);
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                    } catch (NullPointerException e2) {
                        zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f17971OooOoOO.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void Oooo000() {
        Object obj;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO000)).booleanValue() && (obj = this.f17967OooOo0O.get()) != null) {
            try {
                ((zzbl) obj).zzc();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.f17969OooOoO.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((zzct) obj2).zzb();
        } catch (RemoteException e3) {
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:6:0x000a, B:12:0x001d, B:15:0x0026, B:21:0x0039, B:18:0x002d, B:20:0x0034, B:9:0x0011, B:11:0x0018), top: B:27:0x0001, inners: #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void OoooOOO() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference r0 = r2.f17967OooOo0O     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto La
            goto L1d
        La:
            com.google.android.gms.ads.internal.client.zzbl r0 = (com.google.android.gms.ads.internal.client.zzbl) r0     // Catch: java.lang.NullPointerException -> L10 android.os.RemoteException -> L17 java.lang.Throwable -> L44
            r0.zzi()     // Catch: java.lang.NullPointerException -> L10 android.os.RemoteException -> L17 java.lang.Throwable -> L44
            goto L1d
        L10:
            r0 = move-exception
            java.lang.String r1 = "NullPointerException occurs when invoking a method from a delegating listener."
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r1, r0)     // Catch: java.lang.Throwable -> L44
            goto L1d
        L17:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzo.zzl(r1, r0)     // Catch: java.lang.Throwable -> L44
        L1d:
            java.util.concurrent.atomic.AtomicReference r0 = r2.f17970OooOoO0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L26
            goto L39
        L26:
            com.google.android.gms.ads.internal.client.zzbo r0 = (com.google.android.gms.ads.internal.client.zzbo) r0     // Catch: java.lang.NullPointerException -> L2c android.os.RemoteException -> L33 java.lang.Throwable -> L44
            r0.zzc()     // Catch: java.lang.NullPointerException -> L2c android.os.RemoteException -> L33 java.lang.Throwable -> L44
            goto L39
        L2c:
            r0 = move-exception
            java.lang.String r1 = "NullPointerException occurs when invoking a method from a delegating listener."
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r1, r0)     // Catch: java.lang.Throwable -> L44
            goto L39
        L33:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzo.zzl(r1, r0)     // Catch: java.lang.Throwable -> L44
        L39:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f17972OooOoo     // Catch: java.lang.Throwable -> L44
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Throwable -> L44
            r2.OooOOO()     // Catch: java.lang.Throwable -> L44
            monitor-exit(r2)
            return
        L44:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c90.OoooOOO():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final void o0OOO0o(zze zzeVar) {
        AtomicReference atomicReference = this.f17967OooOo0O;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzbl) obj).zzf(zzeVar);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((zzbl) obj2).zze(zzeVar.zza);
            } catch (RemoteException e3) {
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.f17970OooOoO0.get();
        if (obj3 != null) {
            try {
                ((zzbo) obj3).zzb(zzeVar);
            } catch (RemoteException e5) {
                zzo.zzl("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
        this.f17971OooOoOO.set(false);
        this.f17975OooOooo.clear();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO000)).booleanValue() || (obj = this.f17967OooOo0O.get()) == null) {
            return;
        }
        try {
            ((zzbl) obj).zzc();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        if (!this.f17971OooOoOO.get()) {
            Object obj = this.f17968OooOo0o.get();
            if (obj != null) {
                try {
                    ((zzcm) obj).zzc(str, str2);
                } catch (RemoteException e) {
                    zzo.zzl("#007 Could not call remote method.", e);
                } catch (NullPointerException e2) {
                    zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                }
            }
            return;
        }
        if (!this.f17975OooOooo.offer(new Pair(str, str2))) {
            zzo.zze("The queue for app events is full, dropping the new event.");
            h20 h20Var = this.f17974OooOooO;
            if (h20Var != null) {
                C1548ey c1548eyOooO00o = h20Var.OooO00o();
                c1548eyOooO00o.OooO0oO("action", "dae_action");
                c1548eyOooO00o.OooO0oO("dae_name", str);
                c1548eyOooO00o.OooO0oO("dae_data", str2);
                c1548eyOooO00o.OooOOO0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
        this.f17971OooOoOO.set(true);
        this.f17972OooOoo.set(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zza() {
        af0.OooOOOo(this.f17967OooOo0O, new C1658hx(13, (byte) 0));
        Object obj = this.f17969OooOoO.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzct) obj).zzc();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzb() {
        Object obj = this.f17967OooOo0O.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbl) obj).zzh();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzc() {
        af0.OooOOOo(this.f17967OooOo0O, new C1658hx(14, (byte) 0));
        AtomicReference atomicReference = this.f17969OooOoO;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzct) obj).zzf();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((zzct) obj2).zze();
        } catch (RemoteException e3) {
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final void zzr() {
        Object obj = this.f17967OooOo0O.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbl) obj).zzg();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void zzu() {
        Object obj = this.f17967OooOo0O.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbl) obj).zzk();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void OooO0oo(BinderC1460cj binderC1460cj, String str, String str2) {
    }
}
