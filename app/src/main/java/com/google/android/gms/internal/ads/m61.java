package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class m61 implements e61 {

    /* renamed from: OooOo */
    public final PlaybackSession f21096OooOo;

    /* renamed from: OooOo0O */
    public final Context f21097OooOo0O;

    /* renamed from: OooOo0o */
    public final j61 f21098OooOo0o;

    /* renamed from: OooOooO */
    public String f21104OooOooO;

    /* renamed from: OooOooo */
    public PlaybackMetrics.Builder f21105OooOooo;

    /* renamed from: Oooo */
    public boolean f21106Oooo;

    /* renamed from: Oooo0 */
    public dx0 f21107Oooo0;

    /* renamed from: Oooo00o */
    public AbstractC1632h7 f21110Oooo00o;

    /* renamed from: Oooo0O0 */
    public dx0 f21111Oooo0O0;

    /* renamed from: Oooo0OO */
    public dx0 f21112Oooo0OO;

    /* renamed from: Oooo0o */
    public o0OoOo0 f21113Oooo0o;

    /* renamed from: Oooo0o0 */
    public o0OoOo0 f21114Oooo0o0;

    /* renamed from: Oooo0oO */
    public o0OoOo0 f21115Oooo0oO;

    /* renamed from: Oooo0oo */
    public boolean f21116Oooo0oo;

    /* renamed from: OoooO */
    public boolean f21117OoooO;

    /* renamed from: OoooO0 */
    public int f21118OoooO0;

    /* renamed from: OoooO00 */
    public int f21119OoooO00;

    /* renamed from: OoooO0O */
    public int f21120OoooO0O;

    /* renamed from: OooOoO */
    public final C2045se f21099OooOoO = new C2045se();

    /* renamed from: OooOoOO */
    public final C1528ee f21101OooOoOO = new C1528ee();

    /* renamed from: OooOoo */
    public final HashMap f21102OooOoo = new HashMap();

    /* renamed from: OooOoo0 */
    public final HashMap f21103OooOoo0 = new HashMap();

    /* renamed from: OooOoO0 */
    public final long f21100OooOoO0 = SystemClock.elapsedRealtime();

    /* renamed from: Oooo000 */
    public int f21108Oooo000 = 0;

    /* renamed from: Oooo00O */
    public int f21109Oooo00O = 0;

    public m61(Context context, PlaybackSession playbackSession) {
        this.f21097OooOo0O = context.getApplicationContext();
        this.f21096OooOo = playbackSession;
        j61 j61Var = new j61();
        this.f21098OooOo0o = j61Var;
        j61Var.f20207OooO0Oo = this;
    }

    public final void OooO() {
        PlaybackMetrics.Builder builder = this.f21105OooOooo;
        if (builder != null && this.f21117OoooO) {
            builder.setAudioUnderrunCount(this.f21120OoooO0O);
            this.f21105OooOooo.setVideoFramesDropped(this.f21119OoooO00);
            this.f21105OooOooo.setVideoFramesPlayed(this.f21118OoooO0);
            Long l = (Long) this.f21103OooOoo0.get(this.f21104OooOooO);
            this.f21105OooOooo.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.f21102OooOoo.get(this.f21104OooOooO);
            this.f21105OooOooo.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f21105OooOooo.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f21096OooOo.reportPlaybackMetrics(this.f21105OooOooo.build());
        }
        this.f21105OooOooo = null;
        this.f21104OooOooO = null;
        this.f21120OoooO0O = 0;
        this.f21119OoooO00 = 0;
        this.f21118OoooO0 = 0;
        this.f21114Oooo0o0 = null;
        this.f21113Oooo0o = null;
        this.f21115Oooo0oO = null;
        this.f21117OoooO = false;
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooO00o(d61 d61Var, e91 e91Var) {
        h91 h91Var = d61Var.f18181OooO0Oo;
        if (h91Var == null) {
            return;
        }
        o0OoOo0 o0oooo0 = e91Var.f18526OooO0O0;
        o0oooo0.getClass();
        dx0 dx0Var = new dx0(7, o0oooo0, this.f21098OooOo0o.OooO00o(d61Var.f18179OooO0O0, h91Var));
        int i = e91Var.f18525OooO00o;
        if (i != 0) {
            if (i == 1) {
                this.f21111Oooo0O0 = dx0Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f21112Oooo0OO = dx0Var;
                return;
            }
        }
        this.f21107Oooo0 = dx0Var;
    }

    public final void OooO0o(d61 d61Var, String str) {
        h91 h91Var = d61Var.f18181OooO0Oo;
        if ((h91Var == null || !h91Var.OooO0O0()) && str.equals(this.f21104OooOooO)) {
            OooO();
        }
        this.f21103OooOoo0.remove(str);
        this.f21102OooOoo.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:555:0x020f A[PHI: r6
  0x020f: PHI (r6v48 int) = (r6v31 int), (r6v80 int) binds: [B:630:0x0300, B:554:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0212 A[PHI: r6
  0x0212: PHI (r6v47 int) = (r6v31 int), (r6v80 int) binds: [B:630:0x0300, B:554:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0215 A[PHI: r6
  0x0215: PHI (r6v46 int) = (r6v31 int), (r6v80 int) binds: [B:630:0x0300, B:554:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0218 A[PHI: r6
  0x0218: PHI (r6v45 int) = (r6v31 int), (r6v80 int) binds: [B:630:0x0300, B:554:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x023c A[PHI: r9
  0x023c: PHI (r9v13 int) = (r9v6 int), (r9v5 int), (r9v5 int) binds: [B:619:0x02d8, B:609:0x02b3, B:572:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x02a9  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.android.gms.internal.ads.dx0, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // com.google.android.gms.internal.ads.e61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oO(com.google.android.gms.internal.ads.b61 r24, com.google.android.gms.internal.ads.dx0 r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m61.OooO0oO(com.google.android.gms.internal.ads.b61, com.google.android.gms.internal.ads.dx0):void");
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooO0oo(d61 d61Var, int i, long j) {
        h91 h91Var = d61Var.f18181OooO0Oo;
        if (h91Var != null) {
            String strOooO00o = this.f21098OooOo0o.OooO00o(d61Var.f18179OooO0O0, h91Var);
            HashMap map = this.f21102OooOoo;
            Long l = (Long) map.get(strOooO00o);
            HashMap map2 = this.f21103OooOoo0;
            Long l2 = (Long) map2.get(strOooO00o);
            map.put(strOooO00o, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strOooO00o, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooOO0(AbstractC1632h7 abstractC1632h7) {
        this.f21110Oooo00o = abstractC1632h7;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOO0o(com.google.android.gms.internal.ads.AbstractC1787lf r10, com.google.android.gms.internal.ads.h91 r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m61.OooOO0o(com.google.android.gms.internal.ads.lf, com.google.android.gms.internal.ads.h91):void");
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooOOO(C1721jn c1721jn) {
        dx0 dx0Var = this.f21107Oooo0;
        if (dx0Var != null) {
            o0OoOo0 o0oooo0 = (o0OoOo0) dx0Var.f18419OooOo0o;
            if (o0oooo0.OooOo0 == -1) {
                jb1 jb1Var = new jb1(o0oooo0);
                jb1Var.f20257OooOOoo = c1721jn.f20338OooO00o;
                jb1Var.f20259OooOo00 = c1721jn.f20339OooO0O0;
                this.f21107Oooo0 = new dx0(7, new o0OoOo0(jb1Var), (String) dx0Var.f18417OooOo);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooOOO0(g41 g41Var) {
        this.f21119OoooO00 += g41Var.f19235OooO0oO;
        this.f21118OoooO0 += g41Var.f19234OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooOOOo(int i) {
        if (i == 1) {
            this.f21116Oooo0oo = true;
        }
    }

    public final boolean OooOOo(dx0 dx0Var) {
        String str;
        if (dx0Var == null) {
            return false;
        }
        j61 j61Var = this.f21098OooOo0o;
        String str2 = (String) dx0Var.f18417OooOo;
        synchronized (j61Var) {
            str = j61Var.f20208OooO0o;
        }
        return str2.equals(str);
    }

    public final void OooOOo0(int i, long j, o0OoOo0 o0oooo0, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = l61.OooOO0o(i).setTimeSinceCreatedMillis(j - this.f21100OooOoO0);
        if (o0oooo0 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = o0oooo0.OooOO0o;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = o0oooo0.f22222OooOOO0;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = o0oooo0.f22219OooOO0;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = o0oooo0.f22210OooO;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = o0oooo0.f22229OooOo00;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = o0oooo0.OooOo0;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = o0oooo0.f22236OooOoo0;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = o0oooo0.f22235OooOoo;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = o0oooo0.f22214OooO0Oo;
            if (str4 != null) {
                int i8 = i80.f19994OooO00o;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = o0oooo0.f22230OooOo0O;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f21117OoooO = true;
        this.f21096OooOo.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooOOOO() {
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooO0O0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooO0OO(IOException iOException) {
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooO0Oo(o0OoOo0 o0oooo0) {
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooO0o0(o0OoOo0 o0oooo0) {
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooOO0O(int i) {
    }
}
