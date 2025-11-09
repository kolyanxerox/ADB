package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.vn */
/* loaded from: classes2.dex */
public final class C2165vn extends rj0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Context f25007OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final zm0 f25008OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final int f25009OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final String f25010OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final boolean f25011OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public InputStream f25012OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public final wj0 f25013Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public boolean f25014Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public boolean f25015Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public Uri f25016Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public volatile C1702j4 f25017Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f25018Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f25019Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public long f25020Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f25021Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public o00000oO.OooOOO f25022Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public final AtomicLong f25023Oooo0oo;

    public C2165vn(Context context, zm0 zm0Var, String str, int i, e01 e01Var, wj0 wj0Var) {
        super(false);
        this.f25007OooOoO = context;
        this.f25008OooOoOO = zm0Var;
        this.f25013Oooo = wj0Var;
        this.f25010OooOoo0 = str;
        this.f25009OooOoo = i;
        this.f25014Oooo0 = false;
        this.f25018Oooo0O0 = false;
        this.f25019Oooo0OO = false;
        this.f25021Oooo0o0 = false;
        this.f25020Oooo0o = 0L;
        this.f25023Oooo0oo = new AtomicLong(-1L);
        this.f25022Oooo0oO = null;
        this.f25011OooOooO = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue();
        OooO0oo(e01Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020e  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.google.android.gms.internal.ads.zm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0Oo(com.google.android.gms.internal.ads.iq0 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2165vn.OooO0Oo(com.google.android.gms.internal.ads.iq0):long");
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f25015Oooo000) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f25012OooOooo;
        int iOooOO0 = inputStream != null ? inputStream.read(bArr, i, i2) : this.f25008OooOoOO.OooOO0(bArr, i, i2);
        if (this.f25011OooOooO && this.f25012OooOooo == null) {
            return iOooOO0;
        }
        OooO00o(iOooOO0);
        return iOooOO0;
    }

    public final boolean OooOOO0() {
        if (!this.f25011OooOooO) {
            return false;
        }
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00o0)).booleanValue() || this.f25019Oooo0OO) {
            return ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoooO)).booleanValue() && !this.f25021Oooo0o0;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        return this.f25016Oooo00O;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() throws IOException {
        if (!this.f25015Oooo000) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f25015Oooo000 = false;
        this.f25016Oooo00O = null;
        boolean z = (this.f25011OooOooO && this.f25012OooOooo == null) ? false : true;
        InputStream inputStream = this.f25012OooOooo;
        if (inputStream != null) {
            Oooo0OO.o00oO0o.OooO0Oo(inputStream);
            this.f25012OooOooo = null;
        } else {
            this.f25008OooOoOO.zzd();
        }
        if (z) {
            OooO0OO();
        }
    }
}
