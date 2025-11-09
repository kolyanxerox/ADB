package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2809ge;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2830gz;
import com.ironsource.adqualitysdk.sdk.p009i.C2820gp;
import com.ironsource.adqualitysdk.sdk.p009i.C2827gw;
import com.ironsource.adqualitysdk.sdk.p009i.C2833hb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bc */
/* loaded from: classes2.dex */
public final class C2672bc {

    /* renamed from: ﺙ */
    private static int f5095 = 1;

    /* renamed from: ﻐ */
    private static List<String> f5096;

    /* renamed from: ﻛ */
    private static int f5097;

    /* renamed from: ｋ */
    private static long f5098;

    /* renamed from: ﾇ */
    private static Map<String, List<? extends AbstractC2813gi>> f5099;

    /* renamed from: ﾒ */
    private static int f5100;

    static {
        m5439();
        f5096 = Arrays.asList(m5444("┢╣ꥤ\ueb43鱌쀝㤨Ꝉ脾꒔鶟䏢涮᬴\uf015\u181a젒ｮ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern(), m5444("䂹䃸㿵\udebf巻嚌\u0cd4替\ue4a5㈅ꡣ艕࠵趺엎", 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m5444("䗒䖓磨诧鶲ᆑ妌ꚶ\ue1ce甘ﴻ䈜൞쪬邡᧻\ua8cd⻥㐇", -TextUtils.indexOf((CharSequence) "", '0')).intern());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(m5440(3 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 5 - KeyEvent.keyCodeFromString(""), 125 - KeyEvent.normalizeMetaState(0), "\ufff3\n\uffe7\b\u0015", true).intern(), m5445(new C2801fx()));
        linkedHashMap.put(m5440((ViewConfiguration.getScrollBarSize() >> 8) + 7, TextUtils.lastIndexOf("", '0', 0) + 10, (KeyEvent.getMaxKeyCode() >> 16) + 135, "�\u0016\u000b\n\uffdd\f\u000f\uffdd\t", false).intern(), m5445(new C2806gb()));
        linkedHashMap.put(m5444("ᘉᙈ恡櫘\ueae6ऌ뢒퇽눒涆ᰟ㕃", Color.alpha(0) + 1).intern(), m5445(new C2803fz()));
        linkedHashMap.put(m5440(3 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 9 - Color.alpha(0), KeyEvent.keyCodeFromString("") + 132, "\u0002\u0004￡\u0018\u0013\u0004￣\u0000\r", false).intern(), m5445(new AbstractC2809ge.a(), new AbstractC2809ge.c()));
        linkedHashMap.put(m5444("邔郖蠅Ꟛ᭽\ue171疄\u2067㒁藷턜쓟\ud812㩥", (KeyEvent.getMaxKeyCode() >> 16) + 1).intern(), m5445(new C2811gg()));
        linkedHashMap.put(m5444("㩱㨲狊嗛ꩥᮿ螀酀鹱缹⌚痁狪삻", View.combineMeasuredStates(0, 0) + 1).intern(), m5445(new C2810gf()));
        linkedHashMap.put(m5444("瀁灇搁䖴㏩ൽ韭ࣛ퐗槿㍵\uec49", -MotionEvent.axisFromString("")).intern(), m5445(new C2812gh()));
        linkedHashMap.put(m5440(4 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.red(0) + 7, View.resolveSize(0, 0) + 128, "\u0015\f\u0004￩\u0007\f￥", true).intern(), m5445(new C2808gd()));
        linkedHashMap.put(m5444("ﾬ￪\uf022᠐皨饖쩜䶚宙\ufdd7", -MotionEvent.axisFromString("")).intern(), m5445(new C2817gm()));
        linkedHashMap.put(m5444("ᾡῩ〱\uf32a\ue40b奕Ⅰ\udf2e뮘㷸", 1 - TextUtils.getOffsetAfter("", 0)).intern(), m5445(new C2815gk()));
        linkedHashMap.put(m5444("뎮돧梋\udde7\uf3bfǸྐ좇ី敳", 1 - TextUtils.getOffsetAfter("", 0)).intern(), m5445(new C2814gj()));
        linkedHashMap.put(m5444("壱墸Ꜻ蓘͈칉嚌㡺ﳷ\uaaca\uf215\udcf7ၰᕉ龟", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), m5445(new C2816gl()));
        linkedHashMap.put(m5444("\udf0f\udf46薥䠗\uea43\uecca驂텺笨衛㻌㗺鞄㟅", ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern(), m5445(new C2818gn()));
        linkedHashMap.put(m5444("\ue27f\ue232鯍흤낖\uf2b1Է议", TextUtils.getOffsetBefore("", 0) + 1).intern(), m5445(new C2819go()));
        linkedHashMap.put(m5444("毭殠귈ヱⲟ쒼\ue2a5ូ쿼ꀾ䘭\uf335⍩", Color.rgb(0, 0, 0) + 16777217).intern(), m5445(new C2820gp.b(), new C2820gp.d()));
        linkedHashMap.put(m5444("䟞䞓鸋⅝䰌\uf779\uf30b眴\ue3c9鏵", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m5445(new C2821gq()));
        linkedHashMap.put(m5444("⑩␤ᭋꁾﰄ爯爐윲聯ᚽ횵⎻", 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), m5445(new C2822gr()));
        linkedHashMap.put(m5440((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, 141 - (Process.myPid() >> 22), "\u000f￥�\u000b\b", false).intern(), m5445(new C2827gw(), new C2827gw.c()));
        linkedHashMap.put(m5440(4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 9 - TextUtils.indexOf("", "", 0), (Process.myPid() >> 22) + 136, "￩�\u0010￫\u0000\u0011\u0004\u000f￼", true).intern(), m5445(new C2823gs()));
        linkedHashMap.put(m5444("েঔꪤ胸朷쏔劣封귇Ꝛ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m5445(new C2825gu()));
        linkedHashMap.put(m5440(TextUtils.indexOf("", "") + 3, 12 - View.combineMeasuredStates(0, 0), 140 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\b\r￫�\u0005\u0007\u000b�\u000f\uffd9\n�", true).intern(), m5445(new C2824gt()));
        linkedHashMap.put(m5440(3 - Color.green(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, 140 - View.MeasureSpec.getMode(0), "\u0001\u0006\u0010￫\ufff8\u0007", false).intern(), m5445(new C2826gv()));
        linkedHashMap.put(m5440(View.resolveSize(0, 0) + 7, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, 138 - TextUtils.getOffsetAfter("", 0), "￭\ufffe\u0007￼\ufffe\u0007\r", false).intern(), m5445(new C2828gx()));
        linkedHashMap.put(m5444("\u0b5b\u0b0e븡ქ룭흒슶菎꽖돱是杕", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m5445(new C2833hb(), new C2833hb.b()));
        linkedHashMap.put(m5444("ἣή㌾ۓᣗ婖풇⏧묻㻊", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern(), m5445(new AbstractC2830gz.c(), new AbstractC2830gz.e()));
        linkedHashMap.put(m5444("뚆뛟쮵줾ᐾꋉ᭪⼍ኗ왜", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1).intern(), m5445(new C2832ha()));
        f5099 = Collections.unmodifiableMap(linkedHashMap);
        int i = f5095 + 123;
        f5100 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﱟ */
    public static void m5439() {
        f5098 = -3797466717238892259L;
        f5097 = 35;
    }

    /* renamed from: ﻐ */
    public static List<String> m5441() {
        int i = f5100;
        List<String> list = f5096;
        int i2 = i + 93;
        f5095 = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static List<AbstractC2813gi> m5442() {
        List<AbstractC2813gi> listAsList = Arrays.asList(new C2807gc(), new C2802fy(), new C2800fw());
        int i = f5095 + InterfaceC3173h3.d.b.f8826i;
        f5100 = i % 128;
        if (i % 2 == 0) {
            return listAsList;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static AbstractC2813gi m5443() {
        C2805ga c2805ga = new C2805ga();
        f5095 = (f5100 + 113) % 128;
        return c2805ga;
    }

    /* renamed from: ﾇ */
    private static List<? extends AbstractC2813gi> m5445(AbstractC2813gi... abstractC2813giArr) {
        int i = f5095 + 15;
        f5100 = i % 128;
        int i2 = i % 2;
        List<? extends AbstractC2813gi> listAsList = Arrays.asList(abstractC2813giArr);
        if (i2 != 0) {
            int i3 = 39 / 0;
        }
        return listAsList;
    }

    /* renamed from: ﾒ */
    public static String m5448() {
        int jumpTapTimeout;
        int i = f5095 + 67;
        f5100 = i % 128;
        if (i % 2 != 0) {
            ViewConfiguration.getJumpTapTimeout();
            jumpTapTimeout = 0;
        } else {
            jumpTapTimeout = 1 - (ViewConfiguration.getJumpTapTimeout() >> 16);
        }
        String strIntern = m5444("뱭밬」葼懘奴嘗嫺ᡸ㷰\uf2bb빧\uf4fc艛鼶\ue586元昑㮎", jumpTapTimeout).intern();
        f5100 = (f5095 + 99) % 128;
        return strIntern;
    }

    /* renamed from: ﻐ */
    private static String m5440(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f5097);
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
    private static String m5444(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5098, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5098));
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

    /* renamed from: ﾇ */
    public static Map<String, List<AbstractC2813gi>> m5446() {
        ArrayList arrayList = new ArrayList(f5099.keySet());
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i = f5100 + 25;
            f5095 = i % 128;
            if (i % 2 == 0) {
                f5099.get((String) it.next());
                throw null;
            }
            String str = (String) it.next();
            List<? extends AbstractC2813gi> list = f5099.get(str);
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                f5100 = (f5095 + 1) % 128;
                for (AbstractC2813gi abstractC2813gi : list) {
                    f5095 = (f5100 + 53) % 128;
                    if (m5447(abstractC2813gi)) {
                        f5100 = (f5095 + 73) % 128;
                        arrayList2.add(abstractC2813gi);
                        f5095 = (f5100 + 23) % 128;
                    }
                }
                map.put(str, arrayList2);
            }
        }
        f5095 = (f5100 + 9) % 128;
        return map;
    }

    /* renamed from: ﾇ */
    public static boolean m5447(AbstractC2813gi abstractC2813gi) {
        f5095 = (f5100 + 7) % 128;
        try {
            if (!Prode.m4894()) {
                Class.forName(abstractC2813gi.mo6812());
                return true;
            }
            abstractC2813gi.mo6814();
            f5095 = (f5100 + 119) % 128;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
