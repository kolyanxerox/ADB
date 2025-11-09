package com.ironsource.sdk.controller;

import com.ironsource.C3419mh;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.ironsource.sdk.controller.m */
/* loaded from: classes2.dex */
public interface InterfaceC3648m {

    /* renamed from: com.ironsource.sdk.controller.m$a */
    public static final class a implements InterfaceC3648m {

        /* renamed from: a */
        private final String f11569a;

        /* renamed from: b */
        private final String f11570b;

        /* renamed from: c */
        private final String f11571c;

        /* renamed from: d */
        private final String f11572d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall) {
            this(funToCall, null, null, null, 14, null);
            OooOo.OooO0o0(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.InterfaceC3648m
        /* renamed from: a */
        public String mo12048a() {
            StringBuilder sb = new StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.f11569a);
            String str = this.f11570b;
            if (str != null && str.length() != 0) {
                sb.append("?parameters=" + this.f11570b);
            }
            String str2 = this.f11571c;
            if (str2 != null && str2.length() != 0) {
                sb.append("','" + this.f11571c);
            }
            String str3 = this.f11572d;
            if (str3 != null && str3.length() != 0) {
                sb.append("','" + this.f11572d);
            }
            sb.append("');");
            String string = sb.toString();
            OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str) {
            this(funToCall, str, null, null, 12, null);
            OooOo.OooO0o0(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str, String str2) {
            this(funToCall, str, str2, null, 8, null);
            OooOo.OooO0o0(funToCall, "funToCall");
        }

        public a(String funToCall, String str, String str2, String str3) {
            OooOo.OooO0o0(funToCall, "funToCall");
            this.f11569a = funToCall;
            this.f11570b = str;
            this.f11571c = str2;
            this.f11572d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i, OooOO0O oooOO0O) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.m$b */
    public static final class b implements InterfaceC3648m {

        /* renamed from: a */
        private int f11573a;

        /* renamed from: b */
        private String f11574b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3648m jsMethod, int i) {
            this(jsMethod.mo12048a(), i);
            OooOo.OooO0o0(jsMethod, "jsMethod");
        }

        @Override // com.ironsource.sdk.controller.InterfaceC3648m
        /* renamed from: a */
        public String mo12048a() {
            String strOooOOO = androidx.datastore.preferences.protobuf.OooO00o.OooOOO(new StringBuilder("try{"), this.f11574b, "}catch(e){", (this.f11573a != C3419mh.d.MODE_0.m10813a() && (this.f11573a < C3419mh.d.MODE_1.m10813a() || this.f11573a > C3419mh.d.MODE_3.m10813a())) ? "empty" : "console.log(\"JS exception: \" + JSON.stringify(e));", "}");
            OooOo.OooO0Oo(strOooOOO, "StringBuilder()\n        …}\")\n          .toString()");
            return strOooOOO;
        }

        public b(String script, int i) {
            OooOo.OooO0o0(script, "script");
            this.f11574b = script;
            this.f11573a = i;
        }
    }

    /* renamed from: a */
    String mo12048a();
}
