package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2915kc;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jl */
/* loaded from: classes2.dex */
public final class C2897jl {

    /* renamed from: ﻛ */
    private static C2897jl f7086;

    /* renamed from: ﻐ */
    private Map<String, b> f7087;

    /* renamed from: ｋ */
    private Map<String, b> f7088 = new HashMap();

    /* renamed from: ﾒ */
    private Handler f7089 = new Handler(Looper.getMainLooper());

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jl$b */
    public enum b {
        f7098,
        f7101,
        f7100;


        /* renamed from: ﮐ */
        private static int f7093 = 0;

        /* renamed from: ﱡ */
        private static char f7094 = 0;

        /* renamed from: ﺙ */
        private static int f7095 = 1;

        /* renamed from: ﻏ */
        private static int f7096;

        /* renamed from: ﻐ */
        private static long f7097;

        static {
            m7299();
            int i = f7093 + InterfaceC3173h3.d.b.f8826i;
            f7095 = i % 128;
            if (i % 2 == 0) {
                int i2 = 87 / 0;
            }
        }

        public static b valueOf(String str) {
            int i = f7095 + 7;
            f7093 = i % 128;
            if (i % 2 != 0) {
                Enum.valueOf(b.class, str);
                throw null;
            }
            b bVar = (b) Enum.valueOf(b.class, str);
            int i2 = f7093 + 99;
            f7095 = i2 % 128;
            if (i2 % 2 != 0) {
                return bVar;
            }
            throw null;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() throws CloneNotSupportedException {
            int i = f7093 + 59;
            f7095 = i % 128;
            if (i % 2 != 0) {
                return (b[]) values().clone();
            }
            values().clone();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
        /* renamed from: ﻐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b m7297(java.lang.String r8) {
            /*
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7093
                int r0 = r0 + 61
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7095 = r1
                r1 = 2
                int r0 = r0 % r1
                r2 = 0
                if (r0 != 0) goto L16
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                r3 = 6
                int r3 = r3 / r2
                if (r0 != 0) goto Lcf
                goto L1c
            L16:
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                if (r0 != 0) goto Lcf
            L1c:
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7093
                int r0 = r0 + 89
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7095 = r0
                int r0 = r8.hashCode()
                r3 = 3642(0xe3a, float:5.104E-42)
                r4 = 1
                java.lang.String r5 = "\u0000\u0000\u0000\u0000"
                if (r0 == r3) goto L91
                r3 = 96921(0x17a99, float:1.35815E-40)
                if (r0 == r3) goto L6b
                r3 = 109261(0x1aacd, float:1.53107E-40)
                if (r0 == r3) goto L3b
                goto Lb6
            L3b:
                java.lang.String r0 = ""
                int r0 = android.text.TextUtils.getOffsetBefore(r0, r2)
                r3 = 705611823(0x2a0ec82f, float:1.2681586E-13)
                int r3 = r3 - r0
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
                int r0 = r0 + 22770
                char r0 = (char) r0
                java.lang.String r6 = "⾒່\uf22a㭘"
                java.lang.String r7 = "ᷳ\uef08우"
                java.lang.String r0 = m7298(r3, r0, r6, r7, r5)
                java.lang.String r0 = r0.intern()
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto Lb6
                int r8 = com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7093
                int r8 = r8 + 101
                int r0 = r8 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7095 = r0
                int r8 = r8 % r1
                if (r8 != 0) goto Lb7
            L69:
                r2 = r4
                goto Lb7
            L6b:
                int r0 = android.os.Process.myPid()
                int r0 = r0 >> 22
                r2 = 1737404966(0x678eb226, float:1.3477246E24)
                int r2 = r2 - r0
                int r0 = android.view.ViewConfiguration.getFadingEdgeLength()
                int r0 = r0 >> 16
                int r0 = r0 + 21012
                char r0 = (char) r0
                java.lang.String r3 = "⛳躲ᑧꝒ"
                java.lang.String r6 = "㦑ዣ暗"
                java.lang.String r0 = m7298(r2, r0, r3, r6, r5)
                java.lang.String r0 = r0.intern()
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto Lb6
                goto L69
            L91:
                int r0 = android.view.ViewConfiguration.getEdgeSlop()
                int r0 = r0 >> 16
                int r2 = android.view.ViewConfiguration.getKeyRepeatTimeout()
                int r2 = r2 >> 16
                r3 = 50547(0xc573, float:7.0831E-41)
                int r3 = r3 - r2
                char r2 = (char) r3
                java.lang.String r3 = "⥏턘獇Ⓟ"
                java.lang.String r6 = "ﳟ\u0af7"
                java.lang.String r0 = m7298(r0, r2, r3, r6, r5)
                java.lang.String r0 = r0.intern()
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto Lb6
                r2 = r1
                goto Lb7
            Lb6:
                r2 = -1
            Lb7:
                if (r2 == 0) goto Lc4
                if (r2 == r4) goto Lc1
                if (r2 == r1) goto Lbe
                goto Lcf
            Lbe:
                com.ironsource.adqualitysdk.sdk.i.jl$b r8 = com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7100
                return r8
            Lc1:
                com.ironsource.adqualitysdk.sdk.i.jl$b r8 = com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7101
                return r8
            Lc4:
                com.ironsource.adqualitysdk.sdk.i.jl$b r8 = com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7098
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7095
                int r0 = r0 + 77
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.f7093 = r0
                return r8
            Lcf:
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2897jl.b.m7297(java.lang.String):com.ironsource.adqualitysdk.sdk.i.jl$b");
        }

        /* renamed from: ﻛ */
        private static String m7298(int i, char c, String str, String str2, String str3) {
            String str4;
            char[] charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = charArray;
            char[] charArray2 = str2;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
            }
            char[] cArr2 = charArray2;
            char[] charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = charArray3;
            synchronized (C2885j.f6936) {
                try {
                    char[] cArr4 = (char[]) cArr3.clone();
                    char[] cArr5 = (char[]) cArr.clone();
                    cArr4[0] = (char) (c ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i));
                    int length = cArr2.length;
                    char[] cArr6 = new char[length];
                    C2885j.f6934 = 0;
                    while (true) {
                        int i2 = C2885j.f6934;
                        if (i2 < length) {
                            int i3 = (i2 + 2) % 4;
                            int i4 = (i2 + 3) % 4;
                            int i5 = cArr4[i2 % 4] * 32718;
                            char c2 = cArr5[i3];
                            char c3 = (char) ((i5 + c2) % 65535);
                            C2885j.f6935 = c3;
                            cArr5[i4] = (char) (((cArr4[i4] * 32718) + c2) / 65535);
                            cArr4[i4] = c3;
                            int i6 = C2885j.f6934;
                            cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f7097) ^ f7096) ^ f7094);
                            C2885j.f6934 = i6 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str4;
        }

        /* renamed from: ﾒ */
        public static void m7299() {
            f7097 = 0L;
            f7096 = -539447659;
            f7094 = (char) 0;
        }
    }

    /* renamed from: ﾇ */
    private synchronized Map<String, b> m7292() {
        try {
            if (this.f7087 == null) {
                this.f7087 = new HashMap();
                JSONObject jSONObjectMo5151 = AbstractC2661as.m5141().mo5151();
                if (jSONObjectMo5151 != null) {
                    this.f7087 = C2915kc.m7439(jSONObjectMo5151, new C2915kc.c<b>() { // from class: com.ironsource.adqualitysdk.sdk.i.jl.4
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
                        /* renamed from: ﻛ */
                        public final /* synthetic */ b mo5208(JSONObject jSONObject, String str) {
                            return b.m7297(jSONObject.optString(str));
                        }
                    });
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7087;
    }

    /* renamed from: ﾒ */
    public static synchronized C2897jl m7293() {
        try {
            if (f7086 == null) {
                f7086 = new C2897jl();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7086;
    }

    /* renamed from: ｋ */
    public final synchronized boolean m7294(Activity activity) {
        return b.f7101 == m7289(activity);
    }

    /* renamed from: ﻛ */
    private synchronized b m7289(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m7291().containsKey(name)) {
                return m7291().get(name);
            }
            if (m7292().containsKey(name)) {
                return m7292().get(name);
            }
        }
        return b.m7297(AbstractC2661as.m5141().mo5148());
    }

    /* renamed from: ｋ */
    private synchronized Map<String, b> m7291() {
        return new HashMap(this.f7088);
    }

    /* renamed from: ﾒ */
    public final synchronized void m7295(final String str, final b bVar) {
        this.f7089.post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jl.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                synchronized (C2897jl.this) {
                    C2897jl.this.f7088.put(str, bVar);
                }
            }
        });
    }

    /* renamed from: ﾒ */
    public final synchronized boolean m7296(Activity activity) {
        return b.f7100 == m7289(activity);
    }
}
