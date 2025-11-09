package com.ironsource;

import android.app.Activity;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.AbstractC3619s7;
import com.ironsource.InterfaceC3172h2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.ironsource.o7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3479o7<Listener extends InterfaceC3172h2> extends AbstractC3619s7<Listener> implements AdapterAdInteractionListener {

    /* renamed from: com.ironsource.o7$a */
    public class a extends AbstractRunnableC3302ks {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3479o7.this.m11106P();
        }
    }

    /* renamed from: com.ironsource.o7$b */
    public class b extends AbstractRunnableC3302ks {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3479o7.this.m11109S();
        }
    }

    /* renamed from: com.ironsource.o7$c */
    public class c extends AbstractRunnableC3302ks {
        public c() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3479o7.this.m11107Q();
        }
    }

    /* renamed from: com.ironsource.o7$d */
    public class d extends AbstractRunnableC3302ks {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3479o7.this.m11110T();
        }
    }

    /* renamed from: com.ironsource.o7$e */
    public class e extends AbstractRunnableC3302ks {
        public e() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3479o7.this.m11108R();
        }
    }

    /* renamed from: com.ironsource.o7$f */
    public class f extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ int f10629a;

        /* renamed from: b */
        final /* synthetic */ String f10630b;

        public f(int i, String str) {
            this.f10629a = i;
            this.f10630b = str;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3479o7.this.m11114b(this.f10629a, this.f10630b);
        }
    }

    public AbstractC3479o7(InterfaceC3778vq interfaceC3778vq, C3275k1 c3275k1, BaseAdAdapter<?, ?> baseAdAdapter, C2629a3 c2629a3, C3353m5 c3353m5, Listener listener) {
        super(interfaceC3778vq, c3275k1, baseAdAdapter, c2629a3, c3353m5, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m11106P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11865d());
        synchronized (this.f11323q) {
            try {
                if (this.f11311e == AbstractC3619s7.h.SHOWING) {
                    m11862a(AbstractC3619s7.h.NONE);
                    if (this.f11310d != null) {
                        String string = "";
                        if (this.f11307a.m9562a() == IronSource.AD_UNIT.REWARDED_VIDEO) {
                            String strMo9041d = ((InterfaceC3172h2) this.f11308b).mo9041d();
                            StringBuilder sb = new StringBuilder("otherInstanceAvailable = ");
                            sb.append(strMo9041d.length() > 0 ? "true|".concat(strMo9041d) : "false");
                            string = sb.toString();
                        }
                        this.f11310d.f7687i.m9940a(m11871j(), string);
                    }
                    ((InterfaceC3172h2) this.f11308b).mo9038a(this);
                    return;
                }
                ironLog.error("unexpected ad closed for " + m11872k() + " - state = " + this.f11311e);
                C2992c2 c2992c2 = this.f11310d;
                if (c2992c2 != null) {
                    c2992c2.f7688j.m9923l("unexpected ad closed - state = " + this.f11311e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m11107Q() {
        IronLog.INTERNAL.verbose(m11865d());
        C2992c2 c2992c2 = this.f11310d;
        if (c2992c2 != null) {
            c2992c2.f7687i.m9947d(m11871j());
        }
        ((InterfaceC3172h2) this.f11308b).mo9040c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void m11108R() {
        IronLog.INTERNAL.verbose(m11865d());
        C2992c2 c2992c2 = this.f11310d;
        if (c2992c2 != null) {
            c2992c2.f7687i.m9955l(m11871j());
        }
        ((InterfaceC3172h2) this.f11308b).mo9039b((AbstractC3479o7<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m11109S() {
        IronLog.INTERNAL.verbose(m11865d());
        C2992c2 c2992c2 = this.f11310d;
        if (c2992c2 != null) {
            c2992c2.f7687i.m9952i(m11871j());
        }
        ((InterfaceC3172h2) this.f11308b).mo9042d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m11110T() {
        IronLog.INTERNAL.verbose(m11865d());
        C2992c2 c2992c2 = this.f11310d;
        if (c2992c2 != null) {
            c2992c2.f7687i.m9954k(m11871j());
        }
    }

    /* renamed from: a */
    public static String m11111a(AbstractC3619s7.h hVar, int i, String str) {
        Locale locale = Locale.ENGLISH;
        return "unexpected show failed, state - " + hVar + ", error - " + i + StringUtils.SPACE + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m11114b(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11861a("error = " + i + ", " + str));
        AbstractC3619s7.h hVar = this.f11311e;
        if (hVar == AbstractC3619s7.h.SHOWING) {
            m11862a(AbstractC3619s7.h.FAILED);
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 != null) {
                c2992c2.f7687i.m9939a(m11871j(), i, str, "");
            }
            ((InterfaceC3172h2) this.f11308b).mo9037a(new IronSourceError(i, str), (AbstractC3479o7<?>) this);
            return;
        }
        String strM11111a = m11111a(hVar, i, str);
        ironLog.error(m11861a(strM11111a));
        C2992c2 c2992c22 = this.f11310d;
        if (c2992c22 != null) {
            c2992c22.f7688j.m9931t(strM11111a);
        }
    }

    @Override // com.ironsource.AbstractC3619s7
    /* renamed from: B */
    public boolean mo11119B() {
        Object obj;
        if (this.f11317k == null || !m11883y()) {
            return false;
        }
        try {
            obj = this.f11309c;
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("isReadyToShow - exception = ", th);
            sbOooOOO.append(th.getMessage());
            sbOooOOO.append(" - state = ");
            sbOooOOO.append(this.f11311e);
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m11861a(string));
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 != null) {
                c2992c2.f7688j.m9918g(string);
            }
        }
        if (obj instanceof AdapterAdFullScreenInterface) {
            return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.f11317k);
        }
        IronLog.INTERNAL.error(m11861a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
        C2992c2 c2992c22 = this.f11310d;
        if (c2992c22 != null) {
            c2992c22.f7688j.m9918g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new a());
        } else {
            m11106P();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new c());
        } else {
            m11107Q();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i, String str) {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new f(i, str));
        } else {
            m11114b(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new e());
        } else {
            m11108R();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new b());
        } else {
            m11109S();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (m11880u().mo11352c()) {
            m11880u().mo11346a(new d());
        } else {
            m11110T();
        }
    }

    /* renamed from: a */
    public void m11120a(Activity activity, Placement placement) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11861a("placementName = " + placement.getPlacementName()));
        try {
            this.f11313g = placement;
            m11862a(AbstractC3619s7.h.SHOWING);
            this.f11310d.f7687i.m9937a(activity, m11871j());
            Object obj = this.f11309c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.f11317k, this);
                return;
            }
            ironLog.error(m11861a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 != null) {
                c2992c2.f7688j.m9918g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            m11862a(AbstractC3619s7.h.FAILED);
            String str = "showAd - exception = " + th.getMessage() + " - state = " + this.f11311e;
            IronLog.INTERNAL.error(m11861a(str));
            C2992c2 c2992c22 = this.f11310d;
            if (c2992c22 != null) {
                c2992c22.f7688j.m9918g(str);
            }
            onAdShowFailed(C3855y1.m13121h(this.f11307a.m9562a()), str);
        }
    }

    /* renamed from: b */
    public void m11121b(boolean z) {
        C2992c2 c2992c2 = this.f11310d;
        if (c2992c2 != null) {
            c2992c2.f7687i.m9943a(z);
        }
    }
}
