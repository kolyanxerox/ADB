package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.p012di.ServiceProvider;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public abstract class xh0 {

    /* renamed from: OooOo0o */
    public static String f25625OooOo0o;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f25626OooOo0O;

    public /* synthetic */ xh0(int i) {
        this.f25626OooOo0O = i;
    }

    public static ej0 OooO(Context context, int i, String str, String str2, OoooOOO.o0O0oo00 o0o0oo00) {
        ej0 ej0Var;
        ji0 ji0Var = new ji0(context, i, str, str2, o0o0oo00);
        try {
            ej0Var = (ej0) ji0Var.f20313OooOoO0.poll(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ji0Var.OooO0O0(2009, ji0Var.f20316OooOoo0, e);
            ej0Var = null;
        }
        ji0Var.OooO0O0(IronSourceError.ERROR_REWARD_VALIDATION_FAILED, ji0Var.f20316OooOoo0, null);
        if (ej0Var != null) {
            if (ej0Var.zzc == 7) {
                OoooOOO.o0O0oo00.f14467OooOoO = 3;
            } else {
                OoooOOO.o0O0oo00.f14467OooOoO = 2;
            }
        }
        return ej0Var == null ? new ej0() : ej0Var;
    }

    public static int OooO0O0(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        throw new ArithmeticException(OooO0oO.OooOo.OooO("overflow: checkedAdd(", i, ", ", i2, ")"));
    }

    public static int OooO0OO(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointOooO0Oo = androidx.core.view.Oooo000.OooO0Oo(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (androidx.core.view.Oooo000.OooO0o0(supportedPerformancePoints.get(i4)).covers(performancePointOooO0Oo)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && ii0.f20048OooOo0O == null) {
                if (i80.f19994OooO00o < 35) {
                    int iOooOooO = OooOooO(false);
                    int iOooOooO2 = OooOooO(true);
                    if (iOooOooO != 0 && (iOooOooO2 != 0 ? !(iOooOooO != 2 || iOooOooO2 != 2) : iOooOooO == 2)) {
                    }
                    ii0.f20048OooOo0O = Boolean.valueOf(z);
                    if (!z) {
                    }
                }
                z = false;
                ii0.f20048OooOo0O = Boolean.valueOf(z);
                if (!z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static int OooO0o(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static int OooO0oO(byte[] bArr, int i, ez0 ez0Var) throws k01 {
        int iOooooo = Oooooo(bArr, i, ez0Var);
        int i2 = ez0Var.f18711OooO00o;
        if (i2 < 0) {
            throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iOooooo) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            ez0Var.f18713OooO0OO = jz0.f20406OooOo0o;
            return iOooooo;
        }
        ez0Var.f18713OooO0OO = jz0.OooOo0(bArr, iOooooo, i2);
        return iOooooo + i2;
    }

    public static bi0 OooO0oo(pd0 pd0Var) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) pd0Var.f23325OooOo0o;
        try {
            tz0 tz0Var = tz0.f24541OooO00o;
            a11 a11Var = a11.f16875OooO0OO;
            rx0 rx0VarOooOoOO = rx0.OooOoOO(byteArrayInputStream, tz0.f24542OooO0O0);
            byteArrayInputStream.close();
            if (rx0VarOooOoOO.OooOo0o() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            ArrayList arrayList = new ArrayList(rx0VarOooOoOO.OooOo0o());
            for (qx0 qx0Var : rx0VarOooOoOO.OooOoo0()) {
                qx0Var.getClass();
                try {
                    su0 su0VarOooO00o = su0.OooO00o(qx0Var.OooOo().OooOoOO(), qx0Var.OooOo().OooOoO(), qx0Var.OooOo().OooOo(), qx0Var.OooOoO(), qx0Var.OooOoO() == fy0.RAW ? null : Integer.valueOf(qx0Var.OooOo0o()));
                    fu0 fu0Var = fu0.f19127OooO0O0;
                    yu0 yu0Var = (yu0) fu0Var.f19128OooO00o.get();
                    yu0Var.getClass();
                    ii0 ut0Var = !yu0Var.f26028OooO0O0.containsKey(new wu0(su0.class, su0VarOooO00o.f24164OooO0O0)) ? new ut0(su0VarOooO00o) : fu0Var.OooO00o(su0VarOooO00o);
                    int iOooOooo = qx0Var.OooOooo() - 2;
                    if (iOooOooo != 1 && iOooOooo != 2 && iOooOooo != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new vq0(ut0Var));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            }
            return new bi0(rx0VarOooOoOO, Collections.unmodifiableList(arrayList));
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static yq0 OooOO0O(byte[] bArr) throws GeneralSecurityException {
        try {
            tz0 tz0Var = tz0.f24541OooO00o;
            a11 a11Var = a11.f16875OooO0OO;
            mx0 mx0VarOooOoO0 = mx0.OooOoO0(bArr, tz0.f24542OooO0O0);
            fu0 fu0Var = fu0.f19127OooO0O0;
            az0 az0VarOooO00o = zu0.OooO00o(mx0VarOooOoO0.OooOoo0());
            tu0 tu0Var = new tu0(mx0VarOooOoO0, az0VarOooO00o);
            yu0 yu0Var = (yu0) fu0Var.f19128OooO00o.get();
            yu0Var.getClass();
            return !yu0Var.f26030OooO0Oo.containsKey(new wu0(tu0.class, az0VarOooO00o)) ? new vt0(tu0Var) : fu0Var.OooO0O0(tu0Var);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c5 A[EDGE_INSN: B:138:0x00c5->B:116:0x00c5 BREAK  A[LOOP:1: B:101:0x0094->B:139:0x0094]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooOOO(android.content.Context r10) {
        /*
            java.lang.String r0 = com.google.android.gms.internal.ads.xh0.f25625OooOo0o
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            java.lang.String r3 = "http://www.example.com"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r1.<init>(r2, r3)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L23
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L24
        L23:
            r3 = r4
        L24:
            java.util.List r5 = r0.queryIntentActivities(r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "android.support.customtabs.action.CustomTabsService"
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L31
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L31
        L5c:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L66
            com.google.android.gms.internal.ads.xh0.f25625OooOo0o = r4
            goto Le5
        L66:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L77
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            com.google.android.gms.internal.ads.xh0.f25625OooOo0o = r10
            goto Le5
        L77:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lc5
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.RuntimeException -> Lb5
            r0 = 64
            java.util.List r10 = r10.queryIntentActivities(r1, r0)     // Catch: java.lang.RuntimeException -> Lb5
            if (r10 == 0) goto Lbc
            int r0 = r10.size()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 != 0) goto L90
            goto Lbc
        L90:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.RuntimeException -> Lb5
        L94:
            boolean r0 = r10.hasNext()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r10.next()     // Catch: java.lang.RuntimeException -> Lb5
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch: java.lang.RuntimeException -> Lb5
            android.content.IntentFilter r1 = r0.filter     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            int r2 = r1.countDataAuthorities()     // Catch: java.lang.RuntimeException -> Lb5
            if (r2 == 0) goto L94
            int r1 = r1.countDataPaths()     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto L94
            goto Lc5
        Lb5:
            java.lang.String r10 = "CustomTabsHelper"
            java.lang.String r0 = "Runtime exception while getting specialized handlers"
            android.util.Log.e(r10, r0)
        Lbc:
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto Lc5
            com.google.android.gms.internal.ads.xh0.f25625OooOo0o = r3
            goto Le5
        Lc5:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ld0
            com.google.android.gms.internal.ads.xh0.f25625OooOo0o = r10
            goto Le5
        Ld0:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ldb
            com.google.android.gms.internal.ads.xh0.f25625OooOo0o = r10
            goto Le5
        Ldb:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Le5
            com.google.android.gms.internal.ads.xh0.f25625OooOo0o = r10
        Le5:
            java.lang.String r10 = com.google.android.gms.internal.ads.xh0.f25625OooOo0o
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xh0.OooOOO(android.content.Context):java.lang.String");
    }

    public static Object OooOOO0(pn0 pn0Var, String str) {
        vm0 vm0Var = new vm0(pn0Var.f23378OooOo0O, pn0Var.f23379OooOo0o);
        return vm0Var.hasNext() ? vm0Var.next() : str;
    }

    public static String OooOOOO(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static String OooOOOo(jz0 jz0Var) {
        StringBuilder sb = new StringBuilder(jz0Var.OooOO0());
        for (int i = 0; i < jz0Var.OooOO0(); i++) {
            byte bOooO0o = jz0Var.OooO0o(i);
            if (bOooO0o == 34) {
                sb.append("\\\"");
            } else if (bOooO0o == 39) {
                sb.append("\\'");
            } else if (bOooO0o != 92) {
                switch (bOooO0o) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bOooO0o < 32 || bOooO0o > 126) {
                            sb.append('\\');
                            sb.append((char) (((bOooO0o >>> 6) & 3) + 48));
                            sb.append((char) (((bOooO0o >>> 3) & 7) + 48));
                            sb.append((char) ((bOooO0o & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bOooO0o);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static Date OooOOo(long j) {
        return new Date((j - 2082844800) * 1000);
    }

    public static String OooOOo0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (OoooOoO(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (OoooOoO(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void OooOOoo(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static boolean OooOo(String str) {
        return str == null || str.isEmpty();
    }

    public static void OooOo0(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void OooOo00(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static boolean OooOo0O(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !lt0.OooO00o();
        }
        if (!lt0.OooO00o()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            lt0.f20951OooO00o.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static boolean OooOo0o(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(C3034d9.h.f8099d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] OooOoO(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            byte b = bArr[i];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i2] >> 7) & 1) | b2);
            }
            i = i2;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static byte[] OooOoO0(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static int OooOoOO(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public static int OooOoo(int i, byte[] bArr) {
        int i2 = bArr[i] & ForkServer.ERROR;
        int i3 = bArr[i + 1] & ForkServer.ERROR;
        int i4 = bArr[i + 2] & ForkServer.ERROR;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int OooOoo0(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (go0.f19393OooO00o[roundingMode.ordinal()]) {
            case 1:
                Oooo0o(false);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static int OooOooO(boolean z) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            jb1 jb1Var = new jb1();
            jb1Var.OooO0OO(MimeTypes.VIDEO_H264);
            o0OoOo0 o0oooo0 = new o0OoOo0(jb1Var);
            if (o0oooo0.f22222OooOOO0 != null) {
                gn0 gn0VarOooO0OO = m81.OooO0OO(o0O.f21861Oooo0, o0oooo0, z, false);
                for (int i = 0; i < gn0VarOooO0OO.f19390OooOoO0; i++) {
                    if (((c81) gn0VarOooO0OO.get(i)).f17961OooO0Oo != null && ((c81) gn0VarOooO0OO.get(i)).f17961OooO0Oo.getVideoCapabilities() != null && (supportedPerformancePoints = ((c81) gn0VarOooO0OO.get(i)).f17961OooO0Oo.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        androidx.core.view.Oooo000.OooOOOO();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointOooO0OO = androidx.core.view.Oooo000.OooO0OO();
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (androidx.core.view.Oooo000.OooO0o0(supportedPerformancePoints.get(i2)).covers(performancePointOooO0OO)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (i81 unused) {
        }
        return 0;
    }

    public static pn0 OooOooo(um0 um0Var, um0 um0Var2) {
        ii0.Oooo0oo(um0Var, "set1");
        ii0.Oooo0oo(um0Var2, "set2");
        return new pn0(um0Var, um0Var2);
    }

    public static File Oooo(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        OooOo0(file2, false);
        return file2;
    }

    public static String Oooo0(String str, Object... objArr) {
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
                    String strOooOoo = OooO0oO.OooOo.OooOoo(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strOooOoo), (Throwable) e);
                    strOooOO0o = OooO0oO.OooOo.OooOO0o("<", strOooOoo, " threw ", e.getClass().getName(), ">");
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

    public static File Oooo00O(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(Oooo(file, str), str2);
    }

    public static String Oooo00o(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static LinkedHashMap Oooo0O0(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static void Oooo0o(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void Oooo0o0(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(OooO0oO.OooOo.OooOO0O("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static boolean Oooo0oO(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static qn0 Oooo0oo(Set set, zk0 zk0Var) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof qn0)) {
                set.getClass();
                return new qn0(set, zk0Var);
            }
            qn0 qn0Var = (qn0) set;
            zk0 zk0Var2 = qn0Var.f23667OooOo0o;
            zk0Var2.getClass();
            return new qn0(qn0Var.f23666OooOo0O, new al0(Arrays.asList(zk0Var2, zk0Var)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof qn0)) {
            set2.getClass();
            return new rn0(set2, zk0Var);
        }
        qn0 qn0Var2 = (qn0) set2;
        zk0 zk0Var3 = qn0Var2.f23667OooOo0o;
        zk0Var3.getClass();
        return new rn0((SortedSet) qn0Var2.f23666OooOo0O, new al0(Arrays.asList(zk0Var3, zk0Var)));
    }

    public static boolean OoooO(String str, CharSequence charSequence) {
        char c;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == charSequence.charAt(i) || ((c = (char) ((r3 | ' ') - 97)) < 26 && c == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void OoooO0(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static void OoooO0O(List list, zk0 zk0Var, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zk0Var.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    public static Executor OoooOO0(Executor executor, sp0 sp0Var) {
        executor.getClass();
        return executor == qp0.f23673OooOo0O ? executor : new eq0(executor, sp0Var);
    }

    public static boolean OoooOOO(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z = true;
            for (int i = 0; i < fileArrListFiles.length; i++) {
                File file2 = fileArrListFiles[i];
                z = file2 != null && OoooOOO(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static boolean OoooOOo(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static int OoooOo0(g11 g11Var, int i, byte[] bArr, int i2, int i3, h01 h01Var, ez0 ez0Var) throws k01 {
        zz0 zz0VarZze = g11Var.zze();
        g11 g11Var2 = g11Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        ez0 ez0Var2 = ez0Var;
        int iO00O0O = o00O0O(zz0VarZze, g11Var2, bArr2, i2, i4, ez0Var2);
        g11Var2.OooO00o(zz0VarZze);
        ez0Var2.f18713OooO0OO = zz0VarZze;
        h01Var.add(zz0VarZze);
        while (iO00O0O < i4) {
            ez0 ez0Var3 = ez0Var2;
            int i5 = i4;
            int iOooooo = Oooooo(bArr2, iO00O0O, ez0Var3);
            if (i != ez0Var3.f18711OooO00o) {
                break;
            }
            byte[] bArr3 = bArr2;
            g11 g11Var3 = g11Var2;
            zz0 zz0VarZze2 = g11Var3.zze();
            iO00O0O = o00O0O(zz0VarZze2, g11Var3, bArr3, iOooooo, i5, ez0Var3);
            g11Var2 = g11Var3;
            bArr2 = bArr3;
            i4 = i5;
            ez0Var2 = ez0Var3;
            g11Var2.OooO00o(zz0VarZze2);
            ez0Var2.f18713OooO0OO = zz0VarZze2;
            h01Var.add(zz0VarZze2);
        }
        return iO00O0O;
    }

    public static boolean OoooOoO(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean OoooOoo(sn0 sn0Var, Collection collection) {
        collection.getClass();
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= sn0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= sn0Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = sn0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static boolean Ooooo0o(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            Oooo0OO.o00oO0o.OooO0Oo(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            Oooo0OO.o00oO0o.OooO0Oo(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            Oooo0OO.o00oO0o.OooO0Oo(fileOutputStream2);
            throw th;
        }
    }

    public static int OooooO0(byte[] bArr, int i, h01 h01Var, ez0 ez0Var) throws k01 {
        a01 a01Var = (a01) h01Var;
        int iOooooo = Oooooo(bArr, i, ez0Var);
        int i2 = ez0Var.f18711OooO00o + iOooooo;
        while (iOooooo < i2) {
            iOooooo = Oooooo(bArr, iOooooo, ez0Var);
            a01Var.OooO0oO(ez0Var.f18711OooO00o);
        }
        if (iOooooo == i2) {
            return iOooooo;
        }
        throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int OooooOo(int i, byte[] bArr, int i2, int i3, l11 l11Var, ez0 ez0Var) throws k01 {
        if ((i >>> 3) == 0) {
            throw new k01("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iO0OoOo0 = o0OoOo0(bArr, i2, ez0Var);
            l11Var.OooO0OO(i, Long.valueOf(ez0Var.f18712OooO0O0));
            return iO0OoOo0;
        }
        if (i4 == 1) {
            l11Var.OooO0OO(i, Long.valueOf(o00Oo0(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iOooooo = Oooooo(bArr, i2, ez0Var);
            int i5 = ez0Var.f18711OooO00o;
            if (i5 < 0) {
                throw new k01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iOooooo) {
                throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                l11Var.OooO0OO(i, jz0.f20406OooOo0o);
            } else {
                l11Var.OooO0OO(i, jz0.OooOo0(bArr, iOooooo, i5));
            }
            return iOooooo + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new k01("Protocol message contained an invalid tag (zero).");
            }
            l11Var.OooO0OO(i, Integer.valueOf(OooOoo(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        l11 l11VarOooO0O0 = l11.OooO0O0();
        int i7 = ez0Var.f18714OooO0Oo + 1;
        ez0Var.f18714OooO0Oo = i7;
        if (i7 >= 100) {
            throw new k01("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iOooooo2 = Oooooo(bArr, i2, ez0Var);
            int i9 = ez0Var.f18711OooO00o;
            if (i9 == i6) {
                i8 = i9;
                i2 = iOooooo2;
                break;
            }
            i2 = OooooOo(i9, bArr, iOooooo2, i3, l11VarOooO0O0, ez0Var);
            i8 = i9;
        }
        ez0Var.f18714OooO0Oo--;
        if (i2 > i3 || i8 != i6) {
            throw new k01("Failed to parse the message.");
        }
        l11Var.OooO0OO(i, l11VarOooO0O0);
        return i2;
    }

    public static int Oooooo(byte[] bArr, int i, ez0 ez0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return OoooooO(b, bArr, i2, ez0Var);
        }
        ez0Var.f18711OooO00o = b;
        return i2;
    }

    public static int OoooooO(int i, byte[] bArr, int i2, ez0 ez0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            ez0Var.f18711OooO00o = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            ez0Var.f18711OooO00o = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ez0Var.f18711OooO00o = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ez0Var.f18711OooO00o = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ez0Var.f18711OooO00o = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int Ooooooo(int i, byte[] bArr, int i2, int i3, h01 h01Var, ez0 ez0Var) {
        a01 a01Var = (a01) h01Var;
        int iOooooo = Oooooo(bArr, i2, ez0Var);
        a01Var.OooO0oO(ez0Var.f18711OooO00o);
        while (iOooooo < i3) {
            int iOooooo2 = Oooooo(bArr, iOooooo, ez0Var);
            if (i != ez0Var.f18711OooO00o) {
                break;
            }
            iOooooo = Oooooo(bArr, iOooooo2, ez0Var);
            a01Var.OooO0oO(ez0Var.f18711OooO00o);
        }
        return iOooooo;
    }

    public static int o00O0O(Object obj, g11 g11Var, byte[] bArr, int i, int i2, ez0 ez0Var) throws k01 {
        int iOoooooO = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iOoooooO = OoooooO(i3, bArr, iOoooooO, ez0Var);
            i3 = ez0Var.f18711OooO00o;
        }
        int i4 = iOoooooO;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = ez0Var.f18714OooO0Oo + 1;
        ez0Var.f18714OooO0Oo = i5;
        if (i5 >= 100) {
            throw new k01("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        g11Var.OooO0OO(obj, bArr, i4, i6, ez0Var);
        ez0Var.f18714OooO0Oo--;
        ez0Var.f18713OooO0OO = obj;
        return i6;
    }

    public static long o00Oo0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int o0OoOo0(byte[] bArr, int i, ez0 ez0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            ez0Var.f18712OooO0O0 = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        ez0Var.f18712OooO0O0 = j2;
        return i3;
    }

    public static int ooOO(Object obj, g11 g11Var, byte[] bArr, int i, int i2, int i3, ez0 ez0Var) throws k01 {
        v01 v01Var = (v01) g11Var;
        int i4 = ez0Var.f18714OooO0Oo + 1;
        ez0Var.f18714OooO0Oo = i4;
        if (i4 >= 100) {
            throw new k01("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iOooOoO = v01Var.OooOoO(obj, bArr, i, i2, i3, ez0Var);
        ez0Var.f18714OooO0Oo--;
        ez0Var.f18713OooO0OO = obj;
        return iOooOoO;
    }

    public abstract int OooO0Oo(gp0 gp0Var);

    public abstract ro0 OooOO0(ap0 ap0Var);

    public abstract Object OooOO0o();

    public abstract zo0 Oooo000(ap0 ap0Var);

    public abstract void Oooo0OO(gp0 gp0Var, Set set);

    public abstract void OoooO00(zo0 zo0Var, zo0 zo0Var2);

    public abstract boolean Ooooo00(ap0 ap0Var, ro0 ro0Var, ro0 ro0Var2);

    public abstract boolean OooooOO(ap0 ap0Var, Object obj, Object obj2);

    public abstract boolean Oooooo0(ap0 ap0Var, zo0 zo0Var, zo0 zo0Var2);

    public abstract void o000oOoO(zo0 zo0Var, Thread thread);

    public String toString() {
        switch (this.f25626OooOo0O) {
            case 8:
                return OooOO0o().toString();
            default:
                return super.toString();
        }
    }
}
