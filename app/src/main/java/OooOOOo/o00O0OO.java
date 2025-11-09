package OoooOOO;

import Oooo00O.o000000O;
import Oooo0o0.OooOO0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class o00O0OO extends o0o0000 {

    /* renamed from: OooOo */
    public String f14120OooOo;

    /* renamed from: OooOo0o */
    public Boolean f14121OooOo0o;

    /* renamed from: OooOoO */
    public Boolean f14122OooOoO;

    /* renamed from: OooOoO0 */
    public oo0o0O0 f14123OooOoO0;

    public final boolean OooOO0o(String str) {
        return "1".equals(this.f14123OooOoO0.OooO0o(str, "gaia_collection_enabled"));
    }

    public final boolean OooOOO() {
        if (this.f14121OooOo0o == null) {
            Boolean boolOooOo0o = OooOo0o("app_measurement_lite");
            this.f14121OooOo0o = boolOooOo0o;
            if (boolOooOo0o == null) {
                this.f14121OooOo0o = Boolean.FALSE;
            }
        }
        return this.f14121OooOo0o.booleanValue() || !((o0OO0oO0) this.f14574OooOo0O).f14517OooOo0o;
    }

    public final boolean OooOOO0(String str) {
        return "1".equals(this.f14123OooOoO0.OooO0o(str, "measurement.event_sampling_enabled"));
    }

    public final String OooOOOO(String str) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            o000000O.OooO0oo(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0OO(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o03);
            o0o0o0o03.f14393OooOoOO.OooO0OO(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            o0O0O0o0 o0o0o0o04 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o04);
            o0o0o0o04.f14393OooOoOO.OooO0OO(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void OooOOOo() {
        ((o0OO0oO0) this.f14574OooOo0O).getClass();
    }

    public final long OooOOo(String str, o0O000 o0o000) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) o0o000.OooO00o(null)).longValue();
        }
        String strOooO0o = this.f14123OooOoO0.OooO0o(str, o0o000.f14207OooO00o);
        if (TextUtils.isEmpty(strOooO0o)) {
            return ((Long) o0o000.OooO00o(null)).longValue();
        }
        try {
            return ((Long) o0o000.OooO00o(Long.valueOf(Long.parseLong(strOooO0o)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) o0o000.OooO00o(null)).longValue();
        }
    }

    public final String OooOOo0(String str, o0O000 o0o000) {
        return TextUtils.isEmpty(str) ? (String) o0o000.OooO00o(null) : (String) o0o000.OooO00o(this.f14123OooOoO0.OooO0o(str, o0o000.f14207OooO00o));
    }

    public final int OooOOoo(String str, o0O000 o0o000) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) o0o000.OooO00o(null)).intValue();
        }
        String strOooO0o = this.f14123OooOoO0.OooO0o(str, o0o000.f14207OooO00o);
        if (TextUtils.isEmpty(strOooO0o)) {
            return ((Integer) o0o000.OooO00o(null)).intValue();
        }
        try {
            return ((Integer) o0o000.OooO00o(Integer.valueOf(Integer.parseInt(strOooO0o)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) o0o000.OooO00o(null)).intValue();
        }
    }

    public final boolean OooOo() {
        ((o0OO0oO0) this.f14574OooOo0O).getClass();
        Boolean boolOooOo0o = OooOo0o("firebase_analytics_collection_deactivated");
        return boolOooOo0o != null && boolOooOo0o.booleanValue();
    }

    public final boolean OooOo0(String str, o0O000 o0o000) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) o0o000.OooO00o(null)).booleanValue();
        }
        String strOooO0o = this.f14123OooOoO0.OooO0o(str, o0o000.f14207OooO00o);
        return TextUtils.isEmpty(strOooO0o) ? ((Boolean) o0o000.OooO00o(null)).booleanValue() : ((Boolean) o0o000.OooO00o(Boolean.valueOf("1".equals(strOooO0o)))).booleanValue();
    }

    public final double OooOo00(String str, o0O000 o0o000) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) o0o000.OooO00o(null)).doubleValue();
        }
        String strOooO0o = this.f14123OooOoO0.OooO0o(str, o0o000.f14207OooO00o);
        if (TextUtils.isEmpty(strOooO0o)) {
            return ((Double) o0o000.OooO00o(null)).doubleValue();
        }
        try {
            return ((Double) o0o000.OooO00o(Double.valueOf(Double.parseDouble(strOooO0o)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) o0o000.OooO00o(null)).doubleValue();
        }
    }

    public final Bundle OooOo0O() {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        try {
            Context context = o0oo0oo0.f14516OooOo0O;
            Context context2 = o0oo0oo0.f14516OooOo0O;
            PackageManager packageManager = context.getPackageManager();
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            if (packageManager == null) {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0O0("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoOooO0O0 = OooOO0.OooO00o(context2).OooO0O0(128, context2.getPackageName());
            if (applicationInfoOooO0O0 != null) {
                return applicationInfoOooO0O0.metaData;
            }
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0OO(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean OooOo0o(String str) {
        o000000O.OooO0o0(str);
        Bundle bundleOooOo0O = OooOo0O();
        if (bundleOooOo0O != null) {
            if (bundleOooOo0O.containsKey(str)) {
                return Boolean.valueOf(bundleOooOo0O.getBoolean(str));
            }
            return null;
        }
        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14393OooOoOO.OooO0O0("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final ooo0Oo0 OooOoO(String str, boolean z) {
        Object obj;
        o000000O.OooO0o0(str);
        Bundle bundleOooOo0O = OooOo0O();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (bundleOooOo0O == null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleOooOo0O.get(str);
        }
        ooo0Oo0 ooo0oo0 = ooo0Oo0.UNINITIALIZED;
        if (obj == null) {
            return ooo0oo0;
        }
        if (Boolean.TRUE.equals(obj)) {
            return ooo0Oo0.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return ooo0Oo0.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return ooo0Oo0.POLICY;
        }
        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o02);
        o0o0o0o02.f14396OooOooO.OooO0OO(str, "Invalid manifest metadata for");
        return ooo0oo0;
    }

    public final boolean OooOoO0() {
        Boolean boolOooOo0o = OooOo0o("google_analytics_automatic_screen_reporting_enabled");
        return boolOooOo0o == null || boolOooOo0o.booleanValue();
    }
}
