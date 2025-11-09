package o000Oooo;

import OooO0oO.OooOo;
import Oooo.OooOOO;
import Oooo0OO.oo000o;
import android.content.Context;
import android.util.Log;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0000o0.Oooo0;
import o000OooO.Oooo000;
import o000OooO.o00Oo0;
import o000OooO.o00Ooo;

/* loaded from: classes2.dex */
public final class o0000 {

    /* renamed from: OooOOoo, reason: collision with root package name */
    public static final int[] f30570OooOOoo = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: OooOo00, reason: collision with root package name */
    public static final Pattern f30571OooOo00 = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: OooO, reason: collision with root package name */
    public final o00000O0 f30572OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashSet f30573OooO00o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f30575OooO0OO;

    /* renamed from: OooO0o, reason: collision with root package name */
    public HttpURLConnection f30577OooO0o;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o0O0O00 f30579OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final ScheduledExecutorService f30580OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final Oooo0 f30581OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final o000Oo0O.Oooo0 f30582OooOO0O;
    public final o000OOo OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final Context f30584OooOOO0;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final o0000oo f30588OooOOo0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f30574OooO0O0 = false;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final Random f30585OooOOOO = new Random();

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final oo000o f30586OooOOOo = oo000o.f13855OooO00o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final String f30583OooOOO = "firebase";

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f30576OooO0Oo = false;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f30578OooO0o0 = false;

    /* renamed from: OooOOo, reason: collision with root package name */
    public final Object f30587OooOOo = new Object();

    public o0000(Oooo0 oooo0, o000Oo0O.Oooo0 oooo02, o00000O0 o00000o02, o000OOo o000ooo2, Context context, LinkedHashSet linkedHashSet, o0000oo o0000ooVar, ScheduledExecutorService scheduledExecutorService) {
        this.f30573OooO00o = linkedHashSet;
        this.f30580OooO0oo = scheduledExecutorService;
        this.f30575OooO0OO = Math.max(8 - o0000ooVar.OooO0OO().f30625OooO00o, 1);
        this.f30581OooOO0 = oooo0;
        this.f30572OooO = o00000o02;
        this.f30582OooOO0O = oooo02;
        this.OooOO0o = o000ooo2;
        this.f30584OooOOO0 = context;
        this.f30588OooOOo0 = o0000ooVar;
    }

    public static boolean OooO0Oo(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String OooO0o(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            o0000o0.Oooo0 r9 = r6.f30581OooOO0
            r9.OooO00o()
            o0000o0.o0OoOo0 r0 = r9.f29590OooO0OO
            java.lang.String r1 = r0.f29604OooO00o
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f30584OooOOO0
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r5 = Oooo0OO.o00oO0o.OooO0oO(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
        L45:
            r1 = r4
            goto L62
        L47:
            java.lang.String r1 = Oooo0OO.o00oO0o.OooO0OO(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L62:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.OooO00o()
            java.lang.String r2 = r0.f29605OooO0O0
            java.util.regex.Pattern r3 = o000Oooo.o0000.f30571OooOo00
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9c
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9c:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f30583OooOOO
            r1.put(r2, r3)
            o000Oooo.o00000O0 r2 = r6.f30572OooO
            o000Oooo.o0000oo r2 = r2.f30618OooO0oO
            android.content.SharedPreferences r2 = r2.f30633OooO00o
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.OooO00o()
            java.lang.String r9 = "appId"
            java.lang.String r0 = r0.f29605OooO0O0
            r1.put(r9, r0)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "23.0.0"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Oooo.o0000.OooO(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean OooO00o() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f30573OooO00o     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f30574OooO0O0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f30576OooO0Oo     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f30578OooO0o0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Oooo.o0000.OooO00o():boolean");
    }

    public final void OooO0O0(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f30577OooO0o;
        if (httpURLConnection != null && !this.f30578OooO0o0) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    public final String OooO0OO(String str) {
        Oooo0 oooo0 = this.f30581OooOO0;
        oooo0.OooO00o();
        Matcher matcher = f30571OooOo00.matcher(oooo0.f29590OooO0OO.f29605OooO0O0);
        return OooOo.OooOO0o("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void OooO0o0(long j) {
        try {
            if (OooO00o()) {
                int i = this.f30575OooO0OO;
                if (i > 0) {
                    this.f30575OooO0OO = i - 1;
                    this.f30580OooO0oo.schedule(new OooOOO(this, 16), j, TimeUnit.MILLISECONDS);
                } else if (!this.f30578OooO0o0) {
                    OooO0oO(new o00Oo0("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0oO(o00Ooo o00ooo2) {
        Iterator it = this.f30573OooO00o.iterator();
        while (it.hasNext()) {
            ((Oooo000) it.next()).onError(o00ooo2);
        }
    }

    public final synchronized void OooO0oo() {
        this.f30586OooOOOo.getClass();
        OooO0o0(Math.max(0L, this.f30588OooOOo0.OooO0OO().f30626OooO0O0.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized o0O0O00 OooOO0(HttpURLConnection httpURLConnection) {
        return new o0O0O00(httpURLConnection, this.f30572OooO, this.OooOO0o, this.f30573OooO00o, new o0000Ooo(this), this.f30580OooO0oo, this.f30588OooOOo0);
    }

    public final void OooOO0O(Date date) {
        o0000oo o0000ooVar = this.f30588OooOOo0;
        int i = o0000ooVar.OooO0OO().f30625OooO00o + 1;
        o0000ooVar.OooO0o0(i, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f30570OooOOoo[(i < 8 ? i : 8) - 1]) / 2) + this.f30585OooOOOO.nextInt((int) r2)));
    }
}
