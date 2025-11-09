package com.ironsource;

/* renamed from: com.ironsource.ap */
/* loaded from: classes2.dex */
public final class C2945ap implements InterfaceC2947ar {

    /* renamed from: a */
    private final String f7554a;

    /* renamed from: com.ironsource.ap$a */
    public static final class a {

        /* renamed from: a */
        public static final a f7555a = new a();

        /* renamed from: b */
        public static final String f7556b = "IronSource";

        private a() {
        }
    }

    public C2945ap(String networkInstanceId) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkInstanceId, "networkInstanceId");
        this.f7554a = networkInstanceId;
    }

    @Override // com.ironsource.InterfaceC2947ar
    public String value() {
        if (this.f7554a.length() == 0) {
            return "";
        }
        if (kotlin.jvm.internal.OooOo.OooO00o(this.f7554a, "0") || kotlin.jvm.internal.OooOo.OooO00o(this.f7554a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f7554a;
    }
}
