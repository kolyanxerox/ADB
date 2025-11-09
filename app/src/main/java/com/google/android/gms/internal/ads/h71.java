package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class h71 {

    /* renamed from: OoooOoO, reason: collision with root package name */
    public static final Object f19588OoooOoO = new Object();

    /* renamed from: OoooOoo, reason: collision with root package name */
    public static ScheduledExecutorService f19589OoooOoo;

    /* renamed from: Ooooo00, reason: collision with root package name */
    public static int f19590Ooooo00;

    /* renamed from: OooO, reason: collision with root package name */
    public final oOO0 f19591OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f19592OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final b71 f19593OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final l71 f19594OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final gn0 f19595OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final a71 f19596OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final gn0 f19597OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayDeque f19598OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public bi0 f19599OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final oOO0 f19600OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public o61 f19601OooOO0O;
    public ni0 OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public d71 f19602OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public d71 f19603OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public C2276yn f19604OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public AudioTrack f19605OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public C1643hi f19606OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public q61 f19607OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public bi0 f19608OooOOoo;

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f19609OooOo;
    public e71 OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public j50 f19610OooOo00;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public e71 f19611OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public C2260y7 f19612OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public long f19613OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f19614OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public long f19615OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public int f19616OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public long f19617OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f19618OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public boolean f19619OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public zc0 f19620Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public int f19621Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public long f19622Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public float f19623Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public ByteBuffer f19624Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public ByteBuffer f19625Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f19626Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public boolean f19627Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f19628Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f19629Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public int f19630Oooo0oo;

    /* renamed from: OoooO, reason: collision with root package name */
    public Looper f19631OoooO;

    /* renamed from: OoooO0, reason: collision with root package name */
    public long f19632OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public pd0 f19633OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public boolean f19634OoooO0O;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public long f19635OoooOO0;

    /* renamed from: OoooOOO, reason: collision with root package name */
    public Handler f19636OoooOOO;

    /* renamed from: OoooOOo, reason: collision with root package name */
    public final bi0 f19637OoooOOo;

    /* renamed from: OoooOo0, reason: collision with root package name */
    public final dx0 f19638OoooOo0;
    public long o000oOoO;

    public h71(fj0 fj0Var) {
        q61 q61VarOooO0O0;
        Context context = (Context) fj0Var.f18956OooOo0o;
        this.f19592OooO00o = context;
        j50 j50Var = j50.f20184OooO0O0;
        this.f19610OooOo00 = j50Var;
        if (context != null) {
            q61 q61Var = q61.f23514OooO0OO;
            int i = i80.f19994OooO00o;
            q61VarOooO0O0 = q61.OooO0O0(context, j50Var, null);
        } else {
            q61VarOooO0O0 = (q61) fj0Var.f18954OooOo;
        }
        this.f19607OooOOo0 = q61VarOooO0O0;
        this.f19637OoooOOo = (bi0) fj0Var.f18958OooOoO0;
        int i2 = i80.f19994OooO00o;
        dx0 dx0Var = (dx0) fj0Var.f18957OooOoO;
        dx0Var.getClass();
        this.f19638OoooOo0 = dx0Var;
        this.f19596OooO0o = new a71(new hk0(this, 9));
        b71 b71Var = new b71();
        this.f19593OooO0O0 = b71Var;
        l71 l71Var = new l71();
        l71Var.f20821OooOOO0 = i80.f19998OooO0o;
        this.f19594OooO0OO = l71Var;
        C1909oq c1909oq = new C1909oq();
        pm0 pm0Var = rm0.f23913OooOo0o;
        Object[] objArr = {c1909oq, b71Var, l71Var};
        ii0.OooOooo(3, objArr);
        this.f19595OooO0Oo = rm0.OooOOO(3, objArr);
        this.f19597OooO0o0 = rm0.OooOOo0(new k71());
        this.f19623Oooo00O = 1.0f;
        this.f19630Oooo0oo = 0;
        this.f19620Oooo = new zc0();
        C2260y7 c2260y7 = C2260y7.f25859OooO0Oo;
        this.f19611OooOo0O = new e71(c2260y7, 0L, 0L);
        this.f19612OooOo0o = c2260y7;
        this.f19609OooOo = false;
        this.f19598OooO0oO = new ArrayDeque();
        this.f19591OooO = new oOO0();
        this.f19600OooOO0 = new oOO0();
    }

    public static final AudioTrack OooOOO(v61 v61Var, j50 j50Var, int i, o0OoOo0 o0oooo0) throws UnsupportedOperationException, x61, IllegalArgumentException {
        AudioTrack audioTrack;
        try {
            int i2 = i80.f19994OooO00o;
            int i3 = v61Var.f24862OooO00o;
            int i4 = v61Var.f24864OooO0OO;
            int i5 = v61Var.f24863OooO0O0;
            if (i2 >= 23) {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes((AudioAttributes) j50Var.OooO00o().f25318OooOo0o).setAudioFormat(i80.OooOo0o(i5, i4, i3)).setTransferMode(1).setBufferSizeInBytes(v61Var.f24866OooO0o0).setSessionId(i);
                if (i2 >= 29) {
                    sessionId.setOffloadedPlayback(v61Var.f24865OooO0Oo);
                }
                audioTrack = sessionId.build();
            } else {
                audioTrack = new AudioTrack((AudioAttributes) j50Var.OooO00o().f25318OooOo0o, i80.OooOo0o(i5, i4, i3), v61Var.f24866OooO0o0, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new x61(state, v61Var.f24863OooO0O0, v61Var.f24864OooO0OO, v61Var.f24862OooO00o, o0oooo0, v61Var.f24865OooO0Oo, null);
        } catch (IllegalArgumentException e) {
            e = e;
            RuntimeException runtimeException = e;
            throw new x61(0, v61Var.f24863OooO0O0, v61Var.f24864OooO0OO, v61Var.f24862OooO00o, o0oooo0, v61Var.f24865OooO0Oo, runtimeException);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            RuntimeException runtimeException2 = e;
            throw new x61(0, v61Var.f24863OooO0O0, v61Var.f24864OooO0OO, v61Var.f24862OooO00o, o0oooo0, v61Var.f24865OooO0Oo, runtimeException2);
        }
    }

    public static boolean OooOOO0(AudioTrack audioTrack) {
        return i80.f19994OooO00o >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h71.OooO(java.nio.ByteBuffer):void");
    }

    public final long OooO00o() {
        return this.f19602OooOOO.f18196OooO0OO == 0 ? this.f19614OooOoO0 / r0.f18195OooO0O0 : this.f19613OooOoO;
    }

    public final long OooO0O0() {
        d71 d71Var = this.f19602OooOOO;
        if (d71Var.f18196OooO0OO != 0) {
            return this.f19617OooOoo0;
        }
        long j = this.f19615OooOoOO;
        long j2 = d71Var.f18197OooO0Oo;
        int i = i80.f19994OooO00o;
        return ((j + j2) - 1) / j2;
    }

    public final AudioTrack OooO0OO(d71 d71Var) throws x61 {
        try {
            return OooOOO(d71Var.OooO00o(), this.f19610OooOo00, this.f19630Oooo0oo, d71Var.f18194OooO00o);
        } catch (x61 e) {
            ni0 ni0Var = this.OooOO0o;
            if (ni0Var != null) {
                ni0Var.OooO00o(e);
            }
            throw e;
        }
    }

    public final void OooO0Oo(long j) {
        boolean z;
        C2260y7 c2260y7;
        d71 d71Var = this.f19602OooOOO;
        boolean z2 = false;
        if (d71Var.f18196OooO0OO == 0) {
            int i = d71Var.f18194OooO00o.f22237OooOooO;
            z = true;
        } else {
            z = false;
        }
        bi0 bi0Var = this.f19637OoooOOo;
        if (z) {
            c2260y7 = this.f19612OooOo0o;
            bi0Var.getClass();
            float f = c2260y7.f25860OooO00o;
            C1835mq c1835mq = (C1835mq) bi0Var.f17510OooOoO0;
            if (c1835mq.f21323OooO0OO != f) {
                c1835mq.f21323OooO0OO = f;
                c1835mq.f21321OooO = true;
            }
            float f2 = c1835mq.f21324OooO0Oo;
            float f3 = c2260y7.f25861OooO0O0;
            if (f2 != f3) {
                c1835mq.f21324OooO0Oo = f3;
                c1835mq.f21321OooO = true;
            }
        } else {
            c2260y7 = C2260y7.f25859OooO0Oo;
        }
        C2260y7 c2260y72 = c2260y7;
        this.f19612OooOo0o = c2260y72;
        d71 d71Var2 = this.f19602OooOOO;
        if (d71Var2.f18196OooO0OO == 0) {
            int i2 = d71Var2.f18194OooO00o.f22237OooOooO;
            z2 = this.f19609OooOo;
            ((j71) bi0Var.f17507OooOo).f20216OooOO0 = z2;
        }
        this.f19609OooOo = z2;
        this.f19598OooO0oO.add(new e71(c2260y72, Math.max(0L, j), i80.OooOo00(this.f19602OooOOO.f18199OooO0o0, OooO0O0())));
        C2276yn c2276yn = this.f19602OooOOO.f18193OooO;
        this.f19604OooOOOO = c2276yn;
        c2276yn.OooO0O0();
        ni0 ni0Var = this.OooOO0o;
        if (ni0Var != null) {
            boolean z3 = this.f19609OooOo;
            o00O0O o00o0o = ((i71) ni0Var.f21493OooOo0o).f19978o0000O0O;
            Handler handler = o00o0o.f21767OooO00o;
            if (handler != null) {
                handler.post(new OoooOOO.oO000O0O(o00o0o, z3, 3));
            }
        }
    }

    public final void OooO0o() {
        Context context;
        q61 q61VarOooO0OO;
        r61 r61Var;
        if (this.f19606OooOOo != null || (context = this.f19592OooO00o) == null) {
            return;
        }
        this.f19631OoooO = Looper.myLooper();
        C1643hi c1643hi = new C1643hi(context, new rh0(this), this.f19610OooOo00, this.f19633OoooO00);
        this.f19606OooOOo = c1643hi;
        if (c1643hi.f19785OooOo) {
            q61VarOooO0OO = (q61) c1643hi.f19792OooOoo0;
            q61VarOooO0OO.getClass();
        } else {
            c1643hi.f19785OooOo = true;
            s61 s61Var = (s61) c1643hi.f19787OooOo0o;
            if (s61Var != null) {
                s61Var.f24020OooO00o.registerContentObserver(s61Var.f24021OooO0O0, false, s61Var);
            }
            int i = i80.f19994OooO00o;
            Handler handler = (Handler) c1643hi.f19789OooOoO0;
            Context context2 = (Context) c1643hi.f19786OooOo0O;
            if (i >= 23 && (r61Var = (r61) c1643hi.f19788OooOoO) != null) {
                AudioManager audioManager = (AudioManager) context2.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager.getClass();
                audioManager.registerAudioDeviceCallback(r61Var, handler);
            }
            q61VarOooO0OO = q61.OooO0OO(context2, context2.registerReceiver((C2291z1) c1643hi.f19790OooOoOO, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (j50) c1643hi.f19793OooOooO, (pd0) c1643hi.f19791OooOoo);
            c1643hi.f19792OooOoo0 = q61VarOooO0OO;
        }
        this.f19607OooOOo0 = q61VarOooO0OO;
    }

    public final void OooO0o0() throws Exception {
        boolean z;
        if (this.f19625Oooo0O0 == null) {
            return;
        }
        oOO0 ooo0 = this.f19600OooOO0;
        if (((Exception) ooo0.f22753OooOo) != null) {
            synchronized (f19588OoooOoO) {
                z = f19590Ooooo00 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < ooo0.f22755OooOo0o) {
                return;
            }
        }
        int iRemaining = this.f19625Oooo0O0.remaining();
        int iWrite = this.f19605OooOOOo.write(this.f19625Oooo0O0, iRemaining, 1);
        this.f19632OoooO0 = SystemClock.elapsedRealtime();
        if (iWrite >= 0) {
            ooo0.f22753OooOo = null;
            ooo0.f22754OooOo0O = -9223372036854775807L;
            ooo0.f22755OooOo0o = -9223372036854775807L;
            OooOOO0(this.f19605OooOOOo);
            int i = this.f19602OooOOO.f18196OooO0OO;
            if (i == 0) {
                this.f19615OooOoOO += iWrite;
            }
            if (iWrite == iRemaining) {
                if (i != 0) {
                    af0.OooooO0(this.f19625Oooo0O0 == this.f19624Oooo00o);
                    this.f19617OooOoo0 = (this.f19616OooOoo * this.f19621Oooo0) + this.f19617OooOoo0;
                }
                this.f19625Oooo0O0 = null;
                return;
            }
            return;
        }
        if ((i80.f19994OooO00o >= 24 && iWrite == -6) || iWrite == -32) {
            if (OooO0O0() > 0) {
                z = true;
            } else if (OooOOO0(this.f19605OooOOOo)) {
                if (this.f19602OooOOO.f18196OooO0OO == 1) {
                    this.f19634OoooO0O = true;
                }
                z = true;
            }
        }
        y61 y61Var = new y61(iWrite, this.f19602OooOOO.f18194OooO00o, z);
        ni0 ni0Var = this.OooOO0o;
        if (ni0Var != null) {
            ni0Var.OooO00o(y61Var);
        }
        if (y61Var.f25858OooOo0o) {
            this.f19607OooOOo0 = q61.f23514OooO0OO;
            throw y61Var;
        }
        ooo0.OooO0O0(y61Var);
    }

    public final void OooO0oO() {
        if (this.f19628Oooo0o0) {
            return;
        }
        this.f19628Oooo0o0 = true;
        long jOooO0O0 = OooO0O0();
        a71 a71Var = this.f19596OooO0o;
        a71Var.f16957OooOoO = a71Var.OooO0Oo();
        a71Var.f16965Oooo00O.getClass();
        a71Var.f16953OooOo = i80.OooOOoo(SystemClock.elapsedRealtime());
        a71Var.f16959OooOoOO = jOooO0O0;
        if (OooOOO0(this.f19605OooOOOo)) {
            this.f19627Oooo0o = false;
        }
        this.f19605OooOOOo.stop();
    }

    public final void OooO0oo() throws Exception {
        ByteBuffer byteBuffer;
        OooO0o0();
        if (this.f19625Oooo0O0 != null) {
            return;
        }
        if (!this.f19604OooOOOO.OooO0Oo()) {
            ByteBuffer byteBuffer2 = this.f19624Oooo00o;
            if (byteBuffer2 != null) {
                OooO(byteBuffer2);
                OooO0o0();
                return;
            }
            return;
        }
        while (!this.f19604OooOOOO.OooO0OO()) {
            do {
                C2276yn c2276yn = this.f19604OooOOOO;
                if (c2276yn.OooO0Oo()) {
                    ByteBuffer byteBuffer3 = c2276yn.f25948OooO0OO[c2276yn.OooO0o0()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c2276yn.OooO0o(InterfaceC1723jp.f20345OooO00o);
                        byteBuffer = c2276yn.f25948OooO0OO[c2276yn.OooO0o0()];
                    }
                } else {
                    byteBuffer = InterfaceC1723jp.f20345OooO00o;
                }
                if (byteBuffer.hasRemaining()) {
                    OooO(byteBuffer);
                    OooO0o0();
                } else {
                    ByteBuffer byteBuffer4 = this.f19624Oooo00o;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C2276yn c2276yn2 = this.f19604OooOOOO;
                    ByteBuffer byteBuffer5 = this.f19624Oooo00o;
                    if (c2276yn2.OooO0Oo() && !c2276yn2.f25949OooO0Oo) {
                        c2276yn2.OooO0o(byteBuffer5);
                    }
                }
            } while (this.f19625Oooo0O0 == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOO0() throws java.lang.Exception {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.yn r0 = r4.f19604OooOOOO
            boolean r0 = r0.OooO0Oo()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L12
            r4.OooO0o0()
            java.nio.ByteBuffer r0 = r4.f19625Oooo0O0
            if (r0 != 0) goto L43
            goto L42
        L12:
            com.google.android.gms.internal.ads.yn r0 = r4.f19604OooOOOO
            boolean r3 = r0.OooO0Oo()
            if (r3 == 0) goto L2c
            boolean r3 = r0.f25949OooO0Oo
            if (r3 == 0) goto L1f
            goto L2c
        L1f:
            r0.f25949OooO0Oo = r2
            java.util.ArrayList r0 = r0.f25947OooO0O0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.jp r0 = (com.google.android.gms.internal.ads.InterfaceC1723jp) r0
            r0.zzd()
        L2c:
            r4.OooO0oo()
            com.google.android.gms.internal.ads.yn r0 = r4.f19604OooOOOO
            boolean r0 = r0.OooO0OO()
            if (r0 == 0) goto L43
            java.nio.ByteBuffer r0 = r4.f19625Oooo0O0
            if (r0 == 0) goto L42
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L42
            goto L43
        L42:
            return r2
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h71.OooOO0():boolean");
    }

    public final boolean OooOO0O() {
        return this.f19605OooOOOo != null;
    }

    public final int OooOO0o(o0OoOo0 o0oooo0) {
        OooO0o();
        if (!"audio/raw".equals(o0oooo0.f22222OooOOO0)) {
            return this.f19607OooOOo0.OooO00o(o0oooo0, this.f19610OooOo00) != null ? 2 : 0;
        }
        int i = o0oooo0.f22237OooOooO;
        if (i80.OooO0OO(i)) {
            return i != 2 ? 1 : 2;
        }
        androidx.datastore.preferences.protobuf.OooO00o.OooOo00(i, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    public final void OooOOOO(o0OoOo0 o0oooo0, int[] iArr) {
        int iIntValue;
        int iIntValue2;
        C2276yn c2276yn;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int iOooOo0O;
        int iOooOoOO;
        OooO0o();
        boolean zEquals = "audio/raw".equals(o0oooo0.f22222OooOOO0);
        int i7 = 2;
        int i8 = o0oooo0.f22235OooOoo;
        if (zEquals) {
            int i9 = o0oooo0.f22237OooOooO;
            af0.OoooO0(i80.OooO0OO(i9));
            int iOooOOO = i80.OooOOO(i9);
            int i10 = o0oooo0.f22236OooOoo0;
            i2 = iOooOOO * i10;
            om0 om0Var = new om0(4);
            om0Var.OooO0Oo(this.f19595OooO0Oo);
            InterfaceC1723jp[] interfaceC1723jpArr = (InterfaceC1723jp[]) this.f19637OoooOOo.f17509OooOo0o;
            ii0.OooOooo(2, interfaceC1723jpArr);
            om0Var.OooO0oO(2);
            System.arraycopy(interfaceC1723jpArr, 0, om0Var.f20905OooO0O0, om0Var.f20906OooO0OO, 2);
            om0Var.f20906OooO0OO += 2;
            C2276yn c2276yn2 = new C2276yn(om0Var.OooO0oo());
            if (c2276yn2.equals(this.f19604OooOOOO)) {
                c2276yn2 = this.f19604OooOOOO;
            }
            int i11 = o0oooo0.f22238OooOooo;
            l71 l71Var = this.f19594OooO0OO;
            l71Var.f20817OooO = i11;
            l71Var.f20818OooOO0 = o0oooo0.f22240Oooo000;
            this.f19593OooO0O0.f17429OooO = iArr;
            try {
                C1759ko c1759koOooO00o = c2276yn2.OooO00o(new C1759ko(i8, i10, i9));
                int i12 = c1759koOooO00o.f20638OooO0O0;
                iIntValue2 = i80.OooOOO0(i12);
                iIntValue = c1759koOooO00o.f20639OooO0OO;
                int iOooOOO2 = i80.OooOOO(iIntValue) * i12;
                i8 = c1759koOooO00o.f20637OooO00o;
                i = iOooOOO2;
                c2276yn = c2276yn2;
                i7 = 0;
            } catch (C2277yo e) {
                throw new w61(e, o0oooo0);
            }
        } else {
            C2276yn c2276yn3 = new C2276yn(gn0.f19388OooOoO);
            t61 t61Var = t61.f24254OooO0Oo;
            Pair pairOooO00o = this.f19607OooOOo0.OooO00o(o0oooo0, this.f19610OooOo00);
            if (pairOooO00o == null) {
                throw new w61("Unable to configure passthrough for: ".concat(String.valueOf(o0oooo0)), o0oooo0);
            }
            iIntValue = ((Integer) pairOooO00o.first).intValue();
            iIntValue2 = ((Integer) pairOooO00o.second).intValue();
            c2276yn = c2276yn3;
            i = -1;
            i2 = -1;
        }
        if (iIntValue == 0) {
            throw new w61("Invalid output encoding (mode=" + i7 + ") for: " + String.valueOf(o0oooo0), o0oooo0);
        }
        if (iIntValue2 == 0) {
            throw new w61("Invalid output channel config (mode=" + i7 + ") for: " + String.valueOf(o0oooo0), o0oooo0);
        }
        boolean zEquals2 = "audio/vnd.dts.hd;profile=lbr".equals(o0oooo0.f22222OooOOO0);
        int i13 = o0oooo0.f22210OooO;
        if (zEquals2 && i13 == -1) {
            i13 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i8, iIntValue2, iIntValue);
        af0.OooooO0(minBufferSize != -2);
        int i14 = i != -1 ? i : 1;
        int i15 = 250000;
        if (i7 != 0) {
            if (i7 != 1) {
                if (iIntValue == 5) {
                    i15 = 500000;
                } else if (iIntValue == 8) {
                    i15 = 1000000;
                    iIntValue = 8;
                }
                if (i13 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iOooOoOO = xh0.OooOoo0(i13, 8);
                } else {
                    iOooOoOO = xh0.OooOoOO(iIntValue);
                }
                i3 = i8;
                i6 = i14;
                iOooOo0O = ii0.OooOo0O((i15 * iOooOoOO) / 1000000);
            } else {
                i3 = i8;
                i6 = i14;
                iOooOo0O = ii0.OooOo0O((xh0.OooOoOO(iIntValue) * 50000000) / 1000000);
            }
            i5 = i;
            iMax = iOooOo0O;
            i4 = i6;
        } else {
            i3 = i8;
            long j = i3;
            i4 = i14;
            i5 = i;
            long j2 = i4;
            iMax = Math.max(ii0.OooOo0O(((250000 * j) * j2) / 1000000), Math.min(minBufferSize * 4, ii0.OooOo0O(((750000 * j) * j2) / 1000000)));
        }
        this.f19634OoooO0O = false;
        d71 d71Var = new d71(o0oooo0, i2, i7, i5, i3, iIntValue2, iIntValue, (((Math.max(minBufferSize, iMax) + i4) - 1) / i4) * i4, c2276yn);
        if (OooOO0O()) {
            this.f19603OooOOO0 = d71Var;
        } else {
            this.f19602OooOOO = d71Var;
        }
    }

    public final void OooOOOo() {
        bi0 bi0Var;
        if (OooOO0O()) {
            this.f19614OooOoO0 = 0L;
            this.f19613OooOoO = 0L;
            this.f19615OooOoOO = 0L;
            this.f19617OooOoo0 = 0L;
            this.f19616OooOoo = 0;
            this.f19611OooOo0O = new e71(this.f19612OooOo0o, 0L, 0L);
            this.f19622Oooo000 = 0L;
            this.OooOo0 = null;
            this.f19598OooO0oO.clear();
            this.f19624Oooo00o = null;
            this.f19621Oooo0 = 0;
            this.f19625Oooo0O0 = null;
            this.f19628Oooo0o0 = false;
            this.f19626Oooo0OO = false;
            this.f19627Oooo0o = false;
            this.f19594OooO0OO.f20822OooOOOO = 0L;
            C2276yn c2276yn = this.f19602OooOOO.f18193OooO;
            this.f19604OooOOOO = c2276yn;
            c2276yn.OooO0O0();
            AudioTrack audioTrack = this.f19596OooO0o.f16938OooO0OO;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f19605OooOOOo.pause();
            }
            if (OooOOO0(this.f19605OooOOOo)) {
                bi0 bi0Var2 = this.f19599OooO0oo;
                bi0Var2.getClass();
                bi0Var2.OooO0oO(this.f19605OooOOOo);
            }
            v61 v61VarOooO00o = this.f19602OooOOO.OooO00o();
            d71 d71Var = this.f19603OooOOO0;
            if (d71Var != null) {
                this.f19602OooOOO = d71Var;
                this.f19603OooOOO0 = null;
            }
            a71 a71Var = this.f19596OooO0o;
            a71Var.f16945OooOO0O = 0L;
            a71Var.f16956OooOo0o = 0;
            a71Var.f16955OooOo0O = 0;
            a71Var.OooOO0o = 0L;
            a71Var.f16960OooOoo = 0L;
            a71Var.f16964Oooo000 = 0L;
            a71Var.f16944OooOO0 = false;
            a71Var.f16938OooO0OO = null;
            a71Var.f16941OooO0o0 = null;
            if (i80.f19994OooO00o >= 24 && (bi0Var = this.f19608OooOOoo) != null) {
                f71 f71Var = (f71) bi0Var.f17510OooOoO0;
                f71Var.getClass();
                ((AudioTrack) bi0Var.f17509OooOo0o).removeOnRoutingChangedListener(f71Var);
                bi0Var.f17510OooOoO0 = null;
                this.f19608OooOOoo = null;
            }
            AudioTrack audioTrack2 = this.f19605OooOOOo;
            ni0 ni0Var = this.OooOO0o;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f19588OoooOoO) {
                try {
                    if (f19589OoooOoo == null) {
                        f19589OoooOoo = Executors.newSingleThreadScheduledExecutor(new p70(1));
                    }
                    f19590Ooooo00++;
                    f19589OoooOoo.schedule(new OoooOOO.o0OOOO0o(audioTrack2, ni0Var, handler, v61VarOooO00o, 11), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f19605OooOOOo = null;
        }
        oOO0 ooo0 = this.f19600OooOO0;
        ooo0.f22753OooOo = null;
        ooo0.f22754OooOo0O = -9223372036854775807L;
        ooo0.f22755OooOo0o = -9223372036854775807L;
        oOO0 ooo02 = this.f19591OooO;
        ooo02.f22753OooOo = null;
        ooo02.f22754OooOo0O = -9223372036854775807L;
        ooo02.f22755OooOo0o = -9223372036854775807L;
        this.f19635OoooOO0 = 0L;
        this.o000oOoO = 0L;
        Handler handler2 = this.f19636OoooOOO;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final void OooOOo() {
        OooOOOo();
        gn0 gn0Var = this.f19595OooO0Oo;
        int i = gn0Var.f19390OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            ((InterfaceC1723jp) gn0Var.get(i2)).zzf();
        }
        gn0 gn0Var2 = this.f19597OooO0o0;
        int i3 = gn0Var2.f19390OooOoO0;
        for (int i4 = 0; i4 < i3; i4++) {
            ((InterfaceC1723jp) gn0Var2.get(i4)).zzf();
        }
        C2276yn c2276yn = this.f19604OooOOOO;
        if (c2276yn != null) {
            int i5 = 0;
            while (true) {
                gn0 gn0Var3 = c2276yn.f25946OooO00o;
                if (i5 >= gn0Var3.f19390OooOoO0) {
                    break;
                }
                InterfaceC1723jp interfaceC1723jp = (InterfaceC1723jp) gn0Var3.get(i5);
                interfaceC1723jp.zzc();
                interfaceC1723jp.zzf();
                i5++;
            }
            c2276yn.f25948OooO0OO = new ByteBuffer[0];
            C1759ko c1759ko = C1759ko.f20636OooO0o0;
            c2276yn.f25949OooO0Oo = false;
        }
        this.f19629Oooo0oO = false;
        this.f19634OoooO0O = false;
    }

    public final void OooOOo0() {
        this.f19629Oooo0oO = true;
        if (OooOO0O()) {
            a71 a71Var = this.f19596OooO0o;
            if (a71Var.f16953OooOo != -9223372036854775807L) {
                a71Var.f16965Oooo00O.getClass();
                a71Var.f16953OooOo = i80.OooOOoo(SystemClock.elapsedRealtime());
            }
            z61 z61Var = a71Var.f16941OooO0o0;
            z61Var.getClass();
            z61Var.OooO00o(0);
            this.f19605OooOOOo.play();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ef A[PHI: r12
  0x01ef: PHI (r12v8 int) = (r12v7 int), (r12v7 int), (r12v32 int) binds: [B:110:0x01d7, B:115:0x01e4, B:118:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0295 A[PHI: r16
  0x0295: PHI (r16v9 long) = (r16v8 long), (r16v8 long), (r16v10 long), (r16v10 long) binds: [B:212:0x0399, B:214:0x03a2, B:147:0x0268, B:149:0x026d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x057a A[Catch: x61 -> 0x00f3, TryCatch #3 {x61 -> 0x00f3, blocks: (B:35:0x0074, B:64:0x00dd, B:66:0x00e5, B:68:0x00eb, B:71:0x00f6, B:72:0x0100, B:74:0x0106, B:76:0x010a, B:78:0x011c, B:79:0x011f, B:83:0x0135, B:85:0x0144, B:86:0x014b, B:90:0x0158, B:92:0x0165, B:95:0x0172, B:97:0x0176, B:98:0x017f, B:100:0x0186, B:102:0x0196, B:60:0x00a6, B:62:0x00af, B:295:0x0570, B:296:0x0573, B:298:0x057a, B:299:0x057c, B:38:0x007b, B:39:0x007d, B:47:0x0089, B:302:0x057f, B:63:0x00d7, B:54:0x0099, B:56:0x009d, B:59:0x00a5, B:40:0x007e, B:44:0x0085), top: B:313:0x0074, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[Catch: x61 -> 0x00f3, SYNTHETIC, TRY_LEAVE, TryCatch #3 {x61 -> 0x00f3, blocks: (B:35:0x0074, B:64:0x00dd, B:66:0x00e5, B:68:0x00eb, B:71:0x00f6, B:72:0x0100, B:74:0x0106, B:76:0x010a, B:78:0x011c, B:79:0x011f, B:83:0x0135, B:85:0x0144, B:86:0x014b, B:90:0x0158, B:92:0x0165, B:95:0x0172, B:97:0x0176, B:98:0x017f, B:100:0x0186, B:102:0x0196, B:60:0x00a6, B:62:0x00af, B:295:0x0570, B:296:0x0573, B:298:0x057a, B:299:0x057c, B:38:0x007b, B:39:0x007d, B:47:0x0089, B:302:0x057f, B:63:0x00d7, B:54:0x0099, B:56:0x009d, B:59:0x00a5, B:40:0x007e, B:44:0x0085), top: B:313:0x0074, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOoo(long r29, java.nio.ByteBuffer r31, int r32) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h71.OooOOoo(long, java.nio.ByteBuffer, int):boolean");
    }

    public final boolean OooOo00() {
        if (OooOO0O()) {
            return !(i80.f19994OooO00o >= 29 && this.f19605OooOOOo.isOffloadedPlayback() && this.f19627Oooo0o) && this.f19596OooO0o.OooO0OO(OooO0O0());
        }
        return false;
    }
}
