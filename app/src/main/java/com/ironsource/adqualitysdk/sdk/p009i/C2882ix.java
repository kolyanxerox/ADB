package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
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
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2887jb;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ix */
/* loaded from: classes2.dex */
public final class C2882ix {

    /* renamed from: ﮐ */
    private static int f6892 = 0;

    /* renamed from: ﱡ */
    private static int f6893 = 0;

    /* renamed from: ﻏ */
    private static int f6894 = 1;

    /* renamed from: ﻛ */
    private static String f6895;

    /* renamed from: ﻐ */
    private String f6896;

    /* renamed from: ｋ */
    private C2890je f6897;

    /* renamed from: ﾇ */
    private C2881iw f6898;

    /* renamed from: ﾒ */
    private List<Runnable> f6899 = new ArrayList();

    static {
        m7154();
        f6895 = m7153(69 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Process.getGidForName("") + 71, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 128, "ￗ\ufff6\u0014\u0013ￛￎ\u001a\u0013\ufff6\u0015￠\ufff2\uffdd ￛ￩\f\uffde\uffde\f\u0019ￚ\u0015\n\u0019 \u0017\u001b\uffd8ￗ\u0015ￔ\ufff7\u0019ￗ\u001d\uffd8\u000b\fￜ%\u001b\u000f\f\t\f\u001a\u001b%ￜ\f\n\u001c\u0019\u0010\ufffb \u0010\ufff5\u001b\uffef\f\ufffe\u0016\u0019\u0013\u000bￒￔￋ", false).intern();
        int i = f6893 + 67;
        f6894 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public C2882ix(Context context, C2881iw c2881iw, String str) {
        this.f6897 = new C2890je(context, m7153(10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, Color.rgb(0, 0, 0) + 16777353, "ￍ\n\u0002\u0000\u0001\u0004\u0002\u0000\u0011\u0013\u0001\u0003\u0004\u0013\u000e\f\u0004\u0011ￍ\u0001\u0003ￍ\u0015\n", true).intern(), m7153(9 - (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - ExpandableListView.getPackedPositionGroup(0L), 136 - (KeyEvent.getMaxKeyCode() >> 16), "\u0005\u0003\u0012\u0005\u0014ￍￔ\u0004\u0002\u0013\u000f\u000f\r\f\u0001ￍ\u0013", false).intern());
        this.f6898 = c2881iw;
        this.f6896 = str;
        AbstractC2661as.m5141().mo5169(new InterfaceC2662at() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2662at
            /* renamed from: ﾒ */
            public final void mo4993() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(C2882ix.m7158(C2882ix.this));
                    C2882ix.m7158(C2882ix.this).clear();
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
            }
        });
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ C2881iw m7152(C2882ix c2882ix) {
        int i = f6894 + 41;
        f6893 = i % 128;
        int i2 = i % 2;
        C2881iw c2881iw = c2882ix.f6898;
        if (i2 == 0) {
            return c2881iw;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static void m7154() {
        f6892 = 40;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ C2890je m7155(C2882ix c2882ix) {
        int i = (f6894 + 5) % 128;
        f6893 = i;
        C2890je c2890je = c2882ix.f6897;
        int i2 = i + 65;
        f6894 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return c2890je;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ List m7158(C2882ix c2882ix) {
        int i = f6893;
        int i2 = i + 23;
        f6894 = i2 % 128;
        int i3 = i2 % 2;
        List<Runnable> list = c2882ix.f6899;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        int i5 = i + 95;
        f6894 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m7159(C2882ix c2882ix, C2887jb c2887jb, InterfaceC2874ip interfaceC2874ip) {
        int i = f6894 + 113;
        f6893 = i % 128;
        int i2 = i % 2;
        c2882ix.m7160(c2887jb, interfaceC2874ip);
        if (i2 != 0) {
            int i3 = 98 / 0;
        }
    }

    /* renamed from: ﻛ */
    private static String m7153(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f6892);
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

    /* renamed from: ｋ */
    public static /* synthetic */ String m7156() {
        int i = (f6894 + 13) % 128;
        f6893 = i;
        String str = f6895;
        f6894 = (i + 81) % 128;
        return str;
    }

    /* renamed from: ﾇ */
    private synchronized String m7157() {
        String str;
        int i = f6894 + 3;
        int i2 = i % 128;
        f6893 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        str = this.f6896;
        f6894 = (i2 + 71) % 128;
        return str;
    }

    /* renamed from: ﾒ */
    private void m7160(final C2887jb c2887jb, final InterfaceC2874ip interfaceC2874ip) {
        String strM7206 = c2887jb.m7206();
        StringBuilder sb = new StringBuilder();
        sb.append(m7157());
        final String strOooOO0o = AbstractC2183w4.OooOO0o(sb, m7153(1 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 87 - TextUtils.indexOf("", "", 0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, true), strM7206);
        final String strM7202 = c2887jb.m7202();
        if (!AbstractC2661as.m5141().mo5166()) {
            return;
        }
        if (!AbstractC2661as.m5141().mo5173()) {
            int i = f6893 + 81;
            f6894 = i % 128;
            if (i % 2 == 0) {
                this.f6897.m7236(strM7202);
                throw null;
            }
            if (this.f6897.m7236(strM7202) != null) {
                return;
            }
        }
        C2906ju.m7337(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.4

            /* renamed from: ﮐ */
            private static int f6901 = 0;

            /* renamed from: ﱟ */
            private static int f6902 = 1;

            /* renamed from: ﱡ */
            private static char f6903 = 6;

            /* renamed from: ﺙ */
            private static char[] f6904 = {'U', 'S', '-', 'A', 'C', 'I', 'R', 'e', 'm', 'o', 't', 'D', 'B', 'c', 'r', 'y', 'p', 'd', ' ', 's', 'i', 'n', 'g', 'f', 'a', 'v', 'l', 'h', '/', 'E', 'V', 'W', 'X', 'Y', 'Z', '['};

            /* renamed from: ﻐ */
            private static String m7164(String str) throws JSONException {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString(m7163((byte) (TextUtils.getTrimmedLength("") + 107), "\t\u0013Î", KeyEvent.keyCodeFromString("") + 3).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    return C2906ju.m7342(strOptString, C2882ix.m7156(), jSONObject.optString(m7163((byte) (79 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\u0013\u001a", 2 - View.getDefaultSize(0, 0)).intern()), jSONObject.optString(m7163((byte) (30 - View.MeasureSpec.getSize(0)), "\u0012\u0019\u001c\b", Color.green(0) + 4).intern()));
                }
                int i2 = f6901 + 29;
                f6902 = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            /* renamed from: ﻛ */
            private void m7165(final C2887jb c2887jb2, final InterfaceC2874ip interfaceC2874ip2) {
                C2882ix.m7152(C2882ix.this).m7145().m7177(new InterfaceC2876ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.4.3
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2876ir
                    /* renamed from: ｋ */
                    public final void mo5050() {
                        C2882ix.m7152(C2882ix.this).m7145().m7180(this);
                        C2882ix.m7159(C2882ix.this, c2887jb2, interfaceC2874ip2);
                    }
                });
                int i2 = f6901 + 63;
                f6902 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                f6902 = (f6901 + 109) % 128;
                m7166(strOooOO0o, c2887jb, strM7202, interfaceC2874ip);
                f6901 = (f6902 + 15) % 128;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
            
                if (r2.m7123().m7124() == 200) goto L18;
             */
            /* renamed from: ﾒ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void m7166(java.lang.String r7, com.ironsource.adqualitysdk.sdk.p009i.C2887jb r8, java.lang.String r9, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2874ip r10) {
                /*
                    Method dump skipped, instructions count: 431
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2882ix.AnonymousClass4.m7166(java.lang.String, com.ironsource.adqualitysdk.sdk.i.jb, java.lang.String, com.ironsource.adqualitysdk.sdk.i.ip):void");
            }

            /* renamed from: ﻐ */
            private static String m7163(byte b, String str, int i2) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (C2858i.f6710) {
                    try {
                        char[] cArr2 = f6904;
                        char c = f6903;
                        char[] cArr3 = new char[i2];
                        if (i2 % 2 != 0) {
                            i2--;
                            cArr3[i2] = (char) (cArr[i2] - b);
                        }
                        if (i2 > 1) {
                            C2858i.f6715 = 0;
                            while (true) {
                                int i3 = C2858i.f6715;
                                if (i3 >= i2) {
                                    break;
                                }
                                C2858i.f6714 = cArr[i3];
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
                                        int i4 = (C2858i.f6713 * c) + C2858i.f6709;
                                        int i5 = (C2858i.f6711 * c) + C2858i.f6708;
                                        int i6 = C2858i.f6715;
                                        cArr3[i6] = cArr2[i4];
                                        cArr3[i6 + 1] = cArr2[i5];
                                    } else if (C2858i.f6713 == C2858i.f6711) {
                                        C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                        C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                        int i7 = (C2858i.f6713 * c) + C2858i.f6709;
                                        int i8 = (C2858i.f6711 * c) + C2858i.f6708;
                                        int i9 = C2858i.f6715;
                                        cArr3[i9] = cArr2[i7];
                                        cArr3[i9 + 1] = cArr2[i8];
                                    } else {
                                        int i10 = (C2858i.f6713 * c) + C2858i.f6708;
                                        int i11 = (C2858i.f6711 * c) + C2858i.f6709;
                                        int i12 = C2858i.f6715;
                                        cArr3[i12] = cArr2[i10];
                                        cArr3[i12 + 1] = cArr2[i11];
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
        });
        f6893 = (f6894 + 33) % 128;
    }

    /* renamed from: ﻐ */
    public final String m7162(String str, String str2, InterfaceC2874ip interfaceC2874ip) {
        String strM7161 = m7161(new C2887jb.b(str, str2), interfaceC2874ip);
        int i = f6893 + InterfaceC3173h3.d.b.f8819b;
        f6894 = i % 128;
        if (i % 2 != 0) {
            return strM7161;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final String m7161(final C2887jb c2887jb, final InterfaceC2874ip interfaceC2874ip) {
        boolean z;
        if (TextUtils.isEmpty(c2887jb.m7203()) || TextUtils.isEmpty(c2887jb.m7205())) {
            return null;
        }
        String strM7202 = c2887jb.m7202();
        synchronized (this) {
            try {
                if (AbstractC2661as.m5141().mo5161()) {
                    z = true;
                } else {
                    this.f6899.add(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.5
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2882ix.m7159(C2882ix.this, c2887jb, interfaceC2874ip);
                        }
                    });
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m7160(c2887jb, interfaceC2874ip);
        }
        return this.f6897.m7236(strM7202);
    }
}
