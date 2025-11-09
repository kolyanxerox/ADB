package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.qs */
/* loaded from: classes2.dex */
public final class C1985qs implements InterfaceC1481d3 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final AtomicReference f23689OooOo = new AtomicReference();

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final InterfaceC1722jo f23690OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Executor f23691OooOo0o;

    public C1985qs(InterfaceC1722jo interfaceC1722jo, Executor executor) {
        this.f23690OooOo0O = interfaceC1722jo;
        this.f23691OooOo0o = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final synchronized void Ooooo00(C1444c3 c1444c3) {
        if (this.f23690OooOo0O != null) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O00o)).booleanValue()) {
                if (c1444c3.f17668OooOO0) {
                    AtomicReference atomicReference = this.f23689OooOo;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.f23691OooOo0o;
                        InterfaceC1722jo interfaceC1722jo = this.f23690OooOo0O;
                        Objects.requireNonNull(interfaceC1722jo);
                        executor.execute(new RunnableC1911os(interfaceC1722jo, 0));
                        return;
                    }
                }
                if (!c1444c3.f17668OooOO0) {
                    AtomicReference atomicReference2 = this.f23689OooOo;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.f23691OooOo0o;
                        InterfaceC1722jo interfaceC1722jo2 = this.f23690OooOo0O;
                        Objects.requireNonNull(interfaceC1722jo2);
                        executor2.execute(new RunnableC1911os(interfaceC1722jo2, 1));
                    }
                }
            }
        }
    }
}
