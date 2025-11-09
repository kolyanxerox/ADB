package OoooO0O;

import Oooo.OooOo00;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.C1386ai;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import com.ironsource.C3451ne;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import o000OOoO.OooO;

/* loaded from: classes2.dex */
public final class o00O0O0O {

    /* renamed from: OooO00o */
    public final Application f14011OooO00o;

    /* renamed from: OooO0O0 */
    public final Handler f14012OooO0O0;

    /* renamed from: OooO0OO */
    public final o000O000 f14013OooO0OO;

    /* renamed from: OooO0Oo */
    public final o0OOO0o f14014OooO0Oo;

    /* renamed from: OooO0o */
    public final oo00o f14015OooO0o;

    /* renamed from: OooO0o0 */
    public final o000OOo f14016OooO0o0;

    /* renamed from: OooO0oO */
    public final OooOo00 f14017OooO0oO;

    /* renamed from: OooO0oo */
    public final o00O000o f14018OooO0oo;

    public o00O0O0O(Application application, Handler handler, o000O000 o000o0002, o0OOO0o o0ooo0o, o000OOo o000ooo2, oo00o oo00oVar, OooOo00 oooOo00, o00O000o o00o000o) {
        this.f14011OooO00o = application;
        this.f14012OooO0O0 = handler;
        this.f14013OooO0OO = o000o0002;
        this.f14014OooO0Oo = o0ooo0o;
        this.f14016OooO0o0 = o000ooo2;
        this.f14015OooO0o = oo00oVar;
        this.f14017OooO0oO = oooOo00;
        this.f14018OooO0oo = o00o000o;
    }

    public final o0000O0O OooO00o(OooOOOo.o0ooOOo o0ooooo) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.f14011OooO00o));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", C3037dc.f8236L);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) o0ooooo.f13430OooO00o;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    o0000O00 o0000o00 = (o0000O00) o0ooooo.f13431OooO0O0;
                    if (o0000o00 != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = o0000o00.f13928OooO0O0;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) o0000o00.f13929OooO0OO;
                        if (str2 != null) {
                            jsonWriter.name(C3451ne.f10402B);
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) o0000o00.f13930OooO0Oo;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) o0ooooo.f13432OooO0OO;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) o0ooooo.f13433OooO0Oo;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) o0ooooo.f13435OooO0o0;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    C1386ai c1386ai = (C1386ai) o0ooooo.f13434OooO0o;
                    if (c1386ai != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) c1386ai.f17044OooOo0o;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) c1386ai.f17042OooOo;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = (Double) c1386ai.f17046OooOoO0;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<o0000oo> list = (List) c1386ai.f17045OooOoO;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (o0000oo o0000ooVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = o0000ooVar.f13950OooO00o;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = o0000ooVar.f13951OooO0O0;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = o0000ooVar.f13952OooO0OO;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = o0000ooVar.f13953OooO0Oo;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    OooOo00 oooOo00 = (OooOo00) o0ooooo.f13436OooO0oO;
                    if (oooOo00 != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) oooOo00.f13712OooOo0o;
                        if (str4 != null) {
                            jsonWriter.name(C3034d9.h.f8089V);
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) oooOo00.f13710OooOo;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) oooOo00.f13713OooOoO0;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((OooO) o0ooooo.f13437OooO0oo) != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("3.2.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) o0ooooo.f13429OooO;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((o0000) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        o0000O0O o0000o0oOooO = o0000O0O.OooO(new JsonReader(new StringReader(headerField)));
                        o0000o0oOooO.f13931OooO00o = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return o0000o0oOooO;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            o0000O0O o0000o0oOooO2 = o0000O0O.OooO(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return o0000o0oOooO2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e) {
            throw new o00O00(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new o00O00(2, "Error making request.", e2);
        }
    }
}
