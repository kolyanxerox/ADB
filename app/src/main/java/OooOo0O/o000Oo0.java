package OoooO0O;

import OooO0oO.OooOo;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class o000Oo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static Boolean f13986OooO00o;

    public static o0000O OooO00o(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new o0000O(strConcat, str2);
    }

    public static void OooO0O0(int i, int i2) {
        String strOooO0O0;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strOooO0O0 = o000OO.OooO0O0("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(OooOo.OooO0o(i2, "negative size: "));
                }
                strOooO0O0 = o000OO.OooO0O0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strOooO0O0);
        }
    }

    public static void OooO0OO(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void OooO0Oo(Context context, HashSet hashSet) {
        HashMap map;
        o0000OO0 o0000oo02 = new o0000OO0(context);
        Iterator it = hashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = o0000oo02.f13941OooO0OO;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            o0000O o0000oOooO00o = OooO00o(context, str);
            if (o0000oOooO00o == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                String str2 = o0000oOooO00o.f13923OooO00o;
                if (!map.containsKey(str2)) {
                    map.put(str2, o0000oo02.f13940OooO0O0.getSharedPreferences(str2, 0).edit());
                }
                ((SharedPreferences.Editor) map.get(str2)).remove(o0000oOooO00o.f13924OooO0O0);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
    }

    public static String OooO0o(int i, int i2, String str) {
        if (i < 0) {
            return o000OO.OooO0O0("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return o000OO.OooO0O0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(OooOo.OooO0o(i2, "negative size: "));
    }

    public static void OooO0o0(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? OooO0o(i, i3, "start index") : (i2 < 0 || i2 > i3) ? OooO0o(i2, i3, "end index") : o000OO.OooO0O0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
