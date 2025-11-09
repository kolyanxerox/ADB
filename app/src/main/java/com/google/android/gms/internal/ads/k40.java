package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k40 {

    /* renamed from: OooOO0O */
    public static final Pattern f20434OooOO0O = Pattern.compile("\\?");

    /* renamed from: OooO */
    public final f20 f20435OooO;

    /* renamed from: OooO00o */
    public final C2130up f20436OooO00o;

    /* renamed from: OooO0O0 */
    public final Context f20437OooO0O0;

    /* renamed from: OooO0OO */
    public final VersionInfoParcel f20438OooO0OO;

    /* renamed from: OooO0Oo */
    public final vd0 f20439OooO0Oo;

    /* renamed from: OooO0o */
    public final ScheduledExecutorService f20440OooO0o;

    /* renamed from: OooO0o0 */
    public final cq0 f20441OooO0o0;

    /* renamed from: OooO0oO */
    public final String f20442OooO0oO;

    /* renamed from: OooO0oo */
    public final mf0 f20443OooO0oo;

    /* renamed from: OooOO0 */
    public final Object f20444OooOO0 = new Object();

    public k40(C2130up c2130up, Context context, VersionInfoParcel versionInfoParcel, vd0 vd0Var, cq0 cq0Var, String str, mf0 mf0Var, f20 f20Var, C2007rd c2007rd, ScheduledExecutorService scheduledExecutorService) {
        this.f20436OooO00o = c2130up;
        this.f20437OooO0O0 = context;
        this.f20438OooO0OO = versionInfoParcel;
        this.f20439OooO0Oo = vd0Var;
        this.f20441OooO0o0 = cq0Var;
        this.f20442OooO0oO = str;
        this.f20443OooO0oo = mf0Var;
        this.f20435OooO = f20Var;
        this.f20440OooO0o = scheduledExecutorService;
    }

    public static final String OooO0Oo(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final ap0 OooO00o(String str, String str2) {
        String string;
        o00000oO.OooOOO oooOOOOooooOO;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return ii0.Ooooo00(new z70(15, "Invalid ad string."));
        }
        Context context = this.f20437OooO0O0;
        jf0 jf0VarOooO0oO = ze0.OooO0oO(context, 11);
        jf0VarOooO0oO.zzi();
        C1602ge c1602geOooO00o = zzv.zzg().OooO00o(context, this.f20438OooO0OO, this.f20436OooO00o.OooOoo());
        C2007rd c2007rd = AbstractC1565fe.f18933OooO0O0;
        C1676ie c1676ieOooO00o = c1602geOooO00o.OooO00o("google.afma.response.normalize", c2007rd, c2007rd);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0oo0o)).booleanValue();
        f20 f20Var = this.f20435OooO;
        cq0 cq0Var = this.f20441OooO0o0;
        if (zBooleanValue) {
            try {
                string = new JSONObject(str).optString("fetch_url", "");
            } catch (JSONException unused) {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                oooOOOOooooOO = ii0.OooooOO(str);
                f20Var.OooO00o("sst", "1");
            } else {
                f20Var.OooO00o("sst", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                String str4 = (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0O0o0);
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0O0Oo)).booleanValue()) {
                    Pattern pattern = f20434OooOO0O;
                    xk0 xk0Var = new xk0(pattern);
                    Matcher matcher = pattern.matcher("");
                    matcher.getClass();
                    if (matcher.matches()) {
                        throw new IllegalArgumentException(xh0.Oooo0("The pattern may not match the empty string: %s", xk0Var));
                    }
                    List listOooO0Oo = new ni0(new hk0(xk0Var, 1), 1).OooO0Oo(string);
                    if (listOooO0Oo.size() < 2) {
                        oooOOOOooooOO = ii0.Ooooo00(new z70(1, "Invalid fetch URL."));
                    } else {
                        str3 = (String) listOooO0Oo.get(1);
                        zzv.zzq();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        oooOOOOooooOO = ii0.OoooOoO((tp0) ii0.o00Oo0(tp0.OooOOo(AbstractC2200wl.f25321OooO00o.OooO0O0(new CallableC2031s0(7, this, new e50(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4)))), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0O0o)).intValue(), TimeUnit.MILLISECONDS, this.f20440OooO0o), Exception.class, new C2094tq(4), cq0Var);
                    }
                } else {
                    oooOOOOooooOO = ii0.OoooOoO((tp0) ii0.o00Oo0(tp0.OooOOo(AbstractC2200wl.f25321OooO00o.OooO0O0(new CallableC2031s0(7, this, new e50(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4)))), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0O0o)).intValue(), TimeUnit.MILLISECONDS, this.f20440OooO0o), Exception.class, new C2094tq(4), cq0Var);
                }
            }
        } else {
            oooOOOOooooOO = ii0.OooooOO(str);
            f20Var.OooO00o("sst", "1");
        }
        dp0 dp0VarOoOO = ii0.ooOO(ii0.ooOO(ii0.ooOO(oooOOOOooooOO, new C2043sc(str2, 8), cq0Var), new C2043sc(c1676ieOooO00o, 9), cq0Var), new C2043sc(this, 10), cq0Var);
        af0.OoooooO(dp0VarOoOO, this.f20443OooO0oo, jf0VarOooO0oO, false);
        return dp0VarOoOO;
    }

    public final String OooO0O0(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f20442OooO0oO));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzo.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    public final void OooO0OO(int i) {
        Bundle bundle = this.f20435OooO.f18768OooO0OO;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0O0oo)).booleanValue()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), bundle, AbstractC2183w4.OooO0Oo(i));
        }
    }
}
