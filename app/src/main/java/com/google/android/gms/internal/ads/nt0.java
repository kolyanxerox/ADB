package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nt0 extends rj0 implements ux0 {

    /* renamed from: OooOoO */
    public final boolean f21596OooOoO;

    /* renamed from: OooOoOO */
    public final int f21597OooOoOO;

    /* renamed from: OooOoo */
    public final String f21598OooOoo;

    /* renamed from: OooOoo0 */
    public final int f21599OooOoo0;

    /* renamed from: OooOooO */
    public final dx0 f21600OooOooO;

    /* renamed from: OooOooo */
    public final dx0 f21601OooOooo;

    /* renamed from: Oooo0 */
    public boolean f21602Oooo0;

    /* renamed from: Oooo000 */
    public iq0 f21603Oooo000;

    /* renamed from: Oooo00O */
    public HttpURLConnection f21604Oooo00O;

    /* renamed from: Oooo00o */
    public InputStream f21605Oooo00o;

    /* renamed from: Oooo0O0 */
    public int f21606Oooo0O0;

    /* renamed from: Oooo0OO */
    public long f21607Oooo0OO;

    /* renamed from: Oooo0o0 */
    public long f21608Oooo0o0;

    public /* synthetic */ nt0(String str, int i, int i2, boolean z, dx0 dx0Var) {
        super(true);
        this.f21598OooOoo = str;
        this.f21597OooOoOO = i;
        this.f21599OooOoo0 = i2;
        this.f21596OooOoO = z;
        this.f21600OooOooO = dx0Var;
        this.f21601OooOooo = new dx0(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x018b A[Catch: IOException -> 0x0196, TRY_LEAVE, TryCatch #1 {IOException -> 0x0196, blocks: (B:262:0x0183, B:264:0x018b), top: B:333:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0235  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // com.google.android.gms.internal.ads.zm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0Oo(com.google.android.gms.internal.ads.iq0 r31) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt0.OooO0Oo(com.google.android.gms.internal.ads.iq0):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:27:0x0004, B:29:0x000d, B:32:0x0017, B:35:0x0020, B:38:0x002b), top: B:42:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.q51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOO0(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f21607Oooo0OO     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f21608Oooo0o0     // Catch: java.io.IOException -> L1e
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L2a
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L1e
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L1e
            int r9 = (int) r0     // Catch: java.io.IOException -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L35
        L20:
            java.io.InputStream r0 = r6.f21605Oooo00o     // Catch: java.io.IOException -> L1e
            int r1 = com.google.android.gms.internal.ads.i80.f19994OooO00o     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2b
        L2a:
            return r3
        L2b:
            long r8 = r6.f21608Oooo0o0     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f21608Oooo0o0 = r8     // Catch: java.io.IOException -> L1e
            r6.OooO00o(r7)     // Catch: java.io.IOException -> L1e
            return r7
        L35:
            int r8 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            r8 = 2
            com.google.android.gms.internal.ads.mv0 r7 = com.google.android.gms.internal.ads.mv0.OooO00o(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt0.OooOO0(byte[], int, int):int");
    }

    public final URL OooOOO(URL url, String str) throws mv0 {
        if (str == null) {
            throw new mv0("Null location redirect", 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new mv0("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), 2001, 1);
            }
            if (this.f21596OooOoO || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new mv0(OooO0oO.OooOo.OooOO0o("Disallowed cross-protocol redirect (", url.getProtocol(), " to ", protocol, ")"), 2001, 1);
        } catch (MalformedURLException e) {
            throw new mv0(e, 2001, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection OooOOO0(java.net.URL r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r4 = this;
            java.net.URLConnection r5 = r5.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            int r0 = r4.f21597OooOoOO
            r5.setConnectTimeout(r0)
            int r0 = r4.f21599OooOoo0
            r5.setReadTimeout(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.dx0 r1 = r4.f21600OooOooO
            java.util.Map r1 = r1.OooOOOO()
            r0.putAll(r1)
            com.google.android.gms.internal.ads.dx0 r1 = r4.f21601OooOooo
            java.util.Map r1 = r1.OooOOOO()
            r0.putAll(r1)
            r0.putAll(r12)
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L32:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r5.setRequestProperty(r1, r0)
            goto L32
        L4e:
            r0 = 0
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L5c
            r6 = 0
            goto L72
        L5c:
            r6 = r0
        L5d:
            java.lang.String r12 = "bytes="
            java.lang.String r0 = "-"
            java.lang.StringBuilder r12 = OooO0oO.OooOo.OooOOo(r6, r12, r0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L6e
            long r6 = r6 + r8
            long r6 = r6 + r2
            r12.append(r6)
        L6e:
            java.lang.String r6 = r12.toString()
        L72:
            if (r6 == 0) goto L79
            java.lang.String r7 = "Range"
            r5.setRequestProperty(r7, r6)
        L79:
            java.lang.String r6 = r4.f21598OooOoo
            if (r6 == 0) goto L82
            java.lang.String r7 = "User-Agent"
            r5.setRequestProperty(r7, r6)
        L82:
            r6 = 1
            if (r6 == r10) goto L88
            java.lang.String r6 = "identity"
            goto L8a
        L88:
            java.lang.String r6 = "gzip"
        L8a:
            java.lang.String r7 = "Accept-Encoding"
            r5.setRequestProperty(r7, r6)
            r5.setInstanceFollowRedirects(r11)
            r6 = 0
            r5.setDoOutput(r6)
            int r6 = com.google.android.gms.internal.ads.iq0.f20086OooO0o
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)
            r5.connect()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt0.OooOOO0(java.net.URL, long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    public final void OooOOOO() {
        HttpURLConnection httpURLConnection = this.f21604Oooo00O;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC1641hg.OooOOO0("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f21604Oooo00O;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        iq0 iq0Var = this.f21603Oooo000;
        if (iq0Var != null) {
            return iq0Var.f20087OooO00o;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        try {
            InputStream inputStream = this.f21605Oooo00o;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = i80.f19994OooO00o;
                    throw new mv0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, 3);
                }
            }
        } finally {
            this.f21605Oooo00o = null;
            OooOOOO();
            if (this.f21602Oooo0) {
                this.f21602Oooo0 = false;
                OooO0OO();
            }
            this.f21604Oooo00O = null;
            this.f21603Oooo000 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.rj0, com.google.android.gms.internal.ads.zm0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f21604Oooo00O;
        return httpURLConnection == null ? mn0.f21307OooOoo0 : new us0(httpURLConnection.getHeaderFields());
    }
}
