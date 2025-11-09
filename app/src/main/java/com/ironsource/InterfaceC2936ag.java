package com.ironsource;

import java.util.ArrayList;

/* renamed from: com.ironsource.ag */
/* loaded from: classes2.dex */
public interface InterfaceC2936ag {

    /* renamed from: com.ironsource.ag$a */
    public static class a {

        /* renamed from: a */
        private final ArrayList<C3899zb> f7499a;

        /* renamed from: b */
        private boolean f7500b;

        /* renamed from: c */
        private int f7501c;

        /* renamed from: d */
        private Exception f7502d;

        public a(ArrayList<C3899zb> arrayList) {
            this.f7500b = false;
            this.f7501c = -1;
            this.f7499a = arrayList;
        }

        /* renamed from: a */
        public a m7759a(int i) {
            return new a(this.f7499a, i, this.f7500b, this.f7502d);
        }

        /* renamed from: b */
        public ArrayList<C3899zb> m7763b() {
            return this.f7499a;
        }

        /* renamed from: c */
        public boolean m7764c() {
            return this.f7500b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f7500b + ", responseCode=" + this.f7501c + ", exception=" + this.f7502d + '}';
        }

        public a(ArrayList<C3899zb> arrayList, int i, boolean z, Exception exc) {
            this.f7499a = arrayList;
            this.f7500b = z;
            this.f7502d = exc;
            this.f7501c = i;
        }

        /* renamed from: a */
        public a m7760a(Exception exc) {
            return new a(this.f7499a, this.f7501c, this.f7500b, exc);
        }

        /* renamed from: a */
        public a m7761a(boolean z) {
            return new a(this.f7499a, this.f7501c, z, this.f7502d);
        }

        /* renamed from: a */
        public String m7762a() {
            if (this.f7500b) {
                return "";
            }
            return "rc=" + this.f7501c + ", ex=" + this.f7502d;
        }
    }

    /* renamed from: a */
    void mo7758a(a aVar);
}
