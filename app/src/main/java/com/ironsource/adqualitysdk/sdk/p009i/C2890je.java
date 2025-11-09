package com.ironsource.adqualitysdk.sdk.p009i;

import OooO0oO.OooOo;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.je */
/* loaded from: classes2.dex */
public class C2890je {

    /* renamed from: ﱡ */
    private static int f7012 = 1;

    /* renamed from: ﻏ */
    private static int f7013 = 0;

    /* renamed from: ﻐ */
    private static long f7014 = 0;

    /* renamed from: ﻛ */
    private static Handler f7015 = null;

    /* renamed from: ｋ */
    private static char f7016 = 29763;

    /* renamed from: ﾒ */
    private static int f7017;

    /* renamed from: ﾇ */
    private C2862id f7018;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.je$1 */
    public class AnonymousClass1 extends AbstractRunnableC2878it {

        /* renamed from: ﻐ */
        final /* synthetic */ c f7019;

        /* renamed from: ﾒ */
        private /* synthetic */ String f7021;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.je$1$1 */
        public class C45671 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ String f7022;

            public C45671(String str) {
                str = str;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                cVar.mo7243(str);
            }
        }

        public AnonymousClass1(String str, c cVar) {
            str = str;
            cVar = cVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.1.1

                /* renamed from: ﻐ */
                private /* synthetic */ String f7022;

                public C45671(String str) {
                    str = str;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    cVar.mo7243(str);
                }
            });
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.je$2 */
    public class AnonymousClass2 extends AbstractRunnableC2878it {

        /* renamed from: ﻐ */
        private /* synthetic */ e f7024;

        /* renamed from: ﾇ */
        private /* synthetic */ String f7026;

        /* renamed from: ﾒ */
        private /* synthetic */ String f7027;

        public AnonymousClass2(String str, String str2, e eVar) {
            str = str;
            str = str2;
            eVar = eVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2890je.this.m7242(str, str);
            C2890je.m7232(C2890je.this, eVar);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.je$3 */
    public class AnonymousClass3 extends AbstractRunnableC2878it {
        public AnonymousClass3(e eVar) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.je$4 */
    public class AnonymousClass4 extends AbstractRunnableC2878it {

        /* renamed from: ﻛ */
        private /* synthetic */ String f7028;

        /* renamed from: ｋ */
        private /* synthetic */ e f7029;

        /* renamed from: ﾒ */
        private /* synthetic */ String f7031;

        public AnonymousClass4(String str, String str2, e eVar) {
            str = str;
            str = str2;
            eVar = eVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2890je.this.m7235(str, str);
            C2890je.m7232(C2890je.this, eVar);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.je$c */
    public interface c {
        /* renamed from: ﻐ */
        void mo7243(String str);
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.je$e */
    public interface e {
        /* renamed from: ﾒ */
        void mo7244();
    }

    public C2890je(Context context, String str, String str2) {
        this.f7018 = new C2862id(context, str, str2);
    }

    /* renamed from: ﻐ */
    public static Handler m7228() {
        Handler handler;
        synchronized (C2890je.class) {
            try {
                if (f7015 == null) {
                    HandlerThread handlerThread = new HandlerThread(m7230((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1071110201, (char) (21829 - (ViewConfiguration.getLongPressTimeout() >> 16)), "㫣ퟘ䔿払", "㖄\u008c※쬶\ue7beᙘ냢\ueb0fꅆ人麷嗋अ兩ｻ", "\u0000\u0000\u0000\u0000").intern());
                    handlerThread.start();
                    f7015 = new Handler(handlerThread.getLooper());
                }
                handler = f7015;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: ｋ */
    private static String m7231(String str) {
        String strOooOO0O = AbstractC2183w4.OooOO0O(OooOo.OooOo0O(str), m7230(1271534036 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), "풒쨑퉋榤", "茂홣㑕碋猛\uf04f⻯줌鳹\u05cf娋", "\u0000\u0000\u0000\u0000"));
        int i = f7013 + 53;
        f7012 = i % 128;
        if (i % 2 != 0) {
            return strOooOO0O;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m7232(C2890je c2890je, e eVar) {
        int i = f7013 + 115;
        f7012 = i % 128;
        int i2 = i % 2;
        c2890je.m7229(eVar);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public final void m7234(String str, String str2, e eVar) {
        m7228().post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.4

            /* renamed from: ﻛ */
            private /* synthetic */ String f7028;

            /* renamed from: ｋ */
            private /* synthetic */ e f7029;

            /* renamed from: ﾒ */
            private /* synthetic */ String f7031;

            public AnonymousClass4(String str3, String str22, e eVar2) {
                str = str3;
                str = str22;
                eVar = eVar2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2890je.this.m7235(str, str);
                C2890je.m7232(C2890je.this, eVar);
            }
        });
        int i = f7012 + 119;
        f7013 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public final HashMap<String, String> m7240(String str, int i) {
        int i2 = f7013 + 55;
        f7012 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f7018.m7075(str, i);
        }
        this.f7018.m7075(str, i);
        throw null;
    }

    /* renamed from: ﻛ */
    private void m7229(e eVar) {
        int i = f7013 + 63;
        f7012 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (eVar != null) {
            C2926s.m7596(new AbstractRunnableC2878it(eVar) { // from class: com.ironsource.adqualitysdk.sdk.i.je.3
                public AnonymousClass3(e eVar2) {
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                }
            });
        }
        int i2 = f7013 + 65;
        f7012 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
    }

    /* renamed from: ﾇ */
    public final String m7236(String str) {
        f7013 = (f7012 + 37) % 128;
        String strM7076 = this.f7018.m7076(str);
        f7013 = (f7012 + 57) % 128;
        return strM7076;
    }

    /* renamed from: ﾒ */
    public final void m7241(String str) {
        int i = f7012 + 5;
        f7013 = i % 128;
        if (i % 2 != 0) {
            this.f7018.m7074(str);
            throw null;
        }
        this.f7018.m7074(str);
        f7012 = (f7013 + 119) % 128;
    }

    /* renamed from: ﾇ */
    public final void m7237(String str, c cVar) {
        m7228().post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.1

            /* renamed from: ﻐ */
            final /* synthetic */ c f7019;

            /* renamed from: ﾒ */
            private /* synthetic */ String f7021;

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.je$1$1 */
            public class C45671 extends AbstractRunnableC2878it {

                /* renamed from: ﻐ */
                private /* synthetic */ String f7022;

                public C45671(String str) {
                    str = str;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    cVar.mo7243(str);
                }
            }

            public AnonymousClass1(String str2, c cVar2) {
                str = str2;
                cVar = cVar2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.1.1

                    /* renamed from: ﻐ */
                    private /* synthetic */ String f7022;

                    public C45671(String str2) {
                        str = str2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        cVar.mo7243(str);
                    }
                });
            }
        });
        int i = f7013 + 95;
        f7012 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public final void m7242(String str, String str2) {
        int i = f7012 + 23;
        f7013 = i % 128;
        if (i % 2 == 0) {
            this.f7018.m7077(str, str2);
        } else {
            this.f7018.m7077(str, str2);
            int i2 = 89 / 0;
        }
    }

    /* renamed from: ﾇ */
    public final void m7238(String str, String str2) {
        f7013 = (f7012 + 73) % 128;
        m7239(str, str2, null);
        f7012 = (f7013 + 47) % 128;
    }

    /* renamed from: ﾇ */
    public final void m7239(String str, String str2, e eVar) {
        m7228().post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2

            /* renamed from: ﻐ */
            private /* synthetic */ e f7024;

            /* renamed from: ﾇ */
            private /* synthetic */ String f7026;

            /* renamed from: ﾒ */
            private /* synthetic */ String f7027;

            public AnonymousClass2(String str3, String str22, e eVar2) {
                str = str3;
                str = str22;
                eVar = eVar2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2890je.this.m7242(str, str);
                C2890je.m7232(C2890je.this, eVar);
            }
        });
        int i = f7012 + 23;
        f7013 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    public final int m7233(String str) {
        f7013 = (f7012 + 7) % 128;
        int iM7073 = this.f7018.m7073(str);
        f7012 = (f7013 + 87) % 128;
        return iM7073;
    }

    /* renamed from: ｋ */
    public final void m7235(String str, String str2) {
        f7012 = (f7013 + 119) % 128;
        m7242(str, str2);
        m7242(m7231(str), Long.toString(C2906ju.m7340()));
        int i = f7013 + 123;
        f7012 = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
    }

    /* renamed from: ｋ */
    private static String m7230(int i, char c2, String str, String str2, String str3) {
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
                        char c3 = cArr5[i3];
                        char c4 = (char) ((i5 + c3) % 65535);
                        C2885j.f6935 = c4;
                        cArr5[i4] = (char) (((cArr4[i4] * 32718) + c3) / 65535);
                        cArr4[i4] = c4;
                        int i6 = C2885j.f6934;
                        cArr6[i6] = (char) ((((c4 ^ cArr2[i6]) ^ f7014) ^ f7017) ^ f7016);
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
