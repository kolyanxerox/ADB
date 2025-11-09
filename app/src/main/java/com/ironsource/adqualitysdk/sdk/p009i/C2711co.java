package com.ironsource.adqualitysdk.sdk.p009i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.co */
/* loaded from: classes2.dex */
public final class C2711co {

    /* renamed from: ﻐ */
    private c f5687;

    /* renamed from: ｋ */
    private C2743dt f5688;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.co$a */
    public static class a extends c {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2711co.c
        /* renamed from: ﻐ */
        public final boolean mo6235(InterfaceC2851ht interfaceC2851ht) {
            return m6241().isInstance(interfaceC2851ht.mo6934());
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.co$b */
    public static class b {

        /* renamed from: ﾒ */
        private C2711co f5689 = new C2711co();

        /* renamed from: ﻐ */
        public final b m6236(Class cls) {
            this.f5689.f5687 = new a(cls);
            return this;
        }

        /* renamed from: ﻛ */
        public final b m6238(C2743dt c2743dt) {
            this.f5689.f5688 = c2743dt;
            return this;
        }

        /* renamed from: ｋ */
        public final b m6239(Class cls) {
            this.f5689.f5687 = new d(cls);
            return this;
        }

        /* renamed from: ﾇ */
        public final b m6240(Class cls) {
            this.f5689.f5687 = new e(cls);
            return this;
        }

        /* renamed from: ﻐ */
        public final C2711co m6237() {
            return this.f5689;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.co$c */
    public static abstract class c {

        /* renamed from: ﾒ */
        private Class f5690;

        public c(Class cls) {
            this.f5690 = cls;
        }

        /* renamed from: ﻐ */
        public abstract boolean mo6235(InterfaceC2851ht interfaceC2851ht);

        /* renamed from: ﾇ */
        public final Class m6241() {
            return this.f5690;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.co$d */
    public static class d extends c {
        public d(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2711co.c
        /* renamed from: ﻐ */
        public final boolean mo6235(InterfaceC2851ht interfaceC2851ht) {
            return m6241().equals(interfaceC2851ht.mo6935().getType());
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.co$e */
    public static class e extends c {
        public e(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2711co.c
        /* renamed from: ﻐ */
        public final boolean mo6235(InterfaceC2851ht interfaceC2851ht) {
            return m6241().isAssignableFrom(interfaceC2851ht.mo6935().getType());
        }
    }

    /* renamed from: ﾒ */
    public final boolean m6234(InterfaceC2851ht interfaceC2851ht, C2741dr c2741dr, C2712cp c2712cp, List<Object> list) {
        c cVar = this.f5687;
        if (cVar != null && !cVar.mo6235(interfaceC2851ht)) {
            return false;
        }
        if (this.f5688 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, interfaceC2851ht);
        return this.f5688.m6711(c2741dr, c2712cp, arrayList).m6721();
    }
}
