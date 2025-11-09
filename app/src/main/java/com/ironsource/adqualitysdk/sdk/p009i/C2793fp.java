package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fp */
/* loaded from: classes2.dex */
public final class C2793fp extends AbstractC2794fq {

    /* renamed from: ﮐ */
    private static int f6368 = -157868112;

    /* renamed from: ﱟ */
    private static byte[] f6369 = {-31, -102, 76, -113, -34, -34, -34, -31, -69, -48, -48};

    /* renamed from: ﱡ */
    private static int f6370 = 1;

    /* renamed from: ﺙ */
    private static int f6371 = 0;

    /* renamed from: ﻏ */
    private static short[] f6372 = null;

    /* renamed from: ﻐ */
    private static int f6373 = -523179864;

    /* renamed from: ﾒ */
    private static int f6374 = 35;

    /* renamed from: ﻛ */
    private AbstractC2794fq f6375;

    /* renamed from: ｋ */
    private AbstractC2794fq f6376;

    /* renamed from: ﾇ */
    private AbstractC2755ee f6377;

    public C2793fp(AbstractC2755ee abstractC2755ee, AbstractC2794fq abstractC2794fq, AbstractC2794fq abstractC2794fq2) {
        this.f6377 = abstractC2755ee;
        this.f6376 = abstractC2794fq;
        this.f6375 = abstractC2794fq2;
    }

    /* renamed from: ﾇ */
    private static String m6804(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f6374;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f6369;
                    i5 = bArr != null ? (byte) (bArr[f6373 + i2] + i4) : (short) (f6372[f6373 + i2] + i4);
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f6373 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f6368);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f6369;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f6372;
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

    public final boolean equals(Object obj) {
        int i = f6370;
        f6371 = (i + 121) % 128;
        if (this == obj) {
            f6371 = (i + 33) % 128;
            return true;
        }
        if (obj != null) {
            f6371 = (i + 37) % 128;
            if (C2793fp.class == obj.getClass()) {
                C2793fp c2793fp = (C2793fp) obj;
                AbstractC2755ee abstractC2755ee = this.f6377;
                if (abstractC2755ee == null ? c2793fp.f6377 != null : !abstractC2755ee.equals(c2793fp.f6377)) {
                    return false;
                }
                AbstractC2794fq abstractC2794fq = this.f6376;
                if (abstractC2794fq == null ? c2793fp.f6376 != null : !abstractC2794fq.equals(c2793fp.f6376)) {
                    return false;
                }
                AbstractC2794fq abstractC2794fq2 = this.f6375;
                if (abstractC2794fq2 != null) {
                    f6370 = (f6371 + 55) % 128;
                    return abstractC2794fq2.equals(c2793fp.f6375);
                }
                if (c2793fp.f6375 == null) {
                    int i2 = f6371 + 39;
                    f6370 = i2 % 128;
                    return i2 % 2 != 0;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        AbstractC2755ee abstractC2755ee = this.f6377;
        int iHashCode2 = 0;
        if (abstractC2755ee != null) {
            f6370 = (f6371 + 5) % 128;
            iHashCode = abstractC2755ee.hashCode();
            f6370 = (f6371 + 51) % 128;
        } else {
            iHashCode = 0;
        }
        int i2 = iHashCode * 31;
        AbstractC2794fq abstractC2794fq = this.f6376;
        int iHashCode3 = (i2 + (abstractC2794fq != null ? abstractC2794fq.hashCode() : 0)) * 31;
        AbstractC2794fq abstractC2794fq2 = this.f6375;
        if (abstractC2794fq2 != null) {
            f6371 = (f6370 + 85) % 128;
            iHashCode2 = abstractC2794fq2.hashCode();
            i = f6370 + 53;
        } else {
            i = f6370 + 89;
        }
        f6371 = i % 128;
        return iHashCode3 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6804((byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 109), ((Process.getThreadPriority(0) + 20) >> 6) - 36, 523179864 - (ViewConfiguration.getScrollBarSize() >> 8), 157868217 - KeyEvent.normalizeMetaState(0)).intern());
        sb.append(this.f6377);
        sb.append(m6804((byte) View.MeasureSpec.getMode(0), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 16), (-36) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 523179869, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 157868152).intern());
        if (this.f6376 instanceof C2788fk) {
            sb.append(m6804((byte) (ViewConfiguration.getScrollBarSize() >> 8), (short) ((Process.myPid() >> 22) - 57), (-35) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 523179870, 157868143 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
            f6371 = (f6370 + 125) % 128;
        } else {
            sb.append(m6804((byte) (ViewConfiguration.getTouchSlop() >> 8), (short) ((ViewConfiguration.getTouchSlop() >> 8) - 29), View.resolveSizeAndState(0, 0, 0) - 36, TextUtils.indexOf("", "") + 523179870, 157868122 - View.resolveSizeAndState(0, 0, 0)).intern());
        }
        sb.append(this.f6376);
        AbstractC2794fq abstractC2794fq = this.f6375;
        if (abstractC2794fq != null) {
            int i = f6371;
            int i2 = i + 117;
            f6370 = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = abstractC2794fq instanceof C2788fk;
                throw null;
            }
            if (abstractC2794fq instanceof C2788fk) {
                f6370 = (i + 93) % 128;
                sb.append(m6804((byte) TextUtils.getTrimmedLength(""), (short) (ExpandableListView.getPackedPositionChild(0L) - 56), (-36) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 523179869 - (ViewConfiguration.getJumpTapTimeout() >> 16), 157868144 - KeyEvent.normalizeMetaState(0)).intern());
            } else {
                sb.append(m6804((byte) KeyEvent.keyCodeFromString(""), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 30), (-16777252) - Color.rgb(0, 0, 0), 523179870 - TextUtils.getOffsetBefore("", 0), 157868122 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            }
            sb.append(m6804((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 55), (-35) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 523179871 - TextUtils.indexOf("", "", 0, 0), 157868212 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
            if (this.f6375 instanceof C2788fk) {
                sb.append(m6804((byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 57), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 36, 523179869 - View.getDefaultSize(0, 0), 157868144 - View.combineMeasuredStates(0, 0)).intern());
            } else {
                sb.append(m6804((byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (short) ((-29) - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.blue(0) - 36, 523179871 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 157868122).intern());
            }
            sb.append(this.f6375);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return r2.f6376.mo6796(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r0 = r2.f6375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r0.mo6796(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r3 = new com.ironsource.adqualitysdk.sdk.p009i.C2744du(java.lang.Boolean.FALSE);
        com.ironsource.adqualitysdk.sdk.p009i.C2793fp.f6370 = (com.ironsource.adqualitysdk.sdk.p009i.C2793fp.f6371 + 89) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2.f6377.m6760(r3, r4).m6721() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r2.f6377.m6760(r3, r4).m6721() != false) goto L9;
     */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.p009i.C2744du mo6796(com.ironsource.adqualitysdk.sdk.p009i.C2741dr r3, com.ironsource.adqualitysdk.sdk.p009i.C2712cp r4) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2793fp.f6370
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2793fp.f6371 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L1d
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r2.f6377
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.m6760(r3, r4)
            boolean r0 = r0.m6721()
            r1 = 34
            int r1 = r1 / 0
            if (r0 == 0) goto L30
            goto L29
        L1d:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r2.f6377
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.m6760(r3, r4)
            boolean r0 = r0.m6721()
            if (r0 == 0) goto L30
        L29:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r2.f6376
            com.ironsource.adqualitysdk.sdk.i.du r3 = r0.mo6796(r3, r4)
            return r3
        L30:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r2.f6375
            if (r0 == 0) goto L39
            com.ironsource.adqualitysdk.sdk.i.du r3 = r0.mo6796(r3, r4)
            return r3
        L39:
            com.ironsource.adqualitysdk.sdk.i.du r3 = new com.ironsource.adqualitysdk.sdk.i.du
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4)
            int r4 = com.ironsource.adqualitysdk.sdk.p009i.C2793fp.f6371
            int r4 = r4 + 89
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2793fp.f6370 = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2793fp.mo6796(com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.cp):com.ironsource.adqualitysdk.sdk.i.du");
    }
}
