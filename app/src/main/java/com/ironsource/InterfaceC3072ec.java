package com.ironsource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ironsource.ec */
/* loaded from: classes2.dex */
public interface InterfaceC3072ec<T> {

    /* renamed from: com.ironsource.ec$a */
    public static final class a<T> implements InterfaceC3072ec<T> {

        /* renamed from: a */
        private final ArrayList<T> f8397a;

        /* renamed from: b */
        private final ArrayList<T> f8398b;

        public a(ArrayList<T> a, ArrayList<T> b) {
            kotlin.jvm.internal.OooOo.OooO0o0(a, "a");
            kotlin.jvm.internal.OooOo.OooO0o0(b, "b");
            this.f8397a = a;
            this.f8398b = b;
        }

        @Override // com.ironsource.InterfaceC3072ec
        public boolean contains(T t) {
            return this.f8397a.contains(t) || this.f8398b.contains(t);
        }

        @Override // com.ironsource.InterfaceC3072ec
        public int size() {
            return this.f8398b.size() + this.f8397a.size();
        }

        @Override // com.ironsource.InterfaceC3072ec
        public List<T> value() {
            return o00O0.OooOo00.Oooo00O(this.f8398b, this.f8397a);
        }
    }

    /* renamed from: com.ironsource.ec$b */
    public static final class b<T> implements InterfaceC3072ec<T> {

        /* renamed from: a */
        private final InterfaceC3072ec<T> f8399a;

        /* renamed from: b */
        private final Comparator<T> f8400b;

        public b(InterfaceC3072ec<T> collection, Comparator<T> comparator) {
            kotlin.jvm.internal.OooOo.OooO0o0(collection, "collection");
            kotlin.jvm.internal.OooOo.OooO0o0(comparator, "comparator");
            this.f8399a = collection;
            this.f8400b = comparator;
        }

        @Override // com.ironsource.InterfaceC3072ec
        public boolean contains(T t) {
            return this.f8399a.contains(t);
        }

        @Override // com.ironsource.InterfaceC3072ec
        public int size() {
            return this.f8399a.size();
        }

        @Override // com.ironsource.InterfaceC3072ec
        public List<T> value() {
            return o00O0.OooOo00.Oooo0(this.f8399a.value(), this.f8400b);
        }
    }

    /* renamed from: com.ironsource.ec$c */
    public static final class c<T> implements InterfaceC3072ec<T> {

        /* renamed from: a */
        private final int f8401a;

        /* renamed from: b */
        private final List<T> f8402b;

        public c(InterfaceC3072ec<T> collection, int i) {
            kotlin.jvm.internal.OooOo.OooO0o0(collection, "collection");
            this.f8401a = i;
            this.f8402b = collection.value();
        }

        /* renamed from: a */
        public final List<T> m8466a() {
            int size = this.f8402b.size();
            int i = this.f8401a;
            if (size <= i) {
                return o00O0.oo000o.f31251OooOo0O;
            }
            List<T> list = this.f8402b;
            return list.subList(i, list.size());
        }

        /* renamed from: b */
        public final List<T> m8467b() {
            List<T> list = this.f8402b;
            int size = list.size();
            int i = this.f8401a;
            if (size > i) {
                size = i;
            }
            return list.subList(0, size);
        }

        @Override // com.ironsource.InterfaceC3072ec
        public boolean contains(T t) {
            return this.f8402b.contains(t);
        }

        @Override // com.ironsource.InterfaceC3072ec
        public int size() {
            return this.f8402b.size();
        }

        @Override // com.ironsource.InterfaceC3072ec
        public List<T> value() {
            return this.f8402b;
        }
    }

    boolean contains(T t);

    int size();

    List<T> value();
}
