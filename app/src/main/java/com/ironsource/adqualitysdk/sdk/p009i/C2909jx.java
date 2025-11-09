package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.p009i.C2835hd;
import com.ironsource.adqualitysdk.sdk.p009i.C2836he;
import com.ironsource.adqualitysdk.sdk.p009i.C2837hf;
import com.ironsource.adqualitysdk.sdk.p009i.C2841hj;
import com.ironsource.adqualitysdk.sdk.p009i.ViewOnClickListenerC2834hc;
import com.ironsource.adqualitysdk.sdk.p009i.ViewOnTouchListenerC2842hk;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jx */
/* loaded from: classes2.dex */
public final class C2909jx {

    /* renamed from: ﭴ */
    private static int f7166 = 0;

    /* renamed from: ﭸ */
    private static int f7167 = 1;

    /* renamed from: ﱟ */
    private static Field f7169;

    /* renamed from: ﻐ */
    private static Field f7173;

    /* renamed from: ﻛ */
    private static Class f7174;

    /* renamed from: ｋ */
    private static Field f7175;

    /* renamed from: ﾇ */
    private static Field f7176;

    /* renamed from: ﾒ */
    private static Object f7177;

    /* renamed from: ﺙ */
    private static int[] f7171 = {-1923904062, 1352515179, -760308427, -1709564255, 302879637, 476994724, -2117450483, -641312175, 1768947303, 1127123419, 447320613, 611676961, 1929253129, 339476148, 1424911335, 1654046350, 1448923684, -811017972};

    /* renamed from: ﻏ */
    private static long f7172 = 2420180939209451931L;

    /* renamed from: ﮐ */
    private static int f7168 = 0;

    /* renamed from: ﱡ */
    private static char f7170 = 0;

    /* renamed from: ﻐ */
    public static List<View> m7356() {
        f7167 = (f7166 + 19) % 128;
        int i = f7167 + 23;
        f7166 = i % 128;
        try {
            if (i % 2 != 0) {
                throw null;
            }
            if (f7174 == null || f7177 == null) {
                Class<?> cls = Class.forName(m7366(new int[]{555387842, -2013086787, -1425610566, -1386611521, 1237234858, 1950363136, -238519485, -102738963, 92223296, -2126077007, -243354794, 555987868, -1240001916, 1007430018, 291133235, 1930611849}, 'P' - AndroidCharacter.getMirror('0')).intern());
                f7174 = cls;
                f7177 = cls.getMethod(m7366(new int[]{1778691217, -1468407431, -233598046, -795076234, -1468552969, 412712052}, 11 - View.MeasureSpec.getMode(0)).intern(), null).invoke(null, null);
                f7167 = (f7166 + 17) % 128;
            }
            return m7363(f7174, f7177);
        } catch (Throwable th) {
            String strIntern = m7354(ViewConfiguration.getKeyRepeatDelay() >> 16, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7366(new int[]{-900831722, -1736110050, 1542342729, 609300590, -484840107, 786431277, 2131312034, 1493420663, 1574923121, -1608806561, -34301074, -1872324279, -368897939, 1818455703, 1237234858, 1950363136, 736630255, 1703946158}, 36 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
            sb.append(th.getLocalizedMessage());
            C2921n.m7500(strIntern, sb.toString());
            return new ArrayList();
        }
    }

    /* renamed from: ﻛ */
    public static View.OnClickListener m7359(View view) {
        try {
            Object objM7353 = m7353(view);
            if (objM7353 == null) {
                return null;
            }
            Class<?> cls = objM7353.getClass();
            synchronized (C2906ju.class) {
                try {
                    if (f7175 == null) {
                        f7175 = m7355(cls, m7366(new int[]{1136170089, 226630617, -367168446, -1546278135, -1448747092, -351468026, 1094552337, -1411966917}, KeyEvent.keyCodeFromString("") + 16).intern());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnClickListener) f7175.get(objM7353);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾇ */
    public static void m7364(MediaPlayer mediaPlayer, C2841hj.a aVar) throws IllegalAccessException, IllegalArgumentException {
        Field fieldM7355;
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
        int i = f7167 + 13;
        f7166 = i % 128;
        try {
            if (i % 2 != 0) {
                fieldM7355 = m7355(MediaPlayer.class, m7366(new int[]{-1467473614, -1703507003, 1558417728, -1040949433, 1105852153, -567080721, -861949381, -1493733318, 1991901057, -832310979, -396467703, -432722303}, 92 % (TypedValue.complexToFloat(1) > 0.0f ? 1 : (TypedValue.complexToFloat(1) == 0.0f ? 0 : -1))).intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM7355.get(mediaPlayer);
                if (!(onSeekCompleteListener instanceof C2841hj)) {
                    fieldM7355.set(mediaPlayer, new C2841hj(onSeekCompleteListener, aVar));
                }
            } else {
                fieldM7355 = m7355(MediaPlayer.class, m7366(new int[]{-1467473614, -1703507003, 1558417728, -1040949433, 1105852153, -567080721, -861949381, -1493733318, 1991901057, -832310979, -396467703, -432722303}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23).intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM7355.get(mediaPlayer);
                if (!(onSeekCompleteListener instanceof C2841hj)) {
                    fieldM7355.set(mediaPlayer, new C2841hj(onSeekCompleteListener, aVar));
                }
            }
            f7167 = (f7166 + 93) % 128;
        } catch (Exception e) {
            C2914kb.m7426(m7354(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m7354((Process.getThreadPriority(0) + 20) >> 6, (char) Color.red(0), "\uddb5임搳蝐", "ﻬ蚈Ꝗ\ue482\ue14b磮들刿ԯⶢᄊ蘮삼㫲겒ꦾ聤膪ᓏ嬌ᡶ⸡㏶ꍖᾁ℻\u1c8e⳺뤓涿◈㠮昊妏蟻먿枺⠡", "⦛헀㖽↖").intern(), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ */
    public static View.OnTouchListener m7365(View view) {
        try {
            Object objM7353 = m7353(view);
            if (objM7353 == null) {
                return null;
            }
            Class<?> cls = objM7353.getClass();
            synchronized (C2906ju.class) {
                try {
                    if (f7169 == null) {
                        f7169 = m7355(cls, m7366(new int[]{-1998069456, 1337773769, 1665038695, -1241914322, -1448747092, -351468026, 1094552337, -1411966917}, KeyEvent.getDeadChar(0, 0) + 16).intern());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnTouchListener) f7169.get(objM7353);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻛ */
    public static void m7360(MediaPlayer mediaPlayer, C2835hd.e eVar) throws IllegalAccessException, IllegalArgumentException {
        f7166 = (f7167 + 45) % 128;
        try {
            Field fieldM7355 = m7355(MediaPlayer.class, m7354((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1690403865, (char) (Color.red(0) + 4883), "᪓솄፤묓", "쩣\udbee洑\uf6f2᪽㚆緧Ḹ\uf0e7縵霚駁띪혥빥", "⦛헀㖽↖").intern());
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) fieldM7355.get(mediaPlayer);
            if (onInfoListener instanceof C2835hd) {
                return;
            }
            fieldM7355.set(mediaPlayer, new C2835hd(onInfoListener, eVar));
            f7166 = (f7167 + 5) % 128;
        } catch (Exception e) {
            C2914kb.m7426(m7354(KeyEvent.getMaxKeyCode() >> 16, (char) TextUtils.getOffsetAfter("", 0), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m7366(new int[]{-338193475, -472757021, -1727675446, 111624720, 1630474755, 1614818785, -892682005, -678146655, 1953239672, 1934030154, -1803596905, -691560447, -253275399, -624747524, 1991901057, -832310979, -396467703, -432722303}, 35 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ */
    private static String m7366(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f7171.clone();
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

    /* renamed from: ﻐ */
    public static void m7357(View view, ViewOnClickListenerC2834hc.d dVar) {
        View.OnClickListener onClickListenerM7359 = m7359(view);
        if (!(onClickListenerM7359 instanceof ViewOnClickListenerC2834hc)) {
            view.setOnClickListener(new ViewOnClickListenerC2834hc(onClickListenerM7359, dVar));
            f7167 = (f7166 + 83) % 128;
        }
        int i = f7166 + 95;
        f7167 = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }

    /* renamed from: ﾇ */
    private static List<View> m7363(Class cls, Object obj) throws Exception {
        if (f7173 == null) {
            f7166 = (f7167 + 35) % 128;
            Field declaredField = cls.getDeclaredField(m7354(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (5438 - AndroidCharacter.getMirror('0')), "瘄ᗳๅ鬕", "⛍Ꜧ웥냷쵾斑", "⦛헀㖽↖").intern());
            f7173 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f7173.get(obj);
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof View[]) {
                return Arrays.asList((View[]) f7173.get(obj));
            }
            ArrayList arrayList = new ArrayList();
            f7166 = (f7167 + 113) % 128;
            return arrayList;
        }
        return (List) f7173.get(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r1 != null) goto L11;
     */
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.media.MediaPlayer m7352(android.widget.VideoView r8) {
        /*
            r0 = 12
            r1 = 6
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2909jx.f7166
            int r2 = r2 + 115
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2909jx.f7167 = r3
            int r2 = r2 % 2
            r3 = 0
            java.lang.Class<android.widget.VideoView> r4 = android.widget.VideoView.class
            java.lang.String r5 = ""
            if (r2 != 0) goto L31
            int[] r1 = new int[r1]     // Catch: java.lang.Exception -> L2f
            r1 = {x0090: FILL_ARRAY_DATA , data: [-19716437, 1466371404, -2146731544, 875908546, 520464034, 835968042} // fill-array     // Catch: java.lang.Exception -> L2f
            int r2 = android.text.TextUtils.indexOf(r5, r5)     // Catch: java.lang.Exception -> L2f
            r5 = 102(0x66, float:1.43E-43)
            int r5 = r5 % r2
            java.lang.String r1 = m7366(r1, r5)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Exception -> L2f
            java.lang.reflect.Field r1 = m7355(r4, r1)     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L8f
            goto L49
        L2f:
            r8 = move-exception
            goto L5d
        L31:
            int[] r1 = new int[r1]     // Catch: java.lang.Exception -> L2f
            r1 = {x00a0: FILL_ARRAY_DATA , data: [-19716437, 1466371404, -2146731544, 875908546, 520464034, 835968042} // fill-array     // Catch: java.lang.Exception -> L2f
            int r2 = android.text.TextUtils.indexOf(r5, r5)     // Catch: java.lang.Exception -> L2f
            int r2 = r2 + r0
            java.lang.String r1 = m7366(r1, r2)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Exception -> L2f
            java.lang.reflect.Field r1 = m7355(r4, r1)     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L8f
        L49:
            java.lang.Object r8 = r1.get(r8)     // Catch: java.lang.Exception -> L2f
            android.media.MediaPlayer r8 = (android.media.MediaPlayer) r8     // Catch: java.lang.Exception -> L2f
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2909jx.f7166
            int r0 = r0 + 25
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2909jx.f7167 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L5c
            return r8
        L5c:
            throw r3
        L5d:
            r1 = 0
            int r2 = android.view.View.combineMeasuredStates(r1, r1)
            int r4 = android.os.Process.myPid()
            int r4 = r4 >> 22
            char r4 = (char) r4
            java.lang.String r5 = "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f"
            java.lang.String r6 = "⦛헀㖽↖"
            java.lang.String r7 = "蕯圝ᩫ\uf5df"
            java.lang.String r2 = m7354(r2, r4, r7, r5, r6)
            java.lang.String r2 = r2.intern()
            int[] r0 = new int[r0]
            r0 = {x00b0: FILL_ARRAY_DATA , data: [-338193475, -472757021, -1727675446, 111624720, -1071797832, -1740749983, -892639246, 1862697340, -778259287, 1026853203, 1919967807, 2040085846} // fill-array
            int r4 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r4 = r4 >> 16
            int r4 = r4 + 23
            java.lang.String r0 = m7366(r0, r4)
            java.lang.String r0 = r0.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2914kb.m7426(r2, r0, r8, r1)
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2909jx.m7352(android.widget.VideoView):android.media.MediaPlayer");
    }

    /* renamed from: ﻛ */
    public static void m7361(MediaPlayer mediaPlayer, C2836he.a aVar) throws IllegalAccessException, IllegalArgumentException {
        f7167 = (f7166 + 23) % 128;
        try {
            Field fieldM7355 = m7355(MediaPlayer.class, m7366(new int[]{1136170089, 226630617, 1105852153, -567080721, -1440583948, 934742380, -1698051916, -496321564, 1867588837, 2111740736, 668844379, 1486729200}, Color.blue(0) + 21).intern());
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM7355.get(mediaPlayer);
            if (onCompletionListener instanceof C2836he) {
                return;
            }
            fieldM7355.set(mediaPlayer, new C2836he(onCompletionListener, aVar));
            f7166 = (f7167 + 41) % 128;
        } catch (Exception e) {
            C2914kb.m7426(m7354(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (ViewConfiguration.getLongPressTimeout() >> 16), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m7354(472391825 - TextUtils.getOffsetBefore("", 0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 25909), "酖⠠㔜\uf765", "봄邢᳧池\uefb7↚솧雜㧢\udf82ꒂ\ue32fၸ蕩氀貏꽹볏\uf178놞帻璟﨨橨銘潱㇤\u05cd흜Ὁ밄\ue689괅嘦喆뾴\u038bᠦԌ∺踪", "⦛헀㖽↖").intern(), (Throwable) e, false);
        }
    }

    /* renamed from: ﻐ */
    private static Object m7353(View view) {
        try {
            synchronized (C2906ju.class) {
                try {
                    if (f7176 == null) {
                        f7176 = m7355(View.class, m7366(new int[]{-2038419368, -677480854, 1867588837, 2111740736, 1983353245, -577017425, 516020469, 1922639966}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12).intern());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f7176.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻛ */
    public static void m7362(MediaPlayer mediaPlayer, C2837hf.c cVar) throws IllegalAccessException, IllegalArgumentException {
        f7167 = (f7166 + 37) % 128;
        try {
            Field fieldM7355 = m7355(MediaPlayer.class, m7354((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 199864813, (char) (42965 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "ᐥᙎ헴膧", "鄰\ud974팈祽쩘緝\uf50b\udf92䪟闏굊ᬶ뺔Ⅷ⺆툔\ud848甸枿", "⦛헀㖽↖").intern());
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM7355.get(mediaPlayer);
            if (!(onPreparedListener instanceof C2837hf)) {
                fieldM7355.set(mediaPlayer, new C2837hf(onPreparedListener, cVar));
            }
            f7166 = (f7167 + 41) % 128;
        } catch (Exception e) {
            C2914kb.m7426(m7354(TextUtils.indexOf("", "", 0, 0), (char) TextUtils.indexOf("", "", 0), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m7366(new int[]{-338193475, -472757021, -1727675446, 111624720, 1630474755, 1614818785, -892682005, -678146655, 1953239672, 1934030154, -310556463, -1551829289, -862212217, 1724229271, 1771150069, -1589732459, 1991901057, -832310979, -396467703, -432722303}, 39 - TextUtils.getOffsetBefore("", 0)).intern(), (Throwable) e, false);
        }
    }

    /* renamed from: ﻐ */
    private static Field m7355(Class cls, String str) throws NoSuchFieldException, SecurityException {
        Field declaredField;
        int i = f7166 + 69;
        f7167 = i % 128;
        try {
            if (i % 2 == 0) {
                declaredField = cls.getDeclaredField(str);
            } else {
                declaredField = cls.getDeclaredField(str);
            }
            declaredField.setAccessible(true);
            int i2 = f7166 + 39;
            f7167 = i2 % 128;
            if (i2 % 2 != 0) {
                return declaredField;
            }
            throw null;
        } catch (Exception e) {
            C2914kb.m7426(m7354(View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m7354((-2045575255) - Gravity.getAbsoluteGravity(0, 0), (char) ExpandableListView.getPackedPositionType(0L), "ꤥዿ㖆䆪", "⥠\udd9c팔쌚簀톊┫䥅\ude1bܐ\ue033ഥ㑅\udfab펮芅\ud944輜綰\ud9f0꓅˹䆻젠賏", "⦛헀㖽↖").intern(), (Throwable) e, false);
            return null;
        }
    }

    /* renamed from: ﻐ */
    public static void m7358(View view, ViewOnTouchListenerC2842hk.d dVar) {
        View.OnTouchListener onTouchListenerM7365 = m7365(view);
        if (!(onTouchListenerM7365 instanceof ViewOnTouchListenerC2842hk)) {
            view.setOnTouchListener(new ViewOnTouchListenerC2842hk(onTouchListenerM7365, dVar));
            f7166 = (f7167 + 59) % 128;
        }
        int i = f7166 + 45;
        f7167 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    private static String m7354(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f7172) ^ f7168) ^ f7170);
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
}
