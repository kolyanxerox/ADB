package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jc */
/* loaded from: classes2.dex */
public final class C2888jc {

    /* renamed from: ﾒ */
    private static C2888jc f6984;

    /* renamed from: ﱡ */
    private AbstractC2891jf f6985;

    /* renamed from: ﻐ */
    private boolean f6986;

    /* renamed from: ﾇ */
    private Choreographer.FrameCallback f6989;

    /* renamed from: ｋ */
    private HashMap<InterfaceC2870il, AbstractRunnableC2878it> f6988 = new HashMap<>();

    /* renamed from: ﻛ */
    private Handler f6987 = new Handler(Looper.getMainLooper());

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jc$3, reason: invalid class name */
    public class AnonymousClass3 extends AbstractRunnableC2878it {

        /* renamed from: ﾇ */
        private /* synthetic */ InterfaceC2870il f6997;

        public AnonymousClass3(InterfaceC2870il interfaceC2870il) {
            this.f6997 = interfaceC2870il;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2888jc.this.f6988.remove(this.f6997);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jc$4, reason: invalid class name */
    public class AnonymousClass4 extends AbstractRunnableC2878it {

        /* renamed from: ｋ */
        final /* synthetic */ InterfaceC2870il f6998;

        public AnonymousClass4(InterfaceC2870il interfaceC2870il) {
            this.f6998 = interfaceC2870il;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2888jc.this.f6988.put(this.f6998, new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.4.4
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    AnonymousClass4.this.f6998.mo6454();
                }
            });
            C2888jc.m7219(C2888jc.this);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jc$5, reason: invalid class name */
    public class AnonymousClass5 extends AbstractRunnableC2878it {
        public AnonymousClass5() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            if (C2888jc.this.f6985 == null) {
                C2888jc.this.f6985 = new AbstractC2891jf() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.4
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
                    /* renamed from: ﻛ */
                    public final void mo5068(Activity activity) {
                        C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.4.4
                            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                            /* renamed from: ﾒ */
                            public final void mo4950() {
                                C2888jc.m7219(C2888jc.this);
                            }
                        });
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
                    /* renamed from: ｋ */
                    public final void mo5069(Activity activity) {
                        C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.4.3
                            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                            /* renamed from: ﾒ */
                            public final void mo4950() {
                                final C2888jc c2888jc = C2888jc.this;
                                C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.2
                                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                    /* renamed from: ﾒ */
                                    public final void mo4950() {
                                        C2888jc.m7210(C2888jc.this);
                                    }
                                });
                            }
                        });
                    }
                };
                C2888jc.this.f6987.post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.5
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        AbstractC2894ji.m7268().m7271(C2888jc.this.f6985);
                        C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.5.4
                            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                            /* renamed from: ﾒ */
                            public final void mo4950() {
                                C2888jc.m7219(C2888jc.this);
                            }
                        });
                    }
                });
            }
        }
    }

    private C2888jc() {
    }

    /* renamed from: ﱟ */
    public static /* synthetic */ boolean m7210(C2888jc c2888jc) {
        c2888jc.f6986 = false;
        return false;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ HashMap m7211(C2888jc c2888jc) {
        return new HashMap(c2888jc.f6988);
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m7219(C2888jc c2888jc) {
        if (c2888jc.f6986 || new HashMap(c2888jc.f6988).isEmpty()) {
            return;
        }
        c2888jc.f6986 = true;
        C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                if (!C2888jc.this.f6986) {
                    C2888jc.this.f6989 = null;
                    return;
                }
                HashMap mapM7211 = C2888jc.m7211(C2888jc.this);
                Iterator it = mapM7211.keySet().iterator();
                while (it.hasNext()) {
                    C2888jc.this.f6987.post((Runnable) mapM7211.get((InterfaceC2870il) it.next()));
                }
                if (C2888jc.this.f6989 == null) {
                    C2888jc.this.f6989 = new Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.1.2

                        /* renamed from: ｋ */
                        private static int f6991 = 1;

                        /* renamed from: ﾇ */
                        private static int f6992;

                        /* renamed from: ﾒ */
                        private static char[] f6993 = {' ', 'R', 'Z', 'c', 'k', 'f', 'j', 'n', 'v', 'f', 'K', 'G', '3', 'c', 'e', 'j', 'h', 'd', 'B', 'B', 'i', 'Z', '\\', 'i', 'g', 'i'};

                        /* renamed from: ｋ */
                        private static String m7223(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                                    System.arraycopy(f6993, i, cArr, 0, i2);
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
                                    if (z) {
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

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
                            int i = f6992 + 97;
                            f6991 = i % 128;
                            try {
                                if (i % 2 == 0) {
                                    C2926s.m7600(this);
                                    throw null;
                                }
                                C2926s.m7600(this);
                                f6991 = (f6992 + 93) % 128;
                            } catch (Throwable th) {
                                C2921n.m7507(m7223(false, new int[]{0, 12, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern(), m7223(false, new int[]{12, 14, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001").intern(), th, false);
                            }
                        }
                    };
                }
                Choreographer.getInstance().postFrameCallback(C2888jc.this.f6989);
            }
        });
    }

    /* renamed from: ﻐ */
    public static synchronized C2888jc m7212() {
        try {
            if (f6984 == null) {
                f6984 = new C2888jc();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6984;
    }

    /* renamed from: ﻛ */
    public final void m7220(InterfaceC2870il interfaceC2870il) {
        C2926s.m7591(new AnonymousClass3(interfaceC2870il));
    }

    /* renamed from: ﾇ */
    public final synchronized void m7221() {
        C2926s.m7591(new AnonymousClass5());
    }

    /* renamed from: ﾇ */
    public final void m7222(InterfaceC2870il interfaceC2870il) {
        C2926s.m7591(new AnonymousClass4(interfaceC2870il));
    }
}
