package com.google.android.gms.internal.ads;

import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes2.dex */
public final class oj0 implements Closeable {

    /* renamed from: OooOo */
    public HttpURLConnection f22999OooOo;

    /* renamed from: OooOo0O */
    public il0 f23000OooOo0O;

    /* renamed from: OooOo0o */
    public tq0 f23001OooOo0o;

    public final HttpURLConnection OooO00o(tq0 tq0Var) throws IOException {
        this.f23000OooOo0O = new C1658hx(28, (byte) 0);
        this.f23001OooOo0o = tq0Var;
        ((Integer) this.f23000OooOo0O.mo13704zza()).getClass();
        tq0 tq0Var2 = this.f23001OooOo0o;
        tq0Var2.getClass();
        Set set = C1907on.f23008OooOoOO;
        zzv.zzx();
        int iIntValue = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17745Oooo0o)).intValue();
        URL url = new URL(tq0Var2.f24484OooOo0o);
        int i = 0;
        while (true) {
            i++;
            if (i > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            zzl zzlVar = new zzl(null);
            zzlVar.zzc(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            zzlVar.zze(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f22999OooOo = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals(ProxyConfig.MATCH_HTTP) && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            zzo.zze("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f22999OooOo;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
