package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.bo */
/* loaded from: classes2.dex */
public final class C1429bo extends rj0 implements ux0 {

    /* renamed from: OoooO00, reason: collision with root package name */
    public static final Pattern f17527OoooO00 = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f17528OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f17529OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final dx0 f17530OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final String f17531OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public iq0 f17532OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public HttpURLConnection f17533OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public final long f17534Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public int f17535Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final ArrayDeque f17536Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public InputStream f17537Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public boolean f17538Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public long f17539Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public long f17540Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public long f17541Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public long f17542Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public long f17543Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public final long f17544Oooo0oo;

    public C1429bo(String str, C2313zn c2313zn, int i, int i2, long j, long j2) {
        super(true);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f17531OooOoo0 = str;
        this.f17530OooOoo = new dx0(0);
        this.f17528OooOoO = i;
        this.f17529OooOoOO = i2;
        this.f17536Oooo000 = new ArrayDeque();
        this.f17544Oooo0oo = j;
        this.f17534Oooo = j2;
        if (c2313zn != null) {
            OooO0oo(c2313zn);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) throws IOException, NumberFormatException {
        this.f17532OooOooO = iq0Var;
        this.f17540Oooo0OO = 0L;
        long j = iq0Var.f20089OooO0OO;
        long j2 = iq0Var.f20090OooO0Oo;
        long jMin = this.f17544Oooo0oo;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.f17542Oooo0o0 = j;
        HttpURLConnection httpURLConnectionOooOOO0 = OooOOO0(1, j, (jMin + j) - 1);
        this.f17533OooOooo = httpURLConnectionOooOOO0;
        String headerField = httpURLConnectionOooOOO0.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f17527OoooO00.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    if (j2 != -1) {
                        this.f17539Oooo0O0 = j2;
                        this.f17541Oooo0o = Math.max(j3, (this.f17542Oooo0o0 + j2) - 1);
                    } else {
                        this.f17539Oooo0O0 = j4 - this.f17542Oooo0o0;
                        this.f17541Oooo0o = j4 - 1;
                    }
                    this.f17543Oooo0oO = j3;
                    this.f17538Oooo00o = true;
                    OooO(iq0Var);
                    return this.f17539Oooo0O0;
                } catch (NumberFormatException unused) {
                    zzo.zzg("Unexpected Content-Range [" + headerField + C3034d9.i.f8179e);
                }
            }
        }
        throw new C1392ao("Invalid content range: ".concat(String.valueOf(headerField)), IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, 1);
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f17539Oooo0O0;
            long j2 = this.f17540Oooo0OO;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.f17542Oooo0o0 + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.f17534Oooo;
            long j6 = this.f17543Oooo0oO;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.f17541Oooo0o;
                if (j6 < j8) {
                    long jMin = Math.min(j8, Math.max(((this.f17544Oooo0oo + j7) - r4) - 1, (j7 + j4) - 1));
                    OooOOO0(2, j7, jMin);
                    this.f17543Oooo0oO = jMin;
                    j6 = jMin;
                }
            }
            int i3 = this.f17537Oooo00O.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.f17542Oooo0o0) - this.f17540Oooo0OO));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.f17540Oooo0OO += i3;
            OooO00o(i3);
            return i3;
        } catch (IOException e) {
            throw new mv0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, 2);
        }
    }

    public final void OooOOO() {
        while (true) {
            ArrayDeque arrayDeque = this.f17536Oooo000;
            if (arrayDeque.isEmpty()) {
                this.f17533OooOooo = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e) {
                    zzo.zzh("Unexpected error while disconnecting", e);
                }
            }
        }
    }

    public final HttpURLConnection OooOOO0(int i, long j, long j2) throws IOException {
        String string = this.f17532OooOooO.f20087OooO00o.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f17528OooOoO);
            httpURLConnection.setReadTimeout(this.f17529OooOoOO);
            for (Map.Entry entry : this.f17530OooOoo.OooOOOO().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.f17531OooOoo0);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f17536Oooo000.add(httpURLConnection);
            String string2 = this.f17532OooOooO.f20087OooO00o.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f17535Oooo0 = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    OooOOO();
                    throw new C1392ao(OooO0oO.OooOo.OooO0o(this.f17535Oooo0, "Response code: "), IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f17537Oooo00O != null) {
                        inputStream = new SequenceInputStream(this.f17537Oooo00O, inputStream);
                    }
                    this.f17537Oooo00O = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    OooOOO();
                    throw new mv0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, i);
                }
            } catch (IOException e2) {
                OooOOO();
                throw new mv0("Unable to connect to ".concat(String.valueOf(string2)), e2, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, i);
            }
        } catch (IOException e3) {
            throw new mv0("Unable to connect to ".concat(String.valueOf(string)), e3, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f17533OooOooo;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        try {
            InputStream inputStream = this.f17537Oooo00O;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new mv0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, 3);
                }
            }
        } finally {
            this.f17537Oooo00O = null;
            OooOOO();
            if (this.f17538Oooo00o) {
                this.f17538Oooo00o = false;
                OooO0OO();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj0, com.google.android.gms.internal.ads.zm0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f17533OooOooo;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
