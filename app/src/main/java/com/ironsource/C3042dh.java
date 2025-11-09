package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.dh */
/* loaded from: classes2.dex */
public class C3042dh extends FrameLayout implements InterfaceC3043di {

    /* renamed from: b */
    private static final String f8276b = "IronSourceAdContainer";

    /* renamed from: a */
    private C3222ih f8277a;

    /* renamed from: com.ironsource.dh$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f8278a;

        /* renamed from: b */
        final /* synthetic */ String f8279b;

        public a(String str, String str2) {
            this.f8278a = str;
            this.f8279b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3042dh c3042dh = C3042dh.this;
            c3042dh.removeView(c3042dh.f8277a.getPresentingView());
            C3042dh.this.f8277a.mo8312a(this.f8278a, this.f8279b);
            C3042dh.this.f8277a = null;
        }
    }

    public C3042dh(Context context) {
        super(context);
    }

    /* renamed from: b */
    private void m8310b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f8277a.m9341c().m8959a().getJSONObject(C3007ch.f7755p).getJSONObject(C3007ch.f7758s);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f8277a.m9339b());
        this.f8277a.m9341c().m8965a(C3034d9.g.f8017S, jSONObject);
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: c */
    public void mo8316c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f8277a.mo8316c(jSONObject, str, str2);
    }

    @Override // com.ironsource.InterfaceC3043di
    public WebView getPresentingView() {
        return this.f8277a.getPresentingView();
    }

    public C2972bh getSize() {
        C3222ih c3222ih = this.f8277a;
        return c3222ih != null ? c3222ih.m9342d() : new C2972bh();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Logger.m12266i(f8276b, "onVisibilityChanged: " + i);
        C3222ih c3222ih = this.f8277a;
        if (c3222ih == null) {
            return;
        }
        try {
            c3222ih.m9341c().m8962a(C3007ch.f7750k, i, isShown());
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.m12266i(f8276b, "onWindowVisibilityChanged: " + i);
        C3222ih c3222ih = this.f8277a;
        if (c3222ih == null) {
            return;
        }
        try {
            c3222ih.m9341c().m8962a(C3007ch.f7751l, i, isShown());
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C3042dh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: b */
    public void mo8315b(JSONObject jSONObject, String str, String str2) {
        this.f8277a.mo8315b(jSONObject, str, str2);
    }

    public C3042dh(C3222ih c3222ih, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c3222ih.m9342d().m7924c(), c3222ih.m9342d().m7922a()));
        this.f8277a = c3222ih;
        addView(c3222ih.getPresentingView());
    }

    /* renamed from: a */
    public void m8311a() throws Exception {
        C3222ih c3222ih = this.f8277a;
        if (c3222ih == null || c3222ih.m9341c() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        m8310b();
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: a */
    public synchronized void mo8312a(String str, String str2) {
        C3222ih c3222ih = this.f8277a;
        if (c3222ih != null && c3222ih.m9341c() != null && this.f8277a.getPresentingView() != null) {
            this.f8277a.m9341c().m8971e();
            C3523pg.f10822a.m11404d(new a(str, str2));
        }
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: a */
    public void mo8313a(String str, String str2, String str3) {
        C3222ih c3222ih = this.f8277a;
        if (c3222ih == null) {
            return;
        }
        c3222ih.mo8313a(str, str2, str3);
    }

    @Override // com.ironsource.InterfaceC3043di
    /* renamed from: a */
    public void mo8314a(JSONObject jSONObject, String str, String str2) {
        this.f8277a.mo8314a(jSONObject, str, str2);
    }
}
