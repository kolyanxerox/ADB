package o000Oo;

import OooO0oO.OooOo;
import Oooo00O.o000000O;
import Oooo0OO.o00oO0o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C3037dc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o000OOoO.OooO0o;
import o000OOoO.OooOO0;
import o000Oo00.OooOOO;
import o000Oo0O.o000oOoO;
import org.apache.tika.metadata.HttpHeaders;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o0Oo0oo {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f30309OooO0Oo = Pattern.compile("[0-9]+s");

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final Charset f30310OooO0o0 = Charset.forName("UTF-8");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f30311OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f30312OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final oo0o0Oo f30313OooO0OO = new oo0o0Oo();

    public o0Oo0oo(Context context, OooOOO oooOOO) {
        this.f30311OooO00o = context;
        this.f30312OooO0O0 = oooOOO;
    }

    public static void OooO(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static URL OooO00o(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e) {
            throw new o000oOoO(e.getMessage());
        }
    }

    public static void OooO0O0(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f30310OooO0o0));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", OooOo.OooOO0o("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : OooOo.OooOO0(", ", str)));
    }

    public static long OooO0Oo(String str) {
        o000000O.OooO00o("Invalid Expiration Timestamp.", f30309OooO0Oo.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static o0OOO0o OooO0o(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f30310OooO0o0));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        String strNextString = null;
        long jOooO0Oo = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                jOooO0Oo = OooO0Oo(jsonReader.nextString());
                b = (byte) (b | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b == 1) {
            return new o0OOO0o(1, jOooO0Oo, strNextString);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    public static o0ooOOo OooO0o0(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f30310OooO0o0));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        o0OOO0o o0ooo0o = null;
        long jOooO0Oo = 0;
        String strNextString3 = null;
        String strNextString4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString4 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        strNextString = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        b = (byte) (b | 1);
                        jOooO0Oo = OooO0Oo(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b != 1) {
                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                }
                o0ooo0o = new o0OOO0o(0, jOooO0Oo, strNextString);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new o0ooOOo(strNextString3, strNextString4, strNextString2, o0ooo0o, 1);
    }

    public static void OooO0oO(HttpURLConnection httpURLConnection, String str, String str2) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.0");
            OooO(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void OooO0oo(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            OooO(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public final HttpURLConnection OooO0OO(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", C3037dc.f8236L);
            httpURLConnection.addRequestProperty("Accept", C3037dc.f8236L);
            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f30311OooO00o;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            OooOO0 oooOO0 = (OooOO0) this.f30312OooO0O0.get();
            if (oooOO0 != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(((OooO0o) oooOO0).OooO00o()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            String strOooO0OO = null;
            try {
                byte[] bArrOooO0oO = o00oO0o.OooO0oO(context, context.getPackageName());
                if (bArrOooO0oO == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    strOooO0OO = o00oO0o.OooO0OO(bArrOooO0oO);
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e3);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strOooO0OO);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new o000oOoO("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
