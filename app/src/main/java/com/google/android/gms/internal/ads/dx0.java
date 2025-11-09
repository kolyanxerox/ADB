package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class dx0 implements InterfaceC2251xz, InterfaceC1770kz, z71, InterfaceC1546ew, ua1 {

    /* renamed from: OooOo */
    public Object f18417OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f18418OooOo0O;

    /* renamed from: OooOo0o */
    public Object f18419OooOo0o;

    public /* synthetic */ dx0(int i, Object obj, Object obj2) {
        this.f18418OooOo0O = i;
        this.f18419OooOo0o = obj;
        this.f18417OooOo = obj2;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public /* synthetic */ boolean OooO(hk0 hk0Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public ByteBuffer OooO00o(int i) {
        return ((MediaCodec) this.f18419OooOo0o).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public ByteBuffer OooO0O0(int i) {
        return ((MediaCodec) this.f18419OooOo0o).getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void OooO0OO(Surface surface) {
        ((MediaCodec) this.f18419OooOo0o).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void OooO0Oo(int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f18419OooOo0o).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.google.android.gms.internal.ads.ua1
    public gn0 OooO0o(int i, C1421bg c1421bg, int[] iArr) {
        xh0.OooOOoo(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < c1421bg.f17492OooO00o) {
            int i4 = i;
            C1421bg c1421bg2 = c1421bg;
            ta1 ta1Var = new ta1(i4, c1421bg2, i2, (qa1) this.f18419OooOo0o, iArr[i2], (String) this.f18417OooOo);
            int length = objArrCopyOf.length;
            int i5 = i3 + 1;
            int iOooO0o = lm0.OooO0o(length, i5);
            if (iOooO0o > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
            }
            objArrCopyOf[i3] = ta1Var;
            i2++;
            i3 = i5;
            i = i4;
            c1421bg = c1421bg2;
        }
        return rm0.OooOOO(i3, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void OooO0o0(int i, h31 h31Var, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f18419OooOo0o).queueSecureInputBuffer(i, 0, h31Var.f19533OooO, j, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251xz
    public void OooO0oO(Object obj, ka1 ka1Var) {
        ((e61) obj).OooO0oO((b61) this.f18417OooOo, new dx0(ka1Var, ((h61) this.f18419OooOo0o).f19579OooO0o0));
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void OooO0oo(int i, long j) {
        ((MediaCodec) this.f18419OooOo0o).releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void OooOO0(int i) {
        ((MediaCodec) this.f18419OooOo0o).setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public int OooOO0O(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f18419OooOo0o).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void OooOO0o(int i) {
        ((MediaCodec) this.f18419OooOo0o).releaseOutputBuffer(i, false);
    }

    public t61 OooOOO(o0OoOo0 o0oooo0, j50 j50Var) {
        int i;
        boolean zBooleanValue;
        AudioManager audioManager;
        o0oooo0.getClass();
        j50Var.getClass();
        int i2 = i80.f19994OooO00o;
        if (i2 < 29 || (i = o0oooo0.f22235OooOoo) == -1) {
            return t61.f24254OooO0Oo;
        }
        Boolean bool = (Boolean) this.f18417OooOo;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = (Context) this.f18419OooOo0o;
            if (context == null || (audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO)) == null) {
                this.f18417OooOo = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                this.f18417OooOo = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = ((Boolean) this.f18417OooOo).booleanValue();
        }
        String str = o0oooo0.f22222OooOOO0;
        str.getClass();
        int iOooO00o = AbstractC1813m4.OooO00o(str, o0oooo0.f22219OooOO0);
        if (iOooO00o == 0 || i2 < i80.OooOO0o(iOooO00o)) {
            return t61.f24254OooO0Oo;
        }
        int iOooOOO0 = i80.OooOOO0(o0oooo0.f22236OooOoo0);
        if (iOooOOO0 == 0) {
            return t61.f24254OooO0Oo;
        }
        try {
            AudioFormat audioFormatOooOo0o = i80.OooOo0o(i, iOooOOO0, iOooO00o);
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatOooOo0o, (AudioAttributes) j50Var.OooO00o().f25318OooOo0o)) {
                    return t61.f24254OooO0Oo;
                }
                o0O0OO0 o0o0oo0 = new o0O0OO0();
                o0o0oo0.f21958OooO00o = true;
                o0o0oo0.f21960OooO0OO = zBooleanValue;
                return o0o0oo0.OooO00o();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatOooOo0o, (AudioAttributes) j50Var.OooO00o().f25318OooOo0o);
            if (playbackOffloadSupport == 0) {
                return t61.f24254OooO0Oo;
            }
            o0O0OO0 o0o0oo02 = new o0O0OO0();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            o0o0oo02.f21958OooO00o = true;
            o0o0oo02.f21959OooO0O0 = z;
            o0o0oo02.f21960OooO0OO = zBooleanValue;
            return o0o0oo02.OooO00o();
        } catch (IllegalArgumentException unused) {
            return t61.f24254OooO0Oo;
        }
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void OooOOO0(Bundle bundle) {
        ((MediaCodec) this.f18419OooOo0o).setParameters(bundle);
    }

    public synchronized Map OooOOOO() {
        try {
            if (((Map) this.f18417OooOo) == null) {
                this.f18417OooOo = Collections.unmodifiableMap(new HashMap((HashMap) this.f18419OooOo0o));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f18417OooOo;
    }

    public void OooOOOo(v31 v31Var) {
        ((List) this.f18417OooOo).add(v31Var);
    }

    public x31 OooOOo() {
        return new x31((List) this.f18419OooOo0o, (List) this.f18417OooOo);
    }

    public void OooOOo0(v31 v31Var) {
        ((List) this.f18419OooOo0o).add(v31Var);
    }

    public void OooOOoo(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f18419OooOo0o).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f18417OooOo) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public boolean OooOo00(int i) {
        return ((ka1) this.f18419OooOo0o).f20471OooO00o.get(i);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public int zza() {
        return ((MediaCodec) this.f18419OooOo0o).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public MediaFormat zzc() {
        return ((MediaCodec) this.f18419OooOo0o).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void zzi() {
        ((MediaCodec) this.f18419OooOo0o).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void zzj() {
        ((MediaCodec) this.f18419OooOo0o).flush();
    }

    @Override // com.google.android.gms.internal.ads.z71
    public void zzm() {
        dx0 dx0Var = (dx0) this.f18417OooOo;
        MediaCodec mediaCodec = (MediaCodec) this.f18419OooOo0o;
        try {
            int i = i80.f19994OooO00o;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && dx0Var != null) {
                dx0Var.OooOOoo(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (i80.f19994OooO00o >= 35 && dx0Var != null) {
                dx0Var.OooOOoo(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    public dx0(Context context) {
        this.f18418OooOo0O = 8;
        this.f18419OooOo0o = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f18418OooOo0O) {
            case 6:
                ((e61) obj).OooO00o((d61) this.f18419OooOo0o, (e91) this.f18417OooOo);
                break;
            default:
                ((l91) obj).OooO0Oo(0, ((o71) this.f18419OooOo0o).f22354OooO00o, (e91) this.f18417OooOo);
                break;
        }
    }

    public /* synthetic */ dx0(OooOO0 oooOO0) {
        this.f18418OooOo0O = 13;
        this.f18417OooOo = oooOO0;
    }

    public dx0(int i) {
        this.f18418OooOo0O = i;
        switch (i) {
            case 3:
                break;
            case 9:
                this.f18419OooOo0o = new HashSet();
                break;
            default:
                this.f18419OooOo0o = new HashMap();
                break;
        }
    }

    public dx0(int i, int i2) {
        List arrayList;
        Object arrayList2;
        this.f18418OooOo0O = 2;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.f18419OooOo0o = arrayList;
        if (i2 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i2);
        }
        this.f18417OooOo = arrayList2;
    }

    public /* synthetic */ dx0(MediaCodec.CryptoInfo cryptoInfo) {
        this.f18418OooOo0O = 1;
        this.f18419OooOo0o = cryptoInfo;
        this.f18417OooOo = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public dx0(MediaCodec mediaCodec, dx0 dx0Var) {
        this.f18418OooOo0O = 10;
        this.f18419OooOo0o = mediaCodec;
        this.f18417OooOo = dx0Var;
        if (i80.f19994OooO00o < 35 || dx0Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) dx0Var.f18417OooOo;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            af0.OooooO0(((HashSet) dx0Var.f18419OooOo0o).add(mediaCodec));
        }
    }

    public dx0(ka1 ka1Var, SparseArray sparseArray) {
        this.f18418OooOo0O = 4;
        this.f18419OooOo0o = ka1Var;
        SparseBooleanArray sparseBooleanArray = ka1Var.f20471OooO00o;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iOooO00o = ka1Var.OooO00o(i);
            d61 d61Var = (d61) sparseArray.get(iOooO00o);
            d61Var.getClass();
            sparseArray2.append(iOooO00o, d61Var);
        }
        this.f18417OooOo = sparseArray2;
    }
}
