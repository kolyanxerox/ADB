package com.ironsource;

import android.view.View;
import com.ironsource.C3034d9;
import com.ironsource.C3871yh;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ci */
/* loaded from: classes2.dex */
public final class C3008ci {

    /* renamed from: a */
    private C3871yh f7765a;

    /* renamed from: b */
    private View f7766b;

    /* renamed from: c */
    private View f7767c;

    /* renamed from: d */
    private View f7768d;

    /* renamed from: e */
    private View f7769e;

    /* renamed from: f */
    private View f7770f;

    /* renamed from: g */
    private View f7771g;

    /* renamed from: h */
    private View f7772h;

    /* renamed from: i */
    private a f7773i;

    /* renamed from: com.ironsource.ci$a */
    public interface a {
        /* renamed from: a */
        void mo8160a(b bVar);

        /* renamed from: a */
        void mo8161a(C3920zw c3920zw);
    }

    /* renamed from: com.ironsource.ci$b */
    public enum b {
        Title(C3034d9.h.f8063D0),
        Advertiser(C3034d9.h.f8067F0),
        Body(C3034d9.h.f8065E0),
        Cta(C3034d9.h.f8069G0),
        Icon(C3034d9.h.f8071H0),
        Container("container"),
        PrivacyIcon(C3034d9.h.f8075J0);


        /* renamed from: a */
        private final String f7782a;

        b(String str) {
            this.f7782a = str;
        }

        /* renamed from: b */
        public final String m8163b() {
            return this.f7782a;
        }
    }

    /* renamed from: com.ironsource.ci$c */
    public static final class c implements C3871yh.a {
        public c() {
        }

        @Override // com.ironsource.C3871yh.a
        /* renamed from: a */
        public void mo8164a(C3920zw viewVisibilityParams) {
            kotlin.jvm.internal.OooOo.OooO0o0(viewVisibilityParams, "viewVisibilityParams");
            a aVarM8155n = C3008ci.this.m8155n();
            if (aVarM8155n != null) {
                aVarM8155n.mo8161a(viewVisibilityParams);
            }
        }
    }

    public C3008ci(C3871yh containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        kotlin.jvm.internal.OooOo.OooO0o0(containerView, "containerView");
        kotlin.jvm.internal.OooOo.OooO0o0(privacyIconView, "privacyIconView");
        this.f7765a = containerView;
        this.f7766b = view;
        this.f7767c = view2;
        this.f7768d = view3;
        this.f7769e = view4;
        this.f7770f = view5;
        this.f7771g = view6;
        this.f7772h = privacyIconView;
        m8130r();
        m8131s();
    }

    /* renamed from: a */
    public static /* synthetic */ C3008ci m8127a(C3008ci c3008ci, C3871yh c3871yh, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, Object obj) {
        if ((i & 1) != 0) {
            c3871yh = c3008ci.f7765a;
        }
        if ((i & 2) != 0) {
            view = c3008ci.f7766b;
        }
        if ((i & 4) != 0) {
            view2 = c3008ci.f7767c;
        }
        if ((i & 8) != 0) {
            view3 = c3008ci.f7768d;
        }
        if ((i & 16) != 0) {
            view4 = c3008ci.f7769e;
        }
        if ((i & 32) != 0) {
            view5 = c3008ci.f7770f;
        }
        if ((i & 64) != 0) {
            view6 = c3008ci.f7771g;
        }
        if ((i & 128) != 0) {
            view7 = c3008ci.f7772h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return c3008ci.m8132a(c3871yh, view, view2, view3, view10, view11, view8, view9);
    }

    /* renamed from: r */
    private final void m8130r() {
        m8128a(this, this.f7766b, b.Title);
        m8128a(this, this.f7767c, b.Advertiser);
        m8128a(this, this.f7769e, b.Body);
        m8128a(this, this.f7771g, b.Cta);
        m8128a(this, this.f7768d, b.Icon);
        m8128a(this, this.f7765a, b.Container);
        m8128a(this, this.f7772h, b.PrivacyIcon);
    }

    /* renamed from: s */
    private final void m8131s() {
        this.f7765a.setListener$mediationsdk_release(new c());
    }

    /* renamed from: b */
    public final View m8137b() {
        return this.f7766b;
    }

    /* renamed from: c */
    public final View m8139c() {
        return this.f7767c;
    }

    /* renamed from: d */
    public final View m8141d() {
        return this.f7768d;
    }

    /* renamed from: e */
    public final View m8143e() {
        return this.f7769e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3008ci)) {
            return false;
        }
        C3008ci c3008ci = (C3008ci) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f7765a, c3008ci.f7765a) && kotlin.jvm.internal.OooOo.OooO00o(this.f7766b, c3008ci.f7766b) && kotlin.jvm.internal.OooOo.OooO00o(this.f7767c, c3008ci.f7767c) && kotlin.jvm.internal.OooOo.OooO00o(this.f7768d, c3008ci.f7768d) && kotlin.jvm.internal.OooOo.OooO00o(this.f7769e, c3008ci.f7769e) && kotlin.jvm.internal.OooOo.OooO00o(this.f7770f, c3008ci.f7770f) && kotlin.jvm.internal.OooOo.OooO00o(this.f7771g, c3008ci.f7771g) && kotlin.jvm.internal.OooOo.OooO00o(this.f7772h, c3008ci.f7772h);
    }

    /* renamed from: f */
    public final View m8145f() {
        return this.f7770f;
    }

    /* renamed from: g */
    public final View m8147g() {
        return this.f7771g;
    }

    /* renamed from: h */
    public final View m8149h() {
        return this.f7772h;
    }

    public int hashCode() {
        int iHashCode = this.f7765a.hashCode() * 31;
        View view = this.f7766b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f7767c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f7768d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f7769e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f7770f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f7771g;
        return this.f7772h.hashCode() + ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31);
    }

    /* renamed from: i */
    public final View m8150i() {
        return this.f7767c;
    }

    /* renamed from: j */
    public final View m8151j() {
        return this.f7769e;
    }

    /* renamed from: k */
    public final C3871yh m8152k() {
        return this.f7765a;
    }

    /* renamed from: l */
    public final View m8153l() {
        return this.f7771g;
    }

    /* renamed from: m */
    public final View m8154m() {
        return this.f7768d;
    }

    /* renamed from: n */
    public final a m8155n() {
        return this.f7773i;
    }

    /* renamed from: o */
    public final View m8156o() {
        return this.f7770f;
    }

    /* renamed from: p */
    public final View m8157p() {
        return this.f7772h;
    }

    /* renamed from: q */
    public final View m8158q() {
        return this.f7766b;
    }

    /* renamed from: t */
    public final JSONObject m8159t() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C3034d9.h.f8063D0, this.f7766b != null).put(C3034d9.h.f8067F0, this.f7767c != null).put(C3034d9.h.f8065E0, this.f7769e != null).put(C3034d9.h.f8069G0, this.f7771g != null).put(C3034d9.h.f8073I0, this.f7770f != null).put(C3034d9.h.f8071H0, this.f7768d != null);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectPut, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return jSONObjectPut;
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f7765a + ", titleView=" + this.f7766b + ", advertiserView=" + this.f7767c + ", iconView=" + this.f7768d + ", bodyView=" + this.f7769e + ", mediaView=" + this.f7770f + ", ctaView=" + this.f7771g + ", privacyIconView=" + this.f7772h + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3008ci(C3871yh c3871yh, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        View view8;
        View view9;
        view = (i & 2) != 0 ? null : view;
        view2 = (i & 4) != 0 ? null : view2;
        view3 = (i & 8) != 0 ? null : view3;
        view4 = (i & 16) != 0 ? null : view4;
        view5 = (i & 32) != 0 ? null : view5;
        if ((i & 64) != 0) {
            view8 = view7;
            view9 = null;
        } else {
            view8 = view7;
            view9 = view6;
        }
        this(c3871yh, view, view2, view3, view4, view5, view9, view8);
    }

    /* renamed from: a */
    public final C3008ci m8132a(C3871yh containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        kotlin.jvm.internal.OooOo.OooO0o0(containerView, "containerView");
        kotlin.jvm.internal.OooOo.OooO0o0(privacyIconView, "privacyIconView");
        return new C3008ci(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    /* renamed from: b */
    public final void m8138b(View view) {
        this.f7769e = view;
    }

    /* renamed from: c */
    public final void m8140c(View view) {
        this.f7771g = view;
    }

    /* renamed from: d */
    public final void m8142d(View view) {
        this.f7768d = view;
    }

    /* renamed from: e */
    public final void m8144e(View view) {
        this.f7770f = view;
    }

    /* renamed from: f */
    public final void m8146f(View view) {
        kotlin.jvm.internal.OooOo.OooO0o0(view, "<set-?>");
        this.f7772h = view;
    }

    /* renamed from: g */
    public final void m8148g(View view) {
        this.f7766b = view;
    }

    /* renamed from: a */
    public final C3871yh m8133a() {
        return this.f7765a;
    }

    /* renamed from: a */
    public final void m8134a(View view) {
        this.f7767c = view;
    }

    /* renamed from: a */
    public final void m8135a(a aVar) {
        this.f7773i = aVar;
    }

    /* renamed from: a */
    private static final void m8128a(final C3008ci c3008ci, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.OooOO0O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3008ci.m8129a(this.f28471OooOo0O, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8129a(C3008ci this$0, b viewName, View view) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(viewName, "$viewName");
        a aVar = this$0.f7773i;
        if (aVar != null) {
            aVar.mo8160a(viewName);
        }
    }

    /* renamed from: a */
    public final void m8136a(C3871yh c3871yh) {
        kotlin.jvm.internal.OooOo.OooO0o0(c3871yh, "<set-?>");
        this.f7765a = c3871yh;
    }
}
