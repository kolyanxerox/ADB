package OoooOOO;

import Oooo00O.o000000O;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes2.dex */
public final class o0O0O0o0 extends oO0Oo {

    /* renamed from: OooOo */
    public char f14390OooOo;

    /* renamed from: OooOoO */
    public String f14391OooOoO;

    /* renamed from: OooOoO0 */
    public long f14392OooOoO0;

    /* renamed from: OooOoOO */
    public final o0O0oo0o f14393OooOoOO;

    /* renamed from: OooOoo */
    public final o0O0oo0o f14394OooOoo;

    /* renamed from: OooOoo0 */
    public final o0O0oo0o f14395OooOoo0;

    /* renamed from: OooOooO */
    public final o0O0oo0o f14396OooOooO;

    /* renamed from: OooOooo */
    public final o0O0oo0o f14397OooOooo;

    /* renamed from: Oooo0 */
    public final o0O0oo0o f14398Oooo0;

    /* renamed from: Oooo000 */
    public final o0O0oo0o f14399Oooo000;

    /* renamed from: Oooo00O */
    public final o0O0oo0o f14400Oooo00O;

    /* renamed from: Oooo00o */
    public final o0O0oo0o f14401Oooo00o;

    public o0O0O0o0(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        this.f14390OooOo = (char) 0;
        this.f14392OooOoO0 = -1L;
        this.f14393OooOoOO = new o0O0oo0o(this, 6, false, false);
        this.f14395OooOoo0 = new o0O0oo0o(this, 6, true, false);
        this.f14394OooOoo = new o0O0oo0o(this, 6, false, true);
        this.f14396OooOooO = new o0O0oo0o(this, 5, false, false);
        this.f14397OooOooo = new o0O0oo0o(this, 5, true, false);
        this.f14399Oooo000 = new o0O0oo0o(this, 5, false, true);
        this.f14400Oooo00O = new o0O0oo0o(this, 4, false, false);
        this.f14401Oooo00o = new o0O0oo0o(this, 3, false, false);
        this.f14398Oooo0 = new o0O0oo0o(this, 2, false, false);
    }

    public static o0O0O0Oo OooOOoo(String str) {
        if (str == null) {
            return null;
        }
        return new o0O0O0Oo(str);
    }

    public static String OooOo0O(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strOooOo0o = OooOo0o(obj, z);
        String strOooOo0o2 = OooOo0o(obj2, z);
        String strOooOo0o3 = OooOo0o(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strOooOo0o)) {
            sb.append(str2);
            sb.append(strOooOo0o);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strOooOo0o2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strOooOo0o2);
        }
        if (!TextUtils.isEmpty(strOooOo0o3)) {
            sb.append(str3);
            sb.append(strOooOo0o3);
        }
        return sb.toString();
    }

    public static String OooOo0o(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof o0O0O0Oo ? ((o0O0O0Oo) obj).f14389OooO00o : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = o0OO0oO0.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    @Override // OoooOOO.oO0Oo
    public final boolean OooOO0o() {
        return false;
    }

    public final o0O0oo0o OooOOOO() {
        return this.f14393OooOoOO;
    }

    public final o0O0oo0o OooOOOo() {
        return this.f14396OooOooO;
    }

    public final o0O0oo0o OooOOo() {
        return this.f14398Oooo0;
    }

    public final o0O0oo0o OooOOo0() {
        return this.f14401Oooo00o;
    }

    public final String OooOo0() {
        String str;
        synchronized (this) {
            try {
                if (this.f14391OooOoO == null) {
                    ((o0OO0oO0) ((o0OO0oO0) this.f14574OooOo0O).f14519OooOoO0.f14574OooOo0O).getClass();
                    this.f14391OooOoO = "FA";
                }
                o000000O.OooO0oo(this.f14391OooOoO);
                str = this.f14391OooOoO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void OooOo00(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(OooOo0(), i)) {
            Log.println(i, OooOo0(), OooOo0O(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        o000000O.OooO0oo(str);
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) this.f14574OooOo0O).f14522OooOoo0;
        if (o0oo0o00 == null) {
            Log.println(6, OooOo0(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!o0oo0o00.f14751OooOo0o) {
                Log.println(6, OooOo0(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            o0oo0o00.OooOo00(new o0oO0O0o(this, i, str, obj, obj2, obj3));
        }
    }
}
