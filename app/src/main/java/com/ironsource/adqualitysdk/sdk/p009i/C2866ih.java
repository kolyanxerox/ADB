package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ih */
/* loaded from: classes2.dex */
public final class C2866ih {

    /* renamed from: ﭖ */
    private static int f6746 = 0;

    /* renamed from: ﮉ */
    private static int f6747 = 1;

    /* renamed from: ﮌ */
    private static long f6748;

    /* renamed from: ﮐ */
    private static long f6749;

    /* renamed from: ﱟ */
    private static C2866ih f6750;

    /* renamed from: ﺙ */
    private static char[] f6751;

    /* renamed from: ﻏ */
    private static final Object f6752;

    /* renamed from: ﱡ */
    private final Handler f6753;

    /* renamed from: ﻐ */
    private final Context f6754;

    /* renamed from: ﻛ */
    private boolean f6755 = true;

    /* renamed from: ﾇ */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f6757 = new HashMap<>();

    /* renamed from: ｋ */
    private final HashMap<String, ArrayList<e>> f6756 = new HashMap<>();

    /* renamed from: ﾒ */
    private final ArrayList<d> f6758 = new ArrayList<>();

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ih$d */
    public static class d {

        /* renamed from: ﻛ */
        final ArrayList<e> f6760;

        /* renamed from: ｋ */
        final Intent f6761;

        public d(Intent intent, ArrayList<e> arrayList) {
            this.f6761 = intent;
            this.f6760 = arrayList;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ih$e */
    public static class e {

        /* renamed from: ﮐ */
        private static int f6762 = 1;

        /* renamed from: ﻐ */
        private static long f6763 = -5058332882042908242L;

        /* renamed from: ﻛ */
        private static int f6764;

        /* renamed from: ｋ */
        boolean f6765;

        /* renamed from: ﾇ */
        final IntentFilter f6766;

        /* renamed from: ﾒ */
        final BroadcastReceiver f6767;

        /* renamed from: ﻐ */
        private static String m7099(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2804g.f6422) {
                try {
                    C2804g.f6423 = i;
                    char[] cArr2 = new char[cArr.length];
                    C2804g.f6421 = 0;
                    while (true) {
                        int i2 = C2804g.f6421;
                        if (i2 < cArr.length) {
                            cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6763);
                            C2804g.f6421++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append(m7099("釼磄䏓⫦㗻Დ\ue791캵\ud9ad", 59663 - View.combineMeasuredStates(0, 0)).intern());
            sb.append(this.f6767);
            sb.append(m7099("醎\udbd5\u05fd侕릮\ue35a\u2d72靘", View.MeasureSpec.makeMeasureSpec(0, 0) + 18973).intern());
            sb.append(this.f6766);
            String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m7099("釓", Color.alpha(0) + 60737));
            f6762 = (f6764 + 35) % 128;
            return strOooOO0O;
        }
    }

    static {
        m7092();
        f6752 = new Object();
        f6746 = (f6747 + 123) % 128;
    }

    private C2866ih(Context context) {
        this.f6754 = context;
        this.f6753 = new Handler(context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.ih.5
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    C2866ih.m7089(C2866ih.this);
                }
            }
        };
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m7089(C2866ih c2866ih) {
        int i = f6747 + 59;
        f6746 = i % 128;
        int i2 = i % 2;
        c2866ih.m7094();
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public static void m7092() {
        f6749 = 4406068861374965067L;
        f6751 = new char[]{6249, 17321, 44966, 2993, 30603, 54174, 16280, 39828, 51172, 9140, 36841, 60383, 22495, 46037, 8089, 48861, 58745, 2416, 44400, 53572, 30019, 39250, 15644, 'A', 23444, 47002, 5004, 28595, 52157, 10218, 33709, 57297, 15324, 38866, 62375, 20404, 42996, 64515, 4220, 46168, 51300, 27763, 32891, 9319, 30795, 39944, 12370, 21565, 59425, 3117, 41009, 50376, 6352, 48275, 53483, 29933, 35050, 11506, 16527, 58497, 14469, 23787, 61603, 5309, 43188, 52554, 24898, 47923, 57540, 3259, 43167, 54435, 28852, 40124, 14496, 25739, 32977, 11476, 18682, 62692, 4336, 48372, 55310, 1090, 41044, 52333, 26667, 37950, 12324, 23626, 63562, 9222, 16444, 60541, 58975, 48554, 20900, 62898, 35213, 11651, 'c', 23446, 47002, 4992, 28603, 52156, 10168, 33720, 't', 23438, 47006, 4992, 26344, 15620, 53528, 29974, 2350, 44345, 16697, 58748, 47447, 23895, 61786, 38259, 10598, 52600};
        f6748 = -1139156583847797769L;
    }

    /* renamed from: ﾇ */
    private void m7094() {
        int size;
        d[] dVarArr;
        while (true) {
            synchronized (this.f6757) {
                try {
                    size = this.f6758.size();
                    if (size <= 0) {
                        return;
                    }
                    dVarArr = new d[size];
                    this.f6758.toArray(dVarArr);
                    this.f6758.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                d dVar = dVarArr[i];
                for (int i2 = 0; i2 < dVar.f6760.size(); i2++) {
                    dVar.f6760.get(i2).f6767.onReceive(this.f6754, dVar.f6761);
                }
            }
        }
    }

    /* renamed from: ﾒ */
    private void m7095() {
        synchronized (this.f6757) {
            try {
                Iterator it = new HashMap(this.f6757).keySet().iterator();
                while (it.hasNext()) {
                    m7088((BroadcastReceiver) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ｋ */
    public final synchronized void m7098() {
        try {
            int i = f6746 + 7;
            f6747 = i % 128;
            if (i % 2 == 0) {
                this.f6755 = false;
            } else {
                this.f6755 = false;
            }
            m7095();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﻛ */
    public static C2866ih m7090(Context context) {
        C2866ih c2866ih;
        synchronized (f6752) {
            try {
                if (f6750 == null) {
                    f6750 = new C2866ih(context.getApplicationContext());
                }
                c2866ih = f6750;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2866ih;
    }

    /* renamed from: ﻐ */
    public final synchronized void m7096() {
        int i = f6747 + 35;
        f6746 = i % 128;
        int i2 = i % 2;
        this.f6755 = true;
    }

    /* renamed from: ﻐ */
    private void m7088(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f6757) {
            try {
                ArrayList<IntentFilter> arrayListRemove = this.f6757.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int i = 0; i < arrayListRemove.size(); i++) {
                    IntentFilter intentFilter = arrayListRemove.get(i);
                    for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                        String action = intentFilter.getAction(i2);
                        ArrayList<e> arrayList = this.f6756.get(action);
                        if (arrayList != null) {
                            int i3 = 0;
                            while (i3 < arrayList.size()) {
                                if (arrayList.get(i3).f6767 == broadcastReceiver) {
                                    arrayList.remove(i3);
                                    i3--;
                                }
                                i3++;
                            }
                            if (arrayList.size() <= 0) {
                                this.f6756.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ｋ */
    private static String m7093(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6751[i2 + i3] ^ (i3 * f6748)) ^ c);
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
    public final boolean m7097(Intent intent) {
        char c;
        long j;
        ArrayList<e> arrayList;
        String str;
        String str2;
        String strIntern;
        String strIntern2 = m7091("┇쾉\uf072\ue52d输끨ꔷ侟灂攺\u0feaぅ┤쿶\uf070\ue509迵끗ꔆ俹炽", AndroidCharacter.getMirror('0') + 60029).intern();
        if (!this.f6755) {
            return false;
        }
        synchronized (this.f6757) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f6754.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    c = '0';
                    j = 0;
                    sb.append(m7093((ViewConfiguration.getScrollBarSize() >> 8) + 15, TextUtils.indexOf("", "", 0), (char) (ImageFormat.getBitsPerPixel(0) + 6204)).intern());
                    sb.append(strResolveTypeIfNeeded);
                    sb.append(m7093(8 - Drawable.resolveOpacity(0, 0), (-16777201) - Color.rgb(0, 0, 0), (char) (48894 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern());
                    sb.append(scheme);
                    sb.append(m7091("╫瞳考튮潾맖쪵朏놝쉰\u1c8d", 21142 - ImageFormat.getBitsPerPixel(0)).intern());
                    sb.append(intent);
                    Log.v(strIntern2, sb.toString());
                } else {
                    c = '0';
                    j = 0;
                }
                ArrayList<e> arrayList2 = this.f6756.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m7093((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 12, Process.getGidForName("") + 24, (char) KeyEvent.getDeadChar(0, 0)).intern());
                        sb2.append(arrayList2);
                        Log.v(strIntern2, sb2.toString());
                    }
                    ArrayList arrayList3 = null;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        e eVar = arrayList2.get(i);
                        if (z) {
                            StringBuilder sb3 = new StringBuilder();
                            arrayList = arrayList2;
                            sb3.append(m7091("┆㼻ᄝ欛䵧ꝷ륃鍛\uf5e3쾳ↆ㮑ᷮ矸䧖ꏀ葻鸌\uf010쩤Ⱬًᡏ独", 6673 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
                            sb3.append(eVar.f6766);
                            Log.v(strIntern2, sb3.toString());
                        } else {
                            arrayList = arrayList2;
                        }
                        if (eVar.f6765) {
                            if (z) {
                                Log.v(strIntern2, m7093(31 - (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 36, (char) (ExpandableListView.getPackedPositionType(j) + 42964)).intern());
                            }
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                        } else {
                            int iMatch = eVar.f6766.match(action, strResolveTypeIfNeeded, scheme, data, categories, strIntern2);
                            if (iMatch >= 0) {
                                if (z) {
                                    StringBuilder sb4 = new StringBuilder();
                                    str = action;
                                    str2 = strResolveTypeIfNeeded;
                                    sb4.append(m7093(27 - ((Process.getThreadPriority(0) + 20) >> 6), 67 - View.getDefaultSize(0, 0), (char) (Color.blue(0) + 47891)).intern());
                                    sb4.append(Integer.toHexString(iMatch));
                                    Log.v(strIntern2, sb4.toString());
                                } else {
                                    str = action;
                                    str2 = strResolveTypeIfNeeded;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(eVar);
                                eVar.f6765 = true;
                            } else {
                                str = action;
                                str2 = strResolveTypeIfNeeded;
                                if (z) {
                                    if (iMatch == -4) {
                                        strIntern = m7093(View.MeasureSpec.getMode(0) + 8, ExpandableListView.getPackedPositionGroup(j) + 100, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
                                    } else if (iMatch == -3) {
                                        strIntern = m7093((ViewConfiguration.getScrollBarSize() >> 8) + 6, 94 - Gravity.getAbsoluteGravity(0, 0), (char) (58942 - ExpandableListView.getPackedPositionGroup(j))).intern();
                                    } else if (iMatch == -2) {
                                        strIntern = m7091("┯ᓿ䚕끕", 12757 - ((Process.getThreadPriority(0) + 20) >> 6)).intern();
                                    } else if (iMatch != -1) {
                                        strIntern = m7093(14 - (Process.myTid() >> 22), 112 - ExpandableListView.getPackedPositionType(j), (char) (26268 - MotionEvent.axisFromString(""))).intern();
                                    } else {
                                        strIntern = m7093(4 - Color.blue(0), 108 - ExpandableListView.getPackedPositionGroup(j), (char) (AndroidCharacter.getMirror(c) - '0')).intern();
                                    }
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(m7091("╫ᛊ䉏뿁\ueba3✚შ䱞롣\uf586Ⅸዄ仧먈\uf7ea⍐ύ䢗葸\uf1ccⶼᤖ䪧蘜", 13217 - View.combineMeasuredStates(0, 0)).intern());
                                    sb5.append(strIntern);
                                    Log.v(strIntern2, sb5.toString());
                                }
                            }
                        }
                        i++;
                        action = str;
                        arrayList2 = arrayList;
                        strResolveTypeIfNeeded = str2;
                    }
                    if (arrayList3 != null) {
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            ((e) arrayList3.get(i2)).f6765 = false;
                        }
                        this.f6758.add(new d(intent, arrayList3));
                        if (!this.f6753.hasMessages(1)) {
                            this.f6753.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﻛ */
    private static String m7091(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2804g.f6422) {
            try {
                C2804g.f6423 = i;
                char[] cArr2 = new char[cArr.length];
                C2804g.f6421 = 0;
                while (true) {
                    int i2 = C2804g.f6421;
                    if (i2 < cArr.length) {
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6749);
                        C2804g.f6421++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
