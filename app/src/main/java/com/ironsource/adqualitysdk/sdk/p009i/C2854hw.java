package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2857hz;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hw */
/* loaded from: classes2.dex */
public final class C2854hw {

    /* renamed from: ﮐ */
    private static int f6673 = 0;

    /* renamed from: ﱟ */
    private static int f6674 = 1;

    /* renamed from: ｋ */
    private static int f6678 = 169;

    /* renamed from: ﾇ */
    private static boolean f6679 = true;

    /* renamed from: ﾒ */
    private static boolean f6680 = true;

    /* renamed from: ﻛ */
    private Map<C2857hz.a, C2852hu> f6681;

    /* renamed from: ﻐ */
    private static char[] f6677 = {248, 267, 275, 270, 268, 285, 239, 274, 279, 269, 283, 238, 280, 201, 272, 271, 286, 278, 281, 266, 273, 284, 277, 289, 236, 246, 213, 287, 227};

    /* renamed from: ﺙ */
    private static char f6676 = 6;

    /* renamed from: ﱡ */
    private static char[] f6675 = {' ', 't', 'y', 'p', 'e', 'f', 'r', 'o', 'm', 'c', 'l', 'a', 's', ':', 'h', 'i', ',', 'n', 'u', 'd', 'E', 'g', 'O', 'b', 'j', 'F', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*'};

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hw$5 */
    public class AnonymousClass5 implements InterfaceC2856hy {
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2856hy
        /* renamed from: ﾇ */
        public final boolean mo6496(InterfaceC2851ht interfaceC2851ht) {
            return interfaceC2851ht.mo6934() instanceof String;
        }
    }

    public C2854hw() {
        m6975(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        this.f6681 = new HashMap();
    }

    /* renamed from: ﻐ */
    private <T> InterfaceC2851ht<T> m6966(Object obj, C2852hu c2852hu) {
        f6673 = (f6674 + 47) % 128;
        try {
            InterfaceC2851ht<T> interfaceC2851htM6972 = m6972(m6979(obj, c2852hu.m6937().get(0), (InterfaceC2851ht) null), c2852hu, 1);
            int i = f6674 + 123;
            f6673 = i % 128;
            if (i % 2 == 0) {
                return interfaceC2851htM6972;
            }
            throw null;
        } catch (Exception e) {
            C2921n.m7506(m6975(null, null, TextUtils.lastIndexOf("", '0', 0) + 128, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m6975(null, null, Color.blue(0) + 127, "\u0095\u0086\u0094\u0093\u008e\u0092\u008d\u008b\u0090\u008e\u008a\u0097\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008e\u008f\u0089\u0088\u0086\u0086\u0084\u008f\u008e\u008b\u008d\u008b\u008b\u008c").intern(), e);
            return null;
        }
    }

    /* renamed from: ﻛ */
    public static List<Object> m6976(Class cls, Object obj, C2847hp c2847hp) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = C2849hr.m6916().m6918().m6892(cls, c2847hp).iterator();
            f6673 = (f6674 + 125) % 128;
            while (it.hasNext()) {
                arrayList.add(it.next().get(obj));
            }
        } catch (Throwable unused) {
            String strIntern = m6975(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m6975(null, null, 126 - MotionEvent.axisFromString(""), "\u008e\u008f\u0089\u0088\u0086\u0086\u0084\u008f\u008e\u008b\u008d\u008b\u008b\u008c").intern());
            sb.append(c2847hp.m6900());
            sb.append(m6984((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 44), "\u0001\u0002\u0003\u0004\u0005\u0001\u0000\u000b\b\tL", KeyEvent.normalizeMetaState(0) + 11).intern());
            sb.append(cls);
            sb.append(m6984((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 72), "\u0003\u0006\u000b\u0006¼¼", Drawable.resolveOpacity(0, 0) + 6).intern());
            C2921n.m7509(strIntern, sb.toString());
        }
        int i = f6673 + 121;
        f6674 = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
        return arrayList;
    }

    /* renamed from: ﾒ */
    public static <T> T m6983(Class cls, Object obj, C2847hp c2847hp, T t) {
        int i = f6673 + 67;
        f6674 = i % 128;
        try {
            if (i % 2 == 0) {
                C2849hr.m6916().m6918().m6890(cls, c2847hp);
                throw null;
            }
            Field fieldM6890 = C2849hr.m6916().m6918().m6890(cls, c2847hp);
            if (fieldM6890 == null) {
                return t;
            }
            T t2 = (T) fieldM6890.get(obj);
            int i2 = f6674 + 117;
            f6673 = i2 % 128;
            if (i2 % 2 == 0) {
                return t2;
            }
            throw null;
        } catch (Throwable unused) {
            String strIntern = m6975(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m6975(null, null, 127 - View.MeasureSpec.getSize(0), "\u008e\u008f\u0089\u0088\u0086\u0086\u0084\u008f\u008e\u008b\u008d\u008b\u008b\u008c").intern());
            sb.append(c2847hp.m6900());
            sb.append(m6984((byte) (MotionEvent.axisFromString("") + 45), "\u0001\u0002\u0003\u0004\u0005\u0001\u0000\u000b\b\tL", TextUtils.indexOf((CharSequence) "", '0', 0) + 12).intern());
            sb.append(cls);
            sb.append(m6984((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 74), "\u0003\u0006\u000b\u0006¼¼", TextUtils.indexOf((CharSequence) "", '0') + 7).intern());
            C2921n.m7509(strIntern, sb.toString());
            return null;
        }
    }

    /* renamed from: ｋ */
    public final <T> InterfaceC2851ht<T> m6987(Object obj, InterfaceC2856hy interfaceC2856hy, InterfaceC2848hq interfaceC2848hq, List<String> list, int i) {
        InterfaceC2851ht<T> interfaceC2851htM6989 = m6989(obj, new C2857hz.d().m7052(true).m7048(interfaceC2856hy, interfaceC2848hq, list, i));
        f6673 = (f6674 + 91) % 128;
        return interfaceC2851htM6989;
    }

    /* renamed from: ﾇ */
    public final <T> InterfaceC2851ht<T> m6989(Object obj, C2857hz c2857hz) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2857hz.a aVarM7011 = c2857hz.m7011(obj.getClass());
        C2852hu c2852hu = this.f6681.get(aVarM7011);
        if (c2852hu != null) {
            f6674 = (f6673 + 17) % 128;
            InterfaceC2851ht<T> interfaceC2851htM6966 = m6966(obj, c2852hu);
            if (interfaceC2851htM6966 != null && m6970(c2857hz.m7008(), interfaceC2851htM6966)) {
                StringBuilder sb = new StringBuilder();
                sb.append(m6975(null, null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "\u008e\u0089\u0088\u008e\u0095\u0086\u0094\u0093\u008e\u0092\u008d\u008b\u0090\u008e\u008a\u0089\u0091\u008d\u0090").intern());
                sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                m6981(interfaceC2851htM6966, obj, AbstractC2183w4.OooOO0O(sb, m6984((byte) (80 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0006\u000e", Color.argb(0, 0, 0, 0) + 2)));
                return interfaceC2851htM6966;
            }
            String strIntern = m6975(null, null, 127 - TextUtils.getTrimmedLength(""), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(m6984((byte) (TextUtils.getCapsMode("", 0, 0) + 4), "\f\u0001\u0005\t\u0002\r\u0002\u0006\u0010\rw", 11 - View.MeasureSpec.getSize(0)).intern());
            C2921n.m7509(strIntern, sb2.toString());
            this.f6681.remove(aVarM7011);
            f6673 = (f6674 + 123) % 128;
        }
        C2859ia<T> c2859ia = new C2859ia<>(c2857hz);
        InterfaceC2851ht<T> interfaceC2851htM6967 = m6967(obj, c2859ia, 0, null);
        if (interfaceC2851htM6967 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m6984((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15), "\r\u000b\u0002\u0001\u0001\u000b\u0017\f\u0012\u0001\u0010\f/", 12 - Process.getGidForName("")).intern());
            sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb3.append(m6984((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 9), "\u0006\u000e\f\u0004", 4 - View.MeasureSpec.getSize(0)).intern());
            sb3.append(c2859ia.m7059().size());
            m6981((InterfaceC2851ht) null, obj, AbstractC2183w4.OooOO0O(sb3, m6975(null, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0086\u0084\u0096\u008e\u0089\u0088\u008e\u0096\u0086\u0085\u0084\u0083\u0082\u008d\u008e")));
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m6975(null, null, MotionEvent.axisFromString("") + 128, "\u008e\u0089\u0088\u008e\u008a\u0089\u0091\u008d\u0090").intern());
        sb4.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb4.append(m6984((byte) (9 - TextUtils.getOffsetBefore("", 0)), "\u0006\u000e\f\u0004", TextUtils.lastIndexOf("", '0', 0) + 5).intern());
        sb4.append(c2859ia.m7059().size());
        m6981(interfaceC2851htM6967, obj, AbstractC2183w4.OooOO0O(sb4, m6975(null, null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, "\u0086\u0084\u0096\u008e\u0089\u0088\u008e\u0096\u0086\u0085\u0084\u0083\u0082\u008d\u008e")));
        this.f6681.put(aVarM7011, c2859ia.m7061());
        return interfaceC2851htM6967;
    }

    /* renamed from: ｋ */
    private static <T> InterfaceC2851ht<T> m6979(Object obj, List<Field> list, InterfaceC2851ht interfaceC2851ht) throws IllegalAccessException, IllegalArgumentException {
        Object obj2;
        Iterator<Field> it = list.iterator();
        while (!(!it.hasNext())) {
            f6674 = (f6673 + 17) % 128;
            Field next = it.next();
            if (WeakReference.class.isAssignableFrom(next.getType())) {
                f6673 = (f6674 + 71) % 128;
                obj2 = ((WeakReference) next.get(obj)).get();
            } else {
                obj2 = next.get(obj);
            }
            interfaceC2851ht = m6968(next, obj, interfaceC2851ht);
            obj = obj2;
        }
        return interfaceC2851ht;
    }

    /* renamed from: ﻐ */
    private <T> InterfaceC2851ht<T> m6967(Object obj, C2859ia<T> c2859ia, int i, InterfaceC2851ht interfaceC2851ht) {
        Field[] fieldArrM6985;
        if (i != c2859ia.m7056().m7009()) {
            int i2 = f6674 + 77;
            f6673 = i2 % 128;
            if (i2 % 2 == 0) {
                if (obj != null && !c2859ia.m7059().contains(obj) && (i <= 0 || !(obj instanceof Activity))) {
                    c2859ia.m7059().add(obj);
                    try {
                        if (c2859ia.m7056().m7014() != null) {
                            fieldArrM6985 = c2859ia.m7056().m7014().mo6915(obj);
                            f6674 = (f6673 + 13) % 128;
                        } else {
                            fieldArrM6985 = m6985(obj.getClass(), c2859ia.m7056().m7007(i));
                        }
                        C2852hu c2852huM7061 = c2859ia.m7061();
                        f6673 = (f6674 + 119) % 128;
                        for (Field field : fieldArrM6985) {
                            field.setAccessible(true);
                            c2852huM7061.m6939(field);
                            InterfaceC2851ht<T> interfaceC2851htM6973 = m6973(m6968(field, obj, interfaceC2851ht), c2859ia, i);
                            if (interfaceC2851htM6973 != null) {
                                f6674 = (f6673 + 21) % 128;
                                if (!c2859ia.m7062()) {
                                    return interfaceC2851htM6973;
                                }
                            }
                            c2852huM7061.m6940(field);
                        }
                    } catch (Throwable th) {
                        C2921n.m7506(m6975(null, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m6984((byte) (23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\u0012\b\u0007\b\f\u0006\u0016\u0003\u008a\u008a\u0010\f\u0012\u0003\u0017\u0012\u001c\u0000\u0007\u0003\u001b\r\n\u0010z", Gravity.getAbsoluteGravity(0, 0) + 25).intern(), th);
                    }
                    return null;
                }
            } else {
                throw null;
            }
        }
        return null;
    }

    /* renamed from: ﾒ */
    public final List<InterfaceC2851ht> m6992(Object obj, C2857hz c2857hz) {
        C2859ia c2859ia = new C2859ia(c2857hz);
        c2859ia.m7058();
        m6967(obj, c2859ia, 0, null);
        ArrayList arrayList = new ArrayList(c2859ia.m7055());
        int i = f6673 + 17;
        f6674 = i % 128;
        if (i % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private <T> InterfaceC2851ht<T> m6972(InterfaceC2851ht interfaceC2851ht, C2852hu c2852hu, int i) {
        InterfaceC2851ht interfaceC2851htM6979;
        if (i >= c2852hu.m6937().size()) {
            return interfaceC2851ht;
        }
        List<Field> list = c2852hu.m6937().get(i);
        Object objMo6934 = interfaceC2851ht.mo6934();
        List listM6980 = m6980(objMo6934);
        if (listM6980 == null) {
            String strIntern = m6975(null, null, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m6975(null, null, (KeyEvent.getMaxKeyCode() >> 16) + 127, "\u008e\u008a\u0084\u009c\u0088\u0084\u0085\u0084\u008b\u008e\u009b\u0093\u0094\u009a\u008e\u008b\u008d\u008e\u0089\u008d\u0088\u0086\u0085\u0084\u0097\u0097\u008d\u0099\u008e\u008a\u0084\u0086\u0085\u0084\u0093\u0098\u008c").intern());
            sb.append(objMo6934.getClass());
            C2921n.m7509(strIntern, sb.toString());
            return null;
        }
        f6674 = (f6673 + 37) % 128;
        for (Object obj : listM6980) {
            f6673 = (f6674 + 55) % 128;
            try {
                interfaceC2851htM6979 = m6979(obj, list, m6978(objMo6934, obj, interfaceC2851ht));
            } catch (Exception unused) {
            }
            if (interfaceC2851htM6979 != null) {
                return m6972(interfaceC2851htM6979, c2852hu, i + 1);
            }
            continue;
        }
        int i2 = f6674 + 123;
        f6673 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
        return null;
    }

    /* renamed from: ｋ */
    private static <T> InterfaceC2851ht<T> m6978(Object obj, Object obj2, InterfaceC2851ht interfaceC2851ht) {
        C2855hx c2855hx;
        int i;
        f6673 = (f6674 + 53) % 128;
        if (obj instanceof Collection) {
            c2855hx = new C2855hx((Collection) obj, obj2, interfaceC2851ht);
            i = f6673 + InterfaceC3173h3.d.b.f8823f;
        } else {
            if (!(obj instanceof Map)) {
                return null;
            }
            c2855hx = new C2855hx((Map) obj, obj2, interfaceC2851ht);
            i = f6673 + 23;
        }
        f6674 = i % 128;
        return c2855hx;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0034 A[PHI: r5
  0x0034: PHI (r5v4 java.lang.Class) = (r5v2 java.lang.Class), (r5v5 java.lang.Class) binds: [B:33:0x0032, B:30:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Field[] m6985(java.lang.Class r5, int r6) {
        /*
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2854hw.f6674
            int r1 = r1 + 77
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2854hw.f6673 = r1
            r1 = 0
            r2 = r1
        Le:
            if (r5 == 0) goto L3f
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2854hw.f6673
            int r3 = r3 + 55
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2854hw.f6674 = r3
            if (r2 == r6) goto L3f
            int r3 = r3 + 27
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2854hw.f6673 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L2e
            java.lang.Class r5 = r5.getSuperclass()
            r3 = 61
            int r3 = r3 / r1
            if (r5 == 0) goto L3c
            goto L34
        L2e:
            java.lang.Class r5 = r5.getSuperclass()
            if (r5 == 0) goto L3c
        L34:
            java.lang.reflect.Field[] r3 = r5.getDeclaredFields()
            java.lang.reflect.Field[] r0 = com.ironsource.adqualitysdk.sdk.p009i.C2911jz.m7409(r0, r3)
        L3c:
            int r2 = r2 + 1
            goto Le
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2854hw.m6985(java.lang.Class, int):java.lang.reflect.Field[]");
    }

    /* renamed from: ｋ */
    public final String m6988(Class cls, String str) throws SecurityException {
        int i = f6674 + 5;
        f6673 = i % 128;
        if (i % 2 != 0) {
            m6974((Object) null, cls, str);
            throw null;
        }
        String strM6974 = m6974((Object) null, cls, str);
        int i2 = f6673 + 107;
        f6674 = i2 % 128;
        if (i2 % 2 != 0) {
            return strM6974;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public final String m6991(Object obj, String str) throws SecurityException {
        int i = f6673 + 33;
        f6674 = i % 128;
        if (i % 2 != 0) {
            return m6974(obj, obj.getClass(), str);
        }
        String strM6974 = m6974(obj, obj.getClass(), str);
        int i2 = 40 / 0;
        return strM6974;
    }

    /* renamed from: ﾒ */
    private static String m6984(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6675;
                char c = f6676;
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

    /* renamed from: ﻛ */
    private InterfaceC2851ht m6973(InterfaceC2851ht interfaceC2851ht, C2859ia c2859ia, int i) {
        Object objMo6934 = interfaceC2851ht.mo6934();
        InterfaceC2851ht interfaceC2851htM6973 = null;
        if (!c2859ia.m7059().contains(objMo6934)) {
            int i2 = f6674 + 71;
            f6673 = i2 % 128;
            if (i2 % 2 == 0) {
                if (!c2859ia.m7054().contains(objMo6934)) {
                    if (c2859ia.m7056().m7015(i) && m6970(c2859ia.m7056().m7008(), interfaceC2851ht)) {
                        int i3 = f6674 + 15;
                        f6673 = i3 % 128;
                        if (i3 % 2 == 0) {
                            if (!c2859ia.m7062()) {
                                return interfaceC2851ht;
                            }
                            int i4 = f6674 + 33;
                            f6673 = i4 % 128;
                            if (i4 % 2 == 0) {
                                c2859ia.m7057(interfaceC2851ht);
                                c2859ia.m7060(objMo6934);
                                return interfaceC2851ht;
                            }
                            c2859ia.m7057(interfaceC2851ht);
                            c2859ia.m7060(objMo6934);
                            throw null;
                        }
                        c2859ia.m7062();
                        throw null;
                    }
                    if (objMo6934 instanceof WeakReference) {
                        WeakReference weakReference = (WeakReference) objMo6934;
                        if (weakReference.get() != null) {
                            f6673 = (f6674 + 71) % 128;
                            if (c2859ia.m7056().m7017(i) && m6971(weakReference.get(), c2859ia.m7056().m7016())) {
                                return m6967(weakReference.get(), c2859ia, i + 1, interfaceC2851ht);
                            }
                        }
                    }
                    if (m6971(objMo6934, c2859ia.m7056().m7016())) {
                        return m6967(objMo6934, c2859ia, i + 1, interfaceC2851ht);
                    }
                    if (c2859ia.m7056().m7012()) {
                        f6674 = (f6673 + 59) % 128;
                        if (objMo6934 != null) {
                            c2859ia.m7059().add(objMo6934);
                        }
                    }
                    List listM6977 = m6977(objMo6934, c2859ia.m7056(), i);
                    C2852hu c2852huM7061 = c2859ia.m7061();
                    if (listM6977 != null) {
                        Iterator it = listM6977.iterator();
                        while (it.hasNext()) {
                            InterfaceC2851ht interfaceC2851htM6978 = m6978(objMo6934, it.next(), interfaceC2851ht);
                            c2852huM7061.m6938();
                            interfaceC2851htM6973 = m6973(interfaceC2851htM6978, c2859ia, i);
                            if (interfaceC2851htM6973 != null) {
                                int i5 = f6673 + 125;
                                f6674 = i5 % 128;
                                if (i5 % 2 == 0) {
                                    int i6 = 81 / 0;
                                    if (!c2859ia.m7062()) {
                                        return interfaceC2851htM6973;
                                    }
                                } else if (!c2859ia.m7062()) {
                                    return interfaceC2851htM6973;
                                }
                            }
                            c2852huM7061.m6936();
                        }
                    }
                    return interfaceC2851htM6973;
                }
            } else {
                c2859ia.m7054().contains(objMo6934);
                throw null;
            }
        }
        return null;
    }

    /* renamed from: ﻐ */
    private static boolean m6970(InterfaceC2856hy interfaceC2856hy, InterfaceC2851ht interfaceC2851ht) {
        boolean zMo6496;
        int i = f6674 + 9;
        f6673 = i % 128;
        try {
            if (i % 2 != 0) {
                zMo6496 = interfaceC2856hy.mo6496(interfaceC2851ht);
                int i2 = 4 / 0;
            } else {
                zMo6496 = interfaceC2856hy.mo6496(interfaceC2851ht);
            }
            f6674 = (f6673 + 59) % 128;
            return zMo6496;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ﻐ */
    private static boolean m6971(Object obj, List<String> list) {
        int i = (f6674 + 3) % 128;
        f6673 = i;
        if (obj == null) {
            return false;
        }
        int i2 = i + 59;
        f6674 = i2 % 128;
        if (i2 % 2 != 0) {
            return C2911jz.m7392(obj.getClass(), list);
        }
        C2911jz.m7392(obj.getClass(), list);
        throw null;
    }

    /* renamed from: ﾇ */
    public final List<String> m6990(Object obj, List<String> list, int i) {
        C2859ia c2859ia = new C2859ia(new C2857hz.d().m7045(true).m7047(true).m7041(-1).m7053(new InterfaceC2856hy() { // from class: com.ironsource.adqualitysdk.sdk.i.hw.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2856hy
            /* renamed from: ﾇ */
            public final boolean mo6496(InterfaceC2851ht interfaceC2851ht) {
                return interfaceC2851ht.mo6934() instanceof String;
            }
        }, list, i));
        c2859ia.m7058();
        m6967(obj, c2859ia, 0, null);
        ArrayList arrayList = new ArrayList(c2859ia.m7054());
        int i2 = f6674 + 93;
        f6673 = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private static List m6969(Object obj, boolean z, boolean z2) {
        int i = f6674;
        f6673 = (i + 107) % 128;
        if (obj instanceof Collection) {
            f6673 = (i + 17) % 128;
            if (z) {
                ArrayList arrayList = new ArrayList((Collection) obj);
                f6673 = (f6674 + InterfaceC3173h3.d.b.f8826i) % 128;
                return arrayList;
            }
        }
        if (!(obj instanceof Map) || !z2) {
            return null;
        }
        Map map = (Map) obj;
        ArrayList arrayList2 = new ArrayList(map.values());
        arrayList2.addAll(map.keySet());
        return arrayList2;
    }

    /* renamed from: ﾇ */
    private static List m6980(Object obj) {
        f6673 = (f6674 + 33) % 128;
        List listM6969 = m6969(obj, true, true);
        f6673 = (f6674 + 73) % 128;
        return listM6969;
    }

    /* renamed from: ﻐ */
    private static <T> InterfaceC2851ht<T> m6968(Field field, Object obj, InterfaceC2851ht interfaceC2851ht) {
        C2855hx c2855hx = new C2855hx(field, obj, interfaceC2851ht);
        int i = f6674 + 1;
        f6673 = i % 128;
        if (i % 2 == 0) {
            return c2855hx;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static Field[] m6982(Class cls) {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            f6674 = (f6673 + 93) % 128;
            Field field = declaredFields[i];
            if (field.getType().equals(String.class)) {
                int i2 = f6674 + 91;
                f6673 = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(field);
                    f6674 = (f6673 + 1) % 128;
                } else {
                    arrayList.add(field);
                    throw null;
                }
            }
            i++;
            f6673 = (f6674 + 23) % 128;
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* renamed from: ﻐ */
    public final String m6986(Object obj, JSONArray jSONArray) throws SecurityException {
        if (jSONArray != null) {
            f6673 = (f6674 + 23) % 128;
            for (int i = 0; i < jSONArray.length(); i++) {
                int i2 = f6674 + 119;
                f6673 = i2 % 128;
                if (i2 % 2 == 0) {
                    String strM6991 = m6991(obj, jSONArray.optString(i));
                    if (strM6991 != null) {
                        int i3 = f6673 + 47;
                        f6674 = i3 % 128;
                        if (i3 % 2 != 0) {
                            return strM6991;
                        }
                        throw null;
                    }
                } else {
                    m6991(obj, jSONArray.optString(i));
                    throw null;
                }
            }
        }
        return null;
    }

    /* renamed from: ﾇ */
    private static void m6981(InterfaceC2851ht interfaceC2851ht, Object obj, String str) {
        int i = f6674 + 53;
        f6673 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (interfaceC2851ht == null) {
            String strIntern = m6975(null, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(m6975(null, null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u008e\u009d").intern());
            sb.append(str);
            C2921n.m7500(strIntern, sb.toString());
            return;
        }
        String strIntern2 = m6975(null, null, (Process.myPid() >> 22) + 127, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(m6975(null, null, (Process.myTid() >> 22) + 127, "\u008e\u009d").intern());
        sb2.append(str);
        sb2.append(m6975(null, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u008e\u0084\u0091\u0097\u0094\u009c\u008e\u009b").intern());
        sb2.append(interfaceC2851ht.mo6934());
        C2921n.m7500(strIntern2, sb2.toString());
        int i2 = f6673 + 13;
        f6674 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
    }

    /* renamed from: ﻛ */
    private static List m6977(Object obj, C2857hz c2857hz, int i) {
        int i2 = f6673 + 9;
        f6674 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6969(obj, c2857hz.m7010(i), c2857hz.m7013(i));
        }
        m6969(obj, c2857hz.m7010(i), c2857hz.m7013(i));
        throw null;
    }

    /* renamed from: ﻛ */
    private String m6974(Object obj, Class cls, String str) throws SecurityException {
        while (cls != null) {
            f6674 = (f6673 + 99) % 128;
            if (cls.equals(Object.class)) {
                return null;
            }
            for (Field field : m6982(cls)) {
                field.setAccessible(true);
                try {
                    String str2 = (String) field.get(obj);
                    if (str2 != null) {
                        f6673 = (f6674 + 21) % 128;
                        if (Pattern.compile(str).matcher(str2).matches()) {
                            int i = f6674 + 85;
                            f6673 = i % 128;
                            if (i % 2 != 0) {
                                int i2 = 53 / 0;
                            }
                            return str2;
                        }
                    }
                    f6674 = (f6673 + 97) % 128;
                } catch (Exception unused) {
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* renamed from: ﻛ */
    private static String m6975(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f6677;
                int i2 = f6678;
                if (f6680) {
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
                if (f6679) {
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
