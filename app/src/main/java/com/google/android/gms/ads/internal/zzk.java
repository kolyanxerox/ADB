package com.google.android.gms.ads.internal;

import OoooOOO.o0O0oo00;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2142v0;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1479d1;
import com.google.android.gms.internal.ads.C1589g1;
import com.google.android.gms.internal.ads.C1697j;
import com.google.android.gms.internal.ads.C1698j0;
import com.google.android.gms.internal.ads.C1734k;
import com.google.android.gms.internal.ads.C1735k0;
import com.google.android.gms.internal.ads.C1846n0;
import com.google.android.gms.internal.ads.C1920p0;
import com.google.android.gms.internal.ads.C2070t2;
import com.google.android.gms.internal.ads.InterfaceC1552f1;
import com.google.android.gms.internal.ads.fj0;
import com.google.android.gms.internal.ads.gi0;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.nq0;
import com.google.android.gms.internal.measurement.o0OOO00;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzk implements Runnable, InterfaceC1552f1 {

    /* renamed from: OooOoO */
    public final boolean f16331OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f16332OooOoO0;

    /* renamed from: OooOoOO */
    public final boolean f16333OooOoOO;

    /* renamed from: OooOoo */
    public final o0O0oo00 f16334OooOoo;

    /* renamed from: OooOoo0 */
    public final ExecutorService f16335OooOoo0;

    /* renamed from: OooOooO */
    public Context f16336OooOooO;

    /* renamed from: OooOooo */
    public final Context f16337OooOooo;

    /* renamed from: Oooo000 */
    public VersionInfoParcel f16339Oooo000;

    /* renamed from: Oooo00O */
    public final VersionInfoParcel f16340Oooo00O;

    /* renamed from: Oooo00o */
    public final boolean f16341Oooo00o;

    /* renamed from: Oooo0O0 */
    public int f16342Oooo0O0;

    /* renamed from: OooOo0O */
    public final Vector f16329OooOo0O = new Vector();

    /* renamed from: OooOo0o */
    public final AtomicReference f16330OooOo0o = new AtomicReference();

    /* renamed from: OooOo */
    public final AtomicReference f16328OooOo = new AtomicReference();

    /* renamed from: Oooo0 */
    public final CountDownLatch f16338Oooo0 = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.f16336OooOooO = context;
        this.f16337OooOooo = context;
        this.f16339Oooo000 = versionInfoParcel;
        this.f16340Oooo00O = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f16335OooOoo0 = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17858o00O000)).booleanValue();
        this.f16341Oooo00o = zBooleanValue;
        this.f16334OooOoo = o0O0oo00.OooO0OO(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f16331OooOoO = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00O0000)).booleanValue();
        this.f16333OooOoOO = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00O000o)).booleanValue();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17923o00oOoo)).booleanValue()) {
            this.f16342Oooo0O0 = 2;
        } else {
            this.f16342Oooo0O0 = 1;
        }
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17900o00OOO0O)).booleanValue()) {
            this.f16332OooOoO0 = OooO00o();
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OO0oO)).booleanValue()) {
            AbstractC2200wl.f25321OooO00o.execute(this);
            return;
        }
        zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzu()) {
            AbstractC2200wl.f25321OooO00o.execute(this);
        } else {
            run();
        }
    }

    public static final C1479d1 OooO0o0(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        C1479d1 c1479d1OooO0Oo;
        C1697j c1697jOooOo0o = C1734k.OooOo0o();
        c1697jOooOo0o.OooO0Oo();
        C1734k.OooOoOO((C1734k) c1697jOooOo0o.f25822OooOo0o, z);
        String str = versionInfoParcel.afmaVersion;
        c1697jOooOo0o.OooO0Oo();
        C1734k.OooOoo0((C1734k) c1697jOooOo0o.f25822OooOo0o, str);
        C1734k c1734k = (C1734k) c1697jOooOo0o.OooO0O0();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (C1479d1.class) {
            gi0 gi0Var = new gi0();
            gi0Var.f19356OooO0O0 = false;
            byte b = (byte) (gi0Var.f19359OooO0o | 1);
            gi0Var.f19357OooO0OO = true;
            gi0Var.f19358OooO0Oo = 100L;
            gi0Var.f19360OooO0o0 = 300L;
            gi0Var.f19359OooO0o = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16)) | 32);
            String strOooOoO = c1734k.OooOoO();
            if (strOooOoO == null) {
                throw new NullPointerException("Null clientVersion");
            }
            gi0Var.f19355OooO00o = strOooOoO;
            gi0Var.f19356OooO0O0 = c1734k.OooOoo();
            gi0Var.f19359OooO0o = (byte) (gi0Var.f19359OooO0o | 1);
            c1479d1OooO0Oo = C1479d1.OooO0Oo(context, Executors.newCachedThreadPool(), gi0Var.OooO00o(), z2);
        }
        return c1479d1OooO0Oo;
    }

    public final boolean OooO00o() throws IOException {
        Context context = this.f16336OooOooO;
        zzj zzjVar = new zzj(this);
        fj0 fj0Var = new fj0(context, ii0.OooOo0o(context, this.f16334OooOoo), zzjVar, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17926o0O0ooO)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (fj0.f18953OooOoOO) {
            try {
                C2070t2 c2070t2OooO0oO = fj0Var.OooO0oO(1);
                if (c2070t2OooO0oO == null) {
                    fj0Var.OooO0o(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileOooO0Oo = fj0Var.OooO0Oo(c2070t2OooO0oO.OooOooo());
                if (!new File(fileOooO0Oo, "pcam.jar").exists()) {
                    fj0Var.OooO0o(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileOooO0Oo, "pcbc").exists()) {
                    fj0Var.OooO0o(5019, jCurrentTimeMillis);
                    return true;
                }
                fj0Var.OooO0o(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC1552f1 OooO0O0() {
        return ((!this.f16331OooOoO || this.f16332OooOoO0) ? this.f16342Oooo0O0 : 1) == 2 ? (InterfaceC1552f1) this.f16328OooOo.get() : (InterfaceC1552f1) this.f16330OooOo0o.get();
    }

    public final void OooO0OO() {
        Vector vector = this.f16329OooOo0O;
        InterfaceC1552f1 interfaceC1552f1OooO0O0 = OooO0O0();
        if (vector.isEmpty() || interfaceC1552f1OooO0O0 == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                interfaceC1552f1OooO0O0.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                interfaceC1552f1OooO0O0.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void OooO0Oo(boolean z) {
        String str = this.f16339Oooo000.afmaVersion;
        Context context = this.f16336OooOooO;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        C1697j c1697jOooOo0o = C1734k.OooOo0o();
        c1697jOooOo0o.OooO0Oo();
        C1734k.OooOoOO((C1734k) c1697jOooOo0o.f25822OooOo0o, z);
        c1697jOooOo0o.OooO0Oo();
        C1734k.OooOoo0((C1734k) c1697jOooOo0o.f25822OooOo0o, str);
        this.f16330OooOo0o.set(C1589g1.OooOOO0(context, new o0OOO00((C1734k) c1697jOooOo0o.OooO0O0())));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17900o00OOO0O)).booleanValue()) {
                this.f16332OooOoO0 = OooO00o();
            }
            boolean z2 = this.f16339Oooo000.isClientJar;
            final boolean z3 = false;
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17795o0000o0)).booleanValue() && z2) {
                z3 = true;
            }
            if (((!this.f16331OooOoO || this.f16332OooOoO0) ? this.f16342Oooo0O0 : 1) == 1) {
                OooO0Oo(z3);
                if (this.f16342Oooo0O0 == 2) {
                    this.f16335OooOoo0.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzk zzkVar = this.zza;
                            boolean z4 = z3;
                            zzkVar.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                zzk.OooO0o0(zzkVar.f16337OooOooo, zzkVar.f16340Oooo00O, z4, zzkVar.f16341Oooo00o).OooO0OO();
                            } catch (NullPointerException e) {
                                zzkVar.f16334OooOoo.OooO0oO(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
                            }
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    C1479d1 c1479d1OooO0o0 = OooO0o0(this.f16336OooOooO, this.f16339Oooo000, z3, this.f16341Oooo00o);
                    this.f16328OooOo.set(c1479d1OooO0o0);
                    if (this.f16333OooOoOO) {
                        synchronized (c1479d1OooO0o0) {
                            z = c1479d1OooO0o0.f18127Oooo0OO;
                        }
                        if (!z) {
                            this.f16342Oooo0O0 = 1;
                            OooO0Oo(z3);
                        }
                    }
                } catch (NullPointerException e) {
                    this.f16342Oooo0O0 = 1;
                    OooO0Oo(z3);
                    this.f16334OooOoo.OooO0oO(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.f16338Oooo0.countDown();
            this.f16336OooOooO = null;
            this.f16339Oooo000 = null;
        } catch (Throwable th) {
            this.f16338Oooo0.countDown();
            this.f16336OooOooO = null;
            this.f16339Oooo000 = null;
            throw th;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        InterfaceC1552f1 interfaceC1552f1OooO0O0;
        if (!zzj() || (interfaceC1552f1OooO0O0 = OooO0O0()) == null) {
            return "";
        }
        OooO0OO();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return interfaceC1552f1OooO0O0.zzf(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zze(Context context, String str, View view, Activity activity) {
        if (!zzj()) {
            return "";
        }
        InterfaceC1552f1 interfaceC1552f1OooO0O0 = OooO0O0();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0oo0)).booleanValue()) {
            zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 4, null);
        }
        if (interfaceC1552f1OooO0O0 == null) {
            return "";
        }
        OooO0OO();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return interfaceC1552f1OooO0O0.zze(context, str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzf(Context context) {
        return zzb(context, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzg(final Context context) {
        nq0 nq0Var = new nq0(new Callable() { // from class: com.google.android.gms.ads.internal.zzh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb(context, null);
            }
        });
        this.f16335OooOoo0.execute(nq0Var);
        try {
            return (String) nq0Var.get(((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17939oo0o0O0)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.f16340Oooo00O.afmaVersion;
            try {
                C1698j0 c1698j0OooOo0o = C1735k0.OooOo0o();
                c1698j0OooOo0o.OooO0Oo();
                C1735k0.OooOoO0((C1735k0) c1698j0OooOo0o.f25822OooOo0o, str);
                c1698j0OooOo0o.OooO0Oo();
                C1735k0.OooOo((C1735k0) c1698j0OooOo0o.f25822OooOo0o);
                String packageName = context.getPackageName();
                c1698j0OooOo0o.OooO0Oo();
                C1735k0.OooOoO((C1735k0) c1698j0OooOo0o.f25822OooOo0o, packageName);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                c1698j0OooOo0o.OooO0Oo();
                C1735k0.OooOoOO((C1735k0) c1698j0OooOo0o.f25822OooOo0o, jCurrentTimeMillis);
                try {
                    long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    c1698j0OooOo0o.OooO0Oo();
                    C1735k0.OooOoo0((C1735k0) c1698j0OooOo0o.f25822OooOo0o, j);
                } catch (PackageManager.NameNotFoundException unused3) {
                    c1698j0OooOo0o.OooO0Oo();
                    C1735k0.OooOoo0((C1735k0) c1698j0OooOo0o.f25822OooOo0o, -1L);
                }
                C1846n0 c1846n0OooO00o = AbstractC2142v0.OooO00o(null, ((C1735k0) c1698j0OooOo0o.OooO0O0()).OooO0Oo());
                c1846n0OooO00o.OooO0Oo();
                C1920p0.OooOoOO((C1920p0) c1846n0OooO00o.f25822OooOo0o);
                c1846n0OooO00o.OooO0Oo();
                C1920p0.OooOoO((C1920p0) c1846n0OooO00o.f25822OooOo0o, 2);
                return Base64.encodeToString(((C1920p0) c1846n0OooO00o.OooO0O0()).OooO0Oo(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0oO)).booleanValue()) {
            InterfaceC1552f1 interfaceC1552f1OooO0O0 = OooO0O0();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0oo0)).booleanValue()) {
                zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
            }
            return interfaceC1552f1OooO0O0 != null ? interfaceC1552f1OooO0O0.zzh(context, view, activity) : "";
        }
        if (!zzj()) {
            return "";
        }
        InterfaceC1552f1 interfaceC1552f1OooO0O02 = OooO0O0();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0oo0)).booleanValue()) {
            zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
        }
        return interfaceC1552f1OooO0O02 != null ? interfaceC1552f1OooO0O02.zzh(context, view, activity) : "";
    }

    public final boolean zzj() throws InterruptedException {
        try {
            this.f16338Oooo0.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzk(MotionEvent motionEvent) {
        InterfaceC1552f1 interfaceC1552f1OooO0O0 = OooO0O0();
        if (interfaceC1552f1OooO0O0 == null) {
            this.f16329OooOo0O.add(new Object[]{motionEvent});
        } else {
            OooO0OO();
            interfaceC1552f1OooO0O0.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzl(int i, int i2, int i3) {
        InterfaceC1552f1 interfaceC1552f1OooO0O0 = OooO0O0();
        if (interfaceC1552f1OooO0O0 == null) {
            this.f16329OooOo0O.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            OooO0OO();
            interfaceC1552f1OooO0O0.zzl(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        InterfaceC1552f1 interfaceC1552f1OooO0O0;
        InterfaceC1552f1 interfaceC1552f1OooO0O02;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oo0oOO0)).booleanValue()) {
            if (this.f16338Oooo0.getCount() != 0 || (interfaceC1552f1OooO0O02 = OooO0O0()) == null) {
                return;
            }
            interfaceC1552f1OooO0O02.zzn(stackTraceElementArr);
            return;
        }
        if (!zzj() || (interfaceC1552f1OooO0O0 = OooO0O0()) == null) {
            return;
        }
        interfaceC1552f1OooO0O0.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzo(View view) {
        InterfaceC1552f1 interfaceC1552f1OooO0O0 = OooO0O0();
        if (interfaceC1552f1OooO0O0 != null) {
            interfaceC1552f1OooO0O0.zzo(view);
        }
    }

    public final int zzp() {
        return this.f16342Oooo0O0;
    }
}
