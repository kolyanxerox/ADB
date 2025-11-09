package com.ironsource.mediationsdk.demandOnly;

import kotlin.jvm.internal.OooOo;

/* renamed from: com.ironsource.mediationsdk.demandOnly.p */
/* loaded from: classes2.dex */
public interface InterfaceC3385p {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.p$a */
    public static class a implements InterfaceC3385p {

        /* renamed from: a */
        private final String f9778a;

        public a(String plumbus) {
            OooOo.OooO0o0(plumbus, "plumbus");
            this.f9778a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3385p
        public String value() {
            return this.f9778a;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.demandOnly.p$b */
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    String value();
}
