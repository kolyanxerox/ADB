package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3034d9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.q9 */
/* loaded from: classes2.dex */
public class C3551q9 {

    /* renamed from: k */
    private static final String f10895k = "1.0.6";

    /* renamed from: l */
    public static String f10896l = "";

    /* renamed from: a */
    private final InterfaceC3767vf f10897a;

    /* renamed from: b */
    private String f10898b;

    /* renamed from: c */
    private String f10899c;

    /* renamed from: d */
    private String f10900d;

    /* renamed from: e */
    private String f10901e;

    /* renamed from: f */
    private ContextProvider f10902f;

    /* renamed from: g */
    public Thread.UncaughtExceptionHandler f10903g;

    /* renamed from: h */
    public String f10904h;

    /* renamed from: i */
    private String f10905i;

    /* renamed from: j */
    private boolean f10906j;

    /* renamed from: com.ironsource.q9$a */
    public class a implements InterfaceC2954b {
        public a() {
        }

        @Override // com.ironsource.InterfaceC2954b
        /* renamed from: a */
        public void mo4734a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" (");
                    sb.append(thread.getState().toString());
                    sb.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(StringUtils.SPACE);
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            C3551q9.f10896l = sb.toString();
        }

        @Override // com.ironsource.InterfaceC2954b
        /* renamed from: b */
        public void mo4735b() {
        }
    }

    /* renamed from: com.ironsource.q9$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f10908a;

        /* renamed from: b */
        final /* synthetic */ String f10909b;

        public b(Context context, String str) {
            this.f10908a = context;
            this.f10909b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strMo4871p = C3551q9.this.f10897a.mo4871p(this.f10908a);
                if (!TextUtils.isEmpty(strMo4871p)) {
                    C3551q9.this.f10899c = strMo4871p;
                }
                String strMo4837a = C3551q9.this.f10897a.mo4837a(this.f10908a);
                if (!TextUtils.isEmpty(strMo4837a)) {
                    C3551q9.this.f10901e = strMo4837a;
                }
                SharedPreferences.Editor editorEdit = this.f10908a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", C3551q9.this.f10899c);
                editorEdit.putString("sId", this.f10909b);
                editorEdit.apply();
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* renamed from: com.ironsource.q9$c */
    public class c extends RunnableC3586r9 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.ironsource.q9$d */
    public static class d {

        /* renamed from: a */
        static volatile C3551q9 f10912a = new C3551q9(null);

        private d() {
        }
    }

    private C3551q9() {
        this.f10906j = false;
        this.f10897a = C3495on.m11199U().mo8686f();
        this.f10902f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f10903g = defaultUncaughtExceptionHandler;
        this.f10905i = StringUtils.SPACE;
        this.f10904h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C3481o9(defaultUncaughtExceptionHandler));
    }

    /* renamed from: c */
    public static List<C3360mc> m11516c() {
        return null;
    }

    /* renamed from: d */
    public static C3551q9 m11517d() {
        return d.f10912a;
    }

    /* renamed from: a */
    public Context m11518a() {
        return this.f10902f.getApplicationContext();
    }

    /* renamed from: b */
    public String m11521b() {
        return f10895k;
    }

    /* renamed from: e */
    public String m11522e() {
        return this.f10905i;
    }

    public /* synthetic */ C3551q9(a aVar) {
        this();
    }

    /* renamed from: a */
    private String m11511a(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                return networkCapabilities.hasTransport(1) ? C3896z8.f12930b : networkCapabilities.hasTransport(0) ? C3896z8.f12935g : "none";
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
                return "none";
            }
        }
        return "none";
    }

    /* renamed from: a */
    private void m11513a(Context context, HashSet<String> hashSet) throws JSONException {
        String strM11511a = m11511a(m11518a());
        if (strM11511a.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f10899c);
        String string2 = sharedPreferences.getString("sId", this.f10900d);
        List<C3360mc> listM9107b = C3180ha.m9107b();
        IronLog.INTERNAL.verbose("reportList size " + listM9107b.size());
        for (C3360mc c3360mc : listM9107b) {
            JSONObject jSONObject = new JSONObject();
            String strM10020b = c3360mc.m10020b();
            String strM10023e = c3360mc.m10023e();
            String strM10022d = c3360mc.m10022d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo memoryInfoMo4885z = this.f10897a.mo4885z(context);
                if (memoryInfoMo4885z != null) {
                    jSONObject2.put("availRam", this.f10897a.mo4843c(memoryInfoMo4885z));
                    jSONObject2.put(C3451ne.f10526x, this.f10897a.mo4840b(memoryInfoMo4885z));
                    jSONObject2.put(C3451ne.f10529y, this.f10897a.mo4836a(memoryInfoMo4885z));
                }
                String strMo4856i = this.f10897a.mo4856i();
                if (strMo4856i != null) {
                    jSONObject2.put(C3451ne.f10532z, strMo4856i);
                }
                jSONObject2.put("crashDate", strM10020b);
                jSONObject2.put("stacktraceCrash", strM10023e);
                jSONObject2.put("crashType", strM10022d);
                jSONObject2.put("CrashReporterVersion", f10895k);
                jSONObject2.put(C3034d9.i.f8203q, "8.10.0");
                jSONObject2.put(C3034d9.i.f8212x, this.f10897a.mo4842b(context));
                jSONObject2.put(C3034d9.i.f8168W, C2959b4.m7867b(context, packageName));
                jSONObject2.put(C3034d9.i.f8197n, this.f10897a.mo4870p());
                jSONObject2.put("network", strM11511a);
                jSONObject2.put(C3034d9.i.f8201p, this.f10897a.mo4862l());
                jSONObject2.put(C3034d9.i.f8193l, this.f10897a.mo4849e());
                jSONObject2.put("totalRam", this.f10897a.mo4855h(context));
                jSONObject2.put("deviceOS", this.f10897a.mo4865m());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put(C3034d9.i.f8191k, this.f10897a.mo4852g());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f10901e)) {
                    jSONObject2.put(C3034d9.i.f8158M, Boolean.parseBoolean(this.f10901e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            if (jSONObject2.has(next)) {
                                jSONObject.put(next, jSONObject2.opt(next));
                            }
                        } catch (Exception e) {
                            IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObject)).start();
            }
        }
        C3180ha.m9104a();
    }

    /* renamed from: a */
    public void m11519a(Throwable th) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.f10906j);
        if (!this.f10906j || th == null) {
            return;
        }
        new C3360mc(new C3516p9(th).m11368b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").m10019a();
    }

    /* renamed from: a */
    public void m11520a(HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) throws JSONException {
        Context applicationContext = this.f10902f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f10905i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f10904h = str;
            }
            this.f10900d = str3;
            if (z) {
                new C2625a(i).m4729a(z2).m4732b(true).m4726a(new a()).start();
            }
            m11513a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f10906j = true;
        IronLog.INTERNAL.verbose("initialized");
    }
}
