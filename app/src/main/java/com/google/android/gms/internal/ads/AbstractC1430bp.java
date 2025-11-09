package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bp */
/* loaded from: classes2.dex */
public abstract class AbstractC1430bp {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f17545OooO00o = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f17546OooO0O0 = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String OooO00o(kd0 kd0Var) throws JSONException {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue() && kd0Var.f20526OoooO) {
            wd0 wd0Var = kd0Var.o000oOoO;
            wd0Var.getClass();
            if (wd0Var.f25297OooO00o.optBoolean((String) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO000), true) && kd0Var.f20488OooO0O0 != 4) {
                int i = wd0Var.OooO00o() == 1 ? 3 : 1;
                String str = kd0Var.f20557ooOO;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", AbstractC2183w4.OooO0o0(i));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e) {
                    zzo.zzk("Unable to build OMID ENV JSON", e);
                }
            }
        }
        return null;
    }

    public static String OooO0O0(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f17545OooO00o.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f17546OooO0O0.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
