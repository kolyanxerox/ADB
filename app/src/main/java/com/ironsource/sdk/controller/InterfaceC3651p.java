package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3551q9;
import com.ironsource.C3777vp;
import com.ironsource.C3811wp;
import com.ironsource.InterfaceC3134g;
import com.ironsource.InterfaceC3169h;
import com.ironsource.sdk.controller.InterfaceC3646k;
import com.ironsource.sdk.controller.OpenUrlActivity;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.ironsource.sdk.controller.p */
/* loaded from: classes2.dex */
public interface InterfaceC3651p {

    /* renamed from: com.ironsource.sdk.controller.p$a */
    public static final class a implements InterfaceC3651p {

        /* renamed from: a */
        private b f11624a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, C3811wp openUrlConfigurations) {
            this(method, openUrlConfigurations, new InterfaceC3646k.b(), new InterfaceC3646k.a());
            OooOo.OooO0o0(method, "method");
            OooOo.OooO0o0(openUrlConfigurations, "openUrlConfigurations");
        }

        @Override // com.ironsource.sdk.controller.InterfaceC3651p
        /* renamed from: a */
        public c mo12053a(Context context, C3777vp openUrl) {
            OooOo.OooO0o0(context, "context");
            OooOo.OooO0o0(openUrl, "openUrl");
            try {
                return this.f11624a.mo12054a(context, openUrl);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                String message = e.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e.getMessage();
                OooOo.OooO0O0(message2);
                return new c.a(message2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(java.lang.String r3, com.ironsource.C3811wp r4, com.ironsource.InterfaceC3169h r5, com.ironsource.InterfaceC3134g r6) {
            /*
                r2 = this;
                java.lang.String r0 = "method"
                kotlin.jvm.internal.OooOo.OooO0o0(r3, r0)
                java.lang.String r0 = "openUrlConfigurations"
                kotlin.jvm.internal.OooOo.OooO0o0(r4, r0)
                java.lang.String r0 = "activityIntentFactory"
                kotlin.jvm.internal.OooOo.OooO0o0(r5, r0)
                java.lang.String r0 = "actionIntentFactory"
                kotlin.jvm.internal.OooOo.OooO0o0(r6, r0)
                r2.<init>()
                int r0 = r3.hashCode()
                r1 = -1455867212(0xffffffffa9393ab4, float:-4.112917E-14)
                if (r0 == r1) goto L49
                r6 = 109770977(0x68af8e1, float:5.2275525E-35)
                if (r0 == r6) goto L3a
                r6 = 1224424441(0x48fb3bf9, float:514527.78)
                if (r0 == r6) goto L2b
                goto L57
            L2b:
                java.lang.String r6 = "webview"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L34
                goto L57
            L34:
                com.ironsource.sdk.controller.p$b$d r3 = new com.ironsource.sdk.controller.p$b$d
                r3.<init>(r4, r5)
                goto L5d
            L3a:
                java.lang.String r6 = "store"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L43
                goto L57
            L43:
                com.ironsource.sdk.controller.p$b$c r3 = new com.ironsource.sdk.controller.p$b$c
                r3.<init>(r4, r5)
                goto L5d
            L49:
                java.lang.String r5 = "external_browser"
                boolean r5 = r3.equals(r5)
                if (r5 == 0) goto L57
                com.ironsource.sdk.controller.p$b$a r3 = new com.ironsource.sdk.controller.p$b$a
                r3.<init>(r4, r6)
                goto L5d
            L57:
                com.ironsource.sdk.controller.p$b$b r4 = new com.ironsource.sdk.controller.p$b$b
                r4.<init>(r3)
                r3 = r4
            L5d:
                r2.f11624a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.InterfaceC3651p.a.<init>(java.lang.String, com.ironsource.wp, com.ironsource.h, com.ironsource.g):void");
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$b */
    public interface b {

        /* renamed from: com.ironsource.sdk.controller.p$b$a */
        public static final class a implements b {

            /* renamed from: a */
            private final C3811wp f11625a;

            /* renamed from: b */
            private final InterfaceC3134g f11626b;

            public a(C3811wp configurations, InterfaceC3134g intentFactory) {
                OooOo.OooO0o0(configurations, "configurations");
                OooOo.OooO0o0(intentFactory, "intentFactory");
                this.f11625a = configurations;
                this.f11626b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.InterfaceC3651p.b
            /* renamed from: a */
            public c mo12054a(Context context, C3777vp openUrl) {
                OooOo.OooO0o0(context, "context");
                OooOo.OooO0o0(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.m12801d())) {
                    return new c.a("url is empty");
                }
                Intent intentMo8846a = this.f11626b.mo8846a();
                intentMo8846a.setData(Uri.parse(openUrl.m12801d()));
                String strM12800c = openUrl.m12800c();
                if (strM12800c != null && strM12800c.length() != 0) {
                    intentMo8846a = intentMo8846a.setPackage(openUrl.m12800c());
                    OooOo.OooO0Oo(intentMo8846a, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    intentMo8846a = intentMo8846a.addFlags(this.f11625a.m12951c());
                }
                OooOo.OooO0Oo(intentMo8846a, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(intentMo8846a);
                return c.b.f11633a;
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C4585b implements b {

            /* renamed from: a */
            private final String f11627a;

            public C4585b(String method) {
                OooOo.OooO0o0(method, "method");
                this.f11627a = method;
            }

            @Override // com.ironsource.sdk.controller.InterfaceC3651p.b
            /* renamed from: a */
            public c mo12054a(Context context, C3777vp openUrl) {
                OooOo.OooO0o0(context, "context");
                OooOo.OooO0o0(openUrl, "openUrl");
                return new c.a(OooO0oO.OooOo.OooOOOo(new StringBuilder("method "), this.f11627a, " is unsupported"));
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$b$c */
        public static final class c implements b {

            /* renamed from: a */
            private final C3811wp f11628a;

            /* renamed from: b */
            private final InterfaceC3169h f11629b;

            public c(C3811wp configurations, InterfaceC3169h intentFactory) {
                OooOo.OooO0o0(configurations, "configurations");
                OooOo.OooO0o0(intentFactory, "intentFactory");
                this.f11628a = configurations;
                this.f11629b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.InterfaceC3651p.b
            /* renamed from: a */
            public c mo12054a(Context context, C3777vp openUrl) {
                OooOo.OooO0o0(context, "context");
                OooOo.OooO0o0(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.C3635e(this.f11629b).m11921a(this.f11628a.m12951c()).m11922a(openUrl.m12801d()).m11924b(true).m11925c(true).m11920a(context));
                return c.b.f11633a;
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$b$d */
        public static final class d implements b {

            /* renamed from: a */
            private final C3811wp f11630a;

            /* renamed from: b */
            private final InterfaceC3169h f11631b;

            public d(C3811wp configurations, InterfaceC3169h intentFactory) {
                OooOo.OooO0o0(configurations, "configurations");
                OooOo.OooO0o0(intentFactory, "intentFactory");
                this.f11630a = configurations;
                this.f11631b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.InterfaceC3651p.b
            /* renamed from: a */
            public c mo12054a(Context context, C3777vp openUrl) {
                OooOo.OooO0o0(context, "context");
                OooOo.OooO0o0(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.C3635e(this.f11631b).m11921a(this.f11630a.m12951c()).m11922a(openUrl.m12801d()).m11923a(this.f11630a.m12952d()).m11924b(true).m11920a(context));
                return c.b.f11633a;
            }
        }

        /* renamed from: a */
        c mo12054a(Context context, C3777vp c3777vp);
    }

    /* renamed from: com.ironsource.sdk.controller.p$c */
    public static abstract class c {

        /* renamed from: com.ironsource.sdk.controller.p$c$a */
        public static final class a extends c {

            /* renamed from: a */
            private final String f11632a;

            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* renamed from: a */
            public static /* synthetic */ a m12055a(a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f11632a;
                }
                return aVar.m12056a(str);
            }

            /* renamed from: b */
            public final String m12058b() {
                return this.f11632a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && OooOo.OooO00o(this.f11632a, ((a) obj).f11632a);
            }

            public int hashCode() {
                return this.f11632a.hashCode();
            }

            public String toString() {
                return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f11632a, new StringBuilder("Error(errorMessage="));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String errorMessage) {
                super(null);
                OooOo.OooO0o0(errorMessage, "errorMessage");
                this.f11632a = errorMessage;
            }

            /* renamed from: a */
            public final a m12056a(String errorMessage) {
                OooOo.OooO0o0(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public /* synthetic */ a(String str, int i, OooOO0O oooOO0O) {
                this((i & 1) != 0 ? "" : str);
            }

            /* renamed from: a */
            public final String m12057a() {
                return this.f11632a;
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$c$b */
        public static final class b extends c {

            /* renamed from: a */
            public static final b f11633a = new b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: a */
    c mo12053a(Context context, C3777vp c3777vp);
}
