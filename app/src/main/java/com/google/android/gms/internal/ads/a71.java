package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class a71 {

    /* renamed from: OooO */
    public float f16935OooO;

    /* renamed from: OooO00o */
    public final hk0 f16936OooO00o;

    /* renamed from: OooO0O0 */
    public final long[] f16937OooO0O0;

    /* renamed from: OooO0OO */
    public AudioTrack f16938OooO0OO;

    /* renamed from: OooO0Oo */
    public int f16939OooO0Oo;

    /* renamed from: OooO0o */
    public int f16940OooO0o;

    /* renamed from: OooO0o0 */
    public z61 f16941OooO0o0;

    /* renamed from: OooO0oO */
    public boolean f16942OooO0oO;

    /* renamed from: OooO0oo */
    public long f16943OooO0oo;

    /* renamed from: OooOO0 */
    public boolean f16944OooOO0;

    /* renamed from: OooOO0O */
    public long f16945OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO */
    public long f16946OooOOO;

    /* renamed from: OooOOO0 */
    public Method f16947OooOOO0;

    /* renamed from: OooOOOO */
    public boolean f16948OooOOOO;

    /* renamed from: OooOOOo */
    public boolean f16949OooOOOo;

    /* renamed from: OooOOo */
    public long f16950OooOOo;

    /* renamed from: OooOOo0 */
    public long f16951OooOOo0;

    /* renamed from: OooOOoo */
    public long f16952OooOOoo;

    /* renamed from: OooOo */
    public long f16953OooOo;
    public long OooOo0;

    /* renamed from: OooOo00 */
    public long f16954OooOo00;

    /* renamed from: OooOo0O */
    public int f16955OooOo0O;

    /* renamed from: OooOo0o */
    public int f16956OooOo0o;

    /* renamed from: OooOoO */
    public long f16957OooOoO;

    /* renamed from: OooOoO0 */
    public long f16958OooOoO0;

    /* renamed from: OooOoOO */
    public long f16959OooOoOO;

    /* renamed from: OooOoo */
    public long f16960OooOoo;

    /* renamed from: OooOoo0 */
    public long f16961OooOoo0;

    /* renamed from: OooOooO */
    public boolean f16962OooOooO;

    /* renamed from: OooOooo */
    public long f16963OooOooo;

    /* renamed from: Oooo000 */
    public long f16964Oooo000;

    /* renamed from: Oooo00O */
    public k50 f16965Oooo00O;

    public a71(hk0 hk0Var) {
        this.f16936OooO00o = hk0Var;
        try {
            this.f16947OooOOO0 = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f16937OooO0O0 = new long[10];
        this.f16965Oooo00O = k50.f20453OooO00o;
    }

    public final long OooO00o(boolean z) {
        h71 h71Var;
        long j;
        boolean z2;
        float f;
        long jOooOo00;
        o00O0O o00o0o;
        Handler handler;
        boolean timestamp;
        long j2;
        long j3;
        Method method;
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = this.f16938OooO0OO;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        h71 h71Var2 = (h71) this.f16936OooO00o.f19809OooOo0o;
        if (playState == 3) {
            this.f16965Oooo00O.getClass();
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.OooOO0o >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long jOooOo002 = i80.OooOo00(this.f16940OooO0o, OooO0Oo());
                if (jOooOo002 != 0) {
                    int i = this.f16955OooOo0O;
                    f = 1.0f;
                    float f2 = this.f16935OooO;
                    if (f2 == 1.0f) {
                        j = 1000;
                    } else {
                        j = 1000;
                        jOooOo002 = Math.round(jOooOo002 / f2);
                    }
                    long[] jArr = this.f16937OooO0O0;
                    jArr[i] = jOooOo002 - jNanoTime;
                    this.f16955OooOo0O = (this.f16955OooOo0O + 1) % 10;
                    int i2 = this.f16956OooOo0o;
                    if (i2 < 10) {
                        this.f16956OooOo0o = i2 + 1;
                    }
                    this.OooOO0o = jNanoTime;
                    this.f16945OooOO0O = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f16956OooOo0o;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f16945OooOO0O = (jArr[i3] / i4) + this.f16945OooOO0O;
                        i3++;
                    }
                }
                h71Var = h71Var2;
                j = 1000;
                z2 = false;
                f = 1.0f;
            } else {
                j = 1000;
                f = 1.0f;
            }
            if (this.f16942OooO0oO) {
                h71Var = h71Var2;
                z2 = false;
            } else {
                z61 z61Var = this.f16941OooO0o0;
                z61Var.getClass();
                long j4 = jNanoTime - z61Var.f26104OooO0o0;
                long j5 = z61Var.f26102OooO0Oo;
                oOO0O000 ooo0o000 = z61Var.f26099OooO00o;
                if (j4 < j5) {
                    timestamp = false;
                    j2 = 500000;
                } else {
                    z61Var.f26104OooO0o0 = jNanoTime;
                    AudioTrack audioTrack3 = (AudioTrack) ooo0o000.f22798OooO0Oo;
                    AudioTimestamp audioTimestamp = (AudioTimestamp) ooo0o000.f22799OooO0o0;
                    timestamp = audioTrack3.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j2 = 500000;
                        long j6 = audioTimestamp.framePosition;
                        if (ooo0o000.f22796OooO0O0 > j6) {
                            ooo0o000.f22795OooO00o++;
                        }
                        ooo0o000.f22796OooO0O0 = j6;
                        ooo0o000.f22797OooO0OO = j6 + (ooo0o000.f22795OooO00o << 32);
                    } else {
                        j2 = 500000;
                    }
                    int i5 = z61Var.f26100OooO0O0;
                    if (i5 == 0) {
                        if (timestamp) {
                            if (audioTimestamp.nanoTime / j >= z61Var.f26101OooO0OO) {
                                z61Var.f26103OooO0o = ooo0o000.f22797OooO0OO;
                                z61Var.OooO00o(1);
                                timestamp = true;
                            }
                        } else if (jNanoTime - z61Var.f26101OooO0OO > j2) {
                            z61Var.OooO00o(3);
                        }
                        timestamp = false;
                    } else if (i5 != 1) {
                        if (i5 == 2) {
                            if (!timestamp) {
                                z61Var.OooO00o(0);
                                timestamp = false;
                            }
                            timestamp = true;
                        } else if (i5 == 3) {
                            if (timestamp) {
                                z61Var.OooO00o(0);
                                timestamp = true;
                            }
                            timestamp = false;
                        }
                    } else if (timestamp) {
                        if (ooo0o000.f22797OooO0OO > z61Var.f26103OooO0o) {
                            z61Var.OooO00o(2);
                        }
                        timestamp = true;
                    } else {
                        z61Var.OooO00o(0);
                        timestamp = false;
                    }
                }
                if (timestamp) {
                    j3 = 5000000;
                    long j7 = ((AudioTimestamp) ooo0o000.f22799OooO0o0).nanoTime / j;
                    long j8 = ooo0o000.f22797OooO0OO;
                    long jOooOo003 = i80.OooOo00(this.f16940OooO0o, OooO0Oo());
                    if (Math.abs(j7 - jNanoTime) > 5000000) {
                        long jOooO00o = h71Var2.OooO00o();
                        long jOooO0O0 = h71Var2.OooO0O0();
                        StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(j8, "Spurious audio timestamp (system clock mismatch): ", ", ");
                        sbOooOOo.append(j7);
                        sbOooOOo.append(", ");
                        sbOooOOo.append(jNanoTime);
                        sbOooOOo.append(", ");
                        sbOooOOo.append(jOooOo003);
                        sbOooOOo.append(", ");
                        sbOooOOo.append(jOooO00o);
                        sbOooOOo.append(", ");
                        sbOooOOo.append(jOooO0O0);
                        AbstractC1641hg.OooOOo0("DefaultAudioSink", sbOooOOo.toString());
                        z61Var.OooO00o(4);
                        h71Var = h71Var2;
                    } else if (Math.abs(i80.OooOo00(this.f16940OooO0o, j8) - jOooOo003) > 5000000) {
                        long jOooO00o2 = h71Var2.OooO00o();
                        long jOooO0O02 = h71Var2.OooO0O0();
                        h71Var = h71Var2;
                        StringBuilder sbOooOOo2 = OooO0oO.OooOo.OooOOo(j8, "Spurious audio timestamp (frame position mismatch): ", ", ");
                        sbOooOOo2.append(j7);
                        sbOooOOo2.append(", ");
                        sbOooOOo2.append(jNanoTime);
                        sbOooOOo2.append(", ");
                        sbOooOOo2.append(jOooOo003);
                        sbOooOOo2.append(", ");
                        sbOooOOo2.append(jOooO00o2);
                        sbOooOOo2.append(", ");
                        sbOooOOo2.append(jOooO0O02);
                        AbstractC1641hg.OooOOo0("DefaultAudioSink", sbOooOOo2.toString());
                        z61Var.OooO00o(4);
                    } else {
                        h71Var = h71Var2;
                        if (z61Var.f26100OooO0O0 == 4) {
                            z2 = false;
                            z61Var.OooO00o(0);
                        }
                    }
                    z2 = false;
                } else {
                    h71Var = h71Var2;
                    z2 = false;
                    j3 = 5000000;
                }
                if (this.f16949OooOOOo && (method = this.f16947OooOOO0) != null && jNanoTime - this.f16951OooOOo0 >= j2) {
                    try {
                        audioTrack = this.f16938OooO0OO;
                    } catch (Exception unused) {
                        this.f16947OooOOO0 = null;
                    }
                    if (audioTrack == null) {
                        throw null;
                    }
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    int i6 = i80.f19994OooO00o;
                    long jIntValue = (num.intValue() * j) - this.f16943OooO0oo;
                    this.f16946OooOOO = jIntValue;
                    long jMax = Math.max(jIntValue, 0L);
                    this.f16946OooOOO = jMax;
                    if (jMax > j3) {
                        AbstractC1641hg.OooOOo0("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        this.f16946OooOOO = 0L;
                    }
                    this.f16951OooOOo0 = jNanoTime;
                }
            }
        } else {
            h71Var = h71Var2;
            j = 1000;
            z2 = false;
            f = 1.0f;
        }
        this.f16965Oooo00O.getClass();
        long jNanoTime2 = System.nanoTime() / j;
        z61 z61Var2 = this.f16941OooO0o0;
        z61Var2.getClass();
        boolean z3 = z61Var2.f26100OooO0O0 == 2 ? true : z2;
        if (z3) {
            oOO0O000 ooo0o0002 = z61Var2.f26099OooO00o;
            jOooOo00 = i80.OooOOo(jNanoTime2 - (((AudioTimestamp) ooo0o0002.f22799OooO0o0).nanoTime / j), this.f16935OooO) + i80.OooOo00(this.f16940OooO0o, ooo0o0002.f22797OooO0OO);
        } else {
            jOooOo00 = this.f16956OooOo0o == 0 ? i80.OooOo00(this.f16940OooO0o, OooO0Oo()) : i80.OooOOo(this.f16945OooOO0O + jNanoTime2, this.f16935OooO);
            if (!z) {
                jOooOo00 = Math.max(0L, jOooOo00 - this.f16946OooOOO);
            }
        }
        if (this.f16962OooOooO != z3) {
            this.f16964Oooo000 = this.f16960OooOoo;
            this.f16963OooOooo = this.f16961OooOoo0;
        }
        long j9 = jNanoTime2 - this.f16964Oooo000;
        if (j9 < 1000000) {
            long jOooOOo = i80.OooOOo(j9, this.f16935OooO) + this.f16963OooOooo;
            long j10 = (j9 * j) / 1000000;
            jOooOo00 = (((j - j10) * jOooOOo) + (jOooOo00 * j10)) / j;
        }
        if (!this.f16944OooOO0) {
            long j11 = this.f16961OooOoo0;
            if (jOooOo00 > j11) {
                this.f16944OooOO0 = true;
                float f3 = this.f16935OooO;
                long jOooOo0O = i80.OooOo0O(jOooOo00 - j11);
                if (f3 != f) {
                    jOooOo0O = Math.round(jOooOo0O / f3);
                }
                this.f16965Oooo00O.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - i80.OooOo0O(jOooOo0O);
                ni0 ni0Var = h71Var.OooOO0o;
                if (ni0Var != null && (handler = (o00o0o = ((i71) ni0Var.f21493OooOo0o).f19978o0000O0O).f21767OooO00o) != null) {
                    handler.post(new u61(o00o0o, jCurrentTimeMillis));
                }
            }
        }
        this.f16960OooOoo = jNanoTime2;
        this.f16961OooOoo0 = jOooOo00;
        this.f16962OooOooO = z3;
        return jOooOo00;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f16938OooO0OO = r3
            r2.f16939OooO0Oo = r7
            com.google.android.gms.internal.ads.z61 r0 = new com.google.android.gms.internal.ads.z61
            r0.<init>(r3)
            r2.f16941OooO0o0 = r0
            int r3 = r3.getSampleRate()
            r2.f16940OooO0o = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            r0 = 23
            if (r4 >= r0) goto L23
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L24
            r4 = 6
            if (r5 != r4) goto L23
            r5 = r4
            goto L24
        L23:
            r0 = r3
        L24:
            r2.f16942OooO0oO = r0
            boolean r4 = com.google.android.gms.internal.ads.i80.OooO0OO(r5)
            r2.f16949OooOOOo = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.f16940OooO0o
            long r4 = com.google.android.gms.internal.ads.i80.OooOo00(r6, r4)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.f16943OooO0oo = r4
            r4 = 0
            r2.f16952OooOOoo = r4
            r2.f16954OooOo00 = r4
            r2.OooOo0 = r4
            r2.f16948OooOOOO = r3
            r2.f16953OooOo = r0
            r2.f16958OooOoO0 = r0
            r2.f16951OooOOo0 = r4
            r2.f16946OooOOO = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f16935OooO = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a71.OooO0O0(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final boolean OooO0OO(long j) {
        long jOooO00o = OooO00o(false);
        int i = this.f16940OooO0o;
        int i2 = i80.f19994OooO00o;
        if (j > i80.OooOo0(jOooO00o, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (this.f16942OooO0oO) {
            AudioTrack audioTrack = this.f16938OooO0OO;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && OooO0Oo() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0Oo() {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.k50 r0 = r13.f16965Oooo00O
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r13.f16953OooOo
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L46
            android.media.AudioTrack r2 = r13.f16938OooO0OO
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L23
            long r0 = r13.f16957OooOoO
            return r0
        L23:
            long r0 = com.google.android.gms.internal.ads.i80.OooOOoo(r0)
            long r2 = r13.f16953OooOo
            long r0 = r0 - r2
            float r2 = r13.f16935OooO
            long r3 = com.google.android.gms.internal.ads.i80.OooOOo(r0, r2)
            int r0 = r13.f16940OooO0o
            java.math.RoundingMode r9 = java.math.RoundingMode.UP
            long r5 = (long) r0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = com.google.android.gms.internal.ads.i80.OooOo0(r3, r5, r7, r9)
            long r2 = r13.f16959OooOoOO
            long r4 = r13.f16957OooOoO
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L46:
            long r6 = r13.f16950OooOOo
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto Laf
            android.media.AudioTrack r2 = r13.f16938OooO0OO
            r2.getClass()
            int r6 = r2.getPlayState()
            r7 = 1
            if (r6 != r7) goto L5d
            goto Lad
        L5d:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            boolean r2 = r13.f16942OooO0oO
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            r9 = 0
            if (r2 == 0) goto L7e
            if (r6 != r3) goto L79
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L7a
            long r11 = r13.f16952OooOOoo
            r13.OooOo0 = r11
            goto L7a
        L79:
            r3 = r6
        L7a:
            long r11 = r13.OooOo0
            long r7 = r7 + r11
            r6 = r3
        L7e:
            int r2 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            r3 = 29
            if (r2 > r3) goto L9e
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L9a
            long r2 = r13.f16952OooOOoo
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L9b
            r2 = 3
            if (r6 != r2) goto L9b
            long r2 = r13.f16958OooOoO0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lad
            r13.f16958OooOoO0 = r0
            goto Lad
        L9a:
            r9 = r7
        L9b:
            r13.f16958OooOoO0 = r4
            r7 = r9
        L9e:
            long r2 = r13.f16952OooOOoo
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto Lab
            long r2 = r13.f16954OooOo00
            r4 = 1
            long r2 = r2 + r4
            r13.f16954OooOo00 = r2
        Lab:
            r13.f16952OooOOoo = r7
        Lad:
            r13.f16950OooOOo = r0
        Laf:
            long r0 = r13.f16952OooOOoo
            long r2 = r13.f16954OooOo00
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a71.OooO0Oo():long");
    }
}
