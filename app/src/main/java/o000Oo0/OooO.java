package o000Oo0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f30324OooO00o = new HashMap();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f30325OooO0O0 = 64;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f30326OooO0OO;

    public OooO(int i) {
        this.f30326OooO0OO = i;
    }

    public static String OooO00o(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean OooO0O0(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strOooO00o = OooO00o(this.f30326OooO0OO, str);
        if (this.f30324OooO00o.size() >= this.f30325OooO0O0 && !this.f30324OooO00o.containsKey(strOooO00o)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f30325OooO0O0, null);
            return false;
        }
        String strOooO00o2 = OooO00o(this.f30326OooO0OO, str2);
        String str3 = (String) this.f30324OooO00o.get(strOooO00o);
        if (str3 == null ? strOooO00o2 == null : str3.equals(strOooO00o2)) {
            return false;
        }
        HashMap map = this.f30324OooO00o;
        if (str2 == null) {
            strOooO00o2 = "";
        }
        map.put(strOooO00o, strOooO00o2);
        return true;
    }

    public final synchronized void OooO0OO(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strOooO00o = OooO00o(this.f30326OooO0OO, str);
                if (this.f30324OooO00o.size() < this.f30325OooO0O0 || this.f30324OooO00o.containsKey(strOooO00o)) {
                    String str2 = (String) entry.getValue();
                    this.f30324OooO00o.put(strOooO00o, str2 == null ? "" : OooO00o(this.f30326OooO0OO, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f30325OooO0O0, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
