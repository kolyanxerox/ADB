package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.an */
/* loaded from: classes2.dex */
public final class C1391an implements zm0 {

    /* renamed from: OooOo */
    public final String f17055OooOo;

    /* renamed from: OooOo0O */
    public final Context f17056OooOo0O;

    /* renamed from: OooOo0o */
    public final nt0 f17057OooOo0o;

    /* renamed from: OooOoO */
    public final boolean f17058OooOoO;

    /* renamed from: OooOoO0 */
    public final int f17059OooOoO0;

    /* renamed from: OooOoOO */
    public InputStream f17060OooOoOO;

    /* renamed from: OooOoo */
    public Uri f17061OooOoo;

    /* renamed from: OooOoo0 */
    public boolean f17062OooOoo0;

    /* renamed from: OooOooO */
    public volatile C1702j4 f17063OooOooO;

    /* renamed from: OooOooo */
    public boolean f17064OooOooo = false;

    /* renamed from: Oooo000 */
    public boolean f17065Oooo000 = false;

    /* renamed from: Oooo00O */
    public iq0 f17066Oooo00O;

    public C1391an(Context context, nt0 nt0Var, String str, int i) {
        this.f17056OooOo0O = context;
        this.f17057OooOo0o = nt0Var;
        this.f17055OooOo = str;
        this.f17059OooOoO0 = i;
        new AtomicLong(-1L);
        this.f17058OooOoO = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue();
    }

    public final boolean OooO0OO() {
        if (!this.f17058OooOoO) {
            return false;
        }
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00o0)).booleanValue() || this.f17064OooOooo) {
            return ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoooO)).booleanValue() && !this.f17065Oooo000;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) throws IOException {
        if (this.f17062OooOoo0) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f17062OooOoo0 = true;
        Uri uri = iq0Var.f20087OooO00o;
        this.f17061OooOoo = uri;
        this.f17066Oooo00O = iq0Var;
        this.f17063OooOooO = C1702j4.OooO0o0(uri);
        C1629h4 c1629h4OooO00o = null;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OooO)).booleanValue()) {
            if (this.f17063OooOooO != null) {
                this.f17063OooOooO.zzh = iq0Var.f20089OooO0OO;
                C1702j4 c1702j4 = this.f17063OooOooO;
                String str = this.f17055OooOo;
                c1702j4.zzi = str != null ? str : "";
                this.f17063OooOooO.zzj = this.f17059OooOoO0;
                c1629h4OooO00o = zzv.zzc().OooO00o(this.f17063OooOooO);
            }
            if (c1629h4OooO00o != null && c1629h4OooO00o.OooO()) {
                this.f17064OooOooo = c1629h4OooO00o.OooOO0O();
                this.f17065Oooo000 = c1629h4OooO00o.OooOO0();
                if (!OooO0OO()) {
                    this.f17060OooOoOO = c1629h4OooO00o.OooO0o();
                    return -1L;
                }
            }
        } else if (this.f17063OooOooO != null) {
            this.f17063OooOooO.zzh = iq0Var.f20089OooO0OO;
            C1702j4 c1702j42 = this.f17063OooOooO;
            String str2 = this.f17055OooOo;
            c1702j42.zzi = str2 != null ? str2 : "";
            this.f17063OooOooO.zzj = this.f17059OooOoO0;
            long jLongValue = (this.f17063OooOooO.zzg ? (Long) zzbe.zzc().OooO00o(AbstractC1448c7.o00OooOo) : (Long) zzbe.zzc().OooO00o(AbstractC1448c7.o00OooOO)).longValue();
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            SystemClock.elapsedRealtime();
            zzv.zzd();
            C1776l4 c1776l4OooO00o = C1887o4.OooO00o(this.f17056OooOo0O, this.f17063OooOooO);
            try {
                try {
                    try {
                        C1924p4 c1924p4 = (C1924p4) c1776l4OooO00o.get(jLongValue, TimeUnit.MILLISECONDS);
                        c1924p4.getClass();
                        this.f17064OooOooo = c1924p4.f23216OooO0OO;
                        this.f17065Oooo000 = c1924p4.f23218OooO0o0;
                        if (!OooO0OO()) {
                            this.f17060OooOoOO = c1924p4.f23214OooO00o;
                        }
                    } catch (InterruptedException unused) {
                        c1776l4OooO00o.cancel(false);
                        Thread.currentThread().interrupt();
                    }
                } catch (ExecutionException | TimeoutException unused2) {
                    c1776l4OooO00o.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f17063OooOooO != null) {
            Map map = iq0Var.f20088OooO0O0;
            long j = iq0Var.f20089OooO0OO;
            long j2 = iq0Var.f20090OooO0Oo;
            int i = iq0Var.f20091OooO0o0;
            Uri uri2 = Uri.parse(this.f17063OooOooO.zza);
            if (uri2 == null) {
                throw new IllegalStateException("The uri must be set.");
            }
            this.f17066Oooo00O = new iq0(uri2, map, j, j2, i);
        }
        return this.f17057OooOo0o.OooO0Oo(this.f17066Oooo00O);
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void OooO0oo(e01 e01Var) {
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f17062OooOoo0) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f17060OooOoOO;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.f17057OooOo0o.OooOO0(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        return this.f17061OooOoo;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() throws IOException {
        if (!this.f17062OooOoo0) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f17062OooOoo0 = false;
        this.f17061OooOoo = null;
        InputStream inputStream = this.f17060OooOoOO;
        if (inputStream == null) {
            this.f17057OooOo0o.zzd();
        } else {
            Oooo0OO.o00oO0o.OooO0Oo(inputStream);
            this.f17060OooOoOO = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }
}
