package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.cq */
/* loaded from: classes2.dex */
public final class C3016cq implements InterfaceC3151gg {

    /* renamed from: a */
    private final InterfaceC3213i8 f7803a;

    /* renamed from: b */
    private ConcurrentHashMap<String, Long> f7804b;

    public C3016cq(InterfaceC3213i8 storage) {
        kotlin.jvm.internal.OooOo.OooO0o0(storage, "storage");
        this.f7803a = storage;
        this.f7804b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.InterfaceC3151gg
    /* renamed from: a */
    public Long mo8202a(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        Long l = this.f7804b.get(identifier);
        if (l != null) {
            return l;
        }
        Long lMo9296b = this.f7803a.mo9296b(identifier);
        if (lMo9296b == null) {
            return null;
        }
        long jLongValue = lMo9296b.longValue();
        this.f7804b.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.InterfaceC3151gg
    /* renamed from: a */
    public void mo8203a(long j, String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        this.f7804b.put(identifier, Long.valueOf(j));
        this.f7803a.mo9297b(identifier, j);
    }
}
