package com.ironsource;

import java.util.List;

/* renamed from: com.ironsource.qg */
/* loaded from: classes2.dex */
public enum EnumC3558qg {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* renamed from: b */
    public static final a f10939b = new a(null);

    /* renamed from: a */
    private final int f10944a;

    /* renamed from: com.ironsource.qg$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final EnumC3558qg m11559a(Integer num) {
            EnumC3558qg enumC3558qg;
            EnumC3558qg[] enumC3558qgArrValues = EnumC3558qg.values();
            int length = enumC3558qgArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC3558qg = null;
                    break;
                }
                enumC3558qg = enumC3558qgArrValues[i];
                int iM11558b = enumC3558qg.m11558b();
                if (num != null && iM11558b == num.intValue()) {
                    break;
                }
                i++;
            }
            return enumC3558qg == null ? EnumC3558qg.UnknownProvider : enumC3558qg;
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        /* renamed from: a */
        public final EnumC3558qg m11560a(String dynamicDemandSourceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(dynamicDemandSourceId, "dynamicDemandSourceId");
            List listOoooo0o = o00O0oO.o000000.Ooooo0o(dynamicDemandSourceId, new String[]{"_"});
            return listOoooo0o.size() < 2 ? EnumC3558qg.UnknownProvider : m11559a(o00O0oO.o0000.OooOoOO((String) listOoooo0o.get(1)));
        }
    }

    EnumC3558qg(int i) {
        this.f10944a = i;
    }

    /* renamed from: b */
    public final int m11558b() {
        return this.f10944a;
    }
}
