package com.ironsource.adqualitysdk.sdk.p009i;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.az */
/* loaded from: classes2.dex */
public final class C2668az {

    /* renamed from: ﭴ */
    private static int f5016 = 0;

    /* renamed from: ﭸ */
    private static int f5017 = 1;

    /* renamed from: ﮌ */
    private static short[] f5018 = null;

    /* renamed from: ﮐ */
    private static int f5019 = 75;

    /* renamed from: ﱟ */
    private static int f5020 = 1499730711;

    /* renamed from: ﱡ */
    private static int f5021 = 12;

    /* renamed from: ﺙ */
    private static byte[] f5022 = {17, 31, -20, -1, 3, -17, -6, 5, -1, -20, 24, 31, 31, -27, -23, 20, -12, 12, -10, -27, 57, 52, 56, -46, 55, -41, 45, -41, -60, -46, -40, 45, 44, -42, 44, 57, -58, 60, 47, 85, 70, -96, 87, 84, -85, -92, -85, -81, 65, -69, -88, 0, 0, 0, 0, 0, 0};

    /* renamed from: ﻏ */
    private static int f5023 = 1515977941;

    /* renamed from: ﻐ */
    private Set<InterfaceC2872in> f5024 = new HashSet();

    /* renamed from: ﻛ */
    private Set<String> f5025 = new HashSet();

    /* renamed from: ｋ */
    private C2651ai f5026;

    /* renamed from: ﾇ */
    private Handler f5027;

    /* renamed from: ﾒ */
    private ISAdQualityAdListener f5028;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.az$5 */
    public class AnonymousClass5 extends AbstractRunnableC2878it {

        /* renamed from: ﾇ */
        private /* synthetic */ JSONObject f5036;

        /* renamed from: ﾒ */
        private /* synthetic */ String f5037;

        public AnonymousClass5(String str, JSONObject jSONObject) {
            str = str;
            jSONObject = jSONObject;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() throws Throwable {
            C2668az.m5398(C2668az.this, str, jSONObject);
        }
    }

    public C2668az(Handler handler, C2651ai c2651ai) {
        this.f5026 = c2651ai;
        this.f5027 = handler;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m5398(C2668az c2668az, String str, JSONObject jSONObject) throws Throwable {
        f5016 = (f5017 + 13) % 128;
        c2668az.m5400(str, jSONObject);
        f5016 = (f5017 + 87) % 128;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ C2651ai m5399(C2668az c2668az) {
        int i = f5016 + 49;
        f5017 = i % 128;
        int i2 = i % 2;
        C2651ai c2651ai = c2668az.f5026;
        if (i2 == 0) {
            int i3 = 62 / 0;
        }
        return c2651ai;
    }

    /* renamed from: ﮐ */
    public final void m5401(JSONObject jSONObject) {
        f5017 = (f5016 + 17) % 128;
        m5411(m5396((byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 86), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) - 62, View.MeasureSpec.getSize(0) - 1499730672, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1515977844).intern(), jSONObject);
        int i = f5017 + 45;
        f5016 = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
    }

    /* renamed from: ﱟ */
    public final void m5402(JSONObject jSONObject) {
        f5016 = (f5017 + 95) % 128;
        m5411(m5396((byte) ((-58) - (ViewConfiguration.getFadingEdgeLength() >> 16)), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-65) - View.MeasureSpec.getSize(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1499730692, (-1515977844) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), jSONObject);
        int i = f5017 + 115;
        f5016 = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
    }

    /* renamed from: ﱡ */
    public final void m5403(JSONObject jSONObject) {
        f5017 = (f5016 + 5) % 128;
        m5411(m5396((byte) (45 - (Process.myPid() >> 22)), (short) (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 63, (-1499730682) - ExpandableListView.getPackedPositionGroup(0L), (-1515977844) - ExpandableListView.getPackedPositionGroup(0L)).intern(), jSONObject);
        int i = f5016 + 11;
        f5017 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻏ */
    public final void m5404(JSONObject jSONObject) {
        int i = f5017 + 65;
        f5016 = i % 128;
        m5411((i % 2 != 0 ? m5397(0 - View.MeasureSpec.makeMeasureSpec(1, 0), 80 << (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)), 68 << (ViewConfiguration.getTouchSlop() >>> 127), "\ufff8￼\u000b\ufff8\u000b\n\ufff6\ufffb￼\r\ufff8\n\ufff6\u000b\ufffa", false) : m5397(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, (ViewConfiguration.getTouchSlop() >> 8) + 117, "\ufff8￼\u000b\ufff8\u000b\n\ufff6\ufffb￼\r\ufff8\n\ufff6\u000b\ufffa", true)).intern(), jSONObject);
        int i2 = f5017 + 17;
        f5016 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
    }

    /* renamed from: ﻐ */
    public final void m5405(JSONObject jSONObject) {
        f5016 = (f5017 + 99) % 128;
        m5411(m5396((byte) ((-17) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-64) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1499730711, Gravity.getAbsoluteGravity(0, 0) - 1515977844).intern(), jSONObject);
        f5016 = (f5017 + 3) % 128;
    }

    /* renamed from: ﻛ */
    public final void m5406(JSONObject jSONObject) {
        f5017 = (f5016 + 73) % 128;
        int iOptInt = jSONObject.optInt(C2869ik.f6837);
        ISAdQualityAdListener iSAdQualityAdListener = this.f5028;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adDisplayed(jSONObject.optString(C2869ik.f6838), ISAdQualityAdType.fromInt(iOptInt));
            f5017 = (f5016 + 63) % 128;
        }
    }

    /* renamed from: ｋ */
    public final void m5408(JSONObject jSONObject) {
        f5016 = (f5017 + 79) % 128;
        m5411(m5397(2 - KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionType(0L) + 11, TextUtils.getCapsMode("", 0, 0) + 115, "\ufffe�\ufffa￼\r\ufff8￼\u000b\ufffe\ufffa\r", false).intern(), jSONObject);
        int i = f5017 + 23;
        f5016 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    private void m5395(String str, JSONObject jSONObject) throws JSONException {
        Iterator it = new HashSet(this.f5024).iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectMo5310 = ((InterfaceC2872in) it.next()).mo5310(str, jSONObject);
            if (jSONObjectMo5310 != null) {
                C2915kc.m7433(jSONObject, jSONObjectMo5310);
            }
            f5016 = (f5017 + 125) % 128;
        }
        int i = f5017 + 107;
        f5016 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public final void m5407(InterfaceC2872in interfaceC2872in) {
        int i = f5017 + 41;
        f5016 = i % 128;
        if (i % 2 == 0) {
            this.f5024.add(interfaceC2872in);
        } else {
            this.f5024.add(interfaceC2872in);
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public final void m5409(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = f5017;
        this.f5028 = iSAdQualityAdListener;
        f5016 = (i + 61) % 128;
    }

    /* renamed from: ﾒ */
    public final void m5414(JSONObject jSONObject) {
        f5017 = (f5016 + 55) % 128;
        m5411(m5396((byte) ((-25) - View.MeasureSpec.getMode(0)), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 64, TextUtils.indexOf((CharSequence) "", '0') - 1499730700, (-1515977844) - View.MeasureSpec.getMode(0)).intern(), jSONObject);
        int i = f5016 + 123;
        f5017 = i % 128;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.az$2 */
    public class AnonymousClass2 extends AbstractRunnableC2878it {

        /* renamed from: ｋ */
        private static int f5029 = 59;

        /* renamed from: ﾇ */
        private static int f5030 = 1;

        /* renamed from: ﾒ */
        private static int f5031;

        /* renamed from: ﻛ */
        private /* synthetic */ String f5033;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.az$2$3 */
        public class AnonymousClass3 extends AbstractRunnableC2878it {
            public AnonymousClass3() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2668az.m5399(C2668az.this).m5041();
            }
        }

        public AnonymousClass2(String str) {
            str = str;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            int i = f5030 + 59;
            f5031 = i % 128;
            if (i % 2 == 0 ? str.equals(m5415(TextUtils.indexOf((CharSequence) "", '0') + 5, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, TextUtils.indexOf((CharSequence) "", '0', 0) + 162, "\t\r\uffff\ufffe\ufffb\ufffe\ufff9�\u0006", false).intern()) : str.equals(m5415(2 % TextUtils.indexOf((CharSequence) "", 'A'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) * 124, 31471 >> TextUtils.indexOf((CharSequence) "", (char) 20, 0), "\t\r\uffff\ufffe\ufffb\ufffe\ufff9�\u0006", false).intern())) {
                C2926s.m7598(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.az.2.3
                    public AnonymousClass3() {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        C2668az.m5399(C2668az.this).m5041();
                    }
                });
                f5030 = (f5031 + 113) % 128;
            }
            int i2 = f5031 + 51;
            f5030 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        /* renamed from: ﾒ */
        private static String m5415(int i, int i2, int i3, String str, boolean z) {
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
                        cArr2[i5] = (char) (cArr2[i5] - f5029);
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
    }

    /* renamed from: ｋ */
    private static String m5397(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f5021);
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

    /* renamed from: ﾒ */
    private void m5400(String str, JSONObject jSONObject) throws Throwable {
        m5395(str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str2 = C2869ik.f6838;
            jSONObject2.put(str2, jSONObject.remove(str2));
            String str3 = C2869ik.f6793;
            jSONObject2.put(str3, jSONObject.remove(str3));
            f5016 = (f5017 + 63) % 128;
        } catch (JSONException unused) {
        }
        this.f5026.m5044(str, jSONObject, jSONObject2, new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.az.2

            /* renamed from: ｋ */
            private static int f5029 = 59;

            /* renamed from: ﾇ */
            private static int f5030 = 1;

            /* renamed from: ﾒ */
            private static int f5031;

            /* renamed from: ﻛ */
            private /* synthetic */ String f5033;

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.az$2$3 */
            public class AnonymousClass3 extends AbstractRunnableC2878it {
                public AnonymousClass3() {
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2668az.m5399(C2668az.this).m5041();
                }
            }

            public AnonymousClass2(String str4) {
                str = str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                int i = f5030 + 59;
                f5031 = i % 128;
                if (i % 2 == 0 ? str.equals(m5415(TextUtils.indexOf((CharSequence) "", '0') + 5, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, TextUtils.indexOf((CharSequence) "", '0', 0) + 162, "\t\r\uffff\ufffe\ufffb\ufffe\ufff9�\u0006", false).intern()) : str.equals(m5415(2 % TextUtils.indexOf((CharSequence) "", 'A'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) * 124, 31471 >> TextUtils.indexOf((CharSequence) "", (char) 20, 0), "\t\r\uffff\ufffe\ufffb\ufffe\ufff9�\u0006", false).intern())) {
                    C2926s.m7598(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.az.2.3
                        public AnonymousClass3() {
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2668az.m5399(C2668az.this).m5041();
                        }
                    });
                    f5030 = (f5031 + 113) % 128;
                }
                int i2 = f5031 + 51;
                f5030 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            /* renamed from: ﾒ */
            private static String m5415(int i, int i2, int i3, String str4, boolean z) {
                String str22;
                char[] charArray = str4;
                if (str4 != null) {
                    charArray = str4.toCharArray();
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
                            cArr2[i5] = (char) (cArr2[i5] - f5029);
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
                        str22 = new String(cArr2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str22;
            }
        });
        int i = f5016 + 19;
        f5017 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0019  */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5412(org.json.JSONObject r4) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2668az.f5016
            int r0 = r0 + 83
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2668az.f5017 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L15
            com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener r0 = r3.f5028
            r1 = 50
            int r1 = r1 / 0
            if (r0 == 0) goto L2e
            goto L19
        L15:
            com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener r0 = r3.f5028
            if (r0 == 0) goto L2e
        L19:
            com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener r0 = r3.f5028
            java.lang.String r1 = com.ironsource.adqualitysdk.sdk.p009i.C2869ik.f6838
            java.lang.String r1 = r4.optString(r1)
            java.lang.String r2 = com.ironsource.adqualitysdk.sdk.p009i.C2869ik.f6837
            int r4 = r4.optInt(r2)
            com.ironsource.adqualitysdk.sdk.ISAdQualityAdType r4 = com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.fromInt(r4)
            r0.adClosed(r1, r4)
        L2e:
            int r4 = com.ironsource.adqualitysdk.sdk.p009i.C2668az.f5017
            int r4 = r4 + 93
            int r0 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2668az.f5016 = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L3b
            return
        L3b:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2668az.m5412(org.json.JSONObject):void");
    }

    /* renamed from: ﻐ */
    private static double m5394() {
        f5017 = (f5016 + 17) % 128;
        if (AbstractC2661as.m5141().mo5157()) {
            return 100.0d;
        }
        int i = f5016 + 41;
        f5017 = i % 128;
        if (i % 2 != 0) {
            return AbstractC2661as.m5141().mo5159();
        }
        AbstractC2661as.m5141().mo5159();
        throw null;
    }

    /* renamed from: ﾇ */
    public final void m5411(String str, JSONObject jSONObject) {
        this.f5027.post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.az.5

            /* renamed from: ﾇ */
            private /* synthetic */ JSONObject f5036;

            /* renamed from: ﾒ */
            private /* synthetic */ String f5037;

            public AnonymousClass5(String str2, JSONObject jSONObject2) {
                str = str2;
                jSONObject = jSONObject2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() throws Throwable {
                C2668az.m5398(C2668az.this, str, jSONObject);
            }
        });
        f5017 = (f5016 + 109) % 128;
    }

    /* renamed from: ﾒ */
    public final void m5413(String str, String str2, String str3, String str4) throws JSONException {
        f5017 = (f5016 + 21) % 128;
        m5410(str, str2, str3, str4, null, false);
        f5017 = (f5016 + 79) % 128;
    }

    /* renamed from: ﾇ */
    public final void m5410(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) throws JSONException {
        synchronized (this.f5025) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(m5396((byte) (49 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-74) - TextUtils.getTrimmedLength(""), (-1499730661) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1515977884).intern());
                sb.append(str2);
                String string = sb.toString();
                if (!this.f5025.contains(string) || z || AbstractC2661as.m5141().mo5164()) {
                    this.f5025.add(string);
                    if (Math.random() * 100.0d < m5394()) {
                        JSONObject jSONObjectM5027 = C2651ai.m5027(str, str2, str3, str4, jSONObject);
                        m5395(m5397(1 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 120, "\u0007\u0005\u0002\u0005\u0005\ufff8\ufff2\u0003", true).intern(), jSONObjectM5027);
                        this.f5026.m5048(m5397(1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 121, "\u0007\u0005\u0002\u0005\u0005\ufff8\ufff2\u0003", true).intern(), jSONObjectM5027);
                        return;
                    }
                    C2921n.m7500(m5397(2 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, TextUtils.getTrimmedLength("") + 114, "\u0010\uffdf\f\uffff\ufffe\b\uffff￭\u000e\b\uffff", true).intern(), m5397((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, (Process.myPid() >> 22) + 49, 107 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0015\uffc1ￎ\uffc1\u0005\n\u0005\u000f\uffc8\u0015\uffc1\u0011\u0002\u0014\u0014\uffc1\u0015\t\u0013\u0006\u0014\t\u0010\r\u0005￥\n\u0014\u0004\u0002\u0013\u0005\n\u000f\b\uffc1\u0015\u0011\u0000\u0006\u0013\u0013\u0010\u0013\uffc1\u0006\u0017\u0006\u000f", false).intern());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ｋ */
    private static String m5396(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f5019;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f5022;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f5020 + i2] + i4);
                    } else {
                        i5 = (short) (f5018[f5020 + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f5020 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f5023);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f5022;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f5018;
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
}
