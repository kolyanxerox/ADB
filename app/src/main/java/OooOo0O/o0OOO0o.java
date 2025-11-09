package OoooO0O;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o0OOO0o {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000O0O0 f14046OooO0Oo = o000O0O0.OooOO0O(4, AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Application f14047OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final SharedPreferences f14048OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashSet f14049OooO0OO;

    public o0OOO0o(Application application) {
        this.f14047OooO00o = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f14048OooO0O0 = sharedPreferences;
        this.f14049OooO0OO = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap OooO00o() {
        String string;
        Set<String> stringSet = this.f14048OooO0O0.getStringSet("stored_info", o000OOo0.f13980OooOooO);
        if (stringSet.isEmpty()) {
            stringSet = f14046OooO0Oo;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.f14047OooO00o;
            o0000O o0000oOooO00o = o000Oo0.OooO00o(application, str);
            if (o0000oOooO00o == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
            } else {
                Object obj = application.getSharedPreferences(o0000oOooO00o.f13923OooO00o, 0).getAll().get(o0000oOooO00o.f13924OooO0O0);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }
}
