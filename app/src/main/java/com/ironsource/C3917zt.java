package com.ironsource;

import com.ironsource.InterfaceC3257ji;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* renamed from: com.ironsource.zt */
/* loaded from: classes2.dex */
public final class C3917zt implements InterfaceC3257ji, InterfaceC3257ji.a {

    /* renamed from: a */
    private Map<String, C3785w> f13049a = new LinkedHashMap();

    /* renamed from: b */
    private final C3601ro f13050b = new C3601ro();

    /* renamed from: c */
    private final ReadWriteLock f13051c = new ReentrantReadWriteLock();

    /* renamed from: com.ironsource.zt$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13052a;

        static {
            int[] iArr = new int[EnumC3883yt.values().length];
            try {
                iArr[EnumC3883yt.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3883yt.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3883yt.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13052a = iArr;
        }
    }

    /* renamed from: b */
    private final void m13426b() {
        C3849xt configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        C3601ro c3601ro = this.f13050b;
        kotlin.jvm.internal.OooOo.OooO0Oo(configuration, "configuration");
        c3601ro.m11748a(mo9500a(configuration));
        this.f13050b.m11747a(mo9499a());
    }

    @Override // com.ironsource.InterfaceC3257ji
    /* renamed from: a */
    public int mo9498a(IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        this.f13051c.readLock().lock();
        try {
            C3785w c3785w = this.f13049a.get(adFormat.toString());
            return c3785w != null ? c3785w.m12835a() : 0;
        } finally {
            this.f13051c.readLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC3257ji
    /* renamed from: a */
    public List<String> mo9499a() {
        this.f13051c.readLock().lock();
        try {
            Map<String, C3785w> map = this.f13049a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C3785w> entry : map.entrySet()) {
                if (entry.getValue().m12837b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<String> listOooo0o0 = o00O0.OooOo00.Oooo0o0(linkedHashMap.keySet());
            this.f13051c.readLock().unlock();
            return listOooo0o0;
        } catch (Throwable th) {
            this.f13051c.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.InterfaceC3257ji
    /* renamed from: a */
    public JSONObject mo9501a(EnumC3269ju mode) {
        kotlin.jvm.internal.OooOo.OooO0o0(mode, "mode");
        this.f13051c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C3785w> entry : this.f13049a.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectMo8475a = entry.getValue().mo8475a(mode);
                if (jSONObjectMo8475a.length() > 0) {
                    jSONObject.put(key, jSONObjectMo8475a);
                }
            }
            return jSONObject;
        } finally {
            this.f13051c.readLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC3257ji.a
    /* renamed from: a */
    public void mo9502a(AbstractC2950au historyRecord) {
        kotlin.jvm.internal.OooOo.OooO0o0(historyRecord, "historyRecord");
        this.f13051c.writeLock().lock();
        try {
            C3437n0 c3437n0M7834a = historyRecord.m7834a();
            String strValueOf = String.valueOf(c3437n0M7834a != null ? c3437n0M7834a.m10904b() : null);
            Map<String, C3785w> map = this.f13049a;
            C3785w c3785w = map.get(strValueOf);
            if (c3785w == null) {
                c3785w = new C3785w();
                map.put(strValueOf, c3785w);
            }
            c3785w.mo8604a(historyRecord.m7835a(new C3165gu()));
            this.f13051c.writeLock().unlock();
            m13426b();
        } catch (Throwable th) {
            this.f13051c.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.InterfaceC3257ji
    /* renamed from: a */
    public Map<String, JSONObject> mo9500a(C3849xt configuration) {
        Map<String, JSONObject> mapOooOOo;
        kotlin.jvm.internal.OooOo.OooO0o0(configuration, "configuration");
        this.f13051c.readLock().lock();
        try {
            int i = a.f13052a[configuration.m13113a().ordinal()];
            if (i == 1) {
                mapOooOOo = o00O0.o0O0O00.OooOOo(new oo00o.OooOO0(C3451ne.f10528x1, mo9501a(EnumC3269ju.FullHistory)), new oo00o.OooOO0(C3451ne.f10531y1, mo9501a(EnumC3269ju.CurrentlyLoadedAds)));
            } else if (i == 2) {
                mapOooOOo = o00O0.o0O0O00.OooOOo(new oo00o.OooOO0(C3451ne.f10531y1, mo9501a(EnumC3269ju.CurrentlyLoadedAds)));
            } else {
                if (i != 3) {
                    throw new OooOOO0.OooO00o();
                }
                mapOooOOo = o00O0.o00oO0o.f31247OooOo0O;
            }
            this.f13051c.readLock().unlock();
            return mapOooOOo;
        } catch (Throwable th) {
            this.f13051c.readLock().unlock();
            throw th;
        }
    }
}
