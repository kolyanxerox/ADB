package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.ironsource.C3034d9;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class w41 extends p11 {

    /* renamed from: o00ooo */
    public static final /* synthetic */ int f25183o00ooo = 0;

    /* renamed from: OooOo */
    public final ab1 f25184OooOo;

    /* renamed from: OooOoO */
    public final o0000o0.OooOOO f25185OooOoO;

    /* renamed from: OooOoO0 */
    public final C1855n9 f25186OooOoO0;

    /* renamed from: OooOoOO */
    public final Context f25187OooOoOO;

    /* renamed from: OooOoo */
    public final f81[] f25188OooOoo;

    /* renamed from: OooOoo0 */
    public final b61 f25189OooOoo0;

    /* renamed from: OooOooO */
    public final xa1 f25190OooOooO;

    /* renamed from: OooOooo */
    public final m60 f25191OooOooo;

    /* renamed from: Oooo */
    public final t41 f25192Oooo;

    /* renamed from: Oooo0 */
    public final C1528ee f25193Oooo0;

    /* renamed from: Oooo000 */
    public final b51 f25194Oooo000;

    /* renamed from: Oooo00O */
    public final t00 f25195Oooo00O;

    /* renamed from: Oooo00o */
    public final CopyOnWriteArraySet f25196Oooo00o;

    /* renamed from: Oooo0O0 */
    public final ArrayList f25197Oooo0O0;

    /* renamed from: Oooo0OO */
    public final boolean f25198Oooo0OO;

    /* renamed from: Oooo0o */
    public final Looper f25199Oooo0o;

    /* renamed from: Oooo0o0 */
    public final h61 f25200Oooo0o0;

    /* renamed from: Oooo0oO */
    public final gb1 f25201Oooo0oO;

    /* renamed from: Oooo0oo */
    public final k50 f25202Oooo0oo;

    /* renamed from: OoooO */
    public int f25203OoooO;

    /* renamed from: OoooO0 */
    public final f41 f25204OoooO0;

    /* renamed from: OoooO00 */
    public final u41 f25205OoooO00;

    /* renamed from: OoooO0O */
    public final long f25206OoooO0O;

    /* renamed from: OoooOO0 */
    public int f25207OoooOO0;

    /* renamed from: OoooOOO */
    public final a61 f25208OoooOOO;

    /* renamed from: OoooOOo */
    public final n41 f25209OoooOOo;

    /* renamed from: OoooOo0 */
    public C1855n9 f25210OoooOo0;

    /* renamed from: OoooOoO */
    public C1626h1 f25211OoooOoO;

    /* renamed from: OoooOoo */
    public Surface f25212OoooOoo;

    /* renamed from: Ooooo00 */
    public Surface f25213Ooooo00;

    /* renamed from: Ooooo0o */
    public final int f25214Ooooo0o;

    /* renamed from: OooooO0 */
    public y40 f25215OooooO0;

    /* renamed from: OooooOO */
    public final j50 f25216OooooOO;

    /* renamed from: OooooOo */
    public float f25217OooooOo;

    /* renamed from: Oooooo */
    public final boolean f25218Oooooo;

    /* renamed from: Oooooo0 */
    public boolean f25219Oooooo0;

    /* renamed from: OoooooO */
    public boolean f25220OoooooO;

    /* renamed from: Ooooooo */
    public final int f25221Ooooooo;
    public boolean o000oOoO;

    /* renamed from: o00O0O */
    public int f25222o00O0O;

    /* renamed from: o00Oo0 */
    public long f25223o00Oo0;

    /* renamed from: o00Ooo */
    public final rh0 f25224o00Ooo;

    /* renamed from: o00o0O */
    public da1 f25225o00o0O;

    /* renamed from: o0OoOo0 */
    public C1626h1 f25226o0OoOo0;

    /* renamed from: ooOO */
    public r51 f25227ooOO;

    static {
        AbstractC2030s.OooO00o("media3.exoplayer");
    }

    public w41(m41 m41Var, b61 b61Var) {
        Throwable th;
        o61 o61Var;
        o61 o61Var2;
        boolean zEquals;
        super(5);
        this.f25185OooOoO = new o0000o0.OooOOO(2);
        try {
            AbstractC1641hg.OooOOOO("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + i80.f19999OooO0o0 + C3034d9.i.f8179e);
            this.f25187OooOoOO = m41Var.f21062OooO00o.getApplicationContext();
            this.f25200Oooo0o0 = new h61(m41Var.f21063OooO0O0);
            this.f25221Ooooooo = m41Var.f21061OooO;
            this.f25216OooooOO = m41Var.f21070OooOO0;
            this.f25214Ooooo0o = m41Var.f21071OooOO0O;
            this.f25219Oooooo0 = false;
            this.f25206OoooO0O = m41Var.f21074OooOOOO;
            t41 t41Var = new t41(this);
            this.f25192Oooo = t41Var;
            this.f25205OoooO00 = new u41();
            Handler handler = new Handler(m41Var.f21069OooO0oo);
            this.f25188OooOoo = ((C1847n1) m41Var.f21064OooO0OO.f21493OooOo0o).OooO00o(handler, t41Var, t41Var);
            this.f25190OooOooO = (xa1) m41Var.f21067OooO0o0.mo13704zza();
            Context context = m41Var.f21065OooO0Oo.f24886OooOo0O;
            new o00000();
            new C1548ey(context, 28);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            map.clear();
            map2.clear();
            this.f25201Oooo0oO = gb1.OooO00o(m41Var.f21068OooO0oO.f24565OooOo0O);
            this.f25198Oooo0OO = m41Var.OooOO0o;
            this.f25208OoooOOO = m41Var.f21073OooOOO0;
            Looper looper = m41Var.f21069OooO0oo;
            this.f25199Oooo0o = looper;
            k50 k50Var = m41Var.f21063OooO0O0;
            this.f25202Oooo0oo = k50Var;
            this.f25189OooOoo0 = b61Var;
            this.f25195Oooo00O = new t00(looper, k50Var, new qv0(20));
            this.f25196Oooo00o = new CopyOnWriteArraySet();
            this.f25197Oooo0O0 = new ArrayList();
            this.f25225o00o0O = new da1();
            this.f25209OoooOOo = n41.f21412OooO00o;
            m61 m61Var = null;
            this.f25184OooOo = new ab1(new y51[2], new za1[2], C1977qk.f23622OooO0O0, null);
            this.f25193Oooo0 = new C1528ee();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i = 0; i < 20; i++) {
                int i2 = iArr[i];
                af0.OooooO0(!false);
                sparseBooleanArray.append(i2, true);
            }
            this.f25190OooOooO.getClass();
            af0.OooooO0(!false);
            sparseBooleanArray.append(29, true);
            af0.OooooO0(!false);
            ka1 ka1Var = new ka1(sparseBooleanArray);
            this.f25186OooOoO0 = new C1855n9(ka1Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < ka1Var.f20471OooO00o.size(); i3++) {
                int iOooO00o = ka1Var.OooO00o(i3);
                af0.OooooO0(!false);
                sparseBooleanArray2.append(iOooO00o, true);
            }
            af0.OooooO0(!false);
            sparseBooleanArray2.append(4, true);
            af0.OooooO0(!false);
            sparseBooleanArray2.append(10, true);
            af0.OooooO0(!false);
            this.f25210OoooOo0 = new C1855n9(new ka1(sparseBooleanArray2));
            this.f25191OooOooo = this.f25202Oooo0oo.OooO00o(this.f25199Oooo0o, null);
            rh0 rh0Var = new rh0(this);
            this.f25224o00Ooo = rh0Var;
            this.f25227ooOO = r51.OooO0oO(this.f25184OooOo);
            this.f25200Oooo0o0.OooO0o(this.f25189OooOoo0, this.f25199Oooo0o);
            if (i80.f19994OooO00o < 31) {
                o61Var2 = new o61(m41Var.f21076OooOOo);
                th = null;
            } else {
                Context context2 = this.f25187OooOoOO;
                boolean z = m41Var.f21075OooOOOo;
                String str = m41Var.f21076OooOOo;
                MediaMetricsManager mediaMetricsManagerOooO0oO = OooOO0.OooO0O0.OooO0oO(context2.getSystemService("media_metrics"));
                if (mediaMetricsManagerOooO0oO == null) {
                    th = null;
                } else {
                    th = null;
                    m61Var = new m61(context2, mediaMetricsManagerOooO0oO.createPlaybackSession());
                }
                if (m61Var == null) {
                    AbstractC1641hg.OooOOo0("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    o61Var = new o61(LogSessionId.LOG_SESSION_ID_NONE, str);
                } else {
                    if (z) {
                        o0000o0o(m61Var);
                    }
                    o61Var = new o61(m61Var.f21096OooOo.getSessionId(), str);
                }
                o61Var2 = o61Var;
            }
            this.f25194Oooo000 = new b51(this.f25188OooOoo, this.f25190OooOooO, this.f25184OooOo, (d51) m41Var.f21066OooO0o.mo13704zza(), this.f25201Oooo0oO, this.f25200Oooo0o0, this.f25208OoooOOO, m41Var.f21078OooOOoo, m41Var.f21072OooOOO, this.f25199Oooo0o, this.f25202Oooo0oo, rh0Var, o61Var2, this.f25209OoooOOo);
            this.f25217OooooOo = 1.0f;
            C1626h1 c1626h1 = C1626h1.f19498OooOoO;
            this.f25211OoooOoO = c1626h1;
            this.f25226o0OoOo0 = c1626h1;
            this.f25222o00O0O = -1;
            AudioManager audioManager = (AudioManager) this.f25187OooOoOO.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            int iGenerateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i4 = AbstractC1690is.f20113OooO00o;
            this.f25218Oooooo = true;
            h61 h61Var = this.f25200Oooo0o0;
            t00 t00Var = this.f25195Oooo00O;
            if (h61Var == null) {
                throw th;
            }
            t00Var.OooO00o(h61Var);
            gb1 gb1Var = this.f25201Oooo0oO;
            Handler handler2 = new Handler(this.f25199Oooo0o);
            h61 h61Var2 = this.f25200Oooo0o0;
            gb1Var.getClass();
            h61Var2.getClass();
            ni0 ni0Var = gb1Var.f19311OooOo0o;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ni0Var.f21493OooOo0o;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                db1 db1Var = (db1) it.next();
                if (db1Var.f18231OooO0O0 == h61Var2) {
                    db1Var.f18232OooO0OO = true;
                    copyOnWriteArrayList.remove(db1Var);
                }
            }
            ((CopyOnWriteArrayList) ni0Var.f21493OooOo0o).add(new db1(handler2, h61Var2));
            this.f25196Oooo00o.add(this.f25192Oooo);
            m41Var.f21062OooO00o.getApplicationContext();
            new d41(handler);
            this.f25204OoooO0 = new f41(m41Var.f21062OooO00o, handler, this.f25192Oooo);
            m41Var.f21062OooO00o.getApplicationContext();
            m41Var.f21062OooO00o.getApplicationContext();
            C1721jn c1721jn = C1721jn.f20337OooO0Oo;
            this.f25215OooooO0 = y40.f25844OooO0OO;
            xa1 xa1Var = this.f25190OooOooO;
            j50 j50Var = this.f25216OooooOO;
            synchronized (xa1Var.f25588OooO0OO) {
                zEquals = xa1Var.f25593OooO0oo.equals(j50Var);
                xa1Var.f25593OooO0oo = j50Var;
            }
            if (!zEquals) {
                xa1Var.OooO0OO();
            }
            o0000O(1, 10, Integer.valueOf(iGenerateAudioSessionId));
            o0000O(2, 10, Integer.valueOf(iGenerateAudioSessionId));
            o0000O(1, 3, this.f25216OooooOO);
            o0000O(2, 4, Integer.valueOf(this.f25214Ooooo0o));
            o0000O(2, 5, 0);
            o0000O(1, 9, Boolean.valueOf(this.f25219Oooooo0));
            o0000O(2, 7, this.f25205OoooO00);
            o0000O(6, 8, this.f25205OoooO00);
            o0000O(-1, 16, Integer.valueOf(this.f25221Ooooooo));
            this.f25185OooOoO.OooO0O0();
        } catch (Throwable th2) {
            this.f25185OooOoO.OooO0O0();
            throw th2;
        }
    }

    public static long o0000oO(r51 r51Var) {
        C2045se c2045se = new C2045se();
        C1528ee c1528ee = new C1528ee();
        r51Var.f23756OooO00o.OooOOO(r51Var.f23757OooO0O0.f19657OooO00o, c1528ee);
        long j = r51Var.f23758OooO0OO;
        if (j != -9223372036854775807L) {
            return j;
        }
        r51Var.f23756OooO00o.OooO0o0(c1528ee.f18576OooO0OO, c2045se, 0L).getClass();
        return 0L;
    }

    public final void OooOo00() {
        this.f25185OooOoO.OooO00o();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f25199Oooo0o;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            Locale locale = Locale.US;
            String strOooOO0o = OooO0oO.OooOo.OooOO0o("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f25218Oooooo) {
                throw new IllegalStateException(strOooOO0o);
            }
            AbstractC1641hg.OooOOoo("ExoPlayerImpl", strOooOO0o, this.f25220OoooooO ? null : new IllegalStateException());
            this.f25220OoooooO = true;
        }
    }

    public final int o0000(r51 r51Var) {
        if (r51Var.f23756OooO00o.OooOOOO()) {
            return this.f25222o00O0O;
        }
        return r51Var.f23756OooO00o.OooOOO(r51Var.f23757OooO0O0.f19657OooO00o, this.f25193Oooo0).f18576OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final int o000000() {
        OooOo00();
        int iO0000 = o0000(this.f25227ooOO);
        if (iO0000 == -1) {
            return 0;
        }
        return iO0000;
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final AbstractC1787lf o00000Oo() {
        OooOo00();
        return this.f25227ooOO.f23756OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void o00000oO() {
        OooOo00();
    }

    public final void o00000oo(C2313zn c2313zn) {
        OooOo00();
        t00 t00Var = this.f25200Oooo0o0.f19578OooO0o;
        t00Var.OooO0o0();
        CopyOnWriteArraySet copyOnWriteArraySet = t00Var.f24218OooO0Oo;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e00 e00Var = (e00) it.next();
            if (e00Var.f18441OooO00o.equals(c2313zn)) {
                e00Var.f18444OooO0Oo = true;
                if (e00Var.f18443OooO0OO) {
                    e00Var.f18443OooO0OO = false;
                    ka1 ka1VarOooO0oo = e00Var.f18442OooO0O0.OooO0oo();
                    t00Var.f24217OooO0OO.OooO0oO(e00Var.f18441OooO00o, ka1VarOooO0oo);
                }
                copyOnWriteArraySet.remove(e00Var);
            }
        }
    }

    public final void o0000O(int i, int i2, Object obj) {
        f81[] f81VarArr = this.f25188OooOoo;
        int length = f81VarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            f81 f81Var = f81VarArr[i3];
            if (i == -1 || f81Var.f18818OooOo0o == i) {
                o0000(this.f25227ooOO);
                b51 b51Var = this.f25194Oooo000;
                AbstractC1787lf abstractC1787lf = this.f25227ooOO.f23756OooO00o;
                v51 v51Var = new v51(b51Var, f81Var, b51Var.f17383OooOooo);
                af0.OooooO0(!v51Var.f24855OooO0o0);
                v51Var.f24852OooO0O0 = i2;
                af0.OooooO0(!v51Var.f24855OooO0o0);
                v51Var.f24853OooO0OO = obj;
                af0.OooooO0(!v51Var.f24855OooO0o0);
                v51Var.f24855OooO0o0 = true;
                synchronized (b51Var) {
                    if (b51Var.f17399OoooOO0 || !b51Var.f17383OooOooo.getThread().isAlive()) {
                        AbstractC1641hg.OooOOo0("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                        v51Var.OooO00o(false);
                    } else {
                        b51Var.f17380OooOoo.OooO00o(14, v51Var).OooO00o();
                    }
                }
            }
        }
    }

    public final Pair o0000O0(AbstractC1787lf abstractC1787lf, int i, long j) {
        if (abstractC1787lf.OooOOOO()) {
            this.f25222o00O0O = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f25223o00Oo0 = j;
            return null;
        }
        if (i == -1 || i >= abstractC1787lf.OooO0OO()) {
            i = abstractC1787lf.OooO0oO(false);
            abstractC1787lf.OooO0o0(i, (C2045se) this.f23178OooOo0O, 0L).getClass();
            j = i80.OooOo0O(0L);
        }
        return abstractC1787lf.OooOO0o((C2045se) this.f23178OooOo0O, this.f25193Oooo0, i, i80.OooOOoo(j));
    }

    public final long o0000O00(r51 r51Var) {
        if (!r51Var.f23757OooO0O0.OooO0O0()) {
            return i80.OooOo0O(o0000oo(r51Var));
        }
        Object obj = r51Var.f23757OooO0O0.f19657OooO00o;
        C1528ee c1528ee = this.f25193Oooo0;
        AbstractC1787lf abstractC1787lf = r51Var.f23756OooO00o;
        abstractC1787lf.OooOOO(obj, c1528ee);
        long j = r51Var.f23758OooO0OO;
        if (j == -9223372036854775807L) {
            abstractC1787lf.OooO0o0(o0000(r51Var), (C2045se) this.f23178OooOo0O, 0L).getClass();
            return i80.OooOo0O(0L);
        }
        return i80.OooOo0O(0L) + i80.OooOo0O(j);
    }

    public final r51 o0000O0O(r51 r51Var, AbstractC1787lf abstractC1787lf, Pair pair) {
        List list;
        af0.OoooO0(abstractC1787lf.OooOOOO() || pair != null);
        AbstractC1787lf abstractC1787lf2 = r51Var.f23756OooO00o;
        long jO0000O00 = o0000O00(r51Var);
        r51 r51VarOooO0o = r51Var.OooO0o(abstractC1787lf);
        if (abstractC1787lf.OooOOOO()) {
            h91 h91Var = r51.f23754OooOo00;
            long jOooOOoo = i80.OooOOoo(this.f25223o00Oo0);
            r51 r51VarOooO00o = r51VarOooO0o.OooO0O0(h91Var, jOooOOoo, jOooOOoo, jOooOOoo, 0L, ha1.f19673OooO0Oo, this.f25184OooOo, gn0.f19388OooOoO).OooO00o(h91Var);
            r51VarOooO00o.f23769OooOOOo = r51VarOooO00o.f23770OooOOo;
            return r51VarOooO00o;
        }
        Object obj = r51VarOooO0o.f23757OooO0O0.f19657OooO00o;
        int i = i80.f19994OooO00o;
        boolean zEquals = obj.equals(pair.first);
        h91 h91Var2 = !zEquals ? new h91(pair.first, -1L) : r51VarOooO0o.f23757OooO0O0;
        long jLongValue = ((Long) pair.second).longValue();
        long jOooOOoo2 = i80.OooOOoo(jO0000O00);
        if (!abstractC1787lf2.OooOOOO()) {
            abstractC1787lf2.OooOOO(obj, this.f25193Oooo0);
        }
        if (!zEquals || jLongValue < jOooOOoo2) {
            h91 h91Var3 = h91Var2;
            af0.OooooO0(!h91Var3.OooO0O0());
            ha1 ha1Var = !zEquals ? ha1.f19673OooO0Oo : r51VarOooO0o.f23763OooO0oo;
            ab1 ab1Var = !zEquals ? this.f25184OooOo : r51VarOooO0o.f23755OooO;
            if (zEquals) {
                list = r51VarOooO0o.f23764OooOO0;
            } else {
                pm0 pm0Var = rm0.f23913OooOo0o;
                list = gn0.f19388OooOoO;
            }
            r51 r51VarOooO00o2 = r51VarOooO0o.OooO0O0(h91Var3, jLongValue, jLongValue, jLongValue, 0L, ha1Var, ab1Var, list).OooO00o(h91Var3);
            r51VarOooO00o2.f23769OooOOOo = jLongValue;
            return r51VarOooO00o2;
        }
        if (jLongValue != jOooOOoo2) {
            h91 h91Var4 = h91Var2;
            af0.OooooO0(!h91Var4.OooO0O0());
            long jMax = Math.max(0L, r51VarOooO0o.f23771OooOOo0 - (jLongValue - jOooOOoo2));
            long j = r51VarOooO0o.f23769OooOOOo;
            if (r51VarOooO0o.f23765OooOO0O.equals(r51VarOooO0o.f23757OooO0O0)) {
                j = jLongValue + jMax;
            }
            r51 r51VarOooO0O0 = r51VarOooO0o.OooO0O0(h91Var4, jLongValue, jLongValue, jLongValue, jMax, r51VarOooO0o.f23763OooO0oo, r51VarOooO0o.f23755OooO, r51VarOooO0o.f23764OooOO0);
            r51VarOooO0O0.f23769OooOOOo = j;
            return r51VarOooO0O0;
        }
        int iOooO00o = abstractC1787lf.OooO00o(r51VarOooO0o.f23765OooOO0O.f19657OooO00o);
        if (iOooO00o != -1 && abstractC1787lf.OooO0Oo(iOooO00o, this.f25193Oooo0, false).f18576OooO0OO == abstractC1787lf.OooOOO(h91Var2.f19657OooO00o, this.f25193Oooo0).f18576OooO0OO) {
            return r51VarOooO0o;
        }
        abstractC1787lf.OooOOO(h91Var2.f19657OooO00o, this.f25193Oooo0);
        long jOooO00o = h91Var2.OooO0O0() ? this.f25193Oooo0.OooO00o(h91Var2.f19658OooO0O0, h91Var2.f19659OooO0OO) : this.f25193Oooo0.f18577OooO0Oo;
        h91 h91Var5 = h91Var2;
        r51 r51VarOooO00o3 = r51VarOooO0o.OooO0O0(h91Var5, r51VarOooO0o.f23770OooOOo, r51VarOooO0o.f23770OooOOo, r51VarOooO0o.f23759OooO0Oo, jOooO00o - r51VarOooO0o.f23770OooOOo, r51VarOooO0o.f23763OooO0oo, r51VarOooO0o.f23755OooO, r51VarOooO0o.f23764OooOO0).OooO00o(h91Var5);
        r51VarOooO00o3.f23769OooOOOo = jOooO00o;
        return r51VarOooO00o3;
    }

    public final void o0000OO(l41 l41Var) {
        r51 r51Var = this.f25227ooOO;
        r51 r51VarOooO00o = r51Var.OooO00o(r51Var.f23757OooO0O0);
        r51VarOooO00o.f23769OooOOOo = r51VarOooO00o.f23770OooOOo;
        r51VarOooO00o.f23771OooOOo0 = 0L;
        r51 r51VarOooO0o0 = r51VarOooO00o.OooO0o0(1);
        if (l41Var != null) {
            r51VarOooO0o0 = r51VarOooO0o0.OooO0Oo(l41Var);
        }
        r51 r51Var2 = r51VarOooO0o0;
        this.f25203OoooO++;
        m60 m60Var = this.f25194Oooo000.f17380OooOoo;
        m60Var.getClass();
        q50 q50VarOooO0o0 = m60.OooO0o0();
        q50VarOooO0o0.f23511OooO00o = m60Var.f21095OooO00o.obtainMessage(6);
        q50VarOooO0o0.OooO00o();
        o0000OOo(r51Var2, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0053 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0000OO0(android.view.Surface r12) {
        /*
            r11 = this;
            android.view.Surface r0 = r11.f25212OoooOoo
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L9
            if (r0 == r12) goto L9
            r1 = r2
        L9:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L13
            long r5 = r11.f25206OoooO0O
            goto L14
        L13:
            r5 = r3
        L14:
            com.google.android.gms.internal.ads.b51 r0 = r11.f25194Oooo000
            monitor-enter(r0)
            boolean r7 = r0.f17399OoooOO0     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L53
            android.os.Looper r7 = r0.f17383OooOooo     // Catch: java.lang.Throwable -> L51
            java.lang.Thread r7 = r7.getThread()     // Catch: java.lang.Throwable -> L51
            boolean r7 = r7.isAlive()     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L28
            goto L53
        L28:
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L51
            r7.<init>()     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.m60 r8 = r0.f17380OooOoo     // Catch: java.lang.Throwable -> L51
            android.util.Pair r9 = new android.util.Pair     // Catch: java.lang.Throwable -> L51
            r9.<init>(r12, r7)     // Catch: java.lang.Throwable -> L51
            r10 = 30
            com.google.android.gms.internal.ads.q50 r8 = r8.OooO00o(r10, r9)     // Catch: java.lang.Throwable -> L51
            r8.OooO00o()     // Catch: java.lang.Throwable -> L51
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L53
            com.google.android.gms.internal.ads.pd0 r2 = new com.google.android.gms.internal.ads.pd0     // Catch: java.lang.Throwable -> L51
            r3 = 8
            r2.<init>(r7, r3)     // Catch: java.lang.Throwable -> L51
            r0.Oooo000(r2, r5)     // Catch: java.lang.Throwable -> L51
            boolean r2 = r7.get()     // Catch: java.lang.Throwable -> L51
            monitor-exit(r0)
            goto L54
        L51:
            r12 = move-exception
            goto L79
        L53:
            monitor-exit(r0)
        L54:
            if (r1 == 0) goto L62
            android.view.Surface r0 = r11.f25212OoooOoo
            android.view.Surface r1 = r11.f25213Ooooo00
            if (r0 != r1) goto L62
            r1.release()
            r0 = 0
            r11.f25213Ooooo00 = r0
        L62:
            r11.f25212OoooOoo = r12
            if (r2 != 0) goto L78
            OooOOO0.OooO00o r12 = new OooOOO0.OooO00o
            java.lang.String r0 = "Detaching surface timed out."
            r12.<init>(r0)
            com.google.android.gms.internal.ads.l41 r0 = new com.google.android.gms.internal.ads.l41
            r1 = 2
            r2 = 1003(0x3eb, float:1.406E-42)
            r0.<init>(r1, r2, r12)
            r11.o0000OO(r0)
        L78:
            return
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w41.o0000OO0(android.view.Surface):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void o0000OOO(int i, int i2, boolean z) {
        ?? r14 = (!z || i == -1) ? 0 : 1;
        int i3 = i == 0 ? 1 : 0;
        r51 r51Var = this.f25227ooOO;
        if (r51Var.OooOO0o == r14 && r51Var.f23766OooOOO == i3 && r51Var.f23767OooOOO0 == i2) {
            return;
        }
        this.f25203OoooO++;
        r51 r51VarOooO0OO = r51Var.OooO0OO(i2, i3, r14);
        m60 m60Var = this.f25194Oooo000.f17380OooOoo;
        int i4 = i2 | (i3 << 4);
        m60Var.getClass();
        q50 q50VarOooO0o0 = m60.OooO0o0();
        q50VarOooO0o0.f23511OooO00o = m60Var.f21095OooO00o.obtainMessage(1, r14, i4);
        q50VarOooO0o0.OooO00o();
        o0000OOo(r51VarOooO0OO, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:358:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0541 A[LOOP:0: B:572:0x0539->B:574:0x0541, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x05de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0000OOo(final com.google.android.gms.internal.ads.r51 r33, int r34, boolean r35, int r36, long r37, int r39) {
        /*
            Method dump skipped, instructions count: 1521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w41.o0000OOo(com.google.android.gms.internal.ads.r51, int, boolean, int, long, int):void");
    }

    public final long o0000Oo() {
        OooOo00();
        if (!o0000o0O()) {
            AbstractC1787lf abstractC1787lfO00000Oo = o00000Oo();
            if (abstractC1787lfO00000Oo.OooOOOO()) {
                return -9223372036854775807L;
            }
            return i80.OooOo0O(abstractC1787lfO00000Oo.OooO0o0(o000000(), (C2045se) this.f23178OooOo0O, 0L).f24078OooOO0);
        }
        r51 r51Var = this.f25227ooOO;
        h91 h91Var = r51Var.f23757OooO0O0;
        Object obj = h91Var.f19657OooO00o;
        AbstractC1787lf abstractC1787lf = r51Var.f23756OooO00o;
        C1528ee c1528ee = this.f25193Oooo0;
        abstractC1787lf.OooOOO(obj, c1528ee);
        return i80.OooOo0O(c1528ee.OooO00o(h91Var.f19658OooO0O0, h91Var.f19659OooO0OO));
    }

    public final long o0000Oo0() {
        OooOo00();
        return i80.OooOo0O(o0000oo(this.f25227ooOO));
    }

    public final void o0000OoO(boolean z) {
        OooOo00();
        zzf();
        f41 f41Var = this.f25204OoooO0;
        f41Var.OooO00o();
        f41Var.OooO0O0(0);
        o0000OOO(1, 1, z);
    }

    public final void o0000o() {
        String str;
        boolean z;
        OoooOOO.o0O0oo00 o0o0oo00;
        ra1 ra1Var;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = i80.f19999OooO0o0;
        HashSet hashSet = AbstractC2030s.f23961OooO00o;
        synchronized (AbstractC2030s.class) {
            str = AbstractC2030s.f23962OooO0O0;
        }
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("Release ", hexString, " [AndroidXMedia3/1.5.0-beta01] [", str2, "] [");
        sbOooOOo0.append(str);
        sbOooOOo0.append(C3034d9.i.f8179e);
        AbstractC1641hg.OooOOOO("ExoPlayerImpl", sbOooOOo0.toString());
        OooOo00();
        f41 f41Var = this.f25204OoooO0;
        f41Var.f18781OooO0OO = null;
        f41Var.OooO00o();
        f41Var.OooO0O0(0);
        b51 b51Var = this.f25194Oooo000;
        synchronized (b51Var) {
            if (b51Var.f17399OoooOO0 || !b51Var.f17383OooOooo.getThread().isAlive()) {
                z = true;
            } else {
                b51Var.f17380OooOoo.OooO0OO(7);
                b51Var.Oooo000(new hk0(b51Var, 6), b51Var.f17393Oooo0oO);
                z = b51Var.f17399OoooOO0;
            }
        }
        if (!z) {
            t00 t00Var = this.f25195Oooo00O;
            t00Var.OooO0OO(10, new qv0(19));
            t00Var.OooO0O0();
        }
        this.f25195Oooo00O.OooO0Oo();
        this.f25191OooOooo.f21095OooO00o.removeCallbacksAndMessages(null);
        gb1 gb1Var = this.f25201Oooo0oO;
        h61 h61Var = this.f25200Oooo0o0;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) gb1Var.f19311OooOo0o.f21493OooOo0o;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            db1 db1Var = (db1) it.next();
            if (db1Var.f18231OooO0O0 == h61Var) {
                db1Var.f18232OooO0OO = true;
                copyOnWriteArrayList.remove(db1Var);
            }
        }
        this.f25227ooOO.getClass();
        r51 r51VarOooO0o0 = this.f25227ooOO.OooO0o0(1);
        this.f25227ooOO = r51VarOooO0o0;
        r51 r51VarOooO00o = r51VarOooO0o0.OooO00o(r51VarOooO0o0.f23757OooO0O0);
        this.f25227ooOO = r51VarOooO00o;
        r51VarOooO00o.f23769OooOOOo = r51VarOooO00o.f23770OooOOo;
        this.f25227ooOO.f23771OooOOo0 = 0L;
        h61 h61Var2 = this.f25200Oooo0o0;
        m60 m60Var = h61Var2.f19581OooO0oo;
        af0.OooOo0O(m60Var);
        m60Var.OooO0O0(new b30(h61Var2, 20));
        xa1 xa1Var = this.f25190OooOooO;
        synchronized (xa1Var.f25588OooO0OO) {
            try {
                if (i80.f19994OooO00o >= 32 && (o0o0oo00 = xa1Var.f25592OooO0oO) != null && (ra1Var = (ra1) o0o0oo00.f14471OooOoO0) != null && ((Handler) o0o0oo00.f14468OooOo) != null) {
                    ((Spatializer) o0o0oo00.f14470OooOo0o).removeOnSpatializerStateChangedListener(ra1Var);
                    ((Handler) o0o0oo00.f14468OooOo).removeCallbacksAndMessages(null);
                    o0o0oo00.f14468OooOo = null;
                    o0o0oo00.f14471OooOoO0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xa1Var.f25586OooO00o = null;
        xa1Var.f25587OooO0O0 = null;
        Surface surface = this.f25213Ooooo00;
        if (surface != null) {
            surface.release();
            this.f25213Ooooo00 = null;
        }
        int i = AbstractC1690is.f20113OooO00o;
    }

    public final boolean o0000o0() {
        OooOo00();
        return this.f25227ooOO.OooOO0o;
    }

    public final boolean o0000o0O() {
        OooOo00();
        return this.f25227ooOO.f23757OooO0O0.OooO0O0();
    }

    public final void o0000o0o(e61 e61Var) {
        this.f25200Oooo0o0.f19578OooO0o.OooO00o(e61Var);
    }

    public final long o0000oo(r51 r51Var) {
        if (r51Var.f23756OooO00o.OooOOOO()) {
            return i80.OooOOoo(this.f25223o00Oo0);
        }
        long j = r51Var.f23770OooOOo;
        if (r51Var.f23757OooO0O0.OooO0O0()) {
            return j;
        }
        r51Var.f23756OooO00o.OooOOO(r51Var.f23757OooO0O0.f19657OooO00o, this.f25193Oooo0);
        return j;
    }

    public final void o000OO(int i, int i2) {
        y40 y40Var = this.f25215OooooO0;
        if (i == y40Var.f25845OooO00o && i2 == y40Var.f25846OooO0O0) {
            return;
        }
        this.f25215OooooO0 = new y40(i, i2);
        qv0 qv0Var = new qv0(18);
        t00 t00Var = this.f25195Oooo00O;
        t00Var.OooO0OO(24, qv0Var);
        t00Var.OooO0O0();
        o0000O(2, 14, new y40(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void oo0o0Oo(int i, long j) {
        OooOo00();
        if (i == -1) {
            return;
        }
        af0.OoooO0(i >= 0);
        AbstractC1787lf abstractC1787lf = this.f25227ooOO.f23756OooO00o;
        if (abstractC1787lf.OooOOOO() || i < abstractC1787lf.OooO0OO()) {
            h61 h61Var = this.f25200Oooo0o0;
            if (!h61Var.f19573OooO) {
                d61 d61VarOooO0oO = h61Var.OooO0oO();
                h61Var.f19573OooO = true;
                h61Var.OooO(d61VarOooO0oO, -1, new f61(23));
            }
            this.f25203OoooO++;
            if (o0000o0O()) {
                AbstractC1641hg.OooOOo0("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                oOo0o0oO ooo0o0oo = new oOo0o0oO(this.f25227ooOO);
                ooo0o0oo.OooO00o(1);
                w41 w41Var = (w41) this.f25224o00Ooo.f23865OooOo0O;
                w41Var.getClass();
                w41Var.f25191OooOooo.OooO0O0(new c60(13, w41Var, ooo0o0oo));
                return;
            }
            r51 r51VarOooO0o0 = this.f25227ooOO;
            int i2 = r51VarOooO0o0.f23761OooO0o0;
            if (i2 == 3 || (i2 == 4 && !abstractC1787lf.OooOOOO())) {
                r51VarOooO0o0 = this.f25227ooOO.OooO0o0(2);
            }
            int iO000000 = o000000();
            r51 r51VarO0000O0O = o0000O0O(r51VarOooO0o0, abstractC1787lf, o0000O0(abstractC1787lf, i, j));
            long jOooOOoo = i80.OooOOoo(j);
            b51 b51Var = this.f25194Oooo000;
            b51Var.getClass();
            b51Var.f17380OooOoo.OooO00o(3, new a51(abstractC1787lf, i, jOooOOoo)).OooO00o();
            o0000OOo(r51VarO0000O0O, 0, true, 1, o0000oo(r51VarO0000O0O), iO000000);
        }
    }

    public final int zzf() {
        OooOo00();
        return this.f25227ooOO.f23761OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void zzh() {
        OooOo00();
    }

    public final void zzt() {
        OooOo00();
        f41 f41Var = this.f25204OoooO0;
        o0000o0();
        f41Var.OooO00o();
        f41Var.OooO0O0(0);
        o0000OO(null);
        int i = AbstractC1690is.f20113OooO00o;
        gn0 gn0Var = gn0.f19388OooOoO;
        long j = this.f25227ooOO.f23770OooOOo;
        rm0.OooOOOO(gn0Var);
    }
}
