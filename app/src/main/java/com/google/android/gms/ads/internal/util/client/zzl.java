package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3034d9;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzl {

    /* renamed from: OooO0OO */
    public static boolean f16179OooO0OO = false;

    /* renamed from: OooO0Oo */
    public static boolean f16180OooO0Oo = false;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: OooO00o */
    public final List f16182OooO00o;

    /* renamed from: OooO0O0 */
    public static final Object f16178OooO0O0 = new Object();

    /* renamed from: OooO0o0 */
    public static final HashSet f16181OooO0o0 = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public static void OooO0O0(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f16181OooO0o0.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzo.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public static void zzi() {
        synchronized (f16178OooO0O0) {
            f16179OooO0OO = false;
            f16180OooO0Oo = false;
            zzo.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized (f16178OooO0O0) {
            f16179OooO0OO = true;
            f16180OooO0Oo = z;
        }
    }

    public static boolean zzk() {
        boolean z;
        synchronized (f16178OooO0O0) {
            try {
                z = false;
                if (f16179OooO0OO && f16180OooO0Oo) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public static boolean zzl() {
        boolean z;
        synchronized (f16178OooO0O0) {
            z = f16179OooO0OO;
        }
        return z;
    }

    public final void OooO00o(String str, zzk zzkVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f16182OooO00o.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzo.zzh("unable to log", e);
        }
        String string = stringWriter.toString();
        synchronized (zzl.class) {
            try {
                zzo.zzi("GMA Debug BEGIN");
                int i = 0;
                while (i < string.length()) {
                    int i2 = i + 4000;
                    zzo.zzi("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i, Math.min(i2, string.length())))));
                    i = i2;
                }
                zzo.zzi("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) throws IOException {
        if (zzk()) {
            OooO00o("onNetworkRequest", new zzg(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void zzd(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) throws IOException {
        if (zzk()) {
            OooO00o("onNetworkRequest", new zzg(str, "GET", map, bArr));
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i) throws IOException {
        if (zzk()) {
            String responseMessage = null;
            OooO00o("onNetworkResponse", new zzj(i, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    zzo.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                OooO00o("onNetworkRequestError", new zzi(responseMessage));
            }
        }
    }

    public final void zzf(@Nullable Map map, int i) throws IOException {
        if (zzk()) {
            OooO00o("onNetworkResponse", new zzj(i, map));
            if (i < 200 || i >= 300) {
                OooO00o("onNetworkRequestError", new zzi(null));
            }
        }
    }

    public final void zzg(@Nullable String str) throws IOException {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) throws IOException {
        OooO00o("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) throws IOException {
                Object obj = zzl.f16178OooO0O0;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strEncodeToString = Base64.encodeToString(bArr2, 0);
                if (length < 10000) {
                    jsonWriter.name(C3034d9.h.f8065E0).value(strEncodeToString);
                } else {
                    String strZzf = zzf.zzf(strEncodeToString);
                    if (strZzf != null) {
                        jsonWriter.name("bodydigest").value(strZzf);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzl(@Nullable String str) {
        this.f16182OooO00o = !zzk() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }
}
