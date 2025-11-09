package o0000o0;

import Oooo00O.o000000O;
import Oooo0OO.o0ooOOo;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import org.apache.tika.metadata.ClimateForcast;

/* loaded from: classes2.dex */
public final class o0OoOo0 {

    /* renamed from: OooO00o */
    public final String f29604OooO00o;

    /* renamed from: OooO0O0 */
    public final String f29605OooO0O0;

    /* renamed from: OooO0OO */
    public final String f29606OooO0OO;

    /* renamed from: OooO0Oo */
    public final String f29607OooO0Oo;

    /* renamed from: OooO0o */
    public final String f29608OooO0o;

    /* renamed from: OooO0o0 */
    public final String f29609OooO0o0;

    /* renamed from: OooO0oO */
    public final String f29610OooO0oO;

    public o0OoOo0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = o0ooOOo.f13854OooO00o;
        o000000O.OooOO0O(true ^ (str == null || str.trim().isEmpty()), "ApplicationId must be set.");
        this.f29605OooO0O0 = str;
        this.f29604OooO00o = str2;
        this.f29606OooO0OO = str3;
        this.f29607OooO0Oo = str4;
        this.f29609OooO0o0 = str5;
        this.f29608OooO0o = str6;
        this.f29610OooO0oO = str7;
    }

    public static o0OoOo0 OooO00o(Context context) {
        OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(context, 9);
        String strOooO0OO = oooOOO0.OooO0OO("google_app_id");
        if (TextUtils.isEmpty(strOooO0OO)) {
            return null;
        }
        return new o0OoOo0(strOooO0OO, oooOOO0.OooO0OO("google_api_key"), oooOOO0.OooO0OO("firebase_database_url"), oooOOO0.OooO0OO("ga_trackingId"), oooOOO0.OooO0OO("gcm_defaultSenderId"), oooOOO0.OooO0OO("google_storage_bucket"), oooOOO0.OooO0OO(ClimateForcast.PROJECT_ID));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) obj;
        return o000000O.OooOO0o(this.f29605OooO0O0, o0oooo0.f29605OooO0O0) && o000000O.OooOO0o(this.f29604OooO00o, o0oooo0.f29604OooO00o) && o000000O.OooOO0o(this.f29606OooO0OO, o0oooo0.f29606OooO0OO) && o000000O.OooOO0o(this.f29607OooO0Oo, o0oooo0.f29607OooO0Oo) && o000000O.OooOO0o(this.f29609OooO0o0, o0oooo0.f29609OooO0o0) && o000000O.OooOO0o(this.f29608OooO0o, o0oooo0.f29608OooO0o) && o000000O.OooOO0o(this.f29610OooO0oO, o0oooo0.f29610OooO0oO);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29605OooO0O0, this.f29604OooO00o, this.f29606OooO0OO, this.f29607OooO0Oo, this.f29609OooO0o0, this.f29608OooO0o, this.f29610OooO0oO});
    }

    public final String toString() {
        OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(this);
        oooOOO0.OooO00o(this.f29605OooO0O0, "applicationId");
        oooOOO0.OooO00o(this.f29604OooO00o, "apiKey");
        oooOOO0.OooO00o(this.f29606OooO0OO, "databaseUrl");
        oooOOO0.OooO00o(this.f29609OooO0o0, "gcmSenderId");
        oooOOO0.OooO00o(this.f29608OooO0o, "storageBucket");
        oooOOO0.OooO00o(this.f29610OooO0oO, "projectId");
        return oooOOO0.toString();
    }
}
