package o000O0O0;

import OooO0oO.OooOo;
import OooO0oO.Oooo0;
import Oooo.OooOo00;
import OoooOOO.C0001o0;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3037dc;
import com.ironsource.C3353m5;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f30117OooO00o;

    /* renamed from: OooO0O0 */
    public String f30118OooO0O0;

    public /* synthetic */ OooO0O0() {
        this.f30117OooO00o = 1;
    }

    public static void OooO00o(OooOo00 oooOo00, OooO oooO) {
        String str = oooO.f30108OooO00o;
        if (str != null) {
            oooOo00.OooOOOO("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        oooOo00.OooOOOO("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        oooOo00.OooOOOO("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.0");
        oooOo00.OooOOOO("Accept", C3037dc.f8236L);
        String str2 = oooO.f30109OooO0O0;
        if (str2 != null) {
            oooOo00.OooOOOO("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = oooO.f30110OooO0OO;
        if (str3 != null) {
            oooOo00.OooOOOO("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = oooO.f30111OooO0Oo;
        if (str4 != null) {
            oooOo00.OooOOOO("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = oooO.f30113OooO0o0.OooO0OO().f30423OooO00o;
        if (str5 != null) {
            oooOo00.OooOOOO("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap OooO0O0(OooO oooO) {
        HashMap map = new HashMap();
        map.put("build_version", oooO.f30115OooO0oo);
        map.put("display_version", oooO.f30114OooO0oO);
        map.put("source", Integer.toString(oooO.f30107OooO));
        String str = oooO.f30112OooO0o;
        if (!TextUtils.isEmpty(str)) {
            map.put(C3353m5.f9466p, str);
        }
        return map;
    }

    public JSONObject OooO0OO(Oooo0 oooo0) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i = oooo0.f13285OooOo0o;
        sb.append(i);
        String string = sb.toString();
        o000O000.OooO0OO oooO0OO = o000O000.OooO0OO.f30095OooO00o;
        oooO0OO.OooO0oO(string);
        String str = this.f30118OooO0O0;
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = (String) oooo0.f13283OooOo;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                oooO0OO.OooO0oo(e, "Failed to parse settings JSON from " + str);
                oooO0OO.OooO0oo(null, "Settings response " + str2);
            }
        } else {
            String str3 = "Settings request failed; (status: " + i + ") from " + str;
            if (oooO0OO.OooO0O0(6)) {
                Log.e("FirebaseCrashlytics", str3, null);
                return null;
            }
        }
        return null;
    }

    public String toString() {
        switch (this.f30117OooO00o) {
            case 3:
                return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO('>', this.f30118OooO0O0, new StringBuilder("<"));
            default:
                return super.toString();
        }
    }

    public OooO0O0(String str, int i) {
        this.f30117OooO00o = i;
        switch (i) {
            case 3:
                this.f30118OooO0O0 = str;
                break;
            default:
                this.f30118OooO0O0 = OooOo.OooOO0("UnityScar", str);
                break;
        }
    }

    public OooO0O0(String str, C0001o0 c0001o0) {
        this.f30117OooO00o = 0;
        if (str != null) {
            this.f30118OooO0O0 = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
