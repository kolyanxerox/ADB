package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2748dy;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ds */
/* loaded from: classes2.dex */
public final class C2742ds {

    /* renamed from: ﱟ */
    private static int f6140 = 0;

    /* renamed from: ﱡ */
    private static int f6141 = 1;

    /* renamed from: ﺙ */
    private static char[] f6142;

    /* renamed from: ﻏ */
    private static long f6143;

    /* renamed from: ﻛ */
    private static Map<AbstractC2755ee, AbstractC2755ee> f6144;

    /* renamed from: ﾒ */
    private static Map<AbstractC2794fq, AbstractC2794fq> f6145;

    /* renamed from: ﻐ */
    private String f6146;

    /* renamed from: ｋ */
    private int f6147 = 0;

    /* renamed from: ﾇ */
    private String f6148;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ds$e */
    public interface e<T> {
        /* renamed from: ﾇ */
        T mo6704(List<C2748dy> list);
    }

    static {
        m6696();
        f6144 = new HashMap();
        f6145 = new HashMap();
        f6141 = (f6140 + 61) % 128;
    }

    public C2742ds(String str, String str2) {
        this.f6148 = str;
        this.f6146 = str2;
    }

    /* renamed from: リ */
    private boolean m6660(List<C2748dy> list) {
        if (this.f6147 < list.size()) {
            int i = f6140 + 83;
            f6141 = i % 128;
            if (i % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i2 = f6140 + 99;
        f6141 = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (m6660(r7) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = (com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 + 7) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        r7 = r7.get(r6.f6147);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 + 107;
        com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if ((r0 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (m6660(r7) != true) goto L24;
     */
    /* renamed from: ヶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.C2748dy m6661(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r6.m6660(r7)     // Catch: java.lang.Exception -> L1b
            r2 = 30
            int r2 = r2 / 0
            r2 = 1
            if (r0 == r2) goto L24
            goto L66
        L19:
            r7 = move-exception
            throw r7
        L1b:
            r7 = move-exception
            goto L42
        L1d:
            boolean r0 = r6.m6660(r7)     // Catch: java.lang.Exception -> L1b
            if (r0 != 0) goto L24
            goto L66
        L24:
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141
            int r0 = r0 + 7
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r0
            int r0 = r6.f6147     // Catch: java.lang.Exception -> L1b
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L1b
            com.ironsource.adqualitysdk.sdk.i.dy r7 = (com.ironsource.adqualitysdk.sdk.p009i.C2748dy) r7     // Catch: java.lang.Exception -> L1b
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141
            int r0 = r0 + 107
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L41
            return r7
        L41:
            throw r1
        L42:
            java.lang.String r0 = ""
            int r2 = android.os.Process.getGidForName(r0)
            int r2 = r2 + 38
            r3 = 48
            int r4 = android.text.TextUtils.lastIndexOf(r0, r3)
            int r4 = 1201 - r4
            r5 = 40744(0x9f28, float:5.7095E-41)
            int r0 = android.text.TextUtils.lastIndexOf(r0, r3)
            int r0 = r0 + r5
            char r0 = (char) r0
            java.lang.String r0 = m6695(r2, r4, r0)
            java.lang.String r0 = r0.intern()
            r6.m6700(r0, r7)
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6661(java.util.List):com.ironsource.adqualitysdk.sdk.i.dy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (m6660(r7) != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        m6700(m6695(android.graphics.Color.rgb(0, 0, 0) + 16777240, 1145 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (char) (61735 - (android.view.KeyEvent.getMaxKeyCode() >> 16))).intern(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r0 = r6.f6147;
        r6.f6147 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        return r7.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (m6660(r7) != false) goto L16;
     */
    /* renamed from: 丫 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.C2748dy m6662(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r6.m6660(r7)     // Catch: java.lang.Exception -> L1a
            r3 = 50
            int r3 = r3 / r2
            if (r0 == 0) goto L23
            goto L4c
        L18:
            r7 = move-exception
            throw r7
        L1a:
            r7 = move-exception
            goto L59
        L1c:
            boolean r0 = r6.m6660(r7)     // Catch: java.lang.Exception -> L1a
            r3 = 1
            if (r0 == r3) goto L4c
        L23:
            int r7 = android.graphics.Color.rgb(r2, r2, r2)     // Catch: java.lang.Exception -> L1a
            r0 = 16777240(0x1000018, float:2.3509954E-38)
            int r7 = r7 + r0
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L1a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            int r0 = 1145 - r0
            int r2 = android.view.KeyEvent.getMaxKeyCode()     // Catch: java.lang.Exception -> L1a
            int r2 = r2 >> 16
            r3 = 61735(0xf127, float:8.6509E-41)
            int r3 = r3 - r2
            char r2 = (char) r3     // Catch: java.lang.Exception -> L1a
            java.lang.String r7 = m6695(r7, r0, r2)     // Catch: java.lang.Exception -> L1a
            java.lang.String r7 = r7.intern()     // Catch: java.lang.Exception -> L1a
            r6.m6700(r7, r1)     // Catch: java.lang.Exception -> L1a
            goto L7e
        L4c:
            int r0 = r6.f6147     // Catch: java.lang.Exception -> L1a
            int r2 = r0 + 1
            r6.f6147 = r2     // Catch: java.lang.Exception -> L1a
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L1a
            com.ironsource.adqualitysdk.sdk.i.dy r7 = (com.ironsource.adqualitysdk.sdk.p009i.C2748dy) r7     // Catch: java.lang.Exception -> L1a
            return r7
        L59:
            r0 = 0
            float r2 = android.graphics.PointF.length(r0, r0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            int r2 = 34 - r2
            int r3 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r3 = r3 >> 16
            int r3 = 1168 - r3
            float r4 = android.media.AudioTrack.getMaxVolume()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            int r0 = r0 + (-1)
            char r0 = (char) r0
            java.lang.String r0 = m6695(r2, r3, r0)
            java.lang.String r0 = r0.intern()
            r6.m6700(r0, r7)
        L7e:
            int r7 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r7 = r7 + 3
            int r0 = r7 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r0
            int r7 = r7 % 2
            if (r7 == 0) goto L8b
            return r1
        L8b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6662(java.util.List):com.ironsource.adqualitysdk.sdk.i.dy");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* renamed from: 爫 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6663(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r22) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6663(java.util.List):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* renamed from: ﬤ */
    private Pair<String, AbstractC2755ee> m6664(List<C2748dy> list) {
        f6140 = (f6141 + 19) % 128;
        C2748dy c2748dyM6662 = m6662(list);
        if (!c2748dyM6662.m6736()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m6695(24 - TextUtils.getTrimmedLength(""), 1095 - AndroidCharacter.getMirror('0'), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb.append(c2748dyM6662);
            m6700(sb.toString(), null);
        }
        String strM6741 = c2748dyM6662.m6741();
        m6701(list, m6695((ViewConfiguration.getTapTimeout() >> 16) + 1, 1071 - KeyEvent.normalizeMetaState(0), (char) (KeyEvent.getDeadChar(0, 0) + 43323)).intern(), strM6741, m6695(48 - ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 1072, (char) (55982 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern());
        Pair<String, AbstractC2755ee> pair = new Pair<>(strM6741, m6702(list));
        f6140 = (f6141 + 87) % 128;
        return pair;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* renamed from: טּ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6665(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r11) {
        /*
            r10 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r0 = r0 + 25
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r0
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r10.m6663(r11)
        Lc:
            boolean r1 = r10.m6660(r11)
            if (r1 == 0) goto La4
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r1 = r1 + 105
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r1
            com.ironsource.adqualitysdk.sdk.i.dy r1 = r10.m6662(r11)
            java.lang.String r1 = r1.m6741()
            int r2 = r1.hashCode()
            r3 = 46
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L67
            r3 = 91
            if (r2 == r3) goto L31
            goto L8d
        L31:
            r2 = 0
            float r3 = android.graphics.PointF.length(r2, r2)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            int r2 = r2 + r4
            long r6 = android.widget.ExpandableListView.getPackedPositionForChild(r5, r5)
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            int r3 = 788 - r3
            int r6 = android.view.View.resolveSize(r5, r5)
            int r6 = r6 + 24787
            char r6 = (char) r6
            java.lang.String r2 = m6695(r2, r3, r6)
            java.lang.String r2 = r2.intern()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8d
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L65
            goto L8e
        L65:
            r5 = r4
            goto L8e
        L67:
            java.lang.String r2 = ""
            int r3 = android.view.MotionEvent.axisFromString(r2)
            int r3 = -r3
            int r2 = android.text.TextUtils.indexOf(r2, r2)
            int r2 = 788 - r2
            r6 = 48
            char r6 = android.text.AndroidCharacter.getMirror(r6)
            r7 = 50186(0xc40a, float:7.0326E-41)
            int r7 = r7 - r6
            char r6 = (char) r7
            java.lang.String r2 = m6695(r3, r2, r6)
            java.lang.String r2 = r2.intern()
            boolean r1 = r1.equals(r2)
            if (r1 == r4) goto L8e
        L8d:
            r5 = -1
        L8e:
            if (r5 == 0) goto L9e
            if (r5 == r4) goto L98
            int r11 = r10.f6147
            int r11 = r11 - r4
            r10.f6147 = r11
            return r0
        L98:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r10.m6681(r0, r11)
            goto Lc
        L9e:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r10.m6689(r0, r11)
            goto Lc
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6665(java.util.List):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* renamed from: סּ */
    private List<AbstractC2755ee> m6666(List<C2748dy> list) {
        List<AbstractC2755ee> listM6684 = m6684(list, m6695(-TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 774, (char) (ExpandableListView.getPackedPositionType(0L) + 17409)).intern(), new e<AbstractC2755ee>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.5

            /* renamed from: ﻛ */
            private static int f6158 = 1;

            /* renamed from: ｋ */
            private static int[] f6159 = {-713207209, 403412497, -135770848, -1055493810, -66274607, 40927945, 650387516, -1526373789, -1830171084, -1548328009, -1298250336, 1894290000, -873957090, 1939164739, -1939738749, 428919924, -1519831712, 1784452603};

            /* renamed from: ﾇ */
            private static int f6160;

            /* renamed from: ｋ */
            private static String m6707(int[] iArr, int i) {
                String str;
                synchronized (C2723d.f5953) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f6159.clone();
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

            /* renamed from: ﾒ */
            private AbstractC2755ee m6708(List<C2748dy> list2) {
                AbstractC2755ee abstractC2755eeM6678 = C2742ds.m6678(C2742ds.this, list2);
                if (!(abstractC2755eeM6678 instanceof C2749dz)) {
                    f6160 = (f6158 + 87) % 128;
                    if (!(abstractC2755eeM6678 instanceof C2762el)) {
                        C2742ds c2742ds = C2742ds.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(m6707(new int[]{-1786278312, 1777611502, -1049640754, -627381821, -290230035, 1671156136, -835390686, 2073806926, 1082719200, -456463951, -1366067718, -502191781, 1563471463, 116013824, 536230759, 722997805}, View.resolveSize(0, 0) + 32).intern());
                        sb.append(abstractC2755eeM6678);
                        C2742ds.m6691(c2742ds, sb.toString());
                        return null;
                    }
                }
                f6160 = (f6158 + 15) % 128;
                return abstractC2755eeM6678;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2742ds.e
            /* renamed from: ﾇ */
            public final /* synthetic */ AbstractC2755ee mo6704(List list2) {
                f6160 = (f6158 + 27) % 128;
                AbstractC2755ee abstractC2755eeM6708 = m6708(list2);
                f6158 = (f6160 + 119) % 128;
                return abstractC2755eeM6708;
            }
        });
        f6140 = (f6141 + 89) % 128;
        return listM6684;
    }

    /* renamed from: ףּ */
    private Map<String, AbstractC2755ee> m6667(List<C2748dy> list) {
        HashMap map = new HashMap();
        Iterator it = m6684(list, m6695((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, (-16776452) - Color.rgb(0, 0, 0), (char) TextUtils.getOffsetBefore("", 0)).intern(), new e<Pair<String, AbstractC2755ee>>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2742ds.e
            /* renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ Pair<String, AbstractC2755ee> mo6704(List list2) {
                return C2742ds.m6692(C2742ds.this, list2);
            }
        }).iterator();
        while (it.hasNext()) {
            int i = f6141 + 15;
            f6140 = i % 128;
            if (i % 2 != 0) {
                Pair pair = (Pair) it.next();
                map.put(pair.first, pair.second);
                throw null;
            }
            Pair pair2 = (Pair) it.next();
            map.put(pair2.first, pair2.second);
        }
        int i2 = f6140 + 95;
        f6141 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* renamed from: ﭖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6668(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r18) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6668(java.util.List):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* renamed from: ﭴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6669(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6669(java.util.List):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* renamed from: ﭸ */
    private AbstractC2794fq m6670(List<C2748dy> list) {
        m6687(list, m6695(1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42, (char) Color.green(0)).intern(), m6695(Color.argb(0, 0, 0, 0) + 38, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 726, (char) (61103 - TextUtils.lastIndexOf("", '0'))).intern());
        AbstractC2794fq abstractC2794fqM6697 = m6697(new C2787fj());
        int i = f6140 + 73;
        f6141 = i % 128;
        if (i % 2 != 0) {
            return abstractC2794fqM6697;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* renamed from: ﮉ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6671(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r11) {
        /*
            r10 = this;
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r10.m6665(r11)
            boolean r1 = r10.m6660(r11)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto Led
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r1 = r1 + 15
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r1
            java.lang.String r1 = r10.f6146
            int r3 = r0.m6761()
            com.ironsource.adqualitysdk.sdk.i.dm r1 = com.ironsource.adqualitysdk.sdk.p009i.C2736dm.m6623(r1, r3)
            com.ironsource.adqualitysdk.sdk.i.dy r3 = r10.m6662(r11)
            java.lang.String r3 = r3.m6741()
            int r4 = r3.hashCode()
            r5 = 37
            r6 = 2
            r7 = 0
            if (r4 == r5) goto L85
            r5 = 42
            java.lang.String r8 = ""
            if (r4 == r5) goto L64
            r5 = 47
            if (r4 == r5) goto L3c
            goto Lb6
        L3c:
            int r4 = android.text.TextUtils.getOffsetBefore(r8, r7)
            int r4 = r4 + r2
            int r5 = android.view.ViewConfiguration.getPressedStateDuration()
            int r5 = r5 >> 16
            int r5 = 786 - r5
            r9 = 48
            int r7 = android.text.TextUtils.indexOf(r8, r9, r7)
            r8 = 64925(0xfd9d, float:9.098E-41)
            int r7 = r7 + r8
            char r7 = (char) r7
            java.lang.String r4 = m6695(r4, r5, r7)
            java.lang.String r4 = r4.intern()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lb6
            r7 = r2
            goto Lb7
        L64:
            r4 = 0
            int r4 = android.widget.ExpandableListView.getPackedPositionGroup(r4)
            int r4 = r4 + r2
            int r5 = android.text.TextUtils.getOffsetBefore(r8, r7)
            int r5 = 785 - r5
            int r8 = android.text.TextUtils.getTrimmedLength(r8)
            char r8 = (char) r8
            java.lang.String r4 = m6695(r4, r5, r8)
            java.lang.String r4 = r4.intern()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lb6
            goto Lb7
        L85:
            int r4 = android.view.ViewConfiguration.getLongPressTimeout()
            int r4 = r4 >> 16
            int r4 = r4 + r2
            int r5 = android.os.Process.getThreadPriority(r7)
            int r5 = r5 + 20
            int r5 = r5 >> 6
            int r5 = r5 + 787
            float r7 = android.media.AudioTrack.getMinVolume()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            char r7 = (char) r7
            java.lang.String r4 = m6695(r4, r5, r7)
            java.lang.String r4 = r4.intern()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lb6
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r3 = r3 + 23
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r3
            r7 = r6
            goto Lb7
        Lb6:
            r7 = -1
        Lb7:
            if (r7 == 0) goto Ldf
            if (r7 == r2) goto Ld1
            if (r7 == r6) goto Lc3
            int r11 = r10.f6147
            int r11 = r11 - r2
            r10.f6147 = r11
            return r0
        Lc3:
            com.ironsource.adqualitysdk.sdk.i.ex r2 = new com.ironsource.adqualitysdk.sdk.i.ex
            com.ironsource.adqualitysdk.sdk.i.ee r11 = r10.m6671(r11)
            r2.<init>(r0, r11, r1)
            com.ironsource.adqualitysdk.sdk.i.ee r11 = m6679(r2)
            return r11
        Ld1:
            com.ironsource.adqualitysdk.sdk.i.et r2 = new com.ironsource.adqualitysdk.sdk.i.et
            com.ironsource.adqualitysdk.sdk.i.ee r11 = r10.m6671(r11)
            r2.<init>(r0, r11, r1)
            com.ironsource.adqualitysdk.sdk.i.ee r11 = m6679(r2)
            return r11
        Ldf:
            com.ironsource.adqualitysdk.sdk.i.fa r2 = new com.ironsource.adqualitysdk.sdk.i.fa
            com.ironsource.adqualitysdk.sdk.i.ee r11 = r10.m6671(r11)
            r2.<init>(r0, r11, r1)
            com.ironsource.adqualitysdk.sdk.i.ee r11 = m6679(r2)
            return r11
        Led:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6671(java.util.List):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* renamed from: ﮌ */
    private C2788fk m6672(List<C2748dy> list) {
        ArrayList arrayList = new ArrayList();
        C2748dy c2748dyM6661 = m6661(list);
        while (!c2748dyM6661.m6737(m6695(1 - View.resolveSizeAndState(0, 0, 0), 764 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern())) {
            f6141 = (f6140 + 9) % 128;
            arrayList.add(m6698(list));
            c2748dyM6661 = m6661(list);
            f6141 = (f6140 + 107) % 128;
        }
        this.f6147++;
        return (C2788fk) m6697(new C2788fk(arrayList));
    }

    /* renamed from: ﮐ */
    private AbstractC2794fq m6673(List<C2748dy> list) {
        m6687(list, m6695(1 - Color.green(0), 110 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern(), m6695((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43, 310 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern());
        AbstractC2755ee abstractC2755eeM6702 = m6702(list);
        m6687(list, m6695(1 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 150, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 57091)).intern(), m6695(47 - TextUtils.indexOf("", ""), 353 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.indexOf("", "", 0) + 11368)).intern());
        AbstractC2794fq abstractC2794fqM6697 = m6697(new C2798fu(abstractC2755eeM6702, m6698(list)));
        int i = f6140 + 77;
        f6141 = i % 128;
        if (i % 2 == 0) {
            int i2 = 72 / 0;
        }
        return abstractC2794fqM6697;
    }

    /* renamed from: ﱟ */
    private AbstractC2794fq m6674(List<C2748dy> list) {
        AbstractC2794fq abstractC2794fqM6697;
        f6140 = (f6141 + 85) % 128;
        if (m6661(list).m6737(m6695((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, 43 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern())) {
            abstractC2794fqM6697 = m6697(new C2792fo(null));
            f6141 = (f6140 + 11) % 128;
        } else {
            abstractC2794fqM6697 = m6697(new C2792fo(m6702(list)));
        }
        m6701(list, m6695((Process.myPid() >> 22) + 1, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43, (char) Color.argb(0, 0, 0, 0)).intern(), abstractC2794fqM6697, m6695(36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 655, (char) Color.alpha(0)).intern());
        return abstractC2794fqM6697;
    }

    /* renamed from: ﱡ */
    private AbstractC2794fq m6675(List<C2748dy> list) {
        m6687(list, m6695((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m6695((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, MotionEvent.axisFromString("") + 692, (char) (16767 - (ViewConfiguration.getTapTimeout() >> 16))).intern());
        AbstractC2794fq abstractC2794fqM6697 = m6697(new C2790fm());
        int i = f6141 + 123;
        f6140 = i % 128;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
        return abstractC2794fqM6697;
    }

    /* renamed from: ﺙ */
    private AbstractC2794fq m6676(List<C2748dy> list) {
        m6687(list, m6695(1 - View.resolveSize(0, 0), (-1) - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern(), m6695(Color.red(0) + 44, 401 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38819)).intern());
        C2788fk c2788fkM6672 = m6672(list);
        m6687(list, m6695(5 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 444, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m6695((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53, 449 - (Process.myTid() >> 22), (char) ((-1) - Process.getGidForName(""))).intern());
        m6687(list, m6695(1 - KeyEvent.getDeadChar(0, 0), 111 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m6695(41 - View.getDefaultSize(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 503, (char) (48436 - (ViewConfiguration.getTapTimeout() >> 16))).intern());
        C2748dy c2748dyM6662 = m6662(list);
        m6685(c2748dyM6662, C2748dy.e.f6203, c2788fkM6672, m6695(27 - (ViewConfiguration.getFadingEdgeLength() >> 16), 543 - View.MeasureSpec.getSize(0), (char) (TextUtils.indexOf("", "") + 20739)).intern());
        C2762el c2762el = (C2762el) m6679(new C2762el(c2748dyM6662.m6741(), C2736dm.m6623(this.f6146, c2748dyM6662.m6738())));
        m6687(list, m6695(-TextUtils.indexOf((CharSequence) "", '0', 0), 151 - Drawable.resolveOpacity(0, 0), (char) (Drawable.resolveOpacity(0, 0) + 57091)).intern(), m6695(39 - View.combineMeasuredStates(0, 0), 570 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf((CharSequence) "", '0') + 49123)).intern());
        m6687(list, m6695(1 - TextUtils.getOffsetAfter("", 0), ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern(), m6695(TextUtils.getOffsetBefore("", 0) + 46, 610 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (2036 - TextUtils.lastIndexOf("", '0', 0))).intern());
        AbstractC2794fq abstractC2794fqM6697 = m6697(new C2799fv(c2788fkM6672, m6672(list), c2762el));
        int i = f6140 + 47;
        f6141 = i % 128;
        if (i % 2 != 0) {
            return abstractC2794fqM6697;
        }
        throw null;
    }

    /* renamed from: ﻏ */
    private AbstractC2794fq m6677(List<C2748dy> list) {
        AbstractC2794fq abstractC2794fqM6697 = m6697(new C2797ft(m6684(list, m6695(1 - (ViewConfiguration.getPressedStateDuration() >> 16), View.combineMeasuredStates(0, 0) + 43, (char) View.MeasureSpec.getSize(0)).intern(), new e<AbstractC2755ee>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.3

            /* renamed from: ﺙ */
            private static int f6151 = 1;

            /* renamed from: ﻏ */
            private static int f6152 = 0;

            /* renamed from: ﻐ */
            private static boolean f6153 = true;

            /* renamed from: ﻛ */
            private static int f6154 = 155;

            /* renamed from: ﾇ */
            private static boolean f6155 = true;

            /* renamed from: ﾒ */
            private static char[] f6156 = {224, 275, 267, 256, 254, 271, 255, 187, 273, 252, 269, 260, 253, 263, 272};

            /* renamed from: ﻐ */
            private AbstractC2755ee m6705(List<C2748dy> list2) {
                int i = f6151 + 123;
                f6152 = i % 128;
                if (i % 2 != 0) {
                    boolean z = C2742ds.this.m6702(list2) instanceof C2762el;
                    throw null;
                }
                AbstractC2755ee abstractC2755eeM6702 = C2742ds.this.m6702(list2);
                if ((abstractC2755eeM6702 instanceof C2762el) || (abstractC2755eeM6702 instanceof C2747dx)) {
                    f6151 = (f6152 + 27) % 128;
                    return abstractC2755eeM6702;
                }
                C2742ds c2742ds = C2742ds.this;
                StringBuilder sb = new StringBuilder();
                sb.append(m6706(null, null, TextUtils.getOffsetAfter("", 0) + 127, "\u0088\u0087\u0084\u0089\u008c\u0084\u0085\u0084\u008b\u0088\u0086\u008f\u008d\u0088\u0084\u008e\u008d\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                sb.append(abstractC2755eeM6702);
                C2742ds.m6691(c2742ds, sb.toString());
                return null;
            }

            /* renamed from: ﾒ */
            private static String m6706(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                        char[] cArr2 = f6156;
                        int i2 = f6154;
                        if (f6153) {
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
                        if (f6155) {
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

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2742ds.e
            /* renamed from: ﾇ */
            public final /* synthetic */ AbstractC2755ee mo6704(List list2) {
                f6151 = (f6152 + 89) % 128;
                AbstractC2755ee abstractC2755eeM6705 = m6705(list2);
                int i = f6151 + 57;
                f6152 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 69 / 0;
                }
                return abstractC2755eeM6705;
            }
        })));
        int i = f6140 + 23;
        f6141 = i % 128;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
        return abstractC2794fqM6697;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ AbstractC2755ee m6678(C2742ds c2742ds, List list) {
        int i = f6141 + 9;
        f6140 = i % 128;
        if (i % 2 != 0) {
            c2742ds.m6663(list);
            throw null;
        }
        AbstractC2755ee abstractC2755eeM6663 = c2742ds.m6663(list);
        f6140 = (f6141 + 57) % 128;
        return abstractC2755eeM6663;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0103  */
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq m6682(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6682(java.util.List):com.ironsource.adqualitysdk.sdk.i.fq");
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m6691(C2742ds c2742ds, String str) {
        int i = f6140 + 27;
        f6141 = i % 128;
        int i2 = i % 2;
        c2742ds.m6686(str);
        if (i2 == 0) {
            throw null;
        }
        int i3 = f6141 + 81;
        f6140 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public static void m6696() {
        char[] cArr = new char[1307];
        ByteBuffer.wrap("\u0000{\u0000m\"«Eèh\u0002\u008bW®bÐôóÀ\u0016\u001f9Z\\u~ú¡ÛÄ\u001eç+\ng,\u008cOÊr\\\u0095(¸}ÚÆýÕ ¢C3fq\u0088\u0081«ÊÎçñ#\u0014J6\u0096Yà|ý\u009f(ÂKä\u008c\u0007£*ùM\u0007p^\u0092\u008a\u0000;\u0000i\"¨\u0000f\"¡EîB>`ï\u0007¼*OÉ\u0014\u009eV¼\u008fÛÌö;\u0015n0L\u0000b\"¼Eùh\u000b\u008bS\u0000c\"¡Eòh\u001e\u008bQ®hÐ¡óÇ\na(©Oðã\u0096ÁO¦\u000e¾´\u009c~û6ÖÀ5\u0088\u0010±njM[¨\u008e\u0087ÜâòÀ#\u001f\u0010zÛY½´®\u0092Wñ\u0013Ì\u0085+ü\u0006§d\u001fC\u001e\u009e/ýèØ³6P\u0015\u000ep4Oáª\u0089\u0000(Ì\u0096îW\u0089C¤æG³b\u0098\u001c_?8Úâõ¤\u0090\u009d²Qmw\bú+ÓÆ\u0082àj\u0083=¾çY\u0095t\u0085\u0016|1kì\u001b\u008fÀª\u008dD\u007fg*\u0002\u0000=ÌØ¿ú-\u0095]°\bS\u0083\u000e´('Ë\u001eæC\u0081ºß*ÄÜæ\u001d\u0081\t¬¬OùjÒ\u0014\u00157rÒ¨ýî\u0098×º\u001be=\u0000 #\u009eÎÉè1\u008br¶½Q\u0096|Â\u001e=9!äD\u0087\u008d¢ÄL,oc\nY5ÃÐóò\"\u009dU¸R[\u0087\u0006ì $Ã\u0017îD\u0089÷´¢VcqP\u001c\bOVm\u0091\nÜ'<\u0000f\"¡EîhJ\u008bK®rÐµóÖ\u0016\u00159S\\i~´¡ÜÄVç7\nz,\u008fOÛr\u0010\u0095.¸8Ú\u0084ýÑ ¢C6fq\u0088\u0080«ÖÎçñ!\u0014A6\u0096Yà|ì\u009f%Â\nä\u0099\u0007æ*³MJp\u0017\u0094Æ¶\u0001ÑNüê\u001fû:ÉD\u001agf\u0082¹\u00adêÈÅê\u00155fPös\u0097\u009eÚ¸/Û{æ°\u0001\u008e,\u0098N#iz´F×ÐòÉ\u001c%?nZ@eÖ\u0080£¢iÍGÇÂå\u0013\u0082E¯®LúiÅ\u0017\u00184cÑýþö\u009bÙ¹\u0007fw\u0003¾ \u009aÍÌë$\u0088lµ¿RÇ\u007fÆ\u001d#:vçZ\u0084\u0091¡×Oalr\tK6\u009fÓ©ñ(\u009e\u0004»WX\u0099\u0005§\u0000w\"¦Eõh\u0006\u008b]®&Ð§óÖ\u0016\u00119J\\i~·¡ÍÄ\u0018ç0\n2,\u0093OÆr\u0013\u0095?¸tÚ\u0082ý\u0094 àC5f>\u0088\u008a«ÕÎäñ:\u0014K6\u0085Y¥|ê\u009f|ÂHä\u0081\u0007æ*õMBp\u0017\u0092Öµë,\u001f\u000eÎi\u009dDn§5\u0082NüÏß¾:y\u0015\"p\u0001Rß\u008d¥èpËX&Z\u0000ëc©^z¹F\u0094\u0019öúÑµ\f\u0085oVJV¤÷\u0087ºâ\u008fÝK8 \u001aþu\u0088P\u0084³QîbÈù+À\u0006\u008fac\\<¾ó\u0099\u0084ôÕ×(2wmK\u0097×µ\u001fÒFÿé\u001cè9ÑG\u0016du\u0081¶®ðËÊé\u00176\u007fSõp\u008a\u009dÄ»0Øyåÿ\u0002\u008b/ÞMejt·NÔ\u009eñÍ\u001f <lYEf\u0091\u0083§¡yÎ\nëC\b\u008cUàs?\u0090\u0000½\u0017Úæçè\u0005 \"HO\u0010\u0000c\"¯Eèh\t\u008bP\u0000t\"¼EåhJ\u008bK®rÐµóÖ\u0016\u00159S\\i~´¡ÜÄVç7\nz,\u008fOÛr\u0010\u0095.¸8Ú\u0084ýÑ ¢C6fq\u0088\u0080«ÖÎçñ!\u0014A6\u0096Yà|ì\u009f%Â\nä\u0099\u0007æ*÷M\u0003pD\u0092\u009dµ¤Øºû\u001b\u001eBAec¦\u0086Å©\u0003ÌYïd\u0011¬½W\u009f\u009bøÜÕ=6d\u0013\u0012m\u008bNó«=\u0084}áWÃ\u009c\u001cøybZ\u0003·N\u0091»òïÏ$(\u001a\u0005\fg°@å\u009d\u0096þ\u0002ÛE5´\u0016âsÓL\u0015©u\u008b¢äÔÁØ\"\u0011\u007f>Y\u00adºÒ\u0097\u0087ð~Í#Qns¤\u0014ì9\u001aÚRÿk\u0081°¢\u0081G\u0010h\\\r{/ºðÃ\u0095U¶1[p}\u0091\u001eÄ#\u001eÄ+éw\u008b\u0080¬\u0097qï\u001227pÙ\u008a¿\u0081\u009dMú\n×ë4²\u0011ÄoFL!©à\u0086½ã\u0083Á\u0018\u001e9{üXÉµ\u0085\u0093nð(Í¾*Ê\u0007\u009fe$B0\u009f\u000füÞÙ\u00907a\u0014/q\u000fNÐ«æ\u0089ræ[ÃL ß}è[=¸\r\u0095Q\u0007\u0096%ZB\u001doü\u008c¥©Ó×Rô#\u0011ä>¿[\u009cyB¦8ÃíàÅ\rÇ+xH.uú\u0092Ë¿ÍÝqú$'WDÆa\u0084\u008ft¬?É\u0012öÖ\u0013¿1c^\u0015{S\u0098ÀÅ±ã~\u0000Z-\u0005Jòwå\u0095,²Bß\u0012üº\u0019ê\u0000r\"«Eèh\u001f\u008bJ®hÐôóÑ\u0016\u00049_\\x~¿¡ÅÄ\u0013ç*\nf,ÀOÝr\u0014\u0095%¸mÚ\u008aýÐ ¢C5fp\u0088\u0088«\u009aÎÿñ?\u0014P6\u009aYà|©\u009fgÂ\rA\u001dcÃ\u0004\u0086)tÊ,ïY\u0091Ø²©Wnx5\u001d\u0016?Èà²\u0085g¦OKMmì\u000e¹3lÔ@ù\u000b\u009bý¼ëa\u0098\u0002A'\u0005É³ê²\u008f\u009e°]U3w\u00ad\u0018\u0098=ÊÞ\u0004îÓÌ\u0011«B\u0086®eá@Ø>\u0011\u001dwøà×ý²È\u0090\u000bOl*£\t\u0099äÇÂ>¡j\u009cì{\u0089VÀ49\u0013qÎ^\u00ad\u0084\u0088\u008ef9Ed \\\u001fÆúãØ+·\u0004\u0092VqÌ,½\nséQ\u0000}\u0000&\"è\u0000|\"²\u0000/\"á\u0000!\"óI]D?R\u0001pÎo\u0002MÏ\u0018Ü1®\u0000+\"å\u0000-\"ã\u0000*ý³\u0000%Ãô`\u0088ÕVd\u008aAxc²\u0004ú)\fÊDï}\u0091¦²\u0097W\u0006xG\u001dv?¼àÔ\u0085\r¦6K'mÒ\u000e\u00923N(óº\u009e\u0098kÿ2ÒÙ1\u0083\u0014¨j|I\u001d¬Þ\u0083\u0091æçÄ~\u001b\u0013~Ø]ý°¸\u0096_õ\nÈÅ/¡\u0088Uª Íùà\u0012\u0003H&cX·{Ö\u009e\u0015±ZÔ,ö®)ÇL\u001do!\u0082|¤À\u0016¦4JS\f~è\u009dµ¸\u0097Æ\u0011å\"\u0000í/¸J\u008chO·9ÒúñÎ\u001c\u0099\u0000E\"¶Eìh\u000f\u008b[®rÐ±óÆ\u0016P9W\\h~¿¡ÆÄ\u0002ç-\nt,\u0089OËr\u000e\u0095j¸zÚ\u0093ýÀ ¢C7fq\u0088\u0098«\u009a\u0000r\"«Eúh\u0006\u008b]®eÐ óË\u0016\u001f9P\\,~¹¡ÄÄ\u0017ç7\na,ÀOÀr\u001d\u0095'¸}Ú\u0095ý\u0094 ñC8fq\u0088\u0099«ÖÎìñv\u0014F6\u0097Yà|è\u009f3ÂFä\u0094\u0007©*ãM\u0007pT\u0092Þµ®ØãûH\u001e_Ajc¤\u0086Ï©\rÌ]ï~\u0011±4ÉW\u001azb\u009d7¿öâ\u0082\u0005T(fK?mÃÅ\u008cçD\u0080\u0001\u00adæN¤k\u008b\u0015B6-Óûüá\u0099\u0080»Md8\u0001ü\"×Ï\u0089é?\u008a3·æP\u0095}\u0084\u001fu8$å\u000e\u0086Ê£\u0085M3n2\u000b\u001e4ÝÑ³ó-\u009c\u0018¹,Z\u0084\u0000n\"»Eðh\u0006Ã^á\u0096\u0086Á«\"Hg\u0000s\"»Eìh\u000f\u008bJ®&Ð§óÊ\u0016\u001f9K\\`~¾¡\u0088Ä\u0014ç!\n2,\u0086OÁr\u0010\u0095&¸wÚ\u0091ýÑ æCpf|\u0088\u0095«\u009aÎéñv\u0014I6\u0097Y´|æ\u009f3ÂNäØ\u0007¯*úM\u0014p_\u0092\u009dµ\u00adØîû\u0001\u001eYAj\u0000E\"¶Eìh\u000f\u008b[®rÐ±óÆ\u0016P9m\\x~¨¡ÁÄ\u0018ç#\n2,\u0082OÛr\b\u0095j¸\u007fÚ\u0089ýÀ ¢©\u0001ÚÄø\u0013\u009f]²ªQ¶tÃ\n\u001f)uÌþãã\u0086Ê¤\u001b{s\u001e´=\u008eÐ\u009cö,\u0095e¨òO\u0082bÙ\u0000$'vúC\u0099\u0089¼ÕR&q4\u0014D+\u0081Îªì=\u0083N¦VE\u0093\u0018è>#Ý\rð\u001a\u0097\u00adªøH$o\u0007\u0002F!æÄ¿\u009b\u0090¹[\u001f6C4aÿ\u0006·+FÈ@í-\u0093ä°\u0095U]z\n\u001f0=¢â\u0095\u0087@¤xIjoÏ\f\u009f1PÖzû`\u0099\u0099\u0000'ñrÓ\u0087´Þ\u00995zo_D!\u0090\u0002ñç2È}\u00ad\u000b\u008f\u0098Pá55\u0016CûZÝ¡¾©\u0083/d\u0002IT+¤\fýÑÖ\u0000E\"¶Eÿh\u000f\u008bH®rÐ½óÍ\u0016\u001e9\u001e\\{~²¡ÁÄ\u001aç!\n2,\u0087OËr\b\u0095>¸qÚ\u0088ýÓ ¢C>f{\u0088\u0094«ÎÎ¨ñ\"\u0014K6\u0099Y¥|à\u009fb½\u0091ÚØ÷(\u0014o1UO\u009alê\u00899¦9Ã\\á\u0095>æ[=x\u0006\u0095\u0015³·Ðìí>\n\u0006'VE¯bô¿\u0085Ü\u0016ùM\u0017ë4óQÊn\t\u008bw©õÆ\u0093ãÆ\u0000\u0010]h{±\u0097\u0013µ\u009cÒÉÿ-\u001cn9GGÇLmn\u009e\tÄ$'ÇsâZ\u009c\u0099¿îZx\u0000 \"¬Eéh\u001e\u008b\u0018®tÐ±óÁ\u0016\u00159W\\z~¿¡ÌÄV\u0000 \"ãE¼\u0000P\"¯Eîh\u0019\u008b]®tÐû=\u0001\u001fþx¿UH¶\u0000\u00939íâÎÓ+G\u0004\u000ea4Cç\u009c\u009cùCÚ57'\u0011Är\u009aO\r¨o\u0085&ç\u0097À\u0080\u001d¡~s[ µÏ\u0096\u0098".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1307);
        f6142 = cArr;
        f6143 = -7701051313826553138L;
    }

    /* renamed from: ﾒ */
    private static AbstractC2794fq m6697(AbstractC2794fq abstractC2794fq) {
        f6140 = (f6141 + 51) % 128;
        AbstractC2794fq abstractC2794fq2 = f6145.get(abstractC2794fq);
        if (abstractC2794fq2 == null) {
            int i = f6140 + 75;
            f6141 = i % 128;
            if (i % 2 == 0) {
                f6145.put(abstractC2794fq, abstractC2794fq);
                throw null;
            }
            f6145.put(abstractC2794fq, abstractC2794fq);
        } else {
            abstractC2794fq = abstractC2794fq2;
        }
        f6140 = (f6141 + 99) % 128;
        return abstractC2794fq;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r0
  0x001b: PHI (r0v10 com.ironsource.adqualitysdk.sdk.i.ee) = (r0v5 com.ironsource.adqualitysdk.sdk.i.ee), (r0v13 com.ironsource.adqualitysdk.sdk.i.ee) binds: [B:9:0x0025, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6679(com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee r2) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141
            int r0 = r0 + 11
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L1d
            java.util.Map<com.ironsource.adqualitysdk.sdk.i.ee, com.ironsource.adqualitysdk.sdk.i.ee> r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6144
            java.lang.Object r0 = r0.get(r2)
            com.ironsource.adqualitysdk.sdk.i.ee r0 = (com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee) r0
            r1 = 10
            int r1 = r1 / 0
            if (r0 != 0) goto L1b
            goto L27
        L1b:
            r2 = r0
            goto L2c
        L1d:
            java.util.Map<com.ironsource.adqualitysdk.sdk.i.ee, com.ironsource.adqualitysdk.sdk.i.ee> r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6144
            java.lang.Object r0 = r0.get(r2)
            com.ironsource.adqualitysdk.sdk.i.ee r0 = (com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee) r0
            if (r0 != 0) goto L1b
        L27:
            java.util.Map<com.ironsource.adqualitysdk.sdk.i.ee, com.ironsource.adqualitysdk.sdk.i.ee> r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6144
            r0.put(r2, r2)
        L2c:
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L39
            return r2
        L39:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6679(com.ironsource.adqualitysdk.sdk.i.ee):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Pair m6692(C2742ds c2742ds, List list) {
        f6141 = (f6140 + 29) % 128;
        Pair<String, AbstractC2755ee> pairM6664 = c2742ds.m6664(list);
        int i = f6140 + 67;
        f6141 = i % 128;
        if (i % 2 != 0) {
            return pairM6664;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final C2788fk m6703(List<C2748dy> list) {
        f6141 = (f6140 + 31) % 128;
        this.f6147 = 0;
        m6687(list, m6695(View.resolveSizeAndState(0, 0, 0) + 1, '0' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m6695(Drawable.resolveOpacity(0, 0) + 42, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        C2788fk c2788fkM6672 = m6672(list);
        int i = f6140 + 73;
        f6141 = i % 128;
        if (i % 2 != 0) {
            return c2788fkM6672;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private AbstractC2794fq m6694(List<C2748dy> list) {
        m6687(list, m6695(1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + InterfaceC3173h3.d.b.f8825h, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m6695(41 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 200, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern());
        AbstractC2755ee abstractC2755eeM6690 = m6690(list, m6695(1 - (ViewConfiguration.getTapTimeout() >> 16), 43 - Color.alpha(0), (char) (Process.getGidForName("") + 1)).intern());
        AbstractC2755ee abstractC2755eeM6702 = m6702(list);
        m6701(list, m6695(TextUtils.indexOf("", "") + 1, 43 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), abstractC2755eeM6702, m6695(33 - (ViewConfiguration.getWindowTouchSlop() >> 8), 241 - (ViewConfiguration.getTapTimeout() >> 16), (char) (38048 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern());
        AbstractC2794fq abstractC2794fqM6697 = m6697(new C2795fr(abstractC2755eeM6690, abstractC2755eeM6702, m6690(list, m6695(TextUtils.getOffsetAfter("", 0) + 1, 151 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57091)).intern()), m6698(list)));
        int i = f6140 + 119;
        f6141 = i % 128;
        if (i % 2 != 0) {
            return abstractC2794fqM6697;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bd  */
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq m6698(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r20) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6698(java.util.List):com.ironsource.adqualitysdk.sdk.i.fq");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6690(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141
            int r0 = r0 + 23
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1c
            com.ironsource.adqualitysdk.sdk.i.dy r0 = r6.m6661(r7)
            boolean r0 = r0.m6737(r8)
            r3 = 37
            int r3 = r3 / r1
            if (r0 != 0) goto L53
            goto L26
        L1c:
            com.ironsource.adqualitysdk.sdk.i.dy r0 = r6.m6661(r7)
            boolean r0 = r0.m6737(r8)
            if (r0 != 0) goto L53
        L26:
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r6.m6702(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = android.view.ViewConfiguration.getLongPressTimeout()
            int r3 = r3 >> 16
            int r3 = r3 + 36
            int r1 = android.view.KeyEvent.normalizeMetaState(r1)
            int r1 = r1 + 274
            java.lang.String r4 = ""
            int r4 = android.view.KeyEvent.keyCodeFromString(r4)
            r5 = 51117(0xc7ad, float:7.163E-41)
            int r5 = r5 - r4
            char r4 = (char) r5
            java.lang.String r1 = m6695(r3, r1, r4)
            java.lang.String r0 = com.google.android.gms.internal.ads.AbstractC2183w4.OooOO0o(r0, r1, r8)
            r6.m6701(r7, r8, r2, r0)
        L53:
            int r7 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r7 = r7 + 105
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6690(java.util.List, java.lang.String):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[PHI: r1 r9
  0x005b: PHI (r1v8 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v5 com.ironsource.adqualitysdk.sdk.i.dm), (r1v10 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:12:0x0058, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v7 java.lang.String) binds: [B:12:0x0058, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[PHI: r1 r9
  0x0086: PHI (r1v6 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v5 com.ironsource.adqualitysdk.sdk.i.dm), (r1v10 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:11:0x0056, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x0086: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v7 java.lang.String) binds: [B:11:0x0056, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6702(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r13) {
        /*
            r12 = this;
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r12.m6668(r13)
            boolean r1 = r12.m6660(r13)
            if (r1 == 0) goto Ld9
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r2
            int r1 = r1 % 2
            r2 = 48
            r3 = 3968(0xf80, float:5.56E-42)
            r4 = 1216(0x4c0, float:1.704E-42)
            r5 = 1
            java.lang.String r6 = ""
            r7 = -1
            r8 = 0
            if (r1 != 0) goto L40
            java.lang.String r1 = r12.f6146
            int r9 = r0.m6761()
            com.ironsource.adqualitysdk.sdk.i.dm r1 = com.ironsource.adqualitysdk.sdk.p009i.C2736dm.m6623(r1, r9)
            com.ironsource.adqualitysdk.sdk.i.dy r9 = r12.m6662(r13)
            java.lang.String r9 = r9.m6741()
            int r10 = r9.hashCode()
            r11 = 37
            int r11 = r11 / r8
            if (r10 == r4) goto L86
            if (r10 == r3) goto L5b
            goto Lb3
        L40:
            java.lang.String r1 = r12.f6146
            int r9 = r0.m6761()
            com.ironsource.adqualitysdk.sdk.i.dm r1 = com.ironsource.adqualitysdk.sdk.p009i.C2736dm.m6623(r1, r9)
            com.ironsource.adqualitysdk.sdk.i.dy r9 = r12.m6662(r13)
            java.lang.String r9 = r9.m6741()
            int r10 = r9.hashCode()
            if (r10 == r4) goto L86
            if (r10 == r3) goto L5b
            goto Lb3
        L5b:
            int r3 = android.view.View.resolveSizeAndState(r8, r8, r8)
            int r3 = r3 + 2
            int r4 = android.view.MotionEvent.axisFromString(r6)
            int r4 = 766 - r4
            int r2 = android.text.TextUtils.indexOf(r6, r2, r8)
            int r2 = (-1) - r2
            char r2 = (char) r2
            java.lang.String r2 = m6695(r3, r4, r2)
            java.lang.String r2 = r2.intern()
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto Lb3
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141
            int r2 = r2 + 63
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140 = r2
            r7 = r5
            goto Lb3
        L86:
            int r3 = android.text.TextUtils.indexOf(r6, r6, r8)
            int r3 = r3 + 2
            r4 = 0
            float r10 = android.graphics.PointF.length(r4, r4)
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            int r4 = r4 + 765
            int r2 = android.text.TextUtils.indexOf(r6, r2, r8, r8)
            int r2 = (-1) - r2
            char r2 = (char) r2
            java.lang.String r2 = m6695(r3, r4, r2)
            java.lang.String r2 = r2.intern()
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto Lb3
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r2 = r2 + 77
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r2
            r7 = r8
        Lb3:
            if (r7 == 0) goto Lcb
            if (r7 == r5) goto Lbd
            int r13 = r12.f6147
            int r13 = r13 - r5
            r12.f6147 = r13
            return r0
        Lbd:
            com.ironsource.adqualitysdk.sdk.i.fb r2 = new com.ironsource.adqualitysdk.sdk.i.fb
            com.ironsource.adqualitysdk.sdk.i.ee r13 = r12.m6702(r13)
            r2.<init>(r0, r13, r1)
            com.ironsource.adqualitysdk.sdk.i.ee r13 = m6679(r2)
            return r13
        Lcb:
            com.ironsource.adqualitysdk.sdk.i.em r2 = new com.ironsource.adqualitysdk.sdk.i.em
            com.ironsource.adqualitysdk.sdk.i.ee r13 = r12.m6702(r13)
            r2.<init>(r0, r13, r1)
            com.ironsource.adqualitysdk.sdk.i.ee r13 = m6679(r2)
            return r13
        Ld9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6702(java.util.List):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[PHI: r0
  0x005d: PHI (r0v7 com.ironsource.adqualitysdk.sdk.i.dm) = (r0v4 com.ironsource.adqualitysdk.sdk.i.dm), (r0v12 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031 A[EXC_TOP_SPLITTER, PHI: r0
  0x0031: PHI (r0v5 com.ironsource.adqualitysdk.sdk.i.dm) = (r0v4 com.ironsource.adqualitysdk.sdk.i.dm), (r0v12 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6693(com.ironsource.adqualitysdk.sdk.p009i.C2748dy r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L21
            java.lang.String r0 = r4.f6146
            int r1 = r5.m6738()
            com.ironsource.adqualitysdk.sdk.i.dm r0 = com.ironsource.adqualitysdk.sdk.p009i.C2736dm.m6623(r0, r1)
            boolean r1 = r5.m6731()
            r2 = 98
            int r2 = r2 / 0
            if (r1 == 0) goto L5d
            goto L31
        L21:
            java.lang.String r0 = r4.f6146
            int r1 = r5.m6738()
            com.ironsource.adqualitysdk.sdk.i.dm r0 = com.ironsource.adqualitysdk.sdk.p009i.C2736dm.m6623(r0, r1)
            boolean r1 = r5.m6731()
            if (r1 == 0) goto L5d
        L31:
            com.ironsource.adqualitysdk.sdk.i.fg r1 = new com.ironsource.adqualitysdk.sdk.i.fg     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = r5.m6741()     // Catch: java.lang.Exception -> L47
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L47
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L47
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L47
            com.ironsource.adqualitysdk.sdk.i.ee r5 = m6679(r1)     // Catch: java.lang.Exception -> L47
            return r5
        L47:
            com.ironsource.adqualitysdk.sdk.i.fe r1 = new com.ironsource.adqualitysdk.sdk.i.fe     // Catch: java.lang.Exception -> L9d
            java.lang.String r2 = r5.m6741()     // Catch: java.lang.Exception -> L9d
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L9d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L9d
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L9d
            com.ironsource.adqualitysdk.sdk.i.ee r5 = m6679(r1)     // Catch: java.lang.Exception -> L9d
            return r5
        L5d:
            boolean r1 = r5.m6735()
            if (r1 == 0) goto L79
            com.ironsource.adqualitysdk.sdk.i.fh r1 = new com.ironsource.adqualitysdk.sdk.i.fh
            java.lang.String r5 = r5.m6741()
            double r2 = java.lang.Double.parseDouble(r5)
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            r1.<init>(r5, r0)
            com.ironsource.adqualitysdk.sdk.i.ee r5 = m6679(r1)
            return r5
        L79:
            boolean r1 = r5.m6734()
            if (r1 == 0) goto L9d
            com.ironsource.adqualitysdk.sdk.i.fi r1 = new com.ironsource.adqualitysdk.sdk.i.fi
            java.lang.String r5 = r5.m6741()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1.<init>(r5, r0)
            com.ironsource.adqualitysdk.sdk.i.ee r5 = m6679(r1)
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r0 = r0 + 5
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r0
            return r5
        L9d:
            com.ironsource.adqualitysdk.sdk.i.fl r1 = new com.ironsource.adqualitysdk.sdk.i.fl
            java.lang.String r5 = r5.m6741()
            r1.<init>(r5, r0)
            com.ironsource.adqualitysdk.sdk.i.ee r5 = m6679(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6693(com.ironsource.adqualitysdk.sdk.i.dy):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* renamed from: ﻛ */
    private AbstractC2755ee m6681(AbstractC2755ee abstractC2755ee, List<C2748dy> list) {
        f6140 = (f6141 + 11) % 128;
        AbstractC2755ee abstractC2755eeM6702 = m6702(list);
        m6701(list, m6695((ViewConfiguration.getJumpTapTimeout() >> 16) + 1, 811 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (10414 - Gravity.getAbsoluteGravity(0, 0))).intern(), abstractC2755eeM6702, m6695(KeyEvent.getDeadChar(0, 0) + 35, 956 - View.MeasureSpec.getMode(0), (char) (50687 - View.MeasureSpec.getMode(0))).intern());
        C2748dy c2748dyM6662 = m6662(list);
        C2736dm c2736dmM6623 = C2736dm.m6623(this.f6146, c2748dyM6662.m6738());
        if (c2748dyM6662.m6737(m6695(1 - Color.red(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 790, (char) (54635 - (KeyEvent.getMaxKeyCode() >> 16))).intern())) {
            AbstractC2755ee abstractC2755eeM6679 = m6679(new C2757eg(abstractC2755ee, abstractC2755eeM6702, m6702(list), c2736dmM6623));
            f6140 = (f6141 + 35) % 128;
            return abstractC2755eeM6679;
        }
        this.f6147--;
        return m6679(new C2758eh(abstractC2755ee, abstractC2755eeM6702, c2736dmM6623));
    }

    /* renamed from: ﻐ */
    private static String m6680(String str, String str2, Object obj, String str3) {
        String string;
        f6140 = (f6141 + 89) % 128;
        String strOooOO0o = "";
        if (obj != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m6695(Color.argb(0, 0, 0, 0) + 7, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1239, (char) (View.combineMeasuredStates(0, 0) + 38707)).intern());
            sb.append(obj);
            string = sb.toString();
        } else {
            string = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6695((ViewConfiguration.getEdgeSlop() >> 16) + 9, Color.red(0) + 1246, (char) (19495 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern());
        sb2.append(str);
        sb2.append(string);
        sb2.append(m6695(TextUtils.indexOf("", "", 0) + 14, (Process.myPid() >> 22) + 1255, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern());
        sb2.append(str2);
        if (str3 != null) {
            strOooOO0o = AbstractC2183w4.OooOO0o(new StringBuilder(), m6695(3 - View.getDefaultSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1269, (char) View.getDefaultSize(0, 0)), str3);
        } else {
            f6140 = (f6141 + 93) % 128;
        }
        sb2.append(strOooOO0o);
        return sb2.toString();
    }

    /* renamed from: ｋ */
    private AbstractC2755ee m6689(AbstractC2755ee abstractC2755ee, List<C2748dy> list) {
        int i = f6140 + 69;
        f6141 = i % 128;
        List<AbstractC2755ee> listM6666 = null;
        if (i % 2 != 0) {
            C2748dy c2748dyM6662 = m6662(list);
            if (!c2748dyM6662.m6729()) {
                StringBuilder sb = new StringBuilder();
                sb.append(m6695(View.MeasureSpec.makeMeasureSpec(0, 0) + 28, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 865, (char) View.MeasureSpec.getSize(0)).intern());
                sb.append(c2748dyM6662);
                m6700(sb.toString(), null);
            }
            String strM6741 = c2748dyM6662.m6741();
            C2748dy c2748dyM66622 = m6662(list);
            if (!c2748dyM66622.m6737(m6695(1 - TextUtils.getOffsetBefore("", 0), 773 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 18785)).intern())) {
                if (!c2748dyM66622.m6737(m6695(1 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + InterfaceC3173h3.d.b.f8825h, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    this.f6147--;
                    return m6679(new C2751ea(abstractC2755ee, strM6741, C2736dm.m6623(strM6741, c2748dyM66622.m6738())));
                }
            } else {
                f6141 = (f6140 + 9) % 128;
                listM6666 = m6666(list);
                m6701(list, m6695(1 - View.MeasureSpec.getSize(0), 110 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L)).intern(), listM6666, m6695(Drawable.resolveOpacity(0, 0) + 63, 893 - View.MeasureSpec.getSize(0), (char) View.resolveSizeAndState(0, 0, 0)).intern());
            }
            return m6679(new C2754ed(abstractC2755ee, strM6741, listM6666, m6683(list, m6695(1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 151, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 57091)).intern()), C2736dm.m6623(strM6741, c2748dyM66622.m6738())));
        }
        m6662(list).m6729();
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6695(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6142[i2 + i3] ^ (i3 * f6143)) ^ c);
                        C2642a.f4436 = i3 + 1;
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

    /* renamed from: ﻛ */
    private List<AbstractC2755ee> m6683(List<C2748dy> list, String str) {
        List<AbstractC2755ee> listM6684 = m6684(list, str, new e<AbstractC2755ee>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2742ds.e
            /* renamed from: ﾇ */
            public final /* synthetic */ AbstractC2755ee mo6704(List list2) {
                return C2742ds.this.m6702((List<C2748dy>) list2);
            }
        });
        f6140 = (f6141 + InterfaceC3173h3.d.b.f8821d) % 128;
        return listM6684;
    }

    /* renamed from: ﻛ */
    private <T> List<T> m6684(List<C2748dy> list, String str, e<T> eVar) {
        ArrayList arrayList = new ArrayList();
        if (!m6662(list).m6737(str)) {
            f6141 = (f6140 + 69) % 128;
            this.f6147--;
            arrayList.add(eVar.mo6704(list));
            C2748dy c2748dyM6662 = m6662(list);
            while (c2748dyM6662.m6737(m6695(View.getDefaultSize(0, 0) + 1, ImageFormat.getBitsPerPixel(0) + 1121, (char) (7962 - Color.red(0))).intern())) {
                int i = f6141 + 107;
                f6140 = i % 128;
                if (i % 2 == 0) {
                    arrayList.add(eVar.mo6704(list));
                    c2748dyM6662 = m6662(list);
                } else {
                    arrayList.add(eVar.mo6704(list));
                    m6662(list);
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m6695(22 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 1121, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 17240)).intern());
            sb.append(str);
            m6699(c2748dyM6662, str, arrayList, AbstractC2183w4.OooOO0O(sb, m6695(1 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1142, (char) TextUtils.indexOf("", "", 0, 0))));
            f6141 = (f6140 + 121) % 128;
        }
        return arrayList;
    }

    /* renamed from: ﾒ */
    private void m6701(List<C2748dy> list, String str, Object obj, String str2) {
        f6141 = (f6140 + 47) % 128;
        m6699(m6662(list), str, obj, str2);
        int i = f6141 + InterfaceC3173h3.d.b.f8819b;
        f6140 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private void m6699(C2748dy c2748dy, String str, Object obj, String str2) {
        f6140 = (f6141 + 85) % 128;
        if (!c2748dy.m6737(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(m6695((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, 1143 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern());
            sb.append(str);
            String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6695(1 - View.MeasureSpec.makeMeasureSpec(0, 0), 1142 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) TextUtils.getCapsMode("", 0, 0)));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6695(1 - (ViewConfiguration.getLongPressTimeout() >> 16), 1143 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern());
            sb2.append(c2748dy.m6741());
            m6686(m6680(strOooOO0O, AbstractC2183w4.OooOO0O(sb2, m6695(TextUtils.getOffsetBefore("", 0) + 1, TextUtils.indexOf("", "") + 1143, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))), obj, str2));
        }
        f6141 = (f6140 + 119) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee m6688(com.ironsource.adqualitysdk.sdk.p009i.C2748dy r10, java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.m6741()
            int r1 = r0.hashCode()
            r2 = 3392903(0x33c587, float:4.75447E-39)
            r3 = 48
            r4 = 1
            java.lang.String r5 = ""
            r6 = 0
            if (r1 == r2) goto L47
            r2 = 109801339(0x68b6f7b, float:5.2449795E-35)
            if (r1 == r2) goto L19
            goto L73
        L19:
            int r1 = android.view.Gravity.getAbsoluteGravity(r6, r6)
            int r1 = r1 + 5
            int r2 = android.view.View.MeasureSpec.getMode(r6)
            int r2 = r2 + 995
            r7 = 49964(0xc32c, float:7.0014E-41)
            int r8 = android.text.TextUtils.lastIndexOf(r5, r3, r6, r6)
            int r7 = r7 - r8
            char r7 = (char) r7
            java.lang.String r1 = m6695(r1, r2, r7)
            java.lang.String r1 = r1.intern()
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ r4
            if (r0 == r4) goto L73
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r0 = r0 + 3
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r0
            r0 = r4
            goto L74
        L47:
            int r1 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r1 = r1 >> 16
            int r1 = 4 - r1
            int r2 = android.text.TextUtils.indexOf(r5, r5, r6)
            int r2 = r2 + 991
            int r7 = android.view.View.combineMeasuredStates(r6, r6)
            char r7 = (char) r7
            java.lang.String r1 = m6695(r1, r2, r7)
            java.lang.String r1 = r1.intern()
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ r4
            if (r0 == r4) goto L73
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6140
            int r0 = r0 + 99
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2742ds.f6141 = r0
            r0 = r6
            goto L74
        L73:
            r0 = -1
        L74:
            if (r0 == 0) goto Lf0
            if (r0 == r4) goto L7a
            r10 = 0
            return r10
        L7a:
            long r0 = android.view.ViewConfiguration.getZoomControlsTimeout()
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            int r1 = android.view.KeyEvent.getMaxKeyCode()
            int r1 = r1 >> 16
            int r1 = r1 + 788
            r2 = 50139(0xc3db, float:7.026E-41)
            int r3 = android.text.TextUtils.indexOf(r5, r3)
            int r3 = r3 + r2
            char r2 = (char) r3
            java.lang.String r0 = m6695(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            int r1 = android.view.View.getDefaultSize(r6, r6)
            int r1 = 47 - r1
            int r2 = android.view.KeyEvent.getMaxKeyCode()
            int r2 = r2 >> 16
            int r2 = 1000 - r2
            int r3 = android.text.TextUtils.indexOf(r5, r5)
            char r3 = (char) r3
            java.lang.String r1 = m6695(r1, r2, r3)
            java.lang.String r1 = r1.intern()
            r9.m6701(r11, r0, r10, r1)
            com.ironsource.adqualitysdk.sdk.i.el r0 = new com.ironsource.adqualitysdk.sdk.i.el
            int r1 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r1 = r1 >> 16
            int r1 = r1 + 5
            int r2 = android.widget.ExpandableListView.getPackedPositionGroup(r7)
            int r2 = 995 - r2
            r3 = 49965(0xc32d, float:7.0016E-41)
            int r4 = android.text.TextUtils.getTrimmedLength(r5)
            int r3 = r3 - r4
            char r3 = (char) r3
            java.lang.String r1 = m6695(r1, r2, r3)
            java.lang.String r1 = r1.intern()
            java.lang.String r2 = r9.f6146
            int r10 = r10.m6738()
            com.ironsource.adqualitysdk.sdk.i.dm r10 = com.ironsource.adqualitysdk.sdk.p009i.C2736dm.m6623(r2, r10)
            r0.<init>(r1, r10)
            com.ironsource.adqualitysdk.sdk.i.ee r10 = m6679(r0)
            com.ironsource.adqualitysdk.sdk.i.ee r10 = r9.m6689(r10, r11)
            return r10
        Lf0:
            com.ironsource.adqualitysdk.sdk.i.fn r10 = com.ironsource.adqualitysdk.sdk.p009i.C2791fn.m6801()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2742ds.m6688(com.ironsource.adqualitysdk.sdk.i.dy, java.util.List):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* renamed from: ﾒ */
    private void m6700(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(m6695((ViewConfiguration.getLongPressTimeout() >> 16) + 7, 1273 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) TextUtils.getTrimmedLength("")).intern());
        sb.append(this.f6148);
        sb.append(m6695((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 786, (char) (64924 - Color.alpha(0))).intern());
        sb.append(this.f6146);
        C2713cq.m6350(sb.toString(), str, th);
        throw new RuntimeException(m6695(29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-16775937) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 15697)).intern(), th);
    }

    /* renamed from: ﻛ */
    private void m6687(List<C2748dy> list, String str, String str2) {
        f6141 = (f6140 + InterfaceC3173h3.d.b.f8819b) % 128;
        m6701(list, str, (Object) null, str2);
        f6141 = (f6140 + 41) % 128;
    }

    /* renamed from: ﻛ */
    private void m6685(C2748dy c2748dy, C2748dy.e eVar, Object obj, String str) {
        f6140 = (f6141 + 53) % 128;
        if (!c2748dy.m6739().equals(eVar)) {
            int i = f6140 + 117;
            f6141 = i % 128;
            int i2 = i % 2;
            m6686(m6680(eVar.toString(), c2748dy.m6739().toString(), obj, str));
            if (i2 == 0) {
                int i3 = 16 / 0;
            }
            f6140 = (f6141 + 73) % 128;
        }
    }

    /* renamed from: ﻛ */
    private void m6686(String str) {
        int i = f6140 + 69;
        f6141 = i % 128;
        int i2 = i % 2;
        m6700(str, null);
        if (i2 == 0) {
            int i3 = 63 / 0;
        }
    }
}
