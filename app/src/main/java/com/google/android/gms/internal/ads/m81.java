package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class m81 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f21145OooO00o = new HashMap();

    public static String OooO00o(o0OoOo0 o0oooo0) {
        Pair pairOooO00o;
        if ("audio/eac3-joc".equals(o0oooo0.f22222OooOOO0)) {
            return "audio/eac3";
        }
        String str = o0oooo0.f22222OooOOO0;
        if ("video/dolby-vision".equals(str) && (pairOooO00o = AbstractC1914ov.OooO00o(o0oooo0)) != null) {
            int iIntValue = ((Integer) pairOooO00o.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return MimeTypes.VIDEO_H265;
            }
            if (iIntValue == 512) {
                return MimeTypes.VIDEO_H264;
            }
            if (iIntValue == 1024) {
                return MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return MimeTypes.VIDEO_H265;
        }
        return null;
    }

    public static synchronized List OooO0O0(String str, boolean z, boolean z2) {
        try {
            h81 h81Var = new h81(str, z, z2);
            HashMap map = f21145OooO00o;
            List list = (List) map.get(h81Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListOooO0Oo = OooO0Oo(h81Var, new OooO0oO.Oooo0(z, z2));
            if (z && arrayListOooO0Oo.isEmpty() && i80.f19994OooO00o <= 23) {
                arrayListOooO0Oo = OooO0Oo(h81Var, new g61(3));
                if (!arrayListOooO0Oo.isEmpty()) {
                    AbstractC1641hg.OooOOo0("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((c81) arrayListOooO0Oo.get(0)).f17958OooO00o);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i80.f19994OooO00o < 26 && i80.f19995OooO0O0.equals("R9") && arrayListOooO0Oo.size() == 1 && ((c81) arrayListOooO0Oo.get(0)).f17958OooO00o.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListOooO0Oo.add(c81.OooO0O0("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
                }
                Collections.sort(arrayListOooO0Oo, new g81(new g61(2)));
            }
            if (i80.f19994OooO00o < 32 && arrayListOooO0Oo.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((c81) arrayListOooO0Oo.get(0)).f17958OooO00o)) {
                arrayListOooO0Oo.add((c81) arrayListOooO0Oo.remove(0));
            }
            rm0 rm0VarOooOOOO = rm0.OooOOOO(arrayListOooO0Oo);
            map.put(h81Var, rm0VarOooOOOO);
            return rm0VarOooOOOO;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static gn0 OooO0OO(o0O o0o, o0OoOo0 o0oooo0, boolean z, boolean z2) {
        Iterable iterableOooO0O0;
        String str = o0oooo0.f22222OooOOO0;
        o0o.getClass();
        List listOooO0O0 = OooO0O0(str, z, z2);
        String strOooO00o = OooO00o(o0oooo0);
        if (strOooO00o == null) {
            iterableOooO0O0 = gn0.f19388OooOoO;
        } else {
            o0o.getClass();
            iterableOooO0O0 = OooO0O0(strOooO00o, z, z2);
        }
        om0 om0Var = new om0(4);
        om0Var.OooO0Oo(listOooO0O0);
        om0Var.OooO0Oo(iterableOooO0O0);
        return om0Var.OooO0oo();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0173 A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:86:0x0150, B:92:0x015b, B:99:0x016d, B:101:0x0173, B:108:0x018c, B:110:0x0195, B:120:0x01be, B:111:0x0199, B:113:0x01a9, B:115:0x01b1, B:104:0x0181), top: B:147:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181 A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:86:0x0150, B:92:0x015b, B:99:0x016d, B:101:0x0173, B:108:0x018c, B:110:0x0195, B:120:0x01be, B:111:0x0199, B:113:0x01a9, B:115:0x01b1, B:104:0x0181), top: B:147:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0195 A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:86:0x0150, B:92:0x015b, B:99:0x016d, B:101:0x0173, B:108:0x018c, B:110:0x0195, B:120:0x01be, B:111:0x0199, B:113:0x01a9, B:115:0x01b1, B:104:0x0181), top: B:147:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0199 A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:86:0x0150, B:92:0x015b, B:99:0x016d, B:101:0x0173, B:108:0x018c, B:110:0x0195, B:120:0x01be, B:111:0x0199, B:113:0x01a9, B:115:0x01b1, B:104:0x0181), top: B:147:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0235 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList OooO0Oo(com.google.android.gms.internal.ads.h81 r19, com.google.android.gms.internal.ads.j81 r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m81.OooO0Oo(com.google.android.gms.internal.ads.h81, com.google.android.gms.internal.ads.j81):java.util.ArrayList");
    }

    public static boolean OooO0o0(MediaCodecInfo mediaCodecInfo, String str) {
        if (i80.f19994OooO00o >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (MimeTypes.BASE_TYPE_AUDIO.equals(AbstractC1813m4.OooO0oo(str))) {
            return true;
        }
        String strOooOOo0 = xh0.OooOOo0(mediaCodecInfo.getName());
        if (strOooOOo0.startsWith("arc.")) {
            return false;
        }
        if (strOooOOo0.startsWith("omx.google.") || strOooOOo0.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strOooOOo0.startsWith("omx.sec.") && strOooOOo0.contains(".sw.")) || strOooOOo0.equals("omx.qcom.video.decoder.hevcswvdec") || strOooOOo0.startsWith("c2.android.") || strOooOOo0.startsWith("c2.google.")) {
            return true;
        }
        return (strOooOOo0.startsWith("omx.") || strOooOOo0.startsWith("c2.")) ? false : true;
    }
}
