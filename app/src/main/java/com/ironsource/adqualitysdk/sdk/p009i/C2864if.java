package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.if */
/* loaded from: classes2.dex */
public final class C2864if {

    /* renamed from: ﱡ */
    private static int f6734 = 0;

    /* renamed from: ﺙ */
    private static int f6735 = 0;

    /* renamed from: ﻏ */
    private static int f6736 = 1;

    /* renamed from: ﻛ */
    private static int[] f6737;

    /* renamed from: ﾇ */
    private static final byte[] f6738;

    /* renamed from: ﻐ */
    private Cipher f6739;

    /* renamed from: ｋ */
    private SecretKey f6740;

    /* renamed from: ﾒ */
    private Cipher f6741;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.if$c */
    public class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    static {
        m7080();
        f6738 = new byte[]{16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        int i = f6735 + InterfaceC3173h3.d.b.f8826i;
        f6736 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public C2864if(byte[] bArr, String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDigest;
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(m7078(new int[]{1280114910, 1420891292, -1865340549, 502981028, -1252897821, -1563289652, -1538229356, -2018333098, -6739012, 207910317, -955188114, -1785488789, 1684180172, -520588770, -792884385, 365993992}, 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            bArrDigest = secretKeyFactory.generateSecret(new PBEKeySpec(sb.toString().toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (GeneralSecurityException unused) {
            C2868ij.m7109(m7078(new int[]{-797859919, 29006907, -364579138, -599361732, -767105784, 962955254, 1878500287, 324931926, -1807945289, -1529637017}, Color.red(0) + 19).intern(), m7078(new int[]{-1158636369, -682445850, -1986295584, -651027725, -124578501, -1963469623, 414187190, -1644409252, 929283396, 742870093, -1709360850, 2061825394, -1482378200, -108856390, -1852403290, 2091529383, 1509637337, -1427421085, -1467314460, -65279691, 1824829871, 1079424286, -865738892, -1352773047, 432177559, -845127875, 1814619009, 702209289, 1288234021, -1424151640}, 59 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(m7078(new int[]{-93192216, 220965352}, (Process.myPid() >> 22) + 3).intern());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                sb2.append(str3);
                for (char c2 : sb2.toString().toCharArray()) {
                    messageDigest.update((byte) c2);
                }
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(m7078(new int[]{-702031709, -1014692929, 175812535, -2117623434, 1368231396, 650266192, -1695395992, -1593879238, 1261838370, 910808940}, 18 - MotionEvent.axisFromString("")).intern(), e);
            }
        }
        this.f6740 = new SecretKeySpec(bArrDigest, m7079(View.resolveSizeAndState(0, 0, 0) + 2, 3 - TextUtils.getCapsMode("", 0, 0), 239 - TextUtils.getTrimmedLength(""), "�\u000b\ufff9", false).intern());
        m7081();
    }

    /* renamed from: ﻐ */
    private static String m7078(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6737.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c2 = (char) (i3 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i3;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i2 + 1];
                        cArr[3] = c5;
                        C2723d.f5954 = (c2 << 16) + c3;
                        C2723d.f5952 = (c4 << 16) + c5;
                        C2723d.m6462(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C2723d.f5954 ^ iArr2[i4];
                            C2723d.f5954 = i5;
                            int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                            int i6 = C2723d.f5954;
                            C2723d.f5954 = iM6461;
                            C2723d.f5952 = i6;
                        }
                        int i7 = C2723d.f5954;
                        int i8 = C2723d.f5952;
                        C2723d.f5954 = i8;
                        C2723d.f5952 = i7;
                        int i9 = i7 ^ iArr2[16];
                        C2723d.f5952 = i9;
                        int i10 = i8 ^ iArr2[17];
                        C2723d.f5954 = i10;
                        cArr[0] = (char) (i10 >>> 16);
                        cArr[1] = (char) i10;
                        cArr[2] = (char) (i9 >>> 16);
                        cArr[3] = (char) i9;
                        C2723d.m6462(iArr2);
                        int i11 = C2723d.f5951;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        C2723d.f5951 = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: ｋ */
    private static String m7079(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2669b.f5039) {
            try {
                char[] cArr2 = new char[i2];
                C2669b.f5040 = 0;
                while (true) {
                    int i4 = C2669b.f5040;
                    if (i4 >= i2) {
                        break;
                    }
                    C2669b.f5038 = cArr[i4];
                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i3);
                    int i5 = C2669b.f5040;
                    cArr2[i5] = (char) (cArr2[i5] - f6734);
                    C2669b.f5040 = i5 + 1;
                }
                if (i > 0) {
                    C2669b.f5041 = i;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    int i6 = C2669b.f5041;
                    System.arraycopy(cArr3, 0, cArr2, i2 - i6, i6);
                    int i7 = C2669b.f5041;
                    System.arraycopy(cArr3, i7, cArr2, 0, i2 - i7);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2669b.f5040 = 0;
                    while (true) {
                        int i8 = C2669b.f5040;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr4[i8] = cArr2[(i2 - i8) - 1];
                        C2669b.f5040 = i8 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﾇ */
    public static void m7080() {
        f6737 = new int[]{-1896214613, 2127242605, -1536685129, -1657588159, -976414816, 1732588032, 161688155, -1403771074, -354302858, -217287067, -1657287664, -1068741588, 2096767000, -258481901, 867071361, 2066291674, 7280096, 1165247082};
        f6734 = 167;
    }

    /* renamed from: ﾒ */
    private void m7081() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance(m7079((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, (KeyEvent.getMaxKeyCode() >> 16) + 20, TextUtils.indexOf((CharSequence) "", '0') + 246, "\u0002\uffe7\u0005\ufff5�\u0002￡\ufff5\ufff4\ufff5￡\u0005\ufff7\ufff3\u0019 \u001b\u0016\u0016\u0013", true).intern());
            this.f6741 = cipher;
            SecretKey secretKey = this.f6740;
            byte[] bArr = f6738;
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(m7079(((Process.getThreadPriority(0) + 20) >> 6) + 14, 21 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 245, "\u0002\uffe7\u0005\ufff5�\u0002￡\ufff5\ufff4\ufff5￡\u0005\ufff7\ufff3\u0019 \u001b\u0016\u0016\u0013", true).intern());
            this.f6739 = cipher2;
            cipher2.init(2, this.f6740, new IvParameterSpec(bArr));
            int i = f6736 + 15;
            f6735 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(m7079(TextUtils.indexOf((CharSequence) "", '0', 0) + 19, 21 - (ViewConfiguration.getScrollBarSize() >> 8), 263 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0001\f\t\u0004\uffc0\u0005\u000e\u0016\t\u0012\u000f\u000e\r\u0005\u000e\u0014\uffc0ￒ￩\u000e\u0016", false).intern(), e);
        }
    }

    /* renamed from: ﻛ */
    public final synchronized String m7082(String str) {
        int i = f6736 + 53;
        f6735 = i % 128;
        if (i % 2 != 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            int i2 = f6735 + 15;
            f6736 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
        try {
            try {
                Cipher cipher = this.f6741;
                StringBuilder sb = new StringBuilder();
                sb.append(m7078(new int[]{2043117472, 641829778, 1990519235, 684905461, 1388929520, 1753104975, 490006985, 1687842971, 2063337078, -877454261, 1613003732, -293300188, -602252618, -1656518620, 1631285525, 1667316604, -1089604707, -1486799041, 1363312622, 1630588962}, Color.red(0) + 40).intern());
                sb.append(str);
                String strM7071 = C2861ic.m7071(cipher.doFinal(sb.toString().getBytes(m7078(new int[]{905371306, -2106664431, 388150726, 1685793678}, Color.alpha(0) + 5).intern())));
                int i3 = f6736 + 85;
                f6735 = i3 % 128;
                if (i3 % 2 == 0) {
                    return strM7071;
                }
                throw null;
            } catch (UnsupportedEncodingException e) {
                m7081();
                throw new RuntimeException(m7078(new int[]{-702031709, -1014692929, 175812535, -2117623434, 1368231396, 650266192, -1695395992, -1593879238, 1261838370, 910808940}, 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), e);
            }
        } catch (GeneralSecurityException e2) {
            m7081();
            throw new RuntimeException(m7078(new int[]{-702031709, -1014692929, 175812535, -2117623434, 1368231396, 650266192, -1695395992, -1593879238, 1261838370, 910808940}, 19 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), e2);
        }
    }

    /* renamed from: ﾇ */
    public final synchronized String m7083(String str) throws c {
        f6736 = (f6735 + 71) % 128;
        if (TextUtils.isEmpty(str)) {
            f6736 = (f6735 + 19) % 128;
            return null;
        }
        try {
            try {
                try {
                    String str2 = new String(this.f6739.doFinal(C2861ic.m7065(str)), m7078(new int[]{905371306, -2106664431, 388150726, 1685793678}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5).intern());
                    if (str2.indexOf(m7078(new int[]{2043117472, 641829778, 1990519235, 684905461, 1388929520, 1753104975, 490006985, 1687842971, 2063337078, -877454261, 1613003732, -293300188, -602252618, -1656518620, 1631285525, 1667316604, -1089604707, -1486799041, 1363312622, 1630588962}, 40 - KeyEvent.normalizeMetaState(0)).intern()) == 0) {
                        String strSubstring = str2.substring(m7078(new int[]{2043117472, 641829778, 1990519235, 684905461, 1388929520, 1753104975, 490006985, 1687842971, 2063337078, -877454261, 1613003732, -293300188, -602252618, -1656518620, 1631285525, 1667316604, -1089604707, -1486799041, 1363312622, 1630588962}, 40 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern().length(), str2.length());
                        f6735 = (f6736 + 63) % 128;
                        return strSubstring;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(m7078(new int[]{-842891615, 1282063807, -588598648, 61924727, -163463065, 878720347, -1129801317, 1149510841, -821243647, -1077460302, -725633011, 217000206, -1602328741, 1399756679, 81061204, 867510742, 953822853, 1329108673, 1153541259, 1732155424}, 38 - TextUtils.lastIndexOf("", '0', 0)).intern());
                    sb.append(str);
                    throw new c(sb.toString());
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(m7078(new int[]{-702031709, -1014692929, 175812535, -2117623434, 1368231396, 650266192, -1695395992, -1593879238, 1261838370, 910808940}, View.getDefaultSize(0, 0) + 19).intern(), e);
                } catch (BadPaddingException e2) {
                    m7081();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e2.getMessage());
                    sb2.append(m7079((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, TextUtils.getCapsMode("", 0, 0) + 1, 226 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false).intern());
                    sb2.append(str);
                    throw new c(sb2.toString());
                }
            } catch (C2863ie e3) {
                m7081();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e3.getMessage());
                sb3.append(m7079(Color.argb(0, 0, 0, 0) + 1, TextUtils.indexOf("", "", 0, 0) + 1, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 225, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false).intern());
                sb3.append(str);
                throw new c(sb3.toString());
            }
        } catch (IllegalBlockSizeException e4) {
            m7081();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(e4.getMessage());
            sb4.append(m7079(1 - View.MeasureSpec.getMode(0), -ImageFormat.getBitsPerPixel(0), 226 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false).intern());
            sb4.append(str);
            throw new c(sb4.toString());
        }
    }
}
