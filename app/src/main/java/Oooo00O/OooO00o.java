package OooO00o;

import OoooO0O.o0000O0O;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.util.TypedValue;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.OooOo;
import o000000.o0OOO0o;
import o0000O.OooOo00;
import o0000oo0.o00Oo0;
import o0000oo0.oo0o0Oo;
import o000Ooo0.OooO0o;
import o00O.o00oO0o;
import o00O0O0O.OooOO0;
import o00O0O0O.OooOO0O;
import o00O0O0O.OooOOO;
import o00O0O0O.OooOOO0;
import o00O0o0O.o00Ooo;
import o00O0o0o.o0ooOOo;
import o00OO0o.OooO;
import oo0o0Oo.OooO0O0;

/* loaded from: classes.dex */
public abstract class OooO00o {
    public static OooOO0 OooO(OooOO0 oooOO0, OooOO0O key) {
        OooOo.OooO0o0(key, "key");
        if (OooOo.OooO00o(oooOO0.getKey(), key)) {
            return oooOO0;
        }
        return null;
    }

    public static void OooO00o(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "radix ", " was not in valid range ");
            sbOooOOo0.append(new o00Ooo(2, 36, 1));
            throw new IllegalArgumentException(sbOooOOo0.toString());
        }
    }

    public static int OooO0O0(int i, int i2) {
        return ColorUtils.setAlphaComponent(i, (Color.alpha(i) * i2) / 255);
    }

    public static byte[] OooO0OO(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static o00Oo0 OooO0Oo(String str, String str2) {
        OooO0o oooO0o = new OooO0o(str, str2);
        o0000O0O o0000o0oOooO00o = o00Oo0.OooO00o(OooO0o.class);
        o0000o0oOooO00o.f13936OooO0o0 = 1;
        o0000o0oOooO00o.f13935OooO0o = new OooO0oo.o00Oo0(oooO0o, 20);
        return o0000o0oOooO00o.OooO0o0();
    }

    public static int OooO0o(Activity activity, String str) {
        if (activity != null) {
            boolean z = activity.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
            boolean zShouldShowRequestPermissionRationale = ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
            if (z) {
                zShouldShowRequestPermissionRationale = !zShouldShowRequestPermissionRationale;
            }
            if (!z && zShouldShowRequestPermissionRationale) {
                activity.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
            }
            if (z && zShouldShowRequestPermissionRationale) {
                return 4;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x002b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooO0o0(android.content.Context r3, java.lang.String r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto Le
            boolean r1 = OooOOOo(r3, r2, r4)
            if (r1 == 0) goto Le
            return r4
        Le:
            r4 = 29
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            if (r0 >= r4) goto L24
            boolean r4 = OooOOOo(r3, r2, r1)
            if (r4 == 0) goto L1b
            goto L2a
        L1b:
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r3 = OooOOOo(r3, r2, r4)
            if (r3 == 0) goto L2b
            return r4
        L24:
            boolean r3 = OooOOOo(r3, r2, r1)
            if (r3 == 0) goto L2b
        L2a:
            return r1
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO00o.OooO00o.OooO0o0(android.content.Context, java.lang.String):java.lang.String");
    }

    public static final boolean OooO0oO(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static o00Oo0 OooO0oo(String str, OooOo00 oooOo00) {
        o0000O0O o0000o0oOooO00o = o00Oo0.OooO00o(OooO0o.class);
        o0000o0oOooO00o.f13936OooO0o0 = 1;
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO00o(Context.class));
        o0000o0oOooO00o.f13935OooO0o = new OooOo.OooOO0(9, str, oooOo00);
        return o0000o0oOooO00o.OooO0o0();
    }

    public static final o0ooOOo OooOO0(OooO oooO) {
        OooOo.OooO0o0(oooO, "<this>");
        if (oooO instanceof o00OO0oo.o00Oo0) {
            return OooOO0(((o00OO0oo.o00Oo0) oooO).f32076OooO00o);
        }
        return null;
    }

    public static int OooOO0O(Context context, int i, int i2) {
        TypedValue typedValueOooO00o = OooO0O0.OooO00o(context, i);
        if (typedValueOooO00o == null) {
            return i2;
        }
        int i3 = typedValueOooO00o.resourceId;
        return i3 != 0 ? ContextCompat.getColor(context, i3) : typedValueOooO00o.data;
    }

    public static int OooOO0o(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueOooO0OO = OooO0O0.OooO0OO(view.getContext(), view.getClass().getCanonicalName(), i);
        int i2 = typedValueOooO0OO.resourceId;
        return i2 != 0 ? ContextCompat.getColor(context, i2) : typedValueOooO0OO.data;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ArrayList OooOOO(Context context, int i) {
        String strOooO0o0;
        String strOooO0o02;
        String strOooO0o03;
        ArrayList arrayList = new ArrayList();
        switch (i) {
            case 0:
            case 37:
                if (OooOOOo(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (OooOOOo(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                return arrayList;
            case 1:
                if (OooOOOo(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                    return arrayList;
                }
                return arrayList;
            case 2:
                if (OooOOOo(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (OooOOOo(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (OooOOOo(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                    return arrayList;
                }
                return arrayList;
            case 3:
            case 4:
            case 5:
                if (i != 4 || Build.VERSION.SDK_INT < 29) {
                    if (OooOOOo(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (OooOOOo(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                        return arrayList;
                    }
                } else if (OooOOOo(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                    return arrayList;
                }
                return arrayList;
            case 6:
            case 11:
            case 20:
                return null;
            case 7:
            case 14:
                if (OooOOOo(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                    return arrayList;
                }
                return arrayList;
            case 8:
                if (OooOOOo(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 > 29 && OooOOOo(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (OooOOOo(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (OooOOOo(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (OooOOOo(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (OooOOOo(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (OooOOOo(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (i2 >= 26 && OooOOOo(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                    return arrayList;
                }
                return arrayList;
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && OooOOOo(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    return arrayList;
                }
                return arrayList;
            case 10:
            case 25:
            case 26:
            default:
                return arrayList;
            case 12:
                if (OooOOOo(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                    return arrayList;
                }
                return arrayList;
            case 13:
                if (OooOOOo(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (OooOOOo(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (OooOOOo(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (OooOOOo(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (OooOOOo(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                    return arrayList;
                }
                return arrayList;
            case 15:
                if (OooOOOo(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i3 = Build.VERSION.SDK_INT;
                if ((i3 < 29 || (i3 == 29 && Environment.isExternalStorageLegacy())) && OooOOOo(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    return arrayList;
                }
                return arrayList;
            case 16:
                if (OooOOOo(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    return arrayList;
                }
                return arrayList;
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && OooOOOo(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                    return arrayList;
                }
                return arrayList;
            case 18:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (OooOOOo(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                    return arrayList;
                }
                return arrayList;
            case 19:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (OooOOOo(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                    arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                    return arrayList;
                }
                return arrayList;
            case 21:
                if (OooOOOo(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                    return arrayList;
                }
                return arrayList;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && OooOOOo(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    return arrayList;
                }
                return arrayList;
            case 23:
                if (OooOOOo(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                    return arrayList;
                }
                return arrayList;
            case 24:
                if (OooOOOo(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    return arrayList;
                }
                return arrayList;
            case 27:
                if (OooOOOo(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                    return arrayList;
                }
                return arrayList;
            case 28:
                if (Build.VERSION.SDK_INT >= 31 && (strOooO0o0 = OooO0o0(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(strOooO0o0);
                    return arrayList;
                }
                return arrayList;
            case 29:
                if (Build.VERSION.SDK_INT >= 31 && (strOooO0o02 = OooO0o0(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(strOooO0o02);
                    return arrayList;
                }
                return arrayList;
            case 30:
                if (Build.VERSION.SDK_INT >= 31 && (strOooO0o03 = OooO0o0(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(strOooO0o03);
                    return arrayList;
                }
                return arrayList;
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && OooOOOo(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                    return arrayList;
                }
                return arrayList;
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && OooOOOo(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    return arrayList;
                }
                return arrayList;
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && OooOOOo(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                    return arrayList;
                }
                return arrayList;
            case 34:
                if (OooOOOo(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                    return arrayList;
                }
                return arrayList;
            case 35:
                if (Build.VERSION.SDK_INT >= 33 && OooOOOo(context, arrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                    return arrayList;
                }
                return arrayList;
            case 36:
                if (OooOOOo(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    return arrayList;
                }
                return arrayList;
        }
    }

    public static PackageInfo OooOOOO(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(context.getPackageName(), 4096);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x001f A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:38:0x0005, B:40:0x000c, B:46:0x001f, B:48:0x0025, B:50:0x002b, B:52:0x0031, B:54:0x0043), top: B:60:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0025 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:38:0x0005, B:40:0x000c, B:46:0x001f, B:48:0x0025, B:50:0x002b, B:52:0x0031, B:54:0x0043), top: B:60:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooOOOo(android.content.Context r5, java.util.ArrayList r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "permissions_handler"
            r1 = 0
            if (r6 == 0) goto L1d
            int r2 = r6.size()     // Catch: java.lang.Exception -> L1b
            r3 = r1
        La:
            if (r3 >= r2) goto L1d
            java.lang.Object r4 = r6.get(r3)     // Catch: java.lang.Exception -> L1b
            int r3 = r3 + 1
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L1b
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto La
            goto L51
        L1b:
            r5 = move-exception
            goto L53
        L1d:
            if (r5 != 0) goto L25
            java.lang.String r5 = "Unable to detect current Activity or App Context."
            android.util.Log.d(r0, r5)     // Catch: java.lang.Exception -> L1b
            return r1
        L25:
            android.content.pm.PackageInfo r5 = OooOOOO(r5)     // Catch: java.lang.Exception -> L1b
            if (r5 != 0) goto L31
            java.lang.String r5 = "Unable to get Package info, will not be able to determine permissions to request."
            android.util.Log.d(r0, r5)     // Catch: java.lang.Exception -> L1b
            return r1
        L31:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1b
            java.lang.String[] r5 = r5.requestedPermissions     // Catch: java.lang.Exception -> L1b
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Exception -> L1b
            r6.<init>(r5)     // Catch: java.lang.Exception -> L1b
            int r5 = r6.size()     // Catch: java.lang.Exception -> L1b
            r2 = r1
        L41:
            if (r2 >= r5) goto L58
            java.lang.Object r3 = r6.get(r2)     // Catch: java.lang.Exception -> L1b
            int r2 = r2 + 1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1b
            boolean r3 = r3.equals(r7)     // Catch: java.lang.Exception -> L1b
            if (r3 == 0) goto L41
        L51:
            r5 = 1
            return r5
        L53:
            java.lang.String r6 = "Unable to check manifest for permission: "
            android.util.Log.d(r0, r6, r5)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO00o.OooO00o.OooOOOo(android.content.Context, java.util.ArrayList, java.lang.String):boolean");
    }

    public static int OooOOo(float f, int i, int i2) {
        return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static final boolean OooOOo0(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static OooOOO0 OooOOoo(OooOO0 oooOO0, OooOO0O key) {
        OooOo.OooO0o0(key, "key");
        return OooOo.OooO00o(oooOO0.getKey(), key) ? OooOOO.f31358OooOo0O : oooOO0;
    }

    public static final byte[] OooOo(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static Integer OooOo0(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        return hashSet.contains(3) ? 3 : 1;
    }

    public static OooOOO0 OooOo00(OooOO0 oooOO0, OooOOO0 context) {
        OooOo.OooO0o0(context, "context");
        return context == OooOOO.f31358OooOo0O ? oooOO0 : (OooOOO0) context.fold(oooOO0, new o00oO0o(2));
    }

    public static int OooOo0O(Activity activity, String str, int i) {
        if (i == -1) {
            return OooO0o(activity, str);
        }
        return 1;
    }

    public static final void OooOo0o(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static int OooOoO(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static final byte[] OooOoO0(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return OooOo(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static long OooOoOO(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static Object OooOoo0(Class cls, String str, OooO0oO.OooOOO0... oooOOO0Arr) {
        int length = oooOOO0Arr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < oooOOO0Arr.length; i++) {
            OooO0oO.OooOOO0 oooOOO0 = oooOOO0Arr[i];
            oooOOO0.getClass();
            clsArr[i] = (Class) oooOOO0.f13280OooOo0o;
            objArr[i] = oooOOO0Arr[i].f13278OooOo;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public abstract void OooOOO0(o0OOO0o o0ooo0o, float f, float f2);
}
