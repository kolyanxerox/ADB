package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.p009i.C2915kc;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.as */
/* loaded from: classes2.dex */
public abstract class AbstractC2661as extends AnonymousClass3 {

    /* renamed from: ﻐ */
    private static AbstractC2661as f4712;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$3 */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: ﻐ */
        private C2663au f4713;

        /* renamed from: ﻛ */
        private JSONObject f4714;

        /* renamed from: く */
        public final C2663au m5174() {
            return this.f4713;
        }

        /* renamed from: ゥ */
        public final synchronized JSONObject m5175() {
            return this.f4714;
        }

        /* renamed from: ﻛ */
        public final void m5176(C2663au c2663au) {
            this.f4713 = c2663au;
        }

        /* renamed from: ｋ */
        public synchronized void mo5177(JSONObject jSONObject) {
            this.f4714 = jSONObject;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$b */
    public interface b {
        /* renamed from: ﻐ */
        void mo5178();

        /* renamed from: ｋ */
        void mo5179();
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c */
    public static class c extends AbstractC2661as {

        /* renamed from: く */
        private static int f4715 = 0;

        /* renamed from: っ */
        private static int f4716 = 1;

        /* renamed from: ト */
        private static boolean f4717 = true;

        /* renamed from: リ */
        private static boolean f4718 = true;

        /* renamed from: ヮ */
        private static char[] f4719 = {195, 203, 194, 193, 197, 202, 210, 209, 191, 192, 207, 208, 201, 140, 212, 205, 204, 196, 199, 198, 176, 161};

        /* renamed from: 丫 */
        private static int f4720 = 94;

        /* renamed from: 乁 */
        private static int f4721 = 58;

        /* renamed from: ヶ */
        private boolean f4722;

        /* renamed from: 爫 */
        private boolean f4723;

        /* renamed from: ﬤ */
        private boolean f4724;

        /* renamed from: טּ */
        private int f4725;

        /* renamed from: סּ */
        private List f4726;

        /* renamed from: ףּ */
        private C2652aj f4727;

        /* renamed from: ﭖ */
        private List<InterfaceC2662at> f4728;

        /* renamed from: ﭴ */
        private List<InterfaceC2662at> f4729;

        /* renamed from: ﭸ */
        private b f4730;

        /* renamed from: ﮉ */
        private C2658ap f4731;

        /* renamed from: ﮌ */
        private InterfaceC2662at f4732;

        /* renamed from: ﮐ */
        private C2881iw f4733;

        /* renamed from: ﱟ */
        private Handler f4734;

        /* renamed from: ﱡ */
        private C2660ar f4735;

        /* renamed from: ﺙ */
        private C2659aq f4736;

        /* renamed from: ﻏ */
        private C2664av f4737;

        /* renamed from: ﻐ */
        private C2890je f4738;

        /* renamed from: ﻛ */
        private final int f4739;

        /* renamed from: ｋ */
        private final int f4740;

        /* renamed from: ﾇ */
        private final int f4741;

        /* renamed from: ﾒ */
        private final int f4742;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$1 */
        public class AnonymousClass1 extends AbstractRunnableC2878it {
            public AnonymousClass1() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                c.this.m5203(true);
                if (c.m5185(c.this) != null) {
                    c.m5185(c.this).mo4993();
                }
                ArrayList arrayList = new ArrayList(c.m5194(c.this));
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((InterfaceC2662at) obj).mo4993();
                }
                c.m5194(c.this).clear();
                ArrayList arrayList2 = new ArrayList(c.m5198(c.this));
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((InterfaceC2662at) obj2).mo4993();
                }
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$3 */
        public class AnonymousClass3 extends AbstractRunnableC2878it {
            public AnonymousClass3() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                if (!c.this.m5201().m7145().m7181()) {
                    c.m5191(c.this).mo5179();
                } else {
                    if (c.this.mo5161()) {
                        return;
                    }
                    c.m5191(c.this).mo5178();
                }
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$4 */
        public class AnonymousClass4 extends AbstractRunnableC2878it {

            /* renamed from: ﻛ */
            private /* synthetic */ InterfaceC2662at f4754;

            public AnonymousClass4(InterfaceC2662at interfaceC2662at) {
                interfaceC2662at = interfaceC2662at;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                c.m5198(c.this).add(interfaceC2662at);
                if (c.this.mo5161()) {
                    interfaceC2662at.mo4993();
                }
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$5 */
        public class AnonymousClass5 extends AbstractRunnableC2878it {
            public AnonymousClass5() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                c.m5194(c.this).clear();
                c.m5198(c.this).clear();
                c.m5192(c.this, null);
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$6 */
        public class AnonymousClass6 implements C2915kc.c<C2665aw> {
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
            /* renamed from: ﻛ */
            public final /* synthetic */ C2665aw mo5208(JSONObject jSONObject, String str) {
                return new C2665aw(jSONObject.optJSONObject(str));
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$7 */
        public class AnonymousClass7 implements C2915kc.b<ISAdQualityAdType> {
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
            /* renamed from: ｋ */
            public final /* synthetic */ ISAdQualityAdType mo5209(JSONArray jSONArray, int i) {
                return ISAdQualityAdType.fromInt(jSONArray.optInt(i));
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$8 */
        public class AnonymousClass8 extends AbstractRunnableC2878it {

            /* renamed from: ﾒ */
            private /* synthetic */ InterfaceC2662at f4757;

            public AnonymousClass8(InterfaceC2662at interfaceC2662at) {
                interfaceC2662at = interfaceC2662at;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                c.m5192(c.this, interfaceC2662at);
                if (c.this.mo5161()) {
                    interfaceC2662at.mo4993();
                }
            }
        }

        public c() {
            super((byte) 0);
            m5193((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2, ImageFormat.getBitsPerPixel(0) + 4, ImageFormat.getBitsPerPixel(0) + 168, "\u0001\ufff8\t", true).intern();
            m5197(null, null, 127 - View.MeasureSpec.getMode(0), "\u0083\u0082\u0081").intern();
            m5197(null, null, Color.green(0) + 127, "\u0087\u0086\u0085\u0084").intern();
            m5197(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0087\u0086\u0088\u0084").intern();
            m5193(3 - View.getDefaultSize(0, 0), 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 165 - TextUtils.indexOf("", "", 0), "\ufffe\ufffa\u0005\u0003", false).intern();
            m5197(null, null, ImageFormat.getBitsPerPixel(0) + 128, "\u008a\u0087\u0087\u0089").intern();
            m5193(4 - (ViewConfiguration.getTapTimeout() >> 16), 4 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 162, "\ufffa\n\u0003\ufffb", false).intern();
            m5193(1 - TextUtils.lastIndexOf("", '0', 0), KeyEvent.keyCodeFromString("") + 3, 165 - ExpandableListView.getPackedPositionType(0L), "\u0001\b\ufff9", true).intern();
            m5197(null, null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, "\u0088\u008b\u0089\u0088").intern();
            TimeUnit timeUnit = TimeUnit.HOURS;
            timeUnit.toMillis(24L);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            this.f4739 = (int) timeUnit2.toMillis(5L);
            this.f4740 = (int) timeUnit.toMillis(12L);
            this.f4741 = (int) timeUnit2.toMillis(3L);
            this.f4742 = (int) timeUnit2.toMillis(10L);
            this.f4725 = 0;
            this.f4726 = null;
            this.f4722 = false;
        }

        /* renamed from: Ὺ */
        private int m5180() {
            f4716 = (f4715 + 107) % 128;
            int iOptInt = m5175().optInt(m5193(2 - (Process.myPid() >> 22), (Process.myTid() >> 22) + 4, 165 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0001\u0007\u0002\ufff8", false).intern(), 3);
            f4716 = (f4715 + 33) % 128;
            return iOptInt;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x001d A[Catch: all -> 0x0017, TryCatch #1 {all -> 0x0017, blocks: (B:27:0x0001, B:29:0x000e, B:40:0x0027, B:39:0x001d, B:34:0x0016, B:37:0x0019, B:30:0x0010), top: B:47:0x0001, inners: #0 }] */
        /* renamed from: Ⅽ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private synchronized void m5181() {
            /*
                r3 = this;
                monitor-enter(r3)
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.c.f4715     // Catch: java.lang.Throwable -> L17
                int r0 = r0 + 71
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.c.f4716 = r1     // Catch: java.lang.Throwable -> L17
                int r0 = r0 % 2
                r1 = 3
                if (r0 != 0) goto L19
                android.os.Handler r0 = r3.f4734     // Catch: java.lang.Throwable -> L17
                int r2 = r1 / 0
                if (r0 == 0) goto L27
                goto L1d
            L15:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> L17
            L17:
                r0 = move-exception
                goto L30
            L19:
                android.os.Handler r0 = r3.f4734     // Catch: java.lang.Throwable -> L17
                if (r0 == 0) goto L27
            L1d:
                android.os.Handler r0 = r3.f4734     // Catch: java.lang.Throwable -> L17
                com.ironsource.adqualitysdk.sdk.i.as$c$1 r2 = new com.ironsource.adqualitysdk.sdk.i.as$c$1     // Catch: java.lang.Throwable -> L17
                r2.<init>()     // Catch: java.lang.Throwable -> L17
                r0.post(r2)     // Catch: java.lang.Throwable -> L17
            L27:
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.c.f4716     // Catch: java.lang.Throwable -> L17
                int r0 = r0 + r1
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.c.f4715 = r0     // Catch: java.lang.Throwable -> L17
                monitor-exit(r3)
                return
            L30:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.c.m5181():void");
        }

        /* renamed from: Ↄ */
        private JSONObject m5182() {
            String strM7236;
            int i = f4716 + 75;
            f4715 = i % 128;
            if (i % 2 == 0 ? (strM7236 = this.f4738.m7236(m5197(null, null, 127 - KeyEvent.normalizeMetaState(0), "\u0081\u0094\u0084\u0089\u0084\u008e\u0085\u0093\u0092\u0091\u0090\u0084\u008c").intern())) != null : (strM7236 = this.f4738.m7236(m5197(null, null, 12 >> KeyEvent.normalizeMetaState(1), "\u0081\u0094\u0084\u0089\u0084\u008e\u0085\u0093\u0092\u0091\u0090\u0084\u008c").intern())) != null) {
                try {
                    return new JSONObject(strM7236);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObject = new JSONObject();
            f4716 = (f4715 + 83) % 128;
            return jSONObject;
        }

        /* renamed from: ﮐ */
        public static /* synthetic */ int m5183(c cVar) {
            int i = f4716;
            f4715 = (i + 79) % 128;
            int i2 = cVar.f4725;
            cVar.f4725 = i2 + 1;
            int i3 = i + 79;
            f4715 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 73 / 0;
            }
            return i2;
        }

        /* renamed from: ﱟ */
        public static /* synthetic */ Handler m5184(c cVar) {
            int i = f4715;
            f4716 = (i + 7) % 128;
            Handler handler = cVar.f4734;
            f4716 = (i + 23) % 128;
            return handler;
        }

        /* renamed from: ﱡ */
        public static /* synthetic */ InterfaceC2662at m5185(c cVar) {
            int i = (f4716 + 3) % 128;
            f4715 = i;
            InterfaceC2662at interfaceC2662at = cVar.f4732;
            f4716 = (i + 51) % 128;
            return interfaceC2662at;
        }

        /* renamed from: ﻏ */
        public static /* synthetic */ int m5186(c cVar) {
            int i = f4716 + 31;
            f4715 = i % 128;
            int i2 = i % 2;
            int iM5180 = cVar.m5180();
            if (i2 != 0) {
                int i3 = 14 / 0;
            }
            return iM5180;
        }

        /* renamed from: ﻐ */
        public static /* synthetic */ void m5188(c cVar) {
            int i = f4715 + 125;
            f4716 = i % 128;
            int i2 = i % 2;
            cVar.m5181();
            if (i2 == 0) {
                int i3 = 80 / 0;
            }
        }

        /* renamed from: ﻛ */
        public static /* synthetic */ C2890je m5190(c cVar) {
            int i = f4715 + 97;
            int i2 = i % 128;
            f4716 = i2;
            int i3 = i % 2;
            C2890je c2890je = cVar.f4738;
            if (i3 == 0) {
                throw null;
            }
            int i4 = i2 + 57;
            f4715 = i4 % 128;
            if (i4 % 2 == 0) {
                return c2890je;
            }
            throw null;
        }

        /* renamed from: ｋ */
        public static /* synthetic */ b m5191(c cVar) {
            int i = (f4716 + 89) % 128;
            f4715 = i;
            b bVar = cVar.f4730;
            f4716 = (i + 119) % 128;
            return bVar;
        }

        /* renamed from: ﾇ */
        public static /* synthetic */ List m5194(c cVar) {
            int i = f4716;
            f4715 = (i + 95) % 128;
            List<InterfaceC2662at> list = cVar.f4728;
            f4715 = (i + 51) % 128;
            return list;
        }

        /* renamed from: ﾒ */
        public static /* synthetic */ List m5198(c cVar) {
            int i = f4716;
            f4715 = (i + InterfaceC3173h3.d.b.f8823f) % 128;
            List<InterfaceC2662at> list = cVar.f4729;
            int i2 = i + 95;
            f4715 = i2 % 128;
            if (i2 % 2 == 0) {
                return list;
            }
            throw null;
        }

        /* renamed from: っ */
        public final int m5200() {
            f4716 = (f4715 + 11) % 128;
            int iOptInt = m5175().optInt(m5193(1 - TextUtils.indexOf("", ""), 2 - MotionEvent.axisFromString(""), 162 - KeyEvent.getDeadChar(0, 0), "\ufffb\f\ufff9", true).intern(), this.f4740);
            int i = f4716 + 55;
            f4715 = i % 128;
            if (i % 2 == 0) {
                return iOptInt;
            }
            throw null;
        }

        /* renamed from: へ */
        public final synchronized C2881iw m5201() {
            C2881iw c2881iw;
            int i = (f4715 + 55) % 128;
            f4716 = i;
            c2881iw = this.f4733;
            f4715 = (i + 85) % 128;
            return c2881iw;
        }

        /* renamed from: ト */
        public final int m5202() throws UnsupportedEncodingException {
            JSONObject jSONObjectM5175;
            String strM5197;
            int i = f4716 + 43;
            f4715 = i % 128;
            if (i % 2 != 0) {
                jSONObjectM5175 = m5175();
                strM5197 = m5197(null, null, 27 % (ViewConfiguration.getJumpTapTimeout() >>> 7), "\u0087\u008c\u0084");
            } else {
                jSONObjectM5175 = m5175();
                strM5197 = m5197(null, null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0087\u008c\u0084");
            }
            int iOptInt = jSONObjectM5175.optInt(strM5197.intern(), this.f4739);
            int i2 = f4715 + 35;
            f4716 = i2 % 128;
            if (i2 % 2 != 0) {
                return iOptInt;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: リ */
        public final int mo5142() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m5175().optInt(m5193((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, 3 - (Process.myPid() >> 22), 165 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0001\b\ufff9", true).intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ヮ */
        public final boolean mo5143() {
            JSONObject jSONObjectM5175;
            String strM5193;
            int i = f4716 + 45;
            f4715 = i % 128;
            if (i % 2 != 0) {
                jSONObjectM5175 = m5175();
                strM5193 = m5193(2 >>> (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 5 / (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 14552 / Color.argb(0, 0, 0, 1), "\ufffa\n\u0003\ufffb", false);
            } else {
                jSONObjectM5175 = m5175();
                strM5193 = m5193(5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, Color.argb(0, 0, 0, 0) + 163, "\ufffa\n\u0003\ufffb", false);
            }
            boolean zOptBoolean = jSONObjectM5175.optBoolean(strM5193.intern());
            int i2 = f4715 + 11;
            f4716 = i2 % 128;
            if (i2 % 2 != 0) {
                return zOptBoolean;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ヶ */
        public final boolean mo5144() throws UnsupportedEncodingException {
            JSONObject jSONObjectM5175;
            String strM5197;
            int i = f4716 + 81;
            f4715 = i % 128;
            if (i % 2 != 0) {
                jSONObjectM5175 = m5175();
                strM5197 = m5197(null, null, 28 % (ViewConfiguration.getWindowTouchSlop() + 65), "\u0088\u008b\u0089\u0088");
            } else {
                jSONObjectM5175 = m5175();
                strM5197 = m5197(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0088\u008b\u0089\u0088");
            }
            return jSONObjectM5175.optBoolean(strM5197.intern());
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: 丫 */
        public final List mo5145() {
            f4716 = (f4715 + 11) % 128;
            if (this.f4726 == null) {
                this.f4726 = C2915kc.m7438(m5175().optJSONArray(m5197(null, null, View.resolveSize(0, 0) + 127, "\u008a\u0087\u0087\u0089").intern()), new C2915kc.b<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.7
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
                    /* renamed from: ｋ */
                    public final /* synthetic */ ISAdQualityAdType mo5209(JSONArray jSONArray, int i) {
                        return ISAdQualityAdType.fromInt(jSONArray.optInt(i));
                    }
                });
            }
            List list = this.f4726;
            int i = f4716 + 83;
            f4715 = i % 128;
            if (i % 2 == 0) {
                return list;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: 乁 */
        public final long mo5146() {
            f4716 = (f4715 + 93) % 128;
            String strM7236 = this.f4738.m7236(m5193((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, View.resolveSizeAndState(0, 0, 0) + 37, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 159, "\uffde\n\t\t\u0000\ufffe\u000f\n\r\ufff0\u000b\uffff￼\u000f\u0000\uffef\u0004\b\u0000\u000e\u000f￼\b\u000b\u0007\n\t\u0002\uffc9￼\uffff\f\uffc9\u0007￼\u000e\u000f", false).intern());
            long j = TextUtils.isEmpty(strM7236) ? 0L : Long.parseLong(strM7236);
            int i = f4715 + 57;
            f4716 = i % 128;
            if (i % 2 != 0) {
                return j;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: 爫 */
        public final int mo5147() throws UnsupportedEncodingException {
            JSONObject jSONObjectM5175;
            String strM5197;
            int i = f4716 + 61;
            f4715 = i % 128;
            if (i % 2 != 0) {
                jSONObjectM5175 = m5175();
                strM5197 = m5197(null, null, InterfaceC3173h3.d.b.f8827j % (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), "\u0087\u0086\u0088\u0084");
            } else {
                jSONObjectM5175 = m5175();
                strM5197 = m5197(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0087\u0086\u0088\u0084");
            }
            int iOptInt = jSONObjectM5175.optInt(strM5197.intern(), this.f4742);
            f4715 = (f4716 + 117) % 128;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﬤ */
        public final String mo5148() {
            if (m5175() == null) {
                return null;
            }
            f4715 = (f4716 + 73) % 128;
            String strOptString = m5175().optString(m5193(KeyEvent.getDeadChar(0, 0) + 2, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, 166 - View.resolveSizeAndState(0, 0, 0), "\b\ufff8\b\ufff8", true).intern());
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            f4716 = (f4715 + 37) % 128;
            String strM5214 = m5174().m5214();
            f4715 = (f4716 + 83) % 128;
            return strM5214;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: טּ */
        public final int mo5149() {
            f4716 = (f4715 + 61) % 128;
            int iOptInt = m5175().optInt(m5197(null, null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, "\u0087\u0086\u0085\u0084").intern(), this.f4741);
            f4716 = (f4715 + 109) % 128;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: סּ */
        public final synchronized void mo5150() {
            this.f4734.removeCallbacksAndMessages(null);
            this.f4734 = null;
            C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.5
                public AnonymousClass5() {
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    c.m5194(c.this).clear();
                    c.m5198(c.this).clear();
                    c.m5192(c.this, null);
                }
            });
            f4715 = (f4716 + 79) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ףּ */
        public final JSONObject mo5151() {
            int i = f4716 + 95;
            f4715 = i % 128;
            if (i % 2 != 0) {
                m5174();
                throw null;
            }
            if (m5174() == null) {
                return null;
            }
            int i2 = f4716 + InterfaceC3173h3.d.b.f8823f;
            f4715 = i2 % 128;
            if (i2 % 2 == 0) {
                return m5174().m5216();
            }
            int i3 = 37 / 0;
            return m5174().m5216();
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﭖ */
        public final C2659aq mo5152() {
            int i = f4715;
            C2659aq c2659aq = this.f4736;
            f4716 = (i + 79) % 128;
            return c2659aq;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﭴ */
        public final C2658ap mo5153() {
            int i = (f4716 + 81) % 128;
            f4715 = i;
            C2658ap c2658ap = this.f4731;
            int i2 = i + 21;
            f4716 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 23 / 0;
            }
            return c2658ap;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﭸ */
        public final C2664av mo5154() {
            int i = f4716 + 123;
            f4715 = i % 128;
            if (i % 2 == 0) {
                return this.f4737;
            }
            int i2 = 17 / 0;
            return this.f4737;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﮉ */
        public final C2660ar mo5155() {
            int i = f4716 + 7;
            int i2 = i % 128;
            f4715 = i2;
            if (i % 2 != 0) {
                throw null;
            }
            C2660ar c2660ar = this.f4735;
            f4716 = (i2 + InterfaceC3173h3.d.b.f8821d) % 128;
            return c2660ar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﮌ */
        public final String mo5156() {
            f4715 = (f4716 + 25) % 128;
            String strOptString = m5175().optString(m5193(ImageFormat.getBitsPerPixel(0) + 3, 3 - (Process.myTid() >> 22), 167 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0001\ufff8\t", true).intern());
            f4716 = (f4715 + 35) % 128;
            return strOptString;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﺙ */
        public final int mo5160() {
            int iM5215;
            C2663au c2663auM5174 = m5174();
            if (c2663auM5174 != null) {
                f4716 = (f4715 + 125) % 128;
                iM5215 = c2663auM5174.m5215();
            } else {
                iM5215 = 3000;
            }
            f4715 = (f4716 + 21) % 128;
            return iM5215;
        }

        /* renamed from: ﻐ */
        private static boolean m5189(JSONObject jSONObject) {
            int i = f4716 + InterfaceC3173h3.d.b.f8819b;
            f4715 = i % 128;
            return jSONObject.has(m5197(null, null, i % 2 != 0 ? 62 >>> (ViewConfiguration.getMaximumFlingVelocity() >> 100) : (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u0088\u0087\u0093\u0089\u008c\u0087").intern());
        }

        /* renamed from: ｋ */
        public static /* synthetic */ InterfaceC2662at m5192(c cVar, InterfaceC2662at interfaceC2662at) {
            int i = f4715;
            f4716 = (i + 67) % 128;
            cVar.f4732 = interfaceC2662at;
            int i2 = i + 95;
            f4716 = i2 % 128;
            if (i2 % 2 != 0) {
                return interfaceC2662at;
            }
            throw null;
        }

        /* renamed from: ﾒ */
        public static /* synthetic */ void m5199(JSONObject jSONObject, long j) throws JSONException {
            f4715 = (f4716 + 85) % 128;
            m5196(jSONObject, j);
            f4715 = (f4716 + 67) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﮐ */
        public final boolean mo5157() {
            int i = f4715 + 93;
            f4716 = i % 128;
            if (i % 2 != 0) {
                return this.f4724;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﱟ */
        public final double mo5158() {
            JSONObject jSONObjectM5175;
            String strM5193;
            int i = f4716 + 61;
            f4715 = i % 128;
            if (i % 2 != 0) {
                jSONObjectM5175 = m5175();
                strM5193 = m5193(TextUtils.indexOf((CharSequence) "", 'O') * 3, 4 / TextUtils.indexOf("", ""), 2363 / ExpandableListView.getPackedPositionGroup(1L), "\ufffe\ufffa\u0005\u0003", true);
            } else {
                jSONObjectM5175 = m5175();
                strM5193 = m5193(2 - TextUtils.indexOf((CharSequence) "", '0'), 4 - TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionGroup(0L) + 165, "\ufffe\ufffa\u0005\u0003", false);
            }
            return jSONObjectM5175.optDouble(strM5193.intern(), 1.0d);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﱡ */
        public final double mo5159() {
            JSONObject jSONObjectM5175;
            String strM5193;
            int i = f4715 + 51;
            f4716 = i % 128;
            if (i % 2 == 0) {
                jSONObjectM5175 = m5175();
                strM5193 = m5193(2 >>> (ViewConfiguration.getKeyRepeatDelay() % 41), 3 % TextUtils.indexOf("", ""), 5911 / (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\ufff8\u0007\u0003", true);
            } else {
                jSONObjectM5175 = m5175();
                strM5193 = m5193(2 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 3 - TextUtils.indexOf("", ""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 166, "\ufff8\u0007\u0003", true);
            }
            return jSONObjectM5175.optDouble(strM5193.intern(), 5.0d);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﻏ */
        public final synchronized boolean mo5161() {
            boolean z;
            int i = f4715;
            int i2 = i + 57;
            f4716 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            z = this.f4723;
            f4716 = (i + 23) % 128;
            return z;
        }

        /* renamed from: ﻛ */
        public final synchronized void m5203(boolean z) {
            int i = f4715 + 91;
            f4716 = i % 128;
            if (i % 2 == 0) {
                this.f4723 = z;
                throw null;
            }
            this.f4723 = z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﾇ */
        public final void mo5170(C2882ix c2882ix) {
            f4715 = (f4716 + 99) % 128;
            m5174().m5219(c2882ix);
            int i = f4716 + 11;
            f4715 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* renamed from: ﻐ */
        private C2665aw m5187(String str) {
            f4716 = (f4715 + 79) % 128;
            if (str == null) {
                return null;
            }
            C2665aw c2665aw = mo5167().get(str);
            f4715 = (f4716 + 115) % 128;
            return c2665aw;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﻛ */
        public final void mo5163(JSONObject jSONObject) {
            int i = f4715 + 11;
            f4716 = i % 128;
            if (i % 2 != 0) {
                mo5177(jSONObject);
                m5181();
            } else {
                mo5177(jSONObject);
                m5181();
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.AnonymousClass3
        /* renamed from: ｋ */
        public final synchronized void mo5177(JSONObject jSONObject) {
            try {
                if (m5189(jSONObject)) {
                    m5195(jSONObject);
                    f4715 = (f4716 + 81) % 128;
                }
                super.mo5177(jSONObject);
                this.f4737.mo5177(jSONObject);
                this.f4735.mo5177(jSONObject);
                this.f4736.mo5177(jSONObject);
                this.f4731.mo5177(jSONObject);
                int i = f4715 + 95;
                f4716 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﾇ */
        public final void mo5168(Context context, C2657ao c2657ao, boolean z) {
            f4716 = (f4715 + 41) % 128;
            if (z) {
                C2926s.m7592(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.3
                    public AnonymousClass3() {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        if (!c.this.m5201().m7145().m7181()) {
                            c.m5191(c.this).mo5179();
                        } else {
                            if (c.this.mo5161()) {
                                return;
                            }
                            c.m5191(c.this).mo5178();
                        }
                    }
                }, AbstractC2661as.m5141().mo5149());
            }
            m5203(false);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new C2903jr(context, c2657ao, mo5146()).mo4959(new JSONObject(), m5201().m7145().m7181(), true, false);
            } catch (JSONException e) {
                C2921n.m7506(m5197(null, null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0085\u0093\u0092\u0091\u0090\u0096\u0081\u0087\u0090\u0082\u0081\u0095").intern(), m5193((ViewConfiguration.getLongPressTimeout() >> 16) + 4, KeyEvent.normalizeMetaState(0) + 25, 154 - TextUtils.getOffsetAfter("", 0), "\u0016\u0005\u000e\u0014￥\u0012\u0012\u000f\u0012\uffc0\u0003\u0012\u0005\u0001\u0014\t\u000e\u0007\uffc0\u0002\u0001\u0013\u0005\uffc0\u0005", false).intern(), e);
            }
            m5201().m7146(this.f4727.m5078(m5193(-MotionEvent.axisFromString(""), Color.green(0) + 4, 168 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "￼\u0007￼\u0001", true).intern()), jSONObject, new InterfaceC2883iy() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.2

                /* renamed from: ﱡ */
                private static int f4744 = 1;

                /* renamed from: ﺙ */
                private static int f4745 = 0;

                /* renamed from: ﾇ */
                private static int f4746 = 154;

                /* renamed from: ﾒ */
                private static char[] f4747 = {'~', 252, 240, 239, 253, 258, 261, 256, 232, 237, 258, 254, 'n', 221, 221, '7', 'j', 'g', 'h', 'J', 'H', 'b', 'b', 'e', 'f', 'k', 'j', 'i', 'M', 153, '1', 'A', 'C', 'j', 'k', 'n', 't', 'l', 'f', 'C', 'I', 'p', 'p', 'r', '[', '2', '-', 'V', 'k', 'm', 't', 'k', 'l', 'I', 'F', 'n', 'p', 'l', 'C', 'C', 'h', 'g', 'j', 'n'};

                /* renamed from: ﻛ */
                final /* synthetic */ C2657ao f4749;

                /* renamed from: ｋ */
                final /* synthetic */ Context f4750;

                /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$2$1 */
                public class AnonymousClass1 extends AbstractRunnableC2878it {
                    public AnonymousClass1() {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        c.this.mo5168(context, c2657ao, false);
                    }
                }

                public AnonymousClass2(Context context2, C2657ao c2657ao2) {
                    context = context2;
                    c2657ao = c2657ao2;
                }

                /* renamed from: ﻐ */
                private static String m5205(int i, int i2, int i3, String str, boolean z2) {
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
                                cArr2[i5] = (char) (cArr2[i5] - f4746);
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
                            if (z2) {
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

                /* renamed from: ﾇ */
                private void m5207(int i) {
                    synchronized (c.this) {
                        try {
                            if (c.m5184(c.this) != null) {
                                C2926s.m7594(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.2.1
                                    public AnonymousClass1() {
                                    }

                                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                    /* renamed from: ﾒ */
                                    public final void mo4950() {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        c.this.mo5168(context, c2657ao, false);
                                    }
                                }, i);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:45:0x004d A[PHI: r2 r13
  0x004d: PHI (r2v10 int) = (r2v4 int), (r2v14 int) binds: [B:38:0x002c, B:44:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v10 java.lang.String) binds: [B:38:0x002c, B:44:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2883iy
                /* renamed from: ﻛ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void mo5055(com.ironsource.adqualitysdk.sdk.p009i.C2879iu r22) throws org.json.JSONException {
                    /*
                        Method dump skipped, instructions count: 456
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.c.AnonymousClass2.mo5055(com.ironsource.adqualitysdk.sdk.i.iu):void");
                }

                /* renamed from: ﾇ */
                private static String m5206(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
                    String str2;
                    byte[] bytes = str;
                    if (str != null) {
                        bytes = str.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = bytes;
                    synchronized (C2831h.f6553) {
                        try {
                            int i = iArr[0];
                            int i2 = iArr[1];
                            int i3 = iArr[2];
                            int i4 = iArr[3];
                            char[] cArr = new char[i2];
                            System.arraycopy(f4747, i, cArr, 0, i2);
                            if (bArr != null) {
                                char[] cArr2 = new char[i2];
                                C2831h.f6552 = 0;
                                char c = 0;
                                while (true) {
                                    int i5 = C2831h.f6552;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (bArr[i5] == 1) {
                                        cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                                    } else {
                                        cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                                    }
                                    c = cArr2[i5];
                                    C2831h.f6552 = i5 + 1;
                                }
                                cArr = cArr2;
                            }
                            if (i4 > 0) {
                                char[] cArr3 = new char[i2];
                                System.arraycopy(cArr, 0, cArr3, 0, i2);
                                int i6 = i2 - i4;
                                System.arraycopy(cArr3, 0, cArr, i6, i4);
                                System.arraycopy(cArr3, i4, cArr, 0, i6);
                            }
                            if (z2) {
                                char[] cArr4 = new char[i2];
                                C2831h.f6552 = 0;
                                while (true) {
                                    int i7 = C2831h.f6552;
                                    if (i7 >= i2) {
                                        break;
                                    }
                                    cArr4[i7] = cArr[(i2 - i7) - 1];
                                    C2831h.f6552 = i7 + 1;
                                }
                                cArr = cArr4;
                            }
                            if (i3 > 0) {
                                C2831h.f6552 = 0;
                                while (true) {
                                    int i8 = C2831h.f6552;
                                    if (i8 >= i2) {
                                        break;
                                    }
                                    cArr[i8] = (char) (cArr[i8] - iArr[2]);
                                    C2831h.f6552 = i8 + 1;
                                }
                            }
                            str2 = new String(cArr);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2883iy
                /* renamed from: ﻛ */
                public final void mo5056(C2879iu c2879iu, String str) {
                    int iM7124;
                    if (c2879iu != null) {
                        iM7124 = c2879iu.m7123().m7124();
                        f4744 = (f4745 + 7) % 128;
                    } else {
                        f4745 = (f4744 + 3) % 128;
                        iM7124 = -1;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(m5206(true, new int[]{30, 34, 0, 15}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001").intern());
                    sb.append(iM7124);
                    C2921n.m7502(m5206(false, new int[]{0, 12, 148, 2}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern(), sb.toString());
                    if (iM7124 == 403 || c.m5183(c.this) >= c.m5186(c.this)) {
                        return;
                    }
                    m5207(c.this.m5202());
                    f4744 = (f4745 + 13) % 128;
                }
            });
            f4715 = (f4716 + 73) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﾒ */
        public final void mo5172(Context context, C2881iw c2881iw, C2652aj c2652aj, b bVar, boolean z) {
            this.f4738 = new C2890je(context, m5197(null, null, 126 - Process.getGidForName(""), "\u0085\u0093\u0092\u0091\u0090\u0084\u0081\u0087\u0090\u0082\u0081\u008c\u008e\u008a\u0083\u008e\u008f\u008d\u008e\u008d\u0084\u0089\u008a\u0081\u0084\u0089\u008c\u0087").intern(), m5193((-16777202) - Color.rgb(0, 0, 0), (-16777196) - Color.rgb(0, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + ModuleDescriptor.MODULE_VERSION, "ￋ\u0011\u0003\u0001\u0010\u0003\u0012ￋￒ\u0010\u0001\r\f\u0004\u0011\r\r\u000b\n\uffff", false).intern());
            this.f4733 = c2881iw;
            this.f4723 = false;
            this.f4724 = z;
            this.f4727 = c2652aj;
            this.f4734 = new Handler(Looper.getMainLooper());
            C2663au c2663au = new C2663au();
            this.f4737 = new C2664av(c2663au);
            this.f4735 = new C2660ar(c2663au);
            this.f4736 = new C2659aq(c2663au);
            this.f4731 = new C2658ap();
            mo5177(m5182());
            m5176(c2663au);
            this.f4730 = bVar;
            this.f4728 = new ArrayList();
            this.f4729 = new ArrayList();
            int i = f4715 + 11;
            f4716 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$2 */
        public class AnonymousClass2 implements InterfaceC2883iy {

            /* renamed from: ﱡ */
            private static int f4744 = 1;

            /* renamed from: ﺙ */
            private static int f4745 = 0;

            /* renamed from: ﾇ */
            private static int f4746 = 154;

            /* renamed from: ﾒ */
            private static char[] f4747 = {'~', 252, 240, 239, 253, 258, 261, 256, 232, 237, 258, 254, 'n', 221, 221, '7', 'j', 'g', 'h', 'J', 'H', 'b', 'b', 'e', 'f', 'k', 'j', 'i', 'M', 153, '1', 'A', 'C', 'j', 'k', 'n', 't', 'l', 'f', 'C', 'I', 'p', 'p', 'r', '[', '2', '-', 'V', 'k', 'm', 't', 'k', 'l', 'I', 'F', 'n', 'p', 'l', 'C', 'C', 'h', 'g', 'j', 'n'};

            /* renamed from: ﻛ */
            final /* synthetic */ C2657ao f4749;

            /* renamed from: ｋ */
            final /* synthetic */ Context f4750;

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.as$c$2$1 */
            public class AnonymousClass1 extends AbstractRunnableC2878it {
                public AnonymousClass1() {
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    c.this.mo5168(context, c2657ao, false);
                }
            }

            public AnonymousClass2(Context context2, C2657ao c2657ao2) {
                context = context2;
                c2657ao = c2657ao2;
            }

            /* renamed from: ﻐ */
            private static String m5205(int i, int i2, int i3, String str, boolean z2) {
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
                            cArr2[i5] = (char) (cArr2[i5] - f4746);
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
                        if (z2) {
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

            /* renamed from: ﾇ */
            private void m5207(int i) {
                synchronized (c.this) {
                    try {
                        if (c.m5184(c.this) != null) {
                            C2926s.m7594(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.2.1
                                public AnonymousClass1() {
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                /* renamed from: ﾒ */
                                public final void mo4950() {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    c.this.mo5168(context, c2657ao, false);
                                }
                            }, i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2883iy
            /* renamed from: ﻛ */
            public final void mo5055(C2879iu v) throws JSONException {
                /*
                    Method dump skipped, instructions count: 456
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.c.AnonymousClass2.mo5055(com.ironsource.adqualitysdk.sdk.i.iu):void");
            }

            /* renamed from: ﾇ */
            private static String m5206(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
                String str2;
                byte[] bytes = str;
                if (str != null) {
                    bytes = str.getBytes("ISO-8859-1");
                }
                byte[] bArr = bytes;
                synchronized (C2831h.f6553) {
                    try {
                        int i = iArr[0];
                        int i2 = iArr[1];
                        int i3 = iArr[2];
                        int i4 = iArr[3];
                        char[] cArr = new char[i2];
                        System.arraycopy(f4747, i, cArr, 0, i2);
                        if (bArr != null) {
                            char[] cArr2 = new char[i2];
                            C2831h.f6552 = 0;
                            char c = 0;
                            while (true) {
                                int i5 = C2831h.f6552;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (bArr[i5] == 1) {
                                    cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                                } else {
                                    cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                                }
                                c = cArr2[i5];
                                C2831h.f6552 = i5 + 1;
                            }
                            cArr = cArr2;
                        }
                        if (i4 > 0) {
                            char[] cArr3 = new char[i2];
                            System.arraycopy(cArr, 0, cArr3, 0, i2);
                            int i6 = i2 - i4;
                            System.arraycopy(cArr3, 0, cArr, i6, i4);
                            System.arraycopy(cArr3, i4, cArr, 0, i6);
                        }
                        if (z2) {
                            char[] cArr4 = new char[i2];
                            C2831h.f6552 = 0;
                            while (true) {
                                int i7 = C2831h.f6552;
                                if (i7 >= i2) {
                                    break;
                                }
                                cArr4[i7] = cArr[(i2 - i7) - 1];
                                C2831h.f6552 = i7 + 1;
                            }
                            cArr = cArr4;
                        }
                        if (i3 > 0) {
                            C2831h.f6552 = 0;
                            while (true) {
                                int i8 = C2831h.f6552;
                                if (i8 >= i2) {
                                    break;
                                }
                                cArr[i8] = (char) (cArr[i8] - iArr[2]);
                                C2831h.f6552 = i8 + 1;
                            }
                        }
                        str2 = new String(cArr);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2883iy
            /* renamed from: ﻛ */
            public final void mo5056(C2879iu c2879iu, String str) {
                int iM7124;
                if (c2879iu != null) {
                    iM7124 = c2879iu.m7123().m7124();
                    f4744 = (f4745 + 7) % 128;
                } else {
                    f4745 = (f4744 + 3) % 128;
                    iM7124 = -1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(m5206(true, new int[]{30, 34, 0, 15}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001").intern());
                sb.append(iM7124);
                C2921n.m7502(m5206(false, new int[]{0, 12, 148, 2}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern(), sb.toString());
                if (iM7124 == 403 || c.m5183(c.this) >= c.m5186(c.this)) {
                    return;
                }
                m5207(c.this.m5202());
                f4744 = (f4745 + 13) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﻛ */
        public final void mo5162(InterfaceC2662at interfaceC2662at) {
            f4716 = (f4715 + InterfaceC3173h3.d.b.f8826i) % 128;
            Handler handler = this.f4734;
            if (handler != null) {
                handler.post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.8

                    /* renamed from: ﾒ */
                    private /* synthetic */ InterfaceC2662at f4757;

                    public AnonymousClass8(InterfaceC2662at interfaceC2662at2) {
                        interfaceC2662at = interfaceC2662at2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        c.m5192(c.this, interfaceC2662at);
                        if (c.this.mo5161()) {
                            interfaceC2662at.mo4993();
                        }
                    }
                });
                f4715 = (f4716 + 17) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﻛ */
        public final boolean mo5164() {
            JSONObject jSONObjectM5175;
            int windowTouchSlop;
            int i = f4715 + 55;
            f4716 = i % 128;
            if (i % 2 == 0) {
                jSONObjectM5175 = m5175();
                windowTouchSlop = 6 >>> (ViewConfiguration.getWindowTouchSlop() >> 74);
            } else {
                jSONObjectM5175 = m5175();
                windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 127;
            }
            return jSONObjectM5175.optBoolean(m5197(null, null, windowTouchSlop, "\u0088\u0092\u0081").intern(), false);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ｋ */
        public final boolean mo5166() {
            int i = f4715 + 121;
            f4716 = i % 128;
            boolean zOptBoolean = i % 2 == 0 ? m5175().optBoolean(m5197(null, null, 11 / Color.red(0), "\u0081\u0083\u008c").intern(), false) : m5175().optBoolean(m5197(null, null, 127 - Color.red(0), "\u0081\u0083\u008c").intern(), true);
            int i2 = f4715 + 37;
            f4716 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 64 / 0;
            }
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﻛ */
        public final boolean mo5165(String str, String str2) {
            f4716 = (f4715 + 75) % 128;
            C2665aw c2665awM5187 = m5187(str);
            if (c2665awM5187 != null) {
                f4715 = (f4716 + 37) % 128;
                if (c2665awM5187.m5238(str2)) {
                    return false;
                }
            }
            int i = f4715 + InterfaceC3173h3.d.b.f8823f;
            f4716 = i % 128;
            if (i % 2 != 0) {
                return true;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﾇ */
        public final void mo5169(InterfaceC2662at interfaceC2662at) {
            int i = f4715 + InterfaceC3173h3.d.b.f8823f;
            f4716 = i % 128;
            if (i % 2 != 0) {
                Handler handler = this.f4734;
                if (handler != null) {
                    handler.post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.4

                        /* renamed from: ﻛ */
                        private /* synthetic */ InterfaceC2662at f4754;

                        public AnonymousClass4(InterfaceC2662at interfaceC2662at2) {
                            interfaceC2662at = interfaceC2662at2;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            c.m5198(c.this).add(interfaceC2662at);
                            if (c.this.mo5161()) {
                                interfaceC2662at.mo4993();
                            }
                        }
                    });
                    f4716 = (f4715 + 93) % 128;
                    return;
                }
                return;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﾇ */
        public final Map<String, C2665aw> mo5167() {
            Map<String, C2665aw> map = new HashMap<>();
            try {
                String strOptString = m5175().optString(m5197(null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0088\u0084\u0083").intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    map = C2915kc.m7439(new JSONObject(strOptString), new C2915kc.c<C2665aw>() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.6
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
                        /* renamed from: ﻛ */
                        public final /* synthetic */ C2665aw mo5208(JSONObject jSONObject, String str) {
                            return new C2665aw(jSONObject.optJSONObject(str));
                        }
                    });
                }
            } catch (JSONException e) {
                C2914kb.m7426(m5197(null, null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0085\u0093\u0092\u0091\u0090\u0096\u0081\u0087\u0090\u0082\u0081\u0095").intern(), m5193(27 - (KeyEvent.getMaxKeyCode() >> 16), 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + ModuleDescriptor.MODULE_VERSION, "\u0011\u0007￢\r\ufff2\u0011\u0010\r\u0012\u0001\u0003\f\f\r￡\u0012\u0003\u0005ﾾ\f\u0007ﾾ\u0010\r\u0010\u0010￣\u0003\n\u0000\uffff", true).intern(), (Throwable) e, false);
            }
            int i = f4716 + 113;
            f4715 = i % 128;
            if (i % 2 == 0) {
                return map;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﾒ */
        public final boolean mo5173() {
            f4715 = (f4716 + 7) % 128;
            boolean zOptBoolean = m5175().optBoolean(m5193(ExpandableListView.getPackedPositionType(0L) + 3, TextUtils.indexOf("", "") + 4, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 161, "￼\uffff\u000b\ufffa", true).intern(), true);
            int i = f4715 + 93;
            f4716 = i % 128;
            if (i % 2 != 0) {
                return zOptBoolean;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as
        /* renamed from: ﾒ */
        public final String mo5171(String str) {
            f4715 = (f4716 + 109) % 128;
            C2665aw c2665awM5187 = m5187(str);
            if (c2665awM5187 == null) {
                return null;
            }
            String strM5237 = c2665awM5187.m5237();
            int i = f4715 + 41;
            f4716 = i % 128;
            if (i % 2 != 0) {
                return strM5237;
            }
            throw null;
        }

        /* renamed from: ﾇ */
        private static void m5196(JSONObject jSONObject, long j) throws JSONException {
            f4715 = (f4716 + 13) % 128;
            if (jSONObject.has(m5193(Process.getGidForName("") + 3, View.resolveSizeAndState(0, 0, 0) + 3, (-16777043) - Color.rgb(0, 0, 0), "\u0001\u0000\u0000", false).intern())) {
                try {
                    jSONObject.put(m5193(1 - TextUtils.lastIndexOf("", '0', 0, 0), 3 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionGroup(0L) + 173, "\u0001\u0000\u0000", false).intern(), jSONObject.optLong(m5193(1 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2, 173 - TextUtils.indexOf("", "", 0), "\u0001\u0000\u0000", false).intern()) + (j / 2));
                    return;
                } catch (JSONException unused) {
                }
            }
            f4715 = (f4716 + 23) % 128;
        }

        /* renamed from: ﾒ */
        private static String m5197(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f4719;
                    int i2 = f4720;
                    if (f4717) {
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
                    if (f4718) {
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

        /* renamed from: ﾇ */
        public final void m5204(long j) {
            if (this.f4722) {
                return;
            }
            f4715 = (f4716 + 13) % 128;
            this.f4738.m7238(m5193((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, 37 - TextUtils.indexOf("", ""), 158 - TextUtils.lastIndexOf("", '0', 0, 0), "\uffde\n\t\t\u0000\ufffe\u000f\n\r\ufff0\u000b\uffff￼\u000f\u0000\uffef\u0004\b\u0000\u000e\u000f￼\b\u000b\u0007\n\t\u0002\uffc9￼\uffff\f\uffc9\u0007￼\u000e\u000f", false).intern(), String.valueOf(j));
            this.f4722 = true;
            f4716 = (f4715 + 73) % 128;
        }

        /* renamed from: ﾇ */
        private static void m5195(JSONObject jSONObject) throws JSONException {
            int i = f4716 + 93;
            f4715 = i % 128;
            C2915kc.m7433(jSONObject, jSONObject.optJSONObject(m5197(null, null, i % 2 != 0 ? 118 - (ViewConfiguration.getDoubleTapTimeout() + 21) : 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0088\u0087\u0093\u0089\u008c\u0087").intern()));
            int i2 = f4716 + 109;
            f4715 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 1 / 0;
            }
        }

        /* renamed from: ﾇ */
        private static String m5193(int i, int i2, int i3, String str, boolean z) {
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
                        cArr2[i5] = (char) (cArr2[i5] - f4721);
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

    public /* synthetic */ AbstractC2661as(byte b2) {
        this();
    }

    /* renamed from: ﻐ */
    public static synchronized AbstractC2661as m5141() {
        try {
            if (f4712 == null) {
                f4712 = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4712;
    }

    /* renamed from: リ */
    public abstract int mo5142();

    /* renamed from: ヮ */
    public abstract boolean mo5143();

    /* renamed from: ヶ */
    public abstract boolean mo5144();

    /* renamed from: 丫 */
    public abstract List mo5145();

    /* renamed from: 乁 */
    public abstract long mo5146();

    /* renamed from: 爫 */
    public abstract int mo5147();

    /* renamed from: ﬤ */
    public abstract String mo5148();

    /* renamed from: טּ */
    public abstract int mo5149();

    /* renamed from: סּ */
    public abstract void mo5150();

    /* renamed from: ףּ */
    public abstract JSONObject mo5151();

    /* renamed from: ﭖ */
    public abstract C2659aq mo5152();

    /* renamed from: ﭴ */
    public abstract C2658ap mo5153();

    /* renamed from: ﭸ */
    public abstract C2664av mo5154();

    /* renamed from: ﮉ */
    public abstract C2660ar mo5155();

    /* renamed from: ﮌ */
    public abstract String mo5156();

    /* renamed from: ﮐ */
    public abstract boolean mo5157();

    /* renamed from: ﱟ */
    public abstract double mo5158();

    /* renamed from: ﱡ */
    public abstract double mo5159();

    /* renamed from: ﺙ */
    public abstract int mo5160();

    /* renamed from: ﻏ */
    public abstract boolean mo5161();

    /* renamed from: ﻛ */
    public abstract void mo5162(InterfaceC2662at interfaceC2662at);

    /* renamed from: ﻛ */
    public abstract void mo5163(JSONObject jSONObject);

    /* renamed from: ﻛ */
    public abstract boolean mo5164();

    /* renamed from: ﻛ */
    public abstract boolean mo5165(String str, String str2);

    /* renamed from: ｋ */
    public abstract boolean mo5166();

    /* renamed from: ﾇ */
    public abstract Map<String, C2665aw> mo5167();

    /* renamed from: ﾇ */
    public abstract void mo5168(Context context, C2657ao c2657ao, boolean z);

    /* renamed from: ﾇ */
    public abstract void mo5169(InterfaceC2662at interfaceC2662at);

    /* renamed from: ﾇ */
    public abstract void mo5170(C2882ix c2882ix);

    /* renamed from: ﾒ */
    public abstract String mo5171(String str);

    /* renamed from: ﾒ */
    public abstract void mo5172(Context context, C2881iw c2881iw, C2652aj c2652aj, b bVar, boolean z);

    /* renamed from: ﾒ */
    public abstract boolean mo5173();

    private AbstractC2661as() {
    }
}
