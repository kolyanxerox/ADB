package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C3353m5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;

/* renamed from: com.ironsource.mediationsdk.demandOnly.a */
/* loaded from: classes2.dex */
public interface InterfaceC3370a {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a */
    public static final class a implements InterfaceC3370a {

        /* renamed from: a */
        private final List<C3353m5> f9655a;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3370a
        /* renamed from: a */
        public C3353m5 mo10157a(String instanceName) {
            Object next;
            OooOo.OooO0o0(instanceName, "instanceName");
            Iterator<T> it = this.f9655a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (OooOo.OooO00o(((C3353m5) next).m9986c(), instanceName)) {
                    break;
                }
            }
            return (C3353m5) next;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3370a
        /* renamed from: b */
        public String mo10159b() {
            if (this.f9655a.isEmpty()) {
                return "";
            }
            return "1" + ((C3353m5) OooOo00.OooOoOO(this.f9655a)).m9986c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3370a
        public C3353m5 get(int i) {
            if (i < 0 || i >= this.f9655a.size()) {
                return null;
            }
            return this.f9655a.get(i);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3370a
        public boolean isEmpty() {
            return this.f9655a.isEmpty();
        }

        public a(List<C3353m5> waterfall) {
            OooOo.OooO0o0(waterfall, "waterfall");
            this.f9655a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC3370a
        /* renamed from: a */
        public List<C3353m5> mo10158a() {
            return this.f9655a;
        }

        public /* synthetic */ a(List list, int i, OooOO0O oooOO0O) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }
    }

    /* renamed from: a */
    C3353m5 mo10157a(String str);

    /* renamed from: a */
    List<C3353m5> mo10158a();

    /* renamed from: b */
    String mo10159b();

    C3353m5 get(int i);

    boolean isEmpty();
}
