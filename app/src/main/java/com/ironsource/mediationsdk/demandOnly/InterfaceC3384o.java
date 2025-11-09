package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC3460nn;
import com.ironsource.InterfaceC3483ob;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.ironsource.mediationsdk.demandOnly.o */
/* loaded from: classes2.dex */
public interface InterfaceC3384o extends InterfaceC3483ob<String> {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.o$a */
    public static final class a implements InterfaceC3384o {

        /* renamed from: a */
        private final String f9777a;

        public a(String rowAdm) {
            OooOo.OooO0o0(rowAdm, "rowAdm");
            this.f9777a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC3483ob
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String mo10259a() {
            return this.f9777a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3384o
        /* renamed from: a */
        public <T> T mo10258a(InterfaceC3460nn<String, T> mapper) {
            OooOo.OooO0o0(mapper, "mapper");
            return mapper.mo8213a(this.f9777a);
        }
    }

    /* renamed from: a */
    <T> T mo10258a(InterfaceC3460nn<String, T> interfaceC3460nn);
}
