package com.google.android.gms.ads.internal.util.client;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzbc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes2.dex */
public final class zzu implements zze {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f16192OooO00o;

    public zzu() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    @WorkerThread
    public final zzt zza(String str) {
        zzt zztVar = zzt.zzb;
        try {
            zzo.zze("Pinging URL: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
            try {
                zzbc.zzb();
                String str2 = this.f16192OooO00o;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                zzl zzlVar = new zzl(null);
                zzlVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zze(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    zzo.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                    if (responseCode == 502) {
                        zztVar = zzt.zzc;
                    }
                } else {
                    zztVar = zzt.zza;
                }
                httpURLConnection.disconnect();
                return zztVar;
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e) {
            e = e;
            zzo.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
            return zzt.zzc;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            zzo.zzj("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return zztVar;
        } catch (RuntimeException e3) {
            e = e3;
            zzo.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
            return zzt.zzc;
        } catch (URISyntaxException e4) {
            e = e4;
            zzo.zzj("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return zztVar;
        } finally {
        }
    }

    public zzu(@Nullable String str) {
        this.f16192OooO00o = str;
    }
}
