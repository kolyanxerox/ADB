package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.tm */
/* loaded from: classes2.dex */
public interface InterfaceC3704tm<T> {

    /* renamed from: com.ironsource.tm$a */
    public static final class a<T> implements InterfaceC3704tm<T> {

        /* renamed from: a */
        private final IronSourceError f12082a;

        public a(IronSourceError error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            this.f12082a = error;
        }

        /* renamed from: a */
        public final IronSourceError m12453a() {
            return this.f12082a;
        }

        /* renamed from: b */
        public final IronSourceError m12455b() {
            return this.f12082a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.OooOo.OooO00o(this.f12082a, ((a) obj).f12082a);
        }

        public int hashCode() {
            return this.f12082a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f12082a + ')';
        }

        /* renamed from: a */
        public final a<T> m12454a(IronSourceError error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            return new a<>(error);
        }

        /* renamed from: a */
        public static /* synthetic */ a m12452a(a aVar, IronSourceError ironSourceError, int i, Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.f12082a;
            }
            return aVar.m12454a(ironSourceError);
        }
    }

    /* renamed from: com.ironsource.tm$b */
    public static final class b<T> implements InterfaceC3704tm<T> {

        /* renamed from: a */
        private final T f12083a;

        public b(T t) {
            this.f12083a = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ b m12456a(b bVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = bVar.f12083a;
            }
            return bVar.m12457a(obj);
        }

        /* renamed from: b */
        public final T m12459b() {
            return this.f12083a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.OooOo.OooO00o(this.f12083a, ((b) obj).f12083a);
        }

        public int hashCode() {
            T t = this.f12083a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.f12083a + ')';
        }

        /* renamed from: a */
        public final b<T> m12457a(T t) {
            return new b<>(t);
        }

        /* renamed from: a */
        public final T m12458a() {
            return this.f12083a;
        }
    }
}
