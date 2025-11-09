package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.applovin.shadow.okhttp3.internal.p007ws.RealWebSocket;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i71 extends f81 implements g51 {

    /* renamed from: o0000O */
    public final dx0 f19976o0000O;

    /* renamed from: o0000O0 */
    public final Context f19977o0000O0;

    /* renamed from: o0000O0O */
    public final o00O0O f19978o0000O0O;

    /* renamed from: o0000OO */
    public boolean f19979o0000OO;

    /* renamed from: o0000OO0 */
    public int f19980o0000OO0;

    /* renamed from: o0000OOO */
    public boolean f19981o0000OOO;

    /* renamed from: o0000OOo */
    public o0OoOo0 f19982o0000OOo;

    /* renamed from: o0000Oo */
    public long f19983o0000Oo;

    /* renamed from: o0000Oo0 */
    public o0OoOo0 f19984o0000Oo0;

    /* renamed from: o0000OoO */
    public boolean f19985o0000OoO;

    /* renamed from: o0000o0 */
    public boolean f19986o0000o0;

    /* renamed from: o0000o0O */
    public boolean f19987o0000o0O;

    /* renamed from: o0000o0o */
    public int f19988o0000o0o;

    /* renamed from: o000OO */
    public final h71 f19989o000OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i71(Context context, nh0 nh0Var, Handler handler, t41 t41Var, h71 h71Var) {
        super(1, nh0Var, 44100.0f);
        dx0 dx0Var = i80.f19994OooO00o >= 35 ? new dx0(9) : null;
        this.f19977o0000O0 = context.getApplicationContext();
        this.f19989o000OO = h71Var;
        this.f19976o0000O = dx0Var;
        this.f19988o0000o0o = -1000;
        this.f19978o0000O0O = new o00O0O(handler, t41Var);
        h71Var.OooOO0o = new ni0(this, 9);
    }

    @Override // com.google.android.gms.internal.ads.g51
    public final void OooO00o(C2260y7 c2260y7) {
        h71 h71Var = this.f19989o000OO;
        h71Var.getClass();
        h71Var.f19612OooOo0o = new C2260y7(Math.max(0.1f, Math.min(c2260y7.f25860OooO00o, 8.0f)), Math.max(0.1f, Math.min(c2260y7.f25861OooO0O0, 8.0f)));
        e71 e71Var = new e71(c2260y7, -9223372036854775807L, -9223372036854775807L);
        if (h71Var.OooOO0O()) {
            h71Var.OooOo0 = e71Var;
        } else {
            h71Var.f19611OooOo0O = e71Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.u51
    public final void OooO0O0(int i, Object obj) {
        pd0 pd0Var;
        dx0 dx0Var;
        h71 h71Var = this.f19989o000OO;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (h71Var.f19623Oooo00O != fFloatValue) {
                h71Var.f19623Oooo00O = fFloatValue;
                if (h71Var.OooOO0O()) {
                    h71Var.f19605OooOOOo.setVolume(h71Var.f19623Oooo00O);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            j50 j50Var = (j50) obj;
            j50Var.getClass();
            if (h71Var.f19610OooOo00.equals(j50Var)) {
                return;
            }
            h71Var.f19610OooOo00 = j50Var;
            C1643hi c1643hi = h71Var.f19606OooOOo;
            if (c1643hi != null) {
                c1643hi.f19793OooOooO = j50Var;
                c1643hi.OooOO0(q61.OooO0O0((Context) c1643hi.f19786OooOo0O, j50Var, (pd0) c1643hi.f19791OooOoo));
            }
            h71Var.OooOOOo();
            return;
        }
        if (i == 6) {
            zc0 zc0Var = (zc0) obj;
            zc0Var.getClass();
            if (h71Var.f19620Oooo.equals(zc0Var)) {
                return;
            }
            if (h71Var.f19605OooOOOo != null) {
                h71Var.f19620Oooo.getClass();
            }
            h71Var.f19620Oooo = zc0Var;
            return;
        }
        if (i == 12) {
            if (i80.f19994OooO00o >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    pd0Var = null;
                } else {
                    h71Var.getClass();
                    pd0Var = new pd0(audioDeviceInfo, 10);
                }
                h71Var.f19633OoooO00 = pd0Var;
                C1643hi c1643hi2 = h71Var.f19606OooOOo;
                if (c1643hi2 != null) {
                    c1643hi2.OooO(audioDeviceInfo);
                }
                AudioTrack audioTrack = h71Var.f19605OooOOOo;
                if (audioTrack != null) {
                    pd0 pd0Var2 = h71Var.f19633OoooO00;
                    audioTrack.setPreferredDevice(pd0Var2 != null ? (AudioDeviceInfo) pd0Var2.f23325OooOo0o : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f19988o0000o0o = ((Integer) obj).intValue();
            z71 z71Var = this.f18847Ooooo00;
            if (z71Var == null || i80.f19994OooO00o < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f19988o0000o0o));
            z71Var.OooOOO0(bundle);
            return;
        }
        if (i == 9) {
            obj.getClass();
            h71Var.f19609OooOo = ((Boolean) obj).booleanValue();
            e71 e71Var = new e71(h71Var.f19612OooOo0o, -9223372036854775807L, -9223372036854775807L);
            if (h71Var.OooOO0O()) {
                h71Var.OooOo0 = e71Var;
                return;
            } else {
                h71Var.f19611OooOo0O = e71Var;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                this.f18844OoooOo0 = (x41) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (h71Var.f19630Oooo0oo != iIntValue) {
            h71Var.f19630Oooo0oo = iIntValue;
            h71Var.OooOOOo();
        }
        if (i80.f19994OooO00o < 35 || (dx0Var = this.f19976o0000O) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) dx0Var.f18417OooOo;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            dx0Var.f18417OooOo = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, qp0.f23673OooOo0O, new y71());
        dx0Var.f18417OooOo = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) dx0Var.f18419OooOo0o).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO0OO() {
        dx0 dx0Var;
        r61 r61Var;
        C1643hi c1643hi = this.f19989o000OO.f19606OooOOo;
        if (c1643hi != null && c1643hi.f19785OooOo) {
            c1643hi.f19792OooOoo0 = null;
            int i = i80.f19994OooO00o;
            Context context = (Context) c1643hi.f19786OooOo0O;
            if (i >= 23 && (r61Var = (r61) c1643hi.f19788OooOoO) != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(r61Var);
            }
            context.unregisterReceiver((C2291z1) c1643hi.f19790OooOoOO);
            s61 s61Var = (s61) c1643hi.f19787OooOo0o;
            if (s61Var != null) {
                s61Var.f24020OooO00o.unregisterContentObserver(s61Var);
            }
            c1643hi.f19785OooOo = false;
        }
        if (i80.f19994OooO00o < 35 || (dx0Var = this.f19976o0000O) == null) {
            return;
        }
        ((HashSet) dx0Var.f18419OooOo0o).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) dx0Var.f18417OooOo;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO0Oo() {
        h71 h71Var = this.f19989o000OO;
        this.f19987o0000o0O = false;
        try {
            try {
                Oooo0O0();
                OooOo0O();
                if (this.f19986o0000o0) {
                    this.f19986o0000o0 = false;
                    h71Var.OooOOo();
                }
            } finally {
                this.f18870o0000oo = null;
            }
        } catch (Throwable th) {
            if (this.f19986o0000o0) {
                this.f19986o0000o0 = false;
                h71Var.OooOOo();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO0o() throws IllegalStateException {
        o0OoOo0();
        h71 h71Var = this.f19989o000OO;
        h71Var.f19629Oooo0oO = false;
        if (h71Var.OooOO0O()) {
            a71 a71Var = h71Var.f19596OooO0o;
            a71Var.f16945OooOO0O = 0L;
            a71Var.f16956OooOo0o = 0;
            a71Var.f16955OooOo0O = 0;
            a71Var.OooOO0o = 0L;
            a71Var.f16960OooOoo = 0L;
            a71Var.f16964Oooo000 = 0L;
            a71Var.f16944OooOO0 = false;
            if (a71Var.f16953OooOo == -9223372036854775807L) {
                z61 z61Var = a71Var.f16941OooO0o0;
                z61Var.getClass();
                z61Var.OooO00o(0);
            } else {
                a71Var.f16957OooOoO = a71Var.OooO0Oo();
                if (!h71.OooOOO0(h71Var.f19605OooOOOo)) {
                    return;
                }
            }
            h71Var.f19605OooOOOo.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OooO0o0() {
        this.f19989o000OO.OooOOo0();
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final String OooOO0O() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final boolean OooOOO() {
        return this.f19989o000OO.OooOo00() || super.OooOOO();
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final boolean OooOOO0() {
        if (!this.f18864o00000Oo) {
            return false;
        }
        h71 h71Var = this.f19989o000OO;
        if (h71Var.OooOO0O()) {
            return h71Var.f19626Oooo0OO && !h71Var.OooOo00();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final float OooOOOo(float f, o0OoOo0[] o0oooo0Arr) {
        int iMax = -1;
        for (o0OoOo0 o0oooo0 : o0oooo0Arr) {
            int i = o0oooo0.f22235OooOoo;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void Oooo(c41 c41Var) {
        o0OoOo0 o0oooo0;
        if (i80.f19994OooO00o < 29 || (o0oooo0 = c41Var.f17679OooO0OO) == null || !Objects.equals(o0oooo0.f22222OooOOO0, "audio/opus") || !this.f18881o0OOO0o) {
            return;
        }
        ByteBuffer byteBuffer = c41Var.f17684OooO0oo;
        byteBuffer.getClass();
        c41Var.f17679OooO0OO.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            AudioTrack audioTrack = this.f19989o000OO.f19605OooOOOo;
            if (audioTrack != null) {
                h71.OooOOO0(audioTrack);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final h41 Oooo0(dx0 dx0Var) throws l41, d81 {
        o0OoOo0 o0oooo0 = (o0OoOo0) dx0Var.f18419OooOo0o;
        o0oooo0.getClass();
        this.f19982o0000OOo = o0oooo0;
        h41 h41VarOooo0 = super.Oooo0(dx0Var);
        o00O0O o00o0o = this.f19978o0000O0O;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new o000oOoO(o00o0o, o0oooo0, h41VarOooo0, 12));
        }
        return h41VarOooo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b7  */
    @Override // com.google.android.gms.internal.ads.f81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Oooo00O(com.google.android.gms.internal.ads.o0O r13, com.google.android.gms.internal.ads.o0OoOo0 r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i71.Oooo00O(com.google.android.gms.internal.ads.o0O, com.google.android.gms.internal.ads.o0OoOo0):int");
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final h41 Oooo00o(c81 c81Var, o0OoOo0 o0oooo0, o0OoOo0 o0oooo02) {
        int i;
        int i2;
        h41 h41VarOooO00o = c81Var.OooO00o(o0oooo0, o0oooo02);
        boolean z = this.f18870o0000oo == null && OoooOOo(o0oooo02);
        int i3 = h41VarOooO00o.f19552OooO0o0;
        if (z) {
            i3 |= 32768;
        }
        if (Ooooooo(c81Var, o0oooo02) > this.f19980o0000OO0) {
            i3 |= 64;
        }
        if (i3 != 0) {
            i = 0;
            i2 = i3;
        } else {
            i = h41VarOooO00o.f19551OooO0Oo;
            i2 = 0;
        }
        return new h41(c81Var.f17958OooO00o, o0oooo0, o0oooo02, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x002b  */
    @Override // com.google.android.gms.internal.ads.f81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList Oooo0o(com.google.android.gms.internal.ads.o0O r4, com.google.android.gms.internal.ads.o0OoOo0 r5) {
        /*
            r3 = this;
            java.lang.String r0 = r5.f22222OooOOO0
            if (r0 != 0) goto L7
            com.google.android.gms.internal.ads.gn0 r4 = com.google.android.gms.internal.ads.gn0.f19388OooOoO
            goto L2f
        L7:
            com.google.android.gms.internal.ads.h71 r0 = r3.f19989o000OO
            int r0 = r0.OooOO0o(r5)
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = com.google.android.gms.internal.ads.m81.OooO0O0(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            r0 = 0
            goto L24
        L1e:
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.c81 r0 = (com.google.android.gms.internal.ads.c81) r0
        L24:
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.gn0 r4 = com.google.android.gms.internal.ads.rm0.OooOOo0(r0)
            goto L2f
        L2b:
            com.google.android.gms.internal.ads.gn0 r4 = com.google.android.gms.internal.ads.m81.OooO0OO(r4, r5, r1, r1)
        L2f:
            java.util.HashMap r0 = com.google.android.gms.internal.ads.m81.f21145OooO00o
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            com.google.android.gms.internal.ads.ni0 r4 = new com.google.android.gms.internal.ads.ni0
            r1 = 10
            r4.<init>(r5, r1)
            com.google.android.gms.internal.ads.g81 r5 = new com.google.android.gms.internal.ads.g81
            r5.<init>(r4)
            java.util.Collections.sort(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i71.Oooo0o(com.google.android.gms.internal.ads.o0O, com.google.android.gms.internal.ads.o0OoOo0):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x005f  */
    @Override // com.google.android.gms.internal.ads.f81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OooOOo0.o0OOO0o Oooo0o0(com.google.android.gms.internal.ads.c81 r13, com.google.android.gms.internal.ads.o0OoOo0 r14, float r15) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i71.Oooo0o0(com.google.android.gms.internal.ads.c81, com.google.android.gms.internal.ads.o0OoOo0, float):OooOOo0.o0OOO0o");
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooO(o0OoOo0 o0oooo0, MediaFormat mediaFormat) throws l41 {
        int i;
        o0OoOo0 o0oooo02 = this.f19984o0000Oo0;
        int[] iArr = null;
        boolean z = true;
        if (o0oooo02 != null) {
            o0oooo0 = o0oooo02;
        } else if (this.f18847Ooooo00 != null) {
            mediaFormat.getClass();
            int iOooOOo0 = "audio/raw".equals(o0oooo0.f22222OooOOO0) ? o0oooo0.f22237OooOooO : (i80.f19994OooO00o < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? i80.OooOOo0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            jb1 jb1Var = new jb1();
            jb1Var.OooO0OO("audio/raw");
            jb1Var.f20265OooOoo = iOooOOo0;
            jb1Var.f20267OooOooO = o0oooo0.f22238OooOooo;
            jb1Var.f20268OooOooo = o0oooo0.f22240Oooo000;
            jb1Var.f20249OooOO0 = o0oooo0.f22220OooOO0O;
            jb1Var.f20241OooO00o = o0oooo0.f22211OooO00o;
            jb1Var.f20242OooO0O0 = o0oooo0.f22212OooO0O0;
            jb1Var.f20243OooO0OO = rm0.OooOOOO(o0oooo0.f22213OooO0OO);
            jb1Var.f20244OooO0Oo = o0oooo0.f22214OooO0Oo;
            jb1Var.f20246OooO0o0 = o0oooo0.f22216OooO0o0;
            jb1Var.f20245OooO0o = o0oooo0.f22215OooO0o;
            jb1Var.f20264OooOoOO = mediaFormat.getInteger("channel-count");
            jb1Var.f20266OooOoo0 = mediaFormat.getInteger("sample-rate");
            o0OoOo0 o0oooo03 = new o0OoOo0(jb1Var);
            boolean z2 = this.f19979o0000OO;
            int i2 = o0oooo03.f22236OooOoo0;
            if (z2 && i2 == 6 && (i = o0oooo0.f22236OooOoo0) < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.f19981o0000OOO) {
                if (i2 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i2 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i2 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i2 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i2 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            o0oooo0 = o0oooo03;
        }
        try {
            int i4 = i80.f19994OooO00o;
            if (i4 >= 29) {
                if (this.f18881o0OOO0o) {
                    OooooO0();
                }
                if (i4 < 29) {
                    z = false;
                }
                af0.OooooO0(z);
            }
            this.f19989o000OO.OooOOOO(o0oooo0, iArr);
        } catch (w61 e) {
            throw OoooOoo(e, e.f25239OooOo0O, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooO0(long j, long j2, String str) {
        o00O0O o00o0o = this.f19978o0000O0O;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new u61(o00o0o, str, j, j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooO00(Exception exc) {
        AbstractC1641hg.OooOOO0("MediaCodecAudioRenderer", "Audio codec error", exc);
        o00O0O o00o0o = this.f19978o0000O0O;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new u61(o00o0o, exc, 5));
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooO0O(String str) {
        o00O0O o00o0o = this.f19978o0000O0O;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new u61(o00o0o, str, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooOO0() {
        this.f19989o000OO.f19618OooOooO = true;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final boolean OoooOOO(long j, long j2, z71 z71Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, o0OoOo0 o0oooo0) throws l41 {
        byteBuffer.getClass();
        if (this.f19984o0000Oo0 != null && (i2 & 2) != 0) {
            z71Var.getClass();
            z71Var.OooOO0o(i);
            return true;
        }
        h71 h71Var = this.f19989o000OO;
        if (z) {
            if (z71Var != null) {
                z71Var.OooOO0o(i);
            }
            this.f18869o0000Ooo.f19233OooO0o += i3;
            h71Var.f19618OooOooO = true;
            return true;
        }
        try {
            if (!h71Var.OooOOoo(j3, byteBuffer, i3)) {
                return false;
            }
            if (z71Var != null) {
                z71Var.OooOO0o(i);
            }
            this.f18869o0000Ooo.f19234OooO0o0 += i3;
            return true;
        } catch (x61 e) {
            o0OoOo0 o0oooo02 = this.f19982o0000OOo;
            if (this.f18881o0OOO0o) {
                OooooO0();
            }
            throw OoooOoo(e, o0oooo02, e.f25537OooOo0o, IronSourceConstants.errorCode_biddingDataException);
        } catch (y61 e2) {
            if (this.f18881o0OOO0o) {
                OooooO0();
            }
            throw OoooOoo(e2, o0oooo0, e2.f25858OooOo0o, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final boolean OoooOOo(o0OoOo0 o0oooo0) {
        OooooO0();
        return this.f19989o000OO.OooOO0o(o0oooo0) != 0;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final g51 Ooooo0o() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void Oooooo(boolean z, boolean z2) {
        g41 g41Var = new g41();
        this.f18869o0000Ooo = g41Var;
        o00O0O o00o0o = this.f19978o0000O0O;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new u61(o00o0o, g41Var, 0));
        }
        OooooO0();
        o61 o61Var = this.f18821OooOoOO;
        o61Var.getClass();
        h71 h71Var = this.f19989o000OO;
        h71Var.f19601OooOO0O = o61Var;
        k50 k50Var = this.f18823OooOoo0;
        k50Var.getClass();
        h71Var.f19596OooO0o.f16965Oooo00O = k50Var;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void Oooooo0() {
        o00O0O o00o0o = this.f19978o0000O0O;
        this.f19986o0000o0 = true;
        this.f19982o0000OOo = null;
        try {
            try {
                this.f19989o000OO.OooOOOo();
                super.Oooooo0();
                g41 g41Var = this.f18869o0000Ooo;
                o00o0o.getClass();
                synchronized (g41Var) {
                }
                Handler handler = o00o0o.f21767OooO00o;
                if (handler != null) {
                    handler.post(new c60(14, o00o0o, g41Var));
                }
            } catch (Throwable th) {
                super.Oooooo0();
                g41 g41Var2 = this.f18869o0000Ooo;
                o00o0o.getClass();
                synchronized (g41Var2) {
                    Handler handler2 = o00o0o.f21767OooO00o;
                    if (handler2 != null) {
                        handler2.post(new c60(14, o00o0o, g41Var2));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            g41 g41Var3 = this.f18869o0000Ooo;
            o00o0o.getClass();
            synchronized (g41Var3) {
                Handler handler3 = o00o0o.f21767OooO00o;
                if (handler3 != null) {
                    handler3.post(new c60(14, o00o0o, g41Var3));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void OoooooO(long j, boolean z) throws l41, d81 {
        super.OoooooO(j, z);
        this.f19989o000OO.OooOOOo();
        this.f19983o0000Oo = j;
        this.f19987o0000o0O = false;
        this.f19985o0000OoO = true;
    }

    public final int Ooooooo(c81 c81Var, o0OoOo0 o0oooo0) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c81Var.f17958OooO00o) || (i = i80.f19994OooO00o) >= 24 || (i == 23 && i80.OooO0o0(this.f19977o0000O0))) {
            return o0oooo0.f22221OooOOO;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.f81
    public final void o000oOoO() throws l41 {
        try {
            h71 h71Var = this.f19989o000OO;
            if (!h71Var.f19626Oooo0OO && h71Var.OooOO0O() && h71Var.OooOO0()) {
                h71Var.OooO0oO();
                h71Var.f19626Oooo0OO = true;
            }
        } catch (y61 e) {
            throw OoooOoo(e, e.f25856OooOo, e.f25858OooOo0o, true != this.f18881o0OOO0o ? IronSourceConstants.errorCode_isReadyException : IronSourceConstants.errorCode_loadInProgress);
        }
    }

    public final void o0OoOo0() {
        long jMax;
        ArrayDeque arrayDeque;
        long jOooOOo;
        boolean zOooOOO0 = OooOOO0();
        h71 h71Var = this.f19989o000OO;
        if (!h71Var.OooOO0O() || h71Var.f19619OooOooo) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(h71Var.f19596OooO0o.OooO00o(zOooOOO0), i80.OooOo00(h71Var.f19602OooOOO.f18199OooO0o0, h71Var.OooO0O0()));
            while (true) {
                arrayDeque = h71Var.f19598OooO0oO;
                if (arrayDeque.isEmpty() || jMin < ((e71) arrayDeque.getFirst()).f18515OooO0OO) {
                    break;
                } else {
                    h71Var.f19611OooOo0O = (e71) arrayDeque.remove();
                }
            }
            long jOooOo0 = jMin - h71Var.f19611OooOo0O.f18515OooO0OO;
            boolean zIsEmpty = arrayDeque.isEmpty();
            bi0 bi0Var = h71Var.f19637OoooOOo;
            if (zIsEmpty) {
                C1835mq c1835mq = (C1835mq) bi0Var.f17510OooOoO0;
                if (c1835mq.zzg()) {
                    long j = c1835mq.f21333OooOOOO;
                    if (j >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                        long j2 = c1835mq.f21331OooOOO;
                        C1467cq c1467cq = c1835mq.f21329OooOO0;
                        c1467cq.getClass();
                        int i = c1467cq.f18032OooOO0O * c1467cq.f18024OooO0O0;
                        long j3 = j2 - (i + i);
                        int i2 = c1835mq.f21328OooO0oo.f20637OooO00o;
                        int i3 = c1835mq.f21327OooO0oO.f20637OooO00o;
                        jOooOo0 = i2 == i3 ? i80.OooOo0(jOooOo0, j3, j, RoundingMode.DOWN) : i80.OooOo0(jOooOo0, j3 * i2, j * i3, RoundingMode.DOWN);
                    } else {
                        jOooOo0 = (long) (c1835mq.f21323OooO0OO * jOooOo0);
                    }
                }
                jOooOOo = h71Var.f19611OooOo0O.f18514OooO0O0 + jOooOo0;
            } else {
                e71 e71Var = (e71) arrayDeque.getFirst();
                jOooOOo = e71Var.f18514OooO0O0 - i80.OooOOo(e71Var.f18515OooO0OO - jMin, h71Var.f19611OooOo0O.f18513OooO00o.f25860OooO00o);
            }
            long j4 = ((j71) bi0Var.f17507OooOo).OooOO0o;
            jMax = i80.OooOo00(h71Var.f19602OooOOO.f18199OooO0o0, j4) + jOooOOo;
            long j5 = h71Var.f19635OoooOO0;
            if (j4 > j5) {
                long jOooOo00 = i80.OooOo00(h71Var.f19602OooOOO.f18199OooO0o0, j4 - j5);
                h71Var.f19635OoooOO0 = j4;
                h71Var.o000oOoO += jOooOo00;
                if (h71Var.f19636OoooOOO == null) {
                    h71Var.f19636OoooOOO = new Handler(Looper.myLooper());
                }
                h71Var.f19636OoooOOO.removeCallbacksAndMessages(null);
                h71Var.f19636OoooOOO.postDelayed(new b30(h71Var, 21), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f19985o0000OoO) {
                jMax = Math.max(this.f19983o0000Oo, jMax);
            }
            this.f19983o0000Oo = jMax;
            this.f19985o0000OoO = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.g51
    public final long zza() {
        if (this.f18822OooOoo == 2) {
            o0OoOo0();
        }
        return this.f19983o0000Oo;
    }

    @Override // com.google.android.gms.internal.ads.g51
    public final C2260y7 zzc() {
        return this.f19989o000OO.f19612OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.g51
    public final boolean zzj() {
        boolean z = this.f19987o0000o0O;
        this.f19987o0000o0O = false;
        return z;
    }
}
