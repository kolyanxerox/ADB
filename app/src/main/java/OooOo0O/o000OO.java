package OoooO0O;

import OooO0oO.OooOo;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o000OOoO.OooO;

/* loaded from: classes2.dex */
public abstract class o000OO {

    /* renamed from: OooO00o */
    public static String f13969OooO00o;

    /* renamed from: OooO0O0 */
    public static final OooO f13970OooO0O0 = new OooO(8);

    public static synchronized String OooO00o(Context context) {
        String str;
        try {
            if (f13969OooO00o == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || OooO0OO()) {
                    string = "emulator";
                }
                for (int i = 0; i < 3; i++) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(string.getBytes());
                        str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                        break;
                    } catch (ArithmeticException unused) {
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                }
                str = "";
                f13969OooO00o = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13969OooO00o;
    }

    public static String OooO0O0(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strOooOO0o;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strOooOO0o = "null";
            } else {
                try {
                    strOooOO0o = obj.toString();
                } catch (Exception e) {
                    String strOooOoo = OooOo.OooOoo(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strOooOoo), (Throwable) e);
                    strOooOO0o = OooOo.OooOO0o("<", strOooOoo, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strOooOO0o;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean OooO0OO() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }
}
