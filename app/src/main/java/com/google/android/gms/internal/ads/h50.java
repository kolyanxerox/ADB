package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h50 implements bf0 {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final Pattern f19553OooOoO0 = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: OooOo, reason: collision with root package name */
    public final mf0 f19554OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f19555OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final jf0 f19556OooOo0o;

    public h50(String str, mf0 mf0Var, jf0 jf0Var) {
        this.f19555OooOo0O = str;
        this.f19554OooOo = mf0Var;
        this.f19556OooOo0o = jf0Var;
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public final Object zza(Object obj) throws a40 {
        String strJoin;
        a40 a40Var;
        JSONObject jSONObject;
        String strConcat;
        g50 g50Var = (g50) obj;
        int iOptInt = g50Var.f19239OooO00o.optInt("http_timeout_millis", 60000);
        C2234xi c2234xi = g50Var.f19240OooO0O0;
        int i = c2234xi.f25634OooO0oO;
        mf0 mf0Var = this.f19554OooOo;
        jf0 jf0Var = this.f19556OooOo0o;
        strJoin = "";
        if (i != -2) {
            if (i == 1) {
                List list = c2234xi.f25628OooO00o;
                if (list != null) {
                    strJoin = TextUtils.join(", ", list);
                    zzo.zzg(strJoin);
                }
                a40Var = new a40(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                a40Var = new a40(1);
            }
            jf0Var.OooO0Oo(a40Var);
            jf0Var.OooOO0(false);
            mf0Var.OooO00o(jf0Var);
            throw a40Var;
        }
        HashMap map = new HashMap();
        if (c2234xi.f25633OooO0o0) {
            String str = this.f19555OooOo0O;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17786o0000OO)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = f19553OooOoO0.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (c2234xi.f25631OooO0Oo && (jSONObject = g50Var.f19239OooO00o) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                zze.zza("DSID signal does not exist.");
            }
        }
        String str2 = c2234xi.f25630OooO0OO;
        strJoin = TextUtils.isEmpty(str2) ? "" : str2;
        jf0Var.OooOO0(true);
        mf0Var.OooO00o(jf0Var);
        return new e50(c2234xi.f25632OooO0o, iOptInt, map, strJoin.getBytes(StandardCharsets.UTF_8), "");
    }
}
