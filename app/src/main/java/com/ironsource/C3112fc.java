package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.fc */
/* loaded from: classes2.dex */
public final class C3112fc {

    /* renamed from: a */
    private String f8565a;

    /* renamed from: b */
    private boolean f8566b;

    /* renamed from: c */
    private String f8567c;

    /* renamed from: d */
    private InterfaceC3041dg f8568d;

    /* renamed from: e */
    private boolean f8569e;

    /* renamed from: f */
    private ArrayList<Pair<String, String>> f8570f;

    /* renamed from: com.ironsource.fc$a */
    public static class a {

        /* renamed from: a */
        private String f8571a;

        /* renamed from: d */
        private InterfaceC3041dg f8574d;

        /* renamed from: b */
        private boolean f8572b = false;

        /* renamed from: c */
        private String f8573c = "POST";

        /* renamed from: e */
        private boolean f8575e = false;

        /* renamed from: f */
        private ArrayList<Pair<String, String>> f8576f = new ArrayList<>();

        public a(String str) {
            this.f8571a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f8571a = str;
        }

        /* renamed from: a */
        public a m8671a(Pair<String, String> pair) {
            this.f8576f.add(pair);
            return this;
        }

        /* renamed from: b */
        public a m8676b() {
            this.f8573c = "GET";
            return this;
        }

        /* renamed from: c */
        public a m8678c() {
            this.f8573c = "POST";
            return this;
        }

        /* renamed from: a */
        public a m8672a(InterfaceC3041dg interfaceC3041dg) {
            this.f8574d = interfaceC3041dg;
            return this;
        }

        /* renamed from: b */
        public a m8677b(boolean z) {
            this.f8572b = z;
            return this;
        }

        /* renamed from: a */
        public a m8673a(List<Pair<String, String>> list) {
            this.f8576f.addAll(list);
            return this;
        }

        /* renamed from: a */
        public a m8674a(boolean z) {
            this.f8575e = z;
            return this;
        }

        /* renamed from: a */
        public C3112fc m8675a() {
            return new C3112fc(this);
        }
    }

    public C3112fc(a aVar) {
        this.f8569e = false;
        this.f8565a = aVar.f8571a;
        this.f8566b = aVar.f8572b;
        this.f8567c = aVar.f8573c;
        this.f8568d = aVar.f8574d;
        this.f8569e = aVar.f8575e;
        if (aVar.f8576f != null) {
            this.f8570f = new ArrayList<>(aVar.f8576f);
        }
    }

    /* renamed from: a */
    public boolean m8659a() {
        return this.f8566b;
    }

    /* renamed from: b */
    public String m8660b() {
        return this.f8565a;
    }

    /* renamed from: c */
    public InterfaceC3041dg m8661c() {
        return this.f8568d;
    }

    /* renamed from: d */
    public ArrayList<Pair<String, String>> m8662d() {
        return new ArrayList<>(this.f8570f);
    }

    /* renamed from: e */
    public String m8663e() {
        return this.f8567c;
    }

    /* renamed from: f */
    public boolean m8664f() {
        return this.f8569e;
    }
}
