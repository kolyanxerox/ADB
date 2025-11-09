package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.aa */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC2643aa extends AbstractC2930w<View> implements View.OnLayoutChangeListener, InterfaceC2899jn {

    /* renamed from: ﮐ */
    private static int f4437 = 1;

    /* renamed from: ﻐ */
    private static int f4438;

    /* renamed from: ﻛ */
    private static int[] f4439 = {-195962772, -1974950459, 2032398468, 138799625, 1543825826, -577692779, 1357151006, 1309453754, -554458323, -1350134952, 639469298, -207331019, -66273853, 911925232, -1736004684, 696513830, -243687540, 604323};

    /* renamed from: ｋ */
    private WeakHashMap<View, Boolean> f4440;

    /* renamed from: ﾇ */
    private a f4441;

    /* renamed from: ﾒ */
    private Class f4442;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.aa$a */
    public class a extends AbstractC2930w.e {

        /* renamed from: ﮐ */
        private static int f4443 = 1;

        /* renamed from: ﱟ */
        private static int f4444 = 11;

        /* renamed from: ﺙ */
        private static int f4445 = 0;

        /* renamed from: ﻛ */
        private static long f4446 = -8479458958448729447L;

        /* renamed from: ﻐ */
        private String f4447;

        /* renamed from: ｋ */
        private String f4448;

        /* renamed from: ﾒ */
        private String f4449;

        public a(ViewOnLayoutChangeListenerC2643aa viewOnLayoutChangeListenerC2643aa) {
        }

        /* renamed from: ﻐ */
        public static /* synthetic */ String m4910(a aVar) {
            int i = f4443 + 35;
            f4445 = i % 128;
            int i2 = i % 2;
            String str = aVar.f4449;
            if (i2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﻛ */
        public static /* synthetic */ String m4912(a aVar) {
            int i = f4443 + 29;
            int i2 = i % 128;
            f4445 = i2;
            int i3 = i % 2;
            String str = aVar.f4447;
            if (i3 != 0) {
                int i4 = 51 / 0;
            }
            f4443 = (i2 + 113) % 128;
            return str;
        }

        /* renamed from: ｋ */
        public static /* synthetic */ String m4914(a aVar) {
            int i = f4443 + 73;
            f4445 = i % 128;
            int i2 = i % 2;
            String str = aVar.f4448;
            if (i2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﾇ */
        private a m4915(String str) {
            int i = f4443;
            int i2 = i + 33;
            f4445 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f4448 = str;
                throw null;
            }
            this.f4448 = str;
            int i3 = i + 91;
            f4445 = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﾒ */
        private a m4916(String str) {
            int i = f4443 + 73;
            int i2 = i % 128;
            f4445 = i2;
            if (i % 2 != 0) {
                this.f4449 = str;
                throw null;
            }
            this.f4449 = str;
            f4443 = (i2 + 121) % 128;
            return this;
        }

        public a(ViewOnLayoutChangeListenerC2643aa viewOnLayoutChangeListenerC2643aa, JSONObject jSONObject) {
            m4911(jSONObject.optString(m4913("\ue2ee띹䧱\ue240들䥥\ue3f0둹仝\ue355뗘九\ue0eb딹侲\ue037몙伾\ue1a6먠䲔\ue108", 21893 - KeyEvent.keyCodeFromString("")).intern()));
            m4916(jSONObject.optString(m4917("\uffff\u0010\u0003\uffff\u0011\uffdd\u0006\ufffb\r\r￨\ufffb\u0007", 113 - KeyEvent.getDeadChar(0, 0), 12 - TextUtils.lastIndexOf("", '0', 0), false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()));
            m4915(jSONObject.optString(m4913("\ue2e9쪣뉝鯭䎛⬪ჭ\uf88dꀤ觝煇夂ڸ\uee60혊뾴", 10330 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()));
            m7667(jSONObject.optString(m4917("�\u000e\u0004\r￮\t￣\b\u0004\uffff", (Process.myPid() >> 22) + 113, 10 - TextUtils.indexOf("", "", 0), false, 1 - MotionEvent.axisFromString("")).intern()));
            m7669(false);
            m7666(!TextUtils.isEmpty(jSONObject.optString(m4917("�\u000e\u0004\r￮\t￣\b\u0004\uffff", 113 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, false, 2 - View.resolveSize(0, 0)).intern())) || jSONObject.optBoolean(m4913("\ue2ecꌍ愲❻\ue560ꭸ榥⾡\uedc4돱燜㘘\uf424멇硕㹤", 16871 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) || jSONObject.optBoolean(m4917("\u0000\ufff2\u0000\u000e\u0010\u000f\t\u0000\u0004\u0007\uffde\u0000\b\n\r\u0003\uffde�", TextUtils.getTrimmedLength("") + InterfaceC3173h3.d.b.f8827j, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, true, 5 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()));
            m7664(jSONObject.optBoolean(m4913("\ue2ecꌍ愲❻\ue560ꭸ榥⾡\uedc4돱燜㘘\uf424멇硕㹤", 16871 - View.resolveSize(0, 0)).intern()));
            m7662(jSONObject.optBoolean(m4913("\ue2ec螡⡪촽矍ᢚ봩⟵좋浉", 25931 - KeyEvent.getDeadChar(0, 0)).intern()));
            m7668(TextUtils.isEmpty(jSONObject.optString(m4917("￼\uffff\u000e\u000b\b\u0002￦\b\ufffb", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 118, 8 - ImageFormat.getBitsPerPixel(0), false, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3).intern())) ? null : Arrays.asList(jSONObject.optString(m4917("￼\uffff\u000e\u000b\b\u0002￦\b\ufffb", 117 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 9 - KeyEvent.getDeadChar(0, 0), false, 4 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()).split(m4913("\ue2b5", 15054 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())));
            m7671(jSONObject.optBoolean(m4913("\ue2ec\uf5d9첚Ꝋ븴鄐槊䂏孢㈠Ԏᷘ\uf489", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5938).intern(), true));
            m7670(false);
            m7661(jSONObject.optBoolean(m4917("\uffff\n\u0002\u000b\u0003\t\ufffb\ufff9\u0004\ufff7\n\t\u0004\uffdf\ufffb\u0002\u0006", 117 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 17, true, TextUtils.getCapsMode("", 0, 0) + 5).intern()));
            m7663(jSONObject.optBoolean(m4917("\uffe7\u0006￨\u0007\u000b\f\u0001\u0005\b", KeyEvent.keyCodeFromString("") + 115, (ViewConfiguration.getScrollBarSize() >> 8) + 9, false, (Process.myPid() >> 22) + 6).intern()));
            m7665(C2915kc.m7443(jSONObject.optJSONArray(m4917("￠\u0006￫\n\u000e￼\u0000\r￼\t\u0006\u0005\ufffe", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 116, Color.blue(0) + 13, true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7).intern())));
        }

        /* renamed from: ﻛ */
        private a m4911(String str) {
            int i = f4443 + 69;
            f4445 = i % 128;
            if (i % 2 == 0) {
                this.f4447 = str;
                return this;
            }
            this.f4447 = str;
            throw null;
        }

        /* renamed from: ﻛ */
        private static String m4913(String str, int i) {
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
                            cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f4446);
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

        /* renamed from: ﾒ */
        private static String m4917(String str, int i, int i2, boolean z, int i3) {
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
                        cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i);
                        int i5 = C2669b.f5040;
                        cArr2[i5] = (char) (cArr2[i5] - f4444);
                        C2669b.f5040 = i5 + 1;
                    }
                    if (i3 > 0) {
                        C2669b.f5041 = i3;
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

    public ViewOnLayoutChangeListenerC2643aa(JSONObject jSONObject) {
        super(null);
        this.f4440 = new WeakHashMap<>();
        this.f4441 = new a(this);
        m4907(jSONObject);
    }

    /* renamed from: ｋ */
    private static View m4896(View view) {
        int i = f4437;
        int i2 = i + 19;
        f4438 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        f4438 = (i + 97) % 128;
        return view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        f4437 = (f4438 + 107) % 128;
        try {
            View viewM4898 = m4898(view, this.f4442);
            if (viewM4898 != null) {
                int i9 = f4438 + InterfaceC3173h3.d.b.f8819b;
                f4437 = i9 % 128;
                if (i9 % 2 != 0) {
                    m4901(viewM4898);
                    view.removeOnLayoutChangeListener(this);
                } else {
                    m4901(viewM4898);
                    view.removeOnLayoutChangeListener(this);
                    throw null;
                }
            }
        } catch (Throwable th) {
            C2914kb.m7426(m4899(new int[]{1129516775, -1303352334, -2101213116, 156721360, -1034859228, 1689706910, 154523856, -264714292, -696253829, -1596625137}, 'C' - AndroidCharacter.getMirror('0')).intern(), m4899(new int[]{1277651798, -73075828, 1075651811, -1570608783, 1759727075, 77633652, -1305248445, 134319199, 561352239, 1369803384, -1295515608, 403547890}, 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th, false);
        }
    }

    /* renamed from: ﻐ */
    public final void m4902() {
        int i = f4437 + 33;
        f4438 = i % 128;
        if (i % 2 == 0) {
            m7677((InterfaceC2923p) null);
            C2895jj.m7281().m7288(this);
        } else {
            m7677((InterfaceC2923p) null);
            C2895jj.m7281().m7288(this);
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﻛ */
    public final InterfaceC2923p<WebView, View> mo4904() {
        int i = (f4438 + 11) % 128;
        f4437 = i;
        int i2 = i + 23;
        f4438 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﾇ */
    public final /* synthetic */ View mo4906(View view) {
        f4438 = (f4437 + 15) % 128;
        View viewM4896 = m4896(view);
        int i = f4437 + 65;
        f4438 = i % 128;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
        return viewM4896;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﾒ */
    public final /* synthetic */ void mo4909(View view, List list) {
        int i = f4438 + 43;
        f4437 = i % 128;
        int i2 = i % 2;
        m4895(view, (List<WebView>) list);
        if (i2 == 0) {
            throw null;
        }
        f4438 = (f4437 + 97) % 128;
    }

    /* renamed from: ｋ */
    private View m4897(View view, String str) {
        ViewGroup viewGroup;
        int i;
        int i2 = f4438 + 79;
        int i3 = i2 % 128;
        f4437 = i3;
        if (i2 % 2 == 0) {
            boolean z = view instanceof ViewGroup;
            throw null;
        }
        if (view instanceof ViewGroup) {
            int i4 = i3 + 77;
            f4438 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup = (ViewGroup) view;
                i = 1;
            } else {
                viewGroup = (ViewGroup) view;
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getClass().getName().startsWith(str)) {
                    return childAt;
                }
                View viewM4897 = m4897(childAt, str);
                if (viewM4897 != null) {
                    return viewM4897;
                }
                i++;
            }
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2899jn
    /* renamed from: ﻛ */
    public final void mo4905(View view) throws JSONException {
        View viewM4897;
        View viewM4898 = m4898(view, this.f4442);
        if (viewM4898 != null) {
            m4901(viewM4898);
            return;
        }
        if (!TextUtils.isEmpty(a.m4914(this.f4441)) && (viewM4897 = m4897(view, a.m4914(this.f4441))) != null) {
            int i = f4437 + 19;
            f4438 = i % 128;
            int i2 = i % 2;
            viewM4897.addOnLayoutChangeListener(this);
            if (i2 != 0) {
                throw null;
            }
        }
        int i3 = f4437 + 57;
        f4438 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public final void m4907(JSONObject jSONObject) {
        a aVar = new a(this, jSONObject);
        m7647((AbstractC2930w.e) aVar);
        this.f4441 = aVar;
        try {
            this.f4442 = Class.forName(a.m4910(aVar));
            f4438 = (f4437 + 123) % 128;
            m4900();
            int i = f4437 + 95;
            f4438 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (ClassNotFoundException e) {
            String strIntern = m4899(new int[]{1129516775, -1303352334, -2101213116, 156721360, -1034859228, 1689706910, 154523856, -264714292, -696253829, -1596625137}, 19 - ExpandableListView.getPackedPositionGroup(0L)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m4899(new int[]{1277651798, -73075828, 157021924, -1170254582, 994903990, -1347846206, 1359229212, 1802901281, -505145627, -742090904, -768612974, -2144440920, -2094029601, 434054352, 2145809065, 1992710471}, 32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
            sb.append(a.m4910(aVar));
            sb.append(m4899(new int[]{-1854616036, -2017920942}, 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
            sb.append(e.getLocalizedMessage());
            C2921n.m7500(strIntern, sb.toString());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﾒ */
    public final AbstractViewOnLayoutChangeListenerC2644ab mo4908() {
        C2646ad c2646ad = new C2646ad();
        f4437 = (f4438 + 77) % 128;
        return c2646ad;
    }

    /* renamed from: ﾒ */
    private void m4901(View view) throws JSONException {
        if (this.f4440.containsKey(view)) {
            return;
        }
        f4438 = (f4437 + 35) % 128;
        this.f4440.put(view, Boolean.TRUE);
        mo7625((ViewOnLayoutChangeListenerC2643aa) view, Integer.toHexString(view.hashCode()));
        f4437 = (f4438 + 17) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2899jn
    /* renamed from: ﻐ */
    public final void mo4903(View view) throws JSONException {
        int i = f4438 + 37;
        f4437 = i % 128;
        if (i % 2 != 0) {
            View viewM4898 = m4898(view, this.f4442);
            if (viewM4898 == null || this.f4440.remove(viewM4898) == null) {
                return;
            }
            int i2 = f4438 + 31;
            f4437 = i2 % 128;
            int i3 = i2 % 2;
            mo7624((ViewOnLayoutChangeListenerC2643aa) view);
            if (i3 == 0) {
                int i4 = 14 / 0;
                return;
            }
            return;
        }
        m4898(view, this.f4442);
        throw null;
    }

    /* renamed from: ﾇ */
    private void m4900() {
        int i = f4438 + 87;
        f4437 = i % 128;
        if (i % 2 != 0) {
            C2895jj.m7281().m7287(this);
        } else {
            C2895jj.m7281().m7287(this);
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private View m4898(View view, Class cls) {
        f4438 = (f4437 + 125) % 128;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            f4438 = (f4437 + 35) % 128;
            View childAt = viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            View viewM4898 = m4898(childAt, cls);
            if (viewM4898 != null) {
                return viewM4898;
            }
            i++;
            f4438 = (f4437 + 57) % 128;
        }
        return null;
    }

    /* renamed from: ﻐ */
    private void m4895(View view, List<WebView> list) {
        int i = f4438 + 13;
        f4437 = i % 128;
        if (i % 2 == 0) {
            C2917ke.m7469(view, WebView.class, a.m4912(this.f4441), false, false, null, this.f4441.f7417, list);
        } else {
            C2917ke.m7469(view, WebView.class, a.m4912(this.f4441), true, false, null, this.f4441.f7417, list);
        }
        int i2 = f4438 + 115;
        f4437 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
    }

    /* renamed from: ﾇ */
    private static String m4899(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f4439.clone();
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
}
