package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.core.content.p002pm.PackageInfoCompat;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o000OooO.o00Oo0;
import o000OooO.o00Ooo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final Pattern f28149OooO0oo = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f28150OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f28151OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f28152OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f28153OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f28154OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f28155OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final long f28156OooO0oO;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j2) {
        this.f28150OooO00o = context;
        this.f28151OooO0O0 = str;
        this.f28152OooO0OO = str2;
        Matcher matcher = f28149OooO0oo.matcher(str);
        this.f28153OooO0Oo = matcher.matches() ? matcher.group(1) : null;
        this.f28155OooO0o0 = "firebase";
        this.f28154OooO0o = j;
        this.f28156OooO0oO = j2;
    }

    public static JSONObject OooO0OO(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), C3037dc.f8238N));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    public static void OooO0Oo(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject OooO00o(String str, String str2, Map map, Long l, Map map2) throws PackageManager.NameNotFoundException, o00Oo0 {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new o00Oo0("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f28151OooO0O0);
        Context context = this.f28150OooO00o;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put(C3034d9.i.f8168W, packageInfo.versionName);
                map3.put("appBuild", Long.toString(PackageInfoCompat.getLongVersionCode(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, context.getPackageName());
        map3.put("sdkVersion", "23.0.0");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map3);
    }

    public final HttpURLConnection OooO0O0() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f28153OooO0Oo + "/namespaces/" + this.f28155OooO0o0 + ":fetch").openConnection();
        } catch (IOException e) {
            throw new o00Ooo(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[LOOP:0: B:13:0x0097->B:15:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7 A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_LEAVE, TryCatch #1 {all -> 0x0189, blocks: (B:17:0x00bb, B:19:0x00d7, B:69:0x018f, B:70:0x0198, B:71:0x0199, B:72:0x01a0), top: B:84:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:17:0x00bb, B:19:0x00d7, B:69:0x018f, B:70:0x0198, B:71:0x0199, B:72:0x01a0), top: B:84:0x00bb }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o000Oooo.o00000 fetch(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, java.lang.Long r16, java.util.Date r17, java.util.Map<java.lang.String, java.lang.String> r18) throws o000OooO.o00Ooo {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):o000Oooo.o00000");
    }
}
