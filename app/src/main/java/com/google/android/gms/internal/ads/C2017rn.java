package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3912zo;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.google.android.gms.internal.ads.rn */
/* loaded from: classes2.dex */
public final class C2017rn extends AbstractC1869nn implements InterfaceC1868nm {

    /* renamed from: OooOoO */
    public String f23914OooOoO;

    /* renamed from: OooOoO0 */
    public C2313zn f23915OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f23916OooOoOO;

    /* renamed from: OooOoo */
    public C1574fn f23917OooOoo;

    /* renamed from: OooOoo0 */
    public boolean f23918OooOoo0;

    /* renamed from: OooOooO */
    public long f23919OooOooO;

    /* renamed from: OooOooo */
    public long f23920OooOooo;

    public static String OooOo00(Exception exc, String str) {
        return str + "/" + exc.getClass().getCanonicalName() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO00o(Exception exc, String str) {
        zzo.zzk("Precache error", exc);
        zzv.zzp().OooO0oO("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO0O0(IOException iOException) {
        zzo.zzk("Precache exception", iOException);
        zzv.zzp().OooO0oO("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO0OO(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO0Oo(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO0o0(long j, boolean z) {
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f21515OooOo.get();
        if (interfaceC1722jo != null) {
            AbstractC2200wl.f25325OooO0o.execute(new RunnableC2238xm(interfaceC1722jo, z, j, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooO0oO() {
        C2313zn c2313zn = this.f23915OooOoO0;
        if (c2313zn != null) {
            c2313zn.f26221OooOooo = null;
            b61 b61Var = c2313zn.f26219OooOoo0;
            if (b61Var != null) {
                b61Var.f17421OooOoO0.OooO00o();
                b61Var.f17420OooOo.o00000oo(c2313zn);
                b61 b61Var2 = c2313zn.f26219OooOoo0;
                b61Var2.f17421OooOoO0.OooO00o();
                b61Var2.f17420OooOo.o0000o();
                c2313zn.f26219OooOoo0 = null;
                C2313zn.f26211OoooO00.decrementAndGet();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooOO0() {
        synchronized (this) {
            this.f23916OooOoOO = true;
            notify();
            OooO0oO();
        }
        String str = this.f23914OooOoO;
        if (str != null) {
            OooOO0O(this.f23914OooOoO, "cache:".concat(String.valueOf(zzf.zzf(str))), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooOOO(int i) {
        C2128un c2128un = this.f23915OooOoO0.f26214OooOo0o;
        synchronized (c2128un) {
            c2128un.f24667OooO0o0 = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooOOO0(int i) {
        C2128un c2128un = this.f23915OooOoO0.f26214OooOo0o;
        synchronized (c2128un) {
            c2128un.f24665OooO0Oo = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooOOOO(int i) {
        C2128un c2128un = this.f23915OooOoO0.f26214OooOo0o;
        synchronized (c2128un) {
            c2128un.f24664OooO0OO = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooOOOo(int i) {
        C2128un c2128un = this.f23915OooOoO0.f26214OooOo0o;
        synchronized (c2128un) {
            c2128un.f24663OooO0O0 = i * 1000;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.os.Handler] */
    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final boolean OooOOo(String str, String[] strArr) throws Throwable {
        boolean z;
        long j;
        long j2;
        long j3;
        C2017rn c2017rn;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z2;
        long j9;
        C2017rn c2017rn2 = this;
        String str2 = str;
        c2017rn2.f23914OooOoO = str2;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(str2)));
        boolean z3 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            C2313zn c2313zn = c2017rn2.f23915OooOoO0;
            c2313zn.getClass();
            c2313zn.OooOOo(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) c2017rn2.f21515OooOo.get();
            if (interfaceC1722jo != null) {
                interfaceC1722jo.o00Ooo(strConcat, c2017rn2);
            }
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17746Oooo0o0)).longValue();
            long jLongValue2 = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17744Oooo0OO)).longValue() * 1000;
            long jIntValue = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17726OooOOoo)).intValue();
            boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue();
            long j10 = -1;
            c2017rn2 = c2017rn2;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (c2017rn2.f23916OooOoOO) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (c2017rn2.f23918OooOoo0) {
                            return true;
                        }
                        b61 b61Var = c2017rn2.f23915OooOoO0.f26219OooOoo0;
                        if (!(b61Var != null ? true : z3)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jO0000oO = b61Var.o0000oO();
                        if (jO0000oO > 0) {
                            long jO0000O00 = c2017rn2.f23915OooOoO0.f26219OooOoo0.o0000O00();
                            if (jO0000O00 != j10) {
                                if (jO0000O00 > 0) {
                                    j7 = jLongValue;
                                    j8 = jLongValue2;
                                    j5 = jO0000oO;
                                    z2 = true;
                                } else {
                                    j7 = jLongValue;
                                    j8 = jLongValue2;
                                    j5 = jO0000oO;
                                    z2 = z3;
                                }
                                if (zBooleanValue) {
                                    try {
                                        C2313zn c2313zn2 = c2017rn2.f23915OooOoO0;
                                        j9 = (c2313zn2.f26230Oooo0oO == null || !c2313zn2.f26230Oooo0oO.f25018Oooo0O0) ? c2313zn2.f26223Oooo000 : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = false;
                                        c2017rn2 = c2017rn2;
                                    }
                                } else {
                                    j9 = -1;
                                }
                                long jOooOo0 = zBooleanValue ? c2017rn2.f23915OooOoO0.OooOo0() : -1L;
                                long jOooOOo0 = zBooleanValue ? c2017rn2.f23915OooOoO0.OooOOo0() : -1L;
                                try {
                                    int i2 = C2313zn.f26210Oooo.get();
                                    int i3 = C2313zn.f26211OoooO00.get();
                                    Handler handler = zzf.zza;
                                    j4 = j7;
                                    j = j8;
                                    z = false;
                                    long j11 = j9;
                                    j6 = jO0000O00;
                                    j2 = jIntValue;
                                    try {
                                        RunnableC1685in runnableC1685in = new RunnableC1685in(c2017rn2, str2, strConcat, j6, j5, j11, jOooOo0, jOooOOo0, z2, i2, i3);
                                        ?? r1 = handler;
                                        r1.post(runnableC1685in);
                                        j10 = j6;
                                        c2017rn = r1;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c2017rn2 = this;
                                        str2 = str;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = false;
                                    c2017rn2 = this;
                                    str2 = str;
                                    throw th;
                                }
                            } else {
                                z = z3;
                                j4 = jLongValue;
                                j = jLongValue2;
                                j2 = jIntValue;
                                j5 = jO0000oO;
                                j6 = jO0000O00;
                                c2017rn = c2017rn2;
                            }
                            if (j6 >= j5) {
                                zzf.zza.post(new RunnableC1832mn(this, str, strConcat, j5));
                                return true;
                            }
                            try {
                                C2017rn c2017rn3 = this;
                                str2 = str;
                                if (c2017rn3.f23915OooOoO0.f26223Oooo000 >= j2 && j6 > 0) {
                                    return true;
                                }
                                j3 = j4;
                                c2017rn = c2017rn3;
                            } catch (Throwable th4) {
                                th = th4;
                                c2017rn2 = c2017rn;
                            }
                        } else {
                            z = z3;
                            j = jLongValue2;
                            j2 = jIntValue;
                            j3 = jLongValue;
                            c2017rn = c2017rn2;
                        }
                        try {
                            c2017rn.wait(j3);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = z3;
                        c2017rn2 = c2017rn2;
                    }
                }
                try {
                    throw th;
                } catch (Exception e) {
                    e = e;
                    zzo.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                    zzv.zzp().OooO0oO("VideoStreamExoPlayerCache.preload", e);
                    c2017rn2.OooO0oO();
                    c2017rn2.OooOO0O(str2, strConcat, C3912zo.a.f13038g, OooOo00(e, C3912zo.a.f13038g));
                    return z;
                }
                jLongValue = j3;
                z3 = z;
                jIntValue = j2;
                jLongValue2 = j;
                c2017rn2 = c2017rn;
            }
        } catch (Exception e2) {
            e = e2;
            z = z3;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final boolean OooOOo0(String str) {
        return OooOOo(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final boolean OooOOoo(String str, String[] strArr, C1574fn c1574fn) {
        this.f23914OooOoO = str;
        this.f23917OooOoo = c1574fn;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(str)));
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            C2313zn c2313zn = this.f23915OooOoO0;
            c2313zn.getClass();
            c2313zn.OooOOo(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f21515OooOo.get();
            if (interfaceC1722jo != null) {
                interfaceC1722jo.o00Ooo(strConcat, this);
            }
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            this.f23919OooOooO = System.currentTimeMillis();
            this.f23920OooOooo = -1L;
            zzs.zza.postDelayed(new RunnableC1442c1(this, 15), 0L);
            return true;
        } catch (Exception e) {
            zzo.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            zzv.zzp().OooO0oO("VideoStreamExoPlayerCache.preload", e);
            OooO0oO();
            OooOO0O(str, strConcat, C3912zo.a.f13038g, OooOo00(e, C3912zo.a.f13038g));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void zzv() {
        zzo.zzj("Precache onRenderedFirstFrame");
    }
}
