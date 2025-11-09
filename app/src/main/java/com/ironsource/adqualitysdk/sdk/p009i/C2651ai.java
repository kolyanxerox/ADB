package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2647ae;
import com.ironsource.adqualitysdk.sdk.p009i.C2886ja;
import com.ironsource.adqualitysdk.sdk.p009i.C2890je;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ai */
/* loaded from: classes2.dex */
public final class C2651ai {

    /* renamed from: リ */
    private static short[] f4539 = null;

    /* renamed from: ヮ */
    private static int f4540 = 0;

    /* renamed from: ヶ */
    private static byte[] f4541 = {-67, 36, 47, -51, -9, -52, 45, 45, 34, -35, 38, -48, 39, -45, -39, -60, 8, -64, Utf8.REPLACEMENT_BYTE, -37, -12, 8, 36, -108, 105, -34, -110, 117, -40, 38, -37, -10, 7, -43, -43, -47, -48, -16, 48, Utf8.REPLACEMENT_BYTE, -39, 71, 115, -86, -32, Utf8.REPLACEMENT_BYTE, -28, -123, -89, -19, -126, -81, -17, 51, -26, 49, 72, 125, 39, 69, 48, 39, 58, -39, -115, 29, -22, 120, 53, 43, 69, 35, 35, 65, 25, -9, 36, -58, -49, 45, -41, 39, 22, -49, 26, 121, 90, -61, -113, 110, -55, 27, -56, -21, -109, -68, -100, -99, -105, -106, -56, -108, 13, -113, -111, -51, -97, -106, -55, -65, -105, -110, -66, 81, 1, -66, -65, -112, 86, -17, -67, -106, -117, -83, -93, 87, -5, -69, -105, -105, -58, -117, -94, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: 丫 */
    private static int f4542 = 150247227;

    /* renamed from: 乁 */
    private static int f4543 = 1;

    /* renamed from: 爫 */
    private static long f4544 = -3754559011066112028L;

    /* renamed from: טּ */
    private static int f4545 = 10;

    /* renamed from: ףּ */
    private static int f4546 = -358631162;

    /* renamed from: ﬤ */
    private String f4547;

    /* renamed from: סּ */
    private InterfaceC2924q f4548;

    /* renamed from: ﭖ */
    private Context f4549;

    /* renamed from: ﭴ */
    private C2898jm f4550;

    /* renamed from: ﭸ */
    private C2650ah f4551;

    /* renamed from: ﮉ */
    private InterfaceC2876ir f4552;

    /* renamed from: ﮐ */
    private boolean f4554;

    /* renamed from: ﱟ */
    private Handler f4555;

    /* renamed from: ﺙ */
    private boolean f4557;

    /* renamed from: ﻐ */
    private C2886ja f4559;

    /* renamed from: ﻛ */
    private C2647ae f4560;

    /* renamed from: ｋ */
    private boolean f4561;

    /* renamed from: ﾇ */
    private C2652aj f4562;

    /* renamed from: ﾒ */
    private C2881iw f4563;

    /* renamed from: ﱡ */
    private List<InterfaceC2649ag> f4556 = new ArrayList();

    /* renamed from: ﻏ */
    private List<C2890je.e> f4558 = new ArrayList();

    /* renamed from: ﮌ */
    private Thread.UncaughtExceptionHandler f4553 = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ai$4, reason: invalid class name */
    public class AnonymousClass4 implements C2647ae.b {

        /* renamed from: ﻐ */
        final /* synthetic */ List f4580;

        /* renamed from: ｋ */
        final /* synthetic */ InterfaceC2883iy f4581;

        /* renamed from: ﾇ */
        final /* synthetic */ JSONArray f4582;

        public AnonymousClass4(JSONArray jSONArray, List list, InterfaceC2883iy interfaceC2883iy) {
            this.f4582 = jSONArray;
            this.f4580 = list;
            this.f4581 = interfaceC2883iy;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2647ae.b
        public void onEventGenerated(JSONObject jSONObject) {
            C2651ai.m5026(C2651ai.this).m4991(jSONObject);
            C2651ai.m4996(C2651ai.this).m7146(C2651ai.m5005(C2651ai.this).m5077(C2651ai.m5004(C2651ai.this)), jSONObject, new InterfaceC2883iy() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5

                /* renamed from: ﱟ */
                private static int f4584 = 1;

                /* renamed from: ﱡ */
                private static int f4585 = 0;

                /* renamed from: ﻐ */
                private static boolean f4586 = true;

                /* renamed from: ﻛ */
                private static boolean f4587 = true;

                /* renamed from: ｋ */
                private static int f4588 = 96;

                /* renamed from: ﾒ */
                private static char[] f4589 = {161, 206, 193, 204, 217, 212, 201, 195, 211, 167, 207, 128, 213, 197, 210, 208, 198, 196, 165, 214, 129, 179, 205, 200, 199, 215, 142, 154};

                /* renamed from: ﾇ */
                private static String m5057(int i, int[] iArr, String str, String str2) throws UnsupportedEncodingException {
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
                            char[] cArr2 = f4589;
                            int i2 = f4588;
                            if (f4587) {
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
                            if (f4586) {
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

                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2883iy
                /* renamed from: ﻛ */
                public final void mo5055(final C2879iu c2879iu) {
                    final int iM7124 = c2879iu.m7123().m7124();
                    final String strM7125 = c2879iu.m7123().m7125();
                    if (iM7124 >= 200 && iM7124 <= 299) {
                        C2921n.m7519(m5057(126 - TextUtils.indexOf((CharSequence) "", '0'), null, null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m5057(TextUtils.getOffsetBefore("", 0) + 127, null, null, "\u0095\u0086\u0082\u008e\u0094\u0093\u0092\u0082\u008e\u0089\u008c\u008f\u008b\u0091\u008c\u008e\u0089\u0082\u008b\u0090\u0089\u008e\u008f\u008c\u0089\u0089\u008e\u0088\u0088\u008d\u0089\u008c\u0083\u008c\u0086\u008b\u008a").intern(), AnonymousClass4.this.f4582);
                        Iterator it = AnonymousClass4.this.f4580.iterator();
                        while (it.hasNext()) {
                            C2651ai.m4997(C2651ai.this).m7196(((C2648af) it.next()).m4973());
                        }
                        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5.1
                            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                            /* renamed from: ﾒ */
                            public final void mo4950() {
                                AnonymousClass4.this.f4581.mo5055(c2879iu);
                            }
                        });
                        return;
                    }
                    if (iM7124 == 403) {
                        synchronized (C2651ai.this) {
                            try {
                                for (final C2890je.e eVar : C2651ai.m4994(C2651ai.this)) {
                                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5.5
                                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                        /* renamed from: ﾒ */
                                        public final void mo4950() {
                                            eVar.mo7244();
                                        }
                                    });
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        String strIntern = m5057(Color.red(0) + 127, null, null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m5057((ViewConfiguration.getTapTimeout() >> 16) + 127, null, null, "\u008c\u009c\u008e\u0089\u0082\u008b\u0090\u0089\u008e\u008f\u008c\u0086\u008b\u008a\u008c\u009b\u0086\u0082\u008e\u0094\u0093\u0092\u0082\u008e\u0089\u008c\u0098\u0086\u0087\u009a\u008c\u0099\u0082\u008b\u008f\u009a\u008c\u0086\u0082\u008e\u009a\u008c\u0099\u0082\u0087\u0098\u0086\u008e\u0097\u008b\u0096").intern());
                        sb.append(iM7124);
                        sb.append(m5057((ViewConfiguration.getLongPressTimeout() >> 16) + 127, null, null, "\u008c").intern());
                        sb.append(strM7125);
                        C2921n.m7518(strIntern, sb.toString());
                    }
                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5.2

                        /* renamed from: ﮐ */
                        private static char f4593 = 57418;

                        /* renamed from: ﱟ */
                        private static int f4594 = 0;

                        /* renamed from: ﱡ */
                        private static int f4595 = 0;

                        /* renamed from: ﺙ */
                        private static int f4596 = 1;

                        /* renamed from: ｋ */
                        private static long f4597;

                        /* renamed from: ﾇ */
                        private static String m5058(String str, String str2, char c, String str3, int i) {
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
                                    char[] cArr4 = (char[]) cArr.clone();
                                    char[] cArr5 = (char[]) cArr2.clone();
                                    cArr4[0] = (char) (c ^ cArr4[0]);
                                    cArr5[2] = (char) (cArr5[2] + ((char) i));
                                    int length = cArr3.length;
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
                                            cArr6[i6] = (char) ((((c3 ^ cArr3[i6]) ^ f4597) ^ f4594) ^ f4593);
                                            C2885j.f6934 = i6 + 1;
                                        } else {
                                            str4 = new String(cArr6);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str4;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            InterfaceC2883iy interfaceC2883iy = AnonymousClass4.this.f4581;
                            C2879iu c2879iu2 = c2879iu;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m5058("▊娘颵ꯗ❾\uf273䱔唏ﭭ樿愌\uf11a頻状鄦\ueca3化씃㢳猥㜁ᠪ䑀ꓹユ숢佪ᐬ慇\ue1a5艖㋵䵞屫庀쟺龺钸哋䡗\ue2dbꎟ짹딣弆ੋ䴊瞧㘦ʂ긥", "\u0000\u0000\u0000\u0000", (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), "椖\u0017钚綒", (-1711270039) - TextUtils.indexOf("", "", 0, 0)).intern());
                            sb2.append(iM7124);
                            sb2.append(m5058("쉳", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37577), "ࢼ阀쩽\uec92", 2106982408 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
                            sb2.append(strM7125);
                            interfaceC2883iy.mo5056(c2879iu2, sb2.toString());
                            f4596 = (f4595 + InterfaceC3173h3.d.b.f8821d) % 128;
                        }
                    });
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2883iy
                /* renamed from: ﻛ */
                public final void mo5056(final C2879iu c2879iu, final String str) {
                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5.4
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            AnonymousClass4.this.f4581.mo5056(c2879iu, str);
                        }
                    });
                    int i = f4585 + InterfaceC3173h3.d.b.f8823f;
                    f4584 = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 96 / 0;
                    }
                }
            });
        }
    }

    public C2651ai(Context context, C2657ao c2657ao, C2652aj c2652aj, boolean z, String str, InterfaceC2924q interfaceC2924q) {
        this.f4548 = interfaceC2924q;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.2

            /* renamed from: ﻐ */
            private static int f4574 = 0;

            /* renamed from: ﻛ */
            private static char[] f4575 = {'A', 'n', 'a', 'l', 'y', 't', 'i', 'c', 's', 'U', 'u', 'g', 'h', ' ', 'e', 'x', 'p', 'o', 'T', 'r', 'b', 'k', 'B', 'C', 'D'};

            /* renamed from: ﾇ */
            private static int f4576 = 1;

            /* renamed from: ﾒ */
            private static char f4577 = 5;

            /* renamed from: ﾇ */
            private static String m5053(byte b, int i, String str2) {
                String str3;
                char[] charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (C2858i.f6710) {
                    try {
                        char[] cArr2 = f4575;
                        char c = f4577;
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
                        str3 = new String(cArr3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str3;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                f4576 = (f4574 + 21) % 128;
                C2914kb.m7422(m5053((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 67), 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b¶").intern(), m5053((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3), KeyEvent.keyCodeFromString("") + 18, "\u0006\u0004\f\u0007\u000b\f\n\u0007\u000e\n\u0011\u0005\u000b\u0013\u0006\u0007\u0010\u0002").intern(), m5053((byte) (TextUtils.getCapsMode("", 0, 0) + 80), (ViewConfiguration.getScrollBarSize() >> 8) + 9, "\u0013\u000f\u0007\f\n\u0018\u0007\f»").intern(), th);
                C2651ai.this.m5042();
                C2651ai.m5032(C2651ai.this).uncaughtException(thread, th);
                f4574 = (f4576 + 51) % 128;
            }
        });
        this.f4562 = c2652aj;
        this.f4549 = context;
        C2890je c2890je = new C2890je(context, m5017("鞐\udf37ۇ乤딅ﲣ⑃毠튇ᩣ䇅襹\uf046➭潈횥ᶕ䔻賗\uf47b㬉报\uaa5bᇰ墏", 18593 - (Process.myTid() >> 22)).intern(), m5017("鞗屖1\uf41e룼泔僧Ҝ쥩뵂愴嗾\u19cc췰뇆晶⩚Ḩ숂뛺竔⺬፹음", (ViewConfiguration.getScrollBarSize() >> 8) + 52189).intern());
        this.f4559 = new C2886ja(m5018((ViewConfiguration.getWindowTouchSlop() >> 8) + 358631162, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 150247156, (short) (ImageFormat.getBitsPerPixel(0) + 15), (-2) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (52 - TextUtils.getOffsetBefore("", 0))).intern(), m5017("鞁鉛鰓蛑肴謧", 1481 - TextUtils.getOffsetBefore("", 0)).intern(), c2890je);
        int iM5025 = m5025(c2890je);
        this.f4560 = new C2647ae(context, c2657ao, iM5025, m5019(c2890je), AbstractC2661as.m5141().mo5146());
        this.f4563 = new C2881iw(context);
        this.f4561 = false;
        HandlerThread handlerThread = new HandlerThread(m5017("鞧깘\ue43d㨛烵뛥첸ʀ奯齄픵\uebe8⇗枯", 14813 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
        handlerThread.start();
        this.f4555 = new Handler(handlerThread.getLooper());
        this.f4551 = new C2650ah(iM5025);
        this.f4554 = !z;
        this.f4547 = str;
        m5034(true);
        m5008();
    }

    /* renamed from: ﬤ */
    public static /* synthetic */ List m4994(C2651ai c2651ai) {
        int i = (f4540 + 39) % 128;
        f4543 = i;
        List<C2890je.e> list = c2651ai.f4558;
        f4540 = (i + InterfaceC3173h3.d.b.f8821d) % 128;
        return list;
    }

    /* renamed from: טּ */
    private String m4995() {
        f4540 = (f4543 + 57) % 128;
        if (!AbstractC2661as.m5141().mo5157()) {
            return m5000().m5135();
        }
        String strM5133 = m5000().m5133();
        int i = f4540 + 75;
        f4543 = i % 128;
        if (i % 2 == 0) {
            int i2 = 98 / 0;
        }
        return strM5133;
    }

    /* renamed from: סּ */
    public static /* synthetic */ C2881iw m4996(C2651ai c2651ai) {
        int i = (f4540 + 63) % 128;
        f4543 = i;
        C2881iw c2881iw = c2651ai.f4563;
        int i2 = i + 83;
        f4540 = i2 % 128;
        if (i2 % 2 == 0) {
            return c2881iw;
        }
        throw null;
    }

    /* renamed from: ﭖ */
    public static /* synthetic */ C2886ja m4997(C2651ai c2651ai) {
        int i = f4540;
        f4543 = (i + 65) % 128;
        C2886ja c2886ja = c2651ai.f4559;
        f4543 = (i + 73) % 128;
        return c2886ja;
    }

    /* renamed from: ﭴ */
    public static /* synthetic */ C2647ae m4999(C2651ai c2651ai) {
        int i = (f4540 + 29) % 128;
        f4543 = i;
        C2647ae c2647ae = c2651ai.f4560;
        int i2 = i + 29;
        f4540 = i2 % 128;
        if (i2 % 2 == 0) {
            return c2647ae;
        }
        throw null;
    }

    /* renamed from: ﭸ */
    public static /* synthetic */ int m5001(C2651ai c2651ai) {
        int i = f4540 + 33;
        f4543 = i % 128;
        if (i % 2 == 0) {
            c2651ai.m5003();
            throw null;
        }
        int iM5003 = c2651ai.m5003();
        int i2 = f4543 + 1;
        f4540 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return iM5003;
    }

    /* renamed from: ﮉ */
    public static /* synthetic */ String m5004(C2651ai c2651ai) {
        int i = f4543 + 41;
        f4540 = i % 128;
        if (i % 2 != 0) {
            c2651ai.m4995();
            throw null;
        }
        String strM4995 = c2651ai.m4995();
        f4540 = (f4543 + 5) % 128;
        return strM4995;
    }

    /* renamed from: ﮌ */
    public static /* synthetic */ C2652aj m5005(C2651ai c2651ai) {
        int i = f4543;
        f4540 = (i + 59) % 128;
        C2652aj c2652aj = c2651ai.f4562;
        int i2 = i + 23;
        f4540 = i2 % 128;
        if (i2 % 2 == 0) {
            return c2652aj;
        }
        throw null;
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ Handler m5007(C2651ai c2651ai) {
        int i = f4543;
        f4540 = (i + 63) % 128;
        Handler handler = c2651ai.f4555;
        f4540 = (i + 71) % 128;
        return handler;
    }

    /* renamed from: ﱟ */
    public static /* synthetic */ void m5010(C2651ai c2651ai) {
        int i = f4543 + 67;
        f4540 = i % 128;
        int i2 = i % 2;
        c2651ai.m5011();
        if (i2 != 0) {
            throw null;
        }
        f4540 = (f4543 + 119) % 128;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ void m5012(C2651ai c2651ai) {
        int i = f4540 + 35;
        f4543 = i % 128;
        if (i % 2 == 0) {
            c2651ai.m5024(false);
        } else {
            c2651ai.m5024(true);
        }
        int i2 = f4543 + 11;
        f4540 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
    }

    /* renamed from: ﺙ */
    public static /* synthetic */ void m5014(C2651ai c2651ai) {
        int i = f4540 + 91;
        f4543 = i % 128;
        int i2 = i % 2;
        c2651ai.m4998();
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻏ */
    public static /* synthetic */ void m5015(C2651ai c2651ai) {
        int i = f4543 + 7;
        f4540 = i % 128;
        int i2 = i % 2;
        c2651ai.m5030(false);
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ InterfaceC2924q m5016(C2651ai c2651ai) {
        int i = f4540 + 119;
        f4543 = i % 128;
        int i2 = i % 2;
        InterfaceC2924q interfaceC2924q = c2651ai.f4548;
        if (i2 != 0) {
            return interfaceC2924q;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5020(C2651ai c2651ai) {
        f4543 = (f4540 + 17) % 128;
        c2651ai.m5009();
        f4543 = (f4540 + 61) % 128;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ C2650ah m5026(C2651ai c2651ai) {
        int i = f4540;
        f4543 = (i + 79) % 128;
        C2650ah c2650ah = c2651ai.f4551;
        int i2 = i + 55;
        f4543 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
        return c2650ah;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Thread.UncaughtExceptionHandler m5032(C2651ai c2651ai) {
        int i = f4543 + 61;
        int i2 = i % 128;
        f4540 = i2;
        int i3 = i % 2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c2651ai.f4553;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        f4543 = (i2 + 3) % 128;
        return uncaughtExceptionHandler;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m5035(C2651ai c2651ai) {
        f4540 = (f4543 + 89) % 128;
        c2651ai.m5034(false);
        f4543 = (f4540 + 17) % 128;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ai$3, reason: invalid class name */
    public class AnonymousClass3 implements InterfaceC2883iy, C2886ja.d {
        public AnonymousClass3() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2886ja.d
        /* renamed from: ﻐ */
        public final void mo5054(List<C2889jd> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<C2889jd> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new C2648af(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (C2648af c2648af = (C2648af) priorityQueue.poll(); c2648af != null; c2648af = (C2648af) priorityQueue.poll()) {
                            if (C2651ai.m5039(C2651ai.this, c2648af)) {
                                if (TextUtils.isEmpty(c2648af.m4976())) {
                                    c2648af.m4975(C2651ai.m4999(C2651ai.this).m7326().m5114());
                                }
                                arrayList.add(c2648af);
                            } else {
                                C2651ai.m4997(C2651ai.this).m7196(c2648af.m4973());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        C2651ai.m5021(C2651ai.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    C2651ai.m5015(C2651ai.this);
                    return;
                }
            }
            C2651ai.m5015(C2651ai.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2883iy
        /* renamed from: ﻛ */
        public final void mo5055(C2879iu c2879iu) {
            C2651ai.m5015(C2651ai.this);
            C2651ai.m5035(C2651ai.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2883iy
        /* renamed from: ﻛ */
        public final void mo5056(C2879iu c2879iu, String str) {
            C2651ai.m5015(C2651ai.this);
        }
    }

    /* renamed from: ﭖ */
    private synchronized void m4998() {
        try {
            if (m5002()) {
                f4543 = (f4540 + 109) % 128;
                if (!TextUtils.isEmpty(this.f4560.m7326().m5114()) && !m5006()) {
                    m5030(true);
                    C2921n.m7518(m5017("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19374 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m5018(358631271 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.resolveSize(0, 0) - 150247144, (short) ((-41) - (ViewConfiguration.getEdgeSlop() >> 16)), 15 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (107 - Color.argb(0, 0, 0, 0))).intern());
                    this.f4559.m7193(m5000().m5140(), new AnonymousClass3());
                    f4540 = (f4543 + 5) % 128;
                }
            }
            f4543 = (f4540 + 21) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﭴ */
    private synchronized C2660ar m5000() {
        int i = f4540 + 31;
        f4543 = i % 128;
        if (i % 2 == 0) {
            AbstractC2661as.m5141().mo5155();
            throw null;
        }
        return AbstractC2661as.m5141().mo5155();
    }

    /* renamed from: ﭸ */
    private synchronized boolean m5002() {
        boolean z;
        try {
            int i = f4540 + 99;
            int i2 = i % 128;
            f4543 = i2;
            if (i % 2 == 0) {
                z = this.f4561;
                int i3 = 41 / 0;
            } else {
                z = this.f4561;
            }
            f4540 = (i2 + 83) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* renamed from: ﮉ */
    private int m5003() {
        int i = f4540 + 55;
        f4543 = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
            if (m5000() == null) {
                return 100;
            }
        } else if (m5000() == null) {
            return 100;
        }
        if (AbstractC2661as.m5141().mo5157()) {
            return 100;
        }
        int i3 = f4543 + 107;
        f4540 = i3 % 128;
        if (i3 % 2 == 0) {
            return m5000().m5139();
        }
        m5000().m5139();
        throw null;
    }

    /* renamed from: ﮌ */
    private synchronized boolean m5006() {
        int i = f4540 + 15;
        f4543 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        return this.f4557;
    }

    /* renamed from: ﮐ */
    private void m5008() {
        this.f4552 = new InterfaceC2876ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2876ir
            /* renamed from: ｋ */
            public final void mo5050() {
                C2651ai.m5020(C2651ai.this);
            }
        };
        this.f4563.m7145().m7177(this.f4552);
        this.f4550 = new C2898jm(new InterfaceC2900jo() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7

            /* renamed from: ﻐ */
            private static int f4614 = 0;

            /* renamed from: ﻛ */
            private static long f4615 = 799436707019204526L;

            /* renamed from: ﾇ */
            private static int f4616 = 1;

            /* renamed from: ﻐ */
            public static /* synthetic */ JSONObject m5062(Activity activity) throws JSONException {
                int i = f4616 + 23;
                f4614 = i % 128;
                if (i % 2 == 0) {
                    return m5063(activity);
                }
                m5063(activity);
                throw null;
            }

            /* renamed from: ﾇ */
            private static JSONObject m5063(Activity activity) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(m5061("\ue5d9\ue5b8彋屖\uf886덹\u137e笀뺍ﴏ䐽", (-1) - ImageFormat.getBitsPerPixel(0)).intern(), activity.getClass().getName());
                    f4616 = (f4614 + InterfaceC3173h3.d.b.f8826i) % 128;
                    return jSONObject;
                } catch (JSONException unused) {
                    C2921n.m7509(m5061("韵鞴ȣ蕋ꗣࢄ쩶ऴ\ue3f1␋橃￢꫶", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), m5061("鱁鰄䫺忍\ued26獫უʋꭠﺖᆨ萎ꅕࡑ鱁뀓䁉溑㬄坈\ue6c8쿞\udab6\uf590薠ⱀ硹铍⑼늽", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern());
                    return jSONObject;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2900jo
            /* renamed from: ﻛ */
            public final void mo5064(final Activity activity) {
                C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7.4

                    /* renamed from: ﱟ */
                    private static char f4623 = 40980;

                    /* renamed from: ﱡ */
                    private static int f4624 = 1;

                    /* renamed from: ﻏ */
                    private static int f4625 = 0;

                    /* renamed from: ﻐ */
                    private static char f4626 = 2472;

                    /* renamed from: ｋ */
                    private static char f4627 = 23007;

                    /* renamed from: ﾇ */
                    private static char f4628 = 62074;

                    /* renamed from: ｋ */
                    private static String m5067(String str, int i) {
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
                                            char c = cArr3[1];
                                            char c2 = cArr3[0];
                                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f4628)) ^ ((c2 >>> 5) + f4623)));
                                            cArr3[1] = c3;
                                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f4626) ^ ((c3 + i3) ^ ((c3 << 4) + f4627))));
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

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        f4625 = (f4624 + 95) % 128;
                        C2651ai.m5016(C2651ai.this).onEvent(m5067("১⤆\ue650췧澙鳛ᝦ涗\ua6fa\udadc", 10 - View.resolveSize(0, 0)).intern());
                        C2651ai.this.m5048(m5067("১⤆\ue650췧澙鳛ᝦ涗\ua6fa\udadc", TextUtils.getTrimmedLength("") + 10).intern(), AnonymousClass7.m5062(activity));
                        int i = f4624 + 43;
                        f4625 = i % 128;
                        if (i % 2 != 0) {
                            throw null;
                        }
                    }
                });
                f4616 = (f4614 + 29) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2900jo
            /* renamed from: ﾒ */
            public final void mo5065(final Activity activity) {
                C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7.1

                    /* renamed from: ﻛ */
                    private static int f4618 = 0;

                    /* renamed from: ﾇ */
                    private static int f4619 = 1;

                    /* renamed from: ﾒ */
                    private static int f4620 = 138;

                    /* renamed from: ｋ */
                    private static String m5066(String str, boolean z, int i, int i2, int i3) {
                        String str2;
                        char[] charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = charArray;
                        synchronized (C2669b.f5039) {
                            try {
                                char[] cArr2 = new char[i];
                                C2669b.f5040 = 0;
                                while (true) {
                                    int i4 = C2669b.f5040;
                                    if (i4 >= i) {
                                        break;
                                    }
                                    C2669b.f5038 = cArr[i4];
                                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i2);
                                    int i5 = C2669b.f5040;
                                    cArr2[i5] = (char) (cArr2[i5] - f4620);
                                    C2669b.f5040 = i5 + 1;
                                }
                                if (i3 > 0) {
                                    C2669b.f5041 = i3;
                                    char[] cArr3 = new char[i];
                                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                                    int i6 = C2669b.f5041;
                                    System.arraycopy(cArr3, 0, cArr2, i - i6, i6);
                                    int i7 = C2669b.f5041;
                                    System.arraycopy(cArr3, i7, cArr2, 0, i - i7);
                                }
                                if (z) {
                                    char[] cArr4 = new char[i];
                                    C2669b.f5040 = 0;
                                    while (true) {
                                        int i8 = C2669b.f5040;
                                        if (i8 >= i) {
                                            break;
                                        }
                                        cArr4[i8] = cArr2[(i - i8) - 1];
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

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        f4619 = (f4618 + 79) % 128;
                        C2651ai.m5016(C2651ai.this).onEvent(m5066("\b\ufff4\u0007\ufffa\b\t\u0004\u0007\ufffa\ufff9\ufffb\u0004\ufff8\n", false, 14 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 244, View.resolveSize(0, 0) + 10).intern());
                        C2651ai.this.m5048(m5066("\b\ufff4\u0007\ufffa\b\t\u0004\u0007\ufffa\ufff9\ufffb\u0004\ufff8\n", false, 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 245, TextUtils.getOffsetAfter("", 0) + 10).intern(), AnonymousClass7.m5062(activity));
                        f4618 = (f4619 + 21) % 128;
                    }
                });
                f4616 = (f4614 + 63) % 128;
            }

            /* renamed from: ﻐ */
            private static String m5061(String str, int i) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (C2777f.f6322) {
                    try {
                        char[] cArrM6790 = C2777f.m6790(f4615, cArr, i);
                        C2777f.f6321 = 4;
                        while (true) {
                            int i2 = C2777f.f6321;
                            if (i2 < cArrM6790.length) {
                                C2777f.f6320 = i2 - 4;
                                cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f4615));
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
        });
        AbstractC2894ji.m7268().m7271(new AbstractC2891jf() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
            /* renamed from: ﻛ */
            public final void mo5068(Activity activity) {
                C2651ai.m5010(C2651ai.this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
            /* renamed from: ｋ */
            public final void mo5069(Activity activity) {
                C2651ai.this.m5042();
            }
        });
        AbstractC2661as.m5141().mo5169(new InterfaceC2662at() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.14
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2662at
            /* renamed from: ﾒ */
            public final void mo4993() {
                C2651ai.m5012(C2651ai.this);
            }
        });
        int i = f4543 + InterfaceC3173h3.d.b.f8823f;
        f4540 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﱟ */
    private void m5009() {
        int i = f4543 + 43;
        f4540 = i % 128;
        m5034(i % 2 != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: ﱡ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5011() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2651ai.f4540
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2651ai.f4543 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L16
            boolean r0 = r3.f4554
            r2 = 38
            int r2 = r2 / r1
            r2 = 1
            if (r0 == r2) goto L1a
            goto L25
        L16:
            boolean r0 = r3.f4554
            if (r0 == 0) goto L25
        L1a:
            r3.m5047()
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2651ai.f4543
            int r0 = r0 + 97
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2651ai.f4540 = r0
        L25:
            r3.f4554 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2651ai.m5011():void");
    }

    /* renamed from: ﺙ */
    private void m5013() {
        f4543 = (f4540 + 27) % 128;
        if (this.f4552 != null) {
            this.f4563.m7145().m7180(this.f4552);
        }
        this.f4550.m7305();
        this.f4550 = null;
        f4543 = (f4540 + 79) % 128;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5021(C2651ai c2651ai, List list, InterfaceC2883iy interfaceC2883iy) throws JSONException {
        int i = f4543 + InterfaceC3173h3.d.b.f8823f;
        f4540 = i % 128;
        int i2 = i % 2;
        c2651ai.m5036((List<C2648af>) list, interfaceC2883iy);
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m5028(C2651ai c2651ai, JSONObject jSONObject, AbstractRunnableC2878it abstractRunnableC2878it) {
        int i = f4540 + 17;
        f4543 = i % 128;
        int i2 = i % 2;
        c2651ai.m5023(jSONObject, abstractRunnableC2878it);
        if (i2 == 0) {
            int i3 = 5 / 0;
        }
        f4540 = (f4543 + 17) % 128;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ boolean m5039(C2651ai c2651ai, C2648af c2648af) {
        f4543 = (f4540 + 23) % 128;
        boolean zM5038 = c2651ai.m5038(c2648af);
        f4543 = (f4540 + 71) % 128;
        return zM5038;
    }

    /* renamed from: ﻏ */
    public final String m5040() {
        String strM5019 = m5019(new C2890je(this.f4549, m5017("鞐\udf37ۇ乤딅ﲣ⑃毠튇ᩣ䇅襹\uf046➭潈횥ᶕ䔻賗\uf47b㬉报\uaa5bᇰ墏", 18592 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), m5017("鞗屖1\uf41e룼泔僧Ҝ쥩뵂愴嗾\u19cc췰뇆晶⩚Ḩ숂뛺竔⺬፹음", 52189 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()));
        f4543 = (f4540 + 119) % 128;
        return strM5019;
    }

    /* renamed from: ﻐ */
    public final void m5041() {
        synchronized (this) {
            try {
                Handler handler = this.f4555;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                m5034(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾇ */
    public final void m5047() {
        C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.6

            /* renamed from: ﻐ */
            private static int[] f4610 = {1474598743, 1914610265, 1634236885, 1574818424, 947208223, -2080604357, 1174119990, 1367281495, -641165346, 157301556, -1596801094, 101247352, -1717506258, 1114522566, -839232188, -1927796726, -473849871, -272674303};

            /* renamed from: ｋ */
            private static int f4611 = 0;

            /* renamed from: ﾒ */
            private static int f4612 = 1;

            /* renamed from: ﻐ */
            private static String m5060(int[] iArr, int i) {
                String str;
                synchronized (C2723d.f5953) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f4610.clone();
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

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2651ai.m5016(C2651ai.this).onEvent(m5060(new int[]{-1125590518, 1805723236, 460382547, 1536734548, -769832624, 1604549817, 778288372, 1590502897}, 13 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
                C2651ai.this.m5048(m5060(new int[]{-1125590518, 1805723236, 460382547, 1536734548, -769832624, 1604549817, 778288372, 1590502897}, Color.red(0) + 13).intern(), new JSONObject());
                f4611 = (f4612 + 65) % 128;
            }
        });
        f4543 = (f4540 + 5) % 128;
    }

    /* renamed from: ﻛ */
    private synchronized void m5024(boolean z) {
        try {
            int i = f4543 + 19;
            f4540 = i % 128;
            if (i % 2 != 0) {
                this.f4561 = true;
                m5034(false);
            } else {
                this.f4561 = true;
                m5034(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ boolean m5031(C2651ai c2651ai, int i) {
        f4543 = (f4540 + 9) % 128;
        boolean zM5037 = c2651ai.m5037(i);
        f4543 = (f4540 + 1) % 128;
        return zM5037;
    }

    /* renamed from: ﾇ */
    public final void m5048(String str, JSONObject jSONObject) {
        int i = f4543 + InterfaceC3173h3.d.b.f8819b;
        f4540 = i % 128;
        int i2 = i % 2;
        m5022(str, jSONObject, (JSONObject) null);
        if (i2 != 0) {
            int i3 = 42 / 0;
        }
    }

    /* renamed from: ﾒ */
    public final void m5049() {
        C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5

            /* renamed from: ﻛ */
            private static int f4606 = 0;

            /* renamed from: ﾇ */
            private static int f4607 = 1;

            /* renamed from: ﾒ */
            private static long f4608 = -452148896423034100L;

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2651ai.m5016(C2651ai.this).onEvent(m5059("瞑ᮗ知\ud8eb졐燐丗낹範퓘婫곥澔삕噌", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern());
                C2651ai.this.m5048(m5059("瞑ᮗ知\ud8eb졐燐丗낹範퓘婫곥澔삕噌", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new JSONObject());
                f4606 = (f4607 + 85) % 128;
            }

            /* renamed from: ﾒ */
            private static String m5059(String str, int i) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (C2777f.f6322) {
                    try {
                        char[] cArrM6790 = C2777f.m6790(f4608, cArr, i);
                        C2777f.f6321 = 4;
                        while (true) {
                            int i2 = C2777f.f6321;
                            if (i2 < cArrM6790.length) {
                                C2777f.f6320 = i2 - 4;
                                cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f4608));
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
        });
        f4543 = (f4540 + 67) % 128;
    }

    /* renamed from: ﾇ */
    private synchronized void m5034(final boolean z) {
        this.f4559.m7194(new C2886ja.e() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.13
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2886ja.e
            /* renamed from: ﾇ */
            public final void mo5051(int i) {
                C2651ai.m5007(C2651ai.this).removeCallbacksAndMessages(null);
                C2651ai.m5007(C2651ai.this).postDelayed(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.13.3

                    /* renamed from: ﻛ */
                    private static int f4569 = 0;

                    /* renamed from: ｋ */
                    private static long f4570 = 3457255484627974385L;

                    /* renamed from: ﾒ */
                    private static int f4571 = 1;

                    /* renamed from: ﾇ */
                    private static String m5052(String str, int i2) {
                        String str2;
                        char[] charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = charArray;
                        synchronized (C2777f.f6322) {
                            try {
                                char[] cArrM6790 = C2777f.m6790(f4570, cArr, i2);
                                C2777f.f6321 = 4;
                                while (true) {
                                    int i3 = C2777f.f6321;
                                    if (i3 < cArrM6790.length) {
                                        C2777f.f6320 = i3 - 4;
                                        cArrM6790[i3] = (char) ((cArrM6790[i3] ^ cArrM6790[i3 % 4]) ^ (r2 * f4570));
                                        C2777f.f6321 = i3 + 1;
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

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        int i2 = f4571 + 93;
                        f4569 = i2 % 128;
                        try {
                            if (i2 % 2 != 0) {
                                C2651ai.m5014(C2651ai.this);
                                throw null;
                            }
                            C2651ai.m5014(C2651ai.this);
                            f4569 = (f4571 + 33) % 128;
                        } catch (Throwable th) {
                            C2921n.m7521(m5052("혜홝뉬ゔ쫳섗⧟䍠㖡防ᓘ末ᇧ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m5052("惴悱翴偍ݷꇝʀ格荂寢琈䱲꜒䝪ᣞサ쯟⍪㲖ᓩ\uef81༘⅛\ufb10ሀ\uecd4씙\udf48㘁죞\ue9c4쎊嫋둒趆", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1).intern(), th);
                            C2651ai.m5015(C2651ai.this);
                        }
                    }
                }, (C2651ai.m5031(C2651ai.this, i) || z) ? 0L : C2651ai.m5001(C2651ai.this));
            }
        });
        f4540 = (f4543 + 71) % 128;
    }

    /* renamed from: ﾒ */
    private boolean m5037(int i) {
        int i2 = f4540 + 13;
        f4543 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
            if (i >= m5000().m5140()) {
                return true;
            }
        } else if (i >= m5000().m5140()) {
            return true;
        }
        f4543 = (f4540 + 119) % 128;
        return false;
    }

    /* renamed from: ｋ */
    public final synchronized void m5045() {
        try {
            this.f4561 = false;
            Handler handler = this.f4555;
            if (handler != null) {
                int i = f4540 + 31;
                f4543 = i % 128;
                if (i % 2 == 0) {
                    handler.removeCallbacksAndMessages(null);
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
            }
            this.f4563.m7144();
            m5013();
            int i2 = f4543 + 51;
            f4540 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 63 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﾇ */
    private void m5033(JSONObject jSONObject) {
        f4543 = (f4540 + 11) % 128;
        Iterator<String> it = m5000().m5137().iterator();
        while (it.hasNext()) {
            int i = f4543 + 73;
            f4540 = i % 128;
            if (i % 2 != 0) {
                jSONObject.remove(it.next());
                throw null;
            }
            jSONObject.remove(it.next());
        }
    }

    /* renamed from: ﾒ */
    private boolean m5038(C2648af c2648af) {
        f4543 = (f4540 + 85) % 128;
        boolean zMo5165 = AbstractC2661as.m5141().mo5165(c2648af.m4972(), this.f4547);
        f4540 = (f4543 + InterfaceC3173h3.d.b.f8819b) % 128;
        return zMo5165;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[EXC_TOP_SPLITTER, PHI: r2 r6
  0x005d: PHI (r2v9 com.ironsource.adqualitysdk.sdk.i.af) = (r2v8 com.ironsource.adqualitysdk.sdk.i.af), (r2v13 com.ironsource.adqualitysdk.sdk.i.af) binds: [B:11:0x005b, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r6v1 org.json.JSONObject) = (r6v0 org.json.JSONObject), (r6v3 org.json.JSONObject) binds: [B:11:0x005b, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5036(java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2648af> r10, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2883iy r11) throws org.json.JSONException {
        /*
            r9 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r1 = r10.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L94
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2651ai.f4543
            int r2 = r2 + 57
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2651ai.f4540 = r3
            int r2 = r2 % 2
            r3 = 1
            java.lang.String r4 = "鞀\ue321绵"
            r5 = 0
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            com.ironsource.adqualitysdk.sdk.i.af r2 = (com.ironsource.adqualitysdk.sdk.p009i.C2648af) r2
            org.json.JSONObject r6 = r2.m4971()
            r7 = 2082(0x822, float:2.918E-42)
            int r8 = android.view.KeyEvent.getDeadChar(r3, r3)
            int r7 = r7 >>> r8
            java.lang.String r7 = m5017(r4, r7)
            java.lang.String r7 = r7.intern()
            boolean r7 = r6.has(r7)
            if (r7 != 0) goto L74
            goto L5d
        L3f:
            java.lang.Object r2 = r1.next()
            com.ironsource.adqualitysdk.sdk.i.af r2 = (com.ironsource.adqualitysdk.sdk.p009i.C2648af) r2
            org.json.JSONObject r6 = r2.m4971()
            int r7 = android.view.KeyEvent.getDeadChar(r5, r5)
            int r7 = r7 + 29873
            java.lang.String r7 = m5017(r4, r7)
            java.lang.String r7 = r7.intern()
            boolean r7 = r6.has(r7)
            if (r7 != 0) goto L74
        L5d:
            int r5 = android.view.View.combineMeasuredStates(r5, r5)     // Catch: org.json.JSONException -> L74
            int r5 = r5 + 29873
            java.lang.String r4 = m5017(r4, r5)     // Catch: org.json.JSONException -> L74
            java.lang.String r4 = r4.intern()     // Catch: org.json.JSONException -> L74
            java.lang.String r5 = com.ironsource.adqualitysdk.sdk.p009i.C2869ik.f6832     // Catch: org.json.JSONException -> L74
            long r7 = r6.optLong(r5)     // Catch: org.json.JSONException -> L74
            r6.put(r4, r7)     // Catch: org.json.JSONException -> L74
        L74:
            com.ironsource.adqualitysdk.sdk.i.ah r4 = r9.f4551
            boolean r4 = r4.m4991(r6)
            if (r4 == r3) goto L7d
            goto L8f
        L7d:
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2651ai.f4540
            int r3 = r3 + 7
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2651ai.f4543 = r3
            com.ironsource.adqualitysdk.sdk.i.ja r3 = r9.f4559
            com.ironsource.adqualitysdk.sdk.i.jd r2 = r2.m4973()
            r4 = 0
            r3.m7195(r2, r4)
        L8f:
            r0.put(r6)
            goto L9
        L94:
            com.ironsource.adqualitysdk.sdk.i.ae r1 = r9.f4560
            com.ironsource.adqualitysdk.sdk.i.iw r2 = r9.f4563
            com.ironsource.adqualitysdk.sdk.i.iz r2 = r2.m7145()
            boolean r2 = r2.m7181()
            com.ironsource.adqualitysdk.sdk.i.ai$4 r3 = new com.ironsource.adqualitysdk.sdk.i.ai$4
            r3.<init>(r0, r10, r11)
            r1.m4960(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2651ai.m5036(java.util.List, com.ironsource.adqualitysdk.sdk.i.iy):void");
    }

    /* renamed from: ﻐ */
    private static String m5017(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f4544);
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

    /* renamed from: ﻛ */
    public final synchronized void m5043(InterfaceC2649ag interfaceC2649ag) {
        int i = f4540 + 125;
        f4543 = i % 128;
        if (i % 2 == 0) {
            this.f4556.add(interfaceC2649ag);
            throw null;
        }
        this.f4556.add(interfaceC2649ag);
        f4543 = (f4540 + 35) % 128;
    }

    /* renamed from: ﻛ */
    public final void m5042() {
        f4543 = (f4540 + 13) % 128;
        try {
            this.f4554 = true;
            m5049();
            m5041();
            int i = f4540 + InterfaceC3173h3.d.b.f8819b;
            f4543 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (Exception e) {
            C2914kb.m7426(m5017("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19373 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m5018((ViewConfiguration.getKeyRepeatDelay() >> 16) + 358631169, View.MeasureSpec.makeMeasureSpec(0, 0) - 150247158, (short) ((-128) - (ViewConfiguration.getEdgeSlop() >> 16)), 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (Gravity.getAbsoluteGravity(0, 0) + 91)).intern(), (Throwable) e, false);
        }
    }

    /* renamed from: ｋ */
    public final synchronized void m5046(C2890je.e eVar) {
        f4540 = (f4543 + 75) % 128;
        this.f4558.add(eVar);
        f4540 = (f4543 + 51) % 128;
    }

    /* renamed from: ｋ */
    public static JSONObject m5027(String str, String str2, String str3, String str4, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(m5017("鞁̣뻺⦚앗", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38068).intern(), str);
            jSONObject2.put(m5017("鞁㨷쳋齴ℇ", 44449 - TextUtils.indexOf("", "", 0, 0)).intern(), str2);
            jSONObject2.put(m5017("鞁쇧㭥铘칄➴", 22129 - View.MeasureSpec.getSize(0)).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                f4540 = (f4543 + InterfaceC3173h3.d.b.f8821d) % 128;
                jSONObject2.put(m5018((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 358631193, (-150247126) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((-106) - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf((CharSequence) "", '0') - 4, (byte) (105 - ExpandableListView.getPackedPositionChild(0L))).intern(), str4);
                f4543 = (f4540 + 77) % 128;
            }
            if (jSONObject != null) {
                f4543 = (f4540 + 45) % 128;
                C2915kc.m7433(jSONObject2, jSONObject);
                f4543 = (f4540 + InterfaceC3173h3.d.b.f8821d) % 128;
            }
        } catch (JSONException e) {
            C2921n.m7506(m5017("鞥\udc27ß璏뤩\uedf1冃蘼쫿", (ViewConfiguration.getWindowTouchSlop() >> 8) + 19373).intern(), m5017("鞡⛯\uf564菠割\ue099뽓䷏᱈\uaacc礰㞰왨钤⌈\uf181耛废\ued46뱲䫵\u197aퟱ晚㓛썐", 45433 - TextUtils.getOffsetBefore("", 0)).intern(), e);
        }
        f4543 = (f4540 + 123) % 128;
        return jSONObject2;
    }

    /* renamed from: ﻛ */
    private void m5022(String str, JSONObject jSONObject, JSONObject jSONObject2) throws Throwable {
        f4543 = (f4540 + 89) % 128;
        m5044(str, jSONObject, jSONObject2, null);
        f4540 = (f4543 + 117) % 128;
    }

    /* renamed from: ﻛ */
    public final void m5044(String str, JSONObject jSONObject, JSONObject jSONObject2, final AbstractRunnableC2878it abstractRunnableC2878it) throws Throwable {
        String strIntern = m5017("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19373 - View.MeasureSpec.getMode(0)).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(m5018(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 358631199, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 150247144, (short) (ExpandableListView.getPackedPositionGroup(0L) + InterfaceC3173h3.d.b.f8827j), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 89)).intern());
        sb.append(str);
        sb.append(m5017("韄\ueb46渧\ue1ef擘\ue7ed筿﹏焸\uf4eb矗쫣乱셛䐤쟰媎", ExpandableListView.getPackedPositionType(0L) + 31957).intern());
        C2921n.m7519(strIntern, sb.toString(), jSONObject);
        try {
            if (m5000().m5136().contains(str)) {
                String strIntern2 = m5017("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19373 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m5017("鞪歠湆愅搻朖稈緭烕珉皭䧝䲅䁽䍛䙏夠屟引勼嗌⣋⯶⺗\u218d╺㡟㬗㹰", View.resolveSizeAndState(0, 0, 0) + 64747).intern());
                sb2.append(str);
                sb2.append(m5018(358631219 - View.getDefaultSize(0, 0), (-150247196) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) ((-49) - Color.red(0)), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((-6) - MotionEvent.axisFromString(""))).intern());
                C2921n.m7518(strIntern2, sb2.toString());
                return;
            }
            String strIntern3 = m5017("鞥\udc27ß璏뤩\uedf1冃蘼쫿", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19372).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m5017("鞰⤛\uea87갪涾⽂\ue08aꉋ揣┱\ue615ꞎ礖㪩ﱲ뷂罂ボ\uf260돧瓀㘂\uf793褻䪴ఁ췘轚䃥ɸ썘蓗", 48781 - KeyEvent.keyCodeFromString("")).intern());
            sb3.append(str);
            C2921n.m7518(strIntern3, sb3.toString());
            this.f4560.m4961(str, jSONObject, jSONObject2, this.f4563.m7145().m7181(), new C2647ae.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.9
                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2647ae.b
                public void onEventGenerated(JSONObject jSONObject3) {
                    C2651ai.m5026(C2651ai.this).m4991(jSONObject3);
                    C2651ai.m5028(C2651ai.this, jSONObject3, new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.9.3

                        /* renamed from: ﱡ */
                        private static int f4634 = 1;

                        /* renamed from: ﻏ */
                        private static int f4635 = 0;

                        /* renamed from: ﻐ */
                        private static boolean f4636 = true;

                        /* renamed from: ﻛ */
                        private static int f4637 = 229;

                        /* renamed from: ｋ */
                        private static char[] f4638 = {294, 339, 326, 337, 350, 345, 334, 328, 344, 298, 343, 340, 261, 330, 329, 347, 287, 296, 338, 341};

                        /* renamed from: ﾇ */
                        private static boolean f4639 = true;

                        /* renamed from: ﻐ */
                        private static String m5070(int i, int[] iArr, String str2, String str3) throws UnsupportedEncodingException {
                            byte[] bytes = str3;
                            if (str3 != null) {
                                bytes = str3.getBytes("ISO-8859-1");
                            }
                            byte[] bArr = bytes;
                            char[] charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = charArray;
                            synchronized (C2922o.f7244) {
                                try {
                                    char[] cArr2 = f4638;
                                    int i2 = f4637;
                                    if (f4636) {
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
                                    if (f4639) {
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

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2651ai.m5035(C2651ai.this);
                            AbstractRunnableC2878it abstractRunnableC2878it2 = abstractRunnableC2878it;
                            if (abstractRunnableC2878it2 != null) {
                                int i = f4635 + 13;
                                f4634 = i % 128;
                                try {
                                    if (i % 2 != 0) {
                                        abstractRunnableC2878it2.mo4950();
                                        return;
                                    } else {
                                        abstractRunnableC2878it2.mo4950();
                                        int i2 = 57 / 0;
                                        return;
                                    }
                                } catch (Exception e) {
                                    C2914kb.m7429(m5070(127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m5070(127 - Gravity.getAbsoluteGravity(0, 0), null, null, "\u0082\u008c\u0087\u0086\u008e\u0084\u0094\u0093\u008c\u0092\u0082\u008c\u008d\u0091\u0086\u0082\u008e\u0090\u008a\u008f\u0082\u008e\u0089\u008d\u0082\u0087\u008d\u008b\u008c\u008b\u008b\u008a").intern(), e, false, false, true);
                                }
                            }
                            f4634 = (f4635 + 19) % 128;
                        }
                    });
                }
            });
            int i = f4540 + 59;
            f4543 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (Exception e) {
            C2914kb.m7429(m5017("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19374 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m5018(358631239 - View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 150247158, (short) (14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 8 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 43)).intern(), e, false, false, true);
        }
    }

    /* renamed from: ﻛ */
    private static String m5019(C2890je c2890je) {
        f4540 = (f4543 + InterfaceC3173h3.d.b.f8821d) % 128;
        String strM7236 = c2890je.m7236(m5018(358631257 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 150247112, (short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 48), (ViewConfiguration.getScrollBarSize() >> 8) + 6, (byte) ((-105) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern());
        if (!TextUtils.isEmpty(strM7236)) {
            return strM7236;
        }
        f4540 = (f4543 + 53) % 128;
        String string = UUID.randomUUID().toString();
        c2890je.m7242(m5018(358631255 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-150247112) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) ((-49) - TextUtils.lastIndexOf("", '0')), 6 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 104)).intern(), string);
        return string;
    }

    /* renamed from: ｋ */
    private static int m5025(C2890je c2890je) {
        String strM7236 = c2890je.m7236(m5017("鞍ꤳ\ueae2⯡浳긜\uefc1ₘ扥ꌁ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16057).intern());
        int i = 1;
        if (!TextUtils.isEmpty(strM7236)) {
            int i2 = f4540 + 107;
            f4543 = i2 % 128;
            i = i2 % 2 == 0 ? Integer.parseInt(strM7236) : 1 + Integer.parseInt(strM7236);
        }
        c2890je.m7242(m5017("鞍ꤳ\ueae2⯡浳긜\uefc1ₘ扥ꌁ", 16057 - TextUtils.getTrimmedLength("")).intern(), String.valueOf(i));
        f4540 = (f4543 + 119) % 128;
        return i;
    }

    /* renamed from: ﻛ */
    private void m5023(JSONObject jSONObject, AbstractRunnableC2878it abstractRunnableC2878it) {
        m5033(jSONObject);
        C2648af c2648af = new C2648af(C2886ja.m7190(jSONObject));
        c2648af.m4974(m5000().m5138());
        this.f4559.m7195(c2648af.m4973(), abstractRunnableC2878it);
        m5029(c2648af.m4971());
        C2926s.m7596(abstractRunnableC2878it);
        f4540 = (f4543 + 13) % 128;
    }

    /* renamed from: ｋ */
    private synchronized void m5030(boolean z) {
        int i = f4543 + 31;
        f4540 = i % 128;
        if (i % 2 != 0) {
            this.f4557 = z;
            throw null;
        }
        this.f4557 = z;
    }

    /* renamed from: ｋ */
    private void m5029(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (C2925r.m7548().m7581()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f4556);
            }
            C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.1
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2649ag) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }

    /* renamed from: ﻛ */
    private static String m5018(int i, int i2, short s, int i3, byte b) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f4545;
                int i5 = i3 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f4541;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f4546 + i] + i4);
                    } else {
                        i5 = (short) (f4539[f4546 + i] + i4);
                    }
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i + i5) - 2) + f4546 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i2 + f4542);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f4541;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f4539;
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
}
