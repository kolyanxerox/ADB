package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.applovin.impl.y4 */
/* loaded from: classes.dex */
public final class C1295y4 {

    /* renamed from: b */
    private static C1220k f3157b;

    /* renamed from: c */
    private static SharedPreferences f3158c;

    /* renamed from: a */
    private final SharedPreferences f3159a;

    public C1295y4(C1220k c1220k) {
        this.f3159a = C1220k.m2824o().getSharedPreferences("com.applovin.sdk.preferences." + c1220k.m2904j0(), 0);
        f3157b = c1220k;
    }

    /* renamed from: a */
    public void m3798a(String str, Object obj, SharedPreferences.Editor editor) {
        m3792a(str, obj, (SharedPreferences) null, editor);
    }

    /* renamed from: b */
    public void m3801b(C1286x4 c1286x4, Object obj) {
        m3802b(c1286x4, obj, this.f3159a);
    }

    /* renamed from: a */
    public void m3799a(String str, Object obj, SharedPreferences sharedPreferences) {
        m3792a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    /* renamed from: b */
    public void m3802b(C1286x4 c1286x4, Object obj, SharedPreferences sharedPreferences) {
        m3799a(c1286x4.m3649a(), obj, sharedPreferences);
    }

    /* renamed from: a */
    public static void m3792a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z = editor != null;
        if (!z) {
            editor = sharedPreferences.edit();
        }
        if (obj != null) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editor.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
            } else if (obj instanceof String) {
                editor.putString(str, (String) obj);
            } else if (obj instanceof Set) {
                editor.putStringSet(str, (Set) obj);
            } else {
                C1240o.m3207h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z) {
            return;
        }
        m3791a(editor);
    }

    /* renamed from: b */
    public static void m3793b(C1286x4 c1286x4, Object obj, Context context) {
        m3792a(c1286x4.m3649a(), obj, m3786a(context), (SharedPreferences.Editor) null);
    }

    /* renamed from: b */
    public void m3800b(C1286x4 c1286x4) {
        m3791a(this.f3159a.edit().remove(c1286x4.m3649a()));
    }

    /* renamed from: a */
    public Object m3795a(C1286x4 c1286x4, Object obj) {
        return m3796a(c1286x4, obj, this.f3159a);
    }

    /* renamed from: a */
    public Object m3796a(C1286x4 c1286x4, Object obj, SharedPreferences sharedPreferences) {
        return m3789a(c1286x4.m3649a(), obj, c1286x4.m3650b(), sharedPreferences);
    }

    /* renamed from: a */
    public static Object m3787a(C1286x4 c1286x4, Object obj, Context context) {
        return m3789a(c1286x4.m3649a(), obj, c1286x4.m3650b(), m3786a(context));
    }

    /* renamed from: a */
    public static Object m3788a(C1286x4 c1286x4, Object obj, SharedPreferences sharedPreferences, boolean z) {
        return m3790a(c1286x4.m3649a(), obj, c1286x4.m3650b(), sharedPreferences, z);
    }

    /* renamed from: a */
    public static Object m3789a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return m3790a(str, obj, cls, sharedPreferences, true);
    }

    /* renamed from: a */
    public static Object m3790a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z) {
        Object stringSet;
        long jLongValue;
        int iIntValue;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                return obj;
            }
            if (Boolean.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
                } else {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                }
            } else if (Float.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
                } else {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                }
            } else if (Integer.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Long.class)) {
                        iIntValue = ((Long) obj).intValue();
                    } else {
                        iIntValue = ((Integer) obj).intValue();
                    }
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, iIntValue));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Integer.class)) {
                        jLongValue = ((Integer) obj).longValue();
                    } else {
                        jLongValue = ((Long) obj).longValue();
                    }
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, jLongValue));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()))));
                } else {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                }
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) obj);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
            }
            return stringSet != null ? cls.cast(stringSet) : obj;
        } catch (Throwable th) {
            if (z) {
                try {
                    C1240o.m3204c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    /* renamed from: a */
    public Object m3794a(C1286x4 c1286x4) {
        Object objM3795a = m3795a(c1286x4, null);
        m3800b(c1286x4);
        return objM3795a;
    }

    /* renamed from: a */
    public void m3797a(SharedPreferences sharedPreferences) {
        m3791a(sharedPreferences.edit().clear());
    }

    /* renamed from: a */
    public static void m3791a(SharedPreferences.Editor editor) {
        try {
            if (AbstractC1078k7.m1246h()) {
                C1220k c1220k = f3157b;
                if (c1220k != null && c1220k.m2918r0() != null) {
                    C0987b6 c0987b6M2918r0 = f3157b.m2918r0();
                    C1220k c1220k2 = f3157b;
                    Objects.requireNonNull(editor);
                    c0987b6M2918r0.m403a((AbstractRunnableC1036g5) new C1156p6(c1220k2, true, "commitSharedPreferencesChanges", new o0OO00O(editor, 12)), C0987b6.b.OTHER);
                    return;
                }
                editor.apply();
                return;
            }
            editor.commit();
        } catch (Throwable th) {
            C1240o.m3204c("SharedPreferencesManager", "Unable to apply changes", th);
            try {
                f3157b.m2832E().m2148a("SharedPreferencesManager", "persistChanges", th);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static SharedPreferences m3786a(Context context) {
        if (f3158c == null) {
            f3158c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f3158c;
    }
}
