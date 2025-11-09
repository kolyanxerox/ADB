package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.hr */
/* loaded from: classes2.dex */
abstract class AbstractC3197hr {

    /* renamed from: com.ironsource.hr$a */
    public static final class a extends AbstractC3197hr {

        /* renamed from: a */
        private final IronSourceError f8912a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IronSourceError error) {
            super(null);
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            this.f8912a = error;
        }

        /* renamed from: a */
        public static /* synthetic */ a m9226a(a aVar, IronSourceError ironSourceError, int i, Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.f8912a;
            }
            return aVar.m9227a(ironSourceError);
        }

        /* renamed from: b */
        public final IronSourceError m9229b() {
            return this.f8912a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.OooOo.OooO00o(this.f8912a, ((a) obj).f8912a);
        }

        public int hashCode() {
            return this.f8912a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f8912a + ')';
        }

        /* renamed from: a */
        public final a m9227a(IronSourceError error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            return new a(error);
        }

        /* renamed from: a */
        public final IronSourceError m9228a() {
            return this.f8912a;
        }
    }

    /* renamed from: com.ironsource.hr$b */
    public static final class b extends AbstractC3197hr {

        /* renamed from: a */
        private final C3578r1 f8913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3578r1 adUnitCallback) {
            super(null);
            kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
            this.f8913a = adUnitCallback;
        }

        /* renamed from: a */
        public static /* synthetic */ b m9230a(b bVar, C3578r1 c3578r1, int i, Object obj) {
            if ((i & 1) != 0) {
                c3578r1 = bVar.f8913a;
            }
            return bVar.m9231a(c3578r1);
        }

        /* renamed from: b */
        public final C3578r1 m9233b() {
            return this.f8913a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.OooOo.OooO00o(this.f8913a, ((b) obj).f8913a);
        }

        public int hashCode() {
            return this.f8913a.hashCode();
        }

        public String toString() {
            return "Success(adUnitCallback=" + this.f8913a + ')';
        }

        /* renamed from: a */
        public final b m9231a(C3578r1 adUnitCallback) {
            kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
            return new b(adUnitCallback);
        }

        /* renamed from: a */
        public final C3578r1 m9232a() {
            return this.f8913a;
        }
    }

    private AbstractC3197hr() {
    }

    public /* synthetic */ AbstractC3197hr(kotlin.jvm.internal.OooOO0O oooOO0O) {
        this();
    }
}
