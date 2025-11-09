package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.ironsource.C3131fv;
import com.ironsource.C3608rv;
import com.ironsource.C3817wv;
import com.ironsource.InterfaceC3490oi;
import kotlin.jvm.internal.OooOo;
import o000o0o.o000OOo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class TestSuiteActivity extends Activity implements InterfaceC3490oi {

    /* renamed from: a */
    private RelativeLayout f10168a;

    /* renamed from: b */
    private C3817wv f10169b;

    /* renamed from: c */
    private C3608rv f10170c;

    /* renamed from: a */
    private final String m10687a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    /* renamed from: b */
    private final JSONObject m10689b() {
        String strM8826b = new C3131fv().m8826b(this);
        if (strM8826b != null) {
            try {
                if (strM8826b.length() != 0) {
                    return new JSONObject(strM8826b);
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    /* renamed from: c */
    private final RelativeLayout.LayoutParams m10691c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f10168a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        OooOo.OooOO0o("mContainer");
        throw null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.InterfaceC3490oi
    public void onClosed() {
        runOnUiThread(new o000OOo(this, 0));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f10168a = relativeLayout;
        setContentView(relativeLayout, m10691c());
        C3817wv c3817wv = new C3817wv(this, this, m10689b(), m10687a());
        this.f10169b = c3817wv;
        C3608rv c3608rv = new C3608rv(c3817wv);
        this.f10170c = c3608rv;
        c3608rv.m11772d();
        RelativeLayout relativeLayout2 = this.f10168a;
        if (relativeLayout2 == null) {
            OooOo.OooOO0o("mContainer");
            throw null;
        }
        C3817wv c3817wv2 = this.f10169b;
        if (c3817wv2 != null) {
            relativeLayout2.addView(c3817wv2.m12988d(), m10691c());
        } else {
            OooOo.OooOO0o("mWebViewWrapper");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C3608rv c3608rv = this.f10170c;
        if (c3608rv == null) {
            OooOo.OooOO0o("mNativeBridge");
            throw null;
        }
        c3608rv.m11771a();
        RelativeLayout relativeLayout = this.f10168a;
        if (relativeLayout == null) {
            OooOo.OooOO0o("mContainer");
            throw null;
        }
        relativeLayout.removeAllViews();
        C3817wv c3817wv = this.f10169b;
        if (c3817wv == null) {
            OooOo.OooOO0o("mWebViewWrapper");
            throw null;
        }
        c3817wv.m12984a();
        super.onDestroy();
    }

    @Override // com.ironsource.InterfaceC3490oi
    public void onUIReady() {
        runOnUiThread(new o000OOo(this, 1));
    }

    /* renamed from: a */
    public static final void m10688a(TestSuiteActivity this$0) {
        OooOo.OooO0o0(this$0, "this$0");
        this$0.finish();
    }

    /* renamed from: b */
    public static final void m10690b(TestSuiteActivity this$0) {
        OooOo.OooO0o0(this$0, "this$0");
        C3817wv c3817wv = this$0.f10169b;
        if (c3817wv == null) {
            OooOo.OooOO0o("mWebViewWrapper");
            throw null;
        }
        if (c3817wv.m12987c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.f10168a;
            if (relativeLayout == null) {
                OooOo.OooOO0o("mContainer");
                throw null;
            }
            C3817wv c3817wv2 = this$0.f10169b;
            if (c3817wv2 == null) {
                OooOo.OooOO0o("mWebViewWrapper");
                throw null;
            }
            relativeLayout.removeView(c3817wv2.m12988d());
            RelativeLayout relativeLayout2 = this$0.f10168a;
            if (relativeLayout2 == null) {
                OooOo.OooOO0o("mContainer");
                throw null;
            }
            C3817wv c3817wv3 = this$0.f10169b;
            if (c3817wv3 == null) {
                OooOo.OooOO0o("mWebViewWrapper");
                throw null;
            }
            relativeLayout2.addView(c3817wv3.m12987c(), this$0.m10691c());
            C3817wv c3817wv4 = this$0.f10169b;
            if (c3817wv4 != null) {
                c3817wv4.m12986b();
            } else {
                OooOo.OooOO0o("mWebViewWrapper");
                throw null;
            }
        }
    }
}
