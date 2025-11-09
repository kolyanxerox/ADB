package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.AnyThread;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ae */
/* loaded from: classes2.dex */
public final class C2647ae extends C2903jr {

    /* renamed from: ﮐ */
    private static int f4483 = 0;

    /* renamed from: ﺙ */
    private static int f4485 = 1;

    /* renamed from: ﻐ */
    private int f4487;

    /* renamed from: ﻛ */
    private int f4488;

    /* renamed from: ｋ */
    private int f4489;

    /* renamed from: ﾇ */
    private Handler f4490;

    /* renamed from: ﾒ */
    private String f4491;

    /* renamed from: ﱡ */
    private static char[] f4484 = {'0', 'j', 'q', 'p', 'Y', 'W', 'g', 'f', 'r', 'v', 'n', 'f', 'k', '\\', ']', 'm', 'i', 'q', ']', 'V', 'i', 'i', 'k', 'h', 208, 208, 127, 254, 247, 'w', 239, 234, 225, 'R', 168, 175, 171, '7', 'G', 'B', 'm', 'm', 'i', 'q', 'l', 'k', 'r', 'p', 'p', 'I', '@', 'b', 'd', 'f', 'k', 'j', 'C', 'F', 'f', 'j', 's', 'q', 'r', 'l', 'e', 'D', 'J'};

    /* renamed from: ﻏ */
    private static int[] f4486 = {-1775547570, 1813934593, 1637258599, -904922357, 84575895, -302187843, 281493292, -1462392017, 401982253, 1694198887, 172949857, -1996040061, -658238262, -685119123, 235142022, 1371329026, 203992488, 14372833};

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ae$2 */
    public class AnonymousClass2 extends AbstractRunnableC2878it {

        /* renamed from: ﭖ */
        private static short[] f4492 = null;

        /* renamed from: ﭸ */
        private static int f4493 = 1;

        /* renamed from: ﮉ */
        private static int f4494 = 0;

        /* renamed from: ﮐ */
        private static int f4495 = 119;

        /* renamed from: ﱟ */
        private static int f4496 = 1481966248;

        /* renamed from: ﱡ */
        private static int f4497 = -272795983;

        /* renamed from: ﺙ */
        private static byte[] f4498 = {66, 81, -83, 65, 84, -84, 64, 78, -78, 84, -81, -68, 111, -101, 100, -113, 104, 98, -97, -99, 98, 98, -113, -98, -114, -122, 120, -118, 122, -124, -117, 110, 125, 0, 0, 0, 0, 0, 0};

        /* renamed from: ﻐ */
        final /* synthetic */ b f4500;

        /* renamed from: ﻛ */
        private /* synthetic */ JSONObject f4501;

        /* renamed from: ｋ */
        private /* synthetic */ JSONObject f4502;

        /* renamed from: ﾇ */
        private /* synthetic */ boolean f4503;

        /* renamed from: ﾒ */
        private /* synthetic */ String f4504;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.ae$2$2 */
        public class C45572 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ JSONObject f4505;

            public C45572(JSONObject jSONObject) {
                jSONObject = jSONObject;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                bVar.onEventGenerated(jSONObject);
            }
        }

        public AnonymousClass2(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, b bVar) {
            str = str;
            jSONObject = jSONObject;
            jSONObject = jSONObject2;
            z = z;
            bVar = bVar;
        }

        /* renamed from: ｋ */
        private static String m4962(byte b, short s, int i, int i2, int i3) {
            String string;
            synchronized (C2912k.f7200) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i4 = f4495;
                    int i5 = i + i4;
                    int i6 = i5 == -1 ? 1 : 0;
                    if (i6 != 0) {
                        byte[] bArr = f4498;
                        i5 = bArr != null ? (byte) (bArr[f4497 + i2] + i4) : (short) (f4492[f4497 + i2] + i4);
                    }
                    if (i5 > 0) {
                        C2912k.f7203 = ((i2 + i5) - 2) + f4497 + i6;
                        C2912k.f7201 = b;
                        char c = (char) (i3 + f4496);
                        C2912k.f7204 = c;
                        sb.append(c);
                        C2912k.f7202 = C2912k.f7204;
                        C2912k.f7205 = 1;
                        while (C2912k.f7205 < i5) {
                            byte[] bArr2 = f4498;
                            if (bArr2 != null) {
                                int i7 = C2912k.f7203;
                                C2912k.f7203 = i7 - 1;
                                C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                            } else {
                                short[] sArr = f4492;
                                int i8 = C2912k.f7203;
                                C2912k.f7203 = i8 - 1;
                                C2912k.f7204 = (char) (C2912k.f7202 + (((short) (sArr[i8] + s)) ^ C2912k.f7201));
                            }
                            sb.append(C2912k.f7204);
                            C2912k.f7202 = C2912k.f7204;
                            C2912k.f7205++;
                        }
                    }
                    string = sb.toString();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return string;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() throws Exception {
            f4494 = (f4493 + 5) % 128;
            if (str.equals(m4962((byte) (64 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) - 106, TextUtils.lastIndexOf("", '0') + 272795984, (-1481966133) - MotionEvent.axisFromString("")).intern())) {
                C2647ae.m4952(C2647ae.this);
            }
            int iM4955 = C2647ae.m4955(C2647ae.this);
            C2647ae.m4957(C2647ae.this);
            JSONObject jSONObjectM7441 = C2915kc.m7441(jSONObject);
            jSONObjectM7441.put(m4962((byte) (ImageFormat.getBitsPerPixel(0) - 104), (short) View.resolveSizeAndState(0, 0, 0), (-115) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 272795995 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) - 1481966138).intern(), str);
            jSONObjectM7441.put(m4962((byte) ((KeyEvent.getMaxKeyCode() >> 16) - 122), (short) ((-1) - MotionEvent.axisFromString("")), View.resolveSize(0, 0) - 117, 272795998 - Color.blue(0), TextUtils.indexOf("", "", 0, 0) - 1481966147).intern(), iM4955);
            String strIntern = m4962((byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 96), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 111, 272795998 - ExpandableListView.getPackedPositionChild(0L), (-1498743348) - Color.rgb(0, 0, 0)).intern();
            JSONObject jSONObject = jSONObject;
            if (jSONObject != null) {
                f4493 = (f4494 + 89) % 128;
                strIntern = jSONObject.optString(C2869ik.f6838);
                String str = C2869ik.f6793;
                jSONObjectM7441.put(str, jSONObject.optString(str, null));
            }
            if (TextUtils.isEmpty(strIntern)) {
                strIntern = m4962((byte) (TextUtils.getOffsetAfter("", 0) + 121), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getOffsetAfter("", 0) - 115, 272796007 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) - 1481966137).intern();
            }
            jSONObjectM7441.put(C2869ik.f6839, strIntern);
            if (!jSONObjectM7441.has(C2869ik.f6840)) {
                jSONObjectM7441.put(C2869ik.f6840, strIntern);
                f4493 = (f4494 + 93) % 128;
            }
            C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.2.2

                /* renamed from: ﻐ */
                private /* synthetic */ JSONObject f4505;

                public C45572(JSONObject jSONObject2) {
                    jSONObject = jSONObject2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    bVar.onEventGenerated(jSONObject);
                }
            });
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ae$b */
    public interface b {
        void onEventGenerated(JSONObject jSONObject);
    }

    public C2647ae(Context context, C2657ao c2657ao, int i, String str, long j) {
        super(context, c2657ao, j);
        this.f4488 = i;
        this.f4487 = 0;
        this.f4489 = 1;
        this.f4491 = str;
        HandlerThread handlerThread = new HandlerThread(m4954(false, new int[]{0, 23, 0, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern());
        handlerThread.start();
        this.f4490 = new Handler(handlerThread.getLooper());
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ int m4952(C2647ae c2647ae) {
        int i;
        int i2;
        int i3 = f4483;
        int i4 = i3 + 27;
        f4485 = i4 % 128;
        if (i4 % 2 == 0) {
            i = c2647ae.f4487;
            i2 = i % 0;
        } else {
            i = c2647ae.f4487;
            i2 = i + 1;
        }
        c2647ae.f4487 = i2;
        int i5 = i3 + InterfaceC3173h3.d.b.f8821d;
        f4485 = i5 % 128;
        if (i5 % 2 != 0) {
            return i;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private int m4953() {
        int i = this.f4487;
        if (i != 0) {
            return i;
        }
        f4485 = (f4483 + 27) % 128;
        return 1;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ int m4955(C2647ae c2647ae) {
        int i = (f4483 + 77) % 128;
        f4485 = i;
        int i2 = c2647ae.f4489;
        f4483 = (i + 69) % 128;
        return i2;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ int m4957(C2647ae c2647ae) {
        int i = f4485 + 7;
        f4483 = i % 128;
        if (i % 2 != 0) {
            int i2 = c2647ae.f4489;
            c2647ae.f4489 = i2;
            return i2;
        }
        int i3 = c2647ae.f4489;
        c2647ae.f4489 = i3 + 1;
        return i3;
    }

    /* renamed from: ﾒ */
    private static String m4958(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f4486.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        C2723d.f5954 = (c << 16) + c2;
                        C2723d.f5952 = (c3 << 16) + c4;
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
    public final synchronized void m4961(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, b bVar) throws Throwable {
        try {
            try {
                this.f4490.post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.2

                    /* renamed from: ﭖ */
                    private static short[] f4492 = null;

                    /* renamed from: ﭸ */
                    private static int f4493 = 1;

                    /* renamed from: ﮉ */
                    private static int f4494 = 0;

                    /* renamed from: ﮐ */
                    private static int f4495 = 119;

                    /* renamed from: ﱟ */
                    private static int f4496 = 1481966248;

                    /* renamed from: ﱡ */
                    private static int f4497 = -272795983;

                    /* renamed from: ﺙ */
                    private static byte[] f4498 = {66, 81, -83, 65, 84, -84, 64, 78, -78, 84, -81, -68, 111, -101, 100, -113, 104, 98, -97, -99, 98, 98, -113, -98, -114, -122, 120, -118, 122, -124, -117, 110, 125, 0, 0, 0, 0, 0, 0};

                    /* renamed from: ﻐ */
                    final /* synthetic */ b f4500;

                    /* renamed from: ﻛ */
                    private /* synthetic */ JSONObject f4501;

                    /* renamed from: ｋ */
                    private /* synthetic */ JSONObject f4502;

                    /* renamed from: ﾇ */
                    private /* synthetic */ boolean f4503;

                    /* renamed from: ﾒ */
                    private /* synthetic */ String f4504;

                    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ae$2$2 */
                    public class C45572 extends AbstractRunnableC2878it {

                        /* renamed from: ﻐ */
                        private /* synthetic */ JSONObject f4505;

                        public C45572(JSONObject jSONObject2) {
                            jSONObject = jSONObject2;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            bVar.onEventGenerated(jSONObject);
                        }
                    }

                    public AnonymousClass2(String str2, JSONObject jSONObject3, JSONObject jSONObject22, boolean z2, b bVar2) {
                        str = str2;
                        jSONObject = jSONObject3;
                        jSONObject = jSONObject22;
                        z = z2;
                        bVar = bVar2;
                    }

                    /* renamed from: ｋ */
                    private static String m4962(byte b2, short s, int i, int i2, int i3) {
                        String string;
                        synchronized (C2912k.f7200) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                int i4 = f4495;
                                int i5 = i + i4;
                                int i6 = i5 == -1 ? 1 : 0;
                                if (i6 != 0) {
                                    byte[] bArr = f4498;
                                    i5 = bArr != null ? (byte) (bArr[f4497 + i2] + i4) : (short) (f4492[f4497 + i2] + i4);
                                }
                                if (i5 > 0) {
                                    C2912k.f7203 = ((i2 + i5) - 2) + f4497 + i6;
                                    C2912k.f7201 = b2;
                                    char c = (char) (i3 + f4496);
                                    C2912k.f7204 = c;
                                    sb.append(c);
                                    C2912k.f7202 = C2912k.f7204;
                                    C2912k.f7205 = 1;
                                    while (C2912k.f7205 < i5) {
                                        byte[] bArr2 = f4498;
                                        if (bArr2 != null) {
                                            int i7 = C2912k.f7203;
                                            C2912k.f7203 = i7 - 1;
                                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                                        } else {
                                            short[] sArr = f4492;
                                            int i8 = C2912k.f7203;
                                            C2912k.f7203 = i8 - 1;
                                            C2912k.f7204 = (char) (C2912k.f7202 + (((short) (sArr[i8] + s)) ^ C2912k.f7201));
                                        }
                                        sb.append(C2912k.f7204);
                                        C2912k.f7202 = C2912k.f7204;
                                        C2912k.f7205++;
                                    }
                                }
                                string = sb.toString();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return string;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() throws Exception {
                        f4494 = (f4493 + 5) % 128;
                        if (str.equals(m4962((byte) (64 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) - 106, TextUtils.lastIndexOf("", '0') + 272795984, (-1481966133) - MotionEvent.axisFromString("")).intern())) {
                            C2647ae.m4952(C2647ae.this);
                        }
                        int iM4955 = C2647ae.m4955(C2647ae.this);
                        C2647ae.m4957(C2647ae.this);
                        JSONObject jSONObjectM7441 = C2915kc.m7441(jSONObject);
                        jSONObjectM7441.put(m4962((byte) (ImageFormat.getBitsPerPixel(0) - 104), (short) View.resolveSizeAndState(0, 0, 0), (-115) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 272795995 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) - 1481966138).intern(), str);
                        jSONObjectM7441.put(m4962((byte) ((KeyEvent.getMaxKeyCode() >> 16) - 122), (short) ((-1) - MotionEvent.axisFromString("")), View.resolveSize(0, 0) - 117, 272795998 - Color.blue(0), TextUtils.indexOf("", "", 0, 0) - 1481966147).intern(), iM4955);
                        String strIntern = m4962((byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 96), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 111, 272795998 - ExpandableListView.getPackedPositionChild(0L), (-1498743348) - Color.rgb(0, 0, 0)).intern();
                        JSONObject jSONObject3 = jSONObject;
                        if (jSONObject3 != null) {
                            f4493 = (f4494 + 89) % 128;
                            strIntern = jSONObject3.optString(C2869ik.f6838);
                            String str2 = C2869ik.f6793;
                            jSONObjectM7441.put(str2, jSONObject.optString(str2, null));
                        }
                        if (TextUtils.isEmpty(strIntern)) {
                            strIntern = m4962((byte) (TextUtils.getOffsetAfter("", 0) + 121), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getOffsetAfter("", 0) - 115, 272796007 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) - 1481966137).intern();
                        }
                        jSONObjectM7441.put(C2869ik.f6839, strIntern);
                        if (!jSONObjectM7441.has(C2869ik.f6840)) {
                            jSONObjectM7441.put(C2869ik.f6840, strIntern);
                            f4493 = (f4494 + 93) % 128;
                        }
                        C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.2.2

                            /* renamed from: ﻐ */
                            private /* synthetic */ JSONObject f4505;

                            public C45572(JSONObject jSONObject22) {
                                jSONObject = jSONObject22;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                            /* renamed from: ﾒ */
                            public final void mo4950() {
                                bVar.onEventGenerated(jSONObject);
                            }
                        });
                    }
                });
                f4485 = (f4483 + 89) % 128;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* renamed from: ｋ */
    private synchronized void m4956(JSONObject jSONObject) {
        f4483 = (f4485 + 79) % 128;
        C2865ig c2865igM7263 = C2892jg.m7250().m7263();
        try {
            jSONObject.put(m4958(new int[]{1881426697, -1246825777, 1152286980, -2120030735, 1584954684, 1092498528}, 9 - KeyEvent.keyCodeFromString("")).intern(), C2915kc.m7440(c2865igM7263.m7087(), c2865igM7263.m7084(), c2865igM7263.m7086(), c2865igM7263.m7085()));
            f4485 = (f4483 + 79) % 128;
        } catch (JSONException e) {
            C2921n.m7506(m4954(false, new int[]{0, 23, 0, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern(), m4954(false, new int[]{37, 30, 0, 7}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000").intern(), e);
        }
    }

    /* renamed from: ﻛ */
    public final void m4960(JSONArray jSONArray, boolean z, b bVar) {
        this.f4490.post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.5

            /* renamed from: ﮐ */
            private static int f4507 = 1;

            /* renamed from: ﱟ */
            private static boolean f4508 = true;

            /* renamed from: ﱡ */
            private static int f4509 = 248;

            /* renamed from: ﺙ */
            private static boolean f4510 = true;

            /* renamed from: ﻏ */
            private static int f4511;

            /* renamed from: ﾇ */
            private static char[] f4512 = {349, 366, 358, 364, 363, 313, 345, 356, 369, 353, 347, 317, 319, 362, 359, 280, 351, 325};

            /* renamed from: ﻛ */
            private /* synthetic */ boolean f4514;

            /* renamed from: ｋ */
            private /* synthetic */ JSONArray f4515;

            /* renamed from: ﾒ */
            final /* synthetic */ b f4516;

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.ae$5$1 */
            public class AnonymousClass1 extends AbstractRunnableC2878it {

                /* renamed from: ﾇ */
                private /* synthetic */ JSONObject f4518;

                public AnonymousClass1(JSONObject jSONObject) {
                    jSONObject = jSONObject;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    bVar.onEventGenerated(jSONObject);
                }
            }

            public AnonymousClass5(boolean z2, JSONArray jSONArray2, b bVar2) {
                z = z2;
                jSONArray = jSONArray2;
                bVar = bVar2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() throws Exception {
                f4511 = (f4507 + 33) % 128;
                JSONObject jSONObjectMo4959 = C2647ae.this.mo4959(null, z, false, false);
                try {
                    jSONObjectMo4959.put(m4963(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0085\u0084\u0083\u0081\u0082\u0081").intern(), jSONArray);
                } catch (JSONException e) {
                    C2921n.m7506(m4963(null, null, 127 - KeyEvent.keyCodeFromString(""), "\u008e\u008f\u0084\u0087\u008e\u0081\u0083\u0081\u008d\u0084\u0083\u0081\u0082\u008c\u0085\u008b\u008a\u0084\u0089\u0088\u0087\u0083\u0086").intern(), m4963(null, null, Color.argb(0, 0, 0, 0) + 127, "\u0087\u0084\u0081\u0092\u0084\u0083\u0081\u0082\u0081\u0090\u0091\u0083\u008a\u0084\u0087\u0081\u008e\u008b\u0090\u008e\u008f\u008e\u008e\u008c").intern(), e);
                }
                C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.5.1

                    /* renamed from: ﾇ */
                    private /* synthetic */ JSONObject f4518;

                    public AnonymousClass1(JSONObject jSONObjectMo49592) {
                        jSONObject = jSONObjectMo49592;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        bVar.onEventGenerated(jSONObject);
                    }
                });
                f4507 = (f4511 + 119) % 128;
            }

            /* renamed from: ﾒ */
            private static String m4963(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                        char[] cArr2 = f4512;
                        int i2 = f4509;
                        if (f4510) {
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
                        if (f4508) {
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
        });
        int i = f4485 + InterfaceC3173h3.d.b.f8819b;
        f4483 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2903jr
    @AnyThread
    /* renamed from: ﻛ */
    public final JSONObject mo4959(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        long jM7340;
        long jM7339;
        long j;
        synchronized (this) {
            jM7340 = C2906ju.m7340();
            jM7339 = C2906ju.m7339();
        }
        JSONObject jSONObjectMo4959 = super.mo4959(jSONObject, z, z2, z3);
        try {
            long jOptLong = jSONObjectMo4959.optLong(C2869ik.f6832);
            jSONObjectMo4959.remove(C2869ik.f6832);
            if (jOptLong == 0) {
                j = 0;
            } else {
                long j2 = jM7339 - (jM7340 - jOptLong);
                j = 0;
                try {
                    jSONObjectMo4959.put(m4954(true, new int[]{23, 3, 93, 0}, "\u0000\u0001\u0001").intern(), jM7340);
                    jSONObjectMo4959.put(m4958(new int[]{-688261995, -2133399678}, 3 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), jM7339);
                    jM7340 = jOptLong;
                    jM7339 = j2;
                } catch (JSONException e) {
                    e = e;
                    C2921n.m7506(m4954(false, new int[]{0, 23, 0, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern(), m4958(new int[]{-1048044710, -315042332, 1867122777, -1528357297, -2052038045, -991913034, -1752676282, -1434972918, -1506674057, -588642044, -1623435471, 1955719307}, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 24).intern(), e);
                    return jSONObjectMo4959;
                }
            }
            jSONObjectMo4959.put(m4954(true, new int[]{26, 3, 139, 3}, "\u0000\u0001\u0000").intern(), jM7340);
            jSONObjectMo4959.put(m4958(new int[]{-453316355, -1513630756}, TextUtils.lastIndexOf("", '0', 0) + 3).intern(), jM7339);
            jSONObjectMo4959.put(m4954(false, new int[]{29, 4, 123, 0}, "\u0000\u0000\u0000\u0001").intern(), this.f4491);
            jSONObjectMo4959.put(m4958(new int[]{780141435, -1976720724}, 2 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), this.f4488);
            jSONObjectMo4959.put(m4958(new int[]{1092876006, 914032371}, 3 - TextUtils.indexOf("", "", 0)).intern(), m4953());
            if (AbstractC2661as.m5141().mo5143()) {
                jSONObjectMo4959.put(m4954(true, new int[]{33, 4, 64, 0}, "\u0000\u0000\u0001\u0000").intern(), true);
            }
            C2658ap c2658apMo5153 = AbstractC2661as.m5141().mo5153();
            if (c2658apMo5153 != null) {
                String strM5126 = c2658apMo5153.m5126();
                if (!TextUtils.isEmpty(strM5126)) {
                    jSONObjectMo4959.put(m4958(new int[]{-416082115, -1912498526}, 2 - TextUtils.lastIndexOf("", '0', 0)).intern(), strM5126);
                }
            }
            if (z2) {
                m4956(jSONObjectMo4959);
                return jSONObjectMo4959;
            }
        } catch (JSONException e2) {
            e = e2;
            j = 0;
        }
        return jSONObjectMo4959;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ae$5 */
    public class AnonymousClass5 extends AbstractRunnableC2878it {

        /* renamed from: ﮐ */
        private static int f4507 = 1;

        /* renamed from: ﱟ */
        private static boolean f4508 = true;

        /* renamed from: ﱡ */
        private static int f4509 = 248;

        /* renamed from: ﺙ */
        private static boolean f4510 = true;

        /* renamed from: ﻏ */
        private static int f4511;

        /* renamed from: ﾇ */
        private static char[] f4512 = {349, 366, 358, 364, 363, 313, 345, 356, 369, 353, 347, 317, 319, 362, 359, 280, 351, 325};

        /* renamed from: ﻛ */
        private /* synthetic */ boolean f4514;

        /* renamed from: ｋ */
        private /* synthetic */ JSONArray f4515;

        /* renamed from: ﾒ */
        final /* synthetic */ b f4516;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.ae$5$1 */
        public class AnonymousClass1 extends AbstractRunnableC2878it {

            /* renamed from: ﾇ */
            private /* synthetic */ JSONObject f4518;

            public AnonymousClass1(JSONObject jSONObjectMo49592) {
                jSONObject = jSONObjectMo49592;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                bVar.onEventGenerated(jSONObject);
            }
        }

        public AnonymousClass5(boolean z2, JSONArray jSONArray2, b bVar2) {
            z = z2;
            jSONArray = jSONArray2;
            bVar = bVar2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() throws Exception {
            f4511 = (f4507 + 33) % 128;
            JSONObject jSONObjectMo49592 = C2647ae.this.mo4959(null, z, false, false);
            try {
                jSONObjectMo49592.put(m4963(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0085\u0084\u0083\u0081\u0082\u0081").intern(), jSONArray);
            } catch (JSONException e) {
                C2921n.m7506(m4963(null, null, 127 - KeyEvent.keyCodeFromString(""), "\u008e\u008f\u0084\u0087\u008e\u0081\u0083\u0081\u008d\u0084\u0083\u0081\u0082\u008c\u0085\u008b\u008a\u0084\u0089\u0088\u0087\u0083\u0086").intern(), m4963(null, null, Color.argb(0, 0, 0, 0) + 127, "\u0087\u0084\u0081\u0092\u0084\u0083\u0081\u0082\u0081\u0090\u0091\u0083\u008a\u0084\u0087\u0081\u008e\u008b\u0090\u008e\u008f\u008e\u008e\u008c").intern(), e);
            }
            C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.5.1

                /* renamed from: ﾇ */
                private /* synthetic */ JSONObject f4518;

                public AnonymousClass1(JSONObject jSONObjectMo495922) {
                    jSONObject = jSONObjectMo495922;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    bVar.onEventGenerated(jSONObject);
                }
            });
            f4507 = (f4511 + 119) % 128;
        }

        /* renamed from: ﾒ */
        private static String m4963(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f4512;
                    int i2 = f4509;
                    if (f4510) {
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
                    if (f4508) {
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

    /* renamed from: ﻛ */
    private static String m4954(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f4484, i, cArr, 0, i2);
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
}
