package com.ironsource;

/* renamed from: com.ironsource.bf */
/* loaded from: classes2.dex */
public interface InterfaceC2970bf {

    /* renamed from: com.ironsource.bf$a */
    public static final class a implements InterfaceC2970bf {

        /* renamed from: a */
        private final InterfaceC3868ye f7599a;

        public a(InterfaceC3868ye failure) {
            kotlin.jvm.internal.OooOo.OooO0o0(failure, "failure");
            this.f7599a = failure;
        }

        /* renamed from: a */
        public static /* synthetic */ a m7915a(a aVar, InterfaceC3868ye interfaceC3868ye, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC3868ye = aVar.f7599a;
            }
            return aVar.m7916a(interfaceC3868ye);
        }

        /* renamed from: b */
        public final InterfaceC3868ye m7918b() {
            return this.f7599a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.OooOo.OooO00o(this.f7599a, ((a) obj).f7599a);
        }

        public int hashCode() {
            return this.f7599a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.f7599a + ')';
        }

        /* renamed from: a */
        public final a m7916a(InterfaceC3868ye failure) {
            kotlin.jvm.internal.OooOo.OooO0o0(failure, "failure");
            return new a(failure);
        }

        /* renamed from: a */
        public final InterfaceC3868ye m7917a() {
            return this.f7599a;
        }

        @Override // com.ironsource.InterfaceC2970bf
        /* renamed from: a */
        public void mo7914a(InterfaceC3005cf handler) {
            kotlin.jvm.internal.OooOo.OooO0o0(handler, "handler");
            handler.mo8125a(this.f7599a);
        }
    }

    /* renamed from: a */
    default void mo7914a(InterfaceC3005cf handler) {
        kotlin.jvm.internal.OooOo.OooO0o0(handler, "handler");
    }
}
