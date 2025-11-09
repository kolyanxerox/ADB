package o00OOO0O;

import OooO0oO.OooOo;
import OoooOOO.oO000Oo;
import androidx.core.location.LocationRequestCompat;
import com.ironsource.C3034d9;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o000Ooo.o00oO0o;
import o00O0oO.o0OO00O;
import o00OOO0.o000000O;
import o00OOO0.o000oOoO;
import o00OOO0.o0O0O00;
import o00OOO0.o0OoOo0;
import o00OOOoO.o0000;
import o00OOOoO.o0000O0;
import o00OOOoO.o0000oo;
import o00OOOoO.o0O0ooO;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public abstract class OooO0OO {

    /* renamed from: OooO */
    public static final Charset f32334OooO;

    /* renamed from: OooO00o */
    public static final byte[] f32335OooO00o;

    /* renamed from: OooO0O0 */
    public static final String[] f32336OooO0O0 = new String[0];

    /* renamed from: OooO0OO */
    public static final o000000O f32337OooO0OO;

    /* renamed from: OooO0Oo */
    public static final o0000O0 f32338OooO0Oo;

    /* renamed from: OooO0o */
    public static final o0000O0 f32339OooO0o;

    /* renamed from: OooO0o0 */
    public static final o0000O0 f32340OooO0o0;

    /* renamed from: OooO0oO */
    public static final o0000O0 f32341OooO0oO;

    /* renamed from: OooO0oo */
    public static final o0000O0 f32342OooO0oo;

    /* renamed from: OooOO0 */
    public static final Charset f32343OooOO0;

    /* renamed from: OooOO0O */
    public static final Charset f32344OooOO0O;
    public static final Charset OooOO0o;

    /* renamed from: OooOOO */
    public static final TimeZone f32345OooOOO;

    /* renamed from: OooOOO0 */
    public static final Charset f32346OooOOO0;

    /* renamed from: OooOOOO */
    public static final oO000Oo f32347OooOOOO;

    /* renamed from: OooOOOo */
    public static final Method f32348OooOOOo;

    /* renamed from: OooOOo0 */
    public static final Pattern f32349OooOOo0;

    static {
        byte[] bArr = new byte[0];
        f32335OooO00o = bArr;
        o0000 o0000Var = new o0000();
        o0000Var.OooO0oo(bArr, 0, 0);
        f32337OooO0OO = new o000000O(0, o0000Var);
        Method declaredMethod = null;
        o0O0O00.OooO0O0(null, bArr);
        f32338OooO0Oo = o0000O0.OooO0O0("efbbbf");
        f32340OooO0o0 = o0000O0.OooO0O0("feff");
        f32339OooO0o = o0000O0.OooO0O0("fffe");
        f32341OooO0oO = o0000O0.OooO0O0("0000ffff");
        f32342OooO0oo = o0000O0.OooO0O0("ffff0000");
        f32334OooO = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        f32343OooOO0 = Charset.forName("UTF-16BE");
        f32344OooOO0O = Charset.forName("UTF-16LE");
        OooOO0o = Charset.forName("UTF-32BE");
        f32346OooOOO0 = Charset.forName("UTF-32LE");
        f32345OooOOO = TimeZone.getTimeZone("GMT");
        f32347OooOOOO = new oO000Oo(1);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f32348OooOOOo = declaredMethod;
        f32349OooOOo0 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static int OooO(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static AssertionError OooO00o(Exception exc, String str) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset OooO0O0(o0000oo o0000ooVar, Charset charset) {
        if (o0000ooVar.OooOO0o(f32338OooO0Oo)) {
            o0000ooVar.skip(r0.f32555OooOo0O.length);
            return f32334OooO;
        }
        if (o0000ooVar.OooOO0o(f32340OooO0o0)) {
            o0000ooVar.skip(r0.f32555OooOo0O.length);
            return f32343OooOO0;
        }
        if (o0000ooVar.OooOO0o(f32339OooO0o)) {
            o0000ooVar.skip(r0.f32555OooOo0O.length);
            return f32344OooOO0O;
        }
        if (o0000ooVar.OooOO0o(f32341OooO0oO)) {
            o0000ooVar.skip(r0.f32555OooOo0O.length);
            return OooOO0o;
        }
        if (!o0000ooVar.OooOO0o(f32342OooO0oo)) {
            return charset;
        }
        o0000ooVar.skip(r0.f32555OooOo0O.length);
        return f32346OooOOO0;
    }

    public static String OooO0OO(String str) {
        int i = -1;
        int i2 = 0;
        if (!str.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i2 < lowerCase.length()) {
                    char cCharAt = lowerCase.charAt(i2);
                    if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                        return null;
                    }
                    i2++;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressOooO0oo = (str.startsWith(C3034d9.i.f8177d) && str.endsWith(C3034d9.i.f8179e)) ? OooO0oo(str, 1, str.length() - 1) : OooO0oo(str, 0, str.length());
        if (inetAddressOooO0oo == null) {
            return null;
        }
        byte[] address = inetAddressOooO0oo.getAddress();
        if (address.length != 16) {
            throw new AssertionError(OooOo.OooOO0O("Invalid IPv6 address: '", str, "'"));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < address.length) {
            int i5 = i3;
            while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        o0000 o0000Var = new o0000();
        while (i2 < address.length) {
            if (i2 == i) {
                o0000Var.OooOO0O(58);
                i2 += i4;
                if (i2 == 16) {
                    o0000Var.OooOO0O(58);
                }
            } else {
                if (i2 > 0) {
                    o0000Var.OooOO0O(58);
                }
                o0000Var.OooOOO0(((address[i2] & ForkServer.ERROR) << 8) | (address[i2 + 1] & ForkServer.ERROR));
                i2 += 2;
            }
        }
        return o0000Var.readString(o0000Var.f32535OooOo0o, o0OO00O.f31451OooO00o);
    }

    public static int OooO0Oo(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.");
    }

    public static void OooO0o(Socket socket) throws IOException {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!OooOOOO(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (!"bio == null".equals(e2.getMessage())) {
                    throw e2;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void OooO0o0(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static int OooO0oO(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress OooO0oo(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOO0O.OooO0OO.OooO0oo(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int OooOO0(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean OooOO0O(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String OooOO0o(o0OoOo0 o0oooo0, boolean z) {
        boolean zContains = o0oooo0.f32296OooO0Oo.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        String strOooOO0O = o0oooo0.f32296OooO0Oo;
        if (zContains) {
            strOooOO0O = OooOo.OooOO0O(C3034d9.i.f8177d, strOooOO0O, C3034d9.i.f8179e);
        }
        int i = o0oooo0.f32298OooO0o0;
        if (!z && i == o0OoOo0.OooO0O0(o0oooo0.f32293OooO00o)) {
            return strOooOO0O;
        }
        return strOooOO0O + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i;
    }

    public static String[] OooOOO(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static List OooOOO0(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static boolean OooOOOO(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean OooOOOo(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int OooOOo(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean OooOOo0(o0O0ooO o0o0ooo, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jOooO0OO = o0o0ooo.timeout().OooO0o0() ? o0o0ooo.timeout().OooO0OO() - jNanoTime : Long.MAX_VALUE;
        o0o0ooo.timeout().OooO0Oo(Math.min(jOooO0OO, timeUnit.toNanos(i)) + jNanoTime);
        try {
            o0000 o0000Var = new o0000();
            while (o0o0ooo.OooO0oO(8192L, o0000Var) != -1) {
                o0000Var.skip(o0000Var.f32535OooOo0o);
            }
            if (jOooO0OO == LocationRequestCompat.PASSIVE_INTERVAL) {
                o0o0ooo.timeout().OooO00o();
                return true;
            }
            o0o0ooo.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            return true;
        } catch (InterruptedIOException unused) {
            if (jOooO0OO == LocationRequestCompat.PASSIVE_INTERVAL) {
                o0o0ooo.timeout().OooO00o();
                return false;
            }
            o0o0ooo.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            return false;
        } catch (Throwable th) {
            if (jOooO0OO == LocationRequestCompat.PASSIVE_INTERVAL) {
                o0o0ooo.timeout().OooO00o();
            } else {
                o0o0ooo.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            throw th;
        }
    }

    public static int OooOOoo(int i, int i2, String str) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static o000oOoO OooOo00(ArrayList arrayList) {
        o00oO0o o00oo0o = new o00oO0o(15);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o00OOOOo.OooO0O0 oooO0O0 = (o00OOOOo.OooO0O0) obj;
            o00OOO0.OooO0O0 oooO0O02 = o00OOO0.OooO0O0.f32137OooO0o0;
            String strOooOOoo = oooO0O0.f32402OooO00o.OooOOoo();
            String strOooOOoo2 = oooO0O0.f32403OooO0O0.OooOOoo();
            oooO0O02.getClass();
            o00oo0o.OooO0OO(strOooOOoo, strOooOOoo2);
        }
        return new o000oOoO(o00oo0o);
    }
}
