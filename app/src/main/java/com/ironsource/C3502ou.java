package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.ou */
/* loaded from: classes2.dex */
public final class C3502ou implements InterfaceC3420mi {

    /* renamed from: a */
    private final InterfaceC3213i8 f10713a;

    /* renamed from: b */
    private ConcurrentHashMap<String, Integer> f10714b;

    /* renamed from: c */
    private ConcurrentHashMap<String, Long> f10715c;

    public C3502ou(InterfaceC3213i8 storage) {
        kotlin.jvm.internal.OooOo.OooO0o0(storage, "storage");
        this.f10713a = storage;
        this.f10714b = new ConcurrentHashMap<>();
        this.f10715c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.InterfaceC3420mi
    /* renamed from: a */
    public int mo10814a(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        Integer num = this.f10714b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer numMo9298c = this.f10713a.mo9298c(identifier);
        if (numMo9298c == null) {
            this.f10714b.put(identifier, 0);
            return 0;
        }
        int iIntValue = numMo9298c.intValue();
        this.f10714b.put(identifier, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    @Override // com.ironsource.InterfaceC3420mi
    /* renamed from: b */
    public Long mo10817b(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        Long l = this.f10715c.get(identifier);
        if (l != null) {
            return l;
        }
        Long lMo9293a = this.f10713a.mo9293a(identifier);
        if (lMo9293a == null) {
            return null;
        }
        long jLongValue = lMo9293a.longValue();
        this.f10715c.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.InterfaceC3420mi
    /* renamed from: a */
    public void mo10815a(int i, String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        this.f10714b.put(identifier, Integer.valueOf(i));
        this.f10713a.mo9294a(identifier, i);
    }

    @Override // com.ironsource.InterfaceC3420mi
    /* renamed from: a */
    public void mo10816a(long j, String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        this.f10715c.put(identifier, Long.valueOf(j));
        this.f10713a.mo9295a(identifier, j);
    }
}
