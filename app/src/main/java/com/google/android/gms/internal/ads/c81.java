package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.ironsource.C3034d9;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c81 {

    /* renamed from: OooO */
    public final boolean f17957OooO;

    /* renamed from: OooO00o */
    public final String f17958OooO00o;

    /* renamed from: OooO0O0 */
    public final String f17959OooO0O0;

    /* renamed from: OooO0OO */
    public final String f17960OooO0OO;

    /* renamed from: OooO0Oo */
    public final MediaCodecInfo.CodecCapabilities f17961OooO0Oo;

    /* renamed from: OooO0o */
    public final boolean f17962OooO0o;

    /* renamed from: OooO0o0 */
    public final boolean f17963OooO0o0;

    /* renamed from: OooO0oO */
    public final boolean f17964OooO0oO;

    /* renamed from: OooO0oo */
    public final boolean f17965OooO0oo;

    public c81(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.f17958OooO00o = str;
        this.f17959OooO0O0 = str2;
        this.f17960OooO0OO = str3;
        this.f17961OooO0Oo = codecCapabilities;
        this.f17964OooO0oO = z;
        this.f17963OooO0o0 = z2;
        this.f17962OooO0o = z3;
        this.f17965OooO0oo = z4;
        this.f17957OooO = AbstractC1813m4.OooO0oO(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.c81 OooO0O0(java.lang.String r9, java.lang.String r10, java.lang.String r11, android.media.MediaCodecInfo.CodecCapabilities r12, boolean r13, boolean r14) {
        /*
            com.google.android.gms.internal.ads.c81 r0 = new com.google.android.gms.internal.ads.c81
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L39
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r12.isFeatureSupported(r3)
            if (r3 == 0) goto L39
            int r3 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            r4 = 22
            if (r3 > r4) goto L27
            java.lang.String r3 = com.google.android.gms.internal.ads.i80.f19997OooO0Oo
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L29
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L27
            goto L29
        L27:
            r6 = r1
            goto L3a
        L29:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L39
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L27
        L39:
            r6 = r2
        L3a:
            if (r12 == 0) goto L41
            java.lang.String r3 = "tunneled-playback"
            r12.isFeatureSupported(r3)
        L41:
            if (r14 != 0) goto L4d
            if (r12 == 0) goto L4f
            java.lang.String r14 = "secure-playback"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L4f
        L4d:
            r7 = r1
            goto L50
        L4f:
            r7 = r2
        L50:
            int r14 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            r3 = 35
            if (r14 < r3) goto L67
            if (r12 == 0) goto L67
            java.lang.String r14 = "detached-surface"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L67
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r1
            r1 = r9
            goto L6d
        L67:
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r2
            r2 = r10
        L6d:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c81.OooO0O0(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):com.google.android.gms.internal.ads.c81");
    }

    public static Point OooO0o(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = i80.f19994OooO00o;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean OooO0oo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointOooO0o = OooO0o(videoCapabilities, i, i2);
        int i3 = pointOooO0o.x;
        int i4 = pointOooO0o.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO(com.google.android.gms.internal.ads.o0OoOo0 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c81.OooO(com.google.android.gms.internal.ads.o0OoOo0, boolean):boolean");
    }

    public final h41 OooO00o(o0OoOo0 o0oooo0, o0OoOo0 o0oooo02) {
        o0OoOo0 o0oooo03;
        o0OoOo0 o0oooo04;
        int i = true != Objects.equals(o0oooo0.f22222OooOOO0, o0oooo02.f22222OooOOO0) ? 8 : 0;
        if (this.f17957OooO) {
            if (o0oooo0.f22231OooOo0o != o0oooo02.f22231OooOo0o) {
                i |= 1024;
            }
            if (!this.f17963OooO0o0 && (o0oooo0.f22229OooOo00 != o0oooo02.f22229OooOo00 || o0oooo0.OooOo0 != o0oooo02.OooOo0)) {
                i |= 512;
            }
            z41 z41Var = o0oooo0.f22234OooOoOO;
            boolean zOooO0o0 = z41.OooO0o0(z41Var);
            z41 z41Var2 = o0oooo02.f22234OooOoOO;
            if ((!zOooO0o0 || !z41.OooO0o0(z41Var2)) && !Objects.equals(z41Var, z41Var2)) {
                i |= 2048;
            }
            if (i80.f19997OooO0Oo.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f17958OooO00o) && !o0oooo0.OooO0O0(o0oooo02)) {
                i |= 2;
            }
            if (i == 0) {
                return new h41(this.f17958OooO00o, o0oooo0, o0oooo02, true == o0oooo0.OooO0O0(o0oooo02) ? 3 : 2, 0);
            }
            o0oooo03 = o0oooo0;
            o0oooo04 = o0oooo02;
        } else {
            o0oooo03 = o0oooo0;
            o0oooo04 = o0oooo02;
            if (o0oooo03.f22236OooOoo0 != o0oooo04.f22236OooOoo0) {
                i |= 4096;
            }
            if (o0oooo03.f22235OooOoo != o0oooo04.f22235OooOoo) {
                i |= 8192;
            }
            if (o0oooo03.f22237OooOooO != o0oooo04.f22237OooOooO) {
                i |= 16384;
            }
            String str = this.f17959OooO0O0;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                HashMap map = m81.f21145OooO00o;
                Pair pairOooO00o = AbstractC1914ov.OooO00o(o0oooo03);
                Pair pairOooO00o2 = AbstractC1914ov.OooO00o(o0oooo04);
                if (pairOooO00o != null && pairOooO00o2 != null) {
                    int iIntValue = ((Integer) pairOooO00o.first).intValue();
                    int iIntValue2 = ((Integer) pairOooO00o2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new h41(this.f17958OooO00o, o0oooo03, o0oooo04, 3, 0);
                    }
                }
            }
            if (!o0oooo03.OooO0O0(o0oooo04)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new h41(this.f17958OooO00o, o0oooo03, o0oooo04, 1, 0);
            }
        }
        return new h41(this.f17958OooO00o, o0oooo03, o0oooo04, 0, i);
    }

    public final boolean OooO0OO(o0OoOo0 o0oooo0) {
        int i;
        String str = o0oooo0.f22222OooOOO0;
        String str2 = this.f17959OooO0O0;
        if (!(str2.equals(str) || str2.equals(m81.OooO00o(o0oooo0))) || !OooO(o0oooo0, true)) {
            return false;
        }
        if (this.f17957OooO) {
            int i2 = o0oooo0.f22229OooOo00;
            if (i2 > 0 && (i = o0oooo0.OooOo0) > 0) {
                return OooO0o0(i2, i, o0oooo0.f22230OooOo0O);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17961OooO0Oo;
            int i3 = o0oooo0.f22235OooOoo;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    OooO0oO("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    OooO0oO("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    OooO0oO("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = o0oooo0.f22236OooOoo0;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    OooO0oO("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    OooO0oO("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i80.f19994OooO00o < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    AbstractC1641hg.OooOOo0("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f17958OooO00o + ", [" + maxInputChannelCount + " to " + i5 + C3034d9.i.f8179e);
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    OooO0oO("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean OooO0Oo(o0OoOo0 o0oooo0) {
        if (this.f17957OooO) {
            return this.f17963OooO0o0;
        }
        HashMap map = m81.f21145OooO00o;
        Pair pairOooO00o = AbstractC1914ov.OooO00o(o0oooo0);
        return pairOooO00o != null && ((Integer) pairOooO00o.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0o0(int r9, int r10, double r11) {
        /*
            r8 = this;
            r0 = 0
            android.media.MediaCodecInfo$CodecCapabilities r1 = r8.f17961OooO0Oo
            if (r1 != 0) goto Lb
            java.lang.String r9 = "sizeAndRate.caps"
            r8.OooO0oO(r9)
            return r0
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()
            if (r1 != 0) goto L17
            java.lang.String r9 = "sizeAndRate.vCaps"
            r8.OooO0oO(r9)
            return r0
        L17:
            int r2 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            r3 = 1
            r4 = 29
            java.lang.String r5 = "@"
            java.lang.String r6 = "x"
            if (r2 < r4) goto L4d
            if (r2 < r4) goto L34
            java.lang.Boolean r2 = com.google.android.gms.internal.ads.ii0.f20048OooOo0O
            if (r2 == 0) goto L2f
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2f
            goto L34
        L2f:
            int r2 = com.google.android.gms.internal.ads.xh0.OooO0OO(r1, r9, r10, r11)
            goto L35
        L34:
            r2 = r0
        L35:
            r4 = 2
            if (r2 != r4) goto L39
            goto La8
        L39:
            if (r2 == r3) goto L3c
            goto L4d
        L3c:
            java.lang.String r1 = "sizeAndRate.cover, "
            java.lang.StringBuilder r9 = OooO0oO.OooOo.OooOo0o(r1, r9, r6, r10, r5)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.OooO0oO(r9)
            return r0
        L4d:
            boolean r2 = OooO0oo(r1, r9, r10, r11)
            if (r2 != 0) goto La8
            if (r9 >= r10) goto L97
            java.lang.String r2 = "OMX.MTK.VIDEO.DECODER.HEVC"
            java.lang.String r4 = r8.f17958OooO00o
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L69
            java.lang.String r2 = "mcv5a"
            java.lang.String r7 = com.google.android.gms.internal.ads.i80.f19995OooO0O0
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L97
        L69:
            boolean r1 = OooO0oo(r1, r10, r9, r11)
            if (r1 != 0) goto L70
            goto L97
        L70:
            java.lang.String r0 = "sizeAndRate.rotated, "
            java.lang.StringBuilder r9 = OooO0oO.OooOo.OooOo0o(r0, r9, r6, r10, r5)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = com.google.android.gms.internal.ads.i80.f19999OooO0o0
            java.lang.String r11 = "AssumedSupport ["
            java.lang.String r12 = "] ["
            java.lang.String r0 = ", "
            java.lang.StringBuilder r9 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0(r11, r9, r12, r4, r0)
            java.lang.String r11 = r8.f17959OooO0O0
            java.lang.String r0 = "]"
            java.lang.String r9 = androidx.datastore.preferences.protobuf.OooO00o.OooOOO(r9, r11, r12, r10, r0)
            java.lang.String r10 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.AbstractC1641hg.OooO0oO(r10, r9)
            return r3
        L97:
            java.lang.String r1 = "sizeAndRate.support, "
            java.lang.StringBuilder r9 = OooO0oO.OooOo.OooOo0o(r1, r9, r6, r10, r5)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.OooO0oO(r9)
            return r0
        La8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c81.OooO0o0(int, int, double):boolean");
    }

    public final void OooO0oO(String str) {
        String str2 = i80.f19999OooO0o0;
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("NoSupport [", str, "] [");
        sbOooOoO0.append(this.f17958OooO00o);
        sbOooOoO0.append(", ");
        AbstractC1641hg.OooO0oO("MediaCodecInfo", androidx.datastore.preferences.protobuf.OooO00o.OooOOO(sbOooOoO0, this.f17959OooO0O0, "] [", str2, C3034d9.i.f8179e));
    }

    public final String toString() {
        return this.f17958OooO00o;
    }
}
