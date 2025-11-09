package com.ironsource;

import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.df */
/* loaded from: classes2.dex */
public final class C3040df {

    /* renamed from: com.ironsource.df$a */
    public static final class a implements o00O0o00.OooOOOO {

        /* renamed from: a */
        private WeakReference<T> f8275a;

        public a(T t) {
            this.f8275a = new WeakReference<>(t);
        }

        /* renamed from: a */
        public final WeakReference<T> m8305a() {
            return this.f8275a;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
        @Override // o00O0o00.OooOOO
        public T getValue(Object thisRef, o00O0o0o.o00000O property) {
            kotlin.jvm.internal.OooOo.OooO0o0(thisRef, "thisRef");
            kotlin.jvm.internal.OooOo.OooO0o0(property, "property");
            return this.f8275a.get();
        }

        public void setValue(Object thisRef, o00O0o0o.o00000O property, T t) {
            kotlin.jvm.internal.OooOo.OooO0o0(thisRef, "thisRef");
            kotlin.jvm.internal.OooOo.OooO0o0(property, "property");
            this.f8275a = new WeakReference<>(t);
        }

        /* renamed from: a */
        public final void m8306a(WeakReference<T> weakReference) {
            kotlin.jvm.internal.OooOo.OooO0o0(weakReference, "<set-?>");
            this.f8275a = weakReference;
        }
    }

    /* renamed from: a */
    public static final <T> o00O0o00.OooOOOO m8303a(T t) {
        return new a(t);
    }

    /* renamed from: a */
    public static /* synthetic */ o00O0o00.OooOOOO m8304a(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m8303a(obj);
    }
}
