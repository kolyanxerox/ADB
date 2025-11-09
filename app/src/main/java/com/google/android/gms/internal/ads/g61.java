package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Base64;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class g61 implements InterfaceC1770kz, il0, k81, j81, InterfaceC1546ew {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f19243OooOo0O;

    public /* synthetic */ g61(int i) {
        this.f19243OooOo0O = i;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public boolean OooO00o(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public boolean OooO0O0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f19243OooOo0O) {
            case 0:
                break;
            case 6:
                ((z91) obj).getClass();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j81
    public MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public boolean zze() {
        return false;
    }

    public g61(Context context) {
        this.f19243OooOo0O = 5;
        new C1548ey(context, 28);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.clear();
        map2.clear();
    }

    @Override // com.google.android.gms.internal.ads.j81
    public int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.k81
    public int zza(Object obj) {
        HashMap map = m81.f21145OooO00o;
        String str = ((c81) obj).f17958OooO00o;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (i80.f19994OooO00o >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() {
        byte[] bArr = new byte[12];
        j61.f20203OooO0oo.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
