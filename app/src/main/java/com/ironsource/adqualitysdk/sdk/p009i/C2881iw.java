package com.ironsource.adqualitysdk.sdk.p009i;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.iw */
/* loaded from: classes2.dex */
public final class C2881iw {

    /* renamed from: ﱟ */
    private static int f6865 = 1;

    /* renamed from: ﱡ */
    private static boolean f6866 = true;

    /* renamed from: ﺙ */
    private static int f6867 = 0;

    /* renamed from: ﻐ */
    private static int f6868 = 44;

    /* renamed from: ｋ */
    private static char[] f6869 = {'z', 145, 160, 163, 155, 158, 151, 'y', 141, 154, 147, 129, 142, 152, 'L', 156, 159, 143, 161, 153, 157, 149, 148, '~', 'x', 't', 144, 162, 127};

    /* renamed from: ﾒ */
    private static boolean f6870 = true;

    /* renamed from: ﻛ */
    private final C2884iz f6871;

    /* renamed from: ﾇ */
    private boolean f6872 = false;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.iw$1 */
    public class AnonymousClass1 implements b {

        /* renamed from: ｋ */
        private /* synthetic */ JSONObject f6873;

        /* renamed from: ﾒ */
        private /* synthetic */ String f6874;

        public AnonymousClass1(JSONObject jSONObject, String str) {
            jSONObject = jSONObject;
            str = str;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2881iw.b
        /* renamed from: ﾇ */
        public final C2879iu mo7147() {
            return C2880iv.m7127(jSONObject, str);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.iw$4 */
    public class AnonymousClass4 extends AbstractRunnableC2878it {

        /* renamed from: ﮐ */
        private static int f6875 = 1;

        /* renamed from: ﾇ */
        private static long f6876 = 6296192607542500884L;

        /* renamed from: ﾒ */
        private static int f6877;

        /* renamed from: ﻛ */
        private /* synthetic */ b f6879;

        /* renamed from: ｋ */
        private /* synthetic */ InterfaceC2883iy f6880;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.iw$4$2 */
        public class AnonymousClass2 extends AbstractRunnableC2878it {

            /* renamed from: ﱟ */
            private static int f6881 = 1;

            /* renamed from: ﻛ */
            private static int f6882 = 0;

            /* renamed from: ｋ */
            private static char[] f6883 = {'G', 'o', 't', ' ', 'a', 's', 'e', 'r', 'v', 'u', 'c', 'd', 'i', 'f', 'n', 'h', '2', '0', 'p', ':', 'H', 'I', 'J', 'K', 'L'};

            /* renamed from: ﾒ */
            private static char f6884 = 5;

            /* renamed from: ﾇ */
            private /* synthetic */ InterfaceC2883iy f6886;

            public AnonymousClass2(InterfaceC2883iy interfaceC2883iy) {
                interfaceC2883iy = interfaceC2883iy;
            }

            /* renamed from: ﾇ */
            private static String m7151(byte b, String str, int i) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (C2858i.f6710) {
                    try {
                        char[] cArr2 = f6883;
                        char c = f6884;
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
            public final void mo4950() throws Exception {
                int iM7124;
                int i = f6881 + 59;
                f6882 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                C2879iu c2879iu = c2879iu;
                if (c2879iu != null) {
                    iM7124 = c2879iu.m7123().m7124();
                    f6881 = (f6882 + 73) % 128;
                } else {
                    iM7124 = -1;
                }
                InterfaceC2883iy interfaceC2883iy = interfaceC2883iy;
                C2879iu c2879iu2 = c2879iu;
                StringBuilder sb = new StringBuilder();
                sb.append(m7151((byte) (70 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0001\u0002\u0003\u0004\u0000\u0004\u0006\u0007\b\t\u0007\b\u0001\b¸¸\u0002\u0006\u0004\u0002\b\u0002\u0007\u0000\u0000\u0003\u0005\u0006\u0000\r\u0006\u0010\b\u0001\f\r¬¬\u0007\b\t\u000b\u0003\u0004\u0000\u0011\t\u0013\u0001\u0012vv\u0004\u0002\b\u0002\u000b\u0004\u0002\b\u0007\u0006\u0010\u0003\n\t\t\u0010f", 69 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                sb.append(iM7124);
                interfaceC2883iy.mo5056(c2879iu2, sb.toString());
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.iw$4$3 */
        public class AnonymousClass3 extends AbstractRunnableC2878it {

            /* renamed from: ﻐ */
            private /* synthetic */ C2879iu f6887;

            public AnonymousClass3(C2879iu c2879iu) {
                c2879iu = c2879iu;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() throws Exception {
                interfaceC2883iy.mo5055(c2879iu);
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.iw$4$4 */
        public class C45614 implements InterfaceC2876ir {

            /* renamed from: ﾇ */
            private /* synthetic */ InterfaceC2883iy f6890;

            /* renamed from: ﾒ */
            private /* synthetic */ b f6891;

            public C45614(InterfaceC2883iy interfaceC2883iy, b bVar) {
                interfaceC2883iy = interfaceC2883iy;
                bVar = bVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2876ir
            /* renamed from: ｋ */
            public final void mo5050() {
                C2881iw.m7140(C2881iw.this).m7180(this);
                C2881iw.m7141(C2881iw.this, interfaceC2883iy, bVar);
            }
        }

        public AnonymousClass4(InterfaceC2883iy interfaceC2883iy, b bVar) {
            interfaceC2883iy = interfaceC2883iy;
            bVar = bVar;
        }

        /* renamed from: ﻐ */
        private void m7148(InterfaceC2883iy interfaceC2883iy, b bVar) {
            if (!C2881iw.m7140(C2881iw.this).m7181()) {
                m7149(interfaceC2883iy, bVar);
                f6877 = (f6875 + 83) % 128;
                return;
            }
            try {
                C2879iu c2879iuMo7147 = bVar.mo7147();
                if (c2879iuMo7147 == null) {
                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.2

                        /* renamed from: ﱟ */
                        private static int f6881 = 1;

                        /* renamed from: ﻛ */
                        private static int f6882 = 0;

                        /* renamed from: ｋ */
                        private static char[] f6883 = {'G', 'o', 't', ' ', 'a', 's', 'e', 'r', 'v', 'u', 'c', 'd', 'i', 'f', 'n', 'h', '2', '0', 'p', ':', 'H', 'I', 'J', 'K', 'L'};

                        /* renamed from: ﾒ */
                        private static char f6884 = 5;

                        /* renamed from: ﾇ */
                        private /* synthetic */ InterfaceC2883iy f6886;

                        public AnonymousClass2(InterfaceC2883iy interfaceC2883iy2) {
                            interfaceC2883iy = interfaceC2883iy2;
                        }

                        /* renamed from: ﾇ */
                        private static String m7151(byte b, String str, int i) {
                            String str2;
                            char[] charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = charArray;
                            synchronized (C2858i.f6710) {
                                try {
                                    char[] cArr2 = f6883;
                                    char c = f6884;
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
                        public final void mo4950() throws Exception {
                            int iM7124;
                            int i = f6881 + 59;
                            f6882 = i % 128;
                            if (i % 2 != 0) {
                                throw null;
                            }
                            C2879iu c2879iu = c2879iu;
                            if (c2879iu != null) {
                                iM7124 = c2879iu.m7123().m7124();
                                f6881 = (f6882 + 73) % 128;
                            } else {
                                iM7124 = -1;
                            }
                            InterfaceC2883iy interfaceC2883iy2 = interfaceC2883iy;
                            C2879iu c2879iu2 = c2879iu;
                            StringBuilder sb = new StringBuilder();
                            sb.append(m7151((byte) (70 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0001\u0002\u0003\u0004\u0000\u0004\u0006\u0007\b\t\u0007\b\u0001\b¸¸\u0002\u0006\u0004\u0002\b\u0002\u0007\u0000\u0000\u0003\u0005\u0006\u0000\r\u0006\u0010\b\u0001\f\r¬¬\u0007\b\t\u000b\u0003\u0004\u0000\u0011\t\u0013\u0001\u0012vv\u0004\u0002\b\u0002\u000b\u0004\u0002\b\u0007\u0006\u0010\u0003\n\t\t\u0010f", 69 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                            sb.append(iM7124);
                            interfaceC2883iy2.mo5056(c2879iu2, sb.toString());
                        }
                    });
                    return;
                }
                String strM7139 = C2880iv.m7139(c2879iuMo7147);
                String strIntern = m7150("\ude5a焲胦펪捷눩역ᒌꑭ\uf721۫妒\ue955㠁", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44866).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m7150("\ude53䛊\uef02ᐧ벱╁䩁\uf2b6᯿聎⢛凼\uf62bỉ蟈Ⱞ啷ﶥ戉譙㎳壴섂榕軾㜲徃쒟活鉼㫘ꌍ졑炷馶㹐ꚙ쿵琺鳃טꨬ퍪篎\ue042ऩ", 39089 - View.combineMeasuredStates(0, 0)).intern());
                sb.append(strM7139);
                C2921n.m7500(strIntern, sb.toString());
                C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.3

                    /* renamed from: ﻐ */
                    private /* synthetic */ C2879iu f6887;

                    public AnonymousClass3(C2879iu c2879iuMo71472) {
                        c2879iu = c2879iuMo71472;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() throws Exception {
                        interfaceC2883iy.mo5055(c2879iu);
                    }
                });
                f6877 = (f6875 + 27) % 128;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m7150("\ude41踋纗⼥龼䱄㲒\ued77巳\u0dcd嗀ꪪᬶ쯍렚棨\ud971触禒☘隭䝱㟐\ue456哽ը\uf50bꖌሼ싹", TextUtils.lastIndexOf("", '0', 0, 0) + 20594).intern());
                sb2.append(e.getLocalizedMessage());
                interfaceC2883iy2.mo5056(null, sb2.toString());
            }
        }

        /* renamed from: ﻛ */
        private void m7149(InterfaceC2883iy interfaceC2883iy, b bVar) {
            C2881iw.m7140(C2881iw.this).m7177(new InterfaceC2876ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.4

                /* renamed from: ﾇ */
                private /* synthetic */ InterfaceC2883iy f6890;

                /* renamed from: ﾒ */
                private /* synthetic */ b f6891;

                public C45614(InterfaceC2883iy interfaceC2883iy2, b bVar2) {
                    interfaceC2883iy = interfaceC2883iy2;
                    bVar = bVar2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2876ir
                /* renamed from: ｋ */
                public final void mo5050() {
                    C2881iw.m7140(C2881iw.this).m7180(this);
                    C2881iw.m7141(C2881iw.this, interfaceC2883iy, bVar);
                }
            });
            int i = f6875 + 27;
            f6877 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* renamed from: ｋ */
        private static String m7150(String str, int i) {
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
                            cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6876);
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

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            int i = f6877 + 11;
            f6875 = i % 128;
            if (i % 2 != 0) {
                m7148(interfaceC2883iy, bVar);
            } else {
                m7148(interfaceC2883iy, bVar);
                int i2 = 4 / 0;
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.iw$b */
    public interface b {
        /* renamed from: ﾇ */
        C2879iu mo7147();
    }

    public C2881iw(Context context) {
        this.f6871 = new C2884iz(context.getApplicationContext());
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ C2884iz m7140(C2881iw c2881iw) {
        int i = f6865;
        int i2 = i + 15;
        f6867 = i2 % 128;
        int i3 = i2 % 2;
        C2884iz c2884iz = c2881iw.f6871;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        int i5 = i + 115;
        f6867 = i5 % 128;
        if (i5 % 2 == 0) {
            return c2884iz;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static String m7143(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f6869;
                int i2 = f6868;
                if (f6866) {
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
                if (f6870) {
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

    /* renamed from: ﻐ */
    public final void m7144() {
        f6867 = (f6865 + 27) % 128;
        this.f6871.m7178();
        this.f6872 = true;
        f6865 = (f6867 + 77) % 128;
    }

    /* renamed from: ﻛ */
    public final C2884iz m7145() {
        int i = (f6865 + 91) % 128;
        f6867 = i;
        C2884iz c2884iz = this.f6871;
        f6865 = (i + 95) % 128;
        return c2884iz;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m7141(C2881iw c2881iw, InterfaceC2883iy interfaceC2883iy, b bVar) {
        f6865 = (f6867 + 93) % 128;
        c2881iw.m7142(interfaceC2883iy, bVar);
        f6867 = (f6865 + 85) % 128;
    }

    @TargetApi(3)
    /* renamed from: ﻛ */
    public final void m7146(String str, JSONObject jSONObject, InterfaceC2883iy interfaceC2883iy) {
        f6865 = (f6867 + 45) % 128;
        if (!TextUtils.isEmpty(str)) {
            m7142(interfaceC2883iy, new b() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.1

                /* renamed from: ｋ */
                private /* synthetic */ JSONObject f6873;

                /* renamed from: ﾒ */
                private /* synthetic */ String f6874;

                public AnonymousClass1(JSONObject jSONObject2, String str2) {
                    jSONObject = jSONObject2;
                    str = str2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2881iw.b
                /* renamed from: ﾇ */
                public final C2879iu mo7147() {
                    return C2880iv.m7127(jSONObject, str);
                }
            });
            return;
        }
        int i = f6867 + 41;
        f6865 = i % 128;
        if (i % 2 == 0) {
            C2921n.m7499(m7143(null, null, 20 / (ViewConfiguration.getWindowTouchSlop() / 33), "\u0086\u0082\u008b\u0089\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7143(null, null, 65 % ExpandableListView.getPackedPositionType(1L), "\u009b\u0082\u009b\u0096\u009c\u0085\u0086\u0090\u008f\u0083\u0085\u008a\u008f\u0082\u0086\u0082\u0084\u008f\u0086\u0082\u008e\u009b\u008a\u0089\u009a\u0082\u0091\u008a\u0085\u0090\u0091\u0082\u0086\u008f\u0086\u0085\u008f\u0099\u0098\u008c\u008f\u0086\u0082\u0097\u0083\u0096\u0082\u008f\u0083\u0091\u0082\u0093\u0095\u0082\u0086\u008f\u0094\u0085\u0083\u0091\u0093\u0092\u008f\u0083\u0091\u0085\u0090\u008f\u0085\u0083\u008f\u0082\u008e\u008d\u0089\u008a\u008c").intern());
        } else {
            C2921n.m7499(m7143(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0086\u0082\u008b\u0089\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7143(null, null, ExpandableListView.getPackedPositionType(0L) + 127, "\u009b\u0082\u009b\u0096\u009c\u0085\u0086\u0090\u008f\u0083\u0085\u008a\u008f\u0082\u0086\u0082\u0084\u008f\u0086\u0082\u008e\u009b\u008a\u0089\u009a\u0082\u0091\u008a\u0085\u0090\u0091\u0082\u0086\u008f\u0086\u0085\u008f\u0099\u0098\u008c\u008f\u0086\u0082\u0097\u0083\u0096\u0082\u008f\u0083\u0091\u0082\u0093\u0095\u0082\u0086\u008f\u0094\u0085\u0083\u0091\u0093\u0092\u008f\u0083\u0091\u0085\u0090\u008f\u0085\u0083\u008f\u0082\u008e\u008d\u0089\u008a\u008c").intern());
        }
    }

    /* renamed from: ﾇ */
    private void m7142(InterfaceC2883iy interfaceC2883iy, b bVar) {
        f6867 = (f6865 + 99) % 128;
        if (this.f6872) {
            C2921n.m7509(m7143(null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0086\u0082\u008b\u0089\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7143(null, null, 127 - View.resolveSizeAndState(0, 0, 0), "\u008a\u0084\u0085\u009b\u0083\u0093\u0097\u0091\u008f\u0091\u0089\u0084\u008f\u0086\u0082\u008b\u0089\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008f\u008a\u0082\u0097\u0084\u008f\u0083\u0091\u0082\u0093\u0095\u0082\u0098\u0082\u0087\u0085\u009c\u008a\u0096\u008f\u0085\u0083\u008f\u009b\u0082\u0096\u0086\u0083\u008f\u0082\u008a\u0085\u0082\u0094\u0085\u009d").intern());
            return;
        }
        C2906ju.m7337(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4

            /* renamed from: ﮐ */
            private static int f6875 = 1;

            /* renamed from: ﾇ */
            private static long f6876 = 6296192607542500884L;

            /* renamed from: ﾒ */
            private static int f6877;

            /* renamed from: ﻛ */
            private /* synthetic */ b f6879;

            /* renamed from: ｋ */
            private /* synthetic */ InterfaceC2883iy f6880;

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.iw$4$2 */
            public class AnonymousClass2 extends AbstractRunnableC2878it {

                /* renamed from: ﱟ */
                private static int f6881 = 1;

                /* renamed from: ﻛ */
                private static int f6882 = 0;

                /* renamed from: ｋ */
                private static char[] f6883 = {'G', 'o', 't', ' ', 'a', 's', 'e', 'r', 'v', 'u', 'c', 'd', 'i', 'f', 'n', 'h', '2', '0', 'p', ':', 'H', 'I', 'J', 'K', 'L'};

                /* renamed from: ﾒ */
                private static char f6884 = 5;

                /* renamed from: ﾇ */
                private /* synthetic */ InterfaceC2883iy f6886;

                public AnonymousClass2(InterfaceC2883iy interfaceC2883iy2) {
                    interfaceC2883iy = interfaceC2883iy2;
                }

                /* renamed from: ﾇ */
                private static String m7151(byte b, String str, int i) {
                    String str2;
                    char[] charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = charArray;
                    synchronized (C2858i.f6710) {
                        try {
                            char[] cArr2 = f6883;
                            char c = f6884;
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
                public final void mo4950() throws Exception {
                    int iM7124;
                    int i = f6881 + 59;
                    f6882 = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    C2879iu c2879iu = c2879iu;
                    if (c2879iu != null) {
                        iM7124 = c2879iu.m7123().m7124();
                        f6881 = (f6882 + 73) % 128;
                    } else {
                        iM7124 = -1;
                    }
                    InterfaceC2883iy interfaceC2883iy2 = interfaceC2883iy;
                    C2879iu c2879iu2 = c2879iu;
                    StringBuilder sb = new StringBuilder();
                    sb.append(m7151((byte) (70 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0001\u0002\u0003\u0004\u0000\u0004\u0006\u0007\b\t\u0007\b\u0001\b¸¸\u0002\u0006\u0004\u0002\b\u0002\u0007\u0000\u0000\u0003\u0005\u0006\u0000\r\u0006\u0010\b\u0001\f\r¬¬\u0007\b\t\u000b\u0003\u0004\u0000\u0011\t\u0013\u0001\u0012vv\u0004\u0002\b\u0002\u000b\u0004\u0002\b\u0007\u0006\u0010\u0003\n\t\t\u0010f", 69 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                    sb.append(iM7124);
                    interfaceC2883iy2.mo5056(c2879iu2, sb.toString());
                }
            }

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.iw$4$3 */
            public class AnonymousClass3 extends AbstractRunnableC2878it {

                /* renamed from: ﻐ */
                private /* synthetic */ C2879iu f6887;

                public AnonymousClass3(C2879iu c2879iuMo71472) {
                    c2879iu = c2879iuMo71472;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() throws Exception {
                    interfaceC2883iy.mo5055(c2879iu);
                }
            }

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.iw$4$4 */
            public class C45614 implements InterfaceC2876ir {

                /* renamed from: ﾇ */
                private /* synthetic */ InterfaceC2883iy f6890;

                /* renamed from: ﾒ */
                private /* synthetic */ b f6891;

                public C45614(InterfaceC2883iy interfaceC2883iy2, b bVar2) {
                    interfaceC2883iy = interfaceC2883iy2;
                    bVar = bVar2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2876ir
                /* renamed from: ｋ */
                public final void mo5050() {
                    C2881iw.m7140(C2881iw.this).m7180(this);
                    C2881iw.m7141(C2881iw.this, interfaceC2883iy, bVar);
                }
            }

            public AnonymousClass4(InterfaceC2883iy interfaceC2883iy2, b bVar2) {
                interfaceC2883iy = interfaceC2883iy2;
                bVar = bVar2;
            }

            /* renamed from: ﻐ */
            private void m7148(InterfaceC2883iy interfaceC2883iy2, b bVar2) {
                if (!C2881iw.m7140(C2881iw.this).m7181()) {
                    m7149(interfaceC2883iy2, bVar2);
                    f6877 = (f6875 + 83) % 128;
                    return;
                }
                try {
                    C2879iu c2879iuMo71472 = bVar2.mo7147();
                    if (c2879iuMo71472 == null) {
                        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.2

                            /* renamed from: ﱟ */
                            private static int f6881 = 1;

                            /* renamed from: ﻛ */
                            private static int f6882 = 0;

                            /* renamed from: ｋ */
                            private static char[] f6883 = {'G', 'o', 't', ' ', 'a', 's', 'e', 'r', 'v', 'u', 'c', 'd', 'i', 'f', 'n', 'h', '2', '0', 'p', ':', 'H', 'I', 'J', 'K', 'L'};

                            /* renamed from: ﾒ */
                            private static char f6884 = 5;

                            /* renamed from: ﾇ */
                            private /* synthetic */ InterfaceC2883iy f6886;

                            public AnonymousClass2(InterfaceC2883iy interfaceC2883iy22) {
                                interfaceC2883iy = interfaceC2883iy22;
                            }

                            /* renamed from: ﾇ */
                            private static String m7151(byte b2, String str, int i) {
                                String str2;
                                char[] charArray = str;
                                if (str != null) {
                                    charArray = str.toCharArray();
                                }
                                char[] cArr = charArray;
                                synchronized (C2858i.f6710) {
                                    try {
                                        char[] cArr2 = f6883;
                                        char c = f6884;
                                        char[] cArr3 = new char[i];
                                        if (i % 2 != 0) {
                                            i--;
                                            cArr3[i] = (char) (cArr[i] - b2);
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
                                                    cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b2);
                                                    cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b2);
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
                            public final void mo4950() throws Exception {
                                int iM7124;
                                int i = f6881 + 59;
                                f6882 = i % 128;
                                if (i % 2 != 0) {
                                    throw null;
                                }
                                C2879iu c2879iu = c2879iu;
                                if (c2879iu != null) {
                                    iM7124 = c2879iu.m7123().m7124();
                                    f6881 = (f6882 + 73) % 128;
                                } else {
                                    iM7124 = -1;
                                }
                                InterfaceC2883iy interfaceC2883iy22 = interfaceC2883iy;
                                C2879iu c2879iu2 = c2879iu;
                                StringBuilder sb = new StringBuilder();
                                sb.append(m7151((byte) (70 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0001\u0002\u0003\u0004\u0000\u0004\u0006\u0007\b\t\u0007\b\u0001\b¸¸\u0002\u0006\u0004\u0002\b\u0002\u0007\u0000\u0000\u0003\u0005\u0006\u0000\r\u0006\u0010\b\u0001\f\r¬¬\u0007\b\t\u000b\u0003\u0004\u0000\u0011\t\u0013\u0001\u0012vv\u0004\u0002\b\u0002\u000b\u0004\u0002\b\u0007\u0006\u0010\u0003\n\t\t\u0010f", 69 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                                sb.append(iM7124);
                                interfaceC2883iy22.mo5056(c2879iu2, sb.toString());
                            }
                        });
                        return;
                    }
                    String strM7139 = C2880iv.m7139(c2879iuMo71472);
                    String strIntern = m7150("\ude5a焲胦펪捷눩역ᒌꑭ\uf721۫妒\ue955㠁", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44866).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m7150("\ude53䛊\uef02ᐧ벱╁䩁\uf2b6᯿聎⢛凼\uf62bỉ蟈Ⱞ啷ﶥ戉譙㎳壴섂榕軾㜲徃쒟活鉼㫘ꌍ졑炷馶㹐ꚙ쿵琺鳃טꨬ퍪篎\ue042ऩ", 39089 - View.combineMeasuredStates(0, 0)).intern());
                    sb.append(strM7139);
                    C2921n.m7500(strIntern, sb.toString());
                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.3

                        /* renamed from: ﻐ */
                        private /* synthetic */ C2879iu f6887;

                        public AnonymousClass3(C2879iu c2879iuMo714722) {
                            c2879iu = c2879iuMo714722;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() throws Exception {
                            interfaceC2883iy.mo5055(c2879iu);
                        }
                    });
                    f6877 = (f6875 + 27) % 128;
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m7150("\ude41踋纗⼥龼䱄㲒\ued77巳\u0dcd嗀ꪪᬶ쯍렚棨\ud971触禒☘隭䝱㟐\ue456哽ը\uf50bꖌሼ싹", TextUtils.lastIndexOf("", '0', 0, 0) + 20594).intern());
                    sb2.append(e.getLocalizedMessage());
                    interfaceC2883iy22.mo5056(null, sb2.toString());
                }
            }

            /* renamed from: ﻛ */
            private void m7149(InterfaceC2883iy interfaceC2883iy2, b bVar2) {
                C2881iw.m7140(C2881iw.this).m7177(new InterfaceC2876ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.4

                    /* renamed from: ﾇ */
                    private /* synthetic */ InterfaceC2883iy f6890;

                    /* renamed from: ﾒ */
                    private /* synthetic */ b f6891;

                    public C45614(InterfaceC2883iy interfaceC2883iy22, b bVar22) {
                        interfaceC2883iy = interfaceC2883iy22;
                        bVar = bVar22;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2876ir
                    /* renamed from: ｋ */
                    public final void mo5050() {
                        C2881iw.m7140(C2881iw.this).m7180(this);
                        C2881iw.m7141(C2881iw.this, interfaceC2883iy, bVar);
                    }
                });
                int i = f6875 + 27;
                f6877 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ｋ */
            private static String m7150(String str, int i) {
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
                                cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6876);
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

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                int i = f6877 + 11;
                f6875 = i % 128;
                if (i % 2 != 0) {
                    m7148(interfaceC2883iy, bVar);
                } else {
                    m7148(interfaceC2883iy, bVar);
                    int i2 = 4 / 0;
                }
            }
        });
        int i = f6865 + 55;
        f6867 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
