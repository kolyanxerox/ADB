package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.p009i.C2897jl;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cp */
/* loaded from: classes2.dex */
public class C2712cp {

    /* renamed from: ﬤ */
    private static int f5691 = 0;

    /* renamed from: ףּ */
    private static int f5692 = 1;

    /* renamed from: ﭖ */
    private static char f5693 = 32023;

    /* renamed from: ﭴ */
    private static char f5694 = 35948;

    /* renamed from: ﭸ */
    private static char f5695 = 24829;

    /* renamed from: ﮉ */
    private static long f5696 = -2487500438217411902L;

    /* renamed from: ﮌ */
    private static char f5697 = 3666;

    /* renamed from: ﮐ */
    private AbstractC2891jf f5698 = null;

    /* renamed from: ﱟ */
    private C2710cn f5699;

    /* renamed from: ﱡ */
    private C2898jm f5700;

    /* renamed from: ﺙ */
    private JSONObject f5701;

    /* renamed from: ﻏ */
    private C2932y f5702;

    /* renamed from: ﻐ */
    private C2850hs f5703;

    /* renamed from: ﻛ */
    private InterfaceC2704ch f5704;

    /* renamed from: ｋ */
    private C2728de f5705;

    /* renamed from: ﾇ */
    private AbstractC2676bg f5706;

    /* renamed from: ﾒ */
    private C2741dr f5707;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$1 */
    public class AnonymousClass1 extends AbstractC2891jf {
        public AnonymousClass1() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C2712cp c2712cp = C2712cp.this;
            c2712cp.m6299(C2869ik.f6803, C2712cp.m6262(c2712cp, activity, null));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C2712cp c2712cp = C2712cp.this;
            c2712cp.m6299(C2869ik.f6802, C2712cp.m6262(c2712cp, activity, null));
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$10 */
    public class AnonymousClass10 extends AbstractC2873io {

        /* renamed from: ﻐ */
        private /* synthetic */ List f5709;

        /* renamed from: ﻛ */
        private /* synthetic */ String f5710;

        public AnonymousClass10(String str, List list) {
            str = str;
            list = list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2712cp.m6253(C2712cp.this, str, true, false, list);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$11 */
    public class AnonymousClass11 extends C2919l {

        /* renamed from: ﱡ */
        private static int f5712 = 1;

        /* renamed from: ﻏ */
        private static int f5713 = 0;

        /* renamed from: ﻐ */
        private static char f5714 = 8809;

        /* renamed from: ﻛ */
        private static long f5715;

        /* renamed from: ﾇ */
        private static int f5716;

        /* renamed from: ﾒ */
        private /* synthetic */ boolean f5718;

        public AnonymousClass11(boolean z) {
            z = z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻐ */
        public final /* synthetic */ void mo4932(JSONObject jSONObject, WebView webView, Activity activity) {
            int i = f5713 + 115;
            f5712 = i % 128;
            int i2 = i % 2;
            mo4932(jSONObject, webView, activity);
            if (i2 == 0) {
                throw null;
            }
            f5712 = (f5713 + 81) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final /* synthetic */ void mo6307(JSONObject jSONObject, WebView webView, Activity activity) {
            f5713 = (f5712 + 119) % 128;
            mo6307(jSONObject, webView, activity);
            int i = f5713 + 123;
            f5712 = i % 128;
            if (i % 2 == 0) {
                int i2 = 44 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final /* synthetic */ void mo4939(JSONObject jSONObject, WebView webView, Activity activity) {
            f5712 = (f5713 + 21) % 128;
            mo4939(jSONObject, webView, activity);
            int i = f5713 + 97;
            f5712 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final /* synthetic */ void mo6312(JSONObject jSONObject, WebView webView, Activity activity) {
            f5712 = (f5713 + 83) % 128;
            mo6312(jSONObject, webView, activity);
            f5712 = (f5713 + 121) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final /* bridge */ /* synthetic */ void mo6316(JSONObject jSONObject, WebView webView, Activity activity) {
            f5713 = (f5712 + 9) % 128;
            mo6316(jSONObject, webView, activity);
            int i = f5712 + 11;
            f5713 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
        /* renamed from: ﻐ */
        public final void mo6312(JSONObject jSONObject, WebView webView, Activity activity) {
            int i = f5712 + 57;
            f5713 = i % 128;
            if (i % 2 != 0) {
                m6302(m6303(Color.rgb(1, 1, 1) * (-1228698065), (char) (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), "⼊쎎䂷⃒", "垽扔㘖㲵遐硪Ⴙ갡냻㌨踑", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
            } else {
                m6302(m6303((-1228698065) - Color.rgb(0, 0, 0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "⼊쎎䂷⃒", "垽扔㘖㲵遐硪Ⴙ갡냻㌨踑", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
        /* renamed from: ﻛ */
        public final void mo4939(JSONObject jSONObject, WebView webView, Activity activity) {
            int i = f5712 + 57;
            f5713 = i % 128;
            if (i % 2 != 0) {
                m6302(m6303((-1336047436) << (PointF.length(0.0f, 1.0f) > 1.0f ? 1 : (PointF.length(0.0f, 1.0f) == 1.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), "뒻嶈ධホ", "㑡₋隂筠꯱뤯鬥ഡ\u0b80嬋贋", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
            } else {
                m6302(m6303((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1336047436, (char) View.MeasureSpec.getSize(0), "뒻嶈ධホ", "㑡₋隂筠꯱뤯鬥ഡ\u0b80嬋贋", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final /* synthetic */ void mo6309(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            f5712 = (f5713 + 59) % 128;
            mo6309(jSONObject, webView, obj, activity);
            f5712 = (f5713 + 25) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final /* synthetic */ void mo6313(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            int i = f5713 + 53;
            f5712 = i % 128;
            int i2 = i % 2;
            mo6313(jSONObject, webView, obj, activity);
            if (i2 == 0) {
                int i3 = 5 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final /* synthetic */ void mo6317(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            int i = f5712 + 3;
            f5713 = i % 128;
            int i2 = i % 2;
            mo6317(jSONObject, webView, obj, activity);
            if (i2 != 0) {
                throw null;
            }
            f5713 = (f5712 + 55) % 128;
        }

        /* renamed from: ﻐ */
        private void m6302(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            C2712cp.m6253(C2712cp.this, AbstractC2183w4.OooOO0o(new StringBuilder(), m6303(1690122599 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58099), "杹봹\uf364ꋢ", "䔶\u18adႻ䰗耲䩘燝ὦ⯶㵊玞捡끴锩쥂𤋮釾\ueb4c⃛", "\u0000\u0000\u0000\u0000"), str), z, false, Arrays.asList(jSONObject, webView, obj, activity));
            f5712 = (f5713 + 75) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
        /* renamed from: ﻛ */
        public final void mo6317(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            f5713 = (f5712 + 23) % 128;
            m6302(m6303((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126652813, (char) (46941 - Color.red(0)), "踄貑崇㦷", "\ud8c5䲦붞敜橋맃쥾\uf720\ua62e륀㞀䪴﹜뙘ⴀ", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, obj, activity);
            f5712 = (f5713 + 117) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
        /* renamed from: ｋ */
        public final void mo6307(JSONObject jSONObject, WebView webView, Activity activity) {
            int i = f5712 + 87;
            f5713 = i % 128;
            if (i % 2 != 0) {
                m6302(m6303(TextUtils.indexOf("", ""), (char) ((byte) KeyEvent.getModifierMetaStateMask()), "ꁣꐧ缷ʦ", "庴\ue1aaᓽᆇ좔Ƴ丌鷵", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
            } else {
                m6302(m6303(TextUtils.indexOf("", ""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), "ꁣꐧ缷ʦ", "庴\ue1aaᓽᆇ좔Ƴ丌鷵", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
            }
            f5712 = (f5713 + 1) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
        /* renamed from: ﾇ */
        public final void mo4932(JSONObject jSONObject, WebView webView, Activity activity) {
            int i = f5712 + 123;
            f5713 = i % 128;
            if (i % 2 != 0) {
                m6302(m6303(ViewConfiguration.getFadingEdgeLength() - 124, (char) (59741 >> View.resolveSize(1, 0)), "專푃工맩", "䷥\uf3bf邀枏胖॒坹ﲪ憡뮹⬒臌ᒘﱗ뻗\udb0d", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
            } else {
                m6302(m6303(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (View.resolveSize(0, 0) + 59741), "專푃工맩", "䷥\uf3bf邀枏胖॒坹ﲪ憡뮹⬒臌ᒘﱗ뻗\udb0d", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
            }
            f5713 = (f5712 + 27) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
        /* renamed from: ﾒ */
        public final void mo6316(JSONObject jSONObject, WebView webView, Activity activity) {
            f5713 = (f5712 + 93) % 128;
            m6302(m6303((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), "㈡蠽漶烔", "\uec8b䉮먌瀠뀅℘權ꨚ㆝蓸鏠\uf8cb", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
            f5713 = (f5712 + 35) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
        /* renamed from: ﾇ */
        public final void mo6309(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            f5712 = (f5713 + 73) % 128;
            m6302(m6303((-1576291188) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.indexOf("", "", 0, 0), "賴ழ\ue9a2\ue2ad", "克࿖㭵Ṉ㓂\uf3ad쿶萮㘪", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, obj, activity);
            f5713 = (f5712 + 93) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
        /* renamed from: ﾒ */
        public final void mo6313(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            f5712 = (f5713 + 65) % 128;
            m6302(m6303(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) TextUtils.indexOf("", "", 0), "⊮ᭉ\uf555\ue8be", "楊辂̺廸쥥ᢀᇴ꺊䭀䠅춴龨ᰌ禮\uaaff墲ݯ蔪娚┺", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, obj, activity);
            f5713 = (f5712 + 83) % 128;
        }

        /* renamed from: ﾇ */
        private static String m6303(int i, char c, String str, String str2, String str3) {
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
                            cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f5715) ^ f5716) ^ f5714);
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

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$12 */
    public class AnonymousClass12 extends C2919l {

        /* renamed from: ﻐ */
        private /* synthetic */ C2919l f5719;

        /* renamed from: ﾒ */
        private /* synthetic */ C2919l f5721;

        public AnonymousClass12(C2919l c2919l, C2919l c2919l2) {
            c2919l = c2919l;
            c2919l = c2919l2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻐ */
        public final void mo6312(JSONObject jSONObject, WebView webView, Activity activity) {
            c2919l.mo6312(jSONObject, webView, activity);
            C2926s.m7591(new f.AnonymousClass1(c2919l, jSONObject, webView, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final void mo4939(JSONObject jSONObject, WebView webView, Activity activity) {
            c2919l.mo4939(jSONObject, webView, activity);
            C2926s.m7591(new e.AnonymousClass5(c2919l, jSONObject, webView, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final void mo6307(JSONObject jSONObject, WebView webView, Activity activity) {
            c2919l.mo6307(jSONObject, webView, activity);
            C2926s.m7591(new a.AnonymousClass1(c2919l, jSONObject, webView, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo4932(JSONObject jSONObject, WebView webView, Activity activity) {
            c2919l.mo4932(jSONObject, webView, activity);
            C2926s.m7591(new b.AnonymousClass3(c2919l, jSONObject, webView, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo6316(JSONObject jSONObject, WebView webView, Activity activity) {
            c2919l.mo6316(jSONObject, webView, activity);
            C2926s.m7591(new g.AnonymousClass5(c2919l, jSONObject, webView, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final void mo6317(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            c2919l.mo6317(jSONObject, webView, obj, activity);
            C2926s.m7591(new c.AnonymousClass3(c2919l, jSONObject, webView, obj, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo6309(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            c2919l.mo6309(jSONObject, webView, obj, activity);
            C2926s.m7591(new d.AnonymousClass3(c2919l, jSONObject, webView, obj, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo6313(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
            c2919l.mo6313(jSONObject, webView, obj, activity);
            C2926s.m7591(new j.AnonymousClass3(c2919l, jSONObject, webView, obj, activity));
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$13 */
    public class AnonymousClass13 extends C2928u {

        /* renamed from: ﱟ */
        private static int f5722 = 1;

        /* renamed from: ﾒ */
        private static int f5725;

        /* renamed from: ﻐ */
        private /* synthetic */ boolean f5726;

        /* renamed from: ﾇ */
        private static char[] f5724 = {39316, 51678, 14639, 26993, 55482, 2062, 30787, 43965, 7156, 19287, 47751, 50622, 38388, 25861, 13659, 33936, 21540, 9321, 63383, 18398, 6013, 59053, 46847, 1555, 53672, 41471, 28959, 59994, 47632, 19174, 6842, 43886, 31699, 2954, 55415, 26663, 'a', 20523, 41181, 61569, 16725, 37352, 57777, 12876, 33308, 53889, 9060, 29450, 50137, 5193, 25633, 61976, 41554, 21156, 760, 45866, 25473, 5062, 49204, 'v', 20518, 41211, 61594, 16765, 37375, 57774, 12872, 33307, 53935, 9075, 29441, 'w', 20522, 41212, 61614, 16724, 37369, 57781, 12868, 33309, 53892, 9082, 29452, 50129, 5229, 25638, 46308, 1158, 21850, 42464, 62889, 43440, 63977, 2366, 22858, 59520, 14389, 18508, 39820, 11214, 31610, 35505, 'W', 20518, 41200, 61577, 16723, 37372, 57755, 12877, 33332, 53934, 9061, 29457, 50129, 5229, 25655, 46291, 1246};

        /* renamed from: ｋ */
        private static long f5723 = 1020903997458632783L;

        public AnonymousClass13(boolean z) {
            z = z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻐ */
        public final /* synthetic */ void mo4932(JSONObject jSONObject, WebView webView, View view) {
            f5725 = (f5722 + 19) % 128;
            mo4932(jSONObject, webView, view);
            f5722 = (f5725 + 107) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final /* synthetic */ void mo6307(JSONObject jSONObject, WebView webView, View view) {
            f5725 = (f5722 + 25) % 128;
            mo6307(jSONObject, webView, view);
            int i = f5725 + 59;
            f5722 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final /* synthetic */ void mo4939(JSONObject jSONObject, WebView webView, View view) {
            f5725 = (f5722 + 25) % 128;
            mo4939(jSONObject, webView, view);
            f5725 = (f5722 + 37) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final /* synthetic */ void mo6312(JSONObject jSONObject, WebView webView, View view) {
            int i = f5725 + 91;
            f5722 = i % 128;
            int i2 = i % 2;
            mo6312(jSONObject, webView, view);
            if (i2 == 0) {
                throw null;
            }
            int i3 = f5722 + 57;
            f5725 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 72 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final /* synthetic */ void mo6316(JSONObject jSONObject, WebView webView, View view) {
            f5725 = (f5722 + 23) % 128;
            mo6316(jSONObject, webView, view);
            int i = f5722 + 87;
            f5725 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
        /* renamed from: ﻐ */
        public final void mo6312(JSONObject jSONObject, WebView webView, View view) {
            int i = f5722 + 85;
            f5725 = i % 128;
            if (i % 2 != 0) {
                m6318(m6319(MotionEvent.axisFromString("") + 119, 116 / (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (43475 >>> (PointF.length(1.0f, 0.0f) > 2.0f ? 1 : (PointF.length(1.0f, 0.0f) == 2.0f ? 0 : -1)))).intern(), jSONObject, webView, null, view);
            } else {
                m6318(m6319(10 - MotionEvent.axisFromString(""), 92 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43475)).intern(), jSONObject, webView, null, view);
            }
            f5722 = (f5725 + 119) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
        /* renamed from: ﻛ */
        public final void mo4939(JSONObject jSONObject, WebView webView, View view) {
            f5725 = (f5722 + 67) % 128;
            m6318(m6319(11 - ((Process.getThreadPriority(0) + 20) >> 6), KeyEvent.normalizeMetaState(0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 39413)).intern(), jSONObject, webView, null, view);
            int i = f5725 + 57;
            f5722 = i % 128;
            if (i % 2 == 0) {
                int i2 = 3 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final /* synthetic */ void mo6309(JSONObject jSONObject, WebView webView, Object obj, View view) {
            int i = f5722 + 57;
            f5725 = i % 128;
            int i2 = i % 2;
            mo6309(jSONObject, webView, obj, view);
            if (i2 != 0) {
                int i3 = 47 / 0;
            }
            f5722 = (f5725 + 55) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final /* bridge */ /* synthetic */ void mo6313(JSONObject jSONObject, WebView webView, Object obj, View view) {
            int i = f5722 + 85;
            f5725 = i % 128;
            int i2 = i % 2;
            mo6313(jSONObject, webView, obj, view);
            if (i2 != 0) {
                throw null;
            }
            f5722 = (f5725 + 67) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final /* bridge */ /* synthetic */ void mo6317(JSONObject jSONObject, WebView webView, Object obj, View view) {
            f5722 = (f5725 + 49) % 128;
            mo6317(jSONObject, webView, obj, view);
            f5725 = (f5722 + 81) % 128;
        }

        /* renamed from: ﻐ */
        private void m6318(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
            C2712cp.m6253(C2712cp.this, AbstractC2183w4.OooOO0o(new StringBuilder(), m6319(16 - TextUtils.indexOf((CharSequence) "", '0'), 102 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), str), z, false, Arrays.asList(jSONObject, webView, obj, view));
            f5725 = (f5722 + 45) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
        /* renamed from: ﻛ */
        public final void mo6309(JSONObject jSONObject, WebView webView, Object obj, View view) {
            int i = f5725 + 3;
            f5722 = i % 128;
            if (i % 2 == 0) {
                m6318(m6319(ViewConfiguration.getMinimumFlingVelocity() * 330, 90 >>> KeyEvent.keyCodeFromString(""), (char) (59963 / (ViewConfiguration.getFadingEdgeLength() - 107))).intern(), jSONObject, webView, obj, view);
            } else {
                m6318(m6319((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9, 27 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 59963)).intern(), jSONObject, webView, obj, view);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
        /* renamed from: ｋ */
        public final void mo6316(JSONObject jSONObject, WebView webView, View view) {
            f5722 = (f5725 + 35) % 128;
            m6318(m6319(Color.blue(0) + 12, (Process.myTid() >> 22) + 59, (char) ExpandableListView.getPackedPositionType(0L)).intern(), jSONObject, webView, null, view);
            int i = f5725 + 75;
            f5722 = i % 128;
            if (i % 2 == 0) {
                int i2 = 82 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
        /* renamed from: ﾇ */
        public final void mo6307(JSONObject jSONObject, WebView webView, View view) {
            f5725 = (f5722 + 97) % 128;
            m6318(m6319(8 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 51 - View.MeasureSpec.getSize(0), (char) (View.resolveSizeAndState(0, 0, 0) + 62073)).intern(), jSONObject, webView, null, view);
            int i = f5725 + 27;
            f5722 = i % 128;
            if (i % 2 == 0) {
                int i2 = 80 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
        /* renamed from: ﾒ */
        public final void mo4932(JSONObject jSONObject, WebView webView, View view) {
            f5725 = (f5722 + 125) % 128;
            m6318(m6319(16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (50655 - (KeyEvent.getMaxKeyCode() >> 16))).intern(), jSONObject, webView, null, view);
            f5722 = (f5725 + InterfaceC3173h3.d.b.f8821d) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
        /* renamed from: ﾇ */
        public final void mo6313(JSONObject jSONObject, WebView webView, Object obj, View view) {
            int i = f5722 + InterfaceC3173h3.d.b.f8819b;
            f5725 = i % 128;
            if (i % 2 != 0) {
                m6318(m6319(51 / KeyEvent.getDeadChar(1, 1), 84 >>> TextUtils.indexOf("", "", 1), (char) TextUtils.indexOf("", "", 0, 1)).intern(), jSONObject, webView, obj, view);
            } else {
                m6318(m6319(KeyEvent.getDeadChar(0, 0) + 20, 71 - TextUtils.indexOf("", "", 0), (char) TextUtils.indexOf("", "", 0, 0)).intern(), jSONObject, webView, obj, view);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
        /* renamed from: ﾒ */
        public final void mo6317(JSONObject jSONObject, WebView webView, Object obj, View view) {
            f5722 = (f5725 + 17) % 128;
            m6318(m6319(15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 36, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), jSONObject, webView, obj, view);
            int i = f5722 + 77;
            f5725 = i % 128;
            if (i % 2 != 0) {
                int i2 = 25 / 0;
            }
        }

        /* renamed from: ﾇ */
        private static String m6319(int i, int i2, char c) {
            String str;
            synchronized (C2642a.f4435) {
                try {
                    char[] cArr = new char[i];
                    C2642a.f4436 = 0;
                    while (true) {
                        int i3 = C2642a.f4436;
                        if (i3 < i) {
                            cArr[i3] = (char) ((f5724[i2 + i3] ^ (i3 * f5723)) ^ c);
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
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$14 */
    public class AnonymousClass14 extends C2928u {

        /* renamed from: ﻐ */
        private /* synthetic */ C2928u f5728;

        /* renamed from: ﾒ */
        private /* synthetic */ C2928u f5730;

        public AnonymousClass14(C2928u c2928u, C2928u c2928u2) {
            c2928u = c2928u;
            c2928u = c2928u2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻐ */
        public final void mo6312(JSONObject jSONObject, WebView webView, View view) {
            c2928u.mo6312(jSONObject, webView, view);
            C2926s.m7591(new f.AnonymousClass1(c2928u, jSONObject, webView, view));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final void mo4939(JSONObject jSONObject, WebView webView, View view) {
            c2928u.mo4939(jSONObject, webView, view);
            C2926s.m7591(new e.AnonymousClass5(c2928u, jSONObject, webView, view));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final void mo6316(JSONObject jSONObject, WebView webView, View view) {
            c2928u.mo6316(jSONObject, webView, view);
            C2926s.m7591(new g.AnonymousClass5(c2928u, jSONObject, webView, view));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo6307(JSONObject jSONObject, WebView webView, View view) {
            c2928u.mo6307(jSONObject, webView, view);
            C2926s.m7591(new a.AnonymousClass1(c2928u, jSONObject, webView, view));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo4932(JSONObject jSONObject, WebView webView, View view) {
            c2928u.mo4932(jSONObject, webView, view);
            C2926s.m7591(new b.AnonymousClass3(c2928u, jSONObject, webView, view));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final void mo6309(JSONObject jSONObject, WebView webView, Object obj, View view) {
            c2928u.mo6309(jSONObject, webView, obj, view);
            C2926s.m7591(new d.AnonymousClass3(c2928u, jSONObject, webView, obj, view));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo6313(JSONObject jSONObject, WebView webView, Object obj, View view) {
            c2928u.mo6313(jSONObject, webView, obj, view);
            C2926s.m7591(new j.AnonymousClass3(c2928u, jSONObject, webView, obj, view));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo6317(JSONObject jSONObject, WebView webView, Object obj, View view) {
            c2928u.mo6317(jSONObject, webView, obj, view);
            C2926s.m7591(new c.AnonymousClass3(c2928u, jSONObject, webView, obj, view));
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$15 */
    public class AnonymousClass15 extends C2927t {

        /* renamed from: ﮐ */
        private static boolean f5731 = true;

        /* renamed from: ﱟ */
        private static int f5732 = 1;

        /* renamed from: ﱡ */
        private static int f5733 = 0;

        /* renamed from: ﻐ */
        private static int f5734 = 132;

        /* renamed from: ﾇ */
        private static boolean f5735 = true;

        /* renamed from: ﾒ */
        private static char[] f5736 = {229, 232, 200, 237, 247, 244, 240, 253, 233, 201, 252, 248, 246, 199, 231, 239, 202, 243, 241, 206, 250, 251, 197, 236, 230, 242, 249, 218, 208, 178};

        /* renamed from: ﻛ */
        private /* synthetic */ boolean f5737;

        public AnonymousClass15(boolean z) {
            z = z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻐ */
        public final /* synthetic */ void mo4932(JSONObject jSONObject, View view, Activity activity) {
            int i = f5732 + 27;
            f5733 = i % 128;
            int i2 = i % 2;
            mo4932(jSONObject, view, activity);
            if (i2 != 0) {
                int i3 = 0 / 0;
            }
            int i4 = f5733 + 27;
            f5732 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final /* synthetic */ void mo6307(JSONObject jSONObject, View view, Activity activity) {
            f5732 = (f5733 + InterfaceC3173h3.d.b.f8819b) % 128;
            mo6307(jSONObject, view, activity);
            f5733 = (f5732 + 65) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final /* synthetic */ void mo4939(JSONObject jSONObject, View view, Activity activity) {
            int i = f5732 + 123;
            f5733 = i % 128;
            int i2 = i % 2;
            mo4939(jSONObject, view, activity);
            if (i2 != 0) {
                int i3 = 12 / 0;
            }
            int i4 = f5732 + 27;
            f5733 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final /* synthetic */ void mo6312(JSONObject jSONObject, View view, Activity activity) {
            f5732 = (f5733 + 99) % 128;
            mo6312(jSONObject, view, activity);
            f5733 = (f5732 + 57) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final /* synthetic */ void mo6316(JSONObject jSONObject, View view, Activity activity) {
            f5732 = (f5733 + 123) % 128;
            mo6316(jSONObject, view, activity);
            int i = f5733 + 77;
            f5732 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
        /* renamed from: ﻐ */
        public final void mo6316(JSONObject jSONObject, View view, Activity activity) {
            int i = f5733 + 57;
            f5732 = i % 128;
            if (i % 2 == 0) {
                m6329(m6328((String) null, (int[]) null, 97 % (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0082\u0089\u0098\u008f\u0081\u008c\u008c\u0097\u0096\u0089\u0084\u0095").intern(), jSONObject, view, null, activity);
            } else {
                m6329(m6328((String) null, (int[]) null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, "\u0082\u0089\u0098\u008f\u0081\u008c\u008c\u0097\u0096\u0089\u0084\u0095").intern(), jSONObject, view, null, activity);
            }
            f5732 = (f5733 + 47) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
        /* renamed from: ﻛ */
        public final void mo4939(JSONObject jSONObject, View view, Activity activity) {
            f5732 = (f5733 + 27) % 128;
            m6329(m6328((String) null, (int[]) null, 127 - KeyEvent.keyCodeFromString(""), "\u0082\u0089\u0088\u0081\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject, view, null, activity);
            int i = f5733 + 85;
            f5732 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final /* bridge */ /* synthetic */ void mo6309(JSONObject jSONObject, View view, Object obj, Activity activity) {
            f5733 = (f5732 + 91) % 128;
            mo6309(jSONObject, view, obj, activity);
            int i = f5732 + InterfaceC3173h3.d.b.f8826i;
            f5733 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final /* bridge */ /* synthetic */ void mo6313(JSONObject jSONObject, View view, Object obj, Activity activity) {
            int i = f5732 + 113;
            f5733 = i % 128;
            int i2 = i % 2;
            mo6313(jSONObject, view, obj, activity);
            if (i2 != 0) {
                throw null;
            }
            f5732 = (f5733 + 95) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final /* bridge */ /* synthetic */ void mo6317(JSONObject jSONObject, View view, Object obj, Activity activity) {
            int i = f5732 + 25;
            f5733 = i % 128;
            int i2 = i % 2;
            mo6317(jSONObject, view, obj, activity);
            if (i2 != 0) {
                int i3 = 66 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
        /* renamed from: ｋ */
        public final void mo6309(JSONObject jSONObject, View view, Object obj, Activity activity) {
            f5733 = (f5732 + 23) % 128;
            m6329(m6328((String) null, (int[]) null, Process.getGidForName("") + 128, "\u0082\u0089\u0090\u008f\u0084\u0087\u008e\u0082\u0081").intern(), jSONObject, view, obj, activity);
            f5733 = (f5732 + 29) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
        /* renamed from: ﾇ */
        public final void mo4932(JSONObject jSONObject, View view, Activity activity) {
            f5732 = (f5733 + 35) % 128;
            m6329(m6328((String) null, (int[]) null, 126 - ImageFormat.getBitsPerPixel(0), "\u0081\u008d\u008c\u008b\u008a\u0082\u0089\u0088\u0081\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject, view, null, activity);
            f5733 = (f5732 + 115) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
        /* renamed from: ﾒ */
        public final void mo6317(JSONObject jSONObject, View view, Object obj, Activity activity) {
            f5733 = (f5732 + 87) % 128;
            m6329(m6328((String) null, (int[]) null, TextUtils.indexOf("", "", 0) + 127, "\u0085\u0094\u0093\u0092\u008d\u0091\u0082\u0089\u0090\u008f\u0084\u0087\u008e\u0082\u0081").intern(), jSONObject, view, obj, activity);
            f5732 = (f5733 + 45) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
        /* renamed from: ｋ */
        public final void mo6307(JSONObject jSONObject, View view, Activity activity) {
            f5732 = (f5733 + 57) % 128;
            m6329(m6328((String) null, (int[]) null, View.MeasureSpec.getSize(0) + 127, "\u0082\u0089\u0085\u0092\u0087\u008e\u0082\u0081").intern(), jSONObject, view, null, activity);
            f5733 = (f5732 + 45) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
        /* renamed from: ﾇ */
        public final void mo6313(JSONObject jSONObject, View view, Object obj, Activity activity) {
            f5732 = (f5733 + InterfaceC3173h3.d.b.f8819b) % 128;
            m6329(m6328((String) null, (int[]) null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u008c\u009a\u0089\u0095\u008a\u008c\u009a\u0089\u0084\u0087\u008e\u0089\u0093\u0092\u008d\u0098\u008e\u0099\u0089\u0096").intern(), jSONObject, view, obj, activity);
            int i = f5733 + 87;
            f5732 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
        /* renamed from: ﾒ */
        public final void mo6312(JSONObject jSONObject, View view, Activity activity) {
            int i = f5733 + 97;
            f5732 = i % 128;
            if (i % 2 == 0) {
                m6329(m6328((String) null, (int[]) null, (ViewConfiguration.getTapTimeout() >> 41) + 15, "\u008c\u009a\u0089\u0095\u008a\u0093\u0092\u008c\u0085\u009b\u008f").intern(), jSONObject, view, null, activity);
            } else {
                m6329(m6328((String) null, (int[]) null, 127 - (ViewConfiguration.getTapTimeout() >> 16), "\u008c\u009a\u0089\u0095\u008a\u0093\u0092\u008c\u0085\u009b\u008f").intern(), jSONObject, view, null, activity);
            }
            f5733 = (f5732 + 121) % 128;
        }

        /* renamed from: ﾒ */
        private void m6329(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
            C2712cp.m6253(C2712cp.this, AbstractC2183w4.OooOO0o(new StringBuilder(), m6328((String) null, (int[]) null, 127 - Gravity.getAbsoluteGravity(0, 0), "\u009e\u008d\u0089\u009a\u0089\u008c\u0085\u0084\u009d\u0082\u0097\u0096\u0089\u0084\u009c"), str), z, false, Arrays.asList(jSONObject, view, obj, activity));
            f5732 = (f5733 + 81) % 128;
        }

        /* renamed from: ﾒ */
        private static String m6328(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f5736;
                    int i2 = f5734;
                    if (f5731) {
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
                    if (f5735) {
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

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$16 */
    public class AnonymousClass16 extends C2927t {

        /* renamed from: ﻐ */
        private /* synthetic */ C2927t f5739;

        /* renamed from: ﾇ */
        private /* synthetic */ C2927t f5740;

        public AnonymousClass16(C2927t c2927t, C2927t c2927t2) {
            c2927t = c2927t;
            c2927t = c2927t2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻐ */
        public final void mo6316(JSONObject jSONObject, View view, Activity activity) {
            c2927t.mo6316(jSONObject, view, activity);
            C2926s.m7591(new g.AnonymousClass5(c2927t, jSONObject, view, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final void mo4939(JSONObject jSONObject, View view, Activity activity) {
            c2927t.mo4939(jSONObject, view, activity);
            C2926s.m7591(new e.AnonymousClass5(c2927t, jSONObject, view, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final void mo6309(JSONObject jSONObject, View view, Object obj, Activity activity) {
            c2927t.mo6309(jSONObject, view, obj, activity);
            C2926s.m7591(new d.AnonymousClass3(c2927t, jSONObject, view, obj, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo4932(JSONObject jSONObject, View view, Activity activity) {
            c2927t.mo4932(jSONObject, view, activity);
            C2926s.m7591(new b.AnonymousClass3(c2927t, jSONObject, view, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo6317(JSONObject jSONObject, View view, Object obj, Activity activity) {
            c2927t.mo6317(jSONObject, view, obj, activity);
            C2926s.m7591(new c.AnonymousClass3(c2927t, jSONObject, view, obj, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final void mo6307(JSONObject jSONObject, View view, Activity activity) {
            c2927t.mo6307(jSONObject, view, activity);
            C2926s.m7591(new a.AnonymousClass1(c2927t, jSONObject, view, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo6313(JSONObject jSONObject, View view, Object obj, Activity activity) {
            c2927t.mo6313(jSONObject, view, obj, activity);
            C2926s.m7591(new j.AnonymousClass3(c2927t, jSONObject, view, obj, activity));
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo6312(JSONObject jSONObject, View view, Activity activity) {
            c2927t.mo6312(jSONObject, view, activity);
            C2926s.m7591(new f.AnonymousClass1(c2927t, jSONObject, view, activity));
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$2 */
    public class AnonymousClass2 implements InterfaceC2704ch {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$2$5 */
        public class AnonymousClass5 extends AbstractC2873io {

            /* renamed from: ﻛ */
            private /* synthetic */ List f5743;

            /* renamed from: ｋ */
            private /* synthetic */ String f5744;

            /* renamed from: ﾇ */
            private /* synthetic */ boolean f5745;

            public AnonymousClass5(String str, boolean z, List list) {
                str = str;
                z = z;
                list = list;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2712cp.m6253(C2712cp.this, str, false, z, list);
            }
        }

        public AnonymousClass2() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch
        /* renamed from: ﾇ */
        public final void mo6153(String str, List<Object> list) {
            C2712cp.m6253(C2712cp.this, str, true, false, list);
            C2712cp.m6268(C2712cp.this, (AbstractC2873io) new AbstractC2873io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2.5

                /* renamed from: ﻛ */
                private /* synthetic */ List f5743;

                /* renamed from: ｋ */
                private /* synthetic */ String f5744;

                /* renamed from: ﾇ */
                private /* synthetic */ boolean f5745;

                public AnonymousClass5(String str2, boolean z, List list2) {
                    str = str2;
                    z = z;
                    list = list2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2712cp.m6253(C2712cp.this, str, false, z, list);
                }
            }, false);
            C2712cp.m6268(C2712cp.this, (AbstractC2873io) new AbstractC2873io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2.5

                /* renamed from: ﻛ */
                private /* synthetic */ List f5743;

                /* renamed from: ｋ */
                private /* synthetic */ String f5744;

                /* renamed from: ﾇ */
                private /* synthetic */ boolean f5745;

                public AnonymousClass5(String str2, boolean z, List list2) {
                    str = str2;
                    z = z;
                    list = list2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2712cp.m6253(C2712cp.this, str, false, z, list);
                }
            }, true);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$4 */
    public class AnonymousClass4 extends AbstractC2873io {

        /* renamed from: ﻛ */
        private /* synthetic */ List f5754;

        /* renamed from: ｋ */
        private /* synthetic */ String f5755;

        public AnonymousClass4(String str, List list) {
            str = str;
            list = list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2712cp.m6253(C2712cp.this, str, false, false, list);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$5 */
    public class AnonymousClass5 implements InterfaceC2900jo {

        /* renamed from: ﱟ */
        private static short[] f5756 = null;

        /* renamed from: ﱡ */
        private static byte[] f5757 = {-107, -78, -73, -112, 106, 77, -95, 71, -102, 107, 76, -103, -81, -93, 83, -85, 81, 94, 67, -113, -82, 66, -92, 121, -120, -81, -101, -34, 111, -107, 107, -109, 99, 104, 127, -69, -100, 112, -106, 75, -76, 98, 77};

        /* renamed from: ﺙ */
        private static int f5758 = 1;

        /* renamed from: ﻏ */
        private static int f5759 = 0;

        /* renamed from: ﻐ */
        private static int f5760 = -194990505;

        /* renamed from: ﾇ */
        private static int f5761 = 118;

        /* renamed from: ﾒ */
        private static int f5762 = -1585527044;

        /* renamed from: ﻛ */
        private /* synthetic */ List f5763;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$5$3 */
        public class AnonymousClass3 extends AbstractRunnableC2878it {

            /* renamed from: ｋ */
            private /* synthetic */ String f5766;

            /* renamed from: ﾇ */
            private /* synthetic */ Activity f5767;

            public AnonymousClass3(String str, Activity activity) {
                str = str;
                activity = activity;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2712cp.m6253(C2712cp.this, str, false, false, Collections.singletonList(activity));
            }
        }

        public AnonymousClass5(List list) {
            list = list;
        }

        /* renamed from: ｋ */
        private static String m6340(byte b, short s, int i, int i2, int i3) {
            String string;
            synchronized (C2912k.f7200) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i4 = f5761;
                    int i5 = i + i4;
                    int i6 = i5 == -1 ? 1 : 0;
                    if (i6 != 0) {
                        byte[] bArr = f5757;
                        i5 = bArr != null ? (byte) (bArr[f5760 + i2] + i4) : (short) (f5756[f5760 + i2] + i4);
                    }
                    if (i5 > 0) {
                        C2912k.f7203 = ((i2 + i5) - 2) + f5760 + i6;
                        C2912k.f7201 = b;
                        char c = (char) (i3 + f5762);
                        C2912k.f7204 = c;
                        sb.append(c);
                        C2912k.f7202 = C2912k.f7204;
                        C2912k.f7205 = 1;
                        while (C2912k.f7205 < i5) {
                            byte[] bArr2 = f5757;
                            if (bArr2 != null) {
                                int i7 = C2912k.f7203;
                                C2912k.f7203 = i7 - 1;
                                C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                            } else {
                                short[] sArr = f5756;
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

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2900jo
        /* renamed from: ﻛ */
        public final void mo5064(Activity activity) {
            f5759 = (f5758 + 115) % 128;
            m6341(m6340((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 77), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (-118) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 194990505 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 1585527155).intern(), activity, list);
            int i = f5758 + 33;
            f5759 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2900jo
        /* renamed from: ﾒ */
        public final void mo5065(Activity activity) {
            f5758 = (f5759 + 109) % 128;
            m6341(m6340((byte) (80 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 118, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 194990515, View.resolveSize(0, 0) + 1585527155).intern(), activity, list);
            int i = f5759 + 47;
            f5758 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* renamed from: ﾒ */
        private void m6341(String str, Activity activity, List<String> list) {
            f5758 = (f5759 + 75) % 128;
            if (C2712cp.m6257(activity, list)) {
                String strOooOO0o = AbstractC2183w4.OooOO0o(new StringBuilder(), m6340((byte) (ExpandableListView.getPackedPositionType(0L) + 98), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-119) - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 194990531, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1585527109), str);
                C2712cp.m6253(C2712cp.this, strOooOO0o, true, false, Collections.singletonList(activity));
                C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.5.3

                    /* renamed from: ｋ */
                    private /* synthetic */ String f5766;

                    /* renamed from: ﾇ */
                    private /* synthetic */ Activity f5767;

                    public AnonymousClass3(String strOooOO0o2, Activity activity2) {
                        str = strOooOO0o2;
                        activity = activity2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        C2712cp.m6253(C2712cp.this, str, false, false, Collections.singletonList(activity));
                    }
                });
            }
            f5758 = (f5759 + 11) % 128;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$6 */
    public class AnonymousClass6 extends AbstractC2873io {

        /* renamed from: ﻐ */
        private /* synthetic */ List f5768;

        /* renamed from: ﾇ */
        private /* synthetic */ String f5770;

        public AnonymousClass6(String str, List list) {
            str = str;
            list = list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2712cp.m6253(C2712cp.this, str, false, true, list);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$7 */
    public class AnonymousClass7 implements InterfaceC2877is {

        /* renamed from: ﾇ */
        private /* synthetic */ C2743dt f5772;

        public AnonymousClass7(C2743dt c2743dt) {
            c2743dt = c2743dt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2877is
        /* renamed from: ﾇ */
        public final boolean mo6342(View view) {
            return c2743dt.m6711(C2712cp.m6279(C2712cp.this), C2712cp.this, Collections.singletonList(view)).m6721();
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$8 */
    public class AnonymousClass8 extends AbstractRunnableC2878it {
        public AnonymousClass8() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2926s.m7600(abstractC2873io);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$9 */
    public class AnonymousClass9 extends AbstractC2891jf {

        /* renamed from: ﱟ */
        private static int f5774 = 1;

        /* renamed from: ｋ */
        private static int f5776;

        /* renamed from: ﾒ */
        private /* synthetic */ List f5779;

        /* renamed from: ﾇ */
        private static int[] f5777 = {-1839091908, -1280514251, 1409461631, -1736891650, -24849053, 1618061950, -303040059, 1846180772, -429116926, 2082118441, 2027566915, -145752514, 1476367641, -2060593147, 1802025704, -253270996, 1751524173, -194717286};

        /* renamed from: ﻐ */
        private static int f5775 = 148;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$9$3 */
        public class AnonymousClass3 extends AbstractRunnableC2878it {

            /* renamed from: ｋ */
            private /* synthetic */ String f5780;

            /* renamed from: ﾒ */
            private /* synthetic */ List f5782;

            public AnonymousClass3(String str, List list) {
                str = str;
                list = list;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                AnonymousClass9.m6348(AnonymousClass9.this, str, list);
            }
        }

        public AnonymousClass9(List list) {
            list = list;
        }

        /* renamed from: ﻐ */
        private void m6345(String str, List<Object> list) {
            m6346(str, true, list);
            C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.9.3

                /* renamed from: ｋ */
                private /* synthetic */ String f5780;

                /* renamed from: ﾒ */
                private /* synthetic */ List f5782;

                public AnonymousClass3(String str2, List list2) {
                    str = str2;
                    list = list2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    AnonymousClass9.m6348(AnonymousClass9.this, str, list);
                }
            });
            f5776 = (f5774 + InterfaceC3173h3.d.b.f8823f) % 128;
        }

        /* renamed from: ﾒ */
        public static /* synthetic */ void m6348(AnonymousClass9 anonymousClass9, String str, List list) {
            f5776 = (f5774 + InterfaceC3173h3.d.b.f8821d) % 128;
            anonymousClass9.m6346(str, false, list);
            int i = f5776 + 19;
            f5774 = i % 128;
            if (i % 2 == 0) {
                int i2 = 30 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (C2712cp.m6257(activity, list)) {
                f5776 = (f5774 + 79) % 128;
                m6347(m6344(new int[]{-80973140, 1688681073, -1937569007, -872291963, -1846443418, 1087948643, -1483697725, 1982416431, -2048370945, -1804537592}, KeyEvent.keyCodeFromString("") + 17).intern(), activity, bundle);
                f5774 = (f5776 + 29) % 128;
            }
            int i = f5776 + 91;
            f5774 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            int i = f5774 + 63;
            f5776 = i % 128;
            if (i % 2 != 0) {
                C2712cp.m6257(activity, list);
                throw null;
            }
            if (C2712cp.m6257(activity, list)) {
                m6349(m6343(4 - Color.blue(0), 19 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 253, "\ufffa\uffd8\u0005\u0006\ufffb￼\u0010\u0006\t\u000b\n￼ￛ\u0010\u000b\u0000\r\u0000\u000b", true).intern(), activity);
            }
            int i2 = f5776 + 35;
            f5774 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!(!C2712cp.m6257(activity, list))) {
                int i = f5776 + 51;
                f5774 = i % 128;
                m6349((i % 2 == 0 ? m6343(84 >>> (ViewConfiguration.getScrollDefaultDelay() << InterfaceC3173h3.d.b.f8823f), 88 >>> ExpandableListView.getPackedPositionGroup(0L), 4141 % TextUtils.indexOf("", "", 1, 0), "\uffd9\ufffb\f\u0001\u000e\u0001\f\u0011￨\ufff9\r\u000b�￼\u0007\u0006", true) : m6343(14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 16, TextUtils.indexOf("", "", 0, 0) + 252, "\uffd9\ufffb\f\u0001\u000e\u0001\f\u0011￨\ufff9\r\u000b�￼\u0007\u0006", false)).intern(), activity);
                f5774 = (f5776 + 89) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int i = f5774 + 35;
            f5776 = i % 128;
            if (i % 2 != 0) {
                C2712cp.m6257(activity, list);
                throw null;
            }
            if (C2712cp.m6257(activity, list)) {
                f5776 = (f5774 + 17) % 128;
                m6349(m6344(new int[]{-80973140, 1688681073, -1937569007, -872291963, -2096761198, 74634952, 904198289, -248309523, -2048370945, -1804537592}, MotionEvent.axisFromString("") + 18).intern(), activity);
                f5774 = (f5776 + 75) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            int i = f5776 + 117;
            f5774 = i % 128;
            if (i % 2 == 0) {
                C2712cp.m6257(activity, list);
                throw null;
            }
            if (C2712cp.m6257(activity, list)) {
                m6347(m6343(5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 27 - TextUtils.getOffsetAfter("", 0), 250 - TextUtils.lastIndexOf("", '0'), "￼ￚ\u0007\b\ufffe\r\ufffa\r￬\ufffe￼\u0007\ufffa\r\f\u0007￢\ufffe\u000f\ufffa￬\u0012\r\u0002\u000f\u0002\r", true).intern(), activity, bundle);
                f5776 = (f5774 + 67) % 128;
            }
            f5776 = (f5774 + 107) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            int i = f5774 + 69;
            f5776 = i % 128;
            if (i % 2 != 0) {
                C2712cp.m6257(activity, list);
                throw null;
            }
            if (C2712cp.m6257(activity, list)) {
                m6349(m6343(7 - (ViewConfiguration.getJumpTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, TextUtils.getTrimmedLength("") + 253, "￪\u000b\ufff8\t\u000b￼\ufffb\u0006\u0005\uffd8\ufffa\u000b\u0000\r\u0000\u000b\u0010", false).intern(), activity);
            }
            f5776 = (f5774 + 67) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            f5774 = (f5776 + InterfaceC3173h3.d.b.f8819b) % 128;
            if (!(!C2712cp.m6257(activity, list))) {
                m6349(m6343(Color.red(0) + 11, 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 301 - AndroidCharacter.getMirror('0'), "\r\u0000\u000b\u0010￪\u000b\u0006\u0007\u0007￼\ufffb\u0006\u0005\uffd8\ufffa\u000b\u0000", false).intern(), activity);
            }
            int i = f5774 + 117;
            f5776 = i % 128;
            if (i % 2 != 0) {
                int i2 = 80 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
        /* renamed from: ﻛ */
        public final void mo5068(Activity activity) {
            f5776 = (f5774 + 55) % 128;
            m6349(m6344(new int[]{-963949411, -1879449177, -627434334, -990181936, -753425393, 1587301696, -1303884069, 1501950017, 1135526252, -73105071, -897612722, -959070606, -2048370945, -1804537592}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25).intern(), activity);
            int i = f5774 + 115;
            f5776 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
        /* renamed from: ｋ */
        public final void mo5069(Activity activity) {
            f5776 = (f5774 + 115) % 128;
            m6349(m6344(new int[]{-963949411, -1879449177, -28197108, 821160712, 816740549, 1982705414, 736819955, -1229756157, -897612722, -959070606, -2048370945, -1804537592}, 20 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), activity);
            f5774 = (f5776 + 29) % 128;
        }

        /* renamed from: ｋ */
        private void m6347(String str, Activity activity, Bundle bundle) {
            List<Object> listAsList;
            int i = f5776 + 15;
            f5774 = i % 128;
            if (i % 2 == 0) {
                Object[] objArr = new Object[3];
                objArr[1] = activity;
                objArr[0] = bundle;
                listAsList = Arrays.asList(objArr);
            } else {
                listAsList = Arrays.asList(activity, bundle);
            }
            m6345(str, listAsList);
            int i2 = f5776 + 91;
            f5774 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
        }

        /* renamed from: ﾒ */
        private void m6349(String str, Activity activity) {
            f5774 = (f5776 + 25) % 128;
            m6345(str, Collections.singletonList(activity));
            int i = f5776 + 89;
            f5774 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* renamed from: ﻐ */
        private void m6346(String str, boolean z, List<Object> list) {
            C2712cp.m6253(C2712cp.this, AbstractC2183w4.OooOO0o(new StringBuilder(), m6344(new int[]{674088814, 577980149, -55334248, 803399389, 565380066, -966354421, 982537540, -890297457, 279687512, -794981157}, (Process.myPid() >> 22) + 18), str), z, false, list);
            f5776 = (f5774 + 41) % 128;
        }

        /* renamed from: ﻐ */
        private static String m6344(int[] iArr, int i) {
            String str;
            synchronized (C2723d.f5953) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f5777.clone();
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
        private static String m6343(int i, int i2, int i3, String str, boolean z) {
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
                        cArr2[i5] = (char) (cArr2[i5] - f5775);
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

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$a */
    public class a<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$a$1 */
        public class AnonymousClass1 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ JSONObject f5783;

            /* renamed from: ﻛ */
            private /* synthetic */ InterfaceC2923p f5784;

            /* renamed from: ﾇ */
            private /* synthetic */ Object f5785;

            /* renamed from: ﾒ */
            private /* synthetic */ Object f5786;

            public AnonymousClass1(InterfaceC2923p interfaceC2923p, JSONObject jSONObject, Object obj, Object obj2) {
                this.f5784 = interfaceC2923p;
                this.f5783 = jSONObject;
                this.f5786 = obj;
                this.f5785 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                this.f5784.mo6307(this.f5783, this.f5786, this.f5785);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$b */
    public class b<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$b$3 */
        public class AnonymousClass3 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ Object f5787;

            /* renamed from: ﻛ */
            private /* synthetic */ Object f5788;

            /* renamed from: ﾇ */
            private /* synthetic */ JSONObject f5789;

            /* renamed from: ﾒ */
            private /* synthetic */ InterfaceC2923p f5790;

            public AnonymousClass3(InterfaceC2923p interfaceC2923p, JSONObject jSONObject, Object obj, Object obj2) {
                this.f5790 = interfaceC2923p;
                this.f5789 = jSONObject;
                this.f5788 = obj;
                this.f5787 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                this.f5790.mo4932(this.f5789, this.f5788, this.f5787);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$c */
    public class c<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$c$3 */
        public class AnonymousClass3 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ Object f5791;

            /* renamed from: ﻛ */
            private /* synthetic */ Object f5792;

            /* renamed from: ｋ */
            private /* synthetic */ Object f5793;

            /* renamed from: ﾇ */
            private /* synthetic */ InterfaceC2923p f5794;

            /* renamed from: ﾒ */
            private /* synthetic */ JSONObject f5795;

            public AnonymousClass3(InterfaceC2923p interfaceC2923p, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f5794 = interfaceC2923p;
                this.f5795 = jSONObject;
                this.f5792 = obj;
                this.f5793 = obj2;
                this.f5791 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                this.f5794.mo6317(this.f5795, this.f5792, this.f5793, this.f5791);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$d */
    public class d<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$d$3 */
        public class AnonymousClass3 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ Object f5796;

            /* renamed from: ﻛ */
            private /* synthetic */ Object f5797;

            /* renamed from: ｋ */
            private /* synthetic */ Object f5798;

            /* renamed from: ﾇ */
            private /* synthetic */ JSONObject f5799;

            /* renamed from: ﾒ */
            private /* synthetic */ InterfaceC2923p f5800;

            public AnonymousClass3(InterfaceC2923p interfaceC2923p, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f5800 = interfaceC2923p;
                this.f5799 = jSONObject;
                this.f5796 = obj;
                this.f5798 = obj2;
                this.f5797 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                this.f5800.mo6309(this.f5799, this.f5796, this.f5798, this.f5797);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$e */
    public class e<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$e$5 */
        public class AnonymousClass5 extends AbstractRunnableC2878it {

            /* renamed from: ﻛ */
            private /* synthetic */ Object f5801;

            /* renamed from: ｋ */
            private /* synthetic */ JSONObject f5802;

            /* renamed from: ﾇ */
            private /* synthetic */ Object f5803;

            /* renamed from: ﾒ */
            private /* synthetic */ InterfaceC2923p f5804;

            public AnonymousClass5(InterfaceC2923p interfaceC2923p, JSONObject jSONObject, Object obj, Object obj2) {
                this.f5804 = interfaceC2923p;
                this.f5802 = jSONObject;
                this.f5803 = obj;
                this.f5801 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                this.f5804.mo4939(this.f5802, this.f5803, this.f5801);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$f */
    public class f<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$f$1 */
        public class AnonymousClass1 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ JSONObject f5805;

            /* renamed from: ｋ */
            private /* synthetic */ Object f5806;

            /* renamed from: ﾇ */
            private /* synthetic */ InterfaceC2923p f5807;

            /* renamed from: ﾒ */
            private /* synthetic */ Object f5808;

            public AnonymousClass1(InterfaceC2923p interfaceC2923p, JSONObject jSONObject, Object obj, Object obj2) {
                this.f5807 = interfaceC2923p;
                this.f5805 = jSONObject;
                this.f5808 = obj;
                this.f5806 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                this.f5807.mo6312(this.f5805, this.f5808, this.f5806);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$g */
    public class g<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$g$5 */
        public class AnonymousClass5 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ Object f5809;

            /* renamed from: ｋ */
            private /* synthetic */ JSONObject f5810;

            /* renamed from: ﾇ */
            private /* synthetic */ Object f5811;

            /* renamed from: ﾒ */
            private /* synthetic */ InterfaceC2923p f5812;

            public AnonymousClass5(InterfaceC2923p interfaceC2923p, JSONObject jSONObject, Object obj, Object obj2) {
                this.f5812 = interfaceC2923p;
                this.f5810 = jSONObject;
                this.f5809 = obj;
                this.f5811 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                this.f5812.mo6316(this.f5810, this.f5809, this.f5811);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$j */
    public class j<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$j$3 */
        public class AnonymousClass3 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ JSONObject f5813;

            /* renamed from: ﻛ */
            private /* synthetic */ InterfaceC2923p f5814;

            /* renamed from: ｋ */
            private /* synthetic */ Object f5815;

            /* renamed from: ﾇ */
            private /* synthetic */ Object f5816;

            /* renamed from: ﾒ */
            private /* synthetic */ Object f5817;

            public AnonymousClass3(InterfaceC2923p interfaceC2923p, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f5814 = interfaceC2923p;
                this.f5813 = jSONObject;
                this.f5816 = obj;
                this.f5817 = obj2;
                this.f5815 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                this.f5814.mo6313(this.f5813, this.f5816, this.f5817, this.f5815);
            }
        }
    }

    public C2712cp(C2710cn c2710cn, C2728de c2728de, AbstractC2676bg abstractC2676bg, C2850hs c2850hs, C2741dr c2741dr) throws JSONException {
        this.f5703 = c2850hs;
        C2741dr c2741dr2 = new C2741dr(new HashMap(), c2741dr, true);
        this.f5707 = c2741dr2;
        c2741dr2.m6656(m6300().m6925());
        c2741dr.m6655(c2850hs.m6930(), this);
        this.f5705 = c2728de;
        this.f5706 = abstractC2676bg;
        this.f5704 = m6244();
        this.f5699 = c2710cn;
        this.f5702 = new C2932y();
        m6270(m6275("괋굙秥喈큮䭂ち䡇晷葊故덄㭗녞깯﹌챶\uea51鍱⥂脅❮쑂ᑡ婗偦ॅ彬潒赭牙", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), new ArrayList());
        m6248();
    }

    /* renamed from: ﬤ */
    private AbstractC2891jf m6242() {
        AnonymousClass1 anonymousClass1 = new AbstractC2891jf() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.1
            public AnonymousClass1() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                C2712cp c2712cp = C2712cp.this;
                c2712cp.m6299(C2869ik.f6803, C2712cp.m6262(c2712cp, activity, null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                C2712cp c2712cp = C2712cp.this;
                c2712cp.m6299(C2869ik.f6802, C2712cp.m6262(c2712cp, activity, null));
            }
        };
        int i = f5692 + 65;
        f5691 = i % 128;
        if (i % 2 == 0) {
            return anonymousClass1;
        }
        throw null;
    }

    /* renamed from: טּ */
    private void m6243() {
        f5691 = (f5692 + 27) % 128;
        this.f5702.m7684();
        int i = f5691 + 123;
        f5692 = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
    }

    /* renamed from: ףּ */
    private InterfaceC2704ch m6244() {
        AnonymousClass2 anonymousClass2 = new InterfaceC2704ch() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$2$5 */
            public class AnonymousClass5 extends AbstractC2873io {

                /* renamed from: ﻛ */
                private /* synthetic */ List f5743;

                /* renamed from: ｋ */
                private /* synthetic */ String f5744;

                /* renamed from: ﾇ */
                private /* synthetic */ boolean f5745;

                public AnonymousClass5(String str2, boolean z, List list2) {
                    str = str2;
                    z = z;
                    list = list2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2712cp.m6253(C2712cp.this, str, false, z, list);
                }
            }

            public AnonymousClass2() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch
            /* renamed from: ﾇ */
            public final void mo6153(String str2, List list2) {
                C2712cp.m6253(C2712cp.this, str2, true, false, list2);
                C2712cp.m6268(C2712cp.this, (AbstractC2873io) new AbstractC2873io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2.5

                    /* renamed from: ﻛ */
                    private /* synthetic */ List f5743;

                    /* renamed from: ｋ */
                    private /* synthetic */ String f5744;

                    /* renamed from: ﾇ */
                    private /* synthetic */ boolean f5745;

                    public AnonymousClass5(String str22, boolean z, List list22) {
                        str = str22;
                        z = z;
                        list = list22;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        C2712cp.m6253(C2712cp.this, str, false, z, list);
                    }
                }, false);
                C2712cp.m6268(C2712cp.this, (AbstractC2873io) new AbstractC2873io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2.5

                    /* renamed from: ﻛ */
                    private /* synthetic */ List f5743;

                    /* renamed from: ｋ */
                    private /* synthetic */ String f5744;

                    /* renamed from: ﾇ */
                    private /* synthetic */ boolean f5745;

                    public AnonymousClass5(String str22, boolean z, List list22) {
                        str = str22;
                        z = z;
                        list = list22;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        C2712cp.m6253(C2712cp.this, str, false, z, list);
                    }
                }, true);
            }
        };
        f5691 = (f5692 + 35) % 128;
        return anonymousClass2;
    }

    /* renamed from: ﭴ */
    private void m6245() {
        f5691 = (f5692 + InterfaceC3173h3.d.b.f8819b) % 128;
        this.f5702.m7687();
        int i = f5691 + 79;
        f5692 = i % 128;
        if (i % 2 == 0) {
            int i2 = 30 / 0;
        }
    }

    /* renamed from: ﭸ */
    private void m6246() {
        f5691 = (f5692 + 23) % 128;
        this.f5702.m7685();
        int i = f5691 + 53;
        f5692 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﮉ */
    private C2735dl m6247() {
        int i = f5692 + 97;
        f5691 = i % 128;
        if (i % 2 != 0) {
            m6292().m6218();
            throw null;
        }
        C2735dl c2735dlM6218 = m6292().m6218();
        int i2 = f5691 + 53;
        f5692 = i2 % 128;
        if (i2 % 2 != 0) {
            return c2735dlM6218;
        }
        throw null;
    }

    /* renamed from: ﮌ */
    private void m6248() throws JSONException {
        f5692 = (f5691 + 23) % 128;
        for (C2737dn c2737dn : m6300().m6928()) {
            if (m6273(c2737dn)) {
                f5692 = (f5691 + 5) % 128;
                m6277(c2737dn);
            }
        }
        f5692 = (f5691 + 51) % 128;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m6253(C2712cp c2712cp, String str, boolean z, boolean z2, List list) {
        int i = f5691 + 81;
        f5692 = i % 128;
        int i2 = i % 2;
        c2712cp.m6271(str, z, z2, list);
        if (i2 == 0) {
            int i3 = 72 / 0;
        }
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ JSONObject m6262(C2712cp c2712cp, Activity activity, Bundle bundle) throws JSONException {
        f5692 = (f5691 + 23) % 128;
        JSONObject jSONObjectM6261 = c2712cp.m6261(activity, bundle);
        f5691 = (f5692 + InterfaceC3173h3.d.b.f8819b) % 128;
        return jSONObjectM6261;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m6268(C2712cp c2712cp, AbstractC2873io abstractC2873io, boolean z) {
        f5691 = (f5692 + 109) % 128;
        c2712cp.m6255(abstractC2873io, z);
        int i = f5691 + 75;
        f5692 = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ C2741dr m6279(C2712cp c2712cp) {
        int i = f5691 + 47;
        f5692 = i % 128;
        int i2 = i % 2;
        C2741dr c2741dr = c2712cp.f5707;
        if (i2 != 0) {
            return c2741dr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /* renamed from: ﭖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6286() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5692
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5691 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1f
            r3.m6243()
            r3.m6245()
            r3.m6246()
            com.ironsource.adqualitysdk.sdk.i.jf r0 = r3.f5698
            r2 = 57
            int r2 = r2 / 0
            if (r0 == 0) goto L37
            goto L2c
        L1f:
            r3.m6243()
            r3.m6245()
            r3.m6246()
            com.ironsource.adqualitysdk.sdk.i.jf r0 = r3.f5698
            if (r0 == 0) goto L37
        L2c:
            com.ironsource.adqualitysdk.sdk.i.ji r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2894ji.m7268()
            com.ironsource.adqualitysdk.sdk.i.jf r2 = r3.f5698
            r0.m7270(r2)
            r3.f5698 = r1
        L37:
            com.ironsource.adqualitysdk.sdk.i.jm r0 = r3.f5700
            if (r0 == 0) goto L40
            r0.m7305()
            r3.f5700 = r1
        L40:
            r3.f5704 = r1
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5691
            int r0 = r0 + 105
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5692 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2712cp.m6286():void");
    }

    /* renamed from: ﮐ */
    public final C2728de m6287() {
        int i = f5692;
        int i2 = i + 49;
        f5691 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        C2728de c2728de = this.f5705;
        int i3 = i + 55;
        f5691 = i3 % 128;
        if (i3 % 2 == 0) {
            return c2728de;
        }
        throw null;
    }

    /* renamed from: ﱟ */
    public final C2741dr m6288() {
        int i = f5692;
        C2741dr c2741dr = this.f5707;
        int i2 = i + 11;
        f5691 = i2 % 128;
        if (i2 % 2 == 0) {
            return c2741dr;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    public final InterfaceC2704ch m6289() {
        int i = f5691 + 47;
        f5692 = i % 128;
        if (i % 2 != 0) {
            return this.f5704;
        }
        int i2 = 96 / 0;
        return this.f5704;
    }

    /* renamed from: ﺙ */
    public final String m6290() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6292().m6227());
        sb.append(m6282("셋웭", -TextUtils.lastIndexOf("", '0', 0)).intern());
        sb.append(m6300().m6930());
        String string = sb.toString();
        f5692 = (f5691 + 5) % 128;
        return string;
    }

    /* renamed from: ﻏ */
    public final JSONObject m6291() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2869ik.f6838, m6292().m6231());
            jSONObject.put(C2869ik.f6791, m6292().m6224());
            jSONObject.put(C2869ik.f6793, m6292().m6226());
            f5691 = (f5692 + 1) % 128;
        } catch (JSONException e2) {
            String strIntern = m6275("ႀგ鶃䤄紕꼤Ⳮ\ue53c\udbfc怬秉ḿ蛜唸닣匷燽ื追萹", Process.getGidForName("") + 1).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m6282("䷎ᚮ\uf8a2駎夫䠫ꂈ먲珳뭺嬹๓僭䁓ꨚ䐆栵㴘簌櫵ᔕ겗䂖忌㙔᧒ٶ㹗", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26).intern());
            sb.append(e2.getLocalizedMessage());
            C2921n.m7509(strIntern, sb.toString());
        }
        f5692 = (f5691 + 87) % 128;
        return jSONObject;
    }

    /* renamed from: ﾇ */
    public final JSONObject m6298() {
        int i = (f5692 + 121) % 128;
        f5691 = i;
        JSONObject jSONObject = this.f5701;
        int i2 = i + 61;
        f5692 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
        return jSONObject;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ boolean m6257(Activity activity, List list) {
        f5692 = (f5691 + 73) % 128;
        boolean zM6265 = m6265(activity, (List<String>) list);
        f5691 = (f5692 + 19) % 128;
        return zM6265;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0096  */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6277(com.ironsource.adqualitysdk.sdk.p009i.C2737dn r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2712cp.m6277(com.ironsource.adqualitysdk.sdk.i.dn):void");
    }

    /* renamed from: ﻛ */
    public final AbstractC2676bg m6294() {
        int i = f5691;
        AbstractC2676bg abstractC2676bg = this.f5706;
        int i2 = i + 69;
        f5692 = i2 % 128;
        if (i2 % 2 != 0) {
            return abstractC2676bg;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final Context m6296() {
        int i = f5691 + 27;
        f5692 = i % 128;
        if (i % 2 == 0) {
            m6292().m6217();
            throw null;
        }
        Context contextM6217 = m6292().m6217();
        f5691 = (f5692 + 45) % 128;
        return contextM6217;
    }

    /* renamed from: ﾒ */
    public final void m6301(JSONObject jSONObject) {
        f5692 = (f5691 + InterfaceC3173h3.d.b.f8823f) % 128;
        this.f5701 = C2915kc.m7430(jSONObject, true);
        int i = f5691 + 121;
        f5692 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private JSONObject m6263(JSONObject jSONObject) throws JSONException {
        f5691 = (f5692 + 3) % 128;
        JSONObject jSONObjectM6291 = m6291();
        C2915kc.m7433(jSONObjectM6291, jSONObject);
        f5692 = (f5691 + 43) % 128;
        return jSONObjectM6291;
    }

    /* renamed from: ﻐ */
    public final C2710cn m6292() {
        int i = (f5692 + 125) % 128;
        f5691 = i;
        C2710cn c2710cn = this.f5699;
        f5692 = (i + 39) % 128;
        return c2710cn;
    }

    /* renamed from: ｋ */
    public final C2743dt m6297(String str) {
        int i = f5691;
        f5692 = (i + 113) % 128;
        if (str != null) {
            return m6300().m6927(str);
        }
        f5692 = (i + InterfaceC3173h3.d.b.f8819b) % 128;
        return null;
    }

    /* renamed from: ﾒ */
    public final C2850hs m6300() {
        int i = f5691;
        C2850hs c2850hs = this.f5703;
        f5692 = (i + 51) % 128;
        return c2850hs;
    }

    /* renamed from: ﾒ */
    private void m6284(JSONObject jSONObject, C2919l c2919l, C2919l c2919l2, InterfaceC2875iq interfaceC2875iq) {
        int i = f5691 + 71;
        f5692 = i % 128;
        if (i % 2 == 0) {
            this.f5702.m7689(jSONObject, m6250(c2919l, c2919l2), m6242(), interfaceC2875iq);
            throw null;
        }
        this.f5702.m7689(jSONObject, m6250(c2919l, c2919l2), m6242(), interfaceC2875iq);
        int i2 = f5691 + 37;
        f5692 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
    }

    /* renamed from: ﻐ */
    public final void m6293(InterfaceC2872in interfaceC2872in) {
        f5691 = (f5692 + 53) % 128;
        this.f5699.m6220().m5407(interfaceC2872in);
        f5691 = (f5692 + 67) % 128;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$3 */
    public class AnonymousClass3 implements InterfaceC2875iq {

        /* renamed from: ﺙ */
        private static int f5747 = 1;

        /* renamed from: ﻐ */
        private static long f5748 = 9123637211593282409L;

        /* renamed from: ﻛ */
        private static int f5749;

        /* renamed from: ｋ */
        private /* synthetic */ String f5750;

        /* renamed from: ﾇ */
        private /* synthetic */ C2743dt f5751;

        public AnonymousClass3(C2743dt c2743dt, String str) {
            c2743dt = c2743dt;
            str = str;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2875iq
        /* renamed from: ｋ */
        public final List<WebView> mo6339(Object obj) {
            f5749 = (f5747 + 35) % 128;
            try {
                List<WebView> list = (List) c2743dt.m6711(C2712cp.m6279(C2712cp.this), C2712cp.this, Collections.singletonList(obj)).m6717();
                int i = f5747 + 85;
                f5749 = i % 128;
                if (i % 2 == 0) {
                    return list;
                }
                throw null;
            } catch (Exception unused) {
                String strIntern = m6338("\uf109\uf15b\uda3a䤶驶볉廟\ue48b볙ꡞ죾奤樍柮纠ନᦀ㔍댒ﶊ", -TextUtils.lastIndexOf("", '0', 0)).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m6338("층칰ￆ泝쉍\ue4ed㘒豆菣跰郼ㆨ唉䈘⚞揿⚾Ⴈ\ueb24镐\uf8c7ꕲ맦욼䩶笳俋ࠛᾟ৳ᰪ먡", -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                sb.append(str);
                C2921n.m7509(strIntern, sb.toString());
                return null;
            }
        }

        /* renamed from: ｋ */
        private static String m6338(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2777f.f6322) {
                try {
                    char[] cArrM6790 = C2777f.m6790(f5748, cArr, i);
                    C2777f.f6321 = 4;
                    while (true) {
                        int i2 = C2777f.f6321;
                        if (i2 < cArrM6790.length) {
                            C2777f.f6320 = i2 - 4;
                            cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5748));
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
    }

    /* renamed from: ﻐ */
    private void m6254(C2737dn c2737dn) throws JSONException {
        int i = f5692 + 53;
        f5691 = i % 128;
        AnonymousClass3 anonymousClass3 = null;
        if (i % 2 == 0) {
            JSONObject jSONObjectM6267 = m6267(c2737dn.m6632());
            if (jSONObjectM6267 != null) {
                f5691 = (f5692 + 33) % 128;
                String strM6627 = c2737dn.m6627();
                if (!TextUtils.isEmpty(strM6627)) {
                    int i2 = f5691 + 113;
                    f5692 = i2 % 128;
                    if (i2 % 2 != 0) {
                        C2743dt c2743dtM6297 = m6297(strM6627);
                        if (c2743dtM6297 != null) {
                            anonymousClass3 = new InterfaceC2875iq() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.3

                                /* renamed from: ﺙ */
                                private static int f5747 = 1;

                                /* renamed from: ﻐ */
                                private static long f5748 = 9123637211593282409L;

                                /* renamed from: ﻛ */
                                private static int f5749;

                                /* renamed from: ｋ */
                                private /* synthetic */ String f5750;

                                /* renamed from: ﾇ */
                                private /* synthetic */ C2743dt f5751;

                                public AnonymousClass3(C2743dt c2743dtM62972, String strM66272) {
                                    c2743dt = c2743dtM62972;
                                    str = strM66272;
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2875iq
                                /* renamed from: ｋ */
                                public final List<WebView> mo6339(Object obj) {
                                    f5749 = (f5747 + 35) % 128;
                                    try {
                                        List<WebView> list = (List) c2743dt.m6711(C2712cp.m6279(C2712cp.this), C2712cp.this, Collections.singletonList(obj)).m6717();
                                        int i3 = f5747 + 85;
                                        f5749 = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            return list;
                                        }
                                        throw null;
                                    } catch (Exception unused) {
                                        String strIntern = m6338("\uf109\uf15b\uda3a䤶驶볉廟\ue48b볙ꡞ죾奤樍柮纠ନᦀ㔍댒ﶊ", -TextUtils.lastIndexOf("", '0', 0)).intern();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(m6338("층칰ￆ泝쉍\ue4ed㘒豆菣跰郼ㆨ唉䈘⚞揿⚾Ⴈ\ueb24镐\uf8c7ꕲ맦욼䩶笳俋ࠛᾟ৳ᰪ먡", -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                                        sb.append(str);
                                        C2921n.m7509(strIntern, sb.toString());
                                        return null;
                                    }
                                }

                                /* renamed from: ｋ */
                                private static String m6338(String str, int i3) {
                                    String str2;
                                    char[] charArray = str;
                                    if (str != null) {
                                        charArray = str.toCharArray();
                                    }
                                    char[] cArr = charArray;
                                    synchronized (C2777f.f6322) {
                                        try {
                                            char[] cArrM6790 = C2777f.m6790(f5748, cArr, i3);
                                            C2777f.f6321 = 4;
                                            while (true) {
                                                int i22 = C2777f.f6321;
                                                if (i22 < cArrM6790.length) {
                                                    C2777f.f6320 = i22 - 4;
                                                    cArrM6790[i22] = (char) ((cArrM6790[i22] ^ cArrM6790[i22 % 4]) ^ (r2 * f5748));
                                                    C2777f.f6321 = i22 + 1;
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
                            };
                        } else {
                            String strM6290 = m6290();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m6282("왫\ue208캸\ud9bcঅ譑\ue817똷儁즃㥆菱\udebdꀀ䱬뿊쥉\uf581\udefc溳夫䠫", 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
                            sb.append(strM66272);
                            sb.append(m6282("틣\u09c5湷쒢Ჟ믽ࣆ㰕熎杊", (ViewConfiguration.getTapTimeout() >> 16) + 10).intern());
                            C2713cq.m6350(strM6290, sb.toString(), null);
                        }
                    } else {
                        m6297(strM66272);
                        throw null;
                    }
                }
                m6284(jSONObjectM6267, m6280(false), m6280(true), anonymousClass3);
                return;
            }
            return;
        }
        m6267(c2737dn.m6632());
        throw null;
    }

    /* renamed from: ﾒ */
    private void m6283(C2737dn c2737dn) throws JSONException {
        int i = f5692 + 83;
        f5691 = i % 128;
        if (i % 2 == 0) {
            JSONObject jSONObjectM6267 = m6267(c2737dn.m6632());
            if (jSONObjectM6267 != null) {
                String strM6630 = c2737dn.m6630();
                C2927t c2927tM6274 = m6274(true);
                C2927t c2927tM62742 = m6274(false);
                if (TextUtils.isEmpty(strM6630)) {
                    m6278(jSONObjectM6267, c2927tM62742, c2927tM6274);
                } else {
                    C2743dt c2743dtM6297 = m6297(strM6630);
                    if (c2743dtM6297 != null) {
                        m6256(jSONObjectM6267, c2927tM62742, c2927tM6274, new InterfaceC2877is() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.7

                            /* renamed from: ﾇ */
                            private /* synthetic */ C2743dt f5772;

                            public AnonymousClass7(C2743dt c2743dtM62972) {
                                c2743dt = c2743dtM62972;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2877is
                            /* renamed from: ﾇ */
                            public final boolean mo6342(View view) {
                                return c2743dt.m6711(C2712cp.m6279(C2712cp.this), C2712cp.this, Collections.singletonList(view)).m6721();
                            }
                        });
                        f5692 = (f5691 + 59) % 128;
                        return;
                    }
                    String strM6290 = m6290();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m6282("왫\ue208캸\ud9bcঅ譑\ue817똷儁즃㥆菱\udebdꀀ䱬뿊쥉\uf581\udefc溳夫䠫", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22).intern());
                    sb.append(strM6630);
                    sb.append(m6282("틣\u09c5湷쒢Ჟ믽ࣆ㰕熎杊", 9 - ImageFormat.getBitsPerPixel(0)).intern());
                    C2713cq.m6350(strM6290, sb.toString(), null);
                    f5691 = (f5692 + 49) % 128;
                    return;
                }
            }
            int i2 = f5692 + 107;
            f5691 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 90 / 0;
                return;
            }
            return;
        }
        m6267(c2737dn.m6632());
        throw null;
    }

    /* renamed from: ｋ */
    private void m6269(String str, C2737dn c2737dn) throws JSONException {
        f5691 = (f5692 + 107) % 128;
        JSONObject jSONObjectM6267 = m6267(c2737dn.m6632());
        if (jSONObjectM6267 != null) {
            int i = f5692 + 125;
            f5691 = i % 128;
            if (i % 2 == 0 ? jSONObjectM6267.has(m6282("ᬝ堐\uead0뢹㑑ګ∦ᨅ㱘鏶嬹๓弨末ꂟ焳袶坆", 17 - TextUtils.indexOf((CharSequence) "", '0')).intern()) : jSONObjectM6267.has(m6282("ᬝ堐\uead0뢹㑑ګ∦ᨅ㱘鏶嬹๓弨末ꂟ焳袶坆", 115 - TextUtils.indexOf((CharSequence) "", (char) 1)).intern())) {
                C2897jl.b bVarM7297 = C2897jl.b.m7297(jSONObjectM6267.optString(m6282("ᬝ堐\uead0뢹㑑ګ∦ᨅ㱘鏶嬹๓弨末ꂟ焳袶坆", 17 - ImageFormat.getBitsPerPixel(0)).intern(), null));
                String strM6260 = m6260(str, jSONObjectM6267);
                if (bVarM7297 != null) {
                    f5691 = (f5692 + 1) % 128;
                    C2897jl.m7293().m7295(strM6260, bVarM7297);
                }
            }
        }
        int i2 = f5691 + 15;
        f5692 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
    }

    /* renamed from: ﻛ */
    private void m6264(C2737dn c2737dn) throws JSONException {
        int i = f5692 + 81;
        f5691 = i % 128;
        if (i % 2 == 0) {
            JSONObject jSONObjectM6267 = m6267(c2737dn.m6632());
            if (jSONObjectM6267 != null) {
                m6272(jSONObjectM6267, m6266(false), m6266(true));
            }
            int i2 = f5691 + 59;
            f5692 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        m6267(c2737dn.m6632());
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0084  */
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m6260(java.lang.String r8, org.json.JSONObject r9) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5692
            int r0 = r0 + 45
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5691 = r0
            int r0 = r8.hashCode()
            r1 = -1655966961(0xffffffff9d4bf30f, float:-2.6992485E-21)
            r2 = 0
            r3 = 48
            java.lang.String r4 = ""
            r5 = -1
            r6 = 2
            r7 = 1
            if (r0 == r1) goto L6a
            r1 = -787751952(0xffffffffd10bdbf0, float:-3.754315E10)
            if (r0 == r1) goto L43
            r1 = 3619493(0x373aa5, float:5.07199E-39)
            if (r0 == r1) goto L24
            goto L84
        L24:
            int r0 = android.text.TextUtils.indexOf(r4, r3)
            int r0 = r0 + r7
            java.lang.String r1 = "⭮⬘䟩ᢶ乧畂絗홖"
            java.lang.String r0 = m6275(r1, r0)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L84
            int r8 = com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5691
            int r8 = r8 + 37
            int r8 = r8 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5692 = r8
            r8 = r7
            goto L85
        L43:
            int r0 = android.view.ViewConfiguration.getTouchSlop()
            int r0 = r0 >> 8
            int r0 = 6 - r0
            java.lang.String r1 = "퓆웭熎杊䛡븀"
            java.lang.String r0 = m6282(r1, r0)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L84
            int r8 = com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5691
            int r8 = r8 + 69
            int r0 = r8 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2712cp.f5692 = r0
            int r8 = r8 % r6
            if (r8 != 0) goto L68
            r8 = 3
            goto L85
        L68:
            r8 = r6
            goto L85
        L6a:
            int r0 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r0 = r0 >> 16
            int r0 = 8 - r0
            java.lang.String r1 = "둫麗嬹๓䀏ᘄ喃劉"
            java.lang.String r0 = m6282(r1, r0)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L84
            r8 = r2
            goto L85
        L84:
            r8 = r5
        L85:
            r0 = 0
            if (r8 == 0) goto Lb6
            if (r8 == r7) goto La2
            if (r8 == r6) goto L8d
            return r0
        L8d:
            int r8 = android.view.View.MeasureSpec.getMode(r2)
            int r8 = 13 - r8
            java.lang.String r1 = "䀏ᘄ锃\uf7d7⣜熀誖\ud9fbｈ墟\u07bf砈ꘌ฿"
            java.lang.String r8 = m6282(r1, r8)
            java.lang.String r8 = r8.intern()
            java.lang.String r8 = r9.optString(r8, r0)
            return r8
        La2:
            int r8 = android.text.TextUtils.lastIndexOf(r4, r3)
            int r5 = r5 - r8
            java.lang.String r8 = "噵嘔羌塃誾䴪㶑ኑ鴘舱梌\ue99c쀄뜭ꎤ꒦㜌\uec3b麺"
            java.lang.String r8 = m6275(r8, r5)
            java.lang.String r8 = r8.intern()
            java.lang.String r8 = r9.optString(r8, r0)
            return r8
        Lb6:
            int r8 = android.view.ViewConfiguration.getEdgeSlop()
            int r8 = r8 >> 16
            java.lang.String r1 = "楺椛荁撗혗뇧Œ串ꈆ绢呭따＞䯪齍\uf820ࠏჾ"
            java.lang.String r8 = m6275(r1, r8)
            java.lang.String r8 = r8.intern()
            java.lang.String r8 = r9.optString(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2712cp.m6260(java.lang.String, org.json.JSONObject):java.lang.String");
    }

    /* renamed from: ｋ */
    private void m6272(JSONObject jSONObject, C2928u c2928u, C2928u c2928u2) {
        int i = f5691 + 63;
        f5692 = i % 128;
        if (i % 2 != 0) {
            this.f5702.m7686(jSONObject, m6281(c2928u, c2928u2));
        } else {
            this.f5702.m7686(jSONObject, m6281(c2928u, c2928u2));
            int i2 = 95 / 0;
        }
    }

    /* renamed from: ｋ */
    private static boolean m6273(C2737dn c2737dn) {
        List listMo5145 = AbstractC2661as.m5141().mo5145();
        ISAdQualityAdType iSAdQualityAdTypeM6628 = c2737dn.m6628();
        if (listMo5145 == null || iSAdQualityAdTypeM6628 == ISAdQualityAdType.UNKNOWN) {
            return true;
        }
        f5691 = (f5692 + 35) % 128;
        if (listMo5145.contains(iSAdQualityAdTypeM6628)) {
            return false;
        }
        f5692 = (f5691 + InterfaceC3173h3.d.b.f8826i) % 128;
        return true;
    }

    /* renamed from: ﾇ */
    private void m6278(JSONObject jSONObject, C2927t c2927t, C2927t c2927t2) {
        f5692 = (f5691 + 43) % 128;
        this.f5702.m7690(jSONObject, m6251(c2927t, c2927t2));
        f5691 = (f5692 + 37) % 128;
    }

    /* renamed from: ﾇ */
    private List<String> m6276(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (!(!it.hasNext())) {
            int i = f5691 + 29;
            f5692 = i % 128;
            if (i % 2 != 0) {
                String next = it.next();
                if (!m6285(next)) {
                    arrayList.add(next);
                    f5691 = (f5692 + 35) % 128;
                } else {
                    String strM6252 = m6252(next);
                    if (strM6252 != null) {
                        arrayList.add(strM6252);
                    }
                }
            } else {
                m6285(it.next());
                throw null;
            }
        }
        return arrayList;
    }

    /* renamed from: ﻐ */
    private void m6256(JSONObject jSONObject, C2927t c2927t, C2927t c2927t2, InterfaceC2877is interfaceC2877is) {
        int i = f5691 + 79;
        f5692 = i % 128;
        if (i % 2 != 0) {
            this.f5702.m7688(jSONObject, m6251(c2927t, c2927t2), interfaceC2877is);
        } else {
            this.f5702.m7688(jSONObject, m6251(c2927t, c2927t2), interfaceC2877is);
            throw null;
        }
    }

    /* renamed from: ﻐ */
    private boolean m6258(JSONObject jSONObject, String str) throws JSONException {
        f5691 = (f5692 + 69) % 128;
        Object objOpt = jSONObject.opt(str);
        try {
            if (!(objOpt instanceof String)) {
                if (!(objOpt instanceof JSONArray)) {
                    return true;
                }
                jSONObject.put(str, new JSONArray((Collection) m6276(C2915kc.m7435((JSONArray) objOpt))));
            } else {
                String str2 = (String) objOpt;
                if (!m6285(str2)) {
                    return true;
                }
                f5692 = (f5691 + InterfaceC3173h3.d.b.f8821d) % 128;
                String strM6252 = m6252(str2);
                if (strM6252 != null) {
                    jSONObject.put(str, strM6252);
                } else {
                    String strM6290 = m6290();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m6282("⣜熀誖\ud9fb祐꺐", 5 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
                    sb.append(str2);
                    sb.append(m6275("풨품焈䛳熀䎤⌘\ue9b2ᾀ貤瘐ኻ䋖릾뵇忻떐\ue2b3耍袱\uf8fa⾞휾떈⏧壂ᨳﺇ᛫薎愢⮘姵캀둯咍貍奄\ufb42腶", TextUtils.indexOf("", "", 0)).intern());
                    C2713cq.m6352(strM6290, sb.toString());
                    return false;
                }
            }
            return true;
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: ｋ */
    private JSONObject m6267(JSONObject jSONObject) throws JSONException {
        C2735dl c2735dlM6247;
        f5691 = (f5692 + 49) % 128;
        String strOptString = jSONObject.optString(m6275("咰哚訲䋧ﷰ뢃✳旄鿝瞞爂黆", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        jSONObject.remove(m6275("咰哚訲䋧ﷰ뢃✳旄鿝瞞爂黆", ImageFormat.getBitsPerPixel(0) + 1).intern());
        if (jSONObject.optBoolean(m6282("㥆菱㦰ꀄ\ud836\uf5be\uea22葨", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7).intern()) && (c2735dlM6247 = m6247()) != null) {
            f5692 = (f5691 + 77) % 128;
            if (!TextUtils.isEmpty(c2735dlM6247.m6622())) {
                jSONObject.remove(m6282("㥆菱㦰ꀄ\ud836\uf5be\uea22葨", 8 - View.MeasureSpec.getSize(0)).intern());
                try {
                    String strIntern = m6282("쓱㜻瞧᜵Ԓ샪㦰ꀄ\ud836\uf5be", 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strOptString);
                    sb.append(c2735dlM6247.m6622());
                    jSONObject.put(strIntern, sb.toString());
                } catch (JSONException unused) {
                }
            }
            if (c2735dlM6247.m6621()) {
                try {
                    jSONObject.put(m6282("袔踲糲ꬭ믴᳛闩\ud80d\uea22葨", TextUtils.indexOf("", "") + 10).intern(), true);
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i = f5691 + 7;
            f5692 = i % 128;
            if (i % 2 == 0) {
                int i2 = 61 / 0;
                if (!m6258(jSONObject, itKeys.next())) {
                    return null;
                }
            } else if (!m6258(jSONObject, itKeys.next())) {
                return null;
            }
        }
        return jSONObject;
    }

    /* renamed from: ﾒ */
    private static boolean m6285(String str) {
        int i = f5691 + 117;
        f5692 = i % 128;
        return str.endsWith(m6275("鿻鿕磥ኇא䩄睯鷷咀蕜", ExpandableListView.getPackedPositionType(i % 2 == 0 ? 1L : 0L)).intern());
    }

    /* renamed from: ﾒ */
    private C2919l m6280(boolean z) {
        AnonymousClass11 anonymousClass11 = new C2919l() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.11

            /* renamed from: ﱡ */
            private static int f5712 = 1;

            /* renamed from: ﻏ */
            private static int f5713 = 0;

            /* renamed from: ﻐ */
            private static char f5714 = 8809;

            /* renamed from: ﻛ */
            private static long f5715;

            /* renamed from: ﾇ */
            private static int f5716;

            /* renamed from: ﾒ */
            private /* synthetic */ boolean f5718;

            public AnonymousClass11(boolean z2) {
                z = z2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo4932(JSONObject jSONObject, WebView webView, Activity activity) {
                int i = f5713 + 115;
                f5712 = i % 128;
                int i2 = i % 2;
                mo4932(jSONObject, webView, activity);
                if (i2 == 0) {
                    throw null;
                }
                f5712 = (f5713 + 81) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo6307(JSONObject jSONObject, WebView webView, Activity activity) {
                f5713 = (f5712 + 119) % 128;
                mo6307(jSONObject, webView, activity);
                int i = f5713 + 123;
                f5712 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 44 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final /* synthetic */ void mo4939(JSONObject jSONObject, WebView webView, Activity activity) {
                f5712 = (f5713 + 21) % 128;
                mo4939(jSONObject, webView, activity);
                int i = f5713 + 97;
                f5712 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo6312(JSONObject jSONObject, WebView webView, Activity activity) {
                f5712 = (f5713 + 83) % 128;
                mo6312(jSONObject, webView, activity);
                f5712 = (f5713 + 121) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo6316(JSONObject jSONObject, WebView webView, Activity activity) {
                f5713 = (f5712 + 9) % 128;
                mo6316(jSONObject, webView, activity);
                int i = f5712 + 11;
                f5713 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
            /* renamed from: ﻐ */
            public final void mo6312(JSONObject jSONObject, WebView webView, Activity activity) {
                int i = f5712 + 57;
                f5713 = i % 128;
                if (i % 2 != 0) {
                    m6302(m6303(Color.rgb(1, 1, 1) * (-1228698065), (char) (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), "⼊쎎䂷⃒", "垽扔㘖㲵遐硪Ⴙ갡냻㌨踑", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                } else {
                    m6302(m6303((-1228698065) - Color.rgb(0, 0, 0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "⼊쎎䂷⃒", "垽扔㘖㲵遐硪Ⴙ갡냻㌨踑", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
            /* renamed from: ﻛ */
            public final void mo4939(JSONObject jSONObject, WebView webView, Activity activity) {
                int i = f5712 + 57;
                f5713 = i % 128;
                if (i % 2 != 0) {
                    m6302(m6303((-1336047436) << (PointF.length(0.0f, 1.0f) > 1.0f ? 1 : (PointF.length(0.0f, 1.0f) == 1.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), "뒻嶈ධホ", "㑡₋隂筠꯱뤯鬥ഡ\u0b80嬋贋", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                } else {
                    m6302(m6303((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1336047436, (char) View.MeasureSpec.getSize(0), "뒻嶈ධホ", "㑡₋隂筠꯱뤯鬥ഡ\u0b80嬋贋", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final /* synthetic */ void mo6309(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f5712 = (f5713 + 59) % 128;
                mo6309(jSONObject, webView, obj, activity);
                f5712 = (f5713 + 25) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo6313(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i = f5713 + 53;
                f5712 = i % 128;
                int i2 = i % 2;
                mo6313(jSONObject, webView, obj, activity);
                if (i2 == 0) {
                    int i3 = 5 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo6317(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i = f5712 + 3;
                f5713 = i % 128;
                int i2 = i % 2;
                mo6317(jSONObject, webView, obj, activity);
                if (i2 != 0) {
                    throw null;
                }
                f5713 = (f5712 + 55) % 128;
            }

            /* renamed from: ﻐ */
            private void m6302(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                C2712cp.m6253(C2712cp.this, AbstractC2183w4.OooOO0o(new StringBuilder(), m6303(1690122599 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58099), "杹봹\uf364ꋢ", "䔶\u18adႻ䰗耲䩘燝ὦ⯶㵊玞捡끴锩쥂𤋮釾\ueb4c⃛", "\u0000\u0000\u0000\u0000"), str), z, false, Arrays.asList(jSONObject, webView, obj, activity));
                f5712 = (f5713 + 75) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
            /* renamed from: ﻛ */
            public final void mo6317(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f5713 = (f5712 + 23) % 128;
                m6302(m6303((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126652813, (char) (46941 - Color.red(0)), "踄貑崇㦷", "\ud8c5䲦붞敜橋맃쥾\uf720\ua62e륀㞀䪴﹜뙘ⴀ", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, obj, activity);
                f5712 = (f5713 + 117) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
            /* renamed from: ｋ */
            public final void mo6307(JSONObject jSONObject, WebView webView, Activity activity) {
                int i = f5712 + 87;
                f5713 = i % 128;
                if (i % 2 != 0) {
                    m6302(m6303(TextUtils.indexOf("", ""), (char) ((byte) KeyEvent.getModifierMetaStateMask()), "ꁣꐧ缷ʦ", "庴\ue1aaᓽᆇ좔Ƴ丌鷵", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                } else {
                    m6302(m6303(TextUtils.indexOf("", ""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), "ꁣꐧ缷ʦ", "庴\ue1aaᓽᆇ좔Ƴ丌鷵", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                }
                f5712 = (f5713 + 1) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
            /* renamed from: ﾇ */
            public final void mo4932(JSONObject jSONObject, WebView webView, Activity activity) {
                int i = f5712 + 123;
                f5713 = i % 128;
                if (i % 2 != 0) {
                    m6302(m6303(ViewConfiguration.getFadingEdgeLength() - 124, (char) (59741 >> View.resolveSize(1, 0)), "專푃工맩", "䷥\uf3bf邀枏胖॒坹ﲪ憡뮹⬒臌ᒘﱗ뻗\udb0d", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                } else {
                    m6302(m6303(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (View.resolveSize(0, 0) + 59741), "專푃工맩", "䷥\uf3bf邀枏胖॒坹ﲪ憡뮹⬒臌ᒘﱗ뻗\udb0d", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                }
                f5713 = (f5712 + 27) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
            /* renamed from: ﾒ */
            public final void mo6316(JSONObject jSONObject, WebView webView, Activity activity) {
                f5713 = (f5712 + 93) % 128;
                m6302(m6303((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), "㈡蠽漶烔", "\uec8b䉮먌瀠뀅℘權ꨚ㆝蓸鏠\uf8cb", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                f5713 = (f5712 + 35) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
            /* renamed from: ﾇ */
            public final void mo6309(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f5712 = (f5713 + 73) % 128;
                m6302(m6303((-1576291188) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.indexOf("", "", 0, 0), "賴ழ\ue9a2\ue2ad", "克࿖㭵Ṉ㓂\uf3ad쿶萮㘪", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, obj, activity);
                f5713 = (f5712 + 93) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l
            /* renamed from: ﾒ */
            public final void mo6313(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f5712 = (f5713 + 65) % 128;
                m6302(m6303(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) TextUtils.indexOf("", "", 0), "⊮ᭉ\uf555\ue8be", "楊辂̺廸쥥ᢀᇴ꺊䭀䠅춴龨ᰌ禮\uaaff墲ݯ蔪娚┺", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, obj, activity);
                f5713 = (f5712 + 83) % 128;
            }

            /* renamed from: ﾇ */
            private static String m6303(int i, char c2, String str, String str2, String str3) {
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
                        cArr4[0] = (char) (c2 ^ cArr4[0]);
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
                                char c22 = cArr5[i3];
                                char c3 = (char) ((i5 + c22) % 65535);
                                C2885j.f6935 = c3;
                                cArr5[i4] = (char) (((cArr4[i4] * 32718) + c22) / 65535);
                                cArr4[i4] = c3;
                                int i6 = C2885j.f6934;
                                cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f5715) ^ f5716) ^ f5714);
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
        };
        f5691 = (f5692 + 87) % 128;
        return anonymousClass11;
    }

    /* renamed from: ﻛ */
    private AbstractC2891jf m6259(List<String> list) {
        AnonymousClass9 anonymousClass9 = new AbstractC2891jf() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.9

            /* renamed from: ﱟ */
            private static int f5774 = 1;

            /* renamed from: ｋ */
            private static int f5776;

            /* renamed from: ﾒ */
            private /* synthetic */ List f5779;

            /* renamed from: ﾇ */
            private static int[] f5777 = {-1839091908, -1280514251, 1409461631, -1736891650, -24849053, 1618061950, -303040059, 1846180772, -429116926, 2082118441, 2027566915, -145752514, 1476367641, -2060593147, 1802025704, -253270996, 1751524173, -194717286};

            /* renamed from: ﻐ */
            private static int f5775 = 148;

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$9$3 */
            public class AnonymousClass3 extends AbstractRunnableC2878it {

                /* renamed from: ｋ */
                private /* synthetic */ String f5780;

                /* renamed from: ﾒ */
                private /* synthetic */ List f5782;

                public AnonymousClass3(String str2, List list2) {
                    str = str2;
                    list = list2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    AnonymousClass9.m6348(AnonymousClass9.this, str, list);
                }
            }

            public AnonymousClass9(List list2) {
                list = list2;
            }

            /* renamed from: ﻐ */
            private void m6345(String str2, List list2) {
                m6346(str2, true, list2);
                C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.9.3

                    /* renamed from: ｋ */
                    private /* synthetic */ String f5780;

                    /* renamed from: ﾒ */
                    private /* synthetic */ List f5782;

                    public AnonymousClass3(String str22, List list22) {
                        str = str22;
                        list = list22;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        AnonymousClass9.m6348(AnonymousClass9.this, str, list);
                    }
                });
                f5776 = (f5774 + InterfaceC3173h3.d.b.f8823f) % 128;
            }

            /* renamed from: ﾒ */
            public static /* synthetic */ void m6348(AnonymousClass9 anonymousClass92, String str, List list2) {
                f5776 = (f5774 + InterfaceC3173h3.d.b.f8821d) % 128;
                anonymousClass92.m6346(str, false, list2);
                int i = f5776 + 19;
                f5774 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 30 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (C2712cp.m6257(activity, list)) {
                    f5776 = (f5774 + 79) % 128;
                    m6347(m6344(new int[]{-80973140, 1688681073, -1937569007, -872291963, -1846443418, 1087948643, -1483697725, 1982416431, -2048370945, -1804537592}, KeyEvent.keyCodeFromString("") + 17).intern(), activity, bundle);
                    f5774 = (f5776 + 29) % 128;
                }
                int i = f5776 + 91;
                f5774 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                int i = f5774 + 63;
                f5776 = i % 128;
                if (i % 2 != 0) {
                    C2712cp.m6257(activity, list);
                    throw null;
                }
                if (C2712cp.m6257(activity, list)) {
                    m6349(m6343(4 - Color.blue(0), 19 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 253, "\ufffa\uffd8\u0005\u0006\ufffb￼\u0010\u0006\t\u000b\n￼ￛ\u0010\u000b\u0000\r\u0000\u000b", true).intern(), activity);
                }
                int i2 = f5776 + 35;
                f5774 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                if (!(!C2712cp.m6257(activity, list))) {
                    int i = f5776 + 51;
                    f5774 = i % 128;
                    m6349((i % 2 == 0 ? m6343(84 >>> (ViewConfiguration.getScrollDefaultDelay() << InterfaceC3173h3.d.b.f8823f), 88 >>> ExpandableListView.getPackedPositionGroup(0L), 4141 % TextUtils.indexOf("", "", 1, 0), "\uffd9\ufffb\f\u0001\u000e\u0001\f\u0011￨\ufff9\r\u000b�￼\u0007\u0006", true) : m6343(14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 16, TextUtils.indexOf("", "", 0, 0) + 252, "\uffd9\ufffb\f\u0001\u000e\u0001\f\u0011￨\ufff9\r\u000b�￼\u0007\u0006", false)).intern(), activity);
                    f5774 = (f5776 + 89) % 128;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                int i = f5774 + 35;
                f5776 = i % 128;
                if (i % 2 != 0) {
                    C2712cp.m6257(activity, list);
                    throw null;
                }
                if (C2712cp.m6257(activity, list)) {
                    f5776 = (f5774 + 17) % 128;
                    m6349(m6344(new int[]{-80973140, 1688681073, -1937569007, -872291963, -2096761198, 74634952, 904198289, -248309523, -2048370945, -1804537592}, MotionEvent.axisFromString("") + 18).intern(), activity);
                    f5774 = (f5776 + 75) % 128;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                int i = f5776 + 117;
                f5774 = i % 128;
                if (i % 2 == 0) {
                    C2712cp.m6257(activity, list);
                    throw null;
                }
                if (C2712cp.m6257(activity, list)) {
                    m6347(m6343(5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 27 - TextUtils.getOffsetAfter("", 0), 250 - TextUtils.lastIndexOf("", '0'), "￼ￚ\u0007\b\ufffe\r\ufffa\r￬\ufffe￼\u0007\ufffa\r\f\u0007￢\ufffe\u000f\ufffa￬\u0012\r\u0002\u000f\u0002\r", true).intern(), activity, bundle);
                    f5776 = (f5774 + 67) % 128;
                }
                f5776 = (f5774 + 107) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                int i = f5774 + 69;
                f5776 = i % 128;
                if (i % 2 != 0) {
                    C2712cp.m6257(activity, list);
                    throw null;
                }
                if (C2712cp.m6257(activity, list)) {
                    m6349(m6343(7 - (ViewConfiguration.getJumpTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, TextUtils.getTrimmedLength("") + 253, "￪\u000b\ufff8\t\u000b￼\ufffb\u0006\u0005\uffd8\ufffa\u000b\u0000\r\u0000\u000b\u0010", false).intern(), activity);
                }
                f5776 = (f5774 + 67) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                f5774 = (f5776 + InterfaceC3173h3.d.b.f8819b) % 128;
                if (!(!C2712cp.m6257(activity, list))) {
                    m6349(m6343(Color.red(0) + 11, 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 301 - AndroidCharacter.getMirror('0'), "\r\u0000\u000b\u0010￪\u000b\u0006\u0007\u0007￼\ufffb\u0006\u0005\uffd8\ufffa\u000b\u0000", false).intern(), activity);
                }
                int i = f5774 + 117;
                f5776 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 80 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
            /* renamed from: ﻛ */
            public final void mo5068(Activity activity) {
                f5776 = (f5774 + 55) % 128;
                m6349(m6344(new int[]{-963949411, -1879449177, -627434334, -990181936, -753425393, 1587301696, -1303884069, 1501950017, 1135526252, -73105071, -897612722, -959070606, -2048370945, -1804537592}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25).intern(), activity);
                int i = f5774 + 115;
                f5776 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
            /* renamed from: ｋ */
            public final void mo5069(Activity activity) {
                f5776 = (f5774 + 115) % 128;
                m6349(m6344(new int[]{-963949411, -1879449177, -28197108, 821160712, 816740549, 1982705414, 736819955, -1229756157, -897612722, -959070606, -2048370945, -1804537592}, 20 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), activity);
                f5774 = (f5776 + 29) % 128;
            }

            /* renamed from: ｋ */
            private void m6347(String str, Activity activity, Bundle bundle) {
                List<Object> listAsList;
                int i = f5776 + 15;
                f5774 = i % 128;
                if (i % 2 == 0) {
                    Object[] objArr = new Object[3];
                    objArr[1] = activity;
                    objArr[0] = bundle;
                    listAsList = Arrays.asList(objArr);
                } else {
                    listAsList = Arrays.asList(activity, bundle);
                }
                m6345(str, listAsList);
                int i2 = f5776 + 91;
                f5774 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 81 / 0;
                }
            }

            /* renamed from: ﾒ */
            private void m6349(String str, Activity activity) {
                f5774 = (f5776 + 25) % 128;
                m6345(str, Collections.singletonList(activity));
                int i = f5776 + 89;
                f5774 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            /* renamed from: ﻐ */
            private void m6346(String str, boolean z, List<Object> list2) {
                C2712cp.m6253(C2712cp.this, AbstractC2183w4.OooOO0o(new StringBuilder(), m6344(new int[]{674088814, 577980149, -55334248, 803399389, 565380066, -966354421, 982537540, -890297457, 279687512, -794981157}, (Process.myPid() >> 22) + 18), str), z, false, list2);
                f5776 = (f5774 + 41) % 128;
            }

            /* renamed from: ﻐ */
            private static String m6344(int[] iArr, int i) {
                String str;
                synchronized (C2723d.f5953) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f5777.clone();
                        C2723d.f5951 = 0;
                        while (true) {
                            int i2 = C2723d.f5951;
                            if (i2 < iArr.length) {
                                int i3 = iArr[i2];
                                char c2 = (char) (i3 >> 16);
                                cArr[0] = c2;
                                char c22 = (char) i3;
                                cArr[1] = c22;
                                char c3 = (char) (iArr[i2 + 1] >> 16);
                                cArr[2] = c3;
                                char c4 = (char) iArr[i2 + 1];
                                cArr[3] = c4;
                                C2723d.f5954 = (c2 << 16) + c22;
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
            private static String m6343(int i, int i2, int i3, String str, boolean z) {
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
                            cArr2[i5] = (char) (cArr2[i5] - f5775);
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
        };
        f5692 = (f5691 + 31) % 128;
        return anonymousClass9;
    }

    /* renamed from: ﾒ */
    private C2928u m6281(C2928u c2928u, C2928u c2928u2) {
        int i = f5692 + 95;
        f5691 = i % 128;
        if (i % 2 == 0) {
            if (c2928u == null) {
                c2928u = new C2928u();
                f5691 = (f5692 + 39) % 128;
            }
            if (c2928u2 == null) {
                c2928u2 = new C2928u();
            }
            AnonymousClass14 anonymousClass14 = new C2928u() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.14

                /* renamed from: ﻐ */
                private /* synthetic */ C2928u f5728;

                /* renamed from: ﾒ */
                private /* synthetic */ C2928u f5730;

                public AnonymousClass14(C2928u c2928u22, C2928u c2928u3) {
                    c2928u = c2928u22;
                    c2928u = c2928u3;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
                /* renamed from: ﻐ */
                public final void mo6312(JSONObject jSONObject, WebView webView, View view) {
                    c2928u.mo6312(jSONObject, webView, view);
                    C2926s.m7591(new f.AnonymousClass1(c2928u, jSONObject, webView, view));
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
                /* renamed from: ﻛ */
                public final void mo4939(JSONObject jSONObject, WebView webView, View view) {
                    c2928u.mo4939(jSONObject, webView, view);
                    C2926s.m7591(new e.AnonymousClass5(c2928u, jSONObject, webView, view));
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
                /* renamed from: ｋ */
                public final void mo6316(JSONObject jSONObject, WebView webView, View view) {
                    c2928u.mo6316(jSONObject, webView, view);
                    C2926s.m7591(new g.AnonymousClass5(c2928u, jSONObject, webView, view));
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
                /* renamed from: ﾇ */
                public final void mo6307(JSONObject jSONObject, WebView webView, View view) {
                    c2928u.mo6307(jSONObject, webView, view);
                    C2926s.m7591(new a.AnonymousClass1(c2928u, jSONObject, webView, view));
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
                /* renamed from: ﾒ */
                public final void mo4932(JSONObject jSONObject, WebView webView, View view) {
                    c2928u.mo4932(jSONObject, webView, view);
                    C2926s.m7591(new b.AnonymousClass3(c2928u, jSONObject, webView, view));
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
                /* renamed from: ﻛ */
                public final void mo6309(JSONObject jSONObject, WebView webView, Object obj, View view) {
                    c2928u.mo6309(jSONObject, webView, obj, view);
                    C2926s.m7591(new d.AnonymousClass3(c2928u, jSONObject, webView, obj, view));
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
                /* renamed from: ﾇ */
                public final void mo6313(JSONObject jSONObject, WebView webView, Object obj, View view) {
                    c2928u.mo6313(jSONObject, webView, obj, view);
                    C2926s.m7591(new j.AnonymousClass3(c2928u, jSONObject, webView, obj, view));
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
                /* renamed from: ﾒ */
                public final void mo6317(JSONObject jSONObject, WebView webView, Object obj, View view) {
                    c2928u.mo6317(jSONObject, webView, obj, view);
                    C2926s.m7591(new c.AnonymousClass3(c2928u, jSONObject, webView, obj, view));
                }
            };
            f5691 = (f5692 + 59) % 128;
            return anonymousClass14;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private static boolean m6265(Activity activity, List<String> list) {
        int i = f5692 + 15;
        f5691 = i % 128;
        if (i % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty() || list.contains(activity.getClass().getName())) {
            f5691 = (f5692 + 91) % 128;
            return true;
        }
        int i2 = f5691 + 19;
        f5692 = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private JSONObject m6261(Activity activity, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2869ik.f6838, m6292().m6231());
            jSONObject.put(C2869ik.f6793, m6292().m6226());
            jSONObject.put(C2869ik.f6791, m6292().m6224());
            jSONObject.put(m6282("둫麗榾鲣\u07bf砈ꘌ฿", 7 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), activity.getClass().getName());
            if (bundle != null) {
                int i = f5691 + 69;
                f5692 = i % 128;
                jSONObject.put((i % 2 == 0 ? m6275("嬳孒쎌檺泵\uf12dཊ\uf4e0遏㸧婂\u0fde", Color.green(0)) : m6275("嬳孒쎌檺泵\uf12dཊ\uf4e0遏㸧婂\u0fde", Color.green(0))).intern(), true);
            }
            return jSONObject;
        } catch (JSONException unused) {
            C2921n.m7509(m6275("ႀგ鶃䤄紕꼤Ⳮ\ue53c\udbfc怬秉ḿ蛜唸닣匷燽ื追萹", KeyEvent.getMaxKeyCode() >> 16).intern(), m6282("䷎ᚮ\uf8a2駎夫䠫ꂈ먲珳뭺嬹๓僭䁓麌쇎\ud836\uf5beᔕ겗䂖忌쥉\uf581\uf059勃㦰ꀄ\ud836\uf5be", 30 - KeyEvent.keyCodeFromString("")).intern());
            return jSONObject;
        }
    }

    /* renamed from: ﾒ */
    private static String m6282(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2920m.f7237) {
            try {
                char[] cArr2 = new char[cArr.length];
                C2920m.f7236 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i2 = C2920m.f7236;
                    if (i2 < cArr.length) {
                        cArr3[0] = cArr[i2];
                        cArr3[1] = cArr[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i3) ^ ((c3 << 4) + f5695)) ^ ((c3 >>> 5) + f5693)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f5697) ^ ((c4 + i3) ^ ((c4 << 4) + f5694))));
                            i3 -= 40503;
                        }
                        int i5 = C2920m.f7236;
                        cArr2[i5] = cArr3[0];
                        cArr2[i5 + 1] = cArr3[1];
                        C2920m.f7236 = i5 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﾇ */
    private C2927t m6274(boolean z) {
        AnonymousClass15 anonymousClass15 = new C2927t() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.15

            /* renamed from: ﮐ */
            private static boolean f5731 = true;

            /* renamed from: ﱟ */
            private static int f5732 = 1;

            /* renamed from: ﱡ */
            private static int f5733 = 0;

            /* renamed from: ﻐ */
            private static int f5734 = 132;

            /* renamed from: ﾇ */
            private static boolean f5735 = true;

            /* renamed from: ﾒ */
            private static char[] f5736 = {229, 232, 200, 237, 247, 244, 240, 253, 233, 201, 252, 248, 246, 199, 231, 239, 202, 243, 241, 206, 250, 251, 197, 236, 230, 242, 249, 218, 208, 178};

            /* renamed from: ﻛ */
            private /* synthetic */ boolean f5737;

            public AnonymousClass15(boolean z2) {
                z = z2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo4932(JSONObject jSONObject, View view, Activity activity) {
                int i = f5732 + 27;
                f5733 = i % 128;
                int i2 = i % 2;
                mo4932(jSONObject, view, activity);
                if (i2 != 0) {
                    int i3 = 0 / 0;
                }
                int i4 = f5733 + 27;
                f5732 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo6307(JSONObject jSONObject, View view, Activity activity) {
                f5732 = (f5733 + InterfaceC3173h3.d.b.f8819b) % 128;
                mo6307(jSONObject, view, activity);
                f5733 = (f5732 + 65) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final /* synthetic */ void mo4939(JSONObject jSONObject, View view, Activity activity) {
                int i = f5732 + 123;
                f5733 = i % 128;
                int i2 = i % 2;
                mo4939(jSONObject, view, activity);
                if (i2 != 0) {
                    int i3 = 12 / 0;
                }
                int i4 = f5732 + 27;
                f5733 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 14 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo6312(JSONObject jSONObject, View view, Activity activity) {
                f5732 = (f5733 + 99) % 128;
                mo6312(jSONObject, view, activity);
                f5733 = (f5732 + 57) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo6316(JSONObject jSONObject, View view, Activity activity) {
                f5732 = (f5733 + 123) % 128;
                mo6316(jSONObject, view, activity);
                int i = f5733 + 77;
                f5732 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
            /* renamed from: ﻐ */
            public final void mo6316(JSONObject jSONObject, View view, Activity activity) {
                int i = f5733 + 57;
                f5732 = i % 128;
                if (i % 2 == 0) {
                    m6329(m6328((String) null, (int[]) null, 97 % (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0082\u0089\u0098\u008f\u0081\u008c\u008c\u0097\u0096\u0089\u0084\u0095").intern(), jSONObject, view, null, activity);
                } else {
                    m6329(m6328((String) null, (int[]) null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, "\u0082\u0089\u0098\u008f\u0081\u008c\u008c\u0097\u0096\u0089\u0084\u0095").intern(), jSONObject, view, null, activity);
                }
                f5732 = (f5733 + 47) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
            /* renamed from: ﻛ */
            public final void mo4939(JSONObject jSONObject, View view, Activity activity) {
                f5732 = (f5733 + 27) % 128;
                m6329(m6328((String) null, (int[]) null, 127 - KeyEvent.keyCodeFromString(""), "\u0082\u0089\u0088\u0081\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject, view, null, activity);
                int i = f5733 + 85;
                f5732 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo6309(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f5733 = (f5732 + 91) % 128;
                mo6309(jSONObject, view, obj, activity);
                int i = f5732 + InterfaceC3173h3.d.b.f8826i;
                f5733 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo6313(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i = f5732 + 113;
                f5733 = i % 128;
                int i2 = i % 2;
                mo6313(jSONObject, view, obj, activity);
                if (i2 != 0) {
                    throw null;
                }
                f5732 = (f5733 + 95) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo6317(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i = f5732 + 25;
                f5733 = i % 128;
                int i2 = i % 2;
                mo6317(jSONObject, view, obj, activity);
                if (i2 != 0) {
                    int i3 = 66 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
            /* renamed from: ｋ */
            public final void mo6309(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f5733 = (f5732 + 23) % 128;
                m6329(m6328((String) null, (int[]) null, Process.getGidForName("") + 128, "\u0082\u0089\u0090\u008f\u0084\u0087\u008e\u0082\u0081").intern(), jSONObject, view, obj, activity);
                f5733 = (f5732 + 29) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
            /* renamed from: ﾇ */
            public final void mo4932(JSONObject jSONObject, View view, Activity activity) {
                f5732 = (f5733 + 35) % 128;
                m6329(m6328((String) null, (int[]) null, 126 - ImageFormat.getBitsPerPixel(0), "\u0081\u008d\u008c\u008b\u008a\u0082\u0089\u0088\u0081\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject, view, null, activity);
                f5733 = (f5732 + 115) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
            /* renamed from: ﾒ */
            public final void mo6317(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f5733 = (f5732 + 87) % 128;
                m6329(m6328((String) null, (int[]) null, TextUtils.indexOf("", "", 0) + 127, "\u0085\u0094\u0093\u0092\u008d\u0091\u0082\u0089\u0090\u008f\u0084\u0087\u008e\u0082\u0081").intern(), jSONObject, view, obj, activity);
                f5732 = (f5733 + 45) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
            /* renamed from: ｋ */
            public final void mo6307(JSONObject jSONObject, View view, Activity activity) {
                f5732 = (f5733 + 57) % 128;
                m6329(m6328((String) null, (int[]) null, View.MeasureSpec.getSize(0) + 127, "\u0082\u0089\u0085\u0092\u0087\u008e\u0082\u0081").intern(), jSONObject, view, null, activity);
                f5733 = (f5732 + 45) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
            /* renamed from: ﾇ */
            public final void mo6313(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f5732 = (f5733 + InterfaceC3173h3.d.b.f8819b) % 128;
                m6329(m6328((String) null, (int[]) null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u008c\u009a\u0089\u0095\u008a\u008c\u009a\u0089\u0084\u0087\u008e\u0089\u0093\u0092\u008d\u0098\u008e\u0099\u0089\u0096").intern(), jSONObject, view, obj, activity);
                int i = f5733 + 87;
                f5732 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t
            /* renamed from: ﾒ */
            public final void mo6312(JSONObject jSONObject, View view, Activity activity) {
                int i = f5733 + 97;
                f5732 = i % 128;
                if (i % 2 == 0) {
                    m6329(m6328((String) null, (int[]) null, (ViewConfiguration.getTapTimeout() >> 41) + 15, "\u008c\u009a\u0089\u0095\u008a\u0093\u0092\u008c\u0085\u009b\u008f").intern(), jSONObject, view, null, activity);
                } else {
                    m6329(m6328((String) null, (int[]) null, 127 - (ViewConfiguration.getTapTimeout() >> 16), "\u008c\u009a\u0089\u0095\u008a\u0093\u0092\u008c\u0085\u009b\u008f").intern(), jSONObject, view, null, activity);
                }
                f5733 = (f5732 + 121) % 128;
            }

            /* renamed from: ﾒ */
            private void m6329(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                C2712cp.m6253(C2712cp.this, AbstractC2183w4.OooOO0o(new StringBuilder(), m6328((String) null, (int[]) null, 127 - Gravity.getAbsoluteGravity(0, 0), "\u009e\u008d\u0089\u009a\u0089\u008c\u0085\u0084\u009d\u0082\u0097\u0096\u0089\u0084\u009c"), str), z, false, Arrays.asList(jSONObject, view, obj, activity));
                f5732 = (f5733 + 81) % 128;
            }

            /* renamed from: ﾒ */
            private static String m6328(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                        char[] cArr2 = f5736;
                        int i2 = f5734;
                        if (f5731) {
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
                        if (f5735) {
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
        };
        f5692 = (f5691 + 41) % 128;
        return anonymousClass15;
    }

    /* renamed from: ﾇ */
    public final void m6299(String str, JSONObject jSONObject) {
        f5692 = (f5691 + 89) % 128;
        if (!str.equals(m6275("퐓푲쾿鞁윹ﴙ\uf25a弛ὲ㈆Ᵹꐛ䉢ܔ汰\ue90b", '0' - AndroidCharacter.getMirror('0')).intern())) {
            if (str.equals(m6282("吷厩쐎쯋㪓쁚跹넋\ud9f8ॄ", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10).intern())) {
                f5692 = (f5691 + 65) % 128;
                this.f5699.m6220().m5412(jSONObject);
            }
        } else {
            int i = f5692 + 67;
            f5691 = i % 128;
            if (i % 2 != 0) {
                this.f5699.m6220().m5406(jSONObject);
                throw null;
            }
            this.f5699.m6220().m5406(jSONObject);
        }
        JSONObject jSONObjectM7441 = C2915kc.m7441(m6263(jSONObject));
        if (str.equals(C2869ik.f6798)) {
            f5692 = (f5691 + 19) % 128;
            this.f5699.m6220().m5408(jSONObjectM7441);
            return;
        }
        if (!str.equals(C2869ik.f6797)) {
            if (!str.equals(C2869ik.f6802)) {
                if (str.equals(C2869ik.f6803)) {
                    this.f5699.m6220().m5402(jSONObjectM7441);
                    return;
                }
                if (str.equals(C2869ik.f6800)) {
                    this.f5699.m6220().m5403(jSONObjectM7441);
                    return;
                }
                if (!str.equals(C2869ik.f6796)) {
                    if (str.equals(C2869ik.f6799)) {
                        this.f5699.m6220().m5401(jSONObjectM7441);
                        return;
                    } else {
                        this.f5699.m6220().m5411(str, jSONObject);
                        return;
                    }
                }
                f5692 = (f5691 + InterfaceC3173h3.d.b.f8826i) % 128;
                this.f5699.m6220().m5404(jSONObjectM7441);
                return;
            }
            int i2 = f5691 + 21;
            f5692 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f5699.m6220().m5414(jSONObjectM7441);
                return;
            } else {
                this.f5699.m6220().m5414(jSONObjectM7441);
                throw null;
            }
        }
        this.f5699.m6220().m5405(jSONObjectM7441);
        int i3 = f5691 + 117;
        f5692 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
    }

    /* renamed from: ﻛ */
    public final void m6295(String str, List<Object> list) {
        m6270(AbstractC2183w4.OooOO0o(new StringBuilder(), m6282("䘻뢭\u177a⾼駃깿Ꝫ鉤졲窫聴ꯨ誖\ud9fb룻腖", 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), str), list);
        f5691 = (f5692 + 87) % 128;
    }

    /* renamed from: ﻐ */
    private String m6252(String str) {
        Class clsM5463;
        int i = f5692 + 47;
        f5691 = i % 128;
        if (i % 2 == 0 ? (clsM5463 = m6294().m5463(C2916kd.m7452(str, m6275("鿻鿕磥ኇא䩄睯鷷咀蕜", TextUtils.lastIndexOf("", '0', 0) + 1).intern()))) != null : (clsM5463 = m6294().m5463(C2916kd.m7452(str, m6275("鿻鿕磥ኇא䩄睯鷷咀蕜", 0 - TextUtils.lastIndexOf("", (char) 17, 1)).intern()))) != null) {
            String name = clsM5463.getName();
            f5692 = (f5691 + 17) % 128;
            return name;
        }
        f5692 = (f5691 + 69) % 128;
        return null;
    }

    /* renamed from: ｋ */
    private C2928u m6266(boolean z) {
        AnonymousClass13 anonymousClass13 = new C2928u() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.13

            /* renamed from: ﱟ */
            private static int f5722 = 1;

            /* renamed from: ﾒ */
            private static int f5725;

            /* renamed from: ﻐ */
            private /* synthetic */ boolean f5726;

            /* renamed from: ﾇ */
            private static char[] f5724 = {39316, 51678, 14639, 26993, 55482, 2062, 30787, 43965, 7156, 19287, 47751, 50622, 38388, 25861, 13659, 33936, 21540, 9321, 63383, 18398, 6013, 59053, 46847, 1555, 53672, 41471, 28959, 59994, 47632, 19174, 6842, 43886, 31699, 2954, 55415, 26663, 'a', 20523, 41181, 61569, 16725, 37352, 57777, 12876, 33308, 53889, 9060, 29450, 50137, 5193, 25633, 61976, 41554, 21156, 760, 45866, 25473, 5062, 49204, 'v', 20518, 41211, 61594, 16765, 37375, 57774, 12872, 33307, 53935, 9075, 29441, 'w', 20522, 41212, 61614, 16724, 37369, 57781, 12868, 33309, 53892, 9082, 29452, 50129, 5229, 25638, 46308, 1158, 21850, 42464, 62889, 43440, 63977, 2366, 22858, 59520, 14389, 18508, 39820, 11214, 31610, 35505, 'W', 20518, 41200, 61577, 16723, 37372, 57755, 12877, 33332, 53934, 9061, 29457, 50129, 5229, 25655, 46291, 1246};

            /* renamed from: ｋ */
            private static long f5723 = 1020903997458632783L;

            public AnonymousClass13(boolean z2) {
                z = z2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo4932(JSONObject jSONObject, WebView webView, View view) {
                f5725 = (f5722 + 19) % 128;
                mo4932(jSONObject, webView, view);
                f5722 = (f5725 + 107) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo6307(JSONObject jSONObject, WebView webView, View view) {
                f5725 = (f5722 + 25) % 128;
                mo6307(jSONObject, webView, view);
                int i = f5725 + 59;
                f5722 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final /* synthetic */ void mo4939(JSONObject jSONObject, WebView webView, View view) {
                f5725 = (f5722 + 25) % 128;
                mo4939(jSONObject, webView, view);
                f5725 = (f5722 + 37) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo6312(JSONObject jSONObject, WebView webView, View view) {
                int i = f5725 + 91;
                f5722 = i % 128;
                int i2 = i % 2;
                mo6312(jSONObject, webView, view);
                if (i2 == 0) {
                    throw null;
                }
                int i3 = f5722 + 57;
                f5725 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 72 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo6316(JSONObject jSONObject, WebView webView, View view) {
                f5725 = (f5722 + 23) % 128;
                mo6316(jSONObject, webView, view);
                int i = f5722 + 87;
                f5725 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
            /* renamed from: ﻐ */
            public final void mo6312(JSONObject jSONObject, WebView webView, View view) {
                int i = f5722 + 85;
                f5725 = i % 128;
                if (i % 2 != 0) {
                    m6318(m6319(MotionEvent.axisFromString("") + 119, 116 / (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (43475 >>> (PointF.length(1.0f, 0.0f) > 2.0f ? 1 : (PointF.length(1.0f, 0.0f) == 2.0f ? 0 : -1)))).intern(), jSONObject, webView, null, view);
                } else {
                    m6318(m6319(10 - MotionEvent.axisFromString(""), 92 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43475)).intern(), jSONObject, webView, null, view);
                }
                f5722 = (f5725 + 119) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
            /* renamed from: ﻛ */
            public final void mo4939(JSONObject jSONObject, WebView webView, View view) {
                f5725 = (f5722 + 67) % 128;
                m6318(m6319(11 - ((Process.getThreadPriority(0) + 20) >> 6), KeyEvent.normalizeMetaState(0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 39413)).intern(), jSONObject, webView, null, view);
                int i = f5725 + 57;
                f5722 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final /* synthetic */ void mo6309(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i = f5722 + 57;
                f5725 = i % 128;
                int i2 = i % 2;
                mo6309(jSONObject, webView, obj, view);
                if (i2 != 0) {
                    int i3 = 47 / 0;
                }
                f5722 = (f5725 + 55) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo6313(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i = f5722 + 85;
                f5725 = i % 128;
                int i2 = i % 2;
                mo6313(jSONObject, webView, obj, view);
                if (i2 != 0) {
                    throw null;
                }
                f5722 = (f5725 + 67) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo6317(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f5722 = (f5725 + 49) % 128;
                mo6317(jSONObject, webView, obj, view);
                f5725 = (f5722 + 81) % 128;
            }

            /* renamed from: ﻐ */
            private void m6318(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                C2712cp.m6253(C2712cp.this, AbstractC2183w4.OooOO0o(new StringBuilder(), m6319(16 - TextUtils.indexOf((CharSequence) "", '0'), 102 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), str), z, false, Arrays.asList(jSONObject, webView, obj, view));
                f5725 = (f5722 + 45) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
            /* renamed from: ﻛ */
            public final void mo6309(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i = f5725 + 3;
                f5722 = i % 128;
                if (i % 2 == 0) {
                    m6318(m6319(ViewConfiguration.getMinimumFlingVelocity() * 330, 90 >>> KeyEvent.keyCodeFromString(""), (char) (59963 / (ViewConfiguration.getFadingEdgeLength() - 107))).intern(), jSONObject, webView, obj, view);
                } else {
                    m6318(m6319((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9, 27 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 59963)).intern(), jSONObject, webView, obj, view);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
            /* renamed from: ｋ */
            public final void mo6316(JSONObject jSONObject, WebView webView, View view) {
                f5722 = (f5725 + 35) % 128;
                m6318(m6319(Color.blue(0) + 12, (Process.myTid() >> 22) + 59, (char) ExpandableListView.getPackedPositionType(0L)).intern(), jSONObject, webView, null, view);
                int i = f5725 + 75;
                f5722 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 82 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
            /* renamed from: ﾇ */
            public final void mo6307(JSONObject jSONObject, WebView webView, View view) {
                f5725 = (f5722 + 97) % 128;
                m6318(m6319(8 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 51 - View.MeasureSpec.getSize(0), (char) (View.resolveSizeAndState(0, 0, 0) + 62073)).intern(), jSONObject, webView, null, view);
                int i = f5725 + 27;
                f5722 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 80 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
            /* renamed from: ﾒ */
            public final void mo4932(JSONObject jSONObject, WebView webView, View view) {
                f5725 = (f5722 + 125) % 128;
                m6318(m6319(16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (50655 - (KeyEvent.getMaxKeyCode() >> 16))).intern(), jSONObject, webView, null, view);
                f5722 = (f5725 + InterfaceC3173h3.d.b.f8821d) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
            /* renamed from: ﾇ */
            public final void mo6313(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i = f5722 + InterfaceC3173h3.d.b.f8819b;
                f5725 = i % 128;
                if (i % 2 != 0) {
                    m6318(m6319(51 / KeyEvent.getDeadChar(1, 1), 84 >>> TextUtils.indexOf("", "", 1), (char) TextUtils.indexOf("", "", 0, 1)).intern(), jSONObject, webView, obj, view);
                } else {
                    m6318(m6319(KeyEvent.getDeadChar(0, 0) + 20, 71 - TextUtils.indexOf("", "", 0), (char) TextUtils.indexOf("", "", 0, 0)).intern(), jSONObject, webView, obj, view);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2928u
            /* renamed from: ﾒ */
            public final void mo6317(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f5722 = (f5725 + 17) % 128;
                m6318(m6319(15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 36, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), jSONObject, webView, obj, view);
                int i = f5722 + 77;
                f5725 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 25 / 0;
                }
            }

            /* renamed from: ﾇ */
            private static String m6319(int i, int i2, char c2) {
                String str;
                synchronized (C2642a.f4435) {
                    try {
                        char[] cArr = new char[i];
                        C2642a.f4436 = 0;
                        while (true) {
                            int i3 = C2642a.f4436;
                            if (i3 < i) {
                                cArr[i3] = (char) ((f5724[i2 + i3] ^ (i3 * f5723)) ^ c2);
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
        };
        int i = f5691 + 81;
        f5692 = i % 128;
        if (i % 2 != 0) {
            return anonymousClass13;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private void m6270(String str, List<Object> list) {
        C2926s.m7591(new AbstractC2873io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.4

            /* renamed from: ﻛ */
            private /* synthetic */ List f5754;

            /* renamed from: ｋ */
            private /* synthetic */ String f5755;

            public AnonymousClass4(String str2, List list2) {
                str = str2;
                list = list2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2712cp.m6253(C2712cp.this, str, false, false, list);
            }
        });
        C2926s.m7596(new AbstractC2873io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.10

            /* renamed from: ﻐ */
            private /* synthetic */ List f5709;

            /* renamed from: ﻛ */
            private /* synthetic */ String f5710;

            public AnonymousClass10(String str2, List list2) {
                str = str2;
                list = list2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2712cp.m6253(C2712cp.this, str, true, false, list);
            }
        });
        m6255((AbstractC2873io) new AbstractC2873io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.6

            /* renamed from: ﻐ */
            private /* synthetic */ List f5768;

            /* renamed from: ﾇ */
            private /* synthetic */ String f5770;

            public AnonymousClass6(String str2, List list2) {
                str = str2;
                list = list2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2712cp.m6253(C2712cp.this, str, false, true, list);
            }
        }, true);
        f5691 = (f5692 + 7) % 128;
    }

    /* renamed from: ﻐ */
    private C2919l m6250(C2919l c2919l, C2919l c2919l2) {
        f5692 = (f5691 + 63) % 128;
        if (c2919l == null) {
            c2919l = new C2919l();
            f5691 = (f5692 + 51) % 128;
        }
        if (c2919l2 == null) {
            c2919l2 = new C2919l();
        }
        return new C2919l() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.12

            /* renamed from: ﻐ */
            private /* synthetic */ C2919l f5719;

            /* renamed from: ﾒ */
            private /* synthetic */ C2919l f5721;

            public AnonymousClass12(C2919l c2919l22, C2919l c2919l3) {
                c2919l = c2919l22;
                c2919l = c2919l3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻐ */
            public final void mo6312(JSONObject jSONObject, WebView webView, Activity activity) {
                c2919l.mo6312(jSONObject, webView, activity);
                C2926s.m7591(new f.AnonymousClass1(c2919l, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻛ */
            public final void mo4939(JSONObject jSONObject, WebView webView, Activity activity) {
                c2919l.mo4939(jSONObject, webView, activity);
                C2926s.m7591(new e.AnonymousClass5(c2919l, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final void mo6307(JSONObject jSONObject, WebView webView, Activity activity) {
                c2919l.mo6307(jSONObject, webView, activity);
                C2926s.m7591(new a.AnonymousClass1(c2919l, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final void mo4932(JSONObject jSONObject, WebView webView, Activity activity) {
                c2919l.mo4932(jSONObject, webView, activity);
                C2926s.m7591(new b.AnonymousClass3(c2919l, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final void mo6316(JSONObject jSONObject, WebView webView, Activity activity) {
                c2919l.mo6316(jSONObject, webView, activity);
                C2926s.m7591(new g.AnonymousClass5(c2919l, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻛ */
            public final void mo6317(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                c2919l.mo6317(jSONObject, webView, obj, activity);
                C2926s.m7591(new c.AnonymousClass3(c2919l, jSONObject, webView, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final void mo6309(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                c2919l.mo6309(jSONObject, webView, obj, activity);
                C2926s.m7591(new d.AnonymousClass3(c2919l, jSONObject, webView, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2919l, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final void mo6313(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                c2919l.mo6313(jSONObject, webView, obj, activity);
                C2926s.m7591(new j.AnonymousClass3(c2919l, jSONObject, webView, obj, activity));
            }
        };
    }

    /* renamed from: ｋ */
    private void m6271(String str, boolean z, boolean z2, List<Object> list) {
        try {
            C2738do c2738doM6929 = this.f5703.m6929(str);
            if (c2738doM6929 != null) {
                C2743dt c2743dtM6927 = this.f5703.m6927(c2738doM6929.m6636());
                if (c2743dtM6927 != null) {
                    if (z == c2738doM6929.m6634() && z2 == c2738doM6929.m6635()) {
                        f5691 = (f5692 + 29) % 128;
                        if (C2925r.m7548().m7581()) {
                            C2713cq.m6352(m6290(), str);
                        }
                        c2743dtM6927.m6711(this.f5707, this, list);
                        return;
                    }
                    return;
                }
                String strM6290 = m6290();
                StringBuilder sb = new StringBuilder();
                sb.append(m6282("왫\ue208캸\ud9bcঅ譑\ue817똷儁즃㥆菱\udebdꀀ䱬뿊쥉\uf581\udefc溳夫䠫", 21 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                sb.append(c2738doM6929.m6636());
                sb.append(m6282("틣\u09c5湷쒢Ჟ믽ࣆ㰕熎杊", 9 - Process.getGidForName("")).intern());
                C2713cq.m6350(strM6290, sb.toString(), null);
                f5692 = (f5691 + InterfaceC3173h3.d.b.f8821d) % 128;
            }
        } catch (Throwable th) {
            String strM62902 = m6290();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6282("䷎ᚮ\uf8a2駎夫䠫䂾裏熎杊쒶誾僭䁓ꨚ䐆栵㴘簌櫵ٶ㹗", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20).intern());
            sb2.append(str);
            C2713cq.m6350(strM62902, sb2.toString(), th);
        }
    }

    /* renamed from: ﻐ */
    private C2927t m6251(C2927t c2927t, C2927t c2927t2) {
        f5691 = (f5692 + 31) % 128;
        if (c2927t == null) {
            c2927t = new C2927t();
        }
        if (c2927t2 == null) {
            c2927t2 = new C2927t();
            f5692 = (f5691 + 37) % 128;
        }
        return new C2927t() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.16

            /* renamed from: ﻐ */
            private /* synthetic */ C2927t f5739;

            /* renamed from: ﾇ */
            private /* synthetic */ C2927t f5740;

            public AnonymousClass16(C2927t c2927t22, C2927t c2927t3) {
                c2927t = c2927t22;
                c2927t = c2927t3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻐ */
            public final void mo6316(JSONObject jSONObject, View view, Activity activity) {
                c2927t.mo6316(jSONObject, view, activity);
                C2926s.m7591(new g.AnonymousClass5(c2927t, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻛ */
            public final void mo4939(JSONObject jSONObject, View view, Activity activity) {
                c2927t.mo4939(jSONObject, view, activity);
                C2926s.m7591(new e.AnonymousClass5(c2927t, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final void mo6309(JSONObject jSONObject, View view, Object obj, Activity activity) {
                c2927t.mo6309(jSONObject, view, obj, activity);
                C2926s.m7591(new d.AnonymousClass3(c2927t, jSONObject, view, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final void mo4932(JSONObject jSONObject, View view, Activity activity) {
                c2927t.mo4932(jSONObject, view, activity);
                C2926s.m7591(new b.AnonymousClass3(c2927t, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final void mo6317(JSONObject jSONObject, View view, Object obj, Activity activity) {
                c2927t.mo6317(jSONObject, view, obj, activity);
                C2926s.m7591(new c.AnonymousClass3(c2927t, jSONObject, view, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final void mo6307(JSONObject jSONObject, View view, Activity activity) {
                c2927t.mo6307(jSONObject, view, activity);
                C2926s.m7591(new a.AnonymousClass1(c2927t, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final void mo6313(JSONObject jSONObject, View view, Object obj, Activity activity) {
                c2927t.mo6313(jSONObject, view, obj, activity);
                C2926s.m7591(new j.AnonymousClass3(c2927t, jSONObject, view, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2927t, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final void mo6312(JSONObject jSONObject, View view, Activity activity) {
                c2927t.mo6312(jSONObject, view, activity);
                C2926s.m7591(new f.AnonymousClass1(c2927t, jSONObject, view, activity));
            }
        };
    }

    /* renamed from: ﻐ */
    private InterfaceC2900jo m6249(List<String> list) {
        AnonymousClass5 anonymousClass5 = new InterfaceC2900jo() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.5

            /* renamed from: ﱟ */
            private static short[] f5756 = null;

            /* renamed from: ﱡ */
            private static byte[] f5757 = {-107, -78, -73, -112, 106, 77, -95, 71, -102, 107, 76, -103, -81, -93, 83, -85, 81, 94, 67, -113, -82, 66, -92, 121, -120, -81, -101, -34, 111, -107, 107, -109, 99, 104, 127, -69, -100, 112, -106, 75, -76, 98, 77};

            /* renamed from: ﺙ */
            private static int f5758 = 1;

            /* renamed from: ﻏ */
            private static int f5759 = 0;

            /* renamed from: ﻐ */
            private static int f5760 = -194990505;

            /* renamed from: ﾇ */
            private static int f5761 = 118;

            /* renamed from: ﾒ */
            private static int f5762 = -1585527044;

            /* renamed from: ﻛ */
            private /* synthetic */ List f5763;

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$5$3 */
            public class AnonymousClass3 extends AbstractRunnableC2878it {

                /* renamed from: ｋ */
                private /* synthetic */ String f5766;

                /* renamed from: ﾇ */
                private /* synthetic */ Activity f5767;

                public AnonymousClass3(String strOooOO0o2, Activity activity2) {
                    str = strOooOO0o2;
                    activity = activity2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2712cp.m6253(C2712cp.this, str, false, false, Collections.singletonList(activity));
                }
            }

            public AnonymousClass5(List list2) {
                list = list2;
            }

            /* renamed from: ｋ */
            private static String m6340(byte b2, short s, int i, int i2, int i3) {
                String string;
                synchronized (C2912k.f7200) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        int i4 = f5761;
                        int i5 = i + i4;
                        int i6 = i5 == -1 ? 1 : 0;
                        if (i6 != 0) {
                            byte[] bArr = f5757;
                            i5 = bArr != null ? (byte) (bArr[f5760 + i2] + i4) : (short) (f5756[f5760 + i2] + i4);
                        }
                        if (i5 > 0) {
                            C2912k.f7203 = ((i2 + i5) - 2) + f5760 + i6;
                            C2912k.f7201 = b2;
                            char c2 = (char) (i3 + f5762);
                            C2912k.f7204 = c2;
                            sb.append(c2);
                            C2912k.f7202 = C2912k.f7204;
                            C2912k.f7205 = 1;
                            while (C2912k.f7205 < i5) {
                                byte[] bArr2 = f5757;
                                if (bArr2 != null) {
                                    int i7 = C2912k.f7203;
                                    C2912k.f7203 = i7 - 1;
                                    C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                                } else {
                                    short[] sArr = f5756;
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

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2900jo
            /* renamed from: ﻛ */
            public final void mo5064(Activity activity) {
                f5759 = (f5758 + 115) % 128;
                m6341(m6340((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 77), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (-118) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 194990505 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 1585527155).intern(), activity, list);
                int i = f5758 + 33;
                f5759 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2900jo
            /* renamed from: ﾒ */
            public final void mo5065(Activity activity) {
                f5758 = (f5759 + 109) % 128;
                m6341(m6340((byte) (80 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 118, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 194990515, View.resolveSize(0, 0) + 1585527155).intern(), activity, list);
                int i = f5759 + 47;
                f5758 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            /* renamed from: ﾒ */
            private void m6341(String str, Activity activity2, List<String> list2) {
                f5758 = (f5759 + 75) % 128;
                if (C2712cp.m6257(activity2, list2)) {
                    String strOooOO0o2 = AbstractC2183w4.OooOO0o(new StringBuilder(), m6340((byte) (ExpandableListView.getPackedPositionType(0L) + 98), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-119) - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 194990531, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1585527109), str);
                    C2712cp.m6253(C2712cp.this, strOooOO0o2, true, false, Collections.singletonList(activity2));
                    C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.5.3

                        /* renamed from: ｋ */
                        private /* synthetic */ String f5766;

                        /* renamed from: ﾇ */
                        private /* synthetic */ Activity f5767;

                        public AnonymousClass3(String strOooOO0o22, Activity activity22) {
                            str = strOooOO0o22;
                            activity = activity22;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2712cp.m6253(C2712cp.this, str, false, false, Collections.singletonList(activity));
                        }
                    });
                }
                f5758 = (f5759 + 11) % 128;
            }
        };
        int i = f5692 + 85;
        f5691 = i % 128;
        if (i % 2 == 0) {
            return anonymousClass5;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private void m6255(AbstractC2873io abstractC2873io, boolean z) {
        int i = f5692 + 109;
        f5691 = i % 128;
        try {
            if (i % 2 != 0) {
                throw null;
            }
            if (z) {
                C2926s.m7598(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.8
                    public AnonymousClass8() {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        C2926s.m7600(abstractC2873io);
                    }
                });
                f5691 = (f5692 + 59) % 128;
            } else {
                C2926s.m7600(abstractC2873io);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ */
    private static String m6275(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5696, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5696));
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
}
