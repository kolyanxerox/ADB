package com.ironsource.adqualitysdk.sdk.p009i;

import OooO0oO.OooOo;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3037dc;
import com.ironsource.InterfaceC3173h3;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.iv */
/* loaded from: classes2.dex */
public final class C2880iv {

    /* renamed from: ﮐ */
    private static int f6857 = 1;

    /* renamed from: ﱡ */
    private static int f6859 = 0;

    /* renamed from: ﻐ */
    private static boolean f6860 = true;

    /* renamed from: ｋ */
    private static int f6862 = 95;

    /* renamed from: ﾒ */
    private static boolean f6864 = true;

    /* renamed from: ﻛ */
    private static char[] f6861 = {173, 196, 211, 180, 200, 203, 210, 198, 217, 207};

    /* renamed from: ﱟ */
    private static char f6858 = 7;

    /* renamed from: ﾇ */
    private static char[] f6863 = {'E', 'r', 'o', ' ', 's', 'e', 'n', 'd', 'i', 'g', 'p', 't', 'q', 'u', ':', 'U', 'T', 'F', '-', '8', 'C', 'c', 'P', 'O', 'S', 'y', 'a', 'l', '/', 'j', ';', 'h', C3037dc.f8244T, 'f', 'G', ',', '\"', '}', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Q', 'R', 'V', 'W'};

    /* renamed from: ﻐ */
    public static C2879iu m7127(JSONObject jSONObject, String str) {
        f6857 = (f6859 + 61) % 128;
        try {
            HttpURLConnection httpURLConnectionM7132 = m7132(str);
            byte[] bArrM7129 = m7129(httpURLConnectionM7132, jSONObject);
            long jM7339 = C2906ju.m7339();
            m7133(httpURLConnectionM7132, bArrM7129);
            String strM7135 = m7135(httpURLConnectionM7132);
            int responseCode = httpURLConnectionM7132.getResponseCode();
            String responseMessage = httpURLConnectionM7132.getResponseMessage();
            if (responseCode >= 400) {
                httpURLConnectionM7132.disconnect();
            }
            C2879iu c2879iu = new C2879iu(strM7135, responseCode, responseMessage, C2906ju.m7339() - jM7339);
            int i = f6859 + 7;
            f6857 = i % 128;
            if (i % 2 == 0) {
                int i2 = 80 / 0;
            }
            return c2879iu;
        } catch (Throwable th) {
            String strIntern = m7128(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7138((byte) (View.MeasureSpec.getMode(0) + 121), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0006\u0000\r\r\u0001\n\u0002\t\u0003\u000b\u0012\u0004\u0002\f\u0013\f\u0006\u000b\u0012\u0011\u0000", TextUtils.indexOf((CharSequence) "", '0') + 29).intern());
            sb.append(th.getLocalizedMessage());
            C2921n.m7506(strIntern, sb.toString(), th);
            return null;
        }
    }

    /* renamed from: ﻛ */
    private static HttpURLConnection m7130(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m7138((byte) (119 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "\u001c\u0006Ë", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3).intern());
        int i = f6859 + 97;
        f6857 = i % 128;
        if (i % 2 == 0) {
            int i2 = 5 / 0;
        }
        return httpURLConnection;
    }

    /* renamed from: ｋ */
    private static void m7133(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m7136(dataOutputStream);
        f6859 = (f6857 + 7) % 128;
    }

    /* renamed from: ﾇ */
    private static String m7135(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        String string = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    f6857 = (f6859 + 125) % 128;
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append('\r');
                        f6857 = (f6859 + 83) % 128;
                    }
                    stringBuffer.append(line);
                    f6857 = (f6859 + InterfaceC3173h3.d.b.f8823f) % 128;
                }
                string = stringBuffer.toString();
            } catch (Throwable th2) {
                th = th2;
                try {
                    C2921n.m7506(m7128(null, null, 126 - TextUtils.lastIndexOf("", '0'), "\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern(), m7138((byte) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0001\u0002\u0002\u0003\u0002\u0004\f\u0002tt\r\u0001\n\u0002\u0002\u0006\u0003\u000b\u0003\u0000\u0005\u0006", 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), th);
                    return string;
                } finally {
                    m7136(inputStream);
                    m7136(bufferedReader);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            bufferedReader = null;
        }
        return string;
    }

    /* renamed from: ﾒ */
    public static String m7139(C2879iu c2879iu) {
        int i = f6857 + 3;
        f6859 = i % 128;
        if (i % 2 != 0) {
            int i2 = 23 / 0;
            if (c2879iu == null) {
                return null;
            }
        } else if (c2879iu == null) {
            return null;
        }
        String strM7122 = c2879iu.m7122();
        f6857 = (f6859 + 11) % 128;
        return strM7122;
    }

    /* renamed from: ﾒ */
    private static String m7138(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6863;
                char c = f6858;
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

    /* renamed from: ｋ */
    private static HttpURLConnection m7132(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m7138((byte) (105 - ExpandableListView.getPackedPositionChild(0L)), "\u0017\u0018\u0017\u0011", 4 - KeyEvent.getDeadChar(0, 0)).intern());
        httpURLConnection.setRequestProperty(m7138((byte) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0010\u0006\u0004\r\u0006\u0000\u0012\u0019\u0012\u0017\f\u0003", TextUtils.lastIndexOf("", '0', 0) + 13).intern(), m7138((byte) (99 - TextUtils.indexOf("", "", 0)), "\u0018\f\r\u0018\u0007\u0016\u0019\f\t\u0001\u0000\" \u0001\u0003\u0000\u001f\u0002\u0018\u001c\u0016\u0005\u0005\u0006\u0012'\u0007\f \u0013\u009b", (ViewConfiguration.getFadingEdgeLength() >> 16) + 31).intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        int i = f6857 + 123;
        f6859 = i % 128;
        if (i % 2 == 0) {
            return httpURLConnection;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static C2879iu m7126(String str) {
        HttpURLConnection httpURLConnectionM7130;
        long jM7339;
        String strM7135;
        int responseCode;
        String responseMessage;
        int i = f6857 + 119;
        f6859 = i % 128;
        try {
            if (i % 2 != 0) {
                httpURLConnectionM7130 = m7130(str);
                jM7339 = C2906ju.m7339();
                strM7135 = m7135(httpURLConnectionM7130);
                responseCode = httpURLConnectionM7130.getResponseCode();
                responseMessage = httpURLConnectionM7130.getResponseMessage();
                if (responseCode >= 22809) {
                    f6857 = (f6859 + 21) % 128;
                    httpURLConnectionM7130.disconnect();
                }
            } else {
                httpURLConnectionM7130 = m7130(str);
                jM7339 = C2906ju.m7339();
                strM7135 = m7135(httpURLConnectionM7130);
                responseCode = httpURLConnectionM7130.getResponseCode();
                responseMessage = httpURLConnectionM7130.getResponseMessage();
                if (responseCode >= 400) {
                    f6857 = (f6859 + 21) % 128;
                    httpURLConnectionM7130.disconnect();
                }
            }
            String str2 = responseMessage;
            int i2 = responseCode;
            C2879iu c2879iu = new C2879iu(strM7135, i2, str2, C2906ju.m7339() - jM7339);
            f6859 = (f6857 + 97) % 128;
            return c2879iu;
        } catch (Throwable th) {
            String strIntern = m7128(null, null, 127 - (ViewConfiguration.getTouchSlop() >> 8), "\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7138((byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0006\u0000\r\r\u0001\n\u0002\f\u0002\n\u0004\u0002\u0006\r\u0007\u0006\u0005\u0007\u0012R", MotionEvent.axisFromString("") + 28).intern());
            sb.append(th.getLocalizedMessage());
            C2921n.m7506(strIntern, sb.toString(), th);
            return null;
        }
    }

    /* renamed from: ｋ */
    private static byte[] m7134(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.flush();
                    gZIPOutputStream2.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    f6859 = (f6857 + 51) % 128;
                    return byteArray;
                } catch (Exception e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ﾇ */
    private static void m7136(Closeable closeable) {
        int i = f6857;
        int i2 = i + 51;
        f6859 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                throw null;
            }
            if (closeable != null) {
                int i3 = i + 7;
                f6859 = i3 % 128;
                if (i3 % 2 == 0) {
                    closeable.close();
                } else {
                    closeable.close();
                    throw null;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ */
    private static boolean m7137(String str) {
        f6859 = (f6857 + 97) % 128;
        if (str.length() <= 256) {
            return false;
        }
        f6857 = (f6859 + 21) % 128;
        return true;
    }

    /* renamed from: ｋ */
    private static String m7131(JSONObject jSONObject) throws NoSuchAlgorithmException, InvalidKeyException {
        String string = jSONObject.toString();
        String strM7344 = C2907jv.m7344(string);
        StringBuilder sbOooOo0O = OooOo.OooOo0O(string.substring(0, string.lastIndexOf(125)));
        sbOooOo0O.append(m7138((byte) (37 - View.resolveSizeAndState(0, 0, 0)), "$% \u0003#\u000fG", 7 - TextUtils.indexOf("", "", 0, 0)).intern());
        sbOooOo0O.append(strM7344);
        String strOooOO0O = AbstractC2183w4.OooOO0O(sbOooOo0O, m7138((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 25), "%&", ExpandableListView.getPackedPositionChild(0L) + 3));
        f6857 = (f6859 + 27) % 128;
        return strOooOO0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[PHI: r1
  0x0059: PHI (r1v4 byte[]) = (r1v2 byte[]), (r1v8 byte[]) binds: [B:20:0x0057, B:17:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m7129(java.net.HttpURLConnection r5, org.json.JSONObject r6) throws java.lang.Throwable {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2880iv.f6859
            int r0 = r0 + 25
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2880iv.f6857 = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\u0010\u0011\u0012\u0013\u0096"
            r2 = 0
            if (r0 != 0) goto L34
            java.lang.String r6 = m7131(r6)
            r0 = 1
            int r3 = android.graphics.Color.argb(r0, r2, r2, r2)
            int r3 = r3 + 64
            byte r3 = (byte) r3
            int r4 = android.os.Process.myTid()
            int r4 = r4 * 150
            java.lang.String r1 = m7138(r3, r1, r4)
            java.lang.String r1 = r1.intern()
            byte[] r1 = r6.getBytes(r1)
            boolean r6 = m7137(r6)
            if (r6 == r0) goto L59
            goto L97
        L34:
            java.lang.String r6 = m7131(r6)
            int r0 = android.graphics.Color.argb(r2, r2, r2, r2)
            int r0 = r0 + 94
            byte r0 = (byte) r0
            int r3 = android.os.Process.myTid()
            int r3 = r3 >> 22
            int r3 = 5 - r3
            java.lang.String r0 = m7138(r0, r1, r3)
            java.lang.String r0 = r0.intern()
            byte[] r1 = r6.getBytes(r0)
            boolean r6 = m7137(r6)
            if (r6 == 0) goto L97
        L59:
            int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2880iv.f6857
            int r6 = r6 + 27
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2880iv.f6859 = r6
            int r6 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r6 = r6 >> 16
            int r6 = r6 + 50
            byte r6 = (byte) r6
            r0 = 0
            float r3 = android.graphics.PointF.length(r0, r0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            int r3 = 16 - r3
            java.lang.String r4 = "\u0010\u0006\u0004\r\u0006\u0000\u0012\u0019\u0001\u0000\u0017\u0000\b\t\u0002\r"
            java.lang.String r6 = m7138(r6, r4, r3)
            java.lang.String r6 = r6.intern()
            float r2 = android.util.TypedValue.complexToFraction(r2, r0, r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            int r0 = r0 + 127
            java.lang.String r2 = "\u008a\u0085\u0089\u0088"
            r3 = 0
            java.lang.String r0 = m7128(r3, r3, r0, r2)
            java.lang.String r0 = r0.intern()
            r5.setRequestProperty(r6, r0)
            byte[] r1 = m7134(r1)
        L97:
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2880iv.f6859
            int r5 = r5 + 105
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2880iv.f6857 = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2880iv.m7129(java.net.HttpURLConnection, org.json.JSONObject):byte[]");
    }

    /* renamed from: ﻐ */
    private static String m7128(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2922o.f7244) {
            try {
                char[] cArr2 = f6861;
                int i2 = f6862;
                if (f6860) {
                    int length = bArr.length;
                    C2922o.f7245 = length;
                    char[] cArr3 = new char[length];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i3 = C2922o.f7246;
                        int i4 = C2922o.f7245 - 1;
                        int i5 = C2922o.f7246;
                        cArr3[i3] = (char) (cArr2[bArr[i4 - i5] + i] - i2);
                        C2922o.f7246 = i5 + 1;
                    }
                    return new String(cArr3);
                }
                if (f6864) {
                    int length2 = cArr.length;
                    C2922o.f7245 = length2;
                    char[] cArr4 = new char[length2];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i6 = C2922o.f7246;
                        int i7 = C2922o.f7245 - 1;
                        int i8 = C2922o.f7246;
                        cArr4[i6] = (char) (cArr2[cArr[i7 - i8] - i] - i2);
                        C2922o.f7246 = i8 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                C2922o.f7245 = length3;
                char[] cArr5 = new char[length3];
                C2922o.f7246 = 0;
                while (C2922o.f7246 < C2922o.f7245) {
                    int i9 = C2922o.f7246;
                    int i10 = C2922o.f7245 - 1;
                    int i11 = C2922o.f7246;
                    cArr5[i9] = (char) (cArr2[iArr[i10 - i11] - i] - i2);
                    C2922o.f7246 = i11 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
