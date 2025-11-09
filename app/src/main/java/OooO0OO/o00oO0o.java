package Oooo0OO;

import OooOOo0.Oooo000;
import OooOooo.o000O;
import OooOooo.o000OO00;
import Oooo00O.o000000O;
import Oooo0o0.OooOO0;
import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public abstract class o00oO0o {

    /* renamed from: OooO */
    public static String f13843OooO;

    /* renamed from: OooO00o */
    public static final char[] f13844OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: OooO0O0 */
    public static final char[] f13845OooO0O0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: OooO0OO */
    public static Boolean f13846OooO0OO;

    /* renamed from: OooO0Oo */
    public static Boolean f13847OooO0Oo;

    /* renamed from: OooO0o */
    public static Boolean f13848OooO0o;

    /* renamed from: OooO0o0 */
    public static Boolean f13849OooO0o0;

    /* renamed from: OooO0oO */
    public static Boolean f13850OooO0oO;

    /* renamed from: OooO0oo */
    public static Boolean f13851OooO0oo;

    /* renamed from: OooOO0 */
    public static int f13852OooOO0;

    /* renamed from: OooOO0O */
    public static Boolean f13853OooOO0O;

    public static boolean OooO() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static void OooO00o(Context context, Throwable th) {
        try {
            o000000O.OooO0oo(context);
            o000000O.OooO0oo(th);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static String OooO0O0(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & ForkServer.ERROR;
            char[] cArr2 = f13845OooO0O0;
            cArr[i] = cArr2[i2 >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static String OooO0OO(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            char[] cArr = f13844OooO00o;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static void OooO0Oo(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String OooO0o() throws Throwable {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (f13843OooO == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f13843OooO = Application.getProcessName();
            } else {
                int iMyPid = f13852OooOO0;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f13852OooOO0 = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        str = "/proc/" + iMyPid + "/cmdline";
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String line = bufferedReader.readLine();
                            o000000O.OooO0oo(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            OooO0Oo(bufferedReader2);
                            throw th;
                        }
                        OooO0Oo(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                f13843OooO = strTrim;
            }
        }
        return f13843OooO;
    }

    public static long OooO0o0(InputStream inputStream, OutputStream outputStream, boolean z) {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                j += i;
                outputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                if (z) {
                    OooO0Oo(inputStream);
                    OooO0Oo(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            OooO0Oo(inputStream);
            OooO0Oo(outputStream);
        }
        return j;
    }

    public static byte[] OooO0oO(Context context, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        PackageInfo packageInfoOooO0OO = OooOO0.OooO00o(context).OooO0OO(64, str);
        Signature[] signatureArr = packageInfoOooO0OO.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i = 0;
            while (true) {
                if (i >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoOooO0OO.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean OooO0oo() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean OooOO0(Context context, int i) throws PackageManager.NameNotFoundException {
        if (OooOOOO(context, "com.google.android.gms", i)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                o000OO00 o000oo00OooO00o = o000OO00.OooO00o(context);
                o000oo00OooO00o.getClass();
                if (packageInfo != null) {
                    if (!o000OO00.OooO0Oo(packageInfo, false)) {
                        if (o000OO00.OooO0Oo(packageInfo, true)) {
                            if (!o000O.OooO0O0(o000oo00OooO00o.f13675OooOo0O)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean OooOO0O(Context context) {
        if (f13849OooO0o0 == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f13849OooO0o0 = Boolean.valueOf(z);
        }
        return f13849OooO0o0.booleanValue();
    }

    public static boolean OooOO0o(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f13846OooO0OO == null) {
            f13846OooO0OO = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f13846OooO0OO.booleanValue();
    }

    public static byte[] OooOOO(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
            i = i2;
        }
        return bArr;
    }

    public static boolean OooOOO0(Context context) {
        OooOO0o(context);
        if (OooOOOo(context)) {
            return !OooO0oo() || OooO();
        }
        return false;
    }

    public static boolean OooOOOO(Context context, String str, int i) {
        Oooo000 oooo000OooO00o = OooOO0.OooO00o(context);
        oooo000OooO00o.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) oooo000OooO00o.f13505OooO00o.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean OooOOOo(Context context) {
        if (f13847OooO0Oo == null) {
            f13847OooO0Oo = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f13847OooO0Oo.booleanValue();
    }
}
