package com.ironsource;

/* renamed from: com.ironsource.h1 */
/* loaded from: classes2.dex */
public interface InterfaceC3171h1 {

    /* renamed from: com.ironsource.h1$a */
    public static final class a implements InterfaceC3171h1 {

        /* renamed from: c */
        public static final C4574a f8789c = new C4574a(null);

        /* renamed from: a */
        private final String f8790a;

        /* renamed from: b */
        private final boolean f8791b;

        /* renamed from: com.ironsource.h1$a$a, reason: collision with other inner class name */
        public static final class C4574a {
            private C4574a() {
            }

            /* renamed from: a */
            public final a m9036a(String str) {
                return new a(str);
            }

            public /* synthetic */ C4574a(kotlin.jvm.internal.OooOO0O oooOO0O) {
                this();
            }
        }

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public static /* synthetic */ a m9032a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f8790a;
            }
            return aVar.m9033a(str);
        }

        /* renamed from: b */
        public final String m9034b() {
            return this.f8790a;
        }

        /* renamed from: c */
        public final String m9035c() {
            return this.f8790a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.OooOo.OooO00o(this.f8790a, ((a) obj).f8790a);
        }

        public int hashCode() {
            String str = this.f8790a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f8790a, new StringBuilder("NotReady(reason="));
        }

        public a(String str) {
            this.f8790a = str;
        }

        /* renamed from: a */
        public final a m9033a(String str) {
            return new a(str);
        }

        public /* synthetic */ a(String str, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC3171h1
        /* renamed from: a */
        public boolean mo9031a() {
            return this.f8791b;
        }
    }

    /* renamed from: com.ironsource.h1$b */
    public static final class b implements InterfaceC3171h1 {

        /* renamed from: a */
        public static final b f8792a = new b();

        /* renamed from: b */
        private static final boolean f8793b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC3171h1
        /* renamed from: a */
        public boolean mo9031a() {
            return f8793b;
        }
    }

    /* renamed from: a */
    boolean mo9031a();
}
