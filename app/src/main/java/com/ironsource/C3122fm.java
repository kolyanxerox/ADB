package com.ironsource;

import com.ironsource.C2982br;
import com.ironsource.C3611s;
import com.ironsource.InterfaceC3765vd;
import com.ironsource.mediationsdk.adquality.C3365a;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.fm */
/* loaded from: classes2.dex */
public final class C3122fm extends C3465ns {

    /* renamed from: com.ironsource.fm$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8589a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8589a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3122fm(C3465ns sdkConfig) {
        super(sdkConfig);
        kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "sdkConfig");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x005a A[PHI: r8
  0x005a: PHI (r8v20 java.lang.Boolean) = (r8v4 java.lang.Boolean), (r8v13 java.lang.Boolean), (r8v22 java.lang.Boolean) binds: [B:46:0x0058, B:52:0x0083, B:43:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.AbstractC3212i7.b m8716a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "adUnitId"
            kotlin.jvm.internal.OooOo.OooO0o0(r8, r0)
            com.ironsource.ws r0 = r7.m11054g()
            com.ironsource.v8 r0 = r0.m12964a()
            com.ironsource.t6 r0 = r0.m12751c()
            java.util.Map r1 = r0.m12393a()
            java.lang.Object r1 = r1.get(r8)
            com.ironsource.t6$b r1 = (com.ironsource.C3688t6.b) r1
            if (r1 == 0) goto L22
        L1d:
            int r1 = r1.m12397b()
            goto L27
        L22:
            com.ironsource.t6$b r1 = r0.m12394b()
            goto L1d
        L27:
            java.util.Map r2 = r0.m12393a()
            java.lang.Object r2 = r2.get(r8)
            com.ironsource.t6$b r2 = (com.ironsource.C3688t6.b) r2
            if (r2 == 0) goto L38
        L33:
            boolean r2 = r2.m12399d()
            goto L3d
        L38:
            com.ironsource.t6$b r2 = r0.m12394b()
            goto L33
        L3d:
            java.util.Map r3 = r0.m12393a()
            java.lang.Object r8 = r3.get(r8)
            com.ironsource.t6$b r8 = (com.ironsource.C3688t6.b) r8
            if (r8 == 0) goto L50
            java.lang.Boolean r8 = r8.m12400e()
            if (r8 == 0) goto L50
            goto L5a
        L50:
            com.ironsource.t6$b r8 = r0.m12394b()
            java.lang.Boolean r8 = r8.m12400e()
            if (r8 == 0) goto L5f
        L5a:
            boolean r8 = r8.booleanValue()
            goto L87
        L5f:
            com.ironsource.ws r8 = r7.m11054g()
            com.ironsource.v8 r8 = r8.m12964a()
            com.ironsource.y3 r8 = r8.m12750b()
            com.ironsource.w3 r8 = r8.m13151a()
            java.util.Map r8 = r8.m12839a()
            com.unity3d.mediation.LevelPlay$AdFormat r0 = com.unity3d.mediation.LevelPlay.AdFormat.BANNER
            java.lang.Object r8 = r8.get(r0)
            com.ironsource.p r8 = (com.ironsource.C3506p) r8
            if (r8 == 0) goto L82
            java.lang.Boolean r8 = r8.m11245a()
            goto L83
        L82:
            r8 = 0
        L83:
            if (r8 == 0) goto L86
            goto L5a
        L86:
            r8 = 0
        L87:
            if (r8 == 0) goto L8c
            com.ironsource.i7$c r8 = com.ironsource.AbstractC3212i7.c.TIMED_SHOW
            goto L8e
        L8c:
            com.ironsource.i7$c r8 = com.ironsource.AbstractC3212i7.c.TIMED_LOAD
        L8e:
            com.ironsource.i7$b r0 = new com.ironsource.i7$b
            long r3 = (long) r1
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.<init>(r8, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3122fm.m8716a(java.lang.String):com.ironsource.i7$b");
    }

    /* renamed from: b */
    public final long m8720b(LevelPlay.AdFormat adFormat) {
        C3611s.d dVarM11784b;
        Long lM11791d;
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        C3611s c3611s = m11054g().m12964a().m12749a().get(adFormat);
        long jLongValue = (c3611s == null || (dVarM11784b = c3611s.m11784b()) == null || (lM11791d = dVarM11784b.m11791d()) == null) ? 60L : lM11791d.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    /* renamed from: c */
    public final C3340lr m8723c(C3842xm tools) {
        kotlin.jvm.internal.OooOo.OooO0o0(tools, "tools");
        C3611s c3611s = m11054g().m12964a().m12749a().get(LevelPlay.AdFormat.REWARDED);
        return new C3340lr(tools, c3611s != null ? c3611s.m11783a() : null, c3611s != null ? c3611s.m11785c() : null);
    }

    /* renamed from: d */
    public final List<C2980bp> m8726d(LevelPlay.AdFormat adFormat, String adUnitId) {
        Map<String, C2982br.b> mapM7980a;
        C2982br.b bVar;
        List<String> listM7981a;
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        C2982br.a aVar = m11054g().m12967d().m7979a().get(adFormat);
        if (aVar == null || (mapM7980a = aVar.m7980a()) == null || (bVar = mapM7980a.get(adUnitId)) == null || (listM7981a = bVar.m7981a()) == null) {
            return o00O0.oo000o.f31251OooOo0O;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM7981a.iterator();
        while (it.hasNext()) {
            C2980bp c2980bp = m11054g().m12968e().m8389a().get((String) it.next());
            if (c2980bp != null) {
                arrayList.add(c2980bp);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<LevelPlayAdSize> m8727h() {
        List<String> listM12396a = m11054g().m12964a().m12751c().m12394b().m12396a();
        ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(listM12396a, 10));
        Iterator<T> it = listM12396a.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final float m8728i() {
        return m11054g().m12964a().m12751c().m12394b().m12398c();
    }

    /* renamed from: j */
    public final boolean m8729j() {
        C3365a c3365aM12632a = m11051d().m11635c().m12632a();
        return c3365aM12632a != null && c3365aM12632a.m10047b();
    }

    /* renamed from: k */
    public final boolean m8730k() {
        return m11054g().m12964a().m12750b().m13154d();
    }

    /* renamed from: a */
    public final C3613s1 m8717a(C3842xm tools) {
        kotlin.jvm.internal.OooOo.OooO0o0(tools, "tools");
        return new C3613s1(tools, m11054g().m12964a().m12749a());
    }

    /* renamed from: b */
    public final C3533pq m8721b(C3842xm tools) {
        kotlin.jvm.internal.OooOo.OooO0o0(tools, "tools");
        return new C3533pq(tools, m11054g().m12964a().m12749a());
    }

    /* renamed from: c */
    public final Placement m8724c(LevelPlay.AdFormat adFormat, String str) {
        Placement placementM7983a;
        InterstitialPlacement interstitialPlacementM12683a;
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        int i = a.f8589a[adFormat.ordinal()];
        if (i == 1) {
            C2983bs c2983bsM12637f = m11051d().m11635c().m12637f();
            if (c2983bsM12637f == null || (placementM7983a = c2983bsM12637f.m7983a(str)) == null) {
                return null;
            }
            return new Placement(placementM7983a.getPlacementId(), placementM7983a.getPlacementName(), placementM7983a.isDefault(), placementM7983a.getRewardName(), placementM7983a.getRewardAmount(), placementM7983a.getPlacementAvailabilitySettings());
        }
        if (i == 2) {
            C3736uj c3736ujM12635d = m11051d().m11635c().m12635d();
            if (c3736ujM12635d == null || (interstitialPlacementM12683a = c3736ujM12635d.m12683a(str)) == null) {
                return null;
            }
            return new Placement(interstitialPlacementM12683a);
        }
        if (i == 3) {
            C3723u6 c3723u6M12634c = m11051d().m11635c().m12634c();
            if (c3723u6M12634c == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            C3177h7 c3177h7M12543a = c3723u6M12634c.m12543a(str);
            if (c3177h7M12543a == null) {
                c3177h7M12543a = c3723u6M12634c.m12552i();
                kotlin.jvm.internal.OooOo.OooO0Oo(c3177h7M12543a, "config.defaultBannerPlacement");
            }
            return new Placement(c3177h7M12543a);
        }
        if (i != 4) {
            throw new OooOOO0.OooO00o();
        }
        C3705tn c3705tnM12636e = m11051d().m11635c().m12636e();
        if (c3705tnM12636e != null && str != null) {
            C3089eo c3089eoM12460a = c3705tnM12636e.m12460a(str);
            if (c3089eoM12460a == null) {
                c3089eoM12460a = c3705tnM12636e.m12475e();
            }
            if (c3089eoM12460a != null) {
                return new Placement(c3089eoM12460a);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    /* renamed from: a */
    private final InterfaceC3765vd.c m8715a(LevelPlay.AdFormat adFormat, String str) {
        C3611s.d dVarM11784b;
        C3880yq c3880yqM11794g;
        Map<String, C3611s.d> mapM11783a;
        C3611s.d dVar;
        C3880yq c3880yqM11794g2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        C3611s c3611s = m11054g().m12964a().m12749a().get(adFormat);
        InterfaceC3765vd.c cVarM13217a = null;
        InterfaceC3765vd.c cVarM13217a2 = (c3611s == null || (mapM11783a = c3611s.m11783a()) == null || (dVar = mapM11783a.get(str)) == null || (c3880yqM11794g2 = dVar.m11794g()) == null) ? null : c3880yqM11794g2.m13217a();
        if (c3611s != null && (dVarM11784b = c3611s.m11784b()) != null && (c3880yqM11794g = dVarM11784b.m11794g()) != null) {
            cVarM13217a = c3880yqM11794g.m13217a();
        }
        if (cVarM13217a2 == null) {
            cVarM13217a2 = cVarM13217a;
        }
        return cVarM13217a2 != null ? cVarM13217a2 : z ? InterfaceC3765vd.c.PROGRESSIVE_ON_SHOW_SUCCESS : InterfaceC3765vd.c.SINGLE;
    }

    /* renamed from: b */
    public final InterfaceC3765vd.a m8722b(LevelPlay.AdFormat adFormat, String adUnitId) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        return new InterfaceC3765vd.a(m8715a(adFormat, adUnitId));
    }

    /* renamed from: a */
    public final List<String> m8718a(LevelPlay.AdFormat adFormat) {
        Map<String, C2982br.b> mapM7980a;
        Set<String> setKeySet;
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        C2982br.a aVar = m11054g().m12967d().m7979a().get(adFormat);
        return (aVar == null || (mapM7980a = aVar.m7980a()) == null || (setKeySet = mapM7980a.keySet()) == null) ? o00O0.oo000o.f31251OooOo0O : o00O0.OooOo00.Oooo0o0(setKeySet);
    }

    /* renamed from: c */
    public final List<C2980bp> m8725c(LevelPlay.AdFormat adFormat) {
        Map<String, C2982br.b> mapM7980a;
        Set<String> setKeySet;
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        C2982br.a aVar = m11054g().m12967d().m7979a().get(adFormat);
        if (aVar != null && (mapM7980a = aVar.m7980a()) != null && (setKeySet = mapM7980a.keySet()) != null) {
            ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(m8726d(adFormat, (String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o00O0.o00O0O.OooOo0o((Iterable) obj, arrayList2);
            }
            return o00O0.OooOo00.Oooo0o0(o00O0.OooOo00.Oooo0oO(arrayList2));
        }
        return o00O0.oo000o.f31251OooOo0O;
    }

    /* renamed from: a */
    public final boolean m8719a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, C2982br.b> mapM7980a;
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        C2982br.a aVar = m11054g().m12967d().m7979a().get(adFormat);
        return (aVar == null || (mapM7980a = aVar.m7980a()) == null || !mapM7980a.containsKey(adUnitId)) ? false : true;
    }
}
