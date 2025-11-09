package o000Oo0O;

import OoooOOO.C0001o0;
import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import o0000oo0.o000000O;
import o0000ooO.o0O0OO0;
import o000Oo.o0OOO0o;
import o000Oo.o0Oo0oo;
import o000Oo.oo0o0Oo;
import o000Oo00.OooOOO;
import o000Oo0o.o00oO0o;
import o000Oo0o.o0ooOOo;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Oooo000 implements Oooo0 {

    /* renamed from: OooOOO0 */
    public static final Object f30373OooOOO0 = new Object();

    /* renamed from: OooO */
    public final o0O0OO0 f30374OooO;

    /* renamed from: OooO00o */
    public final o0000o0.Oooo0 f30375OooO00o;

    /* renamed from: OooO0O0 */
    public final o0Oo0oo f30376OooO0O0;

    /* renamed from: OooO0OO */
    public final OooOo00 f30377OooO0OO;

    /* renamed from: OooO0Oo */
    public final oo000o f30378OooO0Oo;

    /* renamed from: OooO0o */
    public final o00Oo0 f30379OooO0o;

    /* renamed from: OooO0o0 */
    public final o000000O f30380OooO0o0;

    /* renamed from: OooO0oO */
    public final Object f30381OooO0oO;

    /* renamed from: OooO0oo */
    public final ExecutorService f30382OooO0oo;

    /* renamed from: OooOO0 */
    public String f30383OooOO0;

    /* renamed from: OooOO0O */
    public final HashSet f30384OooOO0O;
    public final ArrayList OooOO0o;

    static {
        new AtomicInteger(1);
    }

    public Oooo000(o0000o0.Oooo0 oooo0, OooOOO oooOOO, ExecutorService executorService, o0O0OO0 o0o0oo0) {
        oooo0.OooO00o();
        o0Oo0oo o0oo0oo = new o0Oo0oo(oooo0.f29588OooO00o, oooOOO);
        OooOo00 oooOo00 = new OooOo00(oooo0);
        if (C0001o0.f14093Oooo00O == null) {
            C0001o0.f14093Oooo00O = new C0001o0(20);
        }
        C0001o0 c0001o0 = C0001o0.f14093Oooo00O;
        if (oo000o.f30392OooO0Oo == null) {
            oo000o.f30392OooO0Oo = new oo000o(c0001o0);
        }
        oo000o oo000oVar = oo000o.f30392OooO0Oo;
        o000000O o000000o2 = new o000000O(new o0000oo0.oo000o(oooo0, 2));
        o00Oo0 o00oo0 = new o00Oo0();
        this.f30381OooO0oO = new Object();
        this.f30384OooOO0O = new HashSet();
        this.OooOO0o = new ArrayList();
        this.f30375OooO00o = oooo0;
        this.f30376OooO0O0 = o0oo0oo;
        this.f30377OooO0OO = oooOo00;
        this.f30378OooO0Oo = oo000oVar;
        this.f30380OooO0o0 = o000000o2;
        this.f30379OooO0o = o00oo0;
        this.f30382OooO0oo = executorService;
        this.f30374OooO = o0o0oo0;
    }

    public static Oooo000 OooO0Oo() {
        o0000o0.Oooo0 oooo0OooO0Oo = o0000o0.Oooo0.OooO0Oo();
        oooo0OooO0Oo.OooO00o();
        return (Oooo000) oooo0OooO0Oo.f29591OooO0Oo.get(Oooo0.class);
    }

    public final void OooO(Exception exc) {
        synchronized (this.f30381OooO0oO) {
            try {
                Iterator it = this.OooOO0o.iterator();
                while (it.hasNext()) {
                    if (((o00Ooo) it.next()).OooO0O0(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void OooO00o() {
        o0ooOOo o0oooooOooOO0o;
        synchronized (f30373OooOOO0) {
            try {
                o0000o0.Oooo0 oooo0 = this.f30375OooO00o;
                oooo0.OooO00o();
                OooOo00 oooOo00OooO00o = OooOo00.OooO00o(oooo0.f29588OooO00o);
                try {
                    o0oooooOooOO0o = this.f30377OooO0OO.OooOO0o();
                    int i = o0oooooOooOO0o.f30407OooO0O0;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strOooO0oO = OooO0oO(o0oooooOooOO0o);
                        OooOo00 oooOo00 = this.f30377OooO0OO;
                        o00oO0o o00oo0oOooO00o = o0oooooOooOO0o.OooO00o();
                        o00oo0oOooO00o.f30394OooO00o = strOooO0oO;
                        o00oo0oOooO00o.f30395OooO0O0 = 3;
                        o0oooooOooOO0o = o00oo0oOooO00o.OooO00o();
                        oooOo00.OooOO0(o0oooooOooOO0o);
                    }
                    if (oooOo00OooO00o != null) {
                        oooOo00OooO00o.OooOOO0();
                    }
                } catch (Throwable th) {
                    if (oooOo00OooO00o != null) {
                        oooOo00OooO00o.OooOOO0();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        OooOO0(o0oooooOooOO0o);
        this.f30374OooO.execute(new OooOo(this, 2));
    }

    public final o0ooOOo OooO0O0(o0ooOOo o0ooooo) throws o000oOoO {
        String str;
        int responseCode;
        String str2;
        o0OOO0o o0ooo0o;
        o0OOO0o o0ooo0oOooO0o;
        o0000o0.Oooo0 oooo0 = this.f30375OooO00o;
        oooo0.OooO00o();
        String str3 = oooo0.f29590OooO0OO.f29604OooO00o;
        String str4 = o0ooooo.f30406OooO00o;
        o0000o0.Oooo0 oooo02 = this.f30375OooO00o;
        oooo02.OooO00o();
        String str5 = oooo02.f29590OooO0OO.f29610OooO0oO;
        String str6 = o0ooooo.f30409OooO0Oo;
        o0Oo0oo o0oo0oo = this.f30376OooO0O0;
        oo0o0Oo oo0o0oo = o0oo0oo.f30313OooO0OO;
        String str7 = "Firebase Installations Service is unavailable. Please try again later.";
        if (!oo0o0oo.OooO00o()) {
            throw new o000oOoO("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlOooO00o = o0Oo0oo.OooO00o("projects/" + str5 + "/installations/" + str4 + "/authTokens:generate");
        int i = 0;
        while (i <= 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionOooO0OO = o0oo0oo.OooO0OO(urlOooO00o, str3);
            try {
                try {
                    httpURLConnectionOooO0OO.setRequestMethod("POST");
                    httpURLConnectionOooO0OO.addRequestProperty("Authorization", "FIS_v2 " + str6);
                    httpURLConnectionOooO0OO.setDoOutput(true);
                    o0Oo0oo.OooO0oo(httpURLConnectionOooO0OO);
                    responseCode = httpURLConnectionOooO0OO.getResponseCode();
                    oo0o0oo.OooO0O0(responseCode);
                } finally {
                    httpURLConnectionOooO0OO.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
                str = str7;
            }
            if (responseCode >= 200 && responseCode < 300) {
                o0ooo0oOooO0o = o0Oo0oo.OooO0o(httpURLConnectionOooO0OO);
                httpURLConnectionOooO0OO.disconnect();
                TrafficStats.clearThreadStatsTag();
                str2 = str7;
            } else {
                o0Oo0oo.OooO0O0(httpURLConnectionOooO0OO, null, str3, str5);
                str2 = str7;
                if (responseCode == 401 || responseCode == 404) {
                    try {
                        if (((byte) (0 | 1)) == 1) {
                            o0ooo0o = new o0OOO0o(3, 0L, null);
                        } else {
                            str = str2;
                            try {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            } catch (IOException | AssertionError unused2) {
                                i++;
                                str7 = str;
                            }
                        }
                    } catch (IOException | AssertionError unused3) {
                        str = str2;
                    }
                } else {
                    if (responseCode == 429) {
                        throw new o000oOoO("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        o0ooo0o = new o0OOO0o(2, 0L, null);
                    } else {
                        httpURLConnectionOooO0OO.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        str = str2;
                        i++;
                        str7 = str;
                    }
                }
                httpURLConnectionOooO0OO.disconnect();
                TrafficStats.clearThreadStatsTag();
                o0ooo0oOooO0o = o0ooo0o;
            }
            int iOooO0O0 = OooOOo.OooOOO.OooO0O0(o0ooo0oOooO0o.f30308OooO0OO);
            if (iOooO0O0 != 0) {
                if (iOooO0O0 == 1) {
                    o00oO0o o00oo0oOooO00o = o0ooooo.OooO00o();
                    o00oo0oOooO00o.f30400OooO0oO = "BAD CONFIG";
                    o00oo0oOooO00o.f30395OooO0O0 = 5;
                    return o00oo0oOooO00o.OooO00o();
                }
                if (iOooO0O0 != 2) {
                    throw new o000oOoO(str2);
                }
                synchronized (this) {
                    this.f30383OooOO0 = null;
                }
                o00oO0o o00oo0oOooO00o2 = o0ooooo.OooO00o();
                o00oo0oOooO00o2.f30395OooO0O0 = 2;
                return o00oo0oOooO00o2.OooO00o();
            }
            oo000o oo000oVar = this.f30378OooO0Oo;
            oo000oVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            oo000oVar.f30393OooO00o.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            o00oO0o o00oo0oOooO00o3 = o0ooooo.OooO00o();
            o00oo0oOooO00o3.f30396OooO0OO = o0ooo0oOooO0o.f30306OooO00o;
            o00oo0oOooO00o3.f30399OooO0o0 = o0ooo0oOooO0o.f30307OooO0O0;
            byte b = (byte) (o00oo0oOooO00o3.f30401OooO0oo | 1);
            o00oo0oOooO00o3.f30398OooO0o = seconds;
            o00oo0oOooO00o3.f30401OooO0oo = (byte) (b | 2);
            return o00oo0oOooO00o3.OooO00o();
        }
        throw new o000oOoO(str7);
    }

    public final Task OooO0OO() {
        String str;
        OooO0o();
        synchronized (this) {
            str = this.f30383OooOO0;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        o00O0O o00o0o = new o00O0O(taskCompletionSource);
        synchronized (this.f30381OooO0oO) {
            this.OooOO0o.add(o00o0o);
        }
        Task task = taskCompletionSource.getTask();
        this.f30382OooO0oo.execute(new OooOo(this, 0));
        return task;
    }

    public final void OooO0o() {
        o0000o0.Oooo0 oooo0 = this.f30375OooO00o;
        oooo0.OooO00o();
        Oooo00O.o000000O.OooO0o(oooo0.f29590OooO0OO.f29605OooO0O0, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        oooo0.OooO00o();
        Oooo00O.o000000O.OooO0o(oooo0.f29590OooO0OO.f29610OooO0oO, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        oooo0.OooO00o();
        Oooo00O.o000000O.OooO0o(oooo0.f29590OooO0OO.f29604OooO00o, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        oooo0.OooO00o();
        String str = oooo0.f29590OooO0OO.f29605OooO0O0;
        Pattern pattern = oo000o.f30391OooO0OO;
        Oooo00O.o000000O.OooO00o("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER));
        oooo0.OooO00o();
        Oooo00O.o000000O.OooO00o("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", oo000o.f30391OooO0OO.matcher(oooo0.f29590OooO0OO.f29604OooO00o).matches());
    }

    public final Task OooO0o0() {
        OooO0o();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        o0OoOo0 o0oooo0 = new o0OoOo0(this.f30378OooO0Oo, taskCompletionSource);
        synchronized (this.f30381OooO0oO) {
            this.OooOO0o.add(o0oooo0);
        }
        Task task = taskCompletionSource.getTask();
        this.f30382OooO0oo.execute(new OooOo(this, 1));
        return task;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String OooO0oO(o000Oo0o.o0ooOOo r6) {
        /*
            r5 = this;
            o0000o0.Oooo0 r0 = r5.f30375OooO00o
            r0.OooO00o()
            java.lang.String r0 = r0.f29589OooO0O0
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            o0000o0.Oooo0 r0 = r5.f30375OooO00o
            r0.OooO00o()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f29589OooO0O0
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            r0 = 1
            int r6 = r6.f30407OooO0O0
            if (r6 != r0) goto L5c
            o0000oo0.o000000O r6 = r5.f30380OooO0o0
            java.lang.Object r6 = r6.get()
            o000Oo0o.o0OOO0o r6 = (o000Oo0o.o0OOO0o) r6
            android.content.SharedPreferences r0 = r6.f30403OooO00o
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f30403OooO00o     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.f30403OooO00o     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L5a
        L41:
            java.lang.String r2 = r6.OooO00o()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            o000Oo0O.o00Oo0 r6 = r5.f30379OooO0o
            r6.getClass()
            java.lang.String r6 = o000Oo0O.o00Oo0.OooO00o()
            return r6
        L56:
            return r2
        L57:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        L5c:
            o000Oo0O.o00Oo0 r6 = r5.f30379OooO0o
            r6.getClass()
            java.lang.String r6 = o000Oo0O.o00Oo0.OooO00o()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Oo0O.Oooo000.OooO0oO(o000Oo0o.o0ooOOo):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [o000Oo.o0Oo0oo] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [o000Oo.o0ooOOo] */
    public final o0ooOOo OooO0oo(o0ooOOo o0ooooo) throws o000oOoO {
        int responseCode;
        String str = o0ooooo.f30406OooO00o;
        String string = null;
        if (str != null && str.length() == 11) {
            o000Oo0o.o0OOO0o o0ooo0o = (o000Oo0o.o0OOO0o) this.f30380OooO0o0.get();
            synchronized (o0ooo0o.f30403OooO00o) {
                try {
                    String[] strArr = o000Oo0o.o0OOO0o.f30402OooO0OO;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = o0ooo0o.f30403OooO00o.getString("|T|" + o0ooo0o.f30404OooO0O0 + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        o0Oo0oo o0oo0oo = this.f30376OooO0O0;
        o0000o0.Oooo0 oooo0 = this.f30375OooO00o;
        oooo0.OooO00o();
        String str3 = oooo0.f29590OooO0OO.f29604OooO00o;
        String str4 = o0ooooo.f30406OooO00o;
        o0000o0.Oooo0 oooo02 = this.f30375OooO00o;
        oooo02.OooO00o();
        String str5 = oooo02.f29590OooO0OO.f29610OooO0oO;
        o0000o0.Oooo0 oooo03 = this.f30375OooO00o;
        oooo03.OooO00o();
        String str6 = oooo03.f29590OooO0OO.f29605OooO0O0;
        oo0o0Oo oo0o0oo = o0oo0oo.f30313OooO0OO;
        if (!oo0o0oo.OooO00o()) {
            throw new o000oOoO("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlOooO00o = o0Oo0oo.OooO00o("projects/" + str5 + "/installations");
        int i2 = 0;
        o000Oo.o0ooOOo o0ooooo2 = o0oo0oo;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionOooO0OO = o0ooooo2.OooO0OO(urlOooO00o, str3);
            try {
                try {
                    httpURLConnectionOooO0OO.setRequestMethod("POST");
                    httpURLConnectionOooO0OO.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionOooO0OO.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    o0Oo0oo.OooO0oO(httpURLConnectionOooO0OO, str4, str6);
                    responseCode = httpURLConnectionOooO0OO.getResponseCode();
                    oo0o0oo.OooO0O0(responseCode);
                } finally {
                    httpURLConnectionOooO0OO.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                o000Oo.o0ooOOo o0oooooOooO0o0 = o0Oo0oo.OooO0o0(httpURLConnectionOooO0OO);
                httpURLConnectionOooO0OO.disconnect();
                TrafficStats.clearThreadStatsTag();
                o0ooooo2 = o0oooooOooO0o0;
            } else {
                try {
                    o0Oo0oo.OooO0O0(httpURLConnectionOooO0OO, str6, str3, str5);
                } catch (IOException | AssertionError unused3) {
                    httpURLConnectionOooO0OO.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    o0ooooo2 = o0ooooo2;
                }
                if (responseCode == 429) {
                    throw new o000oOoO("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    o000Oo.o0ooOOo o0ooooo3 = new o000Oo.o0ooOOo(null, null, null, null, 2);
                    httpURLConnectionOooO0OO.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    o0ooooo2 = o0ooooo3;
                } else {
                    httpURLConnectionOooO0OO.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    o0ooooo2 = o0ooooo2;
                }
            }
            int iOooO0O0 = OooOOo.OooOOO.OooO0O0(o0ooooo2.f30318OooO0o0);
            if (iOooO0O0 != 0) {
                if (iOooO0O0 != 1) {
                    throw new o000oOoO("Firebase Installations Service is unavailable. Please try again later.");
                }
                o00oO0o o00oo0oOooO00o = o0ooooo.OooO00o();
                o00oo0oOooO00o.f30400OooO0oO = "BAD CONFIG";
                o00oo0oOooO00o.f30395OooO0O0 = 5;
                return o00oo0oOooO00o.OooO00o();
            }
            String str7 = o0ooooo2.f30315OooO0O0;
            String str8 = o0ooooo2.f30316OooO0OO;
            oo000o oo000oVar = this.f30378OooO0Oo;
            oo000oVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            oo000oVar.f30393OooO00o.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            o0OOO0o o0ooo0o2 = o0ooooo2.f30317OooO0Oo;
            String str9 = o0ooo0o2.f30306OooO00o;
            long j = o0ooo0o2.f30307OooO0O0;
            o00oO0o o00oo0oOooO00o2 = o0ooooo.OooO00o();
            o00oo0oOooO00o2.f30394OooO00o = str7;
            o00oo0oOooO00o2.f30395OooO0O0 = 4;
            o00oo0oOooO00o2.f30396OooO0OO = str9;
            o00oo0oOooO00o2.f30397OooO0Oo = str8;
            o00oo0oOooO00o2.f30399OooO0o0 = j;
            byte b = (byte) (o00oo0oOooO00o2.f30401OooO0oo | 1);
            o00oo0oOooO00o2.f30398OooO0o = seconds;
            o00oo0oOooO00o2.f30401OooO0oo = (byte) (b | 2);
            return o00oo0oOooO00o2.OooO00o();
        }
        throw new o000oOoO("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void OooOO0(o0ooOOo o0ooooo) {
        synchronized (this.f30381OooO0oO) {
            try {
                Iterator it = this.OooOO0o.iterator();
                while (it.hasNext()) {
                    if (((o00Ooo) it.next()).OooO00o(o0ooooo)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
