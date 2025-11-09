package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jw */
/* loaded from: classes2.dex */
public final class C2908jw {

    /* renamed from: ﻛ */
    private static int f7162 = 0;

    /* renamed from: ﾇ */
    private static char f7164 = 6;

    /* renamed from: ﾒ */
    private static int f7165 = 1;

    /* renamed from: ﻐ */
    private static char[] f7161 = {'p', 'n', 'v', 'c', 'C', 'o', 'u', 'l', 'd', '\'', 't', ' ', 'a', 'e', 'r', 's', 'i', 'f', 'j', '.', ':', 'm', 'q', 'y', 'k', 'S', 'T', 'b', 'E', 'x', 'w', 'z', '{', '|', '}', '~'};

    /* renamed from: ｋ */
    private static char[] f7163 = {'Q', 185, 209, 195, 197, 207, 203, 208, 133, '|', '2', 129, 134, '2', 129, 'x', 128, '{', '2', 'v', '[', 'w', '~', 'v', 128, 135, 't', '2', 'v', 'v', 's', '2', 134, '9', 128, 'v', '~', 135, 129, 'U', 128, 129, '7', 'p', '7', 'o', 'm', 'o', 'p', 'k', 'q', 'Q', 'R', 't', 'q', 'u', 'o', 's', '|', 'y', 't', 'M', 'K', 'm', 'k', 'I', 'S', 'V', 'S', 'r', 'q', 'y', '{', 'b', ':', '6', '_', 'y', 'y', '{', 't', 'K', '0', 'W', 'w', 'z', 'w', 'N', 'P', 'z', 'S', 'K', 'r', 'p', 'p', 'P', 'T', 172, '.', 133, 172, 166, 127, 133, 167, 162, 160, 163, 163, 163, 130, '~', 162, 160, 162, 163, 158, 164, 132, 134, 168, 162, 127, 134, 137, 134, 165, 164, 172, 174, 149, 'e', 196, 224, 265, 272, 270, 270, 244, 203, 190, '!', 'Y', 'r', 'p', 'h', 'i', 'J', 'M', 'J', '@', 'b', 'd', 'B', '@', 'h', 'p', 'H', 'G', 'g', 'g', 'i', 'B', 'D', 'k', 'j', 'j', 'G', 'J', 'q', 'G', 'E', 'n', 'q', 'n', 'N', '\'', 'B', 'k', 'r', 'p', 'p', 'V', '-', 159, 315, 307, 304, 310, 278, 274, 307, 302, 303, 304, 308, 306, 299, 291, 297, 315, 307, 304, 294, 262, 277, 304, 308, 306, 299, 307, 276, 270, 272, '0'};

    /* renamed from: ﻐ */
    public static boolean m7348(Context context, String str) {
        f7162 = (f7165 + InterfaceC3173h3.d.b.f8819b) % 128;
        if (context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        f7165 = (f7162 + 121) % 128;
        return true;
    }

    /* renamed from: ﻛ */
    private static String m7349(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (C2831h.f6553) {
            try {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f7163, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C2831h.f6552 = 0;
                    char c = 0;
                    while (true) {
                        int i5 = C2831h.f6552;
                        if (i5 >= i2) {
                            break;
                        }
                        if (bArr[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                        }
                        c = cArr2[i5];
                        C2831h.f6552 = i5 + 1;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i6 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i6, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i6);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2831h.f6552 = 0;
                    while (true) {
                        int i7 = C2831h.f6552;
                        if (i7 >= i2) {
                            break;
                        }
                        cArr4[i7] = cArr[(i2 - i7) - 1];
                        C2831h.f6552 = i7 + 1;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    C2831h.f6552 = 0;
                    while (true) {
                        int i8 = C2831h.f6552;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr[i8] = (char) (cArr[i8] - iArr[2]);
                        C2831h.f6552 = i8 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ｋ */
    public static String m7351(Context context) {
        int i = f7162 + 117;
        f7165 = i % 128;
        try {
            String str = (i % 2 == 0 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 1) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0)).versionName;
            f7165 = (f7162 + 27) % 128;
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            String strIntern = m7349(false, new int[]{0, 8, 97, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7349(true, new int[]{98, 33, 60, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000").intern());
            sb.append((String) context);
            sb.append(m7349(false, new int[]{131, 10, 158, 9}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000").intern());
            sb.append(e.getLocalizedMessage());
            C2921n.m7500(strIntern, sb.toString());
            return null;
        }
    }

    /* renamed from: ﻐ */
    public static void m7347(Context context, JSONObject jSONObject) throws JSONException, PackageManager.NameNotFoundException {
        f7165 = (f7162 + 97) % 128;
        String strIntern = m7349(false, new int[]{0, 8, 97, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern();
        String packageName = context.getPackageName();
        try {
            jSONObject.put(m7350((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 90), "\u0001\u0002", 2 - View.resolveSizeAndState(0, 0, 0)).intern(), packageName);
        } catch (JSONException e) {
            C2921n.m7506(strIntern, m7349(true, new int[]{8, 34, 18, 32}, null).intern(), e);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(m7349(false, new int[]{42, 2, 12, 0}, "\u0001\u0001").intern(), packageManager.getInstallerPackageName(packageName));
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append(m7349(true, new int[]{44, 52, 9, 30}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000").intern());
            sb.append(e2.getLocalizedMessage());
            C2921n.m7500(strIntern, sb.toString());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(m7350((byte) (Drawable.resolveOpacity(0, 0) + 8), "\u0003\u0004", 1 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), Integer.toString(packageInfo.versionCode));
            jSONObject.put(m7349(true, new int[]{96, 2, 58, 0}, "\u0000\u0000").intern(), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7349(true, new int[]{98, 33, 60, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000").intern());
            sb2.append(packageName);
            sb2.append(m7349(false, new int[]{131, 10, 158, 9}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000").intern());
            sb2.append(e3.getLocalizedMessage());
            C2921n.m7500(strIntern, sb2.toString());
        } catch (JSONException e4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m7350((byte) (51 - TextUtils.lastIndexOf("", '0', 0)), "\u0005\u0000\u0007\b\u0007\u0002\n\u000b\u0006\u0011\u0098\u0098\u0006\u0011¤¤\b\u0005\u000e\u000f\u0010\u0011\u0000\u0002\n\u0011\u0005\r\u000b\u0011\u000b\u0004\u0006\u0017\u0011\u0003\u0007\u0019\u0007\u0011¦¦\u0002\u0011\u0017\b", TextUtils.getTrimmedLength("") + 46).intern());
            sb3.append(e4.getLocalizedMessage());
            C2921n.m7500(strIntern, sb3.toString());
        }
        try {
            jSONObject.put(m7350((byte) (74 - (Process.myTid() >> 22)), "\u0007\u0002", (ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
            int i = f7162 + 57;
            f7165 = i % 128;
            if (i % 2 == 0) {
                int i2 = 68 / 0;
            }
        } catch (PackageManager.NameNotFoundException e5) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m7349(true, new int[]{98, 33, 60, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000").intern());
            sb4.append(packageName);
            sb4.append(m7349(false, new int[]{131, 10, 158, 9}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000").intern());
            sb4.append(e5.getLocalizedMessage());
            C2921n.m7500(strIntern, sb4.toString());
        } catch (JSONException e6) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m7349(false, new int[]{141, 43, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000").intern());
            sb5.append(e6.getLocalizedMessage());
            C2921n.m7500(strIntern, sb5.toString());
        }
    }

    /* renamed from: ｋ */
    private static String m7350(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f7161;
                char c = f7164;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﻐ */
    public static String m7346() throws ClassNotFoundException {
        f7165 = (f7162 + 65) % 128;
        try {
            Class.forName(m7349(true, new int[]{184, 30, 197, 9}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001").intern());
            String strIntern = m7350((byte) (37 - Color.red(0)), "\u009a", Color.rgb(0, 0, 0) + 16777217).intern();
            int i = f7165 + 77;
            f7162 = i % 128;
            if (i % 2 != 0) {
                int i2 = 6 / 0;
            }
            return strIntern;
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName(m7350((byte) (94 - ImageFormat.getBitsPerPixel(0)), "\u0004\u0000\u0016\u0014\u0011\u000f\u0000\u0002\u0011\u0003\b\f\u0001\u000f\u0012\r\n\u0014\f\u0012\n\r\u000b\u0016\u000e\t\u0019\u0012\u000e\t\u0019\u0012\r\u0011\r\u0014\u001d\u0001\u0003\u0017\u0006\r \u0014\u000f\u0000\u000f\u0019\u000f\u0000\u0019\u001d\u001c\u000b\u0013\u0007\u0010\u0011\u0000\u0002", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 59).intern());
                return m7349(true, new int[]{214, 1, 0, 1}, "\u0001").intern();
            } catch (ClassNotFoundException unused2) {
                return m7350((byte) (TextUtils.indexOf("", "", 0) + 38), "\u0094", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1).intern();
            }
        }
    }
}
