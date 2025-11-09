package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ah */
/* loaded from: classes2.dex */
final class C2650ah {

    /* renamed from: ﭸ */
    private static int f4523 = 1;

    /* renamed from: ﮐ */
    private static char f4524 = 5;

    /* renamed from: ﱟ */
    private static int f4525;

    /* renamed from: ﱡ */
    private int f4528;

    /* renamed from: ﻐ */
    private long f4529;

    /* renamed from: ﻛ */
    private Boolean f4530 = null;

    /* renamed from: ｋ */
    private long f4531;

    /* renamed from: ﾇ */
    private long f4532;

    /* renamed from: ﾒ */
    private long f4533;

    /* renamed from: ﻏ */
    private static char[] f4527 = {'T', 'i', 'm', 'e', 's', 't', 'a', 'p', 'S', 'y', 'n', 'c', 'h', 'r', 'o', 'z', 'E', ' ', 'g', 'v', 'd', 'u', 'U', 'V', 'W'};

    /* renamed from: ﺙ */
    private static long f4526 = -5009144474268521418L;

    public C2650ah(int i) {
        this.f4528 = i;
        AbstractC2661as.m5141().mo5169(new InterfaceC2662at() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.5

            /* renamed from: ﻐ */
            private static int f4534 = 0;

            /* renamed from: ﾒ */
            private static int f4537 = 1;

            /* renamed from: ﾇ */
            private static char[] f4536 = {3172, 23914, 44603, 65484, 18575, 39355, 60259, 13368, 34264, 54952, 10167, 29039, 49719, 5071, 31880, 52642, 8046, 26682, 47580, 2716, 23486, 'E', 20801, 41492, 62454, 17598, 38367, 59227, 14347, 35256, 55980, 11163, 32069, 52752, 8190, 28836, 49562, 4880, 25616, 46579, 1723, 22410, 43338, 64016, 19381, 40124, 60818, 16195, 36868, 57831, 12979, 33691, 54592, 9744};

            /* renamed from: ﻛ */
            private static long f4535 = 2545255649113166131L;

            /* renamed from: ﻛ */
            private static String m4992(int i2, int i3, char c) {
                String str;
                synchronized (C2642a.f4435) {
                    try {
                        char[] cArr = new char[i2];
                        C2642a.f4436 = 0;
                        while (true) {
                            int i4 = C2642a.f4436;
                            if (i4 < i2) {
                                cArr[i4] = (char) ((f4536[i3 + i4] ^ (i4 * f4535)) ^ c);
                                C2642a.f4436 = i4 + 1;
                            } else {
                                str = new String(cArr);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[PHI: r0 r1
  0x0085: PHI (r0v9 com.ironsource.adqualitysdk.sdk.i.ar) = (r0v4 com.ironsource.adqualitysdk.sdk.i.ar), (r0v11 com.ironsource.adqualitysdk.sdk.i.ar) binds: [B:8:0x002f, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r1v9 long) = (r1v1 long), (r1v10 long) binds: [B:8:0x002f, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[PHI: r0
  0x0031: PHI (r0v5 com.ironsource.adqualitysdk.sdk.i.ar) = (r0v4 com.ironsource.adqualitysdk.sdk.i.ar), (r0v11 com.ironsource.adqualitysdk.sdk.i.ar) binds: [B:8:0x002f, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2662at
            /* renamed from: ﾒ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void mo4993() {
                /*
                    r8 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.AnonymousClass5.f4534
                    int r0 = r0 + 75
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.p009i.C2650ah.AnonymousClass5.f4537 = r1
                    int r0 = r0 % 2
                    if (r0 != 0) goto L1f
                    com.ironsource.adqualitysdk.sdk.i.as r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.m5141()
                    com.ironsource.adqualitysdk.sdk.i.ar r0 = r0.mo5155()
                    long r1 = r0.m5132()
                    r3 = 1
                    int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r3 != 0) goto L85
                    goto L31
                L1f:
                    com.ironsource.adqualitysdk.sdk.i.as r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.m5141()
                    com.ironsource.adqualitysdk.sdk.i.ar r0 = r0.mo5155()
                    long r1 = r0.m5132()
                    r3 = 0
                    int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r3 != 0) goto L85
                L31:
                    int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.AnonymousClass5.f4534
                    int r1 = r1 + 7
                    int r1 = r1 % 128
                    com.ironsource.adqualitysdk.sdk.p009i.C2650ah.AnonymousClass5.f4537 = r1
                    com.ironsource.adqualitysdk.sdk.i.ah r1 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.this
                    java.lang.Boolean r2 = java.lang.Boolean.FALSE
                    com.ironsource.adqualitysdk.sdk.p009i.C2650ah.m4982(r1, r2)
                    long r1 = r0.m5134()
                    r3 = 0
                    r4 = 0
                    float r5 = android.util.TypedValue.complexToFraction(r3, r4, r4)
                    int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                    int r5 = 21 - r5
                    int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
                    int r7 = android.view.View.MeasureSpec.getMode(r3)
                    int r7 = r7 + 3120
                    char r7 = (char) r7
                    java.lang.String r5 = m4992(r5, r6, r7)
                    java.lang.String r5 = r5.intern()
                    int r6 = android.view.ViewConfiguration.getMinimumFlingVelocity()
                    int r6 = r6 >> 16
                    int r6 = r6 + 33
                    float r7 = android.graphics.PointF.length(r4, r4)
                    int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                    int r4 = 21 - r4
                    int r7 = android.view.ViewConfiguration.getDoubleTapTimeout()
                    int r7 = r7 >> 16
                    char r7 = (char) r7
                    java.lang.String r4 = m4992(r6, r4, r7)
                    java.lang.String r4 = r4.intern()
                    r6 = 0
                    com.ironsource.adqualitysdk.sdk.p009i.C2914kb.m7426(r5, r4, r6, r3)
                    goto L8c
                L85:
                    com.ironsource.adqualitysdk.sdk.i.ah r3 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.this
                    java.lang.Boolean r4 = java.lang.Boolean.TRUE
                    com.ironsource.adqualitysdk.sdk.p009i.C2650ah.m4982(r3, r4)
                L8c:
                    com.ironsource.adqualitysdk.sdk.i.ah r3 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.this
                    long r4 = r0.m5131()
                    com.ironsource.adqualitysdk.sdk.p009i.C2650ah.m4979(r3, r4)
                    com.ironsource.adqualitysdk.sdk.i.ah r3 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.this
                    long r4 = r0.m5134()
                    com.ironsource.adqualitysdk.sdk.p009i.C2650ah.m4988(r3, r4)
                    com.ironsource.adqualitysdk.sdk.i.ah r0 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.this
                    long r3 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.m4983(r0)
                    long r3 = r1 - r3
                    com.ironsource.adqualitysdk.sdk.p009i.C2650ah.m4984(r0, r3)
                    com.ironsource.adqualitysdk.sdk.i.ah r0 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.this
                    long r3 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.m4987(r0)
                    long r1 = r1 - r3
                    com.ironsource.adqualitysdk.sdk.p009i.C2650ah.m4981(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2650ah.AnonymousClass5.mo4993():void");
            }
        });
    }

    /* renamed from: ﻐ */
    private static boolean m4978(JSONObject jSONObject) {
        if (!jSONObject.has(m4985("욉웼藙ꦛ䄌ᤏㅎ", TextUtils.indexOf((CharSequence) "", '0') + 1).intern())) {
            f4523 = (f4525 + 31) % 128;
            if (!jSONObject.has(m4985("ꙍ\ua639ﬁ흄\u206a硩ᠧ", View.MeasureSpec.getMode(0)).intern())) {
                f4525 = (f4523 + 1) % 128;
                return false;
            }
        }
        return true;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ long m4979(C2650ah c2650ah, long j) {
        int i = (f4525 + 37) % 128;
        f4523 = i;
        c2650ah.f4533 = j;
        int i2 = i + 71;
        f4525 = i2 % 128;
        if (i2 % 2 == 0) {
            return j;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ long m4981(C2650ah c2650ah, long j) {
        int i = f4525;
        f4523 = (i + 33) % 128;
        c2650ah.f4532 = j;
        f4523 = (i + 9) % 128;
        return j;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ long m4983(C2650ah c2650ah) {
        int i = (f4525 + 45) % 128;
        f4523 = i;
        long j = c2650ah.f4533;
        int i2 = i + 59;
        f4525 = i2 % 128;
        if (i2 % 2 == 0) {
            return j;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ long m4987(C2650ah c2650ah) {
        int i = (f4525 + 31) % 128;
        f4523 = i;
        long j = c2650ah.f4531;
        f4525 = (i + 97) % 128;
        return j;
    }

    /* renamed from: ﻛ */
    private void m4980(JSONObject jSONObject) throws JSONException {
        boolean z;
        long jOptLong;
        f4523 = (f4525 + 123) % 128;
        try {
            if (jSONObject.optInt(m4977((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 58), "\u0000\u0002\u009e", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2).intern(), 1) == this.f4528 || m4990(jSONObject)) {
                long jOptLong2 = jSONObject.optLong(m4977((byte) (27 - ExpandableListView.getPackedPositionType(0L)), "\u0014\u0006", View.getDefaultSize(0, 0) + 2).intern()) + this.f4529;
                jSONObject.put(m4985("욉웼藙ꦛ䄌ᤏㅎ", View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), this.f4529);
                z = true;
                jOptLong = jOptLong2;
            } else {
                jOptLong = jSONObject.optLong(m4977((byte) (ExpandableListView.getPackedPositionGroup(0L) + 32), "\u0000\n\u0093", 4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) + this.f4532;
                jSONObject.put(m4985("ꙍ\ua639ﬁ흄\u206a硩ᠧ", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern(), this.f4532);
                z = false;
            }
            jSONObject.put(C2869ik.f6832, jOptLong);
            if (!this.f4530.booleanValue()) {
                f4525 = (f4523 + 69) % 128;
                jSONObject.put(m4977((byte) (47 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\t\u0000¡", 3 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), false);
            }
            m4989(jSONObject, z);
            m4986(jSONObject, z);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ Boolean m4982(C2650ah c2650ah, Boolean bool) {
        int i = f4523;
        f4525 = (i + 85) % 128;
        c2650ah.f4530 = bool;
        f4525 = (i + 119) % 128;
        return bool;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ long m4984(C2650ah c2650ah, long j) {
        int i = f4523;
        f4525 = (i + 23) % 128;
        c2650ah.f4529 = j;
        f4525 = (i + 109) % 128;
        return j;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ long m4988(C2650ah c2650ah, long j) {
        int i = f4525 + 49;
        f4523 = i % 128;
        int i2 = i % 2;
        c2650ah.f4531 = j;
        if (i2 != 0) {
            return j;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private void m4989(JSONObject jSONObject, boolean z) throws JSONException {
        long jOptLong;
        long j;
        long jOptLong2;
        f4525 = (f4523 + 123) % 128;
        if (!jSONObject.has(m4977((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 106), "\u0000\tÝ", KeyEvent.keyCodeFromString("") + 3).intern())) {
            return;
        }
        try {
            if (z) {
                int i = f4523 + 37;
                f4525 = i % 128;
                if (i % 2 != 0) {
                    jOptLong2 = jSONObject.optLong(m4985("溜滯훶蝹쌇鬟뻅", Color.alpha(1)).intern()) % this.f4529;
                    jSONObject.put(m4977((byte) (106 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u0000\tÝ", Color.red(0) + 3).intern(), jOptLong2);
                    return;
                } else {
                    jOptLong = jSONObject.optLong(m4985("溜滯훶蝹쌇鬟뻅", Color.alpha(0)).intern());
                    j = this.f4529;
                }
            } else {
                jOptLong = jSONObject.optLong(m4977((byte) (View.resolveSize(0, 0) + 106), "\u0000\tÝ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3).intern());
                j = this.f4532;
            }
            jSONObject.put(m4977((byte) (106 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u0000\tÝ", Color.red(0) + 3).intern(), jOptLong2);
            return;
        } catch (JSONException unused) {
            return;
        }
        jOptLong2 = jOptLong + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4991(org.json.JSONObject r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.f4525
            int r0 = r0 + 13
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2650ah.f4523 = r0
            boolean r0 = m4978(r6)
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L76
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.f4525
            int r0 = r0 + 81
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2650ah.f4523 = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L24
            java.lang.Boolean r0 = r5.f4530
            r3 = 44
            int r3 = r3 / r2
            if (r0 == 0) goto L76
            goto L28
        L24:
            java.lang.Boolean r0 = r5.f4530
            if (r0 == 0) goto L76
        L28:
            r5.m4980(r6)     // Catch: java.lang.Exception -> L3b
            int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2650ah.f4523
            int r6 = r6 + 53
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2650ah.f4525 = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L3a
            r6 = 95
            int r6 = r6 / r2
        L3a:
            return r1
        L3b:
            r6 = move-exception
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            int r0 = 33 - r0
            byte r0 = (byte) r0
            float r3 = android.media.AudioTrack.getMinVolume()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r1 = r1 + 21
            java.lang.String r3 = "\u0001\u0002\u0003\u0004\u0000\t\u0007\u0001\b\t\u0005\u000e\f\r\u000e\n\u000b\u0000\u0012\u0000\u0092"
            java.lang.String r0 = m4977(r0, r3, r1)
            java.lang.String r0 = r0.intern()
            int r1 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r1 = r1 >> 16
            int r1 = r1 + 116
            byte r1 = (byte) r1
            java.lang.String r3 = ""
            int r3 = android.view.KeyEvent.keyCodeFromString(r3)
            int r3 = 25 - r3
            java.lang.String r4 = "\u0012\u000b\u000e\n\f\u0012\t\u000e\u000b\f\r\u000e\n\u000b\u0000\u0010\u0000\u000b\u0013\u0012\u0004\u0012\u0000\rè"
            java.lang.String r1 = m4977(r1, r4, r3)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2914kb.m7426(r0, r1, r6, r2)
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2650ah.m4991(org.json.JSONObject):boolean");
    }

    /* renamed from: ﻐ */
    private static String m4977(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f4527;
                char c = f4524;
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

    /* renamed from: ﾒ */
    private boolean m4990(JSONObject jSONObject) {
        f4525 = (f4523 + 99) % 128;
        if (Math.abs((this.f4531 - this.f4533) - (jSONObject.optLong(m4977((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32), "\u0000\n\u0093", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4).intern()) - jSONObject.optLong(m4977((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27), "\u0014\u0006", TextUtils.indexOf((CharSequence) "", '0') + 3).intern()))) > 10) {
            return false;
        }
        int i = f4523 + 55;
        f4525 = i % 128;
        return i % 2 == 0;
    }

    /* renamed from: ﾇ */
    private void m4986(JSONObject jSONObject, boolean z) throws JSONException {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(m4985("ἶ\u1f5a⃰ಧ\uf3c1\ue85dꯞ沋꾺퇆ꋯ妒绮", ViewConfiguration.getJumpTapTimeout() >> 16).intern());
            if (jSONObjectOptJSONObject != null) {
                Long lValueOf = null;
                if (!z) {
                    long jOptLong = jSONObjectOptJSONObject.optLong(m4985("嶛巯梠夣跡", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                    if (jOptLong > 0) {
                        int i = f4523 + 75;
                        f4525 = i % 128;
                        lValueOf = i % 2 != 0 ? Long.valueOf(jOptLong / this.f4532) : Long.valueOf(jOptLong + this.f4532);
                    }
                } else {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong(m4977((byte) (16 - KeyEvent.getDeadChar(0, 0)), "\u0085", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
                    if (jOptLong2 > 0) {
                        lValueOf = Long.valueOf(jOptLong2 + this.f4529);
                    }
                }
                if (lValueOf != null) {
                    int i2 = f4523 + 93;
                    f4525 = i2 % 128;
                    jSONObjectOptJSONObject.put((i2 % 2 != 0 ? m4985("嶛巯梠夣跡", ViewConfiguration.getScrollBarSize() << 59) : m4985("嶛巯梠夣跡", ViewConfiguration.getScrollBarSize() >> 8)).intern(), lValueOf);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﾇ */
    private static String m4985(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f4526, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f4526));
                        C2777f.f6321 = i2 + 1;
                    } else {
                        str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
