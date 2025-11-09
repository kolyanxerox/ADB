package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3912zo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.google.android.gms.internal.ads.qn */
/* loaded from: classes2.dex */
public final class C1980qn extends AbstractC1869nn implements e01 {

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public static final AtomicInteger f23654Oooo0O0 = new AtomicInteger(0);

    /* renamed from: OooOoO, reason: collision with root package name */
    public final C2053sm f23655OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public String f23656OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public boolean f23657OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final o0000O00 f23658OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final OoooOOO.o0O0O0O f23659OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public ByteBuffer f23660OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public boolean f23661OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public boolean f23662Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final Object f23663Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final String f23664Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final int f23665Oooo00o;

    public C1980qn(InterfaceC1722jo interfaceC1722jo, C2053sm c2053sm) {
        super(interfaceC1722jo);
        this.f23655OooOoO = c2053sm;
        this.f23659OooOoo0 = new OoooOOO.o0O0O0O(5);
        this.f23658OooOoo = new o0000O00();
        this.f23663Oooo000 = new Object();
        String strZzr = interfaceC1722jo.zzr();
        this.f23664Oooo00O = (String) (strZzr == null ? tk0.f24329OooOo0O : new bl0(strZzr)).OooO0O0();
        this.f23665Oooo00o = interfaceC1722jo.zzf();
        f23654Oooo0O0.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooO0oO() {
        f23654Oooo0O0.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooOO0() {
        this.f23657OooOoOO = true;
    }

    @Override // com.google.android.gms.internal.ads.e01
    public final void OooOO0o(rj0 rj0Var, iq0 iq0Var, boolean z) {
        if (rj0Var instanceof nt0) {
            ((ArrayList) this.f23659OooOoo0.f14388OooOo0o).add((nt0) rj0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.google.android.gms.internal.ads.an] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.e01, com.google.android.gms.internal.ads.nn, com.google.android.gms.internal.ads.qn] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final boolean OooOOo0(String str) throws IOException {
        String str2;
        String str3;
        ?? r6;
        ?? r2;
        nt0 nt0Var;
        long jCurrentTimeMillis;
        long jLongValue;
        long jLongValue2;
        int i;
        byte[] bArr;
        long j;
        long j2;
        String str4 = str;
        this.f23656OooOoO0 = str4;
        String str5 = C3912zo.a.f13038g;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(str4)));
        try {
            dx0 dx0Var = new dx0(0);
            String str6 = this.f21517OooOo0o;
            C2053sm c2053sm = this.f23655OooOoO;
            nt0Var = new nt0(str6, c2053sm.f24114OooO0Oo, c2053sm.f24116OooO0o0, true, dx0Var);
            nt0Var.OooO0oo(this);
            if (this.f23655OooOoO.f24110OooO) {
                nt0Var = new C1391an(this.f21516OooOo0O, nt0Var, this.f23664Oooo00O, this.f23665Oooo00o);
            }
            nt0Var.OooO0Oo(new iq0(Uri.parse(str4), 0L, -1L));
            InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f21515OooOo.get();
            if (interfaceC1722jo != null) {
                interfaceC1722jo.o00Ooo(strConcat, this);
            }
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
            jLongValue = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17746Oooo0o0)).longValue();
            jLongValue2 = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17744Oooo0OO)).longValue();
            this.f23660OooOooO = ByteBuffer.allocate(this.f23655OooOoO.f24113OooO0OO);
            i = 8192;
            bArr = new byte[8192];
            j = jCurrentTimeMillis;
            str4 = str4;
        } catch (Exception e) {
            e = e;
            str2 = str4;
        }
        while (true) {
            try {
                int iOooOO0 = nt0Var.OooOO0(bArr, 0, Math.min(this.f23660OooOooO.remaining(), i));
                r2 = -1;
                str3 = str5;
                if (iOooOO0 == -1) {
                    try {
                        this.f23662Oooo0 = true;
                        zzf.zza.post(new RunnableC1832mn((AbstractC1869nn) this, str, strConcat, (int) this.f23658OooOoo.OooO00o(this.f23660OooOooO)));
                        return true;
                    } catch (Exception e2) {
                        e = e2;
                        r2 = str;
                    }
                } else {
                    try {
                        r2 = str;
                        r6 = this.f23663Oooo000;
                        synchronized (r6) {
                            try {
                                if (this.f23657OooOoOO) {
                                    j2 = jCurrentTimeMillis;
                                } else {
                                    j2 = jCurrentTimeMillis;
                                    this.f23660OooOooO.put(bArr, 0, iOooOO0);
                                }
                            } finally {
                            }
                        }
                        if (this.f23660OooOooO.remaining() <= 0) {
                            OooOo00();
                            return true;
                        }
                        try {
                            if (this.f23657OooOoOO) {
                                throw new IOException("Precache abort at " + this.f23660OooOooO.limit() + " bytes");
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (jCurrentTimeMillis2 - j >= jLongValue) {
                                OooOo00();
                                j = jCurrentTimeMillis2;
                            }
                            if (jCurrentTimeMillis2 - j2 > 1000 * jLongValue2) {
                                throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                            }
                            str5 = str3;
                            jCurrentTimeMillis = j2;
                            i = 8192;
                            str4 = r2;
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        r2 = r2;
                    }
                }
            } catch (Exception e5) {
                e = e5;
                str2 = str;
                str3 = str5;
                r2 = str2;
                r6 = str3;
                String strOooOoo = OooO0oO.OooOo.OooOoo(e.getClass().getCanonicalName(), TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, e.getMessage());
                zzo.zzj("Failed to preload url " + r2 + " Exception: " + strOooOoo);
                OooOO0O(r2, strConcat, r6, strOooOoo);
                return false;
            }
            r6 = str3;
            String strOooOoo2 = OooO0oO.OooOo.OooOoo(e.getClass().getCanonicalName(), TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, e.getMessage());
            zzo.zzj("Failed to preload url " + r2 + " Exception: " + strOooOoo2);
            OooOO0O(r2, strConcat, r6, strOooOoo2);
            return false;
        }
    }

    public final void OooOo00() {
        OoooOOO.o0O0O0O o0o0o0o = this.f23659OooOoo0;
        Iterator it = ((ArrayList) o0o0o0o.f14388OooOo0o).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((nt0) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        o0o0o0o.f14387OooOo0O = Math.max(o0o0o0o.f14387OooOo0O, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) o0o0o0o.f14387OooOo0O;
        int iOooO00o = (int) this.f23658OooOoo.OooO00o(this.f23660OooOooO);
        int iPosition = this.f23660OooOooO.position();
        int iRound = Math.round((iPosition / i) * iOooO00o);
        int i2 = C2313zn.f26210Oooo.get();
        int i3 = C2313zn.f26211OoooO00.get();
        String str = this.f23656OooOoO0;
        zzf.zza.post(new RunnableC1758kn(this, str, "cache:".concat(String.valueOf(zzf.zzf(str))), iPosition, i, iRound, iOooO00o, iRound > 0, i2, i3));
    }

    @Override // com.google.android.gms.internal.ads.e01
    public final void OooO(iq0 iq0Var, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.e01
    public final void OooO0o(iq0 iq0Var, boolean z, int i) {
    }
}
