package com.ironsource;

import com.ironsource.InterfaceC3472o0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* renamed from: com.ironsource.q0 */
/* loaded from: classes2.dex */
public final class C3542q0 implements InterfaceC3472o0, InterfaceC3472o0.a {

    /* renamed from: a */
    private final ReadWriteLock f10864a;

    /* renamed from: b */
    private final Map<String, C3437n0> f10865b;

    public C3542q0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC3472o0
    /* renamed from: a */
    public C3437n0 mo11061a(String adId) {
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        this.f10864a.readLock().lock();
        try {
            return this.f10865b.get(adId);
        } finally {
            this.f10864a.readLock().unlock();
        }
    }

    public C3542q0(ReadWriteLock readWriteLock) {
        kotlin.jvm.internal.OooOo.OooO0o0(readWriteLock, "readWriteLock");
        this.f10864a = readWriteLock;
        this.f10865b = new LinkedHashMap();
    }

    @Override // com.ironsource.InterfaceC3472o0
    /* renamed from: a */
    public List<C3437n0> mo11062a() {
        this.f10864a.readLock().lock();
        List<C3437n0> listOooo0o0 = o00O0.OooOo00.Oooo0o0(this.f10865b.values());
        this.f10864a.readLock().unlock();
        return listOooo0o0;
    }

    public /* synthetic */ C3542q0(ReadWriteLock readWriteLock, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.InterfaceC3472o0.a
    /* renamed from: a */
    public void mo11063a(EnumC3310l1 adStatus, String adId) {
        kotlin.jvm.internal.OooOo.OooO0o0(adStatus, "adStatus");
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        this.f10864a.writeLock().lock();
        try {
            C3437n0 c3437n0 = this.f10865b.get(adId);
            if (c3437n0 != null) {
                c3437n0.m10901a(adStatus);
                c3437n0.m10900a(System.currentTimeMillis() / 1000.0d);
            }
        } finally {
            this.f10864a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC3472o0.a
    /* renamed from: a */
    public void mo11064a(C3437n0 adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10864a.writeLock().lock();
        try {
            if (this.f10865b.get(adInfo.m10905c()) == null) {
                this.f10865b.put(adInfo.m10905c(), adInfo);
            }
        } finally {
            this.f10864a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC3472o0.a
    /* renamed from: a */
    public void mo11065a(JSONObject json, EnumC3310l1 adStatus, String adId) {
        kotlin.jvm.internal.OooOo.OooO0o0(json, "json");
        kotlin.jvm.internal.OooOo.OooO0o0(adStatus, "adStatus");
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        this.f10864a.writeLock().lock();
        try {
            C3437n0 c3437n0 = this.f10865b.get(adId);
            if (c3437n0 != null) {
                String bundleId = json.optString("bundleId");
                kotlin.jvm.internal.OooOo.OooO0Oo(bundleId, "bundleId");
                if (bundleId.length() > 0) {
                    c3437n0.m10903a(bundleId);
                }
                String dynamicDemandSourceId = json.optString("dynamicDemandSource");
                kotlin.jvm.internal.OooOo.OooO0Oo(dynamicDemandSourceId, "dynamicDemandSourceId");
                if (dynamicDemandSourceId.length() > 0) {
                    c3437n0.m10902a(EnumC3558qg.f10939b.m11560a(dynamicDemandSourceId));
                }
                c3437n0.m10901a(adStatus);
            }
            this.f10864a.writeLock().unlock();
        } catch (Throwable th) {
            this.f10864a.writeLock().unlock();
            throw th;
        }
    }
}
