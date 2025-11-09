package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.tn */
/* loaded from: classes2.dex */
public final class C2091tn extends rj0 implements ux0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final C2054sn f24351OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f24352OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final String f24353OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final int f24354OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final dx0 f24355OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public HttpURLConnection f24356OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public long f24357Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public InputStream f24358Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public boolean f24359Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public int f24360Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public long f24361Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public long f24362Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public int f24363Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public long f24364Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public final HashSet f24365Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public static final Pattern f24350Oooo0oo = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: Oooo, reason: collision with root package name */
    public static final AtomicReference f24349Oooo = new AtomicReference();

    public C2091tn(String str, C2313zn c2313zn, int i, int i2, int i3) {
        super(true);
        this.f24351OooOoO = new C2054sn(this);
        this.f24365Oooo0oO = new HashSet();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f24353OooOoo = str;
        this.f24355OooOooO = new dx0(0);
        this.f24352OooOoOO = i;
        this.f24354OooOoo0 = i2;
        this.f24363Oooo0o = i3;
        if (c2313zn != null) {
            OooO0oo(c2313zn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x024b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021a A[Catch: IOException -> 0x0033, TryCatch #2 {IOException -> 0x0033, blocks: (B:3:0x000d, B:4:0x001a, B:6:0x0020, B:8:0x002a, B:11:0x0036, B:12:0x004e, B:14:0x0054, B:23:0x0085, B:25:0x009f, B:26:0x00b1, B:27:0x00b6, B:40:0x00eb, B:90:0x020f, B:92:0x021a, B:94:0x022b, B:97:0x0234, B:98:0x0243, B:100:0x024b, B:101:0x0252, B:102:0x0253, B:103:0x0269), top: B:110:0x000d }] */
    @Override // com.google.android.gms.internal.ads.zm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0Oo(com.google.android.gms.internal.ads.iq0 r21) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2091tn.OooO0Oo(com.google.android.gms.internal.ads.iq0):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0016, B:12:0x001e, B:14:0x0026, B:17:0x003c, B:18:0x0046, B:19:0x004b, B:20:0x004c, B:21:0x0051, B:22:0x0052, B:25:0x0058, B:27:0x0060, B:30:0x006a, B:31:0x0070, B:33:0x0078, B:36:0x007f, B:37:0x0084, B:38:0x0085), top: B:42:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0016, B:12:0x001e, B:14:0x0026, B:17:0x003c, B:18:0x0046, B:19:0x004b, B:20:0x004c, B:21:0x0051, B:22:0x0052, B:25:0x0058, B:27:0x0060, B:30:0x006a, B:31:0x0070, B:33:0x0078, B:36:0x007f, B:37:0x0084, B:38:0x0085), top: B:42:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.q51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOO0(byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f24362Oooo0OO     // Catch: java.io.IOException -> L1b
            long r2 = r9.f24357Oooo0     // Catch: java.io.IOException -> L1b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = -1
            if (r0 != 0) goto Lb
            goto L55
        Lb:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.ads.C2091tn.f24349Oooo
            r3 = 0
            java.lang.Object r3 = r0.getAndSet(r3)     // Catch: java.io.IOException -> L1b
            byte[] r3 = (byte[]) r3     // Catch: java.io.IOException -> L1b
            if (r3 != 0) goto L1e
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch: java.io.IOException -> L1b
            goto L1e
        L1b:
            r10 = move-exception
            goto L8f
        L1e:
            long r4 = r9.f24362Oooo0OO     // Catch: java.io.IOException -> L1b
            long r6 = r9.f24357Oooo0     // Catch: java.io.IOException -> L1b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L52
            int r8 = r3.length     // Catch: java.io.IOException -> L1b
            long r6 = r6 - r4
            long r4 = (long) r8     // Catch: java.io.IOException -> L1b
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.io.IOException -> L1b
            int r4 = (int) r4     // Catch: java.io.IOException -> L1b
            java.io.InputStream r5 = r9.f24358Oooo000     // Catch: java.io.IOException -> L1b
            int r4 = r5.read(r3, r1, r4)     // Catch: java.io.IOException -> L1b
            boolean r5 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L1b
            if (r5 != 0) goto L4c
            if (r4 == r2) goto L46
            long r5 = r9.f24362Oooo0OO     // Catch: java.io.IOException -> L1b
            long r7 = (long) r4     // Catch: java.io.IOException -> L1b
            long r5 = r5 + r7
            r9.f24362Oooo0OO = r5     // Catch: java.io.IOException -> L1b
            r9.OooO00o(r4)     // Catch: java.io.IOException -> L1b
            goto L1e
        L46:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r10.<init>()     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L4c:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L1b
            r10.<init>()     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L52:
            r0.set(r3)     // Catch: java.io.IOException -> L1b
        L55:
            if (r12 != 0) goto L58
            return r1
        L58:
            long r0 = r9.f24361Oooo0O0     // Catch: java.io.IOException -> L1b
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L70
            long r5 = r9.f24364Oooo0o0     // Catch: java.io.IOException -> L1b
            long r0 = r0 - r5
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L6a
            goto L7e
        L6a:
            long r5 = (long) r12     // Catch: java.io.IOException -> L1b
            long r0 = java.lang.Math.min(r5, r0)     // Catch: java.io.IOException -> L1b
            int r12 = (int) r0     // Catch: java.io.IOException -> L1b
        L70:
            java.io.InputStream r0 = r9.f24358Oooo000     // Catch: java.io.IOException -> L1b
            int r10 = r0.read(r10, r11, r12)     // Catch: java.io.IOException -> L1b
            if (r10 != r2) goto L85
            long r10 = r9.f24361Oooo0O0     // Catch: java.io.IOException -> L1b
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 != 0) goto L7f
        L7e:
            return r2
        L7f:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r10.<init>()     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L85:
            long r11 = r9.f24364Oooo0o0     // Catch: java.io.IOException -> L1b
            long r0 = (long) r10     // Catch: java.io.IOException -> L1b
            long r11 = r11 + r0
            r9.f24364Oooo0o0 = r11     // Catch: java.io.IOException -> L1b
            r9.OooO00o(r10)     // Catch: java.io.IOException -> L1b
            return r10
        L8f:
            com.google.android.gms.internal.ads.mv0 r11 = new com.google.android.gms.internal.ads.mv0
            r12 = 2000(0x7d0, float:2.803E-42)
            r0 = 2
            r11.<init>(r10, r12, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2091tn.OooOO0(byte[], int, int):int");
    }

    public final void OooOOO0() {
        HttpURLConnection httpURLConnection = this.f24356OooOooo;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzo.zzh("Unexpected error while disconnecting", e);
            }
            this.f24356OooOooo = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f24356OooOooo;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        HashSet hashSet = this.f24365Oooo0oO;
        try {
            InputStream inputStream = this.f24358Oooo000;
            if (inputStream != null) {
                int i = i80.f19994OooO00o;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new mv0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, 3);
                }
            }
        } finally {
            this.f24358Oooo000 = null;
            OooOOO0();
            if (this.f24359Oooo00O) {
                this.f24359Oooo00O = false;
                OooO0OO();
            }
            hashSet.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.rj0, com.google.android.gms.internal.ads.zm0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f24356OooOooo;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
