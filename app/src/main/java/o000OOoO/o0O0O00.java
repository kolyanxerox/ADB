package o000Oooo;

import OooO0oO.OooOo;
import Oooo0OO.oo000o;
import android.util.Log;
import com.google.android.gms.internal.ads.Oooo0;
import com.ironsource.C3037dc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o000OooO.Oooo000;
import o000OooO.o00Oo0;
import o000OooO.o00Ooo;
import o000OooO.o00oO0o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o0O0O00 {

    /* renamed from: OooO */
    public final o0000oo f30645OooO;

    /* renamed from: OooO00o */
    public final LinkedHashSet f30646OooO00o;

    /* renamed from: OooO0O0 */
    public final HttpURLConnection f30647OooO0O0;

    /* renamed from: OooO0OO */
    public final o00000O0 f30648OooO0OO;

    /* renamed from: OooO0Oo */
    public final o000OOo f30649OooO0Oo;

    /* renamed from: OooO0o */
    public final ScheduledExecutorService f30650OooO0o;

    /* renamed from: OooO0o0 */
    public final o0000Ooo f30651OooO0o0;

    /* renamed from: OooO0oO */
    public final Random f30652OooO0oO = new Random();

    /* renamed from: OooOO0 */
    public boolean f30654OooOO0 = false;

    /* renamed from: OooO0oo */
    public final oo000o f30653OooO0oo = oo000o.f13855OooO00o;

    public o0O0O00(HttpURLConnection httpURLConnection, o00000O0 o00000o02, o000OOo o000ooo2, LinkedHashSet linkedHashSet, o0000Ooo o0000ooo, ScheduledExecutorService scheduledExecutorService, o0000oo o0000ooVar) {
        this.f30647OooO0O0 = httpURLConnection;
        this.f30648OooO0OO = o00000o02;
        this.f30649OooO0Oo = o000ooo2;
        this.f30646OooO00o = linkedHashSet;
        this.f30651OooO0o0 = o0000ooo;
        this.f30650OooO0o = scheduledExecutorService;
        this.f30645OooO = o0000ooVar;
    }

    public final void OooO00o(int i, long j) {
        if (i == 0) {
            OooO0Oo(new o00oO0o("Unable to fetch the latest version of the template."));
            return;
        }
        this.f30650OooO0o.schedule(new Oooo0(this, i, j, 1), this.f30652OooO0oO.nextInt(4), TimeUnit.SECONDS);
    }

    public final void OooO0O0(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C3037dc.f8238N));
        String strOooOoo0 = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strOooOoo0 = OooOo.OooOoo0(strOooOoo0, line);
            if (line.contains("}")) {
                int iIndexOf = strOooOoo0.indexOf(123);
                int iLastIndexOf = strOooOoo0.lastIndexOf(125);
                strOooOoo0 = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strOooOoo0.substring(iIndexOf, iLastIndexOf + 1);
                if (!strOooOoo0.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strOooOoo0);
                    } catch (JSONException e) {
                        OooO0Oo(new o00Oo0("Unable to parse config update message.", e.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        this.f30651OooO0o0.onError(new o00oO0o("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = this.f30646OooO00o.isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = this.f30648OooO0OO.f30618OooO0oO.f30633OooO00o.getLong("last_template_version", 0L);
                        long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j2 > j) {
                            OooO00o(3, j2);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        OooO0o0(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    strOooOoo0 = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public final void OooO0OO() throws IOException {
        HttpURLConnection httpURLConnection = this.f30647OooO0O0;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    OooO0O0(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    if (!this.f30654OooOO0) {
                        Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e);
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e2);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            }
            throw th;
        }
    }

    public final synchronized void OooO0Oo(o00Ooo o00ooo2) {
        Iterator it = this.f30646OooO00o.iterator();
        while (it.hasNext()) {
            ((Oooo000) it.next()).onError(o00ooo2);
        }
    }

    public final synchronized void OooO0o0(int i) {
        this.f30653OooO0oo.getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (i * 1000));
        o0000oo o0000ooVar = this.f30645OooO;
        synchronized (o0000ooVar.f30636OooO0Oo) {
            o0000ooVar.f30633OooO00o.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
