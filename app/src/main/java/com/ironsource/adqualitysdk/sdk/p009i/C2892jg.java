package com.ironsource.adqualitysdk.sdk.p009i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.ViewOnTouchListenerC2842hk;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jg */
/* loaded from: classes2.dex */
public final class C2892jg {

    /* renamed from: ﱡ */
    private static int f7032 = 1;

    /* renamed from: ﻏ */
    private static int f7033 = 0;

    /* renamed from: ﻐ */
    private static int f7034 = 161;

    /* renamed from: ﾇ */
    private static C2892jg f7035;

    /* renamed from: ﾒ */
    private InterfaceC2899jn f7038;

    /* renamed from: ｋ */
    private Map<RelativeLayout, Object> f7037 = new WeakHashMap();

    /* renamed from: ﻛ */
    private C2865ig f7036 = new C2865ig(-1, -1, -1, -1);

    private C2892jg() {
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ View.OnLayoutChangeListener m7246(C2892jg c2892jg, ViewGroup viewGroup) {
        int i = f7033 + 51;
        f7032 = i % 128;
        if (i % 2 == 0) {
            c2892jg.m7245(viewGroup);
            throw null;
        }
        View.OnLayoutChangeListener onLayoutChangeListenerM7245 = c2892jg.m7245(viewGroup);
        int i2 = f7033 + 41;
        f7032 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
        }
        return onLayoutChangeListenerM7245;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ ViewGroup m7249(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i = f7032 + 61;
        f7033 = i % 128;
        if (i % 2 != 0) {
            m7260(viewGroup, viewGroup2);
            throw null;
        }
        ViewGroup viewGroupM7260 = m7260(viewGroup, viewGroup2);
        f7033 = (f7032 + InterfaceC3173h3.d.b.f8821d) % 128;
        return viewGroupM7260;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m7256(C2892jg c2892jg, MotionEvent motionEvent) {
        int i = f7032 + 109;
        f7033 = i % 128;
        int i2 = i % 2;
        c2892jg.m7252(motionEvent);
        if (i2 != 0) {
            int i3 = 81 / 0;
        }
        f7032 = (f7033 + 3) % 128;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m7261(View view, ViewOnTouchListenerC2842hk.d dVar) {
        int i = f7032 + 67;
        f7033 = i % 128;
        int i2 = i % 2;
        m7247(view, dVar);
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public final synchronized void m7264() {
        int i = f7032 + 69;
        f7033 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (this.f7038 == null) {
            this.f7038 = new InterfaceC2899jn() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.5
                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2899jn
                /* renamed from: ﻐ */
                public final void mo4903(View view) {
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2899jn
                /* renamed from: ﻛ */
                public final void mo4905(View view) {
                    if (C2925r.m7548().m7579()) {
                        C2892jg.this.m7265();
                        return;
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroupM7249 = (ViewGroup) view;
                        if (viewGroupM7249.getContext() instanceof Activity) {
                            viewGroupM7249 = C2892jg.m7249(viewGroupM7249, (ViewGroup) ((Activity) viewGroupM7249.getContext()).findViewById(R.id.content));
                        }
                        C2892jg c2892jg = C2892jg.this;
                        C2892jg.m7248(c2892jg, viewGroupM7249, C2892jg.m7246(c2892jg, viewGroupM7249));
                    }
                }
            };
            C2895jj.m7281().m7287(this.f7038);
            f7032 = (f7033 + 57) % 128;
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m7248(C2892jg c2892jg, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = f7032 + 49;
        f7033 = i % 128;
        int i2 = i % 2;
        c2892jg.m7262(viewGroup, onLayoutChangeListener);
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m7255(C2892jg c2892jg, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        f7033 = (f7032 + 47) % 128;
        c2892jg.m7258(viewGroup, onLayoutChangeListener);
        f7032 = (f7033 + InterfaceC3173h3.d.b.f8823f) % 128;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m7257(C2892jg c2892jg, C2865ig c2865ig) {
        int i = f7033 + 25;
        f7032 = i % 128;
        int i2 = i % 2;
        c2892jg.m7254(c2865ig);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public final synchronized void m7265() {
        try {
            if (this.f7038 != null) {
                for (RelativeLayout relativeLayout : this.f7037.keySet()) {
                    f7033 = (f7032 + 29) % 128;
                    ViewParent parent = relativeLayout.getParent();
                    if (parent instanceof ViewGroup) {
                        f7032 = (f7033 + 41) % 128;
                        ((ViewGroup) parent).removeView(relativeLayout);
                    }
                }
                this.f7037.clear();
                C2895jj.m7281().m7288(this.f7038);
                this.f7038 = null;
            }
            int i = f7033 + 29;
            f7032 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﻛ */
    public static synchronized C2892jg m7250() {
        try {
            if (f7035 == null) {
                f7035 = new C2892jg();
                f7032 = (f7033 + 19) % 128;
            }
            C2892jg c2892jg = f7035;
            int i = f7032 + 87;
            f7033 = i % 128;
            if (i % 2 == 0) {
                return c2892jg;
            }
            int i2 = 46 / 0;
            return c2892jg;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﻐ */
    public final synchronized C2865ig m7263() {
        C2865ig c2865ig;
        try {
            int i = f7033 + 81;
            f7032 = i % 128;
            if (i % 2 == 0) {
                c2865ig = this.f7036;
                int i2 = 75 / 0;
            } else {
                c2865ig = this.f7036;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2865ig;
    }

    /* renamed from: ﻐ */
    private View.OnLayoutChangeListener m7245(final ViewGroup viewGroup) {
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.3

            /* renamed from: ﻏ */
            private static int f7043 = 1;

            /* renamed from: ﻛ */
            private static int f7044 = 0;

            /* renamed from: ﾇ */
            private static char f7045 = 5;

            /* renamed from: ﾒ */
            private static char[] f7046 = {'G', 'l', 'o', 'b', 'a', 'T', 'u', 'c', 'h', 'L', 'i', 's', 't', 'e', 'n', 'r', 'S', 'v', 'E', ' ', 'y', 'C', 'g', 'H', 'I'};

            /* renamed from: ﾇ */
            private static String m7266(byte b, String str, int i) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (C2858i.f6710) {
                    try {
                        char[] cArr2 = f7046;
                        char c = f7045;
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

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = f7044 + 63;
                f7043 = i9 % 128;
                if (i9 % 2 == 0) {
                    C2925r.m7548().m7579();
                    throw null;
                }
                if (C2925r.m7548().m7579()) {
                    return;
                }
                f7043 = (f7044 + 55) % 128;
                try {
                    C2892jg.m7248(C2892jg.this, viewGroup, this);
                } catch (Throwable th) {
                    C2914kb.m7426(m7266((byte) (Process.getGidForName("") + 102), "\u0001\u0002\u0003\u0004\u0000\u0002\u0007\u0000\u0007\b\t\u0005\u000b\f\r\u000e\n\u000e\u0010\u0011\n\u0012\u000f\f\b\f", (ViewConfiguration.getTapTimeout() >> 16) + 26).intern(), m7266((byte) TextUtils.getOffsetBefore("", 0), "\u0013\u0010\u0011\u0000\u0010\u000f\u000b\n\u0011\u0004\u0013\u000e\u0000\u0018\u0001\u0007\u000b\u0016\t\u0003\f\u0018e", 22 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), th, false);
                }
            }
        };
        int i = f7032 + 49;
        f7033 = i % 128;
        if (i % 2 != 0) {
            int i2 = 6 / 0;
        }
        return onLayoutChangeListener;
    }

    /* renamed from: ﻐ */
    private static void m7247(View view, ViewOnTouchListenerC2842hk.d dVar) {
        f7032 = (f7033 + 95) % 128;
        C2909jx.m7358(view, dVar);
        int i = f7032 + 95;
        f7033 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private synchronized void m7254(C2865ig c2865ig) {
        int i = (f7033 + 23) % 128;
        f7032 = i;
        this.f7036 = c2865ig;
        int i2 = i + 45;
        f7033 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private void m7253(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext()) { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2
            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                C2892jg.m7256(C2892jg.this, motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        relativeLayout.setAlpha(0.0f);
        synchronized (this) {
            this.f7037.put(relativeLayout, new Object());
        }
        relativeLayout.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
    }

    /* renamed from: ﾇ */
    private void m7258(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final ViewOnTouchListenerC2842hk.d dVar = new ViewOnTouchListenerC2842hk.d() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.ViewOnTouchListenerC2842hk.d
            /* renamed from: ﾒ */
            public final boolean mo6451(ViewOnTouchListenerC2842hk viewOnTouchListenerC2842hk, View view, MotionEvent motionEvent) {
                C2892jg.m7256(C2892jg.this, motionEvent);
                return true;
            }
        };
        new Handler(Looper.getMainLooper()).post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2892jg.m7261(viewGroup, dVar);
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof ViewGroup) {
                        C2892jg.m7255(C2892jg.this, (ViewGroup) childAt, onLayoutChangeListener);
                    } else {
                        C2892jg.m7261(childAt, dVar);
                    }
                }
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
        f7032 = (f7033 + 5) % 128;
    }

    /* renamed from: ﾇ */
    private static boolean m7259(ViewGroup viewGroup) {
        try {
            if (viewGroup.getChildCount() == 0) {
                int i = f7032 + 43;
                f7033 = i % 128;
                return i % 2 != 0;
            }
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                int i3 = f7033 + 31;
                f7032 = i3 % 128;
                if (i3 % 2 == 0) {
                    boolean z = viewGroup.getChildAt(i2) instanceof TextView;
                    throw null;
                }
                if (!(viewGroup.getChildAt(i2) instanceof TextView)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            C2921n.m7506(m7251(26 - View.combineMeasuredStates(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, View.MeasureSpec.getSize(0) + Optimizer.OPTIMIZATION_STANDARD, "￡\u0006\t￼\ufffb\u0006￮\t\u000f�\u0002￦\u0003\r\u000e\uffff\b\uffff\f￭\uffff\f\u0010\u0003�\uffff", false).intern(), m7251(15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 52 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + InputDeviceCompat.SOURCE_KEYBOARD, "\u0007\u000e\t\u000b\u0003\u0005\b\u0003\uffc0\u0012\u000f\u0012\u0012￥\u0013\u0017\u0005\t\ufff6\u0014\u0018\u0005\ufff4\uffc0\u0019\f\u000e\u000f\uffc0\u0013\u000e\t\u0001\u0014\u000e\u000f\u0003\uffc0\u0010\u0015\u000f\u0012\uffe7\u0017\u0005\t\ufff6\uffc0\u0006\t\uffc0", true).intern(), th);
            return false;
        }
    }

    /* renamed from: ﾒ */
    private static ViewGroup m7260(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (viewGroup2 == null) {
            return viewGroup;
        }
        ViewGroup viewGroup3 = viewGroup2;
        while (viewGroup2 != null) {
            ViewParent parent = viewGroup2.getParent();
            if (parent != viewGroup) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                viewGroup3 = viewGroup2;
                viewGroup2 = (ViewGroup) parent;
            } else {
                if (viewGroup3 != viewGroup2) {
                    return viewGroup3;
                }
                int i = (f7033 + 87) % 128;
                f7032 = i;
                int i2 = i + 107;
                f7033 = i2 % 128;
                if (i2 % 2 == 0) {
                    return viewGroup2;
                }
                throw null;
            }
        }
        return viewGroup2;
    }

    /* renamed from: ﻛ */
    private void m7252(MotionEvent motionEvent) {
        try {
            final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.9

                /* renamed from: ﻏ */
                private static int f7055 = 1;

                /* renamed from: ﻐ */
                private static int f7056 = 0;

                /* renamed from: ﻛ */
                private static char[] f7057 = {'G', 'l', 'o', 'b', 'a', 'T', 'u', 'c', 'h', 'L', 'i', 's', 't', 'e', 'n', 'r', 'S', 'v', ' ', 'd', 'f', ':', '{', ',', '}', 'E', 'H', 'I', 'J', 'K', 'M', 'N', 'O', 'P', 'Q', 'R'};

                /* renamed from: ﾒ */
                private static char f7058 = 6;

                /* renamed from: ﻛ */
                private static String m7267(byte b, String str, int i) {
                    String str2;
                    char[] charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = charArray;
                    synchronized (C2858i.f6710) {
                        try {
                            char[] cArr2 = f7057;
                            char c = f7058;
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

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    try {
                        int iRound = Math.round(motionEventObtain.getRawX());
                        int iRound2 = Math.round(motionEventObtain.getRawY());
                        if (C2910jy.m7380(iRound, iRound2)) {
                            C2892jg.m7257(C2892jg.this, new C2865ig(iRound, iRound2, C2906ju.m7340(), C2906ju.m7339()));
                            int i = f7056 + 9;
                            f7055 = i % 128;
                            if (i % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        String strIntern = m7267((byte) ((Process.myPid() >> 22) + 23), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u0003\u0007\b\t\n\u000b\u0006\r\u000e\u000f\u000e\u0010\u0011\u000e\u0010\u0010\u000b\r\u0013", 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m7267((byte) (Color.argb(0, 0, 0, 0) + 71), "\u0000\u0003\u0007\b\u0006\u0014\u000e\f\u000e\u000f\u0012\u0018\u0010\u000e\r\u0013\u000b\u0010\u0013\u0019\u0014\u0000\f\u0012\u0014\u0000\u0015\u0013\u0004\u0003\b\f\u0017\u0007\u0013\u0006¶¶\r\u0015\b\u0010\u0000\u0010\u0011\u0007\u0016\u0013Â", ExpandableListView.getPackedPositionChild(0L) + 50).intern());
                        sb.append(iRound);
                        sb.append(m7267((byte) (View.resolveSizeAndState(0, 0, 0) + 60), "\u0012\u0013", 2 - TextUtils.indexOf("", "")).intern());
                        sb.append(iRound2);
                        sb.append(m7267((byte) (123 - TextUtils.getCapsMode("", 0, 0)), "ø", Color.alpha(0) + 1).intern());
                        C2921n.m7509(strIntern, sb.toString());
                        f7055 = (f7056 + 35) % 128;
                    } catch (Throwable th) {
                        C2914kb.m7426(m7267((byte) (24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u0003\u0007\b\t\n\u000b\u0006\r\u000e\u000f\u000e\u0010\u0011\u000e\u0010\u0010\u000b\r\u0013", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26).intern(), m7267((byte) (44 - View.combineMeasuredStates(0, 0)), "\u001b\r\u000e\u0003\f\u0015\b\u0010\u0014\u0000\u0011\u0002\u0000\b\b\t", 16 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th, false);
                    }
                }
            });
            f7033 = (f7032 + 37) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m7251((ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, AndroidCharacter.getMirror('0') - 22, TextUtils.lastIndexOf("", '0') + 264, "￡\u0006\t￼\ufffb\u0006￮\t\u000f�\u0002￦\u0003\r\u000e\uffff\b\uffff\f￭\uffff\f\u0010\u0003�\uffff", false).intern(), m7251(4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 32 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 256, "\u0010\u0013\u0013￦\ufffa\u0018\u0002\u0013\uffc1\u0013\u0010\uffc1\ufff9\u0018\u0002\u0013\uffc1\t\u0004\u0016\u0010\u0015\uffc1\b\u000f\n\u0015\u0015\u0006\b\uffc1\u0013", true).intern(), th, false);
        }
    }

    /* renamed from: ﾒ */
    private void m7262(ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = f7033 + 121;
        f7032 = i % 128;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
            if (viewGroup == null) {
                return;
            }
        } else if (viewGroup == null) {
            return;
        }
        if (m7259(viewGroup)) {
            return;
        }
        Activity activityM7473 = C2917ke.m7473(viewGroup);
        if (C2897jl.m7293().m7294(activityM7473)) {
            if (viewGroup.findViewById(160766228) == null) {
                int i3 = f7033 + 25;
                f7032 = i3 % 128;
                if (i3 % 2 != 0) {
                    m7253(viewGroup, onLayoutChangeListener);
                    return;
                } else {
                    m7253(viewGroup, onLayoutChangeListener);
                    throw null;
                }
            }
        } else if (C2897jl.m7293().m7296(activityM7473)) {
            m7258(viewGroup, onLayoutChangeListener);
            f7033 = (f7032 + 59) % 128;
        }
        int i4 = f7032 + 49;
        f7033 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private static String m7251(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f7034);
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
